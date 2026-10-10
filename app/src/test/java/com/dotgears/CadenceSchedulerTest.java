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

    @Test
    public void testResumeBurstSoakedByWarmupGuard() {
        scheduler.setRateHz(60);
        scheduler.reset();
        scheduler.triggerWarmup(3);
        assertEquals(3, scheduler.getWarmupFrames());

        // Sub-0.5ms duplicate callback drops without consuming a warmup frame
        assertEquals(0, scheduler.step(300_000L));
        assertEquals(3, scheduler.getWarmupFrames());

        // Resume burst: 3 rapid non-duplicate callbacks (0.64ms, 0.95ms, 1.40ms)
        // Without warmup guard, these would have generated 3 ticks!
        // With warmup guard, they safely return 0 ticks while decremented.
        assertEquals(0, scheduler.step(640_000L));
        assertEquals(2, scheduler.getWarmupFrames());

        assertEquals(0, scheduler.step(950_000L));
        assertEquals(1, scheduler.getWarmupFrames());

        assertEquals(0, scheduler.step(1_400_000L));
        assertEquals(0, scheduler.getWarmupFrames());

        // Frame 4: normal steady-state hardware VSync (16.67ms) resumes 1 tick execution
        assertEquals(1, scheduler.step(16_666_667L));
    }

    @Test
    public void testStallThresholdScalesAtLowRefreshRates() {
        // At 24 Hz, nominal period is 41.67ms. Hardcoded 41.7ms would falsely trigger a stall!
        scheduler.setRateHz(24);

        // Legitimate 24 Hz frame at 41.67ms must NOT trigger a stall catch-up
        int ticksNormal = scheduler.step(41_666_667L);
        // At 24 Hz, Bresenham: 60/24 = 2.5 ticks/frame (acc += 60 -> 2 ticks, remainder 12)
        assertEquals(2, ticksNormal);
        assertEquals(12, scheduler.getAccumulator()); // Bresenham accumulator preserved, not reset!

        // Frame exceeding 2.5x nominal period (> 104.2ms) IS a stall: triggers clamp and resets accumulator
        int ticksStall = scheduler.step(110_000_000L);
        assertTrue(ticksStall >= 3);
        assertEquals(0, scheduler.getAccumulator()); // Reset on true stall
    }

    @Test
    public void testWatchdogRecoveryRequiresThreeGoodWindows() {
        scheduler.setRateHz(120);

        // Trigger watchdog fallback by feeding 2 bad 1-second windows (60 frames at 16.67ms = 30 ticks each)
        for (int i = 0; i < 120; i++) {
            scheduler.step(16_666_667L);
        }
        assertTrue("Watchdog must trip after 2 bad windows", scheduler.isWatchdogFallback());

        // Good window 1 (60 frames of 16.67ms via time accumulator produces 60 ticks)
        for (int i = 0; i < 60; i++) {
            scheduler.step(16_666_667L);
        }
        assertTrue("Still in fallback after 1 good window", scheduler.isWatchdogFallback());
        assertEquals(1, scheduler.getConsecutiveGoodWindows());

        // Good window 2
        for (int i = 0; i < 60; i++) {
            scheduler.step(16_666_667L);
        }
        assertTrue("Still in fallback after 2 good windows", scheduler.isWatchdogFallback());
        assertEquals(2, scheduler.getConsecutiveGoodWindows());

        // Good window 3: satisfies 3-window recovery requirement
        for (int i = 0; i < 60; i++) {
            scheduler.step(16_666_667L);
        }
        assertFalse("Must exit fallback after 3 consecutive good windows", scheduler.isWatchdogFallback());
        assertEquals(0, scheduler.getConsecutiveGoodWindows());
    }

    @Test
    public void testTenMinuteEnduranceAt90Hz() {
        scheduler.setRateHz(90);
        int totalTicks = 0;

        // 10 simulated minutes = 600 seconds * 90 frames/sec = 54,000 frames
        for (int i = 0; i < 54_000; i++) {
            totalTicks += scheduler.step(11_111_111L);
        }

        // Exactly 600 seconds * 60 ticks/second = 36,000 ticks
        assertEquals("10 minutes at 90 Hz must produce exactly 36,000 ticks with zero drift", 36_000, totalTicks);
    }

    @Test
    public void testTenMinuteEnduranceAt144Hz() {
        scheduler.setRateHz(144);
        int totalTicks = 0;

        // 10 simulated minutes = 600 seconds * 144 frames/sec = 86,400 frames
        for (int i = 0; i < 86_400; i++) {
            totalTicks += scheduler.step(6_944_444L);
        }

        // Exactly 600 seconds * 60 ticks/second = 36,000 ticks
        assertEquals("10 minutes at 144 Hz must produce exactly 36,000 ticks with zero drift", 36_000, totalTicks);
    }

    @Test
    public void testMidRunRateSwitch() {
        scheduler.setRateHz(60);

        // Run 60 frames at 60 Hz (1 second)
        int ticks60Hz = 0;
        for (int i = 0; i < 60; i++) {
            ticks60Hz += scheduler.step(16_666_667L);
        }
        assertEquals(60, ticks60Hz);

        // Propose switch to 120 Hz
        scheduler.proposeRateHz(120);

        // Run transition frames (0.5s = 60 frames at 8.333334ms)
        int transitionTicks = 0;
        for (int i = 0; i < 60; i++) {
            transitionTicks += scheduler.step(8_333_334L);
        }
        // Time accumulator during transition produces 30 ticks (0.5s * 60 ticks/s = 30 ticks)
        assertEquals(30, transitionTicks);
        assertEquals(120, scheduler.getRateHz()); // Latched!

        // Run at steady 120 Hz for 1 second (120 frames at 8.333334ms)
        int ticks120Hz = 0;
        for (int i = 0; i < 120; i++) {
            ticks120Hz += scheduler.step(8_333_334L);
        }
        assertEquals(60, ticks120Hz);
    }
}
