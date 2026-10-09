package org.andengine.p040d.p054g;

import android.util.FloatMath;
import java.util.Random;

/* JADX INFO: renamed from: org.andengine.d.g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0945a {

    /* JADX INFO: renamed from: a */
    public static final Random f2780a = new Random(System.nanoTime());

    /* JADX INFO: renamed from: a */
    public static final float m3833a(float f) {
        return 0.017453292f * f;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m3834a(int i) {
        return i != 0 && ((i + (-1)) & i) == 0;
    }

    /* JADX INFO: renamed from: a */
    public static float[] m3835a(float[] fArr, float f, float f2, float f3) {
        if (f != 0.0f) {
            float fM3833a = m3833a(f);
            float fSin = FloatMath.sin(fM3833a);
            float fCos = FloatMath.cos(fM3833a);
            for (int length = fArr.length - 2; length >= 0; length -= 2) {
                float f4 = fArr[length];
                float f5 = fArr[length + 1];
                fArr[length] = (((f4 - f2) * fCos) - ((f5 - f3) * fSin)) + f2;
                fArr[length + 1] = ((f4 - f2) * fSin) + ((f5 - f3) * fCos) + f3;
            }
        }
        return fArr;
    }

    /* JADX INFO: renamed from: b */
    public static float[] m3836b(float[] fArr, float f, float f2, float f3) {
        return m3835a(fArr, -f, f2, f3);
    }
}
