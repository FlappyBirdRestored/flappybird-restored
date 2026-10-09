package com.google.ads;

import android.app.Activity;
import com.google.ads.p004b.AbstractC0294g;
import com.google.ads.p004b.C0287a;
import com.google.ads.p004b.C0295h;
import com.google.ads.p004b.InterfaceC0289b;
import com.google.ads.p004b.InterfaceC0290c;
import com.google.ads.p004b.InterfaceC0292e;
import com.google.ads.p004b.InterfaceC0297j;
import com.google.ads.util.C0364g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.ads.bm */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0310bm implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C0308bk f1022a;

    /* JADX INFO: renamed from: b */
    private final String f1023b;

    /* JADX INFO: renamed from: c */
    private final C0333d f1024c;

    /* JADX INFO: renamed from: d */
    private final HashMap f1025d;

    /* JADX INFO: renamed from: e */
    private final boolean f1026e;

    /* JADX INFO: renamed from: f */
    private final WeakReference f1027f;

    public RunnableC0310bm(C0308bk c0308bk, Activity activity, String str, C0333d c0333d, HashMap map) {
        this.f1022a = c0308bk;
        this.f1023b = str;
        this.f1027f = new WeakReference(activity);
        this.f1024c = c0333d;
        this.f1025d = new HashMap(map);
        this.f1026e = m1301a(this.f1025d);
    }

    /* JADX INFO: renamed from: a */
    private void m1299a(InterfaceC0289b interfaceC0289b) throws C0295h, C0311bn {
        AbstractC0294g abstractC0294g;
        Activity activity = (Activity) this.f1027f.get();
        if (activity == null) {
            throw new C0311bn("Activity became null while trying to instantiate adapter.");
        }
        this.f1022a.m1290a(interfaceC0289b);
        Class clsM1245c = interfaceC0289b.m1245c();
        if (clsM1245c != null) {
            AbstractC0294g abstractC0294g2 = (AbstractC0294g) clsM1245c.newInstance();
            abstractC0294g2.m1249a(this.f1025d);
            abstractC0294g = abstractC0294g2;
        } else {
            abstractC0294g = null;
        }
        Class clsM1244b = interfaceC0289b.m1244b();
        InterfaceC0297j interfaceC0297j = clsM1244b != null ? (InterfaceC0297j) this.f1024c.m1318a(clsM1244b) : null;
        C0287a c0287a = new C0287a(this.f1024c, activity, this.f1026e);
        if (this.f1022a.f1008a.m1003a()) {
            if (!(interfaceC0289b instanceof InterfaceC0292e)) {
                throw new C0311bn("Adapter " + this.f1023b + " doesn't support the MediationInterstitialAdapter interface.");
            }
            ((InterfaceC0292e) interfaceC0289b).m1247a(new C0313bp(this.f1022a), activity, abstractC0294g, c0287a, interfaceC0297j);
        } else {
            if (!(interfaceC0289b instanceof InterfaceC0290c)) {
                throw new C0311bn("Adapter " + this.f1023b + " doesn't support the MediationBannerAdapter interface");
            }
            ((InterfaceC0290c) interfaceC0289b).m1246a(new C0312bo(this.f1022a), activity, abstractC0294g, this.f1022a.f1008a.m1006c(), c0287a, interfaceC0297j);
        }
        this.f1022a.m1297g();
    }

    /* JADX INFO: renamed from: a */
    private void m1300a(String str, Throwable th, EnumC0307bj enumC0307bj) {
        C0364g.m1396b(str, th);
        this.f1022a.m1291a(false, enumC0307bj);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1301a(Map map) {
        String str = (String) map.remove("gwhirl_share_location");
        if ("1".equals(str)) {
            return true;
        }
        if (str != null && !"0".equals(str)) {
            C0364g.m1395b("Received an illegal value, '" + str + "', for the special share location parameter from mediation server (expected '0' or '1'). Will not share the location.");
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0364g.m1391a("Trying to instantiate: " + this.f1023b);
            m1299a((InterfaceC0289b) C0306bi.m1285a(this.f1023b, InterfaceC0289b.class));
        } catch (ClassNotFoundException e) {
            m1300a("Cannot find adapter class '" + this.f1023b + "'. Did you link the ad network's mediation adapter? Skipping ad network.", e, EnumC0307bj.NOT_FOUND);
        } catch (Throwable th) {
            m1300a("Error while creating adapter and loading ad from ad network. Skipping ad network.", th, EnumC0307bj.EXCEPTION);
        }
    }
}
