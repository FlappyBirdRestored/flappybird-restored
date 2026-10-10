package com.dotgears;

/**
 * Pure integer cadence scheduler implementing rate-aware Bresenham frame counting
 * decoupled from arbitrary display refresh rates (60 Hz, 90 Hz, 120 Hz, 144 Hz, 240 Hz, <60 Hz).
 *
 * <p>Core Principles:
 * <ul>
 *   <li><b>Bresenham / DDA Integer Cadence:</b> {@code acc += 60; while (acc >= rateHz) { acc -= rateHz; n++; }}
 *       Produces 1 tick/frame at 60 Hz, alternating 0/1 ticks at 120 Hz, 2 ticks every 3 frames at 90 Hz,
 *       and 5 ticks every 12 frames at 144 Hz with zero floating-point remainder debt.</li>
 *   <li><b>Duplicate Wake Filter:</b> Wakes within {@code elapsedNs < 0.5ms} are filtered to ignore
 *       spurious duplicate VSync callbacks without dropping legitimate frames on high-refresh panels (144+ Hz).</li>
 *   <li><b>Stall Guard:</b> Real stalls {@code elapsedNs > 41.7ms} clamp catch-up to at most 4 ticks
 *       and reset accumulator debt.</li>
 *   <li><b>Hysteresis & Fallback:</b> When a new refresh rate is proposed, the scheduler uses the time-based
 *       accumulator until the candidate rate remains stable for 0.5 seconds, failing toward correct 1.0x game speed.</li>
 *   <li><b>1-Second Watchdog:</b> If simulation ticks diverge from 60 ± 3 over two consecutive 1-second windows,
 *       the scheduler falls back to the time-based accumulator until stability is restored.</li>
 * </ul>
 */
public class CadenceScheduler {

    /** Nominal nanoseconds per 60 Hz simulation tick (16,666,667 ns = 1/60s). */
    public static final long NS_PER_TICK = 16_666_667L;

    /** Duplicate wake threshold: ignore callbacks with dt < 0.5ms (500,000 ns). */
    public static final long DUPLICATE_FRAME_THRESHOLD_NS = 500_000L;

    /** Real stall threshold: elapsed time > 41.7ms (~2.5 frames at 60 Hz). */
    public static final long STALL_THRESHOLD_NS = 41_700_000L;

    /** Target physics ticks per second. */
    public static final int TARGET_TICKS_PER_SEC = 60;

    /** Candidate rate must remain stable for 0.5s before latching into integer divisor. */
    public static final long STABILITY_DURATION_NS = 500_000_000L;

    /** 1-second watchdog window duration in nanoseconds. */
    public static final long WATCHDOG_WINDOW_NS = 1_000_000_000L;

    /** Watchdog acceptable tick bounds: 60 ± 3 (57 to 63 ticks/sec). */
    public static final int WATCHDOG_MIN_TICKS = 57;
    public static final int WATCHDOG_MAX_TICKS = 63;

    /** Maximum time accumulated during fallback mode to prevent spiral of death. */
    public static final long MAX_FALLBACK_ACC_NS = 5L * NS_PER_TICK;

    /** Number of warmup frames to skip physics ticks for after a lifecycle resume / reset. */
    public static final int DEFAULT_WARMUP_FRAMES = 3;

    // Active Bresenham integer state
    private int rateHz = 60;
    private int acc = 0;
    private int warmupFrames = 0;

    // Fractional time accumulator used during fallback / rate transitions
    private long timeAccumulatorNs = 0L;

    // Rate transition and hysteresis state
    private int candidateRateHz = 60;
    private long candidateDurationNs = 0L;
    private boolean rateChanging = false;

    // 1-second health watchdog state
    private long watchdogElapsedNs = 0L;
    private int watchdogTicks = 0;
    private int consecutiveBadWindows = 0;
    private int consecutiveGoodWindows = 0;
    private boolean watchdogFallback = false;

    public CadenceScheduler() {
        this(60);
    }

    public CadenceScheduler(int initialRateHz) {
        setRateHz(initialRateHz);
    }

