package com.google.ads.util;

import com.google.ads.C0317bt;
import com.google.ads.C0337g;
import com.google.ads.p003a.C0223a;
import com.google.ads.p003a.C0238e;

/* JADX INFO: renamed from: com.google.ads.util.c */
/* JADX INFO: loaded from: classes.dex */
public class C0360c extends C0238e {
    public C0360c(C0317bt c0317bt, C0337g c0337g) {
        super(c0317bt, c0337g);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f813a.f1056e.m1378a() != null) {
            return !((C0223a) this.f813a.f1056e.m1378a()).m962b();
        }
        return super.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        if (this.f813a.f1056e.m1378a() != null) {
            return !((C0223a) this.f813a.f1056e.m1378a()).m962b();
        }
        return super.canScrollVertically(i);
    }
}
