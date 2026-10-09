package com.dotgears;

/**
 * Sparkle - Reverse-engineered 1:1 recreation of com.dotgears.C0202e.
 * Medal sparkle / glint animation effect using 3 frames (blink_00, blink_01, blink_02)
 * animated in a 5-step sequence [0, 1, 2, 1, 0] at 10 FPS without looping.
 */
public class Sparkle extends Actor {

    /** Frame sequence for the sparkle animation: [0, 1, 2, 1, 0] */
    public static final int[] ANIM_FRAMES = new int[]{0, 1, 2, 1, 0};

    /** Frame count of the sparkle sequence (5) */
    public static final int ANIM_FRAME_COUNT = 5;

    /** Frame rate in FPS (10) */
    public static final int ANIM_FPS = 10;

    /** Collider width (10) */
    public static final int COLLIDER_WIDTH = 10;

    /** Collider height (10) */
    public static final int COLLIDER_HEIGHT = 10;

    /** Origin offset X (4) */
    public static final int ORIGIN_X = 4;

    /** Origin offset Y (4) */
    public static final int ORIGIN_Y = 4;

    /**
     * Default constructor matching C0202e.<init>().
     */
    public Sparkle() {
        initActor("blink", COLLIDER_WIDTH, COLLIDER_HEIGHT, ORIGIN_X, ORIGIN_Y);
        addAnimation(0, "blink", ANIM_FRAMES, ANIM_FRAME_COUNT, ANIM_FPS, false);
        this.animating = false;
        this.visible = false;
        playAnimation(0, true);
    }

    /**
     * Alternative constructor taking AtlasItem frames directly (useful for tests and offline setup).
     */
    public Sparkle(AtlasItem[] frames) {
        initActor(frames, COLLIDER_WIDTH, COLLIDER_HEIGHT, ORIGIN_X, ORIGIN_Y);
        addAnimation(0, "blink", ANIM_FRAMES, ANIM_FRAME_COUNT, ANIM_FPS, false);
        this.animating = false;
        this.visible = false;
        playAnimation(0, true);
    }

    /**
     * Advances the sparkle animation and deactivates visibility once finished.
     * Decompiled from: C0202e.mo826a(float)
     */
    @Override
    public void update(float dt) {
        if (this.animating) {
            super.update(dt);
            if (this.currentAnimation == null || !this.currentAnimation.finished) {
                return;
            }
            this.animating = false;
            this.visible = false;
        }
    }

    /**
     * Activates the sparkle at the specified canvas coordinates and starts the animation.
     * Decompiled from: C0202e.mo827a(int, int)
     */
    @Override
    public void reset(int x, int y) {
        super.reset(x, y);
        playAnimation(0, true);
    }

    /**
     * Renders the current frame of the sparkle if visible.
     * Decompiled from: C0202e.mo828a(C0210g)
     */
    @Override
    public void render(GameEngine engine) {
        if (this.visible) {
            super.render(engine);
        }
    }
}
