package com.google.ads.p003a;

import android.content.Context;
import com.google.ads.C0337g;

/* JADX INFO: renamed from: com.google.ads.a.ac */
/* JADX INFO: loaded from: classes.dex */
public class C0226ac {

    /* JADX INFO: renamed from: a */
    public static final C0226ac f779a = new C0226ac(null, true);

    /* JADX INFO: renamed from: b */
    private C0337g f780b;

    /* JADX INFO: renamed from: c */
    private boolean f781c;

    /* JADX INFO: renamed from: d */
    private final boolean f782d;

    private C0226ac(C0337g c0337g, boolean z) {
        this.f780b = c0337g;
        this.f782d = z;
    }

    /* JADX INFO: renamed from: a */
    public static C0226ac m1000a(C0337g c0337g) {
        return m1001a(c0337g, null);
    }

    /* JADX INFO: renamed from: a */
    public static C0226ac m1001a(C0337g c0337g, Context context) {
        return new C0226ac(C0337g.m1324a(c0337g, context), false);
    }

    /* JADX INFO: renamed from: a */
    public void m1002a(boolean z) {
        this.f781c = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1003a() {
        return this.f782d;
    }

    /* JADX INFO: renamed from: b */
    public void m1004b(C0337g c0337g) {
        if (this.f782d) {
            return;
        }
        this.f780b = c0337g;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1005b() {
        return this.f781c;
    }

    /* JADX INFO: renamed from: c */
    public C0337g m1006c() {
        return this.f780b;
    }
}
