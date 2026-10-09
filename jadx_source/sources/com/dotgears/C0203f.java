package com.dotgears;

/* JADX INFO: renamed from: com.dotgears.f */
/* JADX INFO: loaded from: classes.dex */
public class C0203f extends C0216m {

    /* JADX INFO: renamed from: a */
    public C0212i f514a;

    /* JADX INFO: renamed from: b */
    public int f515b;

    /* JADX INFO: renamed from: c */
    public int f516c;

    /* JADX INFO: renamed from: d */
    public int f517d;

    /* JADX INFO: renamed from: e */
    public int f518e;

    /* JADX INFO: renamed from: f */
    public boolean f519f;

    /* JADX INFO: renamed from: g */
    public boolean f520g;

    /* JADX INFO: renamed from: h */
    public boolean f521h;

    /* JADX INFO: renamed from: i */
    public boolean f522i;

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo826a(float f) {
        int i = C0210g.f583D.f608u;
        int[] iArr = C0210g.f583D.f606s;
        int[] iArr2 = C0210g.f583D.f607t;
        this.f522i = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] > this.f515b && iArr[i2] < this.f515b + this.f517d && iArr2[i2] > this.f516c && iArr2[i2] < this.f516c + this.f518e) {
                this.f522i = true;
                break;
            }
        }
        this.f520g = false;
        this.f521h = false;
        if (this.f522i != this.f519f) {
            if (this.f519f) {
                this.f521h = true;
                this.f519f = false;
            } else {
                this.f520g = true;
                this.f519f = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m829a(int i, int i2) {
        this.f515b = i;
        this.f516c = i2;
        this.f673F = true;
        this.f674G = true;
        this.f522i = false;
        this.f520g = false;
        this.f521h = false;
        this.f519f = false;
    }

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo828a(C0210g c0210g) {
        if (this.f519f) {
            c0210g.m845a(this.f514a.f634i, this.f515b, this.f516c + 2, 1.0f, 1.0f, 1.0f);
        } else {
            c0210g.m845a(this.f514a.f634i, this.f515b, this.f516c, 1.0f, 1.0f, 1.0f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m830a(String str) {
        this.f514a = C0210g.f583D.m855b(str);
        this.f517d = this.f514a.f628b;
        this.f518e = this.f514a.f629c;
    }
}
