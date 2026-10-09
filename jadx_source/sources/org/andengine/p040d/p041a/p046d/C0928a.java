package org.andengine.p040d.p041a.p046d;

import android.util.FloatMath;

/* JADX INFO: renamed from: org.andengine.d.a.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C0928a {

    /* JADX INFO: renamed from: a */
    private float f2717a = 1.0f;

    /* JADX INFO: renamed from: b */
    private float f2718b = 0.0f;

    /* JADX INFO: renamed from: c */
    private float f2719c = 0.0f;

    /* JADX INFO: renamed from: d */
    private float f2720d = 1.0f;

    /* JADX INFO: renamed from: e */
    private float f2721e = 0.0f;

    /* JADX INFO: renamed from: f */
    private float f2722f = 0.0f;

    /* JADX INFO: renamed from: a */
    private void m3779a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = this.f2717a;
        float f8 = this.f2718b;
        float f9 = this.f2719c;
        float f10 = this.f2720d;
        float f11 = this.f2721e;
        float f12 = this.f2722f;
        this.f2717a = (f7 * f) + (f8 * f3);
        this.f2718b = (f7 * f2) + (f8 * f4);
        this.f2719c = (f9 * f) + (f10 * f3);
        this.f2720d = (f9 * f2) + (f10 * f4);
        this.f2721e = (f11 * f) + (f12 * f3) + f5;
        this.f2722f = (f11 * f2) + (f12 * f4) + f6;
    }

    /* JADX INFO: renamed from: b */
    private void m3780b(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = this.f2717a;
        float f8 = this.f2718b;
        float f9 = this.f2719c;
        float f10 = this.f2720d;
        float f11 = this.f2721e;
        float f12 = this.f2722f;
        this.f2717a = (f * f7) + (f2 * f9);
        this.f2718b = (f * f8) + (f2 * f10);
        this.f2719c = (f3 * f7) + (f4 * f9);
        this.f2720d = (f3 * f8) + (f4 * f10);
        this.f2721e = (f7 * f5) + (f9 * f6) + f11;
        this.f2722f = (f5 * f8) + (f6 * f10) + f12;
    }

    /* JADX INFO: renamed from: a */
    public final void m3781a() {
        this.f2717a = 1.0f;
        this.f2720d = 1.0f;
        this.f2718b = 0.0f;
        this.f2719c = 0.0f;
        this.f2721e = 0.0f;
        this.f2722f = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m3782a(float f) {
        float f2 = 0.017453292f * f;
        float fSin = FloatMath.sin(f2);
        float fCos = FloatMath.cos(f2);
        float f3 = this.f2717a;
        float f4 = this.f2718b;
        float f5 = this.f2719c;
        float f6 = this.f2720d;
        float f7 = this.f2721e;
        float f8 = this.f2722f;
        this.f2717a = (f3 * fCos) - (f4 * fSin);
        this.f2718b = (f3 * fSin) + (f4 * fCos);
        this.f2719c = (f5 * fCos) - (f6 * fSin);
        this.f2720d = (f5 * fSin) + (f6 * fCos);
        this.f2721e = (f7 * fCos) - (f8 * fSin);
        this.f2722f = (fCos * f8) + (fSin * f7);
    }

    /* JADX INFO: renamed from: a */
    public final void m3783a(float f, float f2) {
        this.f2721e += f;
        this.f2722f += f2;
    }

    /* JADX INFO: renamed from: a */
    public final void m3784a(C0928a c0928a) {
        this.f2717a = c0928a.f2717a;
        this.f2720d = c0928a.f2720d;
        this.f2718b = c0928a.f2718b;
        this.f2719c = c0928a.f2719c;
        this.f2721e = c0928a.f2721e;
        this.f2722f = c0928a.f2722f;
    }

    /* JADX INFO: renamed from: a */
    public final void m3785a(float[] fArr) {
        int i = 0;
        int length = fArr.length >> 1;
        int i2 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            int i3 = i2 + 1;
            float f = fArr[i2];
            i2 = i3 + 1;
            float f2 = fArr[i3];
            int i4 = i + 1;
            fArr[i] = (this.f2717a * f) + (this.f2719c * f2) + this.f2721e;
            i = i4 + 1;
            fArr[i4] = (f2 * this.f2720d) + (f * this.f2718b) + this.f2722f;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3786b(float f, float f2) {
        this.f2717a *= f;
        this.f2718b *= f2;
        this.f2719c *= f;
        this.f2720d *= f2;
        this.f2721e *= f;
        this.f2722f *= f2;
    }

    /* JADX INFO: renamed from: b */
    public final void m3787b(C0928a c0928a) {
        m3779a(c0928a.f2717a, c0928a.f2718b, c0928a.f2719c, c0928a.f2720d, c0928a.f2721e, c0928a.f2722f);
    }

    /* JADX INFO: renamed from: c */
    public final void m3788c(float f, float f2) {
        float fTan = (float) Math.tan((-0.017453292f) * f);
        float fTan2 = (float) Math.tan((-0.017453292f) * f2);
        float f3 = this.f2717a;
        float f4 = this.f2718b;
        float f5 = this.f2719c;
        float f6 = this.f2720d;
        float f7 = this.f2721e;
        float f8 = this.f2722f;
        this.f2717a = (f4 * fTan) + f3;
        this.f2718b = (f3 * fTan2) + f4;
        this.f2719c = (f6 * fTan) + f5;
        this.f2720d = (f5 * fTan2) + f6;
        this.f2721e = (fTan * f8) + f7;
        this.f2722f = (f7 * fTan2) + f8;
    }

    /* JADX INFO: renamed from: c */
    public final void m3789c(C0928a c0928a) {
        m3780b(c0928a.f2717a, c0928a.f2718b, c0928a.f2719c, c0928a.f2720d, c0928a.f2721e, c0928a.f2722f);
    }

    public String toString() {
        return "Transformation{[" + this.f2717a + ", " + this.f2719c + ", " + this.f2721e + "][" + this.f2718b + ", " + this.f2720d + ", " + this.f2722f + "][0.0, 0.0, 1.0]}";
    }
}
