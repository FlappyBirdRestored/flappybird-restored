package com.dotgears;

import android.util.Log;

/**
 * GameMath - Reverse-engineered 1:1 recreation of com.dotgears.C0213j.
 * Precomputed 360-degree trigonometric tables, Marsaglia MWC PRNG, and 21 easing curves.
 */
public class GameMath {

    public static GameMath instance;

    // Output variables for rotatePoint (f635A, f636B)
    public static float rotatedX;
    public static float rotatedY;

    // Trigonometric lookup tables (f637a, f638b)
    public static float[] sinTable;
    public static float[] cosTable;

    // Easing curve lookup tables (0..100) (f639c through f659w)
    public static float[] easeQuadInTable;        // f639c
    public static float[] easeQuadOutTable;       // f640d
    public static float[] easeQuadInOutTable;     // f641e
    public static float[] easeCubicInTable;       // f642f
    public static float[] easeCubicOutTable;      // f643g
    public static float[] easeCubicInOutTable;    // f644h
    public static float[] easeQuartInTable;       // f645i
    public static float[] easeQuartOutTable;      // f646j
    public static float[] easeQuartInOutTable;    // f647k
    public static float[] easeQuintInTable;       // f648l
    public static float[] easeQuintOutTable;      // f649m
    public static float[] easeQuintInOutTable;    // f650n
    public static float[] easeElasticInTable;     // f651o
    public static float[] easeElasticOutTable;    // f652p
    public static float[] easeElasticInOutTable;  // f653q
    public static float[] easeBackInTable;        // f654r
    public static float[] easeBackOutTable;       // f655s
    public static float[] easeBackInOutTable;     // f656t
    public static float[] easeBounceInTable;      // f657u
    public static float[] easeBounceOutTable;     // f658v
    public static float[] easeBounceInOutTable;   // f659w

    // PRNG states (George Marsaglia Multiply-With-Carry PRNG) (f661y, f662z)
    public static int mwcY;
    public static int mwcZ;

    static {
        // Auto-initialize static tables on class load
        initTables();
    }

    public GameMath() {
        initTables();
    }

    private static synchronized void initTables() {
        if (sinTable != null) {
            return;
        }

        sinTable = new float[360];
        cosTable = new float[360];
        for (int i = 0; i < 360; i++) {
            float rad = (i * 3.1415925f) / 180.0f;
            sinTable[i] = (float) Math.sin(rad);
            cosTable[i] = (float) Math.cos(rad);
        }

        easeQuadInTable = new float[101];
        easeQuadOutTable = new float[101];
        easeQuadInOutTable = new float[101];
        easeCubicInTable = new float[101];
        easeCubicOutTable = new float[101];
        easeCubicInOutTable = new float[101];
        easeQuartInTable = new float[101];
        easeQuartOutTable = new float[101];
        easeQuartInOutTable = new float[101];
        easeQuintInTable = new float[101];
        easeQuintOutTable = new float[101];
        easeQuintInOutTable = new float[101];
        easeElasticInTable = new float[101];
        easeElasticOutTable = new float[101];
        easeElasticInOutTable = new float[101];
        easeBackInTable = new float[101];
        easeBackOutTable = new float[101];
        easeBackInOutTable = new float[101];
        easeBounceInTable = new float[101];
        easeBounceOutTable = new float[101];
        easeBounceInOutTable = new float[101];

        for (int i = 0; i <= 100; i++) {
            double t = ((double) i) / 100.0d;
            easeQuadInTable[i] = (float) calcQuadIn(t);
            easeQuadOutTable[i] = (float) calcQuadOut(t);
            easeQuadInOutTable[i] = (float) calcQuadInOut(t);
            easeCubicInTable[i] = (float) calcCubicIn(t);
            easeCubicOutTable[i] = (float) calcCubicOut(t);
            easeCubicInOutTable[i] = (float) calcCubicInOut(t);
            easeQuartInTable[i] = (float) calcQuartIn(t);
            easeQuartOutTable[i] = (float) calcQuartOut(t);
            easeQuartInOutTable[i] = (float) calcQuartInOut(t);
            easeQuintInTable[i] = (float) calcQuintIn(t);
            easeQuintOutTable[i] = (float) calcQuintOut(t);
            easeQuintInOutTable[i] = (float) calcQuintInOut(t);
            easeElasticInTable[i] = (float) calcElasticIn(t);
            easeElasticOutTable[i] = (float) calcElasticOut(t);
            easeElasticInOutTable[i] = (float) calcElasticInOut(t);
            easeBackInTable[i] = (float) calcBackIn(t);
            easeBackOutTable[i] = (float) calcBackOut(t);
            easeBackInOutTable[i] = (float) calcBackInOut(t);
            easeBounceInTable[i] = (float) calcBounceIn(t);
            easeBounceOutTable[i] = (float) calcBounceOut(t);
            easeBounceInOutTable[i] = (float) calcBounceInOut(t);
        }
    }

