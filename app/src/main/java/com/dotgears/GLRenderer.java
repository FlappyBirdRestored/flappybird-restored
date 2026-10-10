package com.dotgears;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Trace;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

import com.dotgears.flappybird.BuildConfig;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Locale;

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

    /** Fixed 60 Hz simulation time-step in nanoseconds (1,000,000,000 / 60 = 16,666,666 ns). */
    public static final long NS_PER_TICK = 1_000_000_000L / 60L;

    /** Maximum real time to accumulate per frame to prevent spiral of death during lag spikes (5 ticks = ~83.3ms). */
    public static final long MAX_ELAPSED_NS = 5L * NS_PER_TICK;

    // Fixed-timestep accumulator state (decouples 60 Hz physics from 90Hz/120Hz/144Hz displays)
    public long lastFrameTimeNs = 0L;
    public long timeAccumulatorNs = 0L;

    /** Detected hardware display refresh rate in Hz (default 60.0 Hz). */
    public float displayRefreshRate = 60.0f;
    private int refreshRatePollCounter = 0;

    // Performance diagnostics probe (zero GC allocation)
    public static final String PERF_TAG = "FlappyPerf";
    public long diagWindowStartNs = 0L;
    public int diagRenderFrames = 0;
    public int diagPhysicsTicks = 0;
    public int diagFrames0Ticks = 0;
    public int diagFrames1Tick = 0;
    public int diagFrames2Ticks = 0;
    public int diagFrames3PlusTicks = 0;
    public long diagTotalFrameNs = 0L;
    public long diagMinFrameNs = Long.MAX_VALUE;
    public long diagMaxFrameNs = 0L;
    public long diagMaxUpdateNs = 0L;
    public long diagMaxRenderNs = 0L;

    // 64-frame ring buffer for GL thread timing forensics (Zero GC allocation)
    public static final String TRACE_TAG = "FlappyTrace";
    private static final int GL_RING_SIZE = 64;
    private final long[] ringFrameIndex = new long[GL_RING_SIZE];
    private final long[] ringTimestampNs = new long[GL_RING_SIZE];
    private final long[] ringDtNs = new long[GL_RING_SIZE];
    private final int[] ringTicksRun = new int[GL_RING_SIZE];
    private final long[] ringRemainderNs = new long[GL_RING_SIZE];
    public long totalGlFrames = 0L;

    // Anomaly capture state
    public long anomalyTriggerFrame = -1L;
    public long anomalyTriggerTimestampNs = 0L;
    public int anomalyDumpCountdown = -1;
    public long lastAnomalyDumpFrame = -100L;
    public int anomalyFlashFrames = 0;

    // Rate-aware Bresenham integer cadence scheduler
    public final CadenceScheduler cadenceScheduler = new CadenceScheduler(60);

    // Anomaly suppression frames after resume / reset to ignore lifecycle transitions (default 30 frames)
    public int suppressAnomalyFrames = 30;

    // GL frame rate tracking for cross-checking against panel VSync
    private long glElapsedSumNs = 0L;
    private int glElapsedCount = 0;

    public GLRenderer() {
        initBuffers();
    }

    public GLRenderer(Context context, GameEngine engine) {
        this.context = context;
        this.engine = engine;
        updateDisplayRefreshRate(context);
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
        resetTimestep();
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
        updateDisplayRefreshRate(this.context);
        resetTimestep();
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

    /**
     * Updates detected display refresh rate from the window manager.
     * Automatically proposes rate changes to the CadenceScheduler with 0.5s stability hysteresis.
     */
    public void updateDisplayRefreshRate(Context ctx) {
        if (ctx == null) {
            return;
        }
        try {
            WindowManager wm = (WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
            if (wm != null) {
                Display display = wm.getDefaultDisplay();
                if (display != null) {
                    float rate = display.getRefreshRate();
                    if (rate > 20.0f && rate < 360.0f) {
                        int snapped = CadenceScheduler.snapToStandardRefreshRate(Math.round(rate));
                        this.displayRefreshRate = (float) snapped;
                        this.cadenceScheduler.proposeRateHz(snapped);
                    }
                }
            }
        } catch (Exception ignored) {}
    }

    /**
     * Proposes a hardware VSync rate measured directly from Choreographer intervals.
     */
    public void proposeHardwareRate(int rateHz) {
        this.cadenceScheduler.proposeRateHz(rateHz);
        this.displayRefreshRate = (float) this.cadenceScheduler.getRateHz();
    }

    public void setDisplayRefreshRate(float rate) {
        if (rate > 20.0f && rate < 360.0f) {
            this.displayRefreshRate = rate;
            this.cadenceScheduler.setRateHz(Math.round(rate));
        }
    }

    public float getDisplayRefreshRate() {
        return this.displayRefreshRate;
    }

    public boolean is120Hz() {
        return Math.abs(this.displayRefreshRate - 120.0f) <= 10.0f;
    }

    /**
     * Resets timing state to prevent catch-up bursts after pauses or lifecycle transitions.
     */
    public void resetTimestep() {
        resetTimestep(false);
    }

    /**
     * Resets timing state with a 3-frame warm-up guard to soak up scheduling bursts
     * upon lifecycle resume, surface creation, or window focus gain.
     */
    public void resetTimestepWithWarmup() {
        resetTimestep(true);
    }

    public void resetTimestep(boolean enableWarmup) {
        this.lastFrameTimeNs = 0L;
        this.timeAccumulatorNs = 0L;
        this.glElapsedSumNs = 0L;
        this.glElapsedCount = 0;
        this.cadenceScheduler.reset();
        if (enableWarmup) {
            this.cadenceScheduler.triggerWarmup(CadenceScheduler.DEFAULT_WARMUP_FRAMES);
        }
        this.suppressAnomalyFrames = 30; // Suppress anomaly detector for 30 frames after reset/resume
        this.diagWindowStartNs = 0L;
        this.diagRenderFrames = 0;
        this.diagPhysicsTicks = 0;
        this.diagFrames0Ticks = 0;
        this.diagFrames1Tick = 0;
        this.diagFrames2Ticks = 0;
        this.diagFrames3PlusTicks = 0;
        this.diagTotalFrameNs = 0L;
        this.diagMinFrameNs = Long.MAX_VALUE;
        this.diagMaxFrameNs = 0L;
        this.diagMaxUpdateNs = 0L;
        this.diagMaxRenderNs = 0L;
        this.anomalyDumpCountdown = -1;
        this.anomalyFlashFrames = 0;
    }

    /**
     * Advances the engine simulation using the rate-aware Bresenham cadence scheduler.
     * Decouples fixed 60 Hz physics from any arbitrary display refresh rate (60Hz, 90Hz, 120Hz, 144Hz, 240Hz, <60Hz)
     * with zero floating-point remainder drift, 0.5ms duplicate wake filtering, 41.7ms stall clamping,
     * and a fail-safe 1-second tick watchdog.
     *
     * @param elapsedNs Elapsed real time in nanoseconds since last step.
     * @return Number of 60 Hz ticks simulated.
     */
    public int stepSimulation(long elapsedNs) {
        Trace.beginSection("FlappyUpdate");
        try {
            int ticks = this.cadenceScheduler.step(elapsedNs);
            return executeSimulationTicks(ticks);
        } finally {
            Trace.endSection();
        }
    }

    /**
     * Executes the given number of simulation ticks and captures performance metrics.
     */
    public int executeSimulationTicks(int ticks) {
        if (this.engine != null) {
            for (int t = 0; t < ticks; t++) {
                this.quadCount = 0;
                long updateStartNs = System.nanoTime();
                this.engine.updateAndRender();
                long updateDurationNs = System.nanoTime() - updateStartNs;
                if (updateDurationNs > this.diagMaxUpdateNs) {
                    this.diagMaxUpdateNs = updateDurationNs;
                }

                if (this.actionListener != null) {
                    for (int i = 0; i < this.engine.actionLogCount; i++) {
                        this.actionListener.onAction(this.engine.actionLogTypes[i], this.engine.actionLogValues[i]);
                    }
                }
            }
        }
        return ticks;
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        Trace.beginSection("FlappyDraw");
        try {
            long frameStartNs = System.nanoTime();

            // 1. Periodically check for dynamic display refresh rate switches (e.g. LTPO transitions) every 60 frames (~1s)
            this.refreshRatePollCounter++;
            if (this.refreshRatePollCounter >= 60) {
                this.refreshRatePollCounter = 0;
                updateDisplayRefreshRate(this.context);
            }

            // 2. Clear outer screen to black for clean pillarbox bars
            GLES20.glViewport(0, 0, this.screenWidth, this.screenHeight);
            GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);

            // 3. Set pillarboxed viewport for virtual canvas
            GLES20.glViewport(this.viewportX, this.viewportY, this.viewportWidth, this.viewportHeight);

            // 4. Fixed 60 Hz simulation pacing
            int ticksRun = 0;
            long elapsed = 0L;
            if (this.lastFrameTimeNs == 0L) {
                this.lastFrameTimeNs = frameStartNs;
                this.suppressAnomalyFrames = 30;
                // Prime simulation on first frame to ensure initial scene quads are generated
                ticksRun = executeSimulationTicks(1);
            } else {
                elapsed = frameStartNs - this.lastFrameTimeNs;
                this.lastFrameTimeNs = frameStartNs;

                // Rate-source cross-check: verify proposed rate against actual GL frame delivery
                if (elapsed > 0L) {
                    this.glElapsedSumNs += elapsed;
                    this.glElapsedCount++;
                    if (this.glElapsedCount >= 30) {
                        long avgGlDt = this.glElapsedSumNs / this.glElapsedCount;
                        if (avgGlDt > 0L) {
                            int measuredGlFps = (int) Math.round(1_000_000_000.0 / (double) avgGlDt);
                            int candidateRate = this.cadenceScheduler.getCandidateRateHz();
                            // If GL thread is throttled significantly below proposed rate (e.g. 60 FPS on 120 Hz display)
                            if (candidateRate > measuredGlFps + 15 && measuredGlFps >= 20) {
                                int effectiveRate = CadenceScheduler.snapToStandardRefreshRate(measuredGlFps);
                                this.cadenceScheduler.proposeRateHz(effectiveRate);
                            }
                        }
                        this.glElapsedSumNs = 0L;
                        this.glElapsedCount = 0;
                    }
                }

                // Check stale Choreographer sample timeout (>0.5s without update)
                if (GameActivity.lastVsyncSampleTimeNs > 0L && (frameStartNs - GameActivity.lastVsyncSampleTimeNs > 500_000_000L)) {
                    updateDisplayRefreshRate(this.context);
                }

                ticksRun = stepSimulation(elapsed);
            }

            // 5. Draw queued quads (retains previous frame quads if no logic tick ran)
            long renderStartNs = System.nanoTime();
            renderBatchedQuads();
            long renderDurationNs = System.nanoTime() - renderStartNs;

            // 6. Visual indicator overlay: flash red badge in corner on anomaly for human visual correlation
            if (BuildConfig.DEBUG && this.anomalyFlashFrames > 0) {
                this.anomalyFlashFrames--;
                renderAnomalyBadge();
            }

            // 7. Forensic instrumentation: record into GL ring buffer and check anomaly trigger
            if (BuildConfig.DEBUG) {
                recordFrameForensics(frameStartNs, elapsed, ticksRun);
                recordDiagnostics(elapsed, ticksRun, renderDurationNs);
            }
        } finally {
            Trace.endSection();
        }
    }

    /**
     * Records performance metrics and logs 3-second aggregate diagnostic summaries and hitch alerts.
     */
    private void recordDiagnostics(long elapsedNs, int ticksRun, long renderDurationNs) {
        if (elapsedNs <= 0L) {
            return;
        }

        long now = System.nanoTime();
        if (this.diagWindowStartNs == 0L) {
            this.diagWindowStartNs = now;
        }

        this.diagRenderFrames++;
        this.diagPhysicsTicks += ticksRun;
        this.diagTotalFrameNs += elapsedNs;

        if (ticksRun == 0) {
            this.diagFrames0Ticks++;
        } else if (ticksRun == 1) {
            this.diagFrames1Tick++;
        } else if (ticksRun == 2) {
            this.diagFrames2Ticks++;
        } else {
            this.diagFrames3PlusTicks++;
        }

        if (elapsedNs < this.diagMinFrameNs) {
            this.diagMinFrameNs = elapsedNs;
        }
        if (elapsedNs > this.diagMaxFrameNs) {
            this.diagMaxFrameNs = elapsedNs;
        }
        if (renderDurationNs > this.diagMaxRenderNs) {
            this.diagMaxRenderNs = renderDurationNs;
        }

        // Hitch warning for frames longer than 41.7ms (true multi-frame stall)
        if (elapsedNs > 41_700_000L && this.diagRenderFrames > 10) {
            Log.w(PERF_TAG, "Hitch: frame=" + (elapsedNs / 1_000_000.0f) + "ms, ticks=" + ticksRun);
        }

        // Emit aggregate window summary every 3 seconds (3,000,000,000 ns)
        long windowDurationNs = now - this.diagWindowStartNs;
        if (windowDurationNs >= 3_000_000_000L) {
            float windowSeconds = windowDurationNs / 1_000_000_000.0f;
            float fps = this.diagRenderFrames / windowSeconds;
            float ticksPerSec = this.diagPhysicsTicks / windowSeconds;
            float avgFrameMs = (this.diagTotalFrameNs / (float) this.diagRenderFrames) / 1_000_000.0f;
            float minFrameMs = this.diagMinFrameNs / 1_000_000.0f;
            float maxFrameMs = this.diagMaxFrameNs / 1_000_000.0f;
            float maxUpdateMs = this.diagMaxUpdateNs / 1_000_000.0f;
            float maxRenderMs = this.diagMaxRenderNs / 1_000_000.0f;
            int non1TickFrames = this.diagFrames0Ticks + this.diagFrames2Ticks + this.diagFrames3PlusTicks;

            Log.i(PERF_TAG, String.format(Locale.US,
                    "FPS: %.1f | Ticks/s: %.1f | Cadence: [0:%d, 1:%d, 2:%d, 3+:%d] (Anomalies: %d) | " +
                    "Frame(ms): avg=%.2f, min=%.2f, max=%.2f | MaxUpdate: %.2fms | MaxRender: %.2fms | " +
                    "Display: %.1fHz (Cadence: %dHz, Fallback: %b)",
                    fps, ticksPerSec,
                    this.diagFrames0Ticks, this.diagFrames1Tick, this.diagFrames2Ticks, this.diagFrames3PlusTicks,
                    non1TickFrames,
                    avgFrameMs, minFrameMs, maxFrameMs, maxUpdateMs, maxRenderMs,
                    this.displayRefreshRate, this.cadenceScheduler.getRateHz(), this.cadenceScheduler.isWatchdogFallback()));

            // Reset diagnostic counters for next window
            this.diagWindowStartNs = now;
            this.diagRenderFrames = 0;
            this.diagPhysicsTicks = 0;
            this.diagFrames0Ticks = 0;
            this.diagFrames1Tick = 0;
            this.diagFrames2Ticks = 0;
            this.diagFrames3PlusTicks = 0;
            this.diagTotalFrameNs = 0L;
            this.diagMinFrameNs = Long.MAX_VALUE;
            this.diagMaxFrameNs = 0L;
            this.diagMaxUpdateNs = 0L;
            this.diagMaxRenderNs = 0L;
        }
    }

    /**
     * Records per-frame timing metrics into the GL thread ring buffer and schedules a 21-frame
     * forensic dump if an anomaly occurs.
     */
    private void recordFrameForensics(long frameStartNs, long elapsedNs, int ticksRun) {
        long frameIndex = this.totalGlFrames++;
        int slot = (int) (frameIndex % GL_RING_SIZE);
        this.ringFrameIndex[slot] = frameIndex;
        this.ringTimestampNs[slot] = frameStartNs;
        this.ringDtNs[slot] = elapsedNs;
        this.ringTicksRun[slot] = ticksRun;
        this.ringRemainderNs[slot] = 0L;

        // Anomaly dump countdown handler: triggers dump exactly 10 frames after the anomaly
        if (this.anomalyDumpCountdown > 0) {
            this.anomalyDumpCountdown--;
            if (this.anomalyDumpCountdown == 0) {
                dumpAnomalyTrace(this.anomalyTriggerFrame, this.anomalyTriggerTimestampNs);
                this.anomalyDumpCountdown = -1;
            }
        }

        // Countdown suppression after resume / surface creation
        if (this.suppressAnomalyFrames > 0) {
            this.suppressAnomalyFrames--;
        }

        // Anomaly detection: fire outside suppression and cooldown
        if (this.suppressAnomalyFrames == 0 && (frameIndex - this.lastAnomalyDumpFrame > 30) && this.anomalyDumpCountdown < 0) {
            boolean isAnomaly = false;
            int cadenceRate = this.cadenceScheduler.getRateHz();

            if (cadenceRate == 60) {
                // At 60Hz: any frame with ticksRun != 1 during gameplay is an anomaly!
                if (ticksRun != 1) {
                    isAnomaly = true;
                }
            } else if (cadenceRate > 60) {
                // At high refresh rates (90, 120, 144Hz): normal cadence is 0 or 1; ticksRun > 1 is a stall anomaly
                if (ticksRun > 1) {
                    isAnomaly = true;
                }
            } else {
                // At low rates (< 60Hz, e.g. 30Hz): normal cadence is 2 ticks; ticksRun > 2 is a stall
                if (ticksRun > 2) {
                    isAnomaly = true;
                }
            }

            if (isAnomaly) {
                this.anomalyTriggerFrame = frameIndex;
                this.anomalyTriggerTimestampNs = frameStartNs;
                this.anomalyDumpCountdown = 10; // Wait 10 frames after anomaly to dump both past and future
                this.anomalyFlashFrames = 10;   // Flash visual red badge for 10 frames (~160ms)
                Log.w(TRACE_TAG, "!!! ANOMALY DETECTED at GL frame #" + frameIndex +
                        " | dt=" + (elapsedNs / 1_000_000.0f) + "ms | ticks=" + ticksRun +
                        ". Scheduling 21-frame forensic dump...");
            }
        }
    }

    /**
     * Dumps ~10 frames before and 10 frames after an anomaly from the GL ring buffer,
     * immediately followed by the corresponding Choreographer hardware VSync trace.
     */
    private void dumpAnomalyTrace(long triggerFrame, long triggerTimestampNs) {
        this.lastAnomalyDumpFrame = triggerFrame;
        Log.w(TRACE_TAG, "==================== FORENSIC ANOMALY TRACE START ====================");
        Log.w(TRACE_TAG, "--- GL Thread Frame Ring Buffer (Trigger Frame #" + triggerFrame + ") ---");
        long start = Math.max(0, triggerFrame - 10);
        long end = Math.min(this.totalGlFrames - 1, triggerFrame + 10);
        for (long f = start; f <= end; f++) {
            int slot = (int) (f % GL_RING_SIZE);
            if (this.ringFrameIndex[slot] == f) {
                String marker = (f == triggerFrame) ? " <-- [ANOMALY TRIGGER]" : "";
                Log.w(TRACE_TAG, String.format(Locale.US,
                        "GL #%d | time=%d | dt=%.2fms | ticks=%d | rem=%.2fms%s",
                        this.ringFrameIndex[slot],
                        this.ringTimestampNs[slot],
                        this.ringDtNs[slot] / 1_000_000.0f,
                        this.ringTicksRun[slot],
                        this.ringRemainderNs[slot] / 1_000_000.0f,
                        marker));
            }
        }

        // Trigger aligned Choreographer hardware VSync trace on main looper
        GameActivity.dumpChoreographerTrace(triggerTimestampNs);
        Log.w(TRACE_TAG, "==================== FORENSIC ANOMALY TRACE END ======================");
    }

    /**
     * Renders a small high-visibility red badge indicator in the corner of the display for human visual correlation.
     * Uses zero allocations and standard OpenGL scissor rectangle clear.
     */
    private void renderAnomalyBadge() {
        GLES20.glEnable(GLES20.GL_SCISSOR_TEST);
        int badgeSize = Math.max(24, this.viewportWidth / 12);
        int badgeX = this.viewportX + 8;
        int badgeY = this.viewportY + this.viewportHeight - badgeSize - 8;
        GLES20.glScissor(badgeX, badgeY, badgeSize, badgeSize);
        GLES20.glClearColor(1.0f, 0.1f, 0.1f, 1.0f);
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
        GLES20.glDisable(GLES20.GL_SCISSOR_TEST);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
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
        InputStream is = null;
        try {
            try {
                is = ctx.getAssets().open("gfx/atlas.png");
            } catch (Exception ignored) {
                is = ctx.getAssets().open("atlas.png");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap bitmap = BitmapFactory.decodeStream(is, null, options);
            loadTexture(bitmap);
            Log.i(TAG, "Successfully loaded atlas texture! ID=" + this.textureId);
        } catch (Exception e) {
            Log.e(TAG, "Failed to load atlas.png: " + e.getMessage(), e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception ignored) {}
            }
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
