package com.google.ads;

import com.google.ads.p003a.C0256w;
import com.google.ads.util.C0364g;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.ads.p */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0346p implements Runnable {

    /* JADX INFO: renamed from: a */
    private WeakReference f1137a;

    public RunnableC0346p(C0256w c0256w) {
        this.f1137a = new WeakReference(c0256w);
    }

    @Override // java.lang.Runnable
    public void run() {
        C0256w c0256w = (C0256w) this.f1137a.get();
        if (c0256w == null) {
            C0364g.m1391a("The ad must be gone, so cancelling the refresh timer.");
        } else {
            c0256w.m1133x();
        }
    }
}
