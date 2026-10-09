package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NumberRendererTest {

    private AtlasItem[] testDigits;
    private TestEngine testEngine;

    // Subclass GameEngine to capture draw calls
    static class TestEngine extends GameEngine {
        static class DrawCall {
            int spriteId;
            int x;
            int y;

            DrawCall(int spriteId, int x, int y) {
                this.spriteId = spriteId;
                this.x = x;
                this.y = y;
            }
        }

        List<DrawCall> calls = new ArrayList<>();

        @Override
        public void draw(int spriteId, int x, int y, float scaleX, float scaleY, float alpha) {
            calls.add(new DrawCall(spriteId, x, y));
        }
    }

    @Before
    public void setUp() {
        AtlasItem.resetIdCounter();
        testDigits = new AtlasItem[10];
        for (int i = 0; i < 10; i++) {
            // Each test digit has width 16, height 20
            testDigits[i] = new AtlasItem("number_score_0" + i, 16, 20, 0.1f * i, 0.5f, 0.05f, 0.1f);
        }
        testEngine = new TestEngine();
    }

    @Test
    public void testDimensions() {
        NumberRenderer renderer = new NumberRenderer(testDigits);
        assertEquals(16, renderer.charWidth);
        assertEquals(20, renderer.charHeight);
    }

    @Test
    public void testRenderNumberWithoutLeadingZeros() {
        NumberRenderer renderer = new NumberRenderer(testDigits);

        // Render 42 at rightX = 100, y = 50, leadingZeros = false, maxDigits = 5
        renderer.render(testEngine, 42, 100, 50, false, 5);

        // Expect exactly 2 draw calls: '2' followed by '4'
        assertEquals(2, testEngine.calls.size());

        // First call: least significant digit '2' at x = 100 - 16 = 84
        assertEquals(2, testEngine.calls.get(0).spriteId);
        assertEquals(84, testEngine.calls.get(0).x);
        assertEquals(50, testEngine.calls.get(0).y);

        // Second call: most significant digit '4' at x = 84 - 16 = 68
        assertEquals(4, testEngine.calls.get(1).spriteId);
        assertEquals(68, testEngine.calls.get(1).x);
        assertEquals(50, testEngine.calls.get(1).y);
    }

    @Test
    public void testRenderZeroAlwaysRendersOneDigit() {
        NumberRenderer renderer = new NumberRenderer(testDigits);

        // Render 0 with maxDigits = 4, leadingZeros = false
        renderer.render(testEngine, 0, 100, 50, false, 4);

        assertEquals(1, testEngine.calls.size());
        assertEquals(0, testEngine.calls.get(0).spriteId);
        assertEquals(84, testEngine.calls.get(0).x);
    }

    @Test
    public void testRenderWithLeadingZeros() {
        NumberRenderer renderer = new NumberRenderer(testDigits);

        // Render 7 with maxDigits = 3, leadingZeros = true -> "007"
        renderer.render(testEngine, 7, 100, 50, true, 3);

        assertEquals(3, testEngine.calls.size());
        // Digit 7 at 84
        assertEquals(7, testEngine.calls.get(0).spriteId);
        assertEquals(84, testEngine.calls.get(0).x);

        // Digit 0 at 68
        assertEquals(0, testEngine.calls.get(1).spriteId);
        assertEquals(68, testEngine.calls.get(1).x);

        // Digit 0 at 52
        assertEquals(0, testEngine.calls.get(2).spriteId);
        assertEquals(52, testEngine.calls.get(2).x);
    }
}
