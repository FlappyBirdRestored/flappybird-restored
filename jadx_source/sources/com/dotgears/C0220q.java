package com.dotgears;

/* JADX INFO: renamed from: com.dotgears.q */
/* JADX INFO: loaded from: classes.dex */
public class C0220q extends C0216m {

    /* JADX INFO: renamed from: b */
    public int f711b;

    /* JADX INFO: renamed from: c */
    public int f712c;

    /* JADX INFO: renamed from: d */
    public int f713d;

    /* JADX INFO: renamed from: e */
    public int f714e;

    /* JADX INFO: renamed from: f */
    public int f715f;

    /* JADX INFO: renamed from: g */
    public int f716g;

    /* JADX INFO: renamed from: h */
    public int f717h;

    /* JADX INFO: renamed from: k */
    public boolean f720k;

    /* JADX INFO: renamed from: l */
    public boolean f721l;

    /* JADX INFO: renamed from: o */
    public int f724o;

    /* JADX INFO: renamed from: p */
    public C0212i[] f725p;

    /* JADX INFO: renamed from: a */
    C0201d[] f710a = new C0201d[10];

    /* JADX INFO: renamed from: i */
    public float f718i = 1.0f;

    /* JADX INFO: renamed from: j */
    public C0201d f719j = null;

    /* JADX INFO: renamed from: m */
    public boolean f722m = false;

    /* JADX INFO: renamed from: n */
    public boolean f723n = false;

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo826a(float f) {
        if (this.f722m && this.f719j != null) {
            this.f719j.m824a(f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo827a(int i, int i2) {
        this.f711b = i;
        this.f712c = i2;
        this.f713d = 0;
        this.f722m = true;
        this.f723n = true;
        this.f720k = false;
        this.f721l = false;
        this.f718i = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public void m921a(int i, String str, int[] iArr, int i2, int i3, boolean z) {
        this.f710a[i] = new C0201d(i, str, iArr, i2, i3, z);
    }

    /* JADX INFO: renamed from: a */
    public void m922a(int i, boolean z) {
        if (z) {
            this.f710a[i].m823a();
        }
        this.f710a[i].m825b();
        this.f719j = this.f710a[i];
    }

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo828a(C0210g c0210g) {
        if (this.f723n) {
            C0212i c0212i = this.f725p[0];
            if (this.f719j != null) {
                c0212i = this.f725p[this.f719j.f513j];
            }
            c0210g.m845a(c0212i.f634i, this.f711b - this.f716g, this.f712c - this.f717h, 1.0f, 1.0f, this.f718i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m923a(String str, int i, int i2, int i3, int i4) {
        this.f725p = C0210g.f583D.m854a(str);
        this.f724o = this.f725p.length;
        if (i == 0 || i2 == 0) {
            this.f714e = this.f725p[0].f628b;
            this.f715f = this.f725p[0].f629c;
        } else {
            this.f714e = i;
            this.f715f = i2;
        }
        if (i3 == 0 || i4 == 0) {
            this.f716g = (this.f725p[0].f628b - this.f714e) >> 1;
            this.f717h = (this.f725p[0].f629c - this.f715f) >> 1;
        } else {
            this.f716g = i3;
            this.f717h = i4;
        }
    }
}
