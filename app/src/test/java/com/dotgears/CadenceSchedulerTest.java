package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class CadenceSchedulerTest {

    private CadenceScheduler scheduler;

    @Before
    public void setUp() {
        scheduler = new CadenceScheduler(60);
    }

    @Test
    public void testExactCadenceAt60Hz() {
        scheduler.setRateHz(60);
        int totalTicks = 0;
        for (int i = 0; i < 60; i++) {
            int ticks = scheduler.step(16_666_667L);
            assertEquals("Every 60 Hz frame must produce exactly 1 tick", 1, ticks);
            totalTicks += ticks;
        }
        assertEquals(60, totalTicks);
    }

    @Test
    public void testJitterToleranceAt60Hz() {
        scheduler.setRateHz(60);
        Random rng = new Random(42);
        int totalTicks = 0;

        for (int i = 0; i < 60; i++) {
            // Jitter between 6.67ms and 26.67ms (±10ms around 16.67ms)
            long jitterNs = (long) ((rng.nextDouble() * 20.0 - 10.0) * 1_000_000.0);
            long elapsed = 16_666_667L + jitterNs;
            int ticks = scheduler.step(elapsed);
            assertEquals("Jittered 60 Hz frame must still produce 1 tick", 1, ticks);
            totalTicks += ticks;
        }
        assertEquals(60, totalTicks);
    }

    @Test
    public void testExactCadenceAt120Hz() {
        scheduler.setRateHz(120);
        int totalTicks = 0;

        for (int i = 0; i < 120; i++) {
            int ticks = scheduler.step(8_333_333L);
            int expected = (i % 2 == 1) ? 1 : 0;
            assertEquals("120 Hz must alternate 0 and 1 tick", expected, ticks);
            totalTicks += ticks;
        }
        assertEquals(60, totalTicks);
    }

    @Test
    public void testExactCadenceAt90Hz() {
        scheduler.setRateHz(90);
        int totalTicks = 0;

        // 90 Hz produces 2 ticks every 3 frames ([0, 1, 1])
        int[] expectedPattern = {0, 1, 1};
        for (int i = 0; i < 90; i++) {
            int ticks = scheduler.step(11_111_111L);
            assertEquals("90 Hz frame " + i + " must match [0, 1, 1] pattern",
                    expectedPattern[i % 3], ticks);
            totalTicks += ticks;
        }
        assertEquals("90 Hz must produce exactly 60 ticks per second", 60, totalTicks);
    }

    @Test
    public void testExactCadenceAt144Hz() {
        scheduler.setRateHz(144);
        int totalTicks = 0;

        // 144 Hz produces 5 ticks every 12 frames: [0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1]
        int[] expectedPattern = {0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1};
        for (int i = 0; i < 144; i++) {
            int ticks = scheduler.step(6_944_444L);
            assertEquals("144 Hz frame " + i + " must match Bresenham 5/12 pattern",
                    expectedPattern[i % 12], ticks);
            totalTicks += ticks;
        }
        assertEquals("144 Hz must produce exactly 60 ticks per second", 60, totalTicks);
    }

    @Test
    public void testJitterToleranceAt144HzWithSynthetic10msNoise() {
        scheduler.setRateHz(144);
        Random rng = new Random(1337);
        int totalTicks = 0;

        // 144 frames with jitter (dt varying between 2ms and 15ms)
        for (int i = 0; i < 144; i++) {
            long jitterNs = (long) ((rng.nextDouble() * 10.0 - 5.0) * 1_000_000.0);
            long elapsed = Math.max(1_000_000L, 6_944_444L + jitterNs);
            int ticks = scheduler.step(elapsed);
            assertTrue("Individual frame must produce either 0 or 1 tick", ticks == 0 || ticks == 1);
            totalTicks += ticks;
        }
        assertEquals("144 Hz with jitter must yield exactly 60 ticks over 144 frames", 60, totalTicks);
    }

    @Test
    public void testDuplicateWakeFilterDoesNotDropHighRefreshFrames() {
        scheduler.setRateHz(144);

        // Sub-0.5ms duplicate callback drops to 0 ticks
        assertEquals(0, scheduler.step(200_000L));
        assertEquals(0, scheduler.step(400_000L));

        // Legitimate high-refresh frame at 2.0ms (which would have been dropped by the old 3ms guard!) is processed
        int ticks1 = scheduler.step(2_000_000L); // frame 1 of 12 (acc=60) -> 0
        int ticks2 = scheduler.step(6_944_444L); // frame 2 of 12 (acc=120) -> 0
        int ticks3 = scheduler.step(6_944_444L); // frame 3 of 12 (acc=180 >= 144) -> 1
        assertEquals(1, ticks3);
    }

    @Test
    public void testStallCatchUpAndAccumulatorReset() {
        scheduler.setRateHz(60);

        // Stall of 50ms (> 41.7ms) simulates 3 ticks
        int ticks = scheduler.step(50_000_000L);
        assertEquals(3, ticks);
        assertEquals(0, scheduler.getAccumulator());

        // Extreme stall of 10 seconds clamped to maximum 4 ticks
        int clampedTicks = scheduler.step(10_000_000_000L);
        assertEquals(4, clampedTicks);
        assertEquals(0, scheduler.getAccumulator());
    }

    @Test
    public void testRateSwitchHysteresisAndTransitionFallback() {
        scheduler.setRateHz(60);
        assertEquals(60, scheduler.getRateHz());
        assertFalse(scheduler.isRateChanging());

        // Propose switch to 120 Hz
        scheduler.proposeRateHz(120);
        assertTrue(scheduler.isRateChanging());
        assertEquals(120, scheduler.getCandidateRateHz());
        assertEquals(60, scheduler.getRateHz()); // Still active rate 60

        // Simulate 20 frames at ~16.67ms (total 333ms < 500ms stability threshold)
        int transitionTicks = 0;
        for (int i = 0; i < 20; i++) {
            transitionTicks += scheduler.step(16_666_667L);
        }
        assertTrue("Still changing during 333ms transition", scheduler.isRateChanging());
        assertEquals(20, transitionTicks); // Time accumulator runs at 60 ticks/s

        // Simulate another 11 frames (total > 500ms)
        for (int i = 0; i < 11; i++) {
            scheduler.step(16_666_667L);
        }

        // Stability threshold (500ms) reached: new rate 120 Hz is latched!
        assertFalse(scheduler.isRateChanging());
        assertEquals(120, scheduler.getRateHz());
    }

    @Test
    public void testWatchdogFallsBackOnDivisorMismatch() {
        // Scheduler set to 120 Hz, but display actually sends 60 frames per second (60 Hz physical panel)
        scheduler.setRateHz(120);

        // Window 1: 60 frames of 16.67ms (1.00 second)
        int window1Ticks = 0;
        for (int i = 0; i < 60; i++) {
            window1Ticks += scheduler.step(16_666_667L);
        }
        // At 120 Hz divisor, 60 frames produce only 30 ticks (half speed)
        assertEquals(30, window1Ticks);
        assertEquals(1, scheduler.getConsecutiveBadWindows());
        assertFalse(scheduler.isWatchdogFallback());

        // Window 2: another 60 frames of 16.67ms (1.00 second)
        int window2Ticks = 0;
        for (int i = 0; i < 60; i++) {
            window2Ticks += scheduler.step(16_666_667L);
        }
        assertEquals(30, window2Ticks);
        // After 2 bad windows, watchdog fallback triggers!
        assertTrue(scheduler.isWatchdogFallback());

        // Window 3: now in fallback mode (time-based accumulator)
        int window3Ticks = 0;
        for (int i = 0; i < 60; i++) {
            window3Ticks += scheduler.step(16_666_667L);
        }
        // In fallback mode, time accumulator recovers 60 ticks per second!
        assertEquals("Fallback time accumulator must restore 60 ticks/s", 60, window3Ticks);
    }

    @Test
    public void testResetClearsAccumulator() {
        scheduler.setRateHz(120);
        scheduler.step(8_333_333L); // acc becomes 60
        assertEquals(60, scheduler.getAccumulator());

        scheduler.reset();
        assertEquals(0, scheduler.getAccumulator());
        assertFalse(scheduler.isWatchdogFallback());
        assertFalse(scheduler.isRateChanging());
    }
}
