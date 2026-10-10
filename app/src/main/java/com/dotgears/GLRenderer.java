package com.dotgears;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * GLRenderer - Modern OpenGL ES 2.0 Quad Batch Renderer for Flappy Bird.
 * Replaces the legacy 32-bit AndEngine / C0200c rendering pipeline with a zero-allocation,
 * 60 FPS pillarboxed GLES20 pipeline mapping 288x512 virtual coordinates to modern displays.
 */
public class GLRenderer implements GLSurfaceView.Renderer, GameEngine.RenderBridge {

    private static final String TAG = "GLRenderer";

    /** Fixed virtual resolution width (288). */
    public static final int VIRTUAL_WIDTH = 288;

    /** Fixed virtual resolution height (512). */
    public static final int VIRTUAL_HEIGHT = 512;

    /** Maximum quads rendered in a single frame tick (decompiled from C0200c.f496b = 50). */
    public static final int MAX_QUADS = 50;

    /** Number of vertices per quad (4). */
    public static final int VERTICES_PER_QUAD = 4;

    /** Number of indices per quad (6: 2 triangles). */
    public static final int INDICES_PER_QUAD = 6;

    /** Number of float components per vertex: (x, y, u, v, alpha). */
    public static final int FLOATS_PER_VERTEX = 5;

    /** Vertex stride in bytes: 5 floats * 4 bytes = 20 bytes. */
    public static final int VERTEX_STRIDE = FLOATS_PER_VERTEX * 4;

    // Vertex Shader: positions transformed by ortho MVP, passes UV and alpha
    private static final String VERTEX_SHADER_CODE =
            "uniform mat4 u_MVPMatrix;\n" +
            "attribute vec2 a_Position;\n" +
            "attribute vec2 a_TexCoord;\n" +
            "attribute float a_Alpha;\n" +
            "varying vec2 v_TexCoord;\n" +
            "varying float v_Alpha;\n" +
            "void main() {\n" +
            "    gl_Position = u_MVPMatrix * vec4(a_Position, 0.0, 1.0);\n" +
            "    v_TexCoord = a_TexCoord;\n" +
            "    v_Alpha = a_Alpha;\n" +
            "}\n";

    // Fragment Shader: samples texture, modulates alpha transparency
    private static final String FRAGMENT_SHADER_CODE =
            "precision mediump float;\n" +
            "uniform sampler2D u_Texture;\n" +
            "varying vec2 v_TexCoord;\n" +
            "varying float v_Alpha;\n" +
            "void main() {\n" +
            "    vec4 color = texture2D(u_Texture, v_TexCoord);\n" +
            "    gl_FragColor = vec4(color.rgb, color.a * v_Alpha);\n" +
            "}\n";

    private Context context;
    private GameEngine engine;

    // Viewport geometry for aspect-ratio preservation
    public int screenWidth;
    public int screenHeight;
    public int viewportX;
    public int viewportY;
    public int viewportWidth;
    public int viewportHeight;
    public float viewportScale = 1.0f;

    // GLES20 Program and handles
    private int programHandle = 0;
    private int mvpMatrixHandle = 0;
    private int positionHandle = 0;
    private int texCoordHandle = 0;
    private int alphaHandle = 0;
    private int textureUniformHandle = 0;
    private int textureId = 0;

    // Projection matrix (orthographic 0..288, 0..512)
    private final float[] projectionMatrix = new float[16];

    // Pre-allocated vertex and index buffers for zero GC allocation in game loop
    public final float[] vertexData = new float[MAX_QUADS * VERTICES_PER_QUAD * FLOATS_PER_VERTEX];
    private FloatBuffer vertexBuffer;
    private ShortBuffer indexBuffer;

    // Number of quads queued for the current frame (0..50)
    public int quadCount = 0;

    public GLRenderer() {
        initBuffers();
    }

    public GLRenderer(Context context, GameEngine engine) {
        this.context = context;
        this.engine = engine;
        initBuffers();
    }

