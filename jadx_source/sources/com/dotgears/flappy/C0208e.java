package com.dotgears.flappy;

import com.dotgears.C0210g;
import com.dotgears.C0212i;
import com.dotgears.C0216m;
import com.dotgears.C0221r;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.dotgears.flappy.e */
/* JADX INFO: loaded from: classes.dex */
public class C0208e extends C0216m {

    /* JADX INFO: renamed from: c */
    public int f575c;

    /* JADX INFO: renamed from: d */
    public float f576d;

    /* JADX INFO: renamed from: e */
    public float f577e;

    /* JADX INFO: renamed from: f */
    public int f578f;

    /* JADX INFO: renamed from: b */
    public C0212i f574b = C0210g.f583D.m855b("text_game_over");

    /* JADX INFO: renamed from: a */
    public C0221r f573a = new C0221r();

    /* JADX INFO: renamed from: a */
    public void m840a() {
        this.f673F = true;
        this.f674G = true;
        this.f573a.m925a(0.0f, 1.0f, 11, 1.0f);
        this.f575c = -1;
        this.f576d = -2.0f;
        this.f577e = 0.25f;
        this.f578f = 0;
        C0206c.f583D.m859c(10, 0);
    }

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo826a(float f) {
        this.f573a.m924a(f);
        if (this.f575c < 0) {
            this.f575c = (int) (this.f575c + this.f576d);
            this.f576d += this.f577e;
        } else {
            this.f575c = 0;
        }
        switch (this.f578f) {
            case C0467e.MapAttrs_mapType /* 0 */:
                if (this.f573a.f732g) {
                    this.f578f = 1;
                    C0210g.f583D.f586C.m920a(C0210g.f583D.f612y, C0210g.f583D.f613z, 10, 20, 30, 40);
                    C0206c.f583D.m859c(10, 0);
                }
                break;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                if (C0210g.f583D.f586C.f701k == 2) {
                    this.f578f = 2;
                }
                break;
        }
    }

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo828a(C0210g c0210g) {
        c0210g.m850a(this.f574b, (288 - this.f574b.f628b) >> 1, this.f575c + 130, this.f573a.f726a);
    }
}
