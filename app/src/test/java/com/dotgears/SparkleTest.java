package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SparkleTest {

    private static class RecordingGameEngine extends GameEngine {
        int drawCallCount = 0;
        int lastSpriteId = -1;
        int lastX = -1;
        int lastY = -1;
        float lastAlpha = 0f;

        @Override
        public void draw(int spriteId, int x, int y, float scaleX, float scaleY, float alpha) {
            this.drawCallCount++;
            this.lastSpriteId = spriteId;
            this.lastX = x;
            this.lastY = y;
            this.lastAlpha = alpha;
        }
    }

    private RecordingGameEngine engine;
    private AtlasItem[] testFrames;

    @Before
    public void setUp() {
        engine = new RecordingGameEngine();
        GameEngine.instance = engine;

        testFrames = new AtlasItem[]{
                new AtlasItem("blink_00", 10, 10, 0f, 0f, 0.1f, 0.1f),
                new AtlasItem("blink_01", 10, 10, 0f, 0.1f, 0.1f, 0.2f),
                new AtlasItem("blink_02", 10, 10, 0f, 0.2f, 0.1f, 0.3f)
        };
    }

    @Test
    public void testSparkleInitialState() {
        Sparkle sparkle = new Sparkle(testFrames);

        // Bounding box and origin offset
        assertEquals(Sparkle.COLLIDER_WIDTH, sparkle.colliderWidth);
        assertEquals(Sparkle.COLLIDER_HEIGHT, sparkle.colliderHeight);
        assertEquals(Sparkle.ORIGIN_X, sparkle.originX);
        assertEquals(Sparkle.ORIGIN_Y, sparkle.originY);

        // Initially inactive and invisible until reset() / spawned
        assertFalse(sparkle.animating);
        assertFalse(sparkle.visible);

        assertNotNull(sparkle.currentAnimation);
        assertEquals("blink", sparkle.currentAnimation.name);
        assertEquals(5, sparkle.currentAnimation.frameCount);
        assertFalse(sparkle.currentAnimation.loop);
    }

    @Test
    public void testActivationViaResetAndSet() {
        Sparkle sparkle = new Sparkle(testFrames);

        sparkle.reset(50, 75);
        assertEquals(50, sparkle.x);
        assertEquals(75, sparkle.y);
        assertTrue(sparkle.animating);
        assertTrue(sparkle.visible);
        assertFalse(sparkle.currentAnimation.finished);
        assertEquals(0, sparkle.currentAnimation.currentFrame);

        // Set alias
        sparkle.set(100, 150);
        assertEquals(100, sparkle.x);
        assertEquals(150, sparkle.y);
        assertTrue(sparkle.animating);
        assertTrue(sparkle.visible);
    }

    @Test
    public void testCompleteAnimationLifecycleAndAutoDeactivation() {
        Sparkle sparkle = new Sparkle(testFrames);
        sparkle.reset(100, 200);

        assertTrue(sparkle.animating);
        assertTrue(sparkle.visible);

        // 10 FPS = 100ms per frame. Each update adds 15ms.
        // It takes 7 ticks (7 * 15 = 105ms >= 100ms) to advance to the next frame.
        // Frame sequence is [0, 1, 2, 1, 0] (5 frames total).
        // Let's step through and assert progression.

        // Initial frame: sequence index 0 -> sprite frame 0
        assertEquals(0, sparkle.currentAnimation.currentFrame);

        // Advance 7 ticks to reach sequence index 1 -> sprite frame 1
        for (int i = 0; i < 7; i++) {
            sparkle.update(0.016f);
        }
        assertEquals(1, sparkle.currentAnimation.currentFrame);
        assertTrue(sparkle.animating);
        assertTrue(sparkle.visible);

        // Advance 7 ticks to reach sequence index 2 -> sprite frame 2
        for (int i = 0; i < 7; i++) {
            sparkle.update(0.016f);
        }
        assertEquals(2, sparkle.currentAnimation.currentFrame);
        assertTrue(sparkle.animating);
        assertTrue(sparkle.visible);

        // Advance 7 ticks to reach sequence index 3 -> sprite frame 1
        for (int i = 0; i < 7; i++) {
            sparkle.update(0.016f);
        }
        assertEquals(1, sparkle.currentAnimation.currentFrame);
        assertTrue(sparkle.animating);
        assertTrue(sparkle.visible);

        // Advance 7 ticks to reach sequence index 4 -> sprite frame 0
        for (int i = 0; i < 7; i++) {
            sparkle.update(0.016f);
        }
        assertEquals(0, sparkle.currentAnimation.currentFrame);
        assertTrue(sparkle.animating);
        assertTrue(sparkle.visible);

        // Advance 7 more ticks: sequence completes!
        for (int i = 0; i < 7; i++) {
            sparkle.update(0.016f);
        }

        // Must auto-deactivate
        assertTrue(sparkle.currentAnimation.finished);
        assertFalse(sparkle.animating);
        assertFalse(sparkle.visible);
    }

    @Test
    public void testRenderOnlyWhenVisibleWithOriginOffset() {
        Sparkle sparkle = new Sparkle(testFrames);
        sparkle.x = 80;
        sparkle.y = 120;

        // When invisible, render() does nothing
        sparkle.visible = false;
        sparkle.render(engine);
        assertEquals(0, engine.drawCallCount);

        // When activated/visible, render() draws at (x - originX, y - originY)
        sparkle.reset(80, 120); // originX = 4, originY = 4 -> draws at (76, 116)
        sparkle.render(engine);
        assertEquals(1, engine.drawCallCount);
        assertEquals(testFrames[0].id, engine.lastSpriteId);
        assertEquals(76, engine.lastX);
        assertEquals(116, engine.lastY);
        assertEquals(1.0f, engine.lastAlpha, 0.001f);
    }
}