    /**
     * Normalizes an angle into [0, 360) range.
     * Decompiled from: C0213j.m864a
     */
    public static float normalizeAngle(float angle) {
        float result = angle;
        while (result > 360.0f) {
            result -= 360.0f;
        }
        while (result < 0.0f) {
            result += 360.0f;
        }
        return result;
    }

    /**
     * Marsaglia Multiply-With-Carry pseudo-random number generator.
     * Decompiled from: C0213j.m865a
     */
    public static int random() {
        mwcZ = (36969 * (mwcZ & 65535)) + (mwcZ >> 16);
        mwcY = ((mwcY & 65535) * 18000) + (mwcY >> 16);
        return Math.abs((mwcZ << 16) + mwcY);
    }

    /**
     * Generates a random integer in range [min, max).
     * Decompiled from: C0213j.m866a(int, int)
     */
    public static int random(int min, int max) {
        return (random() % (max - min)) + min;
    }

    /**
     * Rotates point (px, py) around center (cx, cy) by given angle.
     * Results stored in rotatedX, rotatedY.
     * Decompiled from: C0213j.m867a
     */
    public static void rotatePoint(float px, float py, float cx, float cy, float angle) {
        float dx = px - cx;
        float dy = py - cy;
        float normAngle = normalizeAngle(angle);
        rotatedX = ((cos(normAngle) * dx) - (sin(normAngle) * dy)) + cx;
        rotatedY = (dx * sin(normAngle)) + (dy * cos(normAngle)) + cy;
    }

    /**
     * Seeds the PRNG.
     * Decompiled from: C0213j.m868a(int)
     */
    public static void randomize(int seed) {
        Log.i("FlappyBird", "Engine: Randomize " + seed);
        mwcY = seed % 32000;
        mwcZ = seed % 65535;
    }

    /**
     * Lookup sine value from precomputed 360-degree table.
     * Decompiled from: C0213j.m869b(float)
     */
    public static float sin(float angle) {
        return sinTable[(int) angle];
    }

    /**
     * Lookup cosine value from precomputed 360-degree table.
     * Decompiled from: C0213j.m872c(float)
     */
    public static float cos(float angle) {
        return cosTable[(int) angle];
    }

    // --- Easing Table Lookup Methods (Used by Tween / C0221r) ---

    // Case 1: C0213j.m870b
    public static float getEase1(int index) {
        return easeQuartInTable[index];
    }

    // Case 2: C0213j.m873c
    public static float getEase2(int index) {
        return easeQuadOutTable[index];
    }

    // Case 3: C0213j.m875d
    public static float getEase3(int index) {
        return easeQuadInOutTable[index];
    }

    // Case 4: C0213j.m877e
    public static float getEase4(int index) {
        return easeCubicInTable[index];
    }

    // Case 5: C0213j.m879f
    public static float getEase5(int index) {
        return easeCubicOutTable[index];
    }

    // Case 6: C0213j.m881g
    public static float getEase6(int index) {
        return easeCubicInOutTable[index];
    }

    // Case 7: C0213j.m883h
    public static float getEase7(int index) {
        return easeQuartInTable[index];
    }

    // Case 8: C0213j.m885i
    public static float getEase8(int index) {
        return easeQuartOutTable[index];
    }

    // Case 9: C0213j.m887j
    public static float getEase9(int index) {
        return easeQuartInOutTable[index];
    }

    // Case 10: C0213j.m889k
    public static float getEase10(int index) {
        return easeQuintInTable[index];
    }

    // Case 11: C0213j.m891l
    public static float getEase11(int index) {
        return easeQuintOutTable[index];
    }

    // Case 12: C0213j.m892m
    public static float getEase12(int index) {
        return easeQuintInOutTable[index];
    }

    // Case 13: C0213j.m893n
    public static float getEase13(int index) {
        return easeElasticInTable[index];
    }

    // Case 14: C0213j.m894o
    public static float getEase14(int index) {
        return easeElasticOutTable[index];
    }

    // Case 15: C0213j.m895p
    public static float getEase15(int index) {
        return easeElasticInOutTable[index];
    }

    // Case 16: C0213j.m896q
    public static float getEase16(int index) {
        return easeElasticInTable[index];
    }

    // Case 17: C0213j.m897r
    public static float getEase17(int index) {
        return easeElasticOutTable[index];
    }

    // Case 18: C0213j.m898s
    public static float getEase18(int index) {
        return easeElasticInOutTable[index];
    }

    // Case 19: C0213j.m899t
    public static float getEase19(int index) {
        return easeBounceInTable[index];
    }

    // Case 20: C0213j.m900u
    public static float getEase20(int index) {
        return easeBounceOutTable[index];
    }

    // Case 21: C0213j.m901v
    public static float getEase21(int index) {
        return easeBounceInOutTable[index];
    }

    // --- Mathematical Easing Formulations (m902a through m912u) ---

    // Quad In (m902a)
    static double calcQuadIn(double d) {
        return d * d;
    }

