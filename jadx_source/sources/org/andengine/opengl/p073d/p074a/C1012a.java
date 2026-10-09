package org.andengine.opengl.p073d.p074a;

import android.opengl.GLES20;

/* JADX INFO: renamed from: org.andengine.opengl.d.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C1012a {

    /* JADX INFO: renamed from: a */
    final int f2958a;

    /* JADX INFO: renamed from: b */
    final String f2959b;

    /* JADX INFO: renamed from: c */
    final int f2960c;

    /* JADX INFO: renamed from: d */
    final int f2961d;

    /* JADX INFO: renamed from: e */
    final boolean f2962e;

    /* JADX INFO: renamed from: f */
    final int f2963f;

    public C1012a(int i, String str, int i2, int i3, boolean z, int i4) {
        this.f2958a = i;
        this.f2959b = str;
        this.f2960c = i2;
        this.f2961d = i3;
        this.f2962e = z;
        this.f2963f = i4;
    }

    /* JADX INFO: renamed from: a */
    public void mo3985a(int i) {
        GLES20.glVertexAttribPointer(this.f2958a, this.f2960c, this.f2961d, this.f2962e, i, this.f2963f);
    }
}
