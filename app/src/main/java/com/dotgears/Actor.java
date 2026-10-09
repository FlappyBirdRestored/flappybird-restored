package com.dotgears;

/**
 * Actor - Reverse-engineered 1:1 recreation of com.dotgears.C0220q.
 * Base sprite entity supporting animations, collision offsets, and spatial positioning.
 */
public class Actor extends GameObject {

    /** Current X coordinate in virtual canvas pixels (decompiled from f711b). */
    public int x;

    /** Current Y coordinate in virtual canvas pixels (decompiled from f712c). */
    public int y;

    /** Horizontal speed / substate value (decompiled from f713d). */
    public int speed;

    /** Collision / bounding box width (decompiled from f714e). */
    public int colliderWidth;

    /** Collision / bounding box height (decompiled from f715f). */
    public int colliderHeight;

    /** Sprite origin / collision offset X (decompiled from f716g). */
    public int originX;

    /** Sprite origin / collision offset Y (decompiled from f717h). */
    public int originY;

    /** Render alpha transparency [0.0..1.0] (decompiled from f718i). */
    public float alpha = 1.0f;

    /** Active animation pointer (decompiled from f719j). */
    public SpriteAnimation currentAnimation = null;

    /** Secondary state flag K (decompiled from f720k). */
    public boolean flagK;

    /** Secondary state flag L (decompiled from f721l). */
    public boolean flagL;

    /** Animation active flag (decompiled from f722m). */
    public boolean animating = false;

    /** Sprite visibility flag (decompiled from f723n). */
    public boolean visible = false;

    /** Total number of sprite frames loaded from atlas (decompiled from f724o). */
    public int frameCount;

    /** Array of sprite frame AtlasItems (decompiled from f725p). */
    public AtlasItem[] frames;

    /** Pre-allocated array of up to 10 animation sequences (decompiled from f710a). */
    SpriteAnimation[] animations = new SpriteAnimation[10];

    @Override
    public void update(float dt) {
        if (this.animating && this.currentAnimation != null) {
            this.currentAnimation.update(dt);
        }
    }

    /**
     * Resets actor position and flags.
     * Decompiled from: C0220q.mo827a(int, int)
     */
    public void reset(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = 0;
        this.animating = true;
        this.visible = true;
        this.flagK = false;
        this.flagL = false;
        this.alpha = 1.0f;
    }

    /**
     * Registers an animation sequence in the actor's animation table.
     * Decompiled from: C0220q.m921a
     */
    public void addAnimation(int id, String name, int[] frameSeq, int count, int fps, boolean loop) {
        this.animations[id] = new SpriteAnimation(id, name, frameSeq, count, fps, loop);
    }

    /**
     * Plays the animation registered at slot `id`.
     * Decompiled from: C0220q.m922a(int, boolean)
     */
    public void playAnimation(int id, boolean reset) {
        if (reset) {
            this.animations[id].reset();
        }
        this.animations[id].play();
        this.currentAnimation = this.animations[id];
    }

    @Override
    public void render(GameEngine engine) {
        if (this.visible && this.frames != null && this.frames.length > 0) {
            AtlasItem item = this.frames[0];
            if (this.currentAnimation != null) {
                item = this.frames[this.currentAnimation.currentFrame];
            }
            if (engine != null && item != null) {
                engine.draw(item.id, this.x - this.originX, this.y - this.originY, 1.0f, 1.0f, this.alpha);
            }
        }
    }

    /**
     * Initializes actor sprite frames, collision bounds, and origin offsets.
     * Decompiled from: C0220q.m923a
     */
    public void initActor(String prefix, int width, int height, int colOffsetX, int colOffsetY) {
        if (GameEngine.instance != null) {
            this.frames = GameEngine.instance.getItems(prefix);
            if (this.frames != null) {
                this.frameCount = this.frames.length;
                initBounds(width, height, colOffsetX, colOffsetY);
            }
        }
    }

    /**
     * Initializes bounds from an explicit frames array (useful for testing or direct setup).
     */
    public void initActor(AtlasItem[] frames, int width, int height, int colOffsetX, int colOffsetY) {
        this.frames = frames;
        if (this.frames != null && this.frames.length > 0) {
            this.frameCount = this.frames.length;
            initBounds(width, height, colOffsetX, colOffsetY);
        }
    }

    private void initBounds(int width, int height, int colOffsetX, int colOffsetY) {
        if (width == 0 || height == 0) {
            this.colliderWidth = this.frames[0].width;
            this.colliderHeight = this.frames[0].height;
        } else {
            this.colliderWidth = width;
            this.colliderHeight = height;
        }

        if (colOffsetX == 0 || colOffsetY == 0) {
            this.originX = (this.frames[0].width - this.colliderWidth) >> 1;
            this.originY = (this.frames[0].height - this.colliderHeight) >> 1;
        } else {
            this.originX = colOffsetX;
            this.originY = colOffsetY;
        }
    }
}
