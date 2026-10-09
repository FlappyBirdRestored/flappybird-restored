package com.dotgears;

import android.util.Log;

/**
 * BitmapFont - Reverse-engineered 1:1 recreation of com.dotgears.C0211h.
 * Renders formatted numbers and ASCII text with alignment (center/left/right/top/bottom)
 * and configurable kerning using bitmap glyphs.
 */
public class BitmapFont {

    /** Digit lookup string (decompiled from f614l). */
    public static final String DIGITS = "0123456789";

    // Alignment bitmask constants
    public static final int ALIGN_RIGHT = 1;
    public static final int ALIGN_CENTER_HORIZONTAL = 2;
    public static final int ALIGN_CENTER_VERTICAL = 4;
    public static final int ALIGN_BOTTOM = 8;

    /** Glyph items indexed by ASCII code (decompiled from f615a). */
    public AtlasItem[] glyphs = new AtlasItem[256];

    /** Width of each ASCII character glyph (decompiled from f616b). */
    protected int[] glyphWidths = new int[256];

    /** Maximum character height among loaded glyphs (decompiled from f617c). */
    protected int maxGlyphHeight;

    /** Character kerning / spacing offset (decompiled from f618d). */
    protected int kerning;

    /** Alignment bitmask flags (decompiled from f619e). */
    protected int alignFlags;

    /** Render position X (decompiled from f620f). */
    protected int posX;

    /** Render position Y (decompiled from f621g). */
    protected int posY;

    /** Render alpha transparency [0.0..1.0] (decompiled from f622h). */
    protected float alpha;

    /** Current formatted text character buffer (decompiled from f623i). */
    public char[] buffer = new char[256];

    /** Internal buffer for number reversal (decompiled from f624j). */
    public char[] reversedBuffer = new char[256];

    /** Current number of characters to render in buffer (decompiled from f625k). */
    public int textLength = 0;

    /**
     * Constructs BitmapFont with an explicit array of glyph AtlasItems.
     */
    public BitmapFont(AtlasItem[] items, int kerning) {
        initGlyphs(items, kerning);
    }

    /**
     * Constructs BitmapFont by looking up glyphs starting with the given prefix
     * from GameEngine.instance (e.g. "font").
     * Decompiled from: C0211h(String, int)
     */
    public BitmapFont(String prefix, int kerning) {
        if (GameEngine.instance != null) {
            initGlyphs(GameEngine.instance.getItems(prefix), kerning);
        } else {
            this.kerning = kerning;
        }
    }

    private void initGlyphs(AtlasItem[] items, int kerning) {
        if (items != null) {
            for (AtlasItem item : items) {
                if (item != null) {
                    try {
                        String[] parts = item.name.split("_");
                        if (parts.length > 1) {
                            int asciiCode = Integer.parseInt(parts[1]);
                            if (asciiCode >= 0 && asciiCode < 256) {
                                this.glyphs[asciiCode] = item;
                                this.glyphWidths[asciiCode] = item.width;
                                if (item.height > this.maxGlyphHeight) {
                                    this.maxGlyphHeight = item.height;
                                }
                                Log.i("FlappyBird", "Number: " + item.name + " " + asciiCode);
                            }
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        // Set space ' ' (ASCII 32) width equal to '0' (ASCII 48) width (from C0211h line 54)
        this.glyphWidths[32] = this.glyphWidths[48];
        this.kerning = kerning;
    }

    /**
     * Formats an integer value into the text buffer.
     * Decompiled from: C0211h.m861a(int, int)
     *
     * @param value     The integer value to format.
     * @param maxDigits Maximum number of digit extraction steps.
     */
    public void formatNumber(int value, int maxDigits) {
        this.textLength = 0;
        int temp = value;
        while (maxDigits > 0) {
            if (temp > 0) {
                int digit = temp % 10;
                temp /= 10;
                this.reversedBuffer[this.textLength] = DIGITS.charAt(digit);
                this.textLength++;
            }
            maxDigits--;
        }
        for (int i = 0; i < this.textLength; i++) {
            this.buffer[i] = this.reversedBuffer[(this.textLength - i) - 1];
        }
        if (this.textLength == 0) {
            this.buffer[0] = '0';
            this.textLength = 1;
        }
    }

    /**
     * Sets the rendering position, alignment flags, and alpha.
     * Decompiled from: C0211h.m862a(int, int, int, float)
     */
    public void setPosition(int x, int y, int alignFlags, float alpha) {
        this.posX = x;
        this.posY = y;
        this.alignFlags = alignFlags;
        this.alpha = alpha;
    }

    /**
     * Renders the text buffer using the given GameEngine.
     * Decompiled from: C0211h.m863a(C0210g)
     */
    public void render(GameEngine engine) {
        int len = this.textLength;
        int totalWidth = 0;
        for (int i = 0; i < len; i++) {
            totalWidth = (totalWidth + this.glyphWidths[this.buffer[i]]) - this.kerning;
        }
        int adjustedWidth = totalWidth + 2;
        int height = this.maxGlyphHeight;

        int renderX = this.posX;
        int renderY = this.posY;

        // Horizontal alignment (bit 2 = center, bit 1 = right)
        if ((this.alignFlags & ALIGN_CENTER_HORIZONTAL) != 0) {
            renderX -= adjustedWidth / 2;
        } else if ((this.alignFlags & ALIGN_RIGHT) != 0) {
            renderX -= adjustedWidth;
        }

        // Vertical alignment (bit 4 = center, bit 8 = bottom)
        if ((this.alignFlags & ALIGN_CENTER_VERTICAL) != 0) {
            renderY -= height / 2;
        } else if ((this.alignFlags & ALIGN_BOTTOM) != 0) {
            renderY -= height;
        }

        for (int i = 0; i < len; i++) {
            char c = this.buffer[i];
            if (this.glyphs[c] != null && engine != null) {
                engine.draw(this.glyphs[c], renderX, renderY, this.alpha);
            }
            renderX = (renderX + this.glyphWidths[c]) - this.kerning;
        }
    }
}
