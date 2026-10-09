package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ActorTest {

    private AtlasItem[] testFrames;
    private TestEngine testEngine;

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
        testFrames = new AtlasItem[3];
        testFrames[0] = new AtlasItem("bird0_0", 48, 48, 0.0f, 0.9f, 0.04f, 0.04f);
        testFrames[1] = new AtlasItem("bird0_1", 48, 48, 0.05f, 0.9f, 0.04f, 0.04f);
        testFrames[2] = new AtlasItem("bird0_2", 48, 48, 0.1f, 0.9f, 0.04f, 0.04f);
        testEngine = new TestEngine();
    }

    @Test
    public void testSpriteAnimationPlayback() {
        int[] seq = {0, 1, 2};
        // 3 frames, 30 FPS -> frameDuration = 1000/30 = 33.3ms
        SpriteAnimation anim = new SpriteAnimation(0, "flap", seq, 3, 30, true);
        anim.reset();

        assertEquals(0, anim.currentFrame);
        assertFalse(anim.finished);

        // Tick 1: timer = 15ms (< 33.3ms) -> still frame 0
        anim.update(0.016f);
        assertEquals(0, anim.currentFrame);

        // Tick 2: timer = 30ms (< 33.3ms) -> still frame 0
        anim.update(0.016f);
        assertEquals(0, anim.currentFrame);

        // Tick 3: timer = 45ms (>= 33.3ms) -> advances to frame index 1 (frame '1')
        anim.update(0.016f);
        assertEquals(1, anim.currentFrame);
    }

    @Test
    public void testActorBoundsAndOriginCalculation() {
        Actor actor = new Actor();
        // Sprite is 48x48. Collider is 20x20. If offsets are 0, origin should be (48 - 20) >> 1 = 14
        actor.initActor(testFrames, 20, 20, 0, 0);

        assertEquals(20, actor.colliderWidth);
        assertEquals(20, actor.colliderHeight);
        assertEquals(14, actor.originX);
        assertEquals(14, actor.originY);
    }

    @Test
    public void testActorRenderOffset() {
        Actor actor = new Actor();
        actor.initActor(testFrames, 20, 20, 14, 14);
        actor.reset(80, 246);

        actor.render(testEngine);

        assertEquals(1, testEngine.calls.size());
        // Drawn at (x - originX, y - originY) = (80 - 14, 246 - 14) = (66, 232)
        assertEquals(66, testEngine.calls.get(0).x);
        assertEquals(232, testEngine.calls.get(0).y);
    }
}
