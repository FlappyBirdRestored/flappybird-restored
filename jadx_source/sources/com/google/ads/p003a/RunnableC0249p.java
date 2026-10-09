package com.google.ads.p003a;

import com.google.ads.C0298ba;
import com.google.ads.C0317bt;

/* JADX INFO: renamed from: com.google.ads.a.p */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0249p implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0298ba f852a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ RunnableC0247n f853b;

    RunnableC0249p(RunnableC0247n runnableC0247n, C0298ba c0298ba) {
        this.f853b = runnableC0247n;
        this.f852a = c0298ba;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f853b.f835i != null) {
            this.f853b.f835i.stopLoading();
            this.f853b.f835i.destroy();
        }
        ((C0256w) ((C0317bt) this.f853b.f836j.f1030a.m1378a()).f1053b.m1378a()).m1102a(this.f853b.f840n);
        if (this.f853b.f841o != null) {
            ((C0226ac) ((C0317bt) this.f853b.f836j.f1030a.m1378a()).f1058g.m1378a()).m1004b(this.f853b.f841o);
        }
        ((C0256w) ((C0317bt) this.f853b.f836j.f1030a.m1378a()).f1053b.m1378a()).m1098a(this.f852a);
    }
}
