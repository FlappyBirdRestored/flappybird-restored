package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ButtonTest {

    private static class TestGameEngine extends GameEngine {
        int lastDrawnSpriteId = -1;
        int lastDrawnX = -1;
        int lastDrawnY = -1;
        float lastDrawnScaleX = 0f;
        float lastDrawnScaleY = 0f;
        float lastDrawnAlpha = 0f;

        @Override
        public void draw(int spriteId, int x, int y, float scaleX, float scaleY, float alpha) {
            this.lastDrawnSpriteId = spriteId;
            this.lastDrawnX = x;
            this.lastDrawnY = y;
            this.lastDrawnScaleX = scaleX;
            this.lastDrawnScaleY = scaleY;
            this.lastDrawnAlpha = alpha;
        }
    }

    private TestGameEngine testEngine;

    @Before
    public void setUp() {
        testEngine = new TestGameEngine();
        GameEngine.instance = testEngine;
    }

    @Test
    public void testSetPositionAndResetFlags() {
        Button button = new Button();
        button.isPressed = true;
        button.justPressed = true;
        button.justReleased = true;
        button.isHovered = true;

        button.setPosition(100, 200);

        assertEquals(100, button.x);
        assertEquals(200, button.y);
        assertTrue(button.active);
        assertTrue(button.visible);
        assertFalse(button.isPressed);
        assertFalse(button.justPressed);
        assertFalse(button.justReleased);
        assertFalse(button.isHovered);

        // Test set(x, y) alias
        button.set(50, 60);
        assertEquals(50, button.x);
        assertEquals(60, button.y);
    }

    @Test
    public void testInitButtonWithAtlasItem() {
        Button button = new Button();
        AtlasItem item = new AtlasItem("button_play", 52, 29, 0f, 0f, 0.5f, 0.5f);

        button.initButton(item);

        assertSame(item, button.sprite);
        assertEquals(52, button.width);
        assertEquals(29, button.height);
    }

    @Test
    public void testButtonPressAndReleaseLifecycle() {
        Button button = new Button();
        button.setPosition(50, 50);
        button.width = 40;
        button.height = 20;

        // Initially no touches
        testEngine.touchCount = 0;
        button.update(0.016f);
        assertFalse(button.isHovered);
        assertFalse(button.isPressed);
        assertFalse(button.justPressed);
        assertFalse(button.justReleased);

        // Frame 1: Finger touches inside button bounds (x: 50..90, y: 50..70)
        testEngine.touchCount = 1;
        testEngine.touchX[0] = 60;
        testEngine.touchY[0] = 60;

        button.update(0.016f);
        assertTrue(button.isHovered);
        assertTrue(button.isPressed);
        assertTrue(button.justPressed);
        assertFalse(button.justReleased);

        // Frame 2: Finger continues holding down
        button.update(0.016f);
        assertTrue(button.isHovered);
        assertTrue(button.isPressed);
        assertFalse("justPressed must be a one-frame pulse", button.justPressed);
        assertFalse(button.justReleased);

        // Frame 3: Finger releases
        testEngine.touchCount = 0;
        button.update(0.016f);
        assertFalse(button.isHovered);
        assertFalse(button.isPressed);
        assertFalse(button.justPressed);
        assertTrue("justReleased must trigger on release", button.justReleased);

        // Frame 4: Next frame idle
        button.update(0.016f);
        assertFalse(button.isHovered);
        assertFalse(button.isPressed);
        assertFalse(button.justPressed);
        assertFalse("justReleased must be a one-frame pulse", button.justReleased);
    }

    @Test
    public void testStrictBoundaryHitTesting() {
        Button button = new Button();
        button.setPosition(50, 50);
        button.width = 40;
        button.height = 20;

        testEngine.touchCount = 1;

        // Exact boundary edges (should NOT register hit due to strict > and <)
        // Left edge: x = 50
        testEngine.touchX[0] = 50;
        testEngine.touchY[0] = 60;
        button.update(0.016f);
        assertFalse(button.isHovered);

        // Right edge: x = 50 + 40 = 90
        testEngine.touchX[0] = 90;
        testEngine.touchY[0] = 60;
        button.update(0.016f);
        assertFalse(button.isHovered);

        // Top edge: y = 50
        testEngine.touchX[0] = 60;
        testEngine.touchY[0] = 50;
        button.update(0.016f);
        assertFalse(button.isHovered);

        // Bottom edge: y = 50 + 20 = 70
        testEngine.touchX[0] = 60;
        testEngine.touchY[0] = 70;
        button.update(0.016f);
        assertFalse(button.isHovered);

        // Just inside boundaries: (51, 51) and (89, 69)
        testEngine.touchX[0] = 51;
        testEngine.touchY[0] = 51;
        button.update(0.016f);
        assertTrue(button.isHovered);

        button.setPosition(50, 50);
        button.width = 40;
        button.height = 20;
        testEngine.touchX[0] = 89;
        testEngine.touchY[0] = 69;
        button.update(0.016f);
        assertTrue(button.isHovered);
    }

    @Test
    public void testMultiTouchFirstOutsideSecondInside() {
        Button button = new Button();
        button.setPosition(100, 100);
        button.width = 50;
        button.height = 30;

        // 2 touches: 1st outside, 2nd inside
        testEngine.touchCount = 2;
        testEngine.touchX[0] = 10;
        testEngine.touchY[0] = 10;
        testEngine.touchX[1] = 120;
        testEngine.touchY[1] = 110;

        button.update(0.016f);
        assertTrue(button.isHovered);
        assertTrue(button.isPressed);
        assertTrue(button.justPressed);
    }

    @Test
    public void testRenderPressOffsetVisualParity() {
        Button button = new Button();
        AtlasItem item = new AtlasItem("button_play", 52, 29, 0f, 0f, 0.5f, 0.5f);
        button.initButton(item);
        button.setPosition(100, 200);

        // When not pressed: rendered at (x, y)
        button.isPressed = false;
        button.render(testEngine);
        assertEquals(item.id, testEngine.lastDrawnSpriteId);
        assertEquals(100, testEngine.lastDrawnX);
        assertEquals(200, testEngine.lastDrawnY);

        // When pressed: rendered at (x, y + 2) for tactile feedback
        button.isPressed = true;
        button.render(testEngine);
        assertEquals(item.id, testEngine.lastDrawnSpriteId);
        assertEquals(100, testEngine.lastDrawnX);
        assertEquals(202, testEngine.lastDrawnY);
    }
}
