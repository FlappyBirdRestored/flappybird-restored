package com.dotgears;

/* JADX INFO: renamed from: com.dotgears.l */
/* JADX INFO: loaded from: classes.dex */
public class C0215l {

    /* JADX INFO: renamed from: a */
    public int f670a;

    /* JADX INFO: renamed from: b */
    public int f671b;

    /* JADX INFO: renamed from: c */
    private C0212i[] f672c;

    public C0215l(String str) {
        this.f672c = C0210g.f583D.m854a(str);
        this.f670a = this.f672c[0].f628b;
        this.f671b = this.f672c[0].f629c;
    }

    /* JADX INFO: renamed from: a */
    public void m914a(C0210g c0210g, int i, int i2, int i3, boolean z, int i4) {
        int i5;
        int i6 = i2 - this.f670a;
        boolean z2 = true;
        int i7 = i;
        while (i4 > 0) {
            if (i7 > 0 || z2) {
                c0210g.m845a(this.f672c[i7 % 10].f634i, i6, i3, 1.0f, 1.0f, 1.0f);
                i6 -= this.f670a;
                i5 = i7 / 10;
                z2 = z;
            } else {
                i5 = i7;
            }
            i4--;
            i7 = i5;
        }
    }
}
