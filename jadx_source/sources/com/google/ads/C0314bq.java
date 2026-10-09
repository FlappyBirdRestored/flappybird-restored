package com.google.ads;

import com.google.ads.p003a.RunnableC0247n;
import com.google.ads.util.AbstractC0353aa;
import com.google.ads.util.C0356ad;
import com.google.ads.util.C0357ae;

/* JADX INFO: renamed from: com.google.ads.bq */
/* JADX INFO: loaded from: classes.dex */
public final class C0314bq extends AbstractC0353aa {

    /* JADX INFO: renamed from: a */
    public final C0356ad f1030a;

    /* JADX INFO: renamed from: c */
    public final C0357ae f1032c = new C0357ae(this, "disableNativeScroll", false);

    /* JADX INFO: renamed from: b */
    public final C0357ae f1031b = new C0357ae(this, "adLoader", new RunnableC0247n(this));

    public C0314bq(C0317bt c0317bt) {
        this.f1030a = new C0356ad(this, "slotState", c0317bt);
    }
}
