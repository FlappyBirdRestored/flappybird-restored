package org.andengine.opengl.util;

import android.opengl.Matrix;

/* JADX INFO: renamed from: org.andengine.opengl.util.b */
/* JADX INFO: loaded from: classes.dex */
public class C1021b {

    /* JADX INFO: renamed from: b */
    int f2988b;

    /* JADX INFO: renamed from: a */
    final float[] f2987a = new float[512];

    /* JADX INFO: renamed from: c */
    private final float[] f2989c = new float[32];

    public C1021b() {
        m4016a();
    }

    /* JADX INFO: renamed from: a */
    private static void m4015a(float[] fArr, int i, float f, float f2) {
        fArr[i + 0] = 1.0f;
        fArr[i + 1] = (float) Math.tan((-0.017453292f) * f2);
        fArr[i + 2] = 0.0f;
        fArr[i + 3] = 0.0f;
        fArr[i + 4] = (float) Math.tan((-0.017453292f) * f);
        fArr[i + 5] = 1.0f;
        fArr[i + 6] = 0.0f;
        fArr[i + 7] = 0.0f;
        fArr[i + 8] = 0.0f;
        fArr[i + 9] = 0.0f;
        fArr[i + 10] = 1.0f;
        fArr[i + 11] = 0.0f;
        fArr[i + 12] = 0.0f;
        fArr[i + 13] = 0.0f;
        fArr[i + 14] = 0.0f;
        fArr[i + 15] = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public void m4016a() {
        Matrix.setIdentityM(this.f2987a, this.f2988b);
    }

    /* JADX INFO: renamed from: a */
    public void m4017a(float f, float f2) {
        m4015a(this.f2989c, 0, f, f2);
        System.arraycopy(this.f2987a, this.f2988b, this.f2989c, 16, 16);
        Matrix.multiplyMM(this.f2987a, this.f2988b, this.f2989c, 16, this.f2989c, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m4018a(float f, float f2, float f3) {
        Matrix.translateM(this.f2987a, this.f2988b, f, f2, f3);
    }

    /* JADX INFO: renamed from: a */
    public void m4019a(float f, float f2, float f3, float f4) {
        Matrix.setRotateM(this.f2989c, 0, f, f2, f3, f4);
        System.arraycopy(this.f2987a, this.f2988b, this.f2989c, 16, 16);
        Matrix.multiplyMM(this.f2987a, this.f2988b, this.f2989c, 16, this.f2989c, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m4020a(float f, float f2, float f3, float f4, float f5, float f6) {
        Matrix.orthoM(this.f2987a, this.f2988b, f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: b */
    public void m4021b() {
        if (this.f2988b + 16 >= 512) {
            throw new C1022c();
        }
        System.arraycopy(this.f2987a, this.f2988b, this.f2987a, this.f2988b + 16, 16);
        this.f2988b += 16;
    }

    /* JADX INFO: renamed from: b */
    public void m4022b(float f, float f2, float f3) {
        Matrix.scaleM(this.f2987a, this.f2988b, f, f2, f3);
    }

    /* JADX INFO: renamed from: c */
    public void m4023c() {
        if (this.f2988b - 16 <= -16) {
            throw new C1023d();
        }
        this.f2988b -= 16;
    }

    /* JADX INFO: renamed from: d */
    public void m4024d() {
        this.f2988b = 0;
        m4016a();
    }
}
