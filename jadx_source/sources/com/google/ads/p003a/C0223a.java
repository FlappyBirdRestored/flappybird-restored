package com.google.ads.p003a;

import android.os.Handler;
import com.google.ads.C0315br;
import com.google.ads.C0316bs;
import com.google.ads.C0317bt;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0364g;

/* JADX INFO: renamed from: com.google.ads.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0223a extends C0238e {

    /* JADX INFO: renamed from: b */
    private volatile boolean f758b;

    /* JADX INFO: renamed from: c */
    private boolean f759c;

    /* JADX INFO: renamed from: d */
    private int f760d;

    /* JADX INFO: renamed from: e */
    private int f761e;

    /* JADX INFO: renamed from: f */
    private final C0227ad f762f;

    public C0223a(C0317bt c0317bt) {
        super(c0317bt, null);
        this.f758b = true;
        this.f759c = true;
        this.f760d = 0;
        this.f761e = 0;
        if (AdUtil.f1336a < ((Integer) ((C0316bs) ((C0315br) c0317bt.f1055d.m1378a()).f1035b.m1378a()).f1039c.m1379a()).intValue()) {
            C0364g.m1391a("Disabling hardware acceleration for an activation overlay.");
            m1030g();
        }
        this.f762f = C0227ad.m1007a((C0256w) c0317bt.f1053b.m1378a(), C0241h.f823c, true, true);
        setWebViewClient(this.f762f);
    }

    /* JADX INFO: renamed from: a */
    public boolean m961a() {
        return this.f758b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m962b() {
        return this.f759c;
    }

    /* JADX INFO: renamed from: c */
    public int m963c() {
        return this.f761e;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return false;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public int m964d() {
        return this.f760d;
    }

    /* JADX INFO: renamed from: e */
    public C0227ad m965e() {
        return this.f762f;
    }

    public void setOverlayActivated(boolean z) {
        this.f759c = z;
    }

    public void setOverlayEnabled(boolean z) {
        if (!z) {
            ((Handler) C0315br.m1302a().f1036c.m1378a()).post(new RunnableC0235b(this, this));
        }
        this.f758b = z;
    }

    public void setXPosition(int i) {
        this.f760d = i;
    }

    public void setYPosition(int i) {
        this.f761e = i;
    }
}