    private void initBuffers() {
        // Direct FloatBuffer for vertex data: 50 quads * 4 verts * 5 floats * 4 bytes = 4000 bytes
        ByteBuffer vbb = ByteBuffer.allocateDirect(vertexData.length * 4);
        vbb.order(ByteOrder.nativeOrder());
        this.vertexBuffer = vbb.asFloatBuffer();

        // Direct ShortBuffer for indices: 50 quads * 6 indices * 2 bytes = 600 bytes
        short[] indices = new short[MAX_QUADS * INDICES_PER_QUAD];
        for (int i = 0; i < MAX_QUADS; i++) {
            short base = (short) (i * VERTICES_PER_QUAD);
            indices[i * INDICES_PER_QUAD + 0] = (short) (base + 0);
            indices[i * INDICES_PER_QUAD + 1] = (short) (base + 1);
            indices[i * INDICES_PER_QUAD + 2] = (short) (base + 2);
            indices[i * INDICES_PER_QUAD + 3] = (short) (base + 0);
            indices[i * INDICES_PER_QUAD + 4] = (short) (base + 2);
            indices[i * INDICES_PER_QUAD + 5] = (short) (base + 3);
        }

        ByteBuffer ibb = ByteBuffer.allocateDirect(indices.length * 2);
        ibb.order(ByteOrder.nativeOrder());
        this.indexBuffer = ibb.asShortBuffer();
        this.indexBuffer.put(indices);
        this.indexBuffer.position(0);
    }

    public void setEngine(GameEngine engine) {
        this.engine = engine;
    }

    public GameEngine getEngine() {
        return this.engine;
    }

    /**
     * Computes the pillarbox / letterbox viewport matching the 288x512 virtual canvas.
     */
    public void computeViewport(int width, int height) {
        this.screenWidth = width;
        this.screenHeight = height;

        float scaleX = (float) width / (float) VIRTUAL_WIDTH;
        float scaleY = (float) height / (float) VIRTUAL_HEIGHT;
        this.viewportScale = Math.min(scaleX, scaleY);

        this.viewportWidth = (int) (VIRTUAL_WIDTH * this.viewportScale);
        this.viewportHeight = (int) (VIRTUAL_HEIGHT * this.viewportScale);
        this.viewportX = (width - this.viewportWidth) / 2;
        this.viewportY = (height - this.viewportHeight) / 2;

        // Orthographic projection: X in [0..288], Y in [0..512] (top-left is (0,0))
        Matrix.orthoM(this.projectionMatrix, 0, 0.0f, (float) VIRTUAL_WIDTH, (float) VIRTUAL_HEIGHT, 0.0f, -1.0f, 1.0f);
    }

    /**
     * Translates a touch screen X coordinate into the 288x512 virtual canvas space.
     */
    public float toVirtualX(float screenX) {
        if (this.viewportScale <= 0f) return screenX;
        return (screenX - this.viewportX) / this.viewportScale;
    }

    /**
     * Translates a touch screen Y coordinate into the 288x512 virtual canvas space.
     */
    public float toVirtualY(float screenY) {
        if (this.viewportScale <= 0f) return screenY;
        return (screenY - this.viewportY) / this.viewportScale;
    }

    // --- GameEngine.RenderBridge Interface Implementation ---

    /**
     * Appends an axis-aligned sprite quad to the batch queue.
     * Decompiled from: C0200c.m818a
     */
    @Override
    public void drawQuad(int x1, int y1, int x2, int y2, float u1, float v1, float u2, float v2, float alpha) {
        if (this.quadCount >= MAX_QUADS) {
            return;
        }

        int offset = this.quadCount * VERTICES_PER_QUAD * FLOATS_PER_VERTEX;

        // Top-Left: (x1, y1), UV: (u1, v1)
        this.vertexData[offset + 0] = x1;
        this.vertexData[offset + 1] = y1;
        this.vertexData[offset + 2] = u1;
        this.vertexData[offset + 3] = v1;
        this.vertexData[offset + 4] = alpha;

        // Bottom-Left: (x1, y2), UV: (u1, v2)
        this.vertexData[offset + 5] = x1;
        this.vertexData[offset + 6] = y2;
        this.vertexData[offset + 7] = u1;
        this.vertexData[offset + 8] = v2;
        this.vertexData[offset + 9] = alpha;

        // Bottom-Right: (x2, y2), UV: (u2, v2)
        this.vertexData[offset + 10] = x2;
        this.vertexData[offset + 11] = y2;
        this.vertexData[offset + 12] = u2;
        this.vertexData[offset + 13] = v2;
        this.vertexData[offset + 14] = alpha;

        // Top-Right: (x2, y1), UV: (u2, v1)
        this.vertexData[offset + 15] = x2;
        this.vertexData[offset + 16] = y1;
        this.vertexData[offset + 17] = u2;
        this.vertexData[offset + 18] = v1;
        this.vertexData[offset + 19] = alpha;

        this.quadCount++;
    }

