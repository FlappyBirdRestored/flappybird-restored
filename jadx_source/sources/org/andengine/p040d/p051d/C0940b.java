package org.andengine.p040d.p051d;

/* JADX INFO: renamed from: org.andengine.d.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C0940b {

    /* JADX INFO: renamed from: a */
    private static final float[] f2768a = new float[3];

    /* JADX INFO: renamed from: a */
    public static final float m3818a(int i) {
        return Float.intBitsToFloat(i & (-1));
    }

    /* JADX INFO: renamed from: a */
    public static final int m3819a(float f, float f2, float f3, float f4) {
        return (((int) (255.0f * f4)) << 24) | (((int) (255.0f * f)) << 16) | (((int) (255.0f * f2)) << 8) | (((int) (255.0f * f3)) << 0);
    }

    /* JADX INFO: renamed from: b */
    public static final int m3820b(float f, float f2, float f3, float f4) {
        return (((int) (255.0f * f4)) << 24) | (((int) (255.0f * f3)) << 16) | (((int) (255.0f * f2)) << 8) | (((int) (255.0f * f)) << 0);
    }
}
