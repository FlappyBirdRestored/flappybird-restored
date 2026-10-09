package com.dotgears;

/* JADX INFO: renamed from: com.dotgears.o */
/* JADX INFO: loaded from: classes.dex */
public class C0218o extends C0216m {

    /* JADX INFO: renamed from: c */
    public boolean f680c;

    /* JADX INFO: renamed from: d */
    public int f681d;

    /* JADX INFO: renamed from: e */
    public int f682e;

    /* JADX INFO: renamed from: f */
    public int f683f;

    /* JADX INFO: renamed from: g */
    public int f684g;

    /* JADX INFO: renamed from: h */
    public int f685h;

    /* JADX INFO: renamed from: i */
    public int f686i;

    /* JADX INFO: renamed from: j */
    public int f687j;

    /* JADX INFO: renamed from: k */
    public int f688k;

    /* JADX INFO: renamed from: l */
    public int f689l;

    /* JADX INFO: renamed from: a */
    public int f678a = 12;

    /* JADX INFO: renamed from: b */
    public int f679b = 14;

    /* JADX INFO: renamed from: m */
    private C0212i[] f690m = C0210g.f583D.m854a("number_context");

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo826a(float f) {
        if (this.f673F && this.f681d > 0) {
            this.f681d--;
            if (this.f684g < 2) {
                this.f688k += this.f684g;
                this.f686i++;
                if (this.f686i == 4) {
                    this.f686i = 0;
                    this.f684g += this.f685h;
                }
            }
            if (this.f681d <= 0) {
                this.f673F = false;
                this.f674G = false;
            }
        }
    }

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo828a(C0210g c0210g) {
        if (this.f674G) {
            if (this.f680c) {
                c0210g.m845a(this.f690m[10].f634i, this.f687j, this.f688k, 1.0f, 1.0f, 1.0f);
            }
            m919a(c0210g, this.f682e, this.f687j + this.f689l, this.f688k, false, this.f683f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m919a(C0210g c0210g, int i, int i2, int i3, boolean z, int i4) {
        int i5;
        int i6 = i2 - this.f678a;
        boolean z2 = true;
        int i7 = i;
        while (i4 > 0) {
            if (i7 > 0 || z2) {
                int i8 = i7 % 10;
                c0210g.m845a(this.f690m[i8].f634i, i6, i3, 1.0f, 1.0f, 1.0f);
                i5 = i7 / 10;
                i6 = i8 != 1 ? i6 - (this.f678a - 2) : i6 - 4;
                z2 = z;
            } else {
                i5 = i7;
            }
            i4--;
            i7 = i5;
        }
    }
}
