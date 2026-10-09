package com.dotgears.flappy;

import com.dotgears.C0210g;
import com.dotgears.C0212i;
import com.dotgears.C0216m;
import com.dotgears.C0221r;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.dotgears.flappy.f */
/* JADX INFO: loaded from: classes.dex */
public class C0209f extends C0216m {

    /* JADX INFO: renamed from: d */
    int f582d;

    /* JADX INFO: renamed from: b */
    public C0212i f580b = C0210g.f583D.m855b("text_ready");

    /* JADX INFO: renamed from: c */
    public C0212i f581c = C0210g.f583D.m855b("tutorial");

    /* JADX INFO: renamed from: a */
    public C0221r f579a = new C0221r();

    /* JADX INFO: renamed from: a */
    public void m841a() {
        this.f673F = true;
        this.f674G = true;
        this.f579a.m925a(0.0f, 1.0f, 0, 0.5f);
        this.f582d = 0;
    }

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo826a(float f) {
        this.f579a.m924a(f);
        switch (this.f582d) {
            case C0467e.MapAttrs_mapType /* 0 */:
                if (this.f579a.f732g) {
                    this.f582d = 1;
                }
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                if (this.f579a.f732g) {
                    this.f673F = true;
                    this.f674G = false;
                }
                break;
        }
    }

    @Override // com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo828a(C0210g c0210g) {
        c0210g.m850a(this.f580b, (288 - this.f580b.f628b) >> 1, 146, this.f579a.f726a);
        c0210g.m850a(this.f581c, (288 - this.f581c.f628b) >> 1, 220, this.f579a.f726a);
    }
}
