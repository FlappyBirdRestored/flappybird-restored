package com.dotgears;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * GameEngine - Reverse-engineered 1:1 recreation of com.dotgears.C0210g.
 * Core engine handling sprite atlas lookup, input dispatch, delayed event queue,
 * screen shake, screen fade/flash transitions, and sprite quad draw dispatch.
 */
public class GameEngine extends GameObject {

    /** Global engine singleton instance (decompiled from f583D). */
    public static GameEngine instance;

    /** Session play count / parameter (decompiled from f584A). */
    public int sessionPlays;

    /** NumberRenderer for score panel (decompiled from f585B). */
    public NumberRenderer scoreRenderer;

    /** ScoreBoard results dialog instance (decompiled from f586C). */
    public ScoreBoard scoreBoard;

    /** Fixed time step dt = 0.015f (~60 Hz) (decompiled from f587E). */
    public final float TICK_DT = 0.015f;

    /** Pre-allocated array of up to 512 AtlasItems loaded from atlas.txt (decompiled from f588a). */
    public AtlasItem[] atlasItems = new AtlasItem[512];

    /** Delayed event remaining delay ticks/timers (decompiled from f589b). */
    public int[] eventDelays = new int[50];

    /** Delayed event type IDs (decompiled from f590c). */
    public int[] eventTypes = new int[50];

    /** Delayed event target GameObjects (decompiled from f591d). */
    public GameObject[] eventTargets = new GameObject[50];

    /** Event queue circular insertion head (decompiled from f592e). */
    public int eventQueueHead = 0;

    /** Fullscreen black screen fade Tween (decompiled from f593f). */
    public Tween fadeTween;

    /** Event ID triggered when screen fade transition finishes (decompiled from f594g). */
    public int fadeTargetEvent;

    /** Fullscreen white flash Tween (decompiled from f595h). */
    public Tween flashTween;

    /** Camera shake random offset X in pixels (decompiled from f596i). */
    public int shakeOffsetX;

    /** Camera shake random offset Y in pixels (decompiled from f597j). */
    public int shakeOffsetY;

    /** Camera shake pixel amplitude/intensity (decompiled from f598k). */
    public int shakeIntensity;

    /** Camera shake remaining duration in ticks (decompiled from f599l). */
    public int shakeDurationTicks;

    /** Pre-allocated pool of 20 ScoreParticle objects (decompiled from f600m). */
    public EntityPool scoreParticles;

    /** Pre-allocated pool of 10 Sparkle objects for medal glints (decompiled from f601n). */
    public EntityPool sparkles;

    /** Atlas item for fullscreen black fade overlay (decompiled from f602o). */
    public AtlasItem blackSprite;

    /** Atlas item for fullscreen white flash overlay (decompiled from f603p). */
    public AtlasItem whiteSprite;

    /** Global engine scale factor (decompiled from f604q). */
    public int scale = 1;

    /** Engine pause state flag (decompiled from f605r). */
    public boolean paused = false;

    /** Touch X coordinates for up to 10 fingers (decompiled from f606s). */
    public int[] touchX = new int[10];

    /** Touch Y coordinates for up to 10 fingers (decompiled from f607t). */
    public int[] touchY = new int[10];

    /** Number of active touch points (decompiled from f608u). */
    public int touchCount = 0;

    /** Count of recorded platform actions in current tick (decompiled from f609v). */
    public int actionLogCount = 0;

    /** Action type buffer for current tick (decompiled from f610w). */
    public int[] actionLogTypes = new int[50];

    /** Action value buffer for current tick (decompiled from f611x). */
    public double[] actionLogValues = new double[50];

    /** Current game round score (decompiled from f612y). */
    public int score = 0;

    /** Saved all-time high score (decompiled from f613z). */
    public int highScore = 0;

    /** Modern RenderBridge interface for Phase 6 OpenGL ES 2.0 quad batching. */
    public interface RenderBridge {
        void drawQuad(int x1, int y1, int x2, int y2, float u1, float v1, float u2, float v2, float alpha);
        void drawQuad(int x1, int y1, int x2, int y2, float u1, float v1, float u2, float v2, float alpha, int angle);
    }

    /** Static render bridge hook for connecting to GLSurfaceView / FlappyScene. */
    public static RenderBridge renderBridge;

    /**
     * Default constructor for test harnesses and standalone instantiation.
     */
    public GameEngine() {
        instance = this;
        this.fadeTween = new Tween();
        this.flashTween = new Tween();
        this.scoreParticles = new EntityPool();
        for (int i = 0; i < 20; i++) {
            this.scoreParticles.add(new ScoreParticle());
        }
        this.sparkles = new EntityPool();
        for (int i = 0; i < 10; i++) {
            this.sparkles.add(new Sparkle());
        }
        this.scoreRenderer = new NumberRenderer("number_score");
        this.scoreBoard = new ScoreBoard();
    }

