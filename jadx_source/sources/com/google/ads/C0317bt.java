package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.p003a.C0223a;
import com.google.ads.p003a.C0226ac;
import com.google.ads.p003a.C0256w;
import com.google.ads.util.AbstractC0353aa;
import com.google.ads.util.C0356ad;
import com.google.ads.util.C0357ae;
import com.google.ads.util.C0358af;

/* JADX INFO: renamed from: com.google.ads.bt */
/* JADX INFO: loaded from: classes.dex */
public class C0317bt extends AbstractC0353aa {

    /* JADX INFO: renamed from: a */
    public final C0356ad f1052a;

    /* JADX INFO: renamed from: b */
    public final C0356ad f1053b;

    /* JADX INFO: renamed from: c */
    public final C0358af f1054c;

    /* JADX INFO: renamed from: d */
    public final C0356ad f1055d;

    /* JADX INFO: renamed from: e */
    public final C0356ad f1056e;

    /* JADX INFO: renamed from: f */
    public final C0356ad f1057f;

    /* JADX INFO: renamed from: g */
    public final C0356ad f1058g;

    /* JADX INFO: renamed from: h */
    public final C0356ad f1059h;

    /* JADX INFO: renamed from: i */
    public final C0356ad f1060i;

    /* JADX INFO: renamed from: j */
    public final C0356ad f1061j;

    /* JADX INFO: renamed from: k */
    public final C0356ad f1062k;

    /* JADX INFO: renamed from: l */
    public final C0357ae f1063l = new C0357ae(this, "currentAd", null);

    /* JADX INFO: renamed from: m */
    public final C0357ae f1064m = new C0357ae(this, "nextAd", null);

    /* JADX INFO: renamed from: o */
    public final C0357ae f1066o = new C0357ae(this, "adListener");

    /* JADX INFO: renamed from: p */
    public final C0357ae f1067p = new C0357ae(this, "appEventListener");

    /* JADX INFO: renamed from: q */
    public final C0357ae f1068q = new C0357ae(this, "swipeableEventListener");

    /* JADX INFO: renamed from: r */
    public final C0357ae f1069r = new C0357ae(this, "spamSignals", null);

    /* JADX INFO: renamed from: s */
    public final C0357ae f1070s = new C0357ae(this, "spamSignalsUtil", null);

    /* JADX INFO: renamed from: t */
    public final C0357ae f1071t = new C0357ae(this, "usesManualImpressions", false);

    /* JADX INFO: renamed from: n */
    public final C0357ae f1065n = new C0357ae(this, "adSizes", null);

    public C0317bt(C0315br c0315br, InterfaceC0222a interfaceC0222a, AdView adView, C0339i c0339i, String str, Activity activity, Context context, ViewGroup viewGroup, C0226ac c0226ac, C0256w c0256w) {
        C0223a c0223a = null;
        this.f1055d = new C0356ad(this, "appState", c0315br);
        this.f1052a = new C0356ad(this, "ad", interfaceC0222a);
        this.f1061j = new C0356ad(this, "adView", adView);
        this.f1058g = new C0356ad(this, "adType", c0226ac);
        this.f1059h = new C0356ad(this, "adUnitId", str);
        this.f1054c = new C0358af(this, "activity", activity);
        this.f1062k = new C0356ad(this, "interstitialAd", c0339i);
        this.f1060i = new C0356ad(this, "bannerContainer", viewGroup);
        this.f1057f = new C0356ad(this, "applicationContext", context);
        this.f1053b = new C0356ad(this, "adManager", c0256w);
        if (c0226ac != null && c0226ac.m1005b()) {
            c0223a = new C0223a(this);
        }
        this.f1056e = new C0356ad(this, "activationOverlay", c0223a);
    }

    /* JADX INFO: renamed from: a */
    public boolean m1303a() {
        return !m1304b();
    }

    /* JADX INFO: renamed from: b */
    public boolean m1304b() {
        return ((C0226ac) this.f1058g.m1378a()).m1003a();
    }
}
