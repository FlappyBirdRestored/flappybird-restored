package com.google.ads.p003a;

import com.google.ads.AdView;

/* JADX INFO: renamed from: com.google.ads.a.b */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0235b implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0223a f803a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0223a f804b;

    RunnableC0235b(C0223a c0223a, C0223a c0223a2) {
        this.f804b = c0223a;
        this.f803a = c0223a2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((AdView) this.f804b.f813a.f1061j.m1378a()).removeView(this.f803a);
    }
}
