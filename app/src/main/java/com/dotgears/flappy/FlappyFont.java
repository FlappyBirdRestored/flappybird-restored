package com.dotgears.flappy;

import com.dotgears.BitmapFont;

/**
 * FlappyFont - Reverse-engineered 1:1 recreation of com.dotgears.flappy.C0205b.
 * Specialized BitmapFont subclass using the "font_" atlas prefix and kerning 4.
 */
public class FlappyFont extends BitmapFont {

    /** Font scale / animation progress (decompiled from f536m). */
    public float scale;

    public FlappyFont() {
        super("font", 4);
        this.scale = 0.0f;
    }
}
