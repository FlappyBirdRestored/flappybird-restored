package com.dotgears;

/**
 * ScoreParticle - Reverse-engineered 1:1 recreation of com.dotgears.C0218o.
 * Floating score popup particle that renders digits and an optional '+' sign
 * from the "number_context" atlas sprites, rising and accelerating under gravity.
 */
public class ScoreParticle extends GameObject {

    /** Width of digit character (12 pixels) (decompiled from f678a). */
    public int charWidth = 12;

    /** Height of digit character (14 pixels) (decompiled from f679b). */
    public int charHeight = 14;

    /** Flag indicating whether to draw '+' prefix sprite (decompiled from f680c). */
    public boolean hasSign;

    /** Remaining lifetime in frames (decompiled from f681d). */
    public int lifespan;

    /** Numeric score value to display (decompiled from f682e). */
    public int scoreValue;

    /** Maximum number of digits to render (decompiled from f683f). */
    public int digitCount;

    /** Vertical velocity in pixels per frame (decompiled from f684g). */
    public int velocityY;

    /** Vertical acceleration added to velocityY every 4 frames (decompiled from f685h). */
    public int gravity;

    /** Sub-tick frame counter 0..3 for applying gravity (decompiled from f686i). */
    public int subTickCounter;

    /** Canvas X anchor coordinate (decompiled from f687j). */
    public int x;

    /** Canvas Y anchor coordinate (decompiled from f688k). */
    public int y;

    /** Horizontal offset added to x for digit rendering (decompiled from f689l). */
    public int offsetX;

    /** Array of 11 AtlasItems ("number_context_00".."number_context_10") (decompiled from f690m). */
    public AtlasItem[] numberSprites;

    /**
     * Default constructor matching C0218o.<init>().
     */
    public ScoreParticle() {
        this.charWidth = 12;
        this.charHeight = 14;
        if (GameEngine.instance != null) {
            this.numberSprites = GameEngine.instance.getItems("number_context");
        }
    }

    /**
     * Constructor allowing explicit injection of AtlasItem sprites (useful for testing).
     */
    public ScoreParticle(AtlasItem[] numberSprites) {
        this.charWidth = 12;
        this.charHeight = 14;
        this.numberSprites = numberSprites;
    }

    /**
     * Initializes and activates the score particle with position, score, motion, and lifetime.
     */
    public void reset(int x, int y, int scoreValue, boolean hasSign, int lifespan, int velocityY, int gravity) {
        this.x = x;
        this.y = y;
        this.scoreValue = scoreValue;
        this.hasSign = hasSign;
        this.lifespan = lifespan;
        this.velocityY = velocityY;
        this.gravity = gravity;
        this.subTickCounter = 0;
        this.digitCount = scoreValue >= 100 ? 3 : (scoreValue >= 10 ? 2 : 1);
        this.offsetX = hasSign ? this.charWidth : 0;
        this.active = true;
        this.visible = true;
    }

    /**
     * Updates physics position and decreases lifetime.
     * Decompiled from: C0218o.mo826a(float)
     */
    @Override
    public void update(float dt) {
        if (this.active && this.lifespan > 0) {
            this.lifespan--;
            if (this.velocityY < 2) {
                this.y += this.velocityY;
                this.subTickCounter++;
                if (this.subTickCounter == 4) {
                    this.subTickCounter = 0;
                    this.velocityY += this.gravity;
                }
            }
            if (this.lifespan <= 0) {
                this.active = false;
                this.visible = false;
            }
        }
    }

    /**
     * Renders optional '+' sign and score digits.
     * Decompiled from: C0218o.mo828a(C0210g)
     */
    @Override
    public void render(GameEngine engine) {
        if (this.visible && engine != null) {
            if (this.numberSprites == null) {
                this.numberSprites = engine.getItems("number_context");
            }
            if (this.numberSprites != null) {
                if (this.hasSign && this.numberSprites.length > 10 && this.numberSprites[10] != null) {
                    engine.draw(this.numberSprites[10].id, this.x, this.y, 1.0f, 1.0f, 1.0f);
                }
                renderDigits(engine, this.scoreValue, this.x + this.offsetX, this.y, false, this.digitCount);
            }
        }
    }

    /**
     * Renders numeric digits from right to left with special kerning for digit '1'.
     * Decompiled from: C0218o.m919a(C0210g, int, int, int, boolean, int)
     */
    public void renderDigits(GameEngine engine, int value, int rightX, int y, boolean leadingZeros, int maxDigits) {
        int nextVal;
        int curX = rightX - this.charWidth;
        boolean drawZero = true;
        int remaining = value;

        while (maxDigits > 0) {
            if (remaining > 0 || drawZero) {
                int digit = remaining % 10;
                if (engine != null && this.numberSprites != null && digit >= 0 && digit < this.numberSprites.length) {
                    AtlasItem item = this.numberSprites[digit];
                    if (item != null) {
                        engine.draw(item.id, curX, y, 1.0f, 1.0f, 1.0f);
                    }
                }
                nextVal = remaining / 10;
                curX = (digit != 1) ? curX - (this.charWidth - 2) : curX - 4;
                drawZero = leadingZeros;
            } else {
                nextVal = remaining;
            }
            maxDigits--;
            remaining = nextVal;
        }
    }
}
