package com.dotgears;

import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.dotgears.p */
/* JADX INFO: loaded from: classes.dex */
public class C0219p extends C0216m {

    /* JADX INFO: renamed from: a */
    public int f691a;

    /* JADX INFO: renamed from: b */
    public int f692b;

    /* JADX INFO: renamed from: g */
    public int f697g;

    /* JADX INFO: renamed from: h */
    public int f698h;

    /* JADX INFO: renamed from: i */
    public int f699i;

    /* JADX INFO: renamed from: j */
    public int f700j;

    /* JADX INFO: renamed from: k */
    public int f701k;

    /* JADX INFO: renamed from: m */
    public boolean f703m;

    /* JADX INFO: renamed from: e */
    public int f695e = 0;

    /* JADX INFO: renamed from: f */
    public int f696f = 0;

    /* JADX INFO: renamed from: l */
    public int f702l = 0;

    /* JADX INFO: renamed from: r */
    public C0212i f708r = C0210g.f583D.m855b("score_panel");

    /* JADX INFO: renamed from: q */
    public C0212i f707q = C0210g.f583D.m855b("new");

    /* JADX INFO: renamed from: s */
    public C0215l f709s = C0210g.f583D.f585B;

    /* JADX INFO: renamed from: c */
    public int f693c = this.f708r.f628b;

    /* JADX INFO: renamed from: d */
    public int f694d = this.f708r.f629c;

    /* JADX INFO: renamed from: n */
    public int f704n = (512 - this.f694d) >> 1;

    /* JADX INFO: renamed from: p */
    public C0221r f706p = new C0221r();

    /* JADX INFO: renamed from: o */
    public C0214k f705o = new C0214k();

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo826a(float f) {
        if (this.f673F) {
            if (!this.f706p.f732g) {
                this.f706p.m924a(f);
            }
            switch (this.f701k) {
                case C0467e.MapAttrs_mapType /* 0 */:
                    this.f692b = (int) this.f706p.f726a;
                    if (this.f706p.f732g) {
                        if (this.f702l <= 0) {
                            this.f701k = 2;
                        } else {
                            this.f701k = 1;
                            this.f706p.m925a(0.0f, this.f702l, 0, 0.5f);
                        }
                    }
                    break;
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    this.f695e = (int) this.f706p.f726a;
                    if (this.f706p.f732g) {
                        this.f701k = 2;
                        C0210g.f583D.m843a(this.f695e);
                        if (this.f695e > this.f696f) {
                            this.f696f = this.f695e;
                            this.f703m = true;
                        }
                        if (this.f695e >= this.f700j) {
                            this.f705o.m913a(0);
                        } else if (this.f695e >= this.f699i) {
                            this.f705o.m913a(1);
                        } else if (this.f695e >= this.f698h) {
                            this.f705o.m913a(2);
                        } else if (this.f695e >= this.f697g) {
                            this.f705o.m913a(3);
                        }
                        this.f705o.f663a = this.f691a + 32;
                        this.f705o.f664b = this.f692b + 44;
                    }
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    this.f705o.mo826a(f);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m920a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f702l = i;
        this.f696f = i2;
        this.f695e = 0;
        this.f697g = i3;
        this.f698h = i4;
        this.f699i = i5;
        this.f700j = i6;
        this.f673F = true;
        this.f674G = true;
        this.f703m = false;
        this.f691a = (288 - this.f693c) >> 1;
        this.f692b = 504;
        this.f706p.m925a(this.f692b, this.f704n, 11, 0.5f);
        this.f701k = 0;
        this.f705o.f673F = false;
        this.f705o.f674G = false;
    }

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo828a(C0210g c0210g) {
        if (this.f674G) {
            c0210g.m845a(this.f708r.f634i, this.f691a, this.f692b, 1.0f, 1.0f, 1.0f);
            this.f709s.m914a(c0210g, this.f695e, this.f691a + 210, this.f692b + 36, false, 10);
            this.f709s.m914a(c0210g, this.f696f, this.f691a + 210, this.f692b + 78, false, 10);
            if (this.f703m) {
                c0210g.m845a(this.f707q.f634i, this.f691a + 142, this.f692b + 60, 1.0f, 1.0f, 1.0f);
            }
            this.f705o.mo828a(c0210g);
        }
    }
}
