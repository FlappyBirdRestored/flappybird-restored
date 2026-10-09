package com.dotgears;

/* JADX INFO: renamed from: com.dotgears.n */
/* JADX INFO: loaded from: classes.dex */
public class C0217n extends C0216m {

    /* JADX INFO: renamed from: a */
    public C0216m[] f675a = new C0216m[30];

    /* JADX INFO: renamed from: b */
    int f676b;

    /* JADX INFO: renamed from: c */
    int f677c;

    /* JADX INFO: renamed from: a */
    public int m915a() {
        return this.f677c;
    }

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo826a(float f) {
        for (int i = 0; i < m915a(); i++) {
            this.f675a[i].mo826a(f);
        }
    }

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo828a(C0210g c0210g) {
        for (int i = 0; i < m915a(); i++) {
            this.f675a[i].mo828a(c0210g);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m916a(C0216m c0216m) {
        this.f675a[this.f677c] = c0216m;
        this.f676b = 0;
        this.f677c++;
    }

    /* JADX INFO: renamed from: b */
    public void m917b() {
        for (int i = 0; i < m915a(); i++) {
            this.f675a[i].f673F = false;
            this.f675a[i].f674G = false;
        }
        this.f676b = 0;
    }

    /* JADX INFO: renamed from: c */
    C0216m m918c() {
        C0216m c0216m = this.f675a[this.f676b];
        this.f676b++;
        if (this.f676b == m915a()) {
            this.f676b = 0;
        }
        return c0216m;
    }
}
