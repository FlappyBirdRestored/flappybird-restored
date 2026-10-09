package com.dotgears;

/**
 * NumberRenderer - Reverse-engineered 1:1 recreation of com.dotgears.C0215l.
 * Handles right-aligned rendering of score values using sprite digits.
 */
public class NumberRenderer {

    /** Width of each digit glyph in pixels (decompiled from f670a). */
    public int charWidth;

    /** Height of each digit glyph in pixels (decompiled from f671b). */
    public int charHeight;

    /** Array of 10 digit AtlasItems ('0' through '9') (decompiled from f672c). */
    public AtlasItem[] digits;

    /**
     * Initializes NumberRenderer with an explicit array of 10 digit AtlasItems.
     */
    public NumberRenderer(AtlasItem[] digits) {
        this.digits = digits;
        if (digits != null && digits.length > 0) {
            this.charWidth = digits[0].width;
            this.charHeight = digits[0].height;
        }
    }

    /**
     * Initializes NumberRenderer by searching for digit items with the given prefix
     * (e.g. "number_score", "number_context") in GameEngine.instance.
     * Decompiled from: C0215l(String)
     */
    public NumberRenderer(String prefix) {
        if (GameEngine.instance != null) {
            this.digits = GameEngine.instance.getItems(prefix);
            if (this.digits != null && this.digits.length > 0) {
                this.charWidth = this.digits[0].width;
                this.charHeight = this.digits[0].height;
            }
        }
    }

    /**
     * Renders an integer number from right to left.
     * Decompiled from: C0215l.m914a
     *
     * @param engine       The GameEngine instance to dispatch draw calls to.
     * @param value        The integer value to display.
     * @param rightX       The right boundary X coordinate.
     * @param y            The Y coordinate.
     * @param leadingZeros If true, draws zeros for higher unused digit places.
     * @param maxDigits    Maximum number of digits to render.
     */
    public void render(GameEngine engine, int value, int rightX, int y, boolean leadingZeros, int maxDigits) {
        int nextValue;
        int currentX = rightX - this.charWidth;
        boolean shouldRender = true;
        int tempValue = value;

        while (maxDigits > 0) {
            if (tempValue > 0 || shouldRender) {
                if (engine != null && this.digits != null) {
                    engine.draw(this.digits[tempValue % 10].id, currentX, y, 1.0f, 1.0f, 1.0f);
                }
                currentX -= this.charWidth;
                nextValue = tempValue / 10;
                shouldRender = leadingZeros;
            } else {
                nextValue = tempValue;
            }
            maxDigits--;
            tempValue = nextValue;
        }
    }
}
