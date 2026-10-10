package com.dotgears;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.dotgears.flappy.FlappyGame;

import java.io.IOException;
import java.io.InputStream;

/**
 * GameActivity - Main Android Game Activity for Flappy Bird.
 * Modernized recreation of com.dotgears.GameActivity:
 * - Replaces 32-bit AndEngine with native Android GLSurfaceView (GLES20).
 * - Implements edge-to-edge immersive display scaling.
 * - Bridges multi-touch input to virtual 288x512 coordinates.
 * - Handles audio playback and offline SharedPreferences high-score persistence.
 */
public class GameActivity extends Activity {

    public static final String TAG = "FlappyBird";
    public static final String PREFS_NAME = "FlappyBird";
    public static final String PREF_KEY_SCORE = "score";

    public GLSurfaceView glSurfaceView;
    public GLRenderer renderer;
    public FlappyGame game;
    public AudioManager audioManager;

    public int savedHighScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Fullscreen and keep screen awake
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // Immersive sticky full screen navigation hide
        hideSystemUI();

        // Load saved high score from SharedPreferences
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        this.savedHighScore = prefs.getInt(PREF_KEY_SCORE, 0);

        // Initialize audio subsystem
        this.audioManager = new AudioManager(this);

        // Initialize FlappyGame instance and load atlas.txt
        initGame();

        // Setup OpenGL ES 2.0 SurfaceView
        initGLSurfaceView();

        setContentView(this.glSurfaceView);
    }

    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );
    }

    private void initGame() {
        InputStream is = null;
        try {
            is = getAssets().open("atlas.txt");
            this.game = new FlappyGame(this.savedHighScore, 0, is);
        } catch (IOException e) {
            Log.e(TAG, "Failed to load atlas.txt from assets: " + e.getMessage());
            this.game = new FlappyGame(this.savedHighScore, 0, null);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException ignored) {}
            }
        }

        GameEngine.instance = this.game;
        this.game.init();
    }

    private void initGLSurfaceView() {
        this.glSurfaceView = new GLSurfaceView(this);
        this.glSurfaceView.setEGLContextClientVersion(2);

        this.renderer = new GLRenderer(this, this.game);
        this.glSurfaceView.setRenderer(this.renderer);
        this.glSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);

        // Action queue listener to handle audio, scores, and links from the game loop
        this.renderer.setActionListener(new GLRenderer.ActionListener() {
            @Override
            public void onAction(int type, double value) {
                handleGameAction(type, value);
            }
        });

        // Touch event bridge: maps screen touches to virtual canvas coordinates
        this.glSurfaceView.setOnTouchListener(new View.OnTouchListener() {
            private final float[] xBuffer = new float[10];
            private final float[] yBuffer = new float[10];

            {
                for (int i = 0; i < 10; i++) {
                    xBuffer[i] = -100.0f;
                    yBuffer[i] = -100.0f;
                }
            }

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (game == null || renderer == null) {
                    return false;
                }

                int action = event.getActionMasked();
                int pointerIndex = event.getActionIndex();
                int pointerId = event.getPointerId(pointerIndex);

                if (action == MotionEvent.ACTION_DOWN || action == MotionEvent.ACTION_POINTER_DOWN) {
                    float vx = renderer.toVirtualX(event.getX(pointerIndex));
                    float vy = renderer.toVirtualY(event.getY(pointerIndex));

                    if (pointerId < 10) {
                        xBuffer[pointerId] = vx;
                        yBuffer[pointerId] = vy;
                    }
                    game.updateTouches(xBuffer, yBuffer);

                    game.onPress((int) vx, (int) vy);
                    game.onTouch((int) vx, (int) vy, (int) vx, (int) vy);
                } else if (action == MotionEvent.ACTION_MOVE) {
                    int count = Math.min(event.getPointerCount(), 10);
                    for (int i = 0; i < count; i++) {
                        int pid = event.getPointerId(i);
                        if (pid < 10) {
                            xBuffer[pid] = renderer.toVirtualX(event.getX(i));
                            yBuffer[pid] = renderer.toVirtualY(event.getY(i));
                        }
                    }
                    game.updateTouches(xBuffer, yBuffer);
                } else if (action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_POINTER_UP || action == MotionEvent.ACTION_CANCEL) {
                    if (pointerId < 10) {
                        xBuffer[pointerId] = -100.0f;
                        yBuffer[pointerId] = -100.0f;
                    }
                    game.updateTouches(xBuffer, yBuffer);
                }
                return true;
            }
        });
    }

    /**
     * Processes platform actions emitted by GameEngine / FlappyGame.
     * Decompiled from C0200c.mo821a(float).
     */
    public void handleGameAction(int type, double value) {
        switch (type) {
            case 0:
                // Save new high score to SharedPreferences
                int newScore = (int) value;
                if (newScore > this.savedHighScore) {
                    this.savedHighScore = newScore;
                    saveHighScore(newScore);
                }
                break;
            case 1:
                // Leaderboards
                openLeaderboards();
                break;
            case 2:
                // Rate / Google Play store URL
                openRateUrl();
                break;
            case 3:
                // Share / developer URL
                openDeveloperUrl();
                break;
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                // Sound effects
                if (this.audioManager != null) {
                    this.audioManager.handleAction(type);
                }
                break;
        }
    }

    /**
     * Persists new all-time high score to SharedPreferences.
     */
    public void saveHighScore(int score) {
        SharedPreferences.Editor editor = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE).edit();
        editor.putInt(PREF_KEY_SCORE, score);
        editor.apply();
    }

    /**
     * Opens Play Store rating URL.
     */
    public void openRateUrl() {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.dotgears.flappybird"));
            startActivity(intent);
        } catch (Exception e) {
            try {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.dotgears.flappybird"));
                startActivity(webIntent);
            } catch (Exception ignored) {}
        }
    }

    /**
     * Opens developer page URL.
     */
    public void openDeveloperUrl() {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dotgears.com"));
            startActivity(intent);
        } catch (Exception ignored) {}
    }

    /**
     * Leaderboard request handler (decoupled from Google Play Games Services).
     */
    public void openLeaderboards() {
        Log.i(TAG, "Leaderboard requested. Current High Score: " + this.savedHighScore);
    }

    @Override
    protected void onResume() {
        super.onResume();
        hideSystemUI();
        if (this.glSurfaceView != null) {
            this.glSurfaceView.onResume();
        }
        if (this.game != null) {
            this.game.paused = false;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (this.glSurfaceView != null) {
            this.glSurfaceView.onPause();
        }
        if (this.game != null) {
            this.game.paused = true;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (this.audioManager != null) {
            this.audioManager.release();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.i(TAG, "Back key pressed.");
            return true; // Match original 2014 Flappy Bird behavior (ignore back button)
        }
        return super.onKeyDown(keyCode, event);
    }
}
