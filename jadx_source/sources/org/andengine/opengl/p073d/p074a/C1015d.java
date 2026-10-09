package org.andengine.opengl.p073d.p074a;

import org.andengine.p040d.p053f.C0943a;
import org.andengine.p040d.p056i.C0949a;

/* JADX INFO: renamed from: org.andengine.opengl.d.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C1015d {

    /* JADX INFO: renamed from: a */
    private static final boolean f2966a = C0949a.m3843a(8);

    /* JADX INFO: renamed from: b */
    private int f2967b;

    /* JADX INFO: renamed from: c */
    private final C1012a[] f2968c;

    /* JADX INFO: renamed from: d */
    private int f2969d;

    public C1015d(int i) {
        this.f2968c = new C1012a[i];
    }

    /* JADX INFO: renamed from: a */
    public C1014c m3987a() {
        if (this.f2967b != this.f2968c.length) {
            throw new C0943a("Not enough " + C1012a.class.getSimpleName() + "s added to this " + getClass().getSimpleName() + ".");
        }
        return new C1014c(this.f2969d, this.f2968c);
    }

    /* JADX INFO: renamed from: a */
    public C1015d m3988a(int i, String str, int i2, int i3, boolean z) {
        if (f2966a) {
            this.f2968c[this.f2967b] = new C1013b(i, str, i2, i3, z, this.f2969d);
        } else {
            this.f2968c[this.f2967b] = new C1012a(i, str, i2, i3, z, this.f2969d);
        }
        switch (i3) {
            case 5121:
                this.f2969d += i2 * 1;
                break;
            case 5126:
                this.f2969d += i2 * 4;
                break;
            default:
                throw new IllegalArgumentException("Unexpected pType: '" + i3 + "'.");
        }
        this.f2967b++;
        return this;
    }
}
