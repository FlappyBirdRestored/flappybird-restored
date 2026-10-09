package org.andengine.p040d.p047b.p048a;

/* JADX INFO: renamed from: org.andengine.d.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0930a {
    /* JADX INFO: renamed from: a */
    public static int m3790a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float f9 = f5 - f;
        float f10 = f6 - f2;
        float f11 = (f9 * f8) - (f10 * f7);
        if (f11 == 0.0f) {
            f11 = (f9 * f7) + (f10 * f8);
            if (f11 > 0.0f) {
                f11 = ((f9 - f7) * f7) + ((f10 - f8) * f8);
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
            }
        }
        if (f11 < 0.0f) {
            return -1;
        }
        return f11 > 0.0f ? 1 : 0;
    }
}
