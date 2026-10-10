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
    public void testFixedTimestepAccumulatorAt60Hz() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        renderer.resetTimestep();

        // Stepping exactly 16.666ms (1 tick) simulates 1 tick
        int ticks = renderer.stepSimulation(GLRenderer.NS_PER_TICK);
        assertEquals(1, ticks);
        assertEquals(0L, renderer.timeAccumulatorNs);
    }

    @Test
    public void testFixedTimestepAccumulatorAt120Hz() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        renderer.setDisplayRefreshRate(120.0f);
        renderer.resetTimestep();

        long halfTick = GLRenderer.NS_PER_TICK / 2L;

        // Frame 1 (8.33ms): accumulator has 8.33ms < 16.66ms -> 0 ticks
        int ticks1 = renderer.stepSimulation(halfTick);
        assertEquals(0, ticks1);
        assertEquals(halfTick, renderer.timeAccumulatorNs);

        // Frame 2 (8.33ms): accumulator reaches 16.66ms -> exactly 1 tick
        int ticks2 = renderer.stepSimulation(halfTick);
        assertEquals(1, ticks2);
        assertEquals(0L, renderer.timeAccumulatorNs);
    }

    @Test
    public void testVsyncJitterSnappingAt60Hz() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        renderer.setDisplayRefreshRate(60.0f);
        renderer.resetTimestep();

        // 16.2 ms (woke up 0.46ms early due to Linux scheduler variance)
        // Snaps to NS_PER_TICK so it runs exactly 1 tick instead of 0 ticks (eliminating micro-stutter)
        long jitterEarlyNs = 16_200_000L;
        int ticks1 = renderer.stepSimulation(jitterEarlyNs);
        assertEquals(1, ticks1);
        assertEquals(0L, renderer.timeAccumulatorNs);

        // 17.1 ms (woke up 0.43ms late)
        // Snaps to NS_PER_TICK so it runs exactly 1 tick instead of 2 ticks
        long jitterLateNs = 17_100_000L;
        int ticks2 = renderer.stepSimulation(jitterLateNs);
        assertEquals(1, ticks2);
        assertEquals(0L, renderer.timeAccumulatorNs);
    }

    @Test
    public void testFixedTimestepAccumulatorAt30HzOrDrop() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        renderer.resetTimestep();

        // Frame drop of 33.33ms (2 ticks) simulates exactly 2 ticks
        int ticks = renderer.stepSimulation(GLRenderer.NS_PER_TICK * 2L);
        assertEquals(2, ticks);
        assertEquals(0L, renderer.timeAccumulatorNs);
    }

    @Test
    public void testSpiralOfDeathClamping() {
        GameEngine engine = new GameEngine();
        renderer.setEngine(engine);
        renderer.resetTimestep();

        // 10 second delay (e.g. app freeze / debugger pause) clamped to MAX_ELAPSED_NS (5 ticks)
        int ticks = renderer.stepSimulation(10_000_000_000L);
        assertEquals(5, ticks);
        assertEquals(0L, renderer.timeAccumulatorNs);
    }

    @Test
    public void testResetTimestepClearsAccumulator() {
        renderer.stepSimulation(GLRenderer.NS_PER_TICK / 2L);
        assertTrue(renderer.timeAccumulatorNs > 0L);

        renderer.resetTimestep();
        assertEquals(0L, renderer.timeAccumulatorNs);
        assertEquals(0L, renderer.lastFrameTimeNs);
    }

    @Test
    public void testVsyncSnappingAt144Hz() {
        renderer.setDisplayRefreshRate(144.0f);
        renderer.resetTimestep();

        long expected144HzPeriod = (long) (1_000_000_000.0 / 144.0); // ~6,944,444 ns
        // Jitter frame arriving at 6.8 ms (within tolerance of 6.944 ms) snaps to expected period
        long snapped = renderer.snapElapsedToVsync(6_800_000L);
        assertEquals(expected144HzPeriod, snapped);
    }

    @Test
    public void testVsyncSnappingDroppedFrameAt60Hz() {
        renderer.setDisplayRefreshRate(60.0f);
        renderer.resetTimestep();

        // Single dropped frame on 60 Hz display arriving at 33.0 ms snaps to exactly 2 ticks (33.333 ms)
        long snapped = renderer.snapElapsedToVsync(33_000_000L);
        assertEquals(GLRenderer.NS_PER_TICK * 2L, snapped);
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
    }
}