    /**
     * Appends a rotated sprite quad to the batch queue rotated around its center.
     * Decompiled from: C0200c.m819a
     */
    @Override
    public void drawQuad(int x1, int y1, int x2, int y2, float u1, float v1, float u2, float v2, float alpha, int angle) {
        if (this.quadCount >= MAX_QUADS) {
            return;
        }

        float cx = (x1 + x2) * 0.5f;
        float cy = (y1 + y2) * 0.5f;

        int offset = this.quadCount * VERTICES_PER_QUAD * FLOATS_PER_VERTEX;

        // Corner 0: (x1, y1)
        GameMath.rotatePoint(x1, y1, cx, cy, angle);
        this.vertexData[offset + 0] = GameMath.rotatedX;
        this.vertexData[offset + 1] = GameMath.rotatedY;
        this.vertexData[offset + 2] = u1;
        this.vertexData[offset + 3] = v1;
        this.vertexData[offset + 4] = alpha;

        // Corner 1: (x1, y2)
        GameMath.rotatePoint(x1, y2, cx, cy, angle);
        this.vertexData[offset + 5] = GameMath.rotatedX;
        this.vertexData[offset + 6] = GameMath.rotatedY;
        this.vertexData[offset + 7] = u1;
        this.vertexData[offset + 8] = v2;
        this.vertexData[offset + 9] = alpha;

        // Corner 2: (x2, y2)
        GameMath.rotatePoint(x2, y2, cx, cy, angle);
        this.vertexData[offset + 10] = GameMath.rotatedX;
        this.vertexData[offset + 11] = GameMath.rotatedY;
        this.vertexData[offset + 12] = u2;
        this.vertexData[offset + 13] = v2;
        this.vertexData[offset + 14] = alpha;

        // Corner 3: (x2, y1)
        GameMath.rotatePoint(x2, y1, cx, cy, angle);
        this.vertexData[offset + 15] = GameMath.rotatedX;
        this.vertexData[offset + 16] = GameMath.rotatedY;
        this.vertexData[offset + 17] = u2;
        this.vertexData[offset + 18] = v1;
        this.vertexData[offset + 19] = alpha;

        this.quadCount++;
    }

    // --- GLSurfaceView.Renderer Implementation ---

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        GameEngine.renderBridge = this;

