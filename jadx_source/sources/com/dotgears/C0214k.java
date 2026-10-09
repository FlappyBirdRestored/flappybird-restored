package com.dotgears;

/* JADX INFO: renamed from: com.dotgears.k */
/* JADX INFO: loaded from: classes.dex */
public class C0214k extends C0216m {

    /* JADX INFO: renamed from: a */
    public int f663a;

    /* JADX INFO: renamed from: b */
    public int f664b;

    /* JADX INFO: renamed from: c */
    public int f665c;

    /* JADX INFO: renamed from: d */
    public int f666d;

    /* JADX INFO: renamed from: e */
    public int f667e;

    /* JADX INFO: renamed from: f */
    public int f668f;

    /* JADX INFO: renamed from: g */
    private C0212i[] f669g = C0210g.f583D.m854a("medals");

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo826a(float f) {
        if (this.f673F && this.f668f > 0) {
            this.f668f--;
            if (this.f668f <= 0) {
                this.f668f = 30;
                C0210g.f583D.m857b((this.f663a - 3) + C0213j.m866a(0, this.f665c + 6), (this.f664b - 3) + C0213j.m866a(0, this.f666d + 6));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m913a(int i) {
        this.f663a = 0;
        this.f664b = 0;
        this.f665c = 44;
        this.f666d = 44;
        this.f667e = i;
        this.f668f = 30;
        this.f673F = true;
        this.f674G = true;
    }

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo828a(C0210g c0210g) {
        if (this.f674G) {
            c0210g.m845a(this.f669g[this.f667e].f634i, this.f663a, this.f664b, 1.0f, 1.0f, 1.0f);
        }
    }
}
