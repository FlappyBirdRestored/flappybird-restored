package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.SystemClock;
import com.google.ads.p003a.C0226ac;
import com.google.ads.p003a.C0256w;
import com.google.ads.util.C0362e;
import com.google.ads.util.C0364g;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.google.ads.bd */
/* JADX INFO: loaded from: classes.dex */
public class C0301bd {

    /* JADX INFO: renamed from: a */
    private final C0256w f979a;

    /* JADX INFO: renamed from: b */
    private C0308bk f980b;

    /* JADX INFO: renamed from: c */
    private final Object f981c;

    /* JADX INFO: renamed from: d */
    private Thread f982d;

    /* JADX INFO: renamed from: e */
    private final Object f983e;

    /* JADX INFO: renamed from: f */
    private boolean f984f;

    /* JADX INFO: renamed from: g */
    private final Object f985g;

    protected C0301bd() {
        this.f980b = null;
        this.f981c = new Object();
        this.f982d = null;
        this.f983e = new Object();
        this.f984f = false;
        this.f985g = new Object();
        this.f979a = null;
    }

    public C0301bd(C0256w c0256w) {
        this.f980b = null;
        this.f981c = new Object();
        this.f982d = null;
        this.f983e = new Object();
        this.f984f = false;
        this.f985g = new Object();
        C0362e.m1382a(c0256w);
        this.f979a = c0256w;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1271a(C0298ba c0298ba, C0256w c0256w) {
        if (c0298ba.m1264j() == null) {
            return true;
        }
        if (c0256w.m1117h().m1304b()) {
            if (c0298ba.m1264j().m1003a()) {
                return true;
            }
            C0364g.m1401e("InterstitialAd received a mediation response corresponding to a non-interstitial ad. Make sure you specify 'interstitial' as the ad-type in the mediation UI.");
            return false;
        }
        C0337g c0337gM1006c = ((C0226ac) c0256w.m1117h().f1058g.m1378a()).m1006c();
        if (c0298ba.m1264j().m1003a()) {
            C0364g.m1401e("AdView received a mediation response corresponding to an interstitial ad. Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView  (" + c0337gM1006c + ") in the ad-type field in the mediation UI.");
            return false;
        }
        C0337g c0337gM1006c2 = c0298ba.m1264j().m1006c();
        if (c0337gM1006c2 == c0337gM1006c) {
            return true;
        }
        C0364g.m1401e("Mediation server returned ad size: '" + c0337gM1006c2 + "', while the AdView was created with ad size: '" + c0337gM1006c + "'. Using the ad-size passed to the AdView on creation.");
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m1273a(String str, Activity activity, C0333d c0333d, C0305bh c0305bh, HashMap map, long j) {
        C0308bk c0308bk = new C0308bk(this, (C0226ac) this.f979a.m1117h().f1058g.m1378a(), c0305bh, str, c0333d, map);
        synchronized (c0308bk) {
            c0308bk.m1289a(activity);
            while (!c0308bk.m1292b() && j > 0) {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c0308bk.wait(j);
                    j -= SystemClock.elapsedRealtime() - jElapsedRealtime;
                } catch (InterruptedException e) {
                    C0364g.m1391a("Interrupted while waiting for ad network to load ad using adapter class: " + str);
                }
            }
            this.f979a.m1122m().m973a(c0308bk.m1294d());
            if (c0308bk.m1292b() && c0308bk.m1293c()) {
                ((Handler) C0315br.m1302a().f1036c.m1378a()).post(new RunnableC0304bg(this, c0308bk, this.f979a.m1117h().m1304b() ? null : c0308bk.m1295e(), c0305bh));
                return true;
            }
            if (!c0308bk.m1292b()) {
                C0364g.m1391a("Timeout occurred in adapter class: " + c0308bk.m1296f());
            }
            c0308bk.m1288a();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m1275b(C0298ba c0298ba, C0333d c0333d) {
        synchronized (this.f983e) {
            C0362e.m1383a(Thread.currentThread(), this.f982d);
        }
        List<C0341k> listM1260f = c0298ba.m1260f();
        long jM1256b = c0298ba.m1255a() ? c0298ba.m1256b() : 10000L;
        for (C0341k c0341k : listM1260f) {
            C0364g.m1391a("Looking to fetch ads from network: " + c0341k.m1336b());
            List<String> listM1337c = c0341k.m1337c();
            HashMap mapM1339e = c0341k.m1339e();
            List listM1338d = c0341k.m1338d();
            String strM1335a = c0341k.m1335a();
            String strM1336b = c0341k.m1336b();
            String strM1257c = c0298ba.m1257c();
            if (listM1338d == null) {
                listM1338d = c0298ba.m1261g();
            }
            C0305bh c0305bh = new C0305bh(strM1335a, strM1336b, strM1257c, listM1338d, c0298ba.m1262h(), c0298ba.m1263i());
            for (String str : listM1337c) {
                Activity activity = (Activity) this.f979a.m1117h().f1054c.m1381a();
                if (activity == null) {
                    C0364g.m1391a("Activity is null while mediating.  Terminating mediation thread.");
                    return;
                }
                this.f979a.m1122m().m976c();
                if (m1273a(str, activity, c0333d, c0305bh, mapM1339e, jM1256b)) {
                    return;
                }
                if (m1276b()) {
                    C0364g.m1391a("GWController.destroy() called. Terminating mediation thread.");
                    return;
                }
            }
        }
        ((Handler) C0315br.m1302a().f1036c.m1378a()).post(new RunnableC0303bf(this, c0298ba));
    }

    /* JADX INFO: renamed from: b */
    private boolean m1276b() {
        boolean z;
        synchronized (this.f985g) {
            z = this.f984f;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m1277b(C0308bk c0308bk) {
        boolean z;
        synchronized (this.f985g) {
            if (m1276b()) {
                c0308bk.m1288a();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public void m1278a(C0298ba c0298ba, C0333d c0333d) {
        synchronized (this.f983e) {
            if (m1280a()) {
                C0364g.m1397c("Mediation thread is not done executing previous mediation  request. Ignoring new mediation request");
                return;
            }
            if (c0298ba.m1258d()) {
                this.f979a.m1092a(c0298ba.m1259e());
                if (!this.f979a.m1127r()) {
                    this.f979a.m1115f();
                }
            } else if (this.f979a.m1127r()) {
                this.f979a.m1114e();
            }
            m1271a(c0298ba, this.f979a);
            this.f982d = new Thread(new RunnableC0302be(this, c0298ba, c0333d));
            this.f982d.start();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1279a(C0308bk c0308bk) {
        synchronized (this.f981c) {
            if (this.f980b != c0308bk) {
                if (this.f980b != null) {
                    this.f980b.m1288a();
                }
                this.f980b = c0308bk;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m1280a() {
        boolean z;
        synchronized (this.f983e) {
            z = this.f982d != null;
        }
        return z;
    }
}