    // Quad Out (m903b)
    static double calcQuadOut(double d) {
        return -((d - 2.0d) * d);
    }

    // Quad InOut (m871c)
    static double calcQuadInOut(double d) {
        return d < 0.5d ? 2.0d * d * d : ((((-2.0d) * d) * d) + (4.0d * d)) - 1.0d;
    }

    // Cubic In (m874d)
    static double calcCubicIn(double d) {
        return d * d * d;
    }

    // Cubic Out (m876e)
    static double calcCubicOut(double d) {
        double d2 = d - 1.0d;
        return (d2 * d2 * d2) + 1.0d;
    }

    // Cubic InOut (m878f)
    static double calcCubicInOut(double d) {
        if (d < 0.5d) {
            return 4.0d * d * d * d;
        }
        double d2 = (2.0d * d) - 2.0d;
        return (d2 * 0.5d * d2 * d2) + 1.0d;
    }

    // Quart In (m880g)
    static double calcQuartIn(double d) {
        return d * d * d * d;
    }

    // Quart Out (m882h)
    static double calcQuartOut(double d) {
        double d2 = d - 1.0d;
        return (d2 * d2 * d2 * (1.0d - d)) + 1.0d;
    }

    // Quart InOut (m884i)
    static double calcQuartInOut(double d) {
        if (d < 0.5d) {
            return 8.0d * d * d * d * d;
        }
        double d2 = d - 1.0d;
        return (d2 * (-8.0d) * d2 * d2 * d2) + 1.0d;
    }

    // Quint In (m886j)
    static double calcQuintIn(double d) {
        return d * d * d * d * d;
    }

    // Quint Out (m888k)
    static double calcQuintOut(double d) {
        double d2 = d - 1.0d;
        return (d2 * d2 * d2 * d2 * d2) + 1.0d;
    }

    // Quint InOut (m890l)
    static double calcQuintInOut(double d) {
        if (d < 0.5d) {
            return 16.0d * d * d * d * d * d;
        }
        double d2 = (2.0d * d) - 2.0d;
        return (d2 * 0.5d * d2 * d2 * d2 * d2) + 1.0d;
    }

    // Elastic In (m904m)
    static double calcElasticIn(double d) {
        return Math.sin(20.420352248333657d * d) * Math.pow(2.0d, 10.0d * (d - 1.0d));
    }

    // Elastic Out (m905n)
    static double calcElasticOut(double d) {
        return (Math.sin((-20.420352248333657d) * (d + 1.0d)) * Math.pow(2.0d, (-10.0d) * d)) + 1.0d;
    }

    // Elastic InOut (m906o)
    static double calcElasticInOut(double d) {
        return d < 0.5d
                ? Math.sin(20.420352248333657d * 2.0d * d) * 0.5d * Math.pow(2.0d, 10.0d * ((2.0d * d) - 1.0d))
                : ((Math.sin((-20.420352248333657d) * (((2.0d * d) - 1.0d) + 1.0d)) * Math.pow(2.0d, (-10.0d) * ((2.0d * d) - 1.0d))) + 2.0d) * 0.5d;
    }

    // Back In (m907p)
    static double calcBackIn(double d) {
        return ((d * d) * d) - (Math.sin(3.141592653589793d * d) * d);
    }

    // Back Out (m908q)
    static double calcBackOut(double d) {
        double d2 = 1.0d - d;
        return 1.0d - (((d2 * d2) * d2) - (d2 * Math.sin(3.141592653589793d * d2)));
    }

    // Back InOut (m909r)
    static double calcBackInOut(double d) {
        if (d < 0.5d) {
            double d2 = 2.0d * d;
            return (((d2 * d2) * d2) - (d2 * Math.sin(3.141592653589793d * d2))) * 0.5d;
        }
        double d3 = 1.0d - ((2.0d * d) - 1.0d);
        return ((1.0d - (((d3 * d3) * d3) - (d3 * Math.sin(3.141592653589793d * d3)))) * 0.5d) + 0.5d;
    }

    // Bounce In (m910s)
    static double calcBounceIn(double d) {
        return 1.0d - calcBounceOut(1.0d - d);
    }

    // Bounce Out (m911t)
    static double calcBounceOut(double d) {
        if (d < 0.36363636363636365d) {
            return ((121.0d * d) * d) / 16.0d;
        }
        if (d < 0.7272727272727273d) {
            return (((9.075d * d) * d) - (9.9d * d)) + 3.4d;
        }
        return d < 0.9d
                ? (((12.066481994459833d * d) * d) - (19.63545706371191d * d)) + 8.898060941828255d
                : (((10.8d * d) * d) - (20.52d * d)) + 10.72d;
    }

    // Bounce InOut (m912u)
    static double calcBounceInOut(double d) {
        return d < 0.5d
                ? calcBounceIn(d * 2.0d) * 0.5d
                : (calcBounceOut((d * 2.0d) - 1.0d) * 0.5d) + 0.5d;
    }
}
