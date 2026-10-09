package com.google.ads.p003a;

import android.os.Handler;
import com.google.ads.C0315br;
import com.google.ads.util.C0364g;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.ads.a.d */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0237d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final WeakReference f812a;

    public RunnableC0237d(C0236c c0236c) {
        this.f812a = new WeakReference(c0236c);
    }

    /* JADX INFO: renamed from: a */
    public void m1027a() {
        ((Handler) C0315br.m1302a().f1036c.m1378a()).postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public void run() {
        C0236c c0236c = (C0236c) this.f812a.get();
        if (c0236c == null) {
            C0364g.m1399d("The video must be gone, so cancelling the timeupdate task.");
        } else {
            c0236c.m1026f();
            ((Handler) C0315br.m1302a().f1036c.m1378a()).postDelayed(this, 250L);
        }
    }
}
