package com.dotgears;

/**
 * Tween - Reverse-engineered 1:1 recreation of com.dotgears.C0221r.
 * Value interpolator driven by 60 Hz frame ticks using GameMath easing lookup tables.
 */
public class Tween {

    /** Current interpolated value (decompiled from f726a). */
    public float value = 0.0f;

    /** Current normalized animation progress [0.0..1.0] (decompiled from f727b). */
    public float progress;

    /** Starting value (decompiled from f728c). */
    public float startValue;

    /** Target / ending value (decompiled from f729d). */
    public float targetValue;

    /** Total delta difference (targetValue - startValue) (decompiled from f730e). */
    public float deltaValue;

    /** Easing curve type index [0..21] (0 = Linear) (decompiled from f731f). */
    public int easingType;

    /** Completion flag (decompiled from f732g). */
    public boolean finished = true;

    /** Total number of ticks for the tween duration (decompiled from f733h). */
    private int totalTicks;

    /** Current tick counter (decompiled from f734i). */
    private int currentTick;

    /** Normalized progress per tick step (1.0 / totalTicks) (decompiled from f735j). */
    private float stepProgress;

    public Tween() {
        this.finished = true;
        this.value = 0.0f;
    }

    /**
     * Initializes and starts a new interpolation sequence.
     * Decompiled from: C0221r.m925a(float, float, int, float)
     *
     * @param from            Initial starting value.
     * @param to              Ending target value.
     * @param easingType      Easing curve index (0 = Linear, 1..21 = GameMath curves).
     * @param durationSeconds Duration in seconds (at 60 ticks/sec).
     */
    public void start(float from, float to, int easingType, float durationSeconds) {
        this.startValue = from;
        this.targetValue = to;
        this.deltaValue = this.targetValue - this.startValue;
        this.totalTicks = (int) (60.0f * durationSeconds);
        if (this.totalTicks <= 0) {
            this.totalTicks = 1;
        }
        this.stepProgress = 1.0f / (float) this.totalTicks;
        this.currentTick = 0;
        this.easingType = easingType;
        this.finished = false;
        this.value = this.startValue;
    }

    /**
     * Advances the tween by one tick.
     * Decompiled from: C0221r.m924a(float)
     */
    public void update(float dt) {
        if (this.finished) {
            return;
        }

        this.currentTick++;
        this.progress = this.currentTick * this.stepProgress;
        int easeIndex = (int) (this.progress * 100.0f);
        if (easeIndex > 100) {
            easeIndex = 100;
        }

        switch (this.easingType) {
            case 1:
                this.progress = GameMath.getEase1(easeIndex);
                break;
            case 2:
                this.progress = GameMath.getEase2(easeIndex);
                break;
            case 3:
                this.progress = GameMath.getEase3(easeIndex);
                break;
            case 4:
                this.progress = GameMath.getEase4(easeIndex);
                break;
            case 5:
                this.progress = GameMath.getEase5(easeIndex);
                break;
            case 6:
                this.progress = GameMath.getEase6(easeIndex);
                break;
            case 7:
                this.progress = GameMath.getEase7(easeIndex);
                break;
            case 8:
                this.progress = GameMath.getEase8(easeIndex);
                break;
            case 9:
                this.progress = GameMath.getEase9(easeIndex);
                break;
            case 10:
                this.progress = GameMath.getEase10(easeIndex);
                break;
            case 11:
                this.progress = GameMath.getEase11(easeIndex);
                break;
            case 12:
                this.progress = GameMath.getEase12(easeIndex);
                break;
            case 13:
                this.progress = GameMath.getEase13(easeIndex);
                break;
            case 14:
                this.progress = GameMath.getEase14(easeIndex);
                break;
            case 15:
                this.progress = GameMath.getEase15(easeIndex);
                break;
            case 16:
                this.progress = GameMath.getEase16(easeIndex);
                break;
            case 17:
                this.progress = GameMath.getEase17(easeIndex);
                break;
            case 18:
                this.progress = GameMath.getEase18(easeIndex);
                break;
            case 19:
                this.progress = GameMath.getEase19(easeIndex);
                break;
            case 20:
                this.progress = GameMath.getEase20(easeIndex);
                break;
            case 21:
                this.progress = GameMath.getEase21(easeIndex);
                break;
        }

        this.value = (this.progress * this.deltaValue) + this.startValue;

        if (this.currentTick >= this.totalTicks) {
            this.finished = true;
            this.value = this.targetValue;
            this.progress = 1.0f;
        }
    }
}