    /**
     * Steps the simulation cadence for a frame with the given elapsed time.
     *
     * @param elapsedNs Elapsed real time in nanoseconds since the previous frame.
     * @return Number of 60 Hz simulation ticks to execute for this frame.
     */
    public int step(long elapsedNs) {
        // 1. Duplicate callback filter (dt < 0.5ms)
        if (elapsedNs > 0L && elapsedNs < DUPLICATE_FRAME_THRESHOLD_NS) {
            return 0;
        }

        // 2. Warm-up frame guard after lifecycle resume / surface creation:
        // Skips physics ticks for the first few frames to soak up unblocking bursts (0.6ms..1.5ms)
        if (this.warmupFrames > 0) {
            this.warmupFrames--;
            return 0;
        }

        // 2. Progress candidate rate stability if a new rate was proposed
        if (this.rateChanging) {
            this.candidateDurationNs += elapsedNs;
            if (this.candidateDurationNs >= STABILITY_DURATION_NS) {
                // Drain any pending tick from the transition window before latching
                this.timeAccumulatorNs += elapsedNs;
                int transitionTicks = 0;
                while (this.timeAccumulatorNs >= NS_PER_TICK) {
                    this.timeAccumulatorNs -= NS_PER_TICK;
                    transitionTicks++;
                }
                // Latch new stable rate and cleanly reset state for Bresenham mode
                this.rateHz = this.candidateRateHz;
                this.acc = 0;
                this.timeAccumulatorNs = 0L;
                this.rateChanging = false;
                this.watchdogElapsedNs = 0L;
                this.watchdogTicks = 0;
                this.consecutiveBadWindows = 0;
                this.consecutiveGoodWindows = 0;
                this.watchdogFallback = false;
                return transitionTicks;
            }
        }

        // 3. Multi-frame stall guard (max(41.7ms, 2.5 * nominal frame period))
        long nominalPeriodNs = 1_000_000_000L / Math.max(20, this.rateHz);
        long dynamicStallThresholdNs = Math.max(STALL_THRESHOLD_NS, (long) (2.5 * nominalPeriodNs));
        if (elapsedNs > dynamicStallThresholdNs) {
            int stallTicks = (int) Math.min(4, Math.round((double) elapsedNs / (double) NS_PER_TICK));
            this.acc = 0;
            this.timeAccumulatorNs = 0L;
            this.watchdogElapsedNs = 0L;
            this.watchdogTicks = 0;
            return stallTicks;
        }

        // 4. Cadence calculation: fall back to time accumulator while rate is changing or watchdog tripped
        int ticks = 0;
        boolean useTimeAccumulator = this.rateChanging || this.watchdogFallback;

        if (useTimeAccumulator) {
            long clampedElapsedNs = Math.min(elapsedNs, MAX_FALLBACK_ACC_NS);
            this.timeAccumulatorNs += clampedElapsedNs;
            if (this.timeAccumulatorNs > MAX_FALLBACK_ACC_NS) {
                this.timeAccumulatorNs = MAX_FALLBACK_ACC_NS;
            }
            while (this.timeAccumulatorNs >= NS_PER_TICK) {
                this.timeAccumulatorNs -= NS_PER_TICK;
                ticks++;
            }
        } else {
            // Integer Bresenham step: acc += 60; while (acc >= rateHz) { acc -= rateHz; ticks++; }
            this.acc += TARGET_TICKS_PER_SEC;
            while (this.acc >= this.rateHz) {
                this.acc -= this.rateHz;
                ticks++;
            }
        }

        // 5. Watchdog health check over 1-second windows
        this.watchdogElapsedNs += elapsedNs;
        this.watchdogTicks += ticks;
        if (this.watchdogElapsedNs >= WATCHDOG_WINDOW_NS) {
            boolean isGoodWindow = (this.watchdogTicks >= WATCHDOG_MIN_TICKS && this.watchdogTicks <= WATCHDOG_MAX_TICKS);
            if (this.watchdogFallback) {
                if (isGoodWindow) {
                    this.consecutiveGoodWindows++;
                    if (this.consecutiveGoodWindows >= 3) {
                        // Require 3 consecutive good windows (3s) to exit fallback mode and restore Bresenham
                        this.watchdogFallback = false;
                        this.consecutiveGoodWindows = 0;
                        this.consecutiveBadWindows = 0;
                        this.acc = 0;
                        this.timeAccumulatorNs = 0L;
                    }
                } else {
                    this.consecutiveGoodWindows = 0;
                }
            } else {
                if (isGoodWindow) {
                    this.consecutiveBadWindows = 0;
                } else {
                    this.consecutiveBadWindows++;
                    if (this.consecutiveBadWindows >= 2) {
                        this.watchdogFallback = true;
                        this.consecutiveGoodWindows = 0;
                        this.acc = 0;
                        this.timeAccumulatorNs = 0L;
                    }
                }
            }
            this.watchdogElapsedNs -= WATCHDOG_WINDOW_NS;
            this.watchdogTicks = 0;
        }

        return ticks;
    }

