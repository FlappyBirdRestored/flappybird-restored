package com.google.ads;

import com.google.ads.util.C0362e;
import com.google.ads.util.C0364g;

/* JADX INFO: renamed from: com.google.ads.bl */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0309bl implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0308bk f1021a;

    RunnableC0309bl(C0308bk c0308bk) {
        this.f1021a = c0308bk;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f1021a.m1298h()) {
            C0362e.m1382a(this.f1021a.f1014g);
            try {
                this.f1021a.f1014g.m1243a();
                C0364g.m1391a("Called destroy() for adapter with class: " + this.f1021a.f1014g.getClass().getName());
            } catch (Throwable th) {
                C0364g.m1396b("Error while destroying adapter (" + this.f1021a.m1296f() + "):", th);
            }
        }
    }
}
