package org.andengine.p040d.p047b.p048a;

import org.andengine.opengl.util.C1025f;

/* JADX INFO: renamed from: org.andengine.d.b.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C0933d extends C0930a {
    /* JADX INFO: renamed from: a */
    public static boolean m3797a(float[] fArr, int i, float f, float f2) {
        return m3798a(fArr, i, 0, 1, 2, f, f2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3798a(float[] fArr, int i, int i2, int i3, int i4, float f, float f2) {
        int i5 = i - 1;
        boolean z = false;
        for (int i6 = 0; i6 < i; i6++) {
            float fM4058a = C1025f.m4058a(fArr, i2, i4, i6);
            float fM4058a2 = C1025f.m4058a(fArr, i3, i4, i6);
            float fM4058a3 = C1025f.m4058a(fArr, i2, i4, i5);
            float fM4058a4 = C1025f.m4058a(fArr, i3, i4, i5);
            z = (((fM4058a2 >= f2 || fM4058a4 < f2) && (fM4058a4 >= f2 || fM4058a2 < f2)) || (fM4058a > f && fM4058a3 > f)) ? z : ((((f2 - fM4058a2) / (fM4058a4 - fM4058a2)) * (fM4058a3 - fM4058a)) + fM4058a < f) ^ z;
            i5 = i6;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3799a(float[] fArr, int i, int i2, int i3, int i4, int i5, float[] fArr2, int i6, int i7, int i8, int i9) {
        float fM4058a = C1025f.m4058a(fArr, i, i3, i4);
        float fM4058a2 = C1025f.m4058a(fArr, i2, i3, i4);
        float fM4058a3 = C1025f.m4058a(fArr, i, i3, i5);
        float fM4058a4 = C1025f.m4058a(fArr, i2, i3, i5);
        for (int i10 = i6 - 2; i10 >= 0; i10--) {
            if (C0931b.m3791a(fM4058a, fM4058a2, fM4058a3, fM4058a4, C1025f.m4058a(fArr2, i7, i9, i10), C1025f.m4058a(fArr2, i8, i9, i10), C1025f.m4058a(fArr2, i7, i9, i10 + 1), C1025f.m4058a(fArr2, i8, i9, i10 + 1))) {
                return true;
            }
        }
        return C0931b.m3791a(fM4058a, fM4058a2, fM4058a3, fM4058a4, C1025f.m4058a(fArr2, i7, i9, i6 + (-1)), C1025f.m4058a(fArr2, i8, i9, i6 + (-1)), C1025f.m4058a(fArr2, i7, i9, 0), C1025f.m4058a(fArr2, i8, i9, 0));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3800a(float[] fArr, int i, int i2, int i3, int i4, float[] fArr2, int i5, int i6, int i7, int i8) {
        for (int i9 = i - 2; i9 >= 0; i9--) {
            if (m3799a(fArr, i2, i3, i4, i9, i9 + 1, fArr2, i5, i6, i7, i8)) {
                return true;
            }
        }
        return m3799a(fArr, i2, i3, i4, i + (-1), 0, fArr2, i5, i6, i7, i8) || m3797a(fArr, i, C1025f.m4058a(fArr2, i6, i8, 0), C1025f.m4058a(fArr2, i7, i8, 0)) || m3797a(fArr2, i5, C1025f.m4058a(fArr, i2, i4, 0), C1025f.m4058a(fArr, i3, i4, 0));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3801a(float[] fArr, int i, float[] fArr2, int i2) {
        return m3800a(fArr, i, 0, 1, 2, fArr2, i2, 0, 1, 2);
    }
}
