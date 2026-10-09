package com.dotgears.flappy;

import com.dotgears.AtlasItem;
import com.dotgears.GameEngine;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BirdTest {

    private static class RecordingEngine extends GameEngine {
        static class BirdDrawCall {
            AtlasItem item;
            int x;
            int y;
            float alpha;
            int angle;

            BirdDrawCall(AtlasItem item, int x, int y, float alpha, int angle) {
                this.item = item;
                this.x = x;
                this.y = y;
                this.alpha = alpha;
                this.angle = angle;
            }
        }

        List<BirdDrawCall> birdDrawCalls = new ArrayList<>();
        List<int[]> postedEvents = new ArrayList<>();

        @Override
        public void draw(AtlasItem item, int x, int y, float alpha, int angle) {
            birdDrawCalls.add(new BirdDrawCall(item, x, y, alpha, angle));
            super.draw(item, x, y, alpha, angle);
        }

        @Override
        public void postEvent(int eventType, com.dotgears.GameObject target, int delay) {
            postedEvents.add(new int[]{eventType, delay});
            super.postEvent(eventType, target, delay);
        }
    }

    private RecordingEngine engine;
    private AtlasItem[] birdFrames;

    @Before
    public void setUp() {
        engine = new RecordingEngine();
        GameEngine.instance = engine;

        // 9 frames: 3 for yellow (0), 3 for blue (1), 3 for red (2)
        birdFrames = new AtlasItem[9];
        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 3; f++) {
                int idx = (c * 3) + f;
                birdFrames[idx] = new AtlasItem("bird" + c + "_" + f, 48, 48, 0f, 0f, 0.05f, 0.05f);
                engine.atlasItems[birdFrames[idx].id] = birdFrames[idx];
            }
        }
    }

    @Test
    public void testInitialStateAndReset() {
        Bird bird = new Bird(birdFrames);
        bird.reset();

        assertEquals(Bird.INITIAL_X, bird.x);
        assertEquals(Bird.INITIAL_Y, bird.y);
        assertEquals(Bird.COLLIDER_WIDTH, bird.colliderWidth);
        assertEquals(Bird.COLLIDER_HEIGHT, bird.colliderHeight);
        assertEquals(Bird.ORIGIN_OFFSET_X, bird.originX);
        assertEquals(Bird.ORIGIN_OFFSET_Y, bird.originY);
        assertEquals(0.0f, bird.angle, 0.001f);
        assertEquals(0.0f, bird.velocityY, 0.001f);
        assertEquals(1.0f, bird.gravity, 0.001f);
        assertFalse(bird.dead);
        assertTrue(bird.hovering);
        assertEquals(0, bird.hoverAngle);
        assertTrue(bird.colorIndex >= 0 && bird.colorIndex < 3);
    }

    @Test
    public void testHoverWaveMotion() {
        Bird bird = new Bird(birdFrames);
        bird.reset();

        // Frame 1: angle steps by 8 degrees
        bird.update(0.016f);
        assertEquals(8, bird.hoverAngle);
        assertEquals(Bird.INITIAL_Y, bird.y); // base Y is unaffected
        assertTrue(bird.hoverOffsetY != 0f);

        // Advance 44 more frames (45 frames total = 360 degrees) -> wraps to 0
        for (int i = 1; i < 45; i++) {
            bird.update(0.016f);
        }
        assertEquals(0, bird.hoverAngle);
        assertEquals(0.0f, bird.hoverOffsetY, 0.001f);
    }

    @Test
    public void testFlapImpulseAndFirstTick() {
        Bird bird = new Bird(birdFrames);
        bird.reset();

        bird.flap();

        assertFalse(bird.hovering);
        assertEquals(Bird.FLAP_IMPULSE, bird.velocityY, 0.001f); // -5.0f
        assertEquals(Bird.GRAVITY_ACCEL, bird.gravity, 0.001f);  // 0.3f
        assertEquals(Bird.ROTATION_IMPULSE, bird.angularVelocity, 0.001f); // -10.0f
        assertEquals(Bird.ROTATION_ACCEL, bird.angularAcceleration, 0.001f); // 0.4f

        // Verifies sound event 4 was dispatched
        assertEquals(1, engine.postedEvents.size());
        assertEquals(4, engine.postedEvents.get(0)[0]);

        // Tick 1
        bird.update(0.016f);
        // velocityY becomes -5.0 + 0.3 = -4.7f
        assertEquals(-4.7f, bird.velocityY, 0.001f);
        // y becomes (int)(246.0f + -4.7f) = (int)(241.3f) = 241
        assertEquals(241, bird.y);
        // angle becomes 0.0 + (-10.0) = -10.0f
        assertEquals(-10.0f, bird.angle, 0.001f);
        // angularVelocity becomes -10.0 + 0.4 = -9.6f
        assertEquals(-9.6f, bird.angularVelocity, 0.001f);
    }

    @Test
    public void testAngleClamping() {
        Bird bird = new Bird(birdFrames);
        bird.reset();
        bird.flap();

        // Repeated flaps or upward rotation must clamp at -20.0f
        bird.angularVelocity = -30.0f;
        bird.update(0.016f);
        assertEquals(Bird.MIN_ANGLE, bird.angle, 0.001f); // -20.0f

        // Free falling tilts down up to 90.0f
        bird.angularVelocity = 50.0f;
        bird.update(0.016f);
        bird.angularVelocity = 80.0f;
        bird.update(0.016f);
        assertEquals(Bird.MAX_ANGLE, bird.angle, 0.001f); // 90.0f
    }

    @Test
    public void testTerminalFallSpeedAndGroundCollision() {
        Bird bird = new Bird(birdFrames);
        bird.reset();
        bird.y = 0; // high above canvas to allow reaching terminal speed before ground impact
        bird.hovering = false;
        bird.gravity = Bird.GRAVITY_ACCEL;

        // Fall freely for 30 frames: velocity reaches and clamps at 8.0f
        for (int i = 0; i < 30; i++) {
            bird.update(0.016f);
        }
        assertEquals(Bird.MAX_FALL_SPEED, bird.velocityY, 0.001f);

        // Continue falling until hitting ground: y must clamp at 400 - colliderHeight = 380
        for (int i = 0; i < 50; i++) {
            bird.update(0.016f);
        }

        assertEquals(380, bird.y);
        assertEquals(0.0f, bird.velocityY, 0.001f);
        assertEquals(0.0f, bird.gravity, 0.001f);
    }

    @Test
    public void testCannotFlapWhenDeadOrNegativeY() {
        Bird bird = new Bird(birdFrames);
        bird.reset();
        bird.dead = true;

        bird.flap();
        assertEquals(0.0f, bird.velocityY, 0.001f); // ignored

        bird.dead = false;
        bird.y = -5; // above ceiling
        bird.flap();
        assertEquals(0.0f, bird.velocityY, 0.001f); // ignored
    }

    @Test
    public void testRenderColorIndexingAndRotation() {
        Bird bird = new Bird(birdFrames);
        bird.reset();
        bird.colorIndex = 1; // Blue bird (frames index 3..5)
        bird.angle = 15.0f;

        engine.birdDrawCalls.clear();
        bird.render(engine);

        assertEquals(1, engine.birdDrawCalls.size());
        RecordingEngine.BirdDrawCall call = engine.birdDrawCalls.get(0);

        // Sprite corresponds to blue bird frame
        assertTrue(call.item.name.startsWith("bird1_"));
        // Draw coordinates: (x - 14, y - 14 + (int)hoverOffsetY)
        assertEquals(Bird.INITIAL_X - 14, call.x);
        assertEquals(15, call.angle);
    }
}
