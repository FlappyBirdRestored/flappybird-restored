package org.andengine.p040d.p047b.p048a;

import org.andengine.p026b.p027a.C0874a;
import org.andengine.p033c.p037c.AbstractC0909c;
import org.andengine.p040d.p041a.p046d.C0928a;
import org.andengine.p040d.p054g.C0945a;

/* JADX INFO: renamed from: org.andengine.d.b.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0932c extends C0933d {

    /* JADX INFO: renamed from: a */
    private static final float[] f2723a = new float[8];

    /* JADX INFO: renamed from: b */
    private static final float[] f2724b = new float[8];

    /* JADX INFO: renamed from: c */
    private static final float[] f2725c = new float[8];

    /* JADX INFO: renamed from: a */
    public static void m3792a(float f, float f2, float f3, float f4, C0928a c0928a, float[] fArr) {
        float f5 = f + f3;
        float f6 = f2 + f4;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f5;
        fArr[3] = f2;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f;
        fArr[7] = f6;
        c0928a.m3785a(fArr);
    }

    /* JADX INFO: renamed from: a */
    private static void m3793a(C0874a c0874a, float[] fArr) {
        fArr[0] = c0874a.m3614a();
        fArr[1] = c0874a.m3627c();
        fArr[2] = c0874a.m3623b();
        fArr[3] = c0874a.m3627c();
        fArr[4] = c0874a.m3623b();
        fArr[5] = c0874a.m3630d();
        fArr[6] = c0874a.m3614a();
        fArr[7] = c0874a.m3630d();
        C0945a.m3835a(fArr, c0874a.m3639k(), c0874a.m3635g(), c0874a.m3636h());
    }

    /* JADX INFO: renamed from: a */
    public static void m3794a(AbstractC0909c abstractC0909c, float[] fArr) {
        m3792a(0.0f, 0.0f, abstractC0909c.m3724o(), abstractC0909c.m3725p(), abstractC0909c.mo3710k(), fArr);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3795a(C0874a c0874a, AbstractC0909c abstractC0909c) {
        m3793a(c0874a, f2724b);
        m3794a(abstractC0909c, f2725c);
        return C0933d.m3801a(f2724b, 4, f2725c, 4);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3796a(AbstractC0909c abstractC0909c, float f, float f2) {
        m3794a(abstractC0909c, f2723a);
        return C0933d.m3797a(f2723a, 4, f, f2);
    }
}
