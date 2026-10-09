package com.dotgears.flappy;

import com.dotgears.Actor;
import com.dotgears.AtlasItem;
import com.dotgears.GameEngine;
import com.dotgears.GameMath;
import com.dotgears.Sparkle;

/**
 * Bird - Reverse-engineered 1:1 recreation of com.dotgears.flappy.C0204a.
 * Primary game entity representing the player bird. Implements immutable physics:
 * flap velocity (-5.0f), gravity (0.3f), terminal fall speed (8.0f),
 * rotational impulse (-10.0f), rotational accel (0.4f), angle clamping [-20.0f, 90.0f],
 * pre-game hover sine wave (8 deg step, amplitude 4.0f), and 3 randomized bird colors.
 */
public class Bird extends Actor {

    /** Initial horizontal spawn coordinate (mandated 80). */
    public static final int INITIAL_X = 80;

    /** Initial vertical spawn coordinate (mandated 246). */
    public static final int INITIAL_Y = 246;

    /** Flap impulse velocity added on jump (mandated -5.0f). */
    public static final float FLAP_IMPULSE = -5.0f;

    /** Gravity acceleration added to velocityY per tick (mandated 0.3f). */
    public static final float GRAVITY_ACCEL = 0.3f;

    /** Maximum falling terminal velocity (mandated 8.0f). */
    public static final float MAX_FALL_SPEED = 8.0f;

    /** Jump tilt rotational impulse added on flap (mandated -10.0f). */
    public static final float ROTATION_IMPULSE = -10.0f;

    /** Angular acceleration added to angularVelocity per tick (mandated 0.4f). */
    public static final float ROTATION_ACCEL = 0.4f;

    /** Minimum bird tilt angle clamp (pointing up, mandated -20.0f). */
    public static final float MIN_ANGLE = -20.0f;

    /** Maximum bird tilt angle clamp (nosediving down, mandated 90.0f). */
    public static final float MAX_ANGLE = 90.0f;

    /** Virtual canvas ground level (mandated 400). */
    public static final int GROUND_Y = 400;

    /** Hover wave angular step per tick in degrees (mandated 8). */
    public static final int HOVER_STEP_ANGLE = 8;

    /** Hover wave sine amplitude in virtual pixels (mandated 4.0f). */
    public static final float HOVER_AMPLITUDE = 4.0f;

    /** Collider width in virtual canvas pixels (mandated 20). */
    public static final int COLLIDER_WIDTH = 20;

    /** Collider height in virtual canvas pixels (mandated 20). */
    public static final int COLLIDER_HEIGHT = 20;

    /** Collider origin offset X within 48x48 sprite (mandated 14). */
    public static final int ORIGIN_OFFSET_X = 14;

    /** Collider origin offset Y within 48x48 sprite (mandated 14). */
    public static final int ORIGIN_OFFSET_Y = 14;

    /** Frame animation sequence for flap and auto [0, 1, 2, 1, ...]. */
    public static final int[] ANIM_SEQUENCE = {0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1};

    /** Glint sparkle particle attached to the bird (decompiled from f524A). */
    public Sparkle sparkle;

    /** Periodic sparkle countdown timer (decompiled from f525B). */
    public int sparkleTimer = 30;

    /** Current bird pitch angle in degrees (decompiled from f526q). */
    public float angle;

    /** Current angular rotational velocity (decompiled from f527r). */
    public float angularVelocity;

    /** Angular rotational acceleration per tick (decompiled from f528s). */
    public float angularAcceleration;

    /** Current vertical speed (decompiled from f529t). */
    public float velocityY;

    /** Gravity acceleration added to velocityY (decompiled from f530u). */
    public float gravity;

    /** Dead state flag (decompiled from f531v). */
    public boolean dead;

    /** Pre-game hover sine motion state (decompiled from f532w). */
    public boolean hovering;

    /** Hover wave sine angle accumulator 0..359 (decompiled from f533x). */
    public int hoverAngle;

    /** Computed hover vertical offset (decompiled from f534y). */
    public float hoverOffsetY;

    /** Bird color selection index: 0=yellow, 1=blue, 2=red (decompiled from f535z). */
    public int colorIndex;

    /**
     * Default constructor matching C0204a.<init>().
     */
    public Bird() {
        initActor("bird", COLLIDER_WIDTH, COLLIDER_HEIGHT, ORIGIN_OFFSET_X, ORIGIN_OFFSET_Y);
        addAnimation(0, "flap", ANIM_SEQUENCE, 12, 30, false);
        addAnimation(1, "auto", ANIM_SEQUENCE, 12, 10, true);
        this.hovering = true;
        this.colorIndex = GameMath.random() % 3;
        this.sparkle = new Sparkle();
    }

