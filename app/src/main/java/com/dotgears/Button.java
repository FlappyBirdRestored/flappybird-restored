package com.dotgears;

/**
 * Button - Reverse-engineered 1:1 recreation of com.dotgears.C0203f.
 * Interactive UI touch button supporting bounding box hit testing,
 * click down/up transitions, and tactile 2-pixel downward press offset rendering.
 */
public class Button extends GameObject {

    /** Button background sprite region (decompiled from f514a). */
    public AtlasItem sprite;

    /** Button top-left X coordinate (decompiled from f515b). */
    public int x;

    /** Button top-left Y coordinate (decompiled from f516c). */
    public int y;

    /** Button width (decompiled from f517d). */
    public int width;

    /** Button height (decompiled from f518e). */
    public int height;

    /** Flag indicating whether the button is currently held down (decompiled from f519f). */
    public boolean isPressed;

    /** Trigger flag for when the button was just pressed down this frame (decompiled from f520g). */
    public boolean justPressed;

    /** Trigger flag for when the button was just released / clicked this frame (decompiled from f521h). */
    public boolean justReleased;

    /** Flag indicating whether a touch point is currently inside the bounds (decompiled from f522i). */
    public boolean isHovered;

    public Button() {
    }

    /**
     * Initializes button sprite from GameEngine atlas by name.
     * Decompiled from: C0203f.m830a(String)
     */
    public void initButton(String spriteName) {
        if (GameEngine.instance != null) {
            this.sprite = GameEngine.instance.getItem(spriteName);
            if (this.sprite != null) {
                this.width = this.sprite.width;
                this.height = this.sprite.height;
            }
        }
    }

    /**
     * Alias for initButton(String) to match C0203f.m830a(String).
     */
    public void set(String spriteName) {
        initButton(spriteName);
    }

    /**
     * Initializes button directly with an AtlasItem (useful for direct testing and decoupling).
     */
    public void initButton(AtlasItem sprite) {
        this.sprite = sprite;
        if (sprite != null) {
            this.width = sprite.width;
            this.height = sprite.height;
        }
    }

    /**
     * Sets button position and activates it, resetting state flags.
     * Decompiled from: C0203f.m829a(int, int)
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
        this.active = true;
        this.visible = true;
        this.isHovered = false;
        this.justPressed = false;
        this.justReleased = false;
        this.isPressed = false;
    }

    /**
     * Alias for setPosition(int, int) to match C0203f.m829a(int, int).
     */
    public void set(int x, int y) {
        setPosition(x, y);
    }

    @Override
    public void update(float dt) {
        this.isHovered = false;
        if (GameEngine.instance != null) {
            int count = GameEngine.instance.touchCount;
            int[] touchX = GameEngine.instance.touchX;
            int[] touchY = GameEngine.instance.touchY;

            for (int i = 0; i < count; i++) {
                if (touchX[i] > this.x && touchX[i] < this.x + this.width &&
                        touchY[i] > this.y && touchY[i] < this.y + this.height) {
                    this.isHovered = true;
                    break;
                }
            }
        }

        this.justPressed = false;
        this.justReleased = false;

        if (this.isHovered != this.isPressed) {
            if (this.isPressed) {
                this.justReleased = true;
                this.isPressed = false;
            } else {
                this.justPressed = true;
                this.isPressed = true;
            }
        }
    }

    @Override
    public void render(GameEngine engine) {
        if (this.sprite != null && engine != null) {
            if (this.isPressed) {
                // Tactile press visual: shifted down by 2 virtual pixels
                engine.draw(this.sprite.id, this.x, this.y + 2, 1.0f, 1.0f, 1.0f);
            } else {
                engine.draw(this.sprite.id, this.x, this.y, 1.0f, 1.0f, 1.0f);
            }
        }
    }
}
