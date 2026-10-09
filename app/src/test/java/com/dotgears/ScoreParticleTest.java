package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ScoreParticleTest {

    private static class RecordingEngine extends GameEngine {
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

        List<DrawCall> drawCalls = new ArrayList<>();

        @Override
        public void draw(int spriteId, int x, int y, float scaleX, float scaleY, float alpha) {
            drawCalls.add(new DrawCall(spriteId, x, y));
        }
    }

    private RecordingEngine engine;
    private AtlasItem[] mockSprites;

    @Before
    public void setUp() {
        engine = new RecordingEngine();
        GameEngine.instance = engine;

        // 11 sprites: 0..9 digits and 10 '+' sign
        mockSprites = new AtlasItem[11];
        for (int i = 0; i < 10; i++) {
            mockSprites[i] = new AtlasItem("number_context_0" + i, 12, 14, 0f, 0f, 0.1f, 0.1f);
        }
        mockSprites[10] = new AtlasItem("number_context_10", 12, 14, 0f, 0f, 0.1f, 0.1f);

        for (AtlasItem item : mockSprites) {
            engine.atlasItems[item.id] = item;
        }
    }

    @Test
    public void testInitialState() {
        ScoreParticle particle = new ScoreParticle(mockSprites);
        assertEquals(12, particle.charWidth);
        assertEquals(14, particle.charHeight);
        assertFalse(particle.active);
        assertFalse(particle.visible);
    }

    @Test
    public void testResetAndPhysicsLifecycle() {
        ScoreParticle particle = new ScoreParticle(mockSprites);
        particle.reset(100, 200, 1, true, 5, -2, 1);

        assertEquals(100, particle.x);
        assertEquals(200, particle.y);
        assertEquals(1, particle.scoreValue);
        assertTrue(particle.hasSign);
        assertEquals(5, particle.lifespan);
        assertEquals(-2, particle.velocityY);
        assertEquals(1, particle.gravity);
        assertEquals(0, particle.subTickCounter);
        assertTrue(particle.active);
        assertTrue(particle.visible);

        // Frame 1
        particle.update(0.016f);
        assertEquals(198, particle.y);
        assertEquals(1, particle.subTickCounter);
        assertEquals(4, particle.lifespan);

        // Frame 2
        particle.update(0.016f);
        assertEquals(196, particle.y);
        assertEquals(2, particle.subTickCounter);
        assertEquals(3, particle.lifespan);

        // Frame 3
        particle.update(0.016f);
        assertEquals(194, particle.y);
        assertEquals(3, particle.subTickCounter);
        assertEquals(2, particle.lifespan);

        // Frame 4: 4th sub-tick applies gravity (-2 + 1 = -1 velocityY)
        particle.update(0.016f);
        assertEquals(192, particle.y);
        assertEquals(0, particle.subTickCounter);
        assertEquals(-1, particle.velocityY);
        assertEquals(1, particle.lifespan);

        // Frame 5: lifespan reaches 0 -> deactivated
        particle.update(0.016f);
        assertEquals(191, particle.y);
        assertEquals(0, particle.lifespan);
        assertFalse(particle.active);
        assertFalse(particle.visible);
    }

    @Test
    public void testRenderWithSignAndSingleDigit() {
        ScoreParticle particle = new ScoreParticle(mockSprites);
        // x=100, y=150, value=5, hasSign=true, lifespan=10
        particle.reset(100, 150, 5, true, 10, -1, 0);

        particle.render(engine);

        // Expect 2 draw calls: 1st '+' sign at x=100, 2nd digit '5' at rightX - charWidth
        // rightX = x + offsetX = 100 + 12 = 112. curX = 112 - 12 = 100
        assertEquals(2, engine.drawCalls.size());

        // '+' sprite (index 10)
        assertEquals(mockSprites[10].id, engine.drawCalls.get(0).spriteId);
        assertEquals(100, engine.drawCalls.get(0).x);
        assertEquals(150, engine.drawCalls.get(0).y);

        // '5' sprite (index 5)
        assertEquals(mockSprites[5].id, engine.drawCalls.get(1).spriteId);
        assertEquals(100, engine.drawCalls.get(1).x);
        assertEquals(150, engine.drawCalls.get(1).y);
    }

    @Test
    public void testRenderMultiDigitWithNarrowOneKerning() {
        ScoreParticle particle = new ScoreParticle(mockSprites);
        // value=21, hasSign=false
        particle.reset(100, 150, 21, false, 10, 0, 0);
        particle.digitCount = 2;
        particle.offsetX = 24; // allocate space for 2 digits

        particle.render(engine);

        // Expect 2 draw calls for '1' and then '2'
        assertEquals(2, engine.drawCalls.size());

        // First drawn: lowest digit '1' at curX = (100 + 24) - 12 = 112
        RecordingEngine.DrawCall call1 = engine.drawCalls.get(0);
        assertEquals(mockSprites[1].id, call1.spriteId);
        assertEquals(112, call1.x);

        // Since digit was '1', kerning subtracts 4 pixels: curX = 112 - 4 = 108
        RecordingEngine.DrawCall call2 = engine.drawCalls.get(1);
        assertEquals(mockSprites[2].id, call2.spriteId);
        assertEquals(108, call2.x);
    }

    @Test
    public void testInvisibleParticleProducesNoDrawCalls() {
        ScoreParticle particle = new ScoreParticle(mockSprites);
        particle.visible = false;
        particle.render(engine);
        assertEquals(0, engine.drawCalls.size());
    }
}
