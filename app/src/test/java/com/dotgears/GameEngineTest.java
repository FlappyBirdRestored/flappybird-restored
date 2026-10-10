package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameEngineTest {

    private static class TestEngine extends GameEngine {
        List<int[]> receivedEvents = new ArrayList<>();
        boolean gameUpdated = false;
        float lastDt = 0f;

        @Override
        public void onEvent(int eventType, GameObject target) {
            receivedEvents.add(new int[]{eventType, target == this ? 1 : 0});
        }

        @Override
        public void updateGame(float dt) {
            this.gameUpdated = true;
            this.lastDt = dt;
        }
    }

    private TestEngine engine;

    @Before
    public void setUp() {
        AtlasItem.resetIdCounter();
        GameMath.instance = new GameMath();
        engine = new TestEngine();
        GameEngine.instance = engine;
    }

    @Test
    public void testInitializationAndDefaults() {
        assertNotNull(engine.fadeTween);
        assertNotNull(engine.flashTween);
        assertNotNull(engine.scoreParticles);
        assertEquals(20, engine.scoreParticles.size());
        assertNotNull(engine.sparkles);
        assertEquals(10, engine.sparkles.size());
        assertNotNull(engine.scoreRenderer);
        assertNotNull(engine.scoreBoard);
        assertEquals(0, engine.score);
        assertEquals(0, engine.highScore);
        assertFalse(engine.paused);
        assertEquals(0, engine.actionLogCount);
    }

    @Test
    public void testAtlasLoadingAndLookup() {
        String atlasContent =
                "bg_day 288 512 0.0 0.0 0.28125 0.5\n" +
                "bird0_0 48 48 0.0 0.9472656 0.046875 0.046875\n" +
                "bird0_1 48 48 0.0546875 0.9472656 0.046875 0.046875\n" +
                "black 32 32 0.5703125 0.40234375 0.03125 0.03125\n" +
                "white 32 32 0.5703125 0.4375 0.03125 0.03125\n";

        ByteArrayInputStream stream = new ByteArrayInputStream(atlasContent.getBytes(StandardCharsets.UTF_8));
        engine.loadAtlas(stream);

        AtlasItem bg = engine.getItem("bg_day");
        assertNotNull(bg);
        assertEquals(288, bg.width);
        assertEquals(512, bg.height);
        assertEquals(0.0f, bg.u1, 0.0001f);
        assertEquals(0.28125f, bg.u2, 0.0001f); // u1 + uWidth
        assertEquals(0.5f, bg.v2, 0.0001f);   // v1 + vHeight

        AtlasItem[] birds = engine.getItems("bird0_");
        assertNotNull(birds);
        assertEquals(2, birds.length);
        assertEquals("bird0_0", birds[0].name);
        assertEquals("bird0_1", birds[1].name);

        AtlasItem black = engine.getItem("black");
        assertNotNull(black);
        assertEquals(0.5703125f + 0.03125f, black.u2, 0.0001f);

        assertNull(engine.getItem("non_existent"));
        assertNull(engine.getItems("non_existent"));
    }

    @Test
    public void testSubmitScore() {
        engine.submitScore(5);
        assertEquals(5, engine.score);
        assertEquals(5, engine.highScore);
        assertEquals(1, engine.actionLogCount);
        assertEquals(0, engine.actionLogTypes[0]); // type 0 = score submit
        assertEquals(5.0, engine.actionLogValues[0], 0.001);

        // Lower score doesn't decrease highScore
        engine.submitScore(3);
        assertEquals(3, engine.score);
        assertEquals(5, engine.highScore);
        assertEquals(2, engine.actionLogCount);
    }

    @Test
    public void testDelayedEventQueue() {
        engine.postEvent(2, engine, 60); // 60ms delay
        assertEquals(1, engine.eventQueueHead);
        assertEquals(60, engine.eventDelays[0]);
        assertEquals(2, engine.eventTypes[0]);

        // First tick: remaining delay 60 - 30 = 30 (> 0, not fired)
        engine.updateAndRender();
        assertTrue(engine.gameUpdated);
        assertEquals(30, engine.eventDelays[0]);
        assertEquals(0, engine.receivedEvents.size());

        // Second tick: remaining delay 30 - 30 = 0 (<= 0, fires!)
        engine.updateAndRender();
        assertEquals(1, engine.receivedEvents.size());
        assertEquals(2, engine.receivedEvents.get(0)[0]);
        assertEquals(1, engine.receivedEvents.get(0)[1]); // target was this engine
    }

    @Test
    public void testEventQueueCircularHead() {
        for (int i = 0; i < 50; i++) {
            engine.postEvent(i, engine, 100);
        }
        assertEquals(0, engine.eventQueueHead); // Wrapped around to 0

        engine.clearEventQueue();
        assertEquals(0, engine.eventQueueHead);
        for (int i = 0; i < 50; i++) {
            assertEquals(0, engine.eventDelays[i]);
        }
    }

    @Test
    public void testPauseSuppressesDelayedEventsAndTweens() {
        engine.postEvent(7, engine, 30);
        engine.fade(true, 5, 0.5f);
        engine.startShake(4, 5);
        engine.paused = true;

        engine.updateAndRender();

        // Game update still called
        assertTrue(engine.gameUpdated);
        // But delay not decremented
        assertEquals(30, engine.eventDelays[0]);
        assertEquals(0, engine.receivedEvents.size());
        // Shake ticks not decremented
        assertEquals(5, engine.shakeDurationTicks);
        assertEquals(0, engine.shakeOffsetX);
        assertEquals(0, engine.shakeOffsetY);
    }

    @Test
    public void testScreenFadeTransition() {
        // Fade in: alpha 0.0 -> 1.0 (black screen fade)
        engine.fade(true, 9, 0.1f); // 0.1s = 6 ticks at 60 Hz
        assertFalse(engine.fadeTween.finished);
        assertEquals(9, engine.fadeTargetEvent);

        while (!engine.fadeTween.finished) {
            engine.updateAndRender();
        }

        assertTrue(engine.fadeTween.finished);
        assertEquals(1.0f, engine.fadeTween.value, 0.001f);
        // Completed fade must trigger event 9 on engine
        boolean foundFadeEvent = false;
        for (int[] ev : engine.receivedEvents) {
            if (ev[0] == 9 && ev[1] == 1) {
                foundFadeEvent = true;
                break;
            }
        }
        assertTrue("Fade completion event should have fired", foundFadeEvent);
    }

    @Test
    public void testScreenFlashTransition() {
        engine.flash(0.1f);
        assertFalse(engine.flashTween.finished);

        while (!engine.flashTween.finished) {
            engine.updateAndRender();
        }

        assertTrue(engine.flashTween.finished);
        assertEquals(0.0f, engine.flashTween.value, 0.001f);
    }

    @Test
    public void testScreenShakeDynamics() {
        engine.startShake(6, 3);
        assertEquals(6, engine.shakeIntensity);
        assertEquals(3, engine.shakeDurationTicks);

        // Tick 1
        engine.updateAndRender();
        assertEquals(2, engine.shakeDurationTicks);
        assertTrue(engine.shakeOffsetX >= -6 && engine.shakeOffsetX <= 6);
        assertTrue(engine.shakeOffsetY >= -6 && engine.shakeOffsetY <= 6);

        // Tick 2
        engine.updateAndRender();
        assertEquals(1, engine.shakeDurationTicks);

        // Tick 3
        engine.updateAndRender();
        assertEquals(0, engine.shakeDurationTicks);

        // Tick 4: shake duration is 0, offsets must be reset to 0
        engine.updateAndRender();
        assertEquals(0, engine.shakeOffsetX);
        assertEquals(0, engine.shakeOffsetY);
    }

    @Test
    public void testTouchDispatch() {
        float[] xCoords = new float[]{100f, 200f, -100f, -100f, -100f, -100f, -100f, -100f, -100f, -100f};
        float[] yCoords = new float[]{150f, 250f, -100f, -100f, -100f, -100f, -100f, -100f, -100f, -100f};

        engine.updateTouches(xCoords, yCoords);
        assertEquals(10, engine.touchCount);
        assertEquals(100, engine.touchX[0]);
        assertEquals(150, engine.touchY[0]);
        assertEquals(200, engine.touchX[1]);
        assertEquals(250, engine.touchY[1]);
        assertEquals(-100, engine.touchX[2]);
    }

    @Test
    public void testActionLoggingResetsPerTick() {
        engine.logAction(1, 100);
        engine.logAction(2, 200.5);
        assertEquals(2, engine.actionLogCount);
        assertEquals(1, engine.actionLogTypes[0]);
        assertEquals(100.0, engine.actionLogValues[0], 0.001);
        assertEquals(2, engine.actionLogTypes[1]);
        assertEquals(200.5, engine.actionLogValues[1], 0.001);

        // Calling updateAndRender resets actionLogCount to 0
        engine.updateAndRender();
        assertEquals(0, engine.actionLogCount);
    }

    @Test
    public void testRenderBridgeRouting() {
        final List<float[]> renderedQuads = new ArrayList<>();
        GameEngine.renderBridge = new GameEngine.RenderBridge() {
            @Override
            public void drawQuad(int x1, int y1, int x2, int y2, float u1, float v1, float u2, float v2, float alpha) {
                renderedQuads.add(new float[]{x1, y1, x2, y2, u1, v1, u2, v2, alpha, 0});
            }

            @Override
            public void drawQuad(int x1, int y1, int x2, int y2, float u1, float v1, float u2, float v2, float alpha, int angle) {
                renderedQuads.add(new float[]{x1, y1, x2, y2, u1, v1, u2, v2, alpha, angle});
            }
        };

        engine.draw(10, 20, 30, 40, 0.1f, 0.2f, 0.3f, 0.4f, 1.0f);
        assertEquals(1, renderedQuads.size());
        assertEquals(10.0f, renderedQuads.get(0)[0], 0.001f);
        assertEquals(20.0f, renderedQuads.get(0)[1], 0.001f);
        assertEquals(30.0f, renderedQuads.get(0)[2], 0.001f);
        assertEquals(40.0f, renderedQuads.get(0)[3], 0.001f);

        engine.draw(50, 60, 70, 80, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 45);
        assertEquals(2, renderedQuads.size());
        assertEquals(45.0f, renderedQuads.get(1)[9], 0.001f);

        GameEngine.renderBridge = null;
    }

    @Test
    public void testSparkleSpawn() {
        assertEquals(10, engine.sparkles.size());
        engine.spawnSparkle(120, 340);
        Sparkle sparkle = (Sparkle) engine.sparkles.pool[0];
        assertNotNull(sparkle);
        assertTrue(sparkle.animating);
        assertTrue(sparkle.visible);
        assertEquals(120, sparkle.x);
        assertEquals(340, sparkle.y);
    }

    @Test
    public void testEngineInitRoutine() {
        String atlasContent =
                "black 32 32 0.5703125 0.40234375 0.03125 0.03125\n" +
                "white 32 32 0.5703125 0.4375 0.03125 0.03125\n" +
                "number_score_0 16 20 0.0 0.0 0.1 0.1\n";
        engine.loadAtlas(new ByteArrayInputStream(atlasContent.getBytes(StandardCharsets.UTF_8)));

        engine.init();

        assertNotNull(engine.blackSprite);
        assertEquals("black", engine.blackSprite.name);
        assertNotNull(engine.whiteSprite);
        assertEquals("white", engine.whiteSprite.name);
        // Initial fade started (fade from black 1.0 -> 0.0)
        assertFalse(engine.fadeTween.finished);
        assertEquals(1.0f, engine.fadeTween.startValue, 0.001f);
        assertEquals(0.0f, engine.fadeTween.targetValue, 0.001f);
    }
}
