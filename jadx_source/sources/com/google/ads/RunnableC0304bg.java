package com.google.ads;

import android.view.View;
import com.google.ads.util.C0364g;

/* JADX INFO: renamed from: com.google.ads.bg */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0304bg implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0308bk f991a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ View f992b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0305bh f993c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0301bd f994d;

    RunnableC0304bg(C0301bd c0301bd, C0308bk c0308bk, View view, C0305bh c0305bh) {
        this.f994d = c0301bd;
        this.f991a = c0308bk;
        this.f992b = view;
        this.f993c = c0305bh;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f994d.m1277b(this.f991a)) {
            C0364g.m1391a("Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called. Destroying the new ambassador and terminating mediation.");
        } else {
            this.f994d.f979a.m1097a(this.f992b, this.f991a, this.f993c, false);
        }
    }
}
