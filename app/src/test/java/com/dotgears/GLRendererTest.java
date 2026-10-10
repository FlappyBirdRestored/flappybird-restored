package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GLRendererTest {

    private GLRenderer renderer;

    @Before
    public void setUp() {
        GameMath.instance = new GameMath();
        renderer = new GLRenderer();
    }

    @Test
    public void testPillarboxingOnTallScreen() {
        // Modern 20:9 phone: 1080 x 2400
        renderer.computeViewport(1080, 2400);

        // scale = min(1080/288 = 3.75, 2400/512 = 4.6875) = 3.75
        assertEquals(3.75f, renderer.viewportScale, 0.001f);
        assertEquals(1080, renderer.viewportWidth);
        assertEquals(1920, renderer.viewportHeight); // 512 * 3.75 = 1920
        assertEquals(0, renderer.viewportX);
        assertEquals(240, renderer.viewportY); // (2400 - 1920) / 2 = 240
    }

    @Test
    public void testPillarboxingOnTabletOrWideScreen() {
        // Wide screen / 4:3 tablet: 1600 x 1200
        renderer.computeViewport(1600, 1200);

        // scale = min(1600/288 = 5.555, 1200/512 = 2.34375) = 2.34375
        assertEquals(2.34375f, renderer.viewportScale, 0.001f);
        assertEquals(675, renderer.viewportWidth); // 288 * 2.34375 = 675
        assertEquals(1200, renderer.viewportHeight);
        assertEquals(462, renderer.viewportX); // (1600 - 675) / 2 = 462
        assertEquals(0, renderer.viewportY);
    }

    @Test
    public void testExactAspectRatioViewport() {
        // 9:16 screen: 720 x 1280
        renderer.computeViewport(720, 1280);

        assertEquals(2.5f, renderer.viewportScale, 0.001f);
        assertEquals(720, renderer.viewportWidth);
        assertEquals(1280, renderer.viewportHeight);
        assertEquals(0, renderer.viewportX);
        assertEquals(0, renderer.viewportY);
    }

    @Test
    public void testScreenToVirtualCoordinateTranslation() {
        // 1080 x 2400 display (scale = 3.75, viewportY = 240)
        renderer.computeViewport(1080, 2400);

        // Top-left of virtual canvas (0, 0) is at screen (0, 240)
        assertEquals(0.0f, renderer.toVirtualX(0), 0.01f);
        assertEquals(0.0f, renderer.toVirtualY(240), 0.01f);

        // Center of virtual canvas (144, 256) is at screen (540, 1200)
        assertEquals(144.0f, renderer.toVirtualX(540), 0.01f);
        assertEquals(256.0f, renderer.toVirtualY(1200), 0.01f);

        // Bottom-right of virtual canvas (288, 512) is at screen (1080, 2160)
        assertEquals(288.0f, renderer.toVirtualX(1080), 0.01f);
        assertEquals(512.0f, renderer.toVirtualY(2160), 0.01f);
    }

    @Test
    public void testDrawQuadVertexLayout() {
        renderer.drawQuad(10, 20, 30, 40, 0.1f, 0.2f, 0.3f, 0.4f, 0.8f);

        assertEquals(1, renderer.quadCount);

        float[] v = renderer.vertexData;
        // Vertex 0 (Top-Left): (x1, y1), UV: (u1, v1), alpha
        assertEquals(10.0f, v[0], 0.001f);
        assertEquals(20.0f, v[1], 0.001f);
        assertEquals(0.1f, v[2], 0.001f);
        assertEquals(0.2f, v[3], 0.001f);
        assertEquals(0.8f, v[4], 0.001f);

        // Vertex 1 (Bottom-Left): (x1, y2), UV: (u1, v2), alpha
        assertEquals(10.0f, v[5], 0.001f);
        assertEquals(40.0f, v[6], 0.001f);
        assertEquals(0.1f, v[7], 0.001f);
        assertEquals(0.4f, v[8], 0.001f);
        assertEquals(0.8f, v[9], 0.001f);

        // Vertex 2 (Bottom-Right): (x2, y2), UV: (u2, v2), alpha
        assertEquals(30.0f, v[10], 0.001f);
        assertEquals(40.0f, v[11], 0.001f);
        assertEquals(0.3f, v[12], 0.001f);
        assertEquals(0.4f, v[13], 0.001f);
        assertEquals(0.8f, v[14], 0.001f);

        // Vertex 3 (Top-Right): (x2, y1), UV: (u2, v1), alpha
        assertEquals(30.0f, v[15], 0.001f);
        assertEquals(20.0f, v[16], 0.001f);
        assertEquals(0.3f, v[17], 0.001f);
        assertEquals(0.2f, v[18], 0.001f);
        assertEquals(0.8f, v[19], 0.001f);
    }

    @Test
    public void testDrawRotatedQuad() {
        // Centered quad at (100, 100) with size 20x20, rotated 90 degrees
        renderer.drawQuad(90, 90, 110, 110, 0f, 0f, 1f, 1f, 1.0f, 90);

        assertEquals(1, renderer.quadCount);
        float[] v = renderer.vertexData;

        // Center is (100, 100). Corner (90, 90) rotated 90 deg around (100, 100):
        // dx = -10, dy = -10. rotX = cos(90)*(-10) - sin(90)*(-10) + 100 = 0 - (-10) + 100 = 110
        // rotY = dx*sin(90) + dy*cos(90) + 100 = -10 + 0 + 100 = 90
        assertEquals(110.0f, v[0], 0.5f);
        assertEquals(90.0f, v[1], 0.5f);
    }

    @Test
    public void testQuadCapacityClampAt50() {
        for (int i = 0; i < 55; i++) {
            renderer.drawQuad(0, 0, 10, 10, 0f, 0f, 1f, 1f, 1.0f);
        }
        assertEquals(GLRenderer.MAX_QUADS, renderer.quadCount);
        assertEquals(50, renderer.quadCount);
    }

    @Test
    public void testGameEngineRenderBridgeIntegration() {
        GameEngine.renderBridge = renderer;
        GameEngine engine = new GameEngine();

        // draw call via GameEngine must route into GLRenderer
        engine.draw(5, 10, 15, 20, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f);

        assertEquals(1, renderer.quadCount);
        assertEquals(5.0f, renderer.vertexData[0], 0.001f);
        assertEquals(10.0f, renderer.vertexData[1], 0.001f);
        assertEquals(0.5f, renderer.vertexData[4], 0.001f);

        GameEngine.renderBridge = null;
    }

    @Test
    public void testFixedTimestepAt60Hz() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        renderer.resetTimestep();

        // Stepping exactly 16.666ms (1 tick) simulates 1 tick
        int ticks = renderer.stepSimulation(GLRenderer.NS_PER_TICK);
        assertEquals(1, ticks);
    }

    @Test
    public void testFixedTimestepAt120Hz() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        renderer.setDisplayRefreshRate(120.0f);
        renderer.resetTimestep();

        long halfTick = GLRenderer.NS_PER_TICK / 2L;

        // Frame 1 (8.33ms): stepCounter toggles to 0 -> 0 ticks
        int ticks1 = renderer.stepSimulation(halfTick);
        assertEquals(0, ticks1);

        // Frame 2 (8.33ms): stepCounter toggles to 1 -> 1 tick (60 ticks/s total)
        int ticks2 = renderer.stepSimulation(halfTick);
        assertEquals(1, ticks2);
    }

    @Test
    public void testVsyncJitterSnappingAt60Hz() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        renderer.setDisplayRefreshRate(60.0f);
        renderer.resetTimestep();

        // Early wake (16.2 ms) runs exactly 1 tick
        int ticks1 = renderer.stepSimulation(16_200_000L);
        assertEquals(1, ticks1);

        // Late wake (17.1 ms) runs exactly 1 tick
        int ticks2 = renderer.stepSimulation(17_100_000L);
        assertEquals(1, ticks2);

        // Extreme late wake (29.58 ms) cleanly runs exactly 1 tick (zero remainder debt)
        int ticks3 = renderer.stepSimulation(29_580_000L);
        assertEquals(1, ticks3);

        // Extreme early wake (5.82 ms) cleanly runs exactly 1 tick
        int ticks4 = renderer.stepSimulation(5_820_000L);
        assertEquals(1, ticks4);
    }

    @Test
    public void testMultiFrameStallCatchUpAt60Hz() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        renderer.resetTimestep();

        // Frame stall of 50ms (> 41.7ms) simulates 3 ticks
        int ticks = renderer.stepSimulation(50_000_000L);
        assertEquals(3, ticks);

        // Extreme pause (10 seconds) clamped to maximum 4 ticks
        int clampedTicks = renderer.stepSimulation(10_000_000_000L);
        assertEquals(4, clampedTicks);
    }

    @Test
    public void testDuplicateWakeIgnored() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        renderer.resetTimestep();

        // Sub-0.5ms duplicate callback (e.g. spurious wake) runs 0 ticks
        int ticks = renderer.stepSimulation(200_000L);
        assertEquals(0, ticks);
    }

    @Test
    public void testCadenceAt120HzInGLRenderer() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        renderer.setDisplayRefreshRate(120.0f);
        renderer.resetTimestep();

        int tick0 = renderer.stepSimulation(8_333_333L);
        int tick1 = renderer.stepSimulation(8_333_333L);
        int tick2 = renderer.stepSimulation(8_333_333L);
        int tick3 = renderer.stepSimulation(8_333_333L);

        assertEquals(0, tick0);
        assertEquals(1, tick1);
        assertEquals(0, tick2);
        assertEquals(1, tick3);
    }

    @Test
    public void testResetTimestepClearsAnomalyState() {
        renderer.anomalyDumpCountdown = 5;
        renderer.anomalyFlashFrames = 8;
        renderer.resetTimestep();

        assertEquals(-1, renderer.anomalyDumpCountdown);
        assertEquals(0, renderer.anomalyFlashFrames);
        assertEquals(0L, renderer.timeAccumulatorNs);
        assertEquals(0L, renderer.lastFrameTimeNs);
        assertEquals(0, renderer.cadenceScheduler.getAccumulator());
        assertEquals(0, renderer.cadenceScheduler.getWarmupFrames());
    }

    @Test
    public void testResetTimestepWithWarmupInGLRenderer() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        renderer.resetTimestepWithWarmup();

        assertEquals(3, renderer.cadenceScheduler.getWarmupFrames());

        // 3 burst frames return 0 ticks
        assertEquals(0, renderer.stepSimulation(800_000L));
        assertEquals(0, renderer.stepSimulation(1_100_000L));
        assertEquals(0, renderer.stepSimulation(1_400_000L));

        // 4th frame returns steady 1 tick
        assertEquals(1, renderer.stepSimulation(16_666_667L));
    }

    @Test
    public void testRateDisagreementProducesCorrectSpeed() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        // Display proposes 120 Hz, but GL surface can only draw at 60 FPS (16.67ms dt)
        renderer.cadenceScheduler.setRateHz(120);

        // Run 3 seconds of 60 FPS frames (180 frames)
        int totalTicks = 0;
        for (int i = 0; i < 180; i++) {
            totalTicks += renderer.stepSimulation(16_666_667L);
        }

        // Even with initial rate disagreement, watchdog fallback guarantees the game
        // does not permanently run in 0.5x slow-motion, recovering 60 ticks/s!
        assertTrue("Game must recover full 60 ticks/s rate in fallback", totalTicks >= 120);
        assertTrue(renderer.cadenceScheduler.isWatchdogFallback());
    }
}
