package org.andengine.opengl.p061a;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: org.andengine.opengl.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C0976d {

    /* JADX INFO: renamed from: a */
    public final char f2832a;

    /* JADX INFO: renamed from: b */
    public final int f2833b;

    /* JADX INFO: renamed from: c */
    public final int f2834c;

    /* JADX INFO: renamed from: d */
    public final int f2835d;

    /* JADX INFO: renamed from: e */
    public final int f2836e;

    /* JADX INFO: renamed from: f */
    public final float f2837f;

    /* JADX INFO: renamed from: g */
    public final float f2838g;

    /* JADX INFO: renamed from: h */
    public final float f2839h;

    /* JADX INFO: renamed from: i */
    public final float f2840i;

    /* JADX INFO: renamed from: j */
    public final float f2841j;

    /* JADX INFO: renamed from: k */
    public final float f2842k;

    /* JADX INFO: renamed from: l */
    public final float f2843l;

    /* JADX INFO: renamed from: m */
    private final boolean f2844m;

    /* JADX INFO: renamed from: n */
    private SparseIntArray f2845n;

    /* JADX INFO: renamed from: a */
    public boolean m3898a() {
        return this.f2844m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f2832a == ((C0976d) obj).f2832a;
    }

    public int hashCode() {
        return this.f2832a + 31;
    }

    public String toString() {
        return String.valueOf(getClass().getSimpleName()) + "[Character=" + this.f2832a + ", Whitespace=" + this.f2844m + ", TextureX=" + this.f2833b + ", TextureY=" + this.f2834c + ", Width=" + this.f2835d + ", Height=" + this.f2836e + ", OffsetX=" + this.f2837f + ", OffsetY=" + this.f2838g + ", Advance=" + this.f2839h + ", U=" + this.f2840i + ", V=" + this.f2841j + ", U2=" + this.f2842k + ", V2=" + this.f2843l + ", Kernings=" + this.f2845n + "]";
    }
}
