package com.dotgears;

/**
 * Medal - Reverse-engineered 1:1 recreation of com.dotgears.C0214k.
 * Displays the awarded medal on the ScoreBoard (Bronze, Silver, Gold, Platinum)
 * and spawns recurring sparkles at random surface positions every 30 ticks (0.5s).
 */
public class Medal extends GameObject {

    /** Medal tier types (medals_0 .. medals_3). */
    public static final int TYPE_BRONZE = 0;
    public static final int TYPE_SILVER = 1;
    public static final int TYPE_GOLD = 2;
    public static final int TYPE_PLATINUM = 3;

    /** Default medal bounding box size (44x44 virtual canvas pixels). */
    public static final int DEFAULT_SIZE = 44;

    /** Periodic sparkle spawn interval in frames (30 ticks = 0.5s at 60 Hz). */
    public static final int SPARKLE_INTERVAL = 30;

    /** Canvas X coordinate of the medal (decompiled from f663a). */
    public int x;

    /** Canvas Y coordinate of the medal (decompiled from f664b). */
    public int y;

    /** Medal width in pixels (decompiled from f665c, default 44). */
    public int width;

    /** Medal height in pixels (decompiled from f666d, default 44). */
    public int height;

    /** Medal type index (0: bronze, 1: silver, 2: gold, 3: platinum) (decompiled from f667e). */
    public int medalType;

    /** Countdown timer until next sparkle spawn (decompiled from f668f). */
    public int sparkleTimer;

    /** Array of medal sprites loaded from GameEngine ("medals_0".."medals_3") (decompiled from f669g). */
    public AtlasItem[] medalSprites;

    /**
     * Default constructor matching C0214k.<init>().
     */
    public Medal() {
        this.width = DEFAULT_SIZE;
        this.height = DEFAULT_SIZE;
        this.sparkleTimer = SPARKLE_INTERVAL;
        if (GameEngine.instance != null) {
            this.medalSprites = GameEngine.instance.getItems("medals");
        }
    }

    /**
     * Constructor allowing explicit injection of AtlasItem sprites (useful for unit tests).
     */
    public Medal(AtlasItem[] medalSprites) {
        this.width = DEFAULT_SIZE;
        this.height = DEFAULT_SIZE;
        this.sparkleTimer = SPARKLE_INTERVAL;
        this.medalSprites = medalSprites;
    }

    /**
     * Activates the medal with the given tier type and resets sparkle timer to 30.
     * Decompiled from: C0214k.m913a(int)
     */
    public void reset(int medalType) {
        this.x = 0;
        this.y = 0;
        this.width = DEFAULT_SIZE;
        this.height = DEFAULT_SIZE;
        this.medalType = medalType;
        this.sparkleTimer = SPARKLE_INTERVAL;
        this.active = true;
        this.visible = true;
    }

    /**
     * Alias for reset(int) matching C0214k.m913a(int).
     */
    public void set(int medalType) {
        reset(medalType);
    }

    /**
     * Sets position on canvas.
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Updates sparkle countdown and triggers a new sparkle at a random position on the medal.
     * Decompiled from: C0214k.mo826a(float)
     */
    @Override
    public void update(float dt) {
        if (this.active && this.sparkleTimer > 0) {
            this.sparkleTimer--;
            if (this.sparkleTimer <= 0) {
                this.sparkleTimer = SPARKLE_INTERVAL;
                if (GameEngine.instance != null) {
                    int sparkleX = (this.x - 3) + GameMath.random(0, this.width + 6);
                    int sparkleY = (this.y - 3) + GameMath.random(0, this.height + 6);
                    GameEngine.instance.spawnSparkle(sparkleX, sparkleY);
                }
            }
        }
    }

    /**
     * Renders the awarded medal sprite if visible.
     * Decompiled from: C0214k.mo828a(C0210g)
     */
    @Override
    public void render(GameEngine engine) {
        if (this.visible && engine != null) {
            if (this.medalSprites == null) {
                this.medalSprites = engine.getItems("medals");
            }
            if (this.medalSprites != null && this.medalType >= 0 && this.medalType < this.medalSprites.length) {
                AtlasItem item = this.medalSprites[this.medalType];
                if (item != null) {
                    engine.draw(item.id, this.x, this.y, 1.0f, 1.0f, 1.0f);
                }
            }
        }
    }
}