        // Clear color is solid black for pillarbox borders
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);

        // Alpha blending for transparency
        GLES20.glEnable(GLES20.GL_BLEND);
        GLES20.glBlendFunc(GLES20.GL_SRC_ALPHA, GLES20.GL_ONE_MINUS_SRC_ALPHA);

        // Compile and link shaders
        this.programHandle = createProgram(VERTEX_SHADER_CODE, FRAGMENT_SHADER_CODE);
        if (this.programHandle != 0) {
            this.mvpMatrixHandle = GLES20.glGetUniformLocation(this.programHandle, "u_MVPMatrix");
            this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "a_Position");
            this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "a_TexCoord");
            this.alphaHandle = GLES20.glGetAttribLocation(this.programHandle, "a_Alpha");
            this.textureUniformHandle = GLES20.glGetUniformLocation(this.programHandle, "u_Texture");
        }

        // Load atlas texture
        if (this.context != null) {
            loadAtlasTexture(this.context);
        }
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        computeViewport(width, height);
    }

    public interface ActionListener {
        void onAction(int type, double value);
    }

    private ActionListener actionListener;

    public void setActionListener(ActionListener listener) {
        this.actionListener = listener;
    }

    public ActionListener getActionListener() {
        return this.actionListener;
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        // 1. Clear outer screen to black for clean pillarbox bars
        GLES20.glViewport(0, 0, this.screenWidth, this.screenHeight);
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);

        // 2. Set pillarboxed viewport for virtual canvas
        GLES20.glViewport(this.viewportX, this.viewportY, this.viewportWidth, this.viewportHeight);

        // 3. Reset quad counter for new frame
        this.quadCount = 0;

        // 4. Run game tick to generate quad draw commands
        if (this.engine != null) {
            this.engine.updateAndRender();

            if (this.actionListener != null) {
                for (int i = 0; i < this.engine.actionLogCount; i++) {
                    this.actionListener.onAction(this.engine.actionLogTypes[i], this.engine.actionLogValues[i]);
                }
            }
        }

        // 5. Draw queued quads
        renderBatchedQuads();
    }

    /**
     * Flushes the batched vertex buffer to the GPU.
     */
    public void renderBatchedQuads() {
        if (this.quadCount <= 0 || this.programHandle == 0) {
            return;
        }

        // Upload vertex data into FloatBuffer
        int totalFloats = this.quadCount * VERTICES_PER_QUAD * FLOATS_PER_VERTEX;
        this.vertexBuffer.position(0);
        this.vertexBuffer.put(this.vertexData, 0, totalFloats);
        this.vertexBuffer.position(0);

        GLES20.glUseProgram(this.programHandle);

        // Pass MVP matrix
        GLES20.glUniformMatrix4fv(this.mvpMatrixHandle, 1, false, this.projectionMatrix, 0);

        // Bind atlas texture to texture unit 0
        GLES20.glActiveTexture(GLES20.GL_TEXTURE0);
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, this.textureId);
        GLES20.glUniform1i(this.textureUniformHandle, 0);

        // Set vertex attribute pointers
        // Position: offset 0 (2 floats)
        this.vertexBuffer.position(0);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, GLES20.GL_FLOAT, false, VERTEX_STRIDE, this.vertexBuffer);

        // TexCoord: offset 2 (2 floats)
        this.vertexBuffer.position(2);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, GLES20.GL_FLOAT, false, VERTEX_STRIDE, this.vertexBuffer);

        // Alpha: offset 4 (1 float)
        this.vertexBuffer.position(4);
        GLES20.glEnableVertexAttribArray(this.alphaHandle);
        GLES20.glVertexAttribPointer(this.alphaHandle, 1, GLES20.GL_FLOAT, false, VERTEX_STRIDE, this.vertexBuffer);

        // Draw batched triangles
        this.indexBuffer.position(0);
        GLES20.glDrawElements(GLES20.GL_TRIANGLES, this.quadCount * INDICES_PER_QUAD, GLES20.GL_UNSIGNED_SHORT, this.indexBuffer);

        // Disable attribute arrays
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        GLES20.glDisableVertexAttribArray(this.texCoordHandle);
        GLES20.glDisableVertexAttribArray(this.alphaHandle);
    }

    /**
     * Loads the 1024x1024 atlas.png texture from assets into OpenGL with NEAREST filtering.
     */
    public void loadAtlasTexture(Context ctx) {
        try {
            InputStream is = ctx.getAssets().open("atlas.png");
            Bitmap bitmap = BitmapFactory.decodeStream(is);
            is.close();
            loadTexture(bitmap);
        } catch (Exception e) {
            Log.e(TAG, "Failed to load atlas.png: " + e.getMessage());
        }
    }

    /**
     * Uploads bitmap to OpenGL texture.
     */
    public void loadTexture(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }

        int[] textures = new int[1];
        GLES20.glGenTextures(1, textures, 0);
        this.textureId = textures[0];

        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, this.textureId);

        // Strict NEAREST filtering to keep authentic pixel art sharpness
        GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MIN_FILTER, GLES20.GL_NEAREST);
        GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MAG_FILTER, GLES20.GL_NEAREST);
        GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_S, GLES20.GL_CLAMP_TO_EDGE);
        GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_T, GLES20.GL_CLAMP_TO_EDGE);

        GLUtils.texImage2D(GLES20.GL_TEXTURE_2D, 0, bitmap, 0);
        bitmap.recycle();
    }

    public void setTextureId(int id) {
        this.textureId = id;
    }

    public int getTextureId() {
        return this.textureId;
    }

    private int createProgram(String vertexSource, String fragmentSource) {
        int vertexShader = loadShader(GLES20.GL_VERTEX_SHADER, vertexSource);
        if (vertexShader == 0) return 0;

        int fragmentShader = loadShader(GLES20.GL_FRAGMENT_SHADER, fragmentSource);
        if (fragmentShader == 0) return 0;

        int program = GLES20.glCreateProgram();
        if (program != 0) {
            GLES20.glAttachShader(program, vertexShader);
            GLES20.glAttachShader(program, fragmentShader);
            GLES20.glLinkProgram(program);

            int[] linkStatus = new int[1];
            GLES20.glGetProgramiv(program, GLES20.GL_LINK_STATUS, linkStatus, 0);
            if (linkStatus[0] != GLES20.GL_TRUE) {
                Log.e(TAG, "Could not link program: " + GLES20.glGetProgramInfoLog(program));
                GLES20.glDeleteProgram(program);
                program = 0;
            }
        }
        return program;
    }

    private int loadShader(int type, String shaderCode) {
        int shader = GLES20.glCreateShader(type);
        if (shader != 0) {
            GLES20.glShaderSource(shader, shaderCode);
            GLES20.glCompileShader(shader);

            int[] compiled = new int[1];
            GLES20.glGetShaderiv(shader, GLES20.GL_COMPILE_STATUS, compiled, 0);
            if (compiled[0] == 0) {
                Log.e(TAG, "Could not compile shader " + type + ": " + GLES20.glGetShaderInfoLog(shader));
                GLES20.glDeleteShader(shader);
                shader = 0;
            }
        }
        return shader;
    }
}