    /**
     * 1:1 reconstruction of C0210g(int, int, InputStream).
     *
     * @param highScore Saved all-time high score.
     * @param sessionPlays Session game count / parameter.
     * @param inputStream InputStream of atlas.txt.
     */
    public GameEngine(int highScore, int sessionPlays, InputStream inputStream) {
        this();
        this.highScore = highScore;
        this.sessionPlays = sessionPlays;
        if (inputStream != null) {
            loadAtlas(inputStream);
        }
    }

    /**
     * Loads and parses the sprite atlas definitions from atlas.txt.
     */
    public void loadAtlas(InputStream inputStream) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().length() > 1) {
                    String[] parts = line.trim().split("\\s+");
                    AtlasItem item = new AtlasItem(
                            parts[0],
                            Integer.parseInt(parts[1]),
                            Integer.parseInt(parts[2]),
                            Float.parseFloat(parts[3]),
                            Float.parseFloat(parts[4]),
                            Float.parseFloat(parts[5]),
                            Float.parseFloat(parts[6])
                    );
                    // End coordinate calculation from C0210g lines 118-119:
                    item.u2 = item.u1 + item.u2;
                    item.v2 = item.v1 + item.v2;
                    if (item.id < this.atlasItems.length) {
                        this.atlasItems[item.id] = item;
                    }
                    Log.i("FlappyBird", item.name + " " + item.width + " " + item.height + " " + item.u1 + " " + item.v1 + " " + item.u2 + " " + item.v2);
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Engine initialization routine.
     * Decompiled from: C0210g.m842a()
     */
    public void init() {
        GameMath.instance = new GameMath();
        this.fadeTween = new Tween();
        this.flashTween = new Tween();
        this.blackSprite = getItem("black");
        this.whiteSprite = getItem("white");
        this.touchCount = 0;
        this.scoreParticles = new EntityPool();
        for (int i = 0; i < 20; i++) {
            this.scoreParticles.add(new ScoreParticle());
        }
        this.sparkles = new EntityPool();
        for (int i2 = 0; i2 < 10; i2++) {
            this.sparkles.add(new Sparkle());
        }
        this.scoreRenderer = new NumberRenderer("number_score");
        this.scoreBoard = new ScoreBoard();
        this.shakeDurationTicks = 0;
        this.paused = false;
        this.actionLogCount = 0;
        clearEventQueue();
        initGame();
        fade(false, 0, 0.5f);
    }


    /**
     * Submits a score and updates highScore if current score is greater.
     * Decompiled from: C0210g.m843a(int)
     */
    public void submitScore(int s) {
        this.score = s;
        logAction(0, s);
        if (s > this.highScore) {
            this.highScore = s;
        }
    }


    /**
     * Camera / screen shake hook.
     * Decompiled from: C0210g.m844a(int, float)
     */
    public void shake(int intensity, float duration) {
        startShake(intensity, (int) (duration / TICK_DT));
    }


    /**
     * Triggers screen shake with given intensity and duration in ticks.
     */
    public void startShake(int intensity, int durationTicks) {
        this.shakeIntensity = intensity;
        this.shakeDurationTicks = durationTicks;
    }

    /**
     * Touch down event hook overridden by FlappyGame.
     * Decompiled from: C0210g.mo834a(int, int)
     */
    public void onPress(int x, int y) {
    }


    /**
     * Touch release / touch event hook overridden by FlappyGame.
     * Decompiled from: C0210g.mo835a(int, int, int, int)
     */
    public void onTouch(int x1, int y1, int x2, int y2) {
    }


    /**
     * Delayed / animation event handler overridden by FlappyGame.
     * Decompiled from: C0210g.mo836a(int, GameObject)
     */
    public void onEvent(int eventType, GameObject target) {
    }


    /**
     * Game logic and scene update hook overridden by FlappyGame.
     * Decompiled from: C0210g.mo837b(float)
     */
    public void updateGame(float dt) {
    }


    /**
     * Game scene initialization hook overridden by FlappyGame.
     * Decompiled from: C0210g.mo838c()
     */
    public void initGame() {
    }


    /**
     * Draw sprite by ID with scaling and alpha.
     * Decompiled from: C0210g.m845a(int, int, int, float, float, float)
     */
    public void draw(int spriteId, int x, int y, float scaleX, float scaleY, float alpha) {
        AtlasItem item = this.atlasItems[spriteId];
        if (item != null) {
            draw(x, y, (int) (x + (item.width * scaleX)), (int) (y + (item.height * scaleY)),
                    item.u1, item.v1, item.u2, item.v2, alpha);
        }
    }


    /**
     * Primitive draw quad with texture UV and alpha.
     * Decompiled from: C0210g.m846a(int, int, int, int, float, float, float, float, float)
     */
    public void draw(int x1, int y1, int x2, int y2, float u1, float v1, float u2, float v2, float alpha) {
        if (renderBridge != null) {
            renderBridge.drawQuad(x1, y1, x2, y2, u1, v1, u2, v2, alpha);
        }
    }


    /**
     * Primitive draw quad with texture UV, alpha, and rotation angle.
     * Decompiled from: C0210g.m847a(int, int, int, int, float, float, float, float, float, int)
     */
    public void draw(int x1, int y1, int x2, int y2, float u1, float v1, float u2, float v2, float alpha, int angle) {
        if (renderBridge != null) {
            renderBridge.drawQuad(x1, y1, x2, y2, u1, v1, u2, v2, alpha, angle);
        }
    }


    /**
     * Draw sprite by ID resized to width and height with alpha.
     * Decompiled from: C0210g.m848a(int, int, int, int, int, float)
     */
    public void draw(int spriteId, int x, int y, int width, int height, float alpha) {
        AtlasItem item = this.atlasItems[spriteId];
        if (item != null) {
            draw(x, y, x + width, y + height, item.u1, item.v1, item.u2, item.v2, alpha);
        }
    }


    /**
     * Draw sprite item directly at (x, y) with alpha.
     * Decompiled from: C0210g.m850a(AtlasItem, int, int, float)
     */
    public void draw(AtlasItem item, int x, int y, float alpha) {
        if (item != null) {
            draw(x, y, x + item.width, y + item.height, item.u1, item.v1, item.u2, item.v2, alpha);
        }
    }


    /**
     * Draw sprite item directly at (x, y) with alpha and rotation angle.
     * Decompiled from: C0210g.m851a(AtlasItem, int, int, float, int)
     */
    public void draw(AtlasItem item, int x, int y, float alpha, int angle) {
        if (item != null) {
            draw(x, y, x + item.width, y + item.height, item.u1, item.v1, item.u2, item.v2, alpha, angle);
        }
    }


    /**
     * Posts a delayed game event or sound effect trigger.
     * Decompiled from: C0210g.m849a(int, GameObject, int)
     */
    public void postEvent(int eventType, GameObject target, int delay) {
        this.eventTypes[this.eventQueueHead] = eventType;
        this.eventTargets[this.eventQueueHead] = target;
        this.eventDelays[this.eventQueueHead] = delay;
        this.eventQueueHead++;
        if (this.eventQueueHead >= 50) {
            this.eventQueueHead = 0;
        }
    }


    /**
     * Initiates fullscreen screen fade transition.
     * Decompiled from: C0210g.m852a(boolean, int, float)
     *
     * @param fadeIn If true, fades to black (0 -> 1). If false, fades from black (1 -> 0).
     * @param eventOnDone Event ID fired via onEvent when fade finishes.
     * @param duration Fade duration in seconds.
     */
    public void fade(boolean fadeIn, int eventOnDone, float duration) {
        if (this.fadeTween != null && this.fadeTween.finished) {
            if (fadeIn) {
                this.fadeTween.start(0.0f, 1.0f, 5, duration);
            } else {
                this.fadeTween.start(1.0f, 0.0f, 5, duration);
            }
            this.fadeTween.update(0.0f);
            this.fadeTargetEvent = eventOnDone;
        }
    }


    /**
     * Initiates fullscreen white screen flash transition.
     * Decompiled from: C0210g.m858c(float)
     *
     * @param duration Flash fade duration in seconds.
     */
    public void flash(float duration) {
        if (this.flashTween != null && this.flashTween.finished) {
            this.flashTween.start(1.0f, 0.0f, 11, duration);
            this.flashTween.update(0.0f);
        }
    }


    /**
     * Copies touch coordinates from input bridge into engine buffers.
     * Decompiled from: C0210g.m853a(float[], float[])
     */
    public void updateTouches(float[] xArr, float[] yArr) {
        for (int i = 0; i < 10; i++) {
            this.touchX[i] = (int) xArr[i];
            this.touchY[i] = (int) yArr[i];
        }
        this.touchCount = 10;
    }


    /**
     * Returns an array of AtlasItems whose names start with the given prefix.
     * Decompiled from: C0210g.m854a(String)
     */
    public AtlasItem[] getItems(String prefix) {
        int count = 0;
        for (int i = 0; i < 512; i++) {
            if (this.atlasItems[i] != null && this.atlasItems[i].name.startsWith(prefix)) {
                count++;
            }
        }
        if (count <= 0) {
            return null;
        }
        AtlasItem[] result = new AtlasItem[count];
        int index = 0;
        for (int i = 0; i < 512; i++) {
            if (this.atlasItems[i] != null && this.atlasItems[i].name.startsWith(prefix)) {
                result[index] = this.atlasItems[i];
                index++;
            }
        }
        return result;
    }


    /**
     * Finds the first AtlasItem whose name starts with the given prefix.
     * Decompiled from: C0210g.m855b(String)
     */
    public AtlasItem getItem(String prefix) {
        for (int i = 0; i < 512; i++) {
            if (this.atlasItems[i] != null && this.atlasItems[i].name.startsWith(prefix)) {
                return this.atlasItems[i];
            }
        }
        return null;
    }


    /**
     * Main engine update and render loop for each 60 Hz tick.
     * Decompiled from: C0210g.m856b()
     */
    public void updateAndRender() {
        this.actionLogCount = 0;
        if (!this.paused) {
            for (int i = 0; i < 50; i++) {
                if (this.eventDelays[i] > 0) {
                    this.eventDelays[i] -= 30;
                    if (this.eventDelays[i] <= 0) {
                        onEvent(this.eventTypes[i], this.eventTargets[i]);
                    }
                }
            }
        }
        updateGame(0.015f);
        if (!this.paused) {
            if (this.scoreBoard != null) {
                this.scoreBoard.update(0.015f);
            }
            if (this.sparkles != null) {
                this.sparkles.update(0.015f);
            }
            if (this.fadeTween != null && (!this.fadeTween.finished || this.fadeTween.value != 0.0f)) {
                this.fadeTween.update(0.015f);
                if (this.fadeTween.finished) {
                    onEvent(this.fadeTargetEvent, this);
                }
            }
            if (this.flashTween != null && (!this.flashTween.finished || this.flashTween.value != 0.0f)) {
                this.flashTween.update(0.015f);
            }
            if (this.shakeDurationTicks > 0) {
                this.shakeDurationTicks--;
                this.shakeOffsetX = GameMath.random(-this.shakeIntensity, this.shakeIntensity);
                this.shakeOffsetY = GameMath.random(-this.shakeIntensity, this.shakeIntensity);
            } else {
                this.shakeOffsetX = 0;
                this.shakeOffsetY = 0;
            }
        }
        if (this.scoreBoard != null) {
            this.scoreBoard.render(this);
        }
        if (this.sparkles != null) {
            this.sparkles.render(this);
        }
        if (this.fadeTween != null && (!this.fadeTween.finished || this.fadeTween.value != 0.0f)) {
            if (this.blackSprite != null) {
                draw(this.blackSprite.id, -144, -256, 864, 1536, this.fadeTween.value);
            }
        }
        if (this.flashTween != null && (!this.flashTween.finished || this.flashTween.value != 0.0f)) {
            if (this.whiteSprite != null) {
                draw(this.whiteSprite.id, -144, -256, 864, 1536, this.flashTween.value);
            }
        }
    }


    /**
     * Spawns a sparkle particle at (x, y).
     * Decompiled from: C0210g.m857b(int, int)
     */
    public void spawnSparkle(int x, int y) {
        if (this.sparkles != null && this.sparkles.size() > 0) {
            Sparkle sparkle = (Sparkle) this.sparkles.acquireNext();
            if (sparkle != null) {
                sparkle.reset(x, y);
            }
        }
    }

    public void addSparkle(int x, int y) {
        spawnSparkle(x, y);
    }


    /**
     * Records a platform action / sound / stat event to the action buffer.
     * Decompiled from: C0210g.m859c(int, int)
     */
    public void logAction(int type, int value) {
        if (this.actionLogCount < 50) {
            this.actionLogTypes[this.actionLogCount] = type;
            this.actionLogValues[this.actionLogCount] = (double) value;
            this.actionLogCount++;
        }
    }

    public void logAction(int type, double value) {
        if (this.actionLogCount < 50) {
            this.actionLogTypes[this.actionLogCount] = type;
            this.actionLogValues[this.actionLogCount] = value;
            this.actionLogCount++;
        }
    }

    public void recordEvent(int type, int value) {
        logAction(type, value);
    }


    /**
     * Clears all pending delayed events from the event queue.
     * Decompiled from: C0210g.m860d()
     */
    public void clearEventQueue() {
        this.eventQueueHead = 0;
        for (int i = 0; i < 50; i++) {
            this.eventDelays[i] = 0;
        }
    }

}
