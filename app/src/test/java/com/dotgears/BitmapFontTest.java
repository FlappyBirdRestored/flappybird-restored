package com.dotgears;

import com.dotgears.flappy.FlappyFont;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BitmapFontTest {

    private AtlasItem[] fontGlyphs;
    private TestEngine testEngine;

    static class TestEngine extends GameEngine {
        static class DrawCall {
            AtlasItem item;
            int x;
            int y;
            float alpha;

            DrawCall(AtlasItem item, int x, int y, float alpha) {
                this.item = item;
                this.x = x;
                this.y = y;
                this.alpha = alpha;
            }
        }

        List<DrawCall> calls = new ArrayList<>();

        @Override
        public void draw(AtlasItem item, int x, int y, float alpha) {
            calls.add(new DrawCall(item, x, y, alpha));
        }
    }

    @Before
    public void setUp() {
        AtlasItem.resetIdCounter();
        fontGlyphs = new AtlasItem[10];
        // Create glyphs font_048 to font_057 (matching atlas.txt)
        for (int i = 0; i < 10; i++) {
            int ascii = 48 + i;
            fontGlyphs[i] = new AtlasItem("font_0" + ascii, 24, 44, 0.1f * i, 0.2f, 0.05f, 0.05f);
        }
        testEngine = new TestEngine();
    }

    @Test
    public void testFormatNumberZero() {
        BitmapFont font = new BitmapFont(fontGlyphs, 4);
        font.formatNumber(0, 20);

        assertEquals(1, font.textLength);
        assertEquals('0', font.buffer[0]);
    }

    @Test
    public void testFormatNumberMultiDigit() {
        BitmapFont font = new BitmapFont(fontGlyphs, 4);
        font.formatNumber(123, 20);

        assertEquals(3, font.textLength);
        assertEquals('1', font.buffer[0]);
        assertEquals('2', font.buffer[1]);
        assertEquals('3', font.buffer[2]);
    }

    @Test
    public void testSpaceGlyphInheritsZeroWidth() {
        BitmapFont font = new BitmapFont(fontGlyphs, 4);
        // Space (ASCII 32) should match width of '0' (ASCII 48) = 24
        assertEquals(24, font.glyphWidths[32]);
    }

    @Test
    public void testRenderHorizontalCenterAlignment() {
        BitmapFont font = new BitmapFont(fontGlyphs, 4);
        font.formatNumber(10, 20); // 2 characters ('1', '0')
        // Width calculation:
        // char 1: width 24 - kerning 4 = 20
        // char 2: width 24 - kerning 4 = 20
        // totalWidth = 40, adjustedWidth = 40 + 2 = 42.
        // Center offset: 42 / 2 = 21.
        // If posX = 100, rendered first char X should be 100 - 21 = 79.

        font.setPosition(100, 200, BitmapFont.ALIGN_CENTER_HORIZONTAL, 1.0f);
        font.render(testEngine);

        assertEquals(2, testEngine.calls.size());
        assertEquals(79, testEngine.calls.get(0).x);
        assertEquals(200, testEngine.calls.get(0).y);

        // Next character position = 79 + 24 - 4 = 99
        assertEquals(99, testEngine.calls.get(1).x);
    }

    @Test
    public void testFlappyFontSubclass() {
        FlappyFont flappyFont = new FlappyFont();
        assertEquals(4, flappyFont.kerning);
        assertEquals(0.0f, flappyFont.scale, 0.0001f);
    }
}