    /**
     * Constructor allowing explicit AtlasItem frames injection (useful for tests).
     */
    public Bird(AtlasItem[] frames) {
        initActor(frames, COLLIDER_WIDTH, COLLIDER_HEIGHT, ORIGIN_OFFSET_X, ORIGIN_OFFSET_Y);
        addAnimation(0, "flap", ANIM_SEQUENCE, 12, 30, false);
        addAnimation(1, "auto", ANIM_SEQUENCE, 12, 10, true);
        this.hovering = true;
        this.colorIndex = GameMath.random() % 3;
        this.sparkle = new Sparkle();
    }

    /**
     * Resets the bird position, physics, and hover state for a new round.
     * Decompiled from: C0204a.m831a()
     */
    public void reset() {
        super.reset(INITIAL_X, INITIAL_Y);
        this.angle = 0.0f;
        this.velocityY = 0.0f;
        this.gravity = 1.0f;
        this.angularAcceleration = ROTATION_ACCEL;
        this.dead = false;
        this.hovering = true;
        this.hoverAngle = 0;
        playAnimation(1, true);
        this.colorIndex = GameMath.random() % 3;
    }

    /**
     * Executes flap jump impulse if alive and within bounds.
     * Decompiled from: C0204a.m832b()
     */
    public void flap() {
        if (this.hovering) {
            this.hovering = false;
        }

        if (this.y >= 0 && !this.dead) {
            playAnimation(0, true);
            this.velocityY = FLAP_IMPULSE;
            this.gravity = GRAVITY_ACCEL;
            this.angularVelocity = ROTATION_IMPULSE;
            this.angularAcceleration = ROTATION_ACCEL;

            if (GameEngine.instance != null) {
                GameEngine.instance.postEvent(4, null, 5);
            }
        }
    }

    /**
     * Per-frame 60 Hz physics and hover motion tick.
     * Decompiled from: C0204a.mo826a(float)
     */
    @Override
    public void update(float dt) {
        super.update(dt);

        if (this.hovering) {
            this.hoverAngle += HOVER_STEP_ANGLE;
            if (this.hoverAngle == 360) {
                this.hoverAngle = 0;
            }
            this.hoverOffsetY = GameMath.sin(this.hoverAngle) * HOVER_AMPLITUDE;
            return;
        }

        this.hoverOffsetY = 0.0f;
        this.velocityY += this.gravity;
        if (this.velocityY > MAX_FALL_SPEED) {
            this.velocityY = MAX_FALL_SPEED;
        }

        this.y = (int) (this.y + this.velocityY);
        if (this.y > GROUND_Y - this.colliderHeight) {
            this.y = GROUND_Y - this.colliderHeight;
            this.gravity = 0.0f;
            this.velocityY = 0.0f;
        }

        this.angle += this.angularVelocity;
        this.angularVelocity += this.angularAcceleration;
        if (this.angle < MIN_ANGLE) {
            this.angle = MIN_ANGLE;
        }
        if (this.angle > MAX_ANGLE) {
            this.angle = MAX_ANGLE;
        }

        this.sparkleTimer--;
        if (this.sparkleTimer == 0) {
            this.sparkleTimer = 30;
        }

        if (this.sparkle != null && this.sparkle.animating) {
            this.sparkle.update(dt);
        }
    }

    /**
     * Renders bird sprite with color indexing and pitch rotation.
     * Decompiled from: C0204a.mo828a(C0210g)
     */
    @Override
    public void render(GameEngine engine) {
        if (this.visible && engine != null) {
            if (this.frames == null) {
                this.frames = engine.getItems("bird");
            }
            if (this.frames != null && this.frames.length >= 9) {
                AtlasItem item = this.frames[(this.colorIndex * 3) + 1];
                if (this.currentAnimation != null && !this.currentAnimation.finished) {
                    item = this.frames[this.currentAnimation.currentFrame + (this.colorIndex * 3)];
                }
                if (item != null) {
                    int drawX = this.x - this.originX;
                    int drawY = ((int) this.hoverOffsetY) + (this.y - this.originY);
                    engine.draw(item, drawX, drawY, 1.0f, (int) this.angle);
                }
            }
        }
    }
}
