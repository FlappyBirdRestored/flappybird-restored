package org.andengine.opengl.p066c;

import android.opengl.GLES20;

/* JADX INFO: renamed from: org.andengine.opengl.c.f */
/* JADX INFO: loaded from: classes.dex */
public class C1009f {

    /* JADX INFO: renamed from: a */
    public static final C1009f f2937a = new C1009f(9728, 9728, 33071, 33071, false);

    /* JADX INFO: renamed from: b */
    public static final C1009f f2938b = new C1009f(9729, 9729, 33071, 33071, false);

    /* JADX INFO: renamed from: c */
    public static final C1009f f2939c = new C1009f(9728, 9728, 10497, 10497, false);

    /* JADX INFO: renamed from: d */
    public static final C1009f f2940d = new C1009f(9729, 9729, 10497, 10497, false);

    /* JADX INFO: renamed from: e */
    public static final C1009f f2941e = new C1009f(9728, 9728, 33071, 33071, true);

    /* JADX INFO: renamed from: f */
    public static final C1009f f2942f = new C1009f(9729, 9729, 33071, 33071, true);

    /* JADX INFO: renamed from: g */
    public static final C1009f f2943g = new C1009f(9728, 9728, 10497, 10497, true);

    /* JADX INFO: renamed from: h */
    public static final C1009f f2944h = new C1009f(9729, 9729, 10497, 10497, true);

    /* JADX INFO: renamed from: i */
    public static final C1009f f2945i = f2937a;

    /* JADX INFO: renamed from: j */
    public final int f2946j;

    /* JADX INFO: renamed from: k */
    public final int f2947k;

    /* JADX INFO: renamed from: l */
    public final float f2948l;

    /* JADX INFO: renamed from: m */
    public final float f2949m;

    /* JADX INFO: renamed from: n */
    public final boolean f2950n;

    public C1009f(int i, int i2, int i3, int i4, boolean z) {
        this.f2947k = i;
        this.f2946j = i2;
        this.f2948l = i3;
        this.f2949m = i4;
        this.f2950n = z;
    }

    /* JADX INFO: renamed from: a */
    public void m3981a() {
        GLES20.glTexParameterf(3553, 10241, this.f2947k);
        GLES20.glTexParameterf(3553, 10240, this.f2946j);
        GLES20.glTexParameterf(3553, 10242, this.f2949m);
        GLES20.glTexParameterf(3553, 10243, this.f2948l);
    }
}