    /**
     * Proposes a new hardware refresh rate candidate. The scheduler will not switch the integer
     * divisor until the candidate remains stable for at least 0.5 seconds (falling back to the
     * time accumulator in the interim).
     *
     * @param targetRate Proposed refresh rate in Hz.
     */
    public void proposeRateHz(int targetRate) {
        targetRate = clampRate(targetRate);
        if (targetRate == this.rateHz) {
            if (this.rateChanging) {
                this.rateChanging = false;
                this.candidateDurationNs = 0L;
            }
            return;
        }

        if (targetRate != this.candidateRateHz) {
            this.candidateRateHz = targetRate;
            this.candidateDurationNs = 0L;
            this.rateChanging = true;
        }
    }

    /**
     * Immediately latches the specified refresh rate, resetting accumulators.
     * Intended for initialization and unit testing.
     *
     * @param rate Target refresh rate in Hz.
     */
    public void setRateHz(int rate) {
        rate = clampRate(rate);
        this.rateHz = rate;
        this.candidateRateHz = rate;
        this.candidateDurationNs = 0L;
        this.rateChanging = false;
        this.acc = 0;
        this.timeAccumulatorNs = 0L;
        this.watchdogElapsedNs = 0L;
        this.watchdogTicks = 0;
        this.consecutiveBadWindows = 0;
        this.watchdogFallback = false;
    }

    /**
     * Resets timing and accumulator states to prevent catch-up bursts on lifecycle resume or surface creation.
     */
    public void reset() {
        this.acc = 0;
        this.timeAccumulatorNs = 0L;
        this.candidateDurationNs = 0L;
        this.rateChanging = false;
        this.watchdogElapsedNs = 0L;
        this.watchdogTicks = 0;
        this.consecutiveBadWindows = 0;
        this.consecutiveGoodWindows = 0;
        this.watchdogFallback = false;
        this.warmupFrames = 0;
    }

    public int getConsecutiveGoodWindows() {
        return this.consecutiveGoodWindows;
    }

    /**
     * Triggers a temporary warm-up phase that skips physics ticks for the specified number of frames.
     * Used on lifecycle resume and surface creation to soak up scheduling bursts without physics jerk.
     *
     * @param frames Number of frames to suppress physics ticks.
     */
    public void triggerWarmup(int frames) {
        this.warmupFrames = Math.max(0, frames);
    }

    public int getWarmupFrames() {
        return this.warmupFrames;
    }

    public int getRateHz() {
        return this.rateHz;
    }

    public int getCandidateRateHz() {
        return this.candidateRateHz;
    }

    public boolean isRateChanging() {
        return this.rateChanging;
    }

    public boolean isWatchdogFallback() {
        return this.watchdogFallback;
    }

    public int getAccumulator() {
        return this.acc;
    }

    public int getConsecutiveBadWindows() {
        return this.consecutiveBadWindows;
    }

    public static int snapToStandardRefreshRate(int rate) {
        if (Math.abs(rate - 30) <= 2) return 30;
        if (Math.abs(rate - 60) <= 2) return 60;
        if (Math.abs(rate - 90) <= 2) return 90;
        if (Math.abs(rate - 120) <= 2) return 120;
        if (Math.abs(rate - 144) <= 2) return 144;
        if (Math.abs(rate - 165) <= 2) return 165;
        if (Math.abs(rate - 240) <= 2) return 240;
        return rate;
    }

    private static int clampRate(int rate) {
        if (rate < 20) return 20;
        if (rate > 360) return 360;
        return rate;
    }
}
