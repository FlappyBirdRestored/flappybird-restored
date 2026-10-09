package com.google.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.util.AbstractC0353aa;
import com.google.ads.util.C0356ad;
import com.google.ads.util.C0357ae;

/* JADX INFO: renamed from: com.google.ads.br */
/* JADX INFO: loaded from: classes.dex */
public class C0315br extends AbstractC0353aa {

    /* JADX INFO: renamed from: d */
    private static final C0315br f1033d = new C0315br();

    /* JADX INFO: renamed from: a */
    public final C0357ae f1034a = new C0357ae(this, "marketPackages", null);

    /* JADX INFO: renamed from: b */
    public final C0356ad f1035b = new C0356ad(this, "constants", new C0316bs());

    /* JADX INFO: renamed from: c */
    public final C0356ad f1036c = new C0356ad(this, "uiHandler", new Handler(Looper.getMainLooper()));

    private C0315br() {
    }

    /* JADX INFO: renamed from: a */
    public static C0315br m1302a() {
        return f1033d;
    }
}
