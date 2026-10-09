package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.p003a.C0226ac;
import com.google.ads.p004b.InterfaceC0289b;
import com.google.ads.util.C0362e;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.bk */
/* JADX INFO: loaded from: classes.dex */
public class C0308bk {

    /* JADX INFO: renamed from: a */
    final C0226ac f1008a;

    /* JADX INFO: renamed from: b */
    private final C0305bh f1009b;

    /* JADX INFO: renamed from: c */
    private boolean f1010c;

    /* JADX INFO: renamed from: d */
    private boolean f1011d;

    /* JADX INFO: renamed from: e */
    private EnumC0307bj f1012e;

    /* JADX INFO: renamed from: f */
    private final C0301bd f1013f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0289b f1014g;

    /* JADX INFO: renamed from: h */
    private boolean f1015h;

    /* JADX INFO: renamed from: i */
    private boolean f1016i;

    /* JADX INFO: renamed from: j */
    private View f1017j;

    /* JADX INFO: renamed from: k */
    private final String f1018k;

    /* JADX INFO: renamed from: l */
    private final C0333d f1019l;

    /* JADX INFO: renamed from: m */
    private final HashMap f1020m;

    public C0308bk(C0301bd c0301bd, C0226ac c0226ac, C0305bh c0305bh, String str, C0333d c0333d, HashMap map) {
        C0362e.m1385a(TextUtils.isEmpty(str));
        this.f1013f = c0301bd;
        this.f1008a = c0226ac;
        this.f1009b = c0305bh;
        this.f1018k = str;
        this.f1019l = c0333d;
        this.f1020m = map;
        this.f1010c = false;
        this.f1011d = false;
        this.f1012e = null;
        this.f1014g = null;
        this.f1015h = false;
        this.f1016i = false;
        this.f1017j = null;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1288a() {
        C0362e.m1386a(this.f1015h, "destroy() called but startLoadAdTask has not been called.");
        ((Handler) C0315br.m1302a().f1036c.m1378a()).post(new RunnableC0309bl(this));
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1289a(Activity activity) {
        C0362e.m1387b(this.f1015h, "startLoadAdTask has already been called.");
        this.f1015h = true;
        ((Handler) C0315br.m1302a().f1036c.m1378a()).post(new RunnableC0310bm(this, activity, this.f1018k, this.f1019l, this.f1020m));
    }

    /* JADX INFO: renamed from: a */
    synchronized void m1290a(InterfaceC0289b interfaceC0289b) {
        this.f1014g = interfaceC0289b;
    }

    /* JADX INFO: renamed from: a */
    synchronized void m1291a(boolean z, EnumC0307bj enumC0307bj) {
        this.f1011d = z;
        this.f1010c = true;
        this.f1012e = enumC0307bj;
        notify();
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m1292b() {
        return this.f1010c;
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m1293c() {
        C0362e.m1386a(this.f1010c, "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false.");
        return this.f1011d;
    }

    /* JADX INFO: renamed from: d */
    public synchronized EnumC0307bj m1294d() {
        return this.f1012e == null ? EnumC0307bj.TIMEOUT : this.f1012e;
    }

    /* JADX INFO: renamed from: e */
    public synchronized View m1295e() {
        C0362e.m1386a(this.f1010c, "getAdView() called when isLoadAdTaskDone() is false.");
        return this.f1017j;
    }

    /* JADX INFO: renamed from: f */
    public synchronized String m1296f() {
        return this.f1014g != null ? this.f1014g.getClass().getName() : "\"adapter was not created.\"";
    }

    /* JADX INFO: renamed from: g */
    synchronized void m1297g() {
        this.f1016i = true;
    }

    /* JADX INFO: renamed from: h */
    synchronized boolean m1298h() {
        return this.f1016i;
    }
}
