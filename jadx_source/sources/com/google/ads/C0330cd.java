package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.p003a.C0223a;
import com.google.ads.p003a.C0226ac;
import com.google.ads.p003a.C0238e;
import com.google.ads.p003a.C0256w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0357ae;
import com.google.ads.util.C0364g;
import com.google.ads.util.C0373p;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.cd */
/* JADX INFO: loaded from: classes.dex */
public class C0330cd implements InterfaceC0318bu {
    /* JADX INFO: renamed from: a */
    private void m1313a(HashMap map, String str, C0357ae c0357ae) {
        try {
            String str2 = (String) map.get(str);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            c0357ae.m1380a(Integer.valueOf(str2));
        } catch (NumberFormatException e) {
            C0364g.m1391a("Could not parse \"" + str + "\" constant.");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1314b(HashMap map, String str, C0357ae c0357ae) {
        try {
            String str2 = (String) map.get(str);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            c0357ae.m1380a(Long.valueOf(str2));
        } catch (NumberFormatException e) {
            C0364g.m1391a("Could not parse \"" + str + "\" constant.");
        }
    }

    /* JADX INFO: renamed from: c */
    private void m1315c(HashMap map, String str, C0357ae c0357ae) {
        String str2 = (String) map.get(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        c0357ae.m1380a(str2);
    }

    @Override // com.google.ads.InterfaceC0318bu
    /* JADX INFO: renamed from: a */
    public void mo1305a(C0256w c0256w, HashMap map, WebView webView) {
        C0317bt c0317btM1117h = c0256w.m1117h();
        C0316bs c0316bs = (C0316bs) ((C0315br) c0317btM1117h.f1055d.m1378a()).f1035b.m1378a();
        m1315c(map, "as_domains", c0316bs.f1037a);
        m1315c(map, "bad_ad_report_path", c0316bs.f1044h);
        m1313a(map, "min_hwa_banner", c0316bs.f1038b);
        m1313a(map, "min_hwa_activation_overlay", c0316bs.f1039c);
        m1313a(map, "min_hwa_overlay", c0316bs.f1040d);
        m1315c(map, "mraid_banner_path", c0316bs.f1041e);
        m1315c(map, "mraid_expanded_banner_path", c0316bs.f1042f);
        m1315c(map, "mraid_interstitial_path", c0316bs.f1043g);
        m1314b(map, "ac_max_size", c0316bs.f1045i);
        m1314b(map, "ac_padding", c0316bs.f1046j);
        m1314b(map, "ac_total_quota", c0316bs.f1047k);
        m1314b(map, "db_total_quota", c0316bs.f1048l);
        m1314b(map, "db_quota_per_origin", c0316bs.f1049m);
        m1314b(map, "db_quota_step_size", c0316bs.f1050n);
        C0238e c0238eM1120k = c0256w.m1120k();
        if (AdUtil.f1336a >= 11) {
            C0373p.m1414a(c0238eM1120k.getSettings(), c0317btM1117h);
            C0373p.m1414a(webView.getSettings(), c0317btM1117h);
        }
        if (!((C0226ac) c0317btM1117h.f1058g.m1378a()).m1003a()) {
            boolean zM1034k = c0238eM1120k.m1034k();
            boolean z = AdUtil.f1336a < ((Integer) c0316bs.f1038b.m1379a()).intValue();
            if (!z && zM1034k) {
                C0364g.m1391a("Re-enabling hardware acceleration for a banner after reading constants.");
                c0238eM1120k.m1031h();
            } else if (z && !zM1034k) {
                C0364g.m1391a("Disabling hardware acceleration for a banner after reading constants.");
                c0238eM1120k.m1030g();
            }
        }
        C0223a c0223a = (C0223a) c0317btM1117h.f1056e.m1378a();
        if (!((C0226ac) c0317btM1117h.f1058g.m1378a()).m1005b() && c0223a != null) {
            boolean zK = c0223a.m1034k();
            boolean z2 = AdUtil.f1336a < ((Integer) c0316bs.f1039c.m1379a()).intValue();
            if (!z2 && zK) {
                C0364g.m1391a("Re-enabling hardware acceleration for an activation overlay after reading constants.");
                c0223a.m1031h();
            } else if (z2 && !zK) {
                C0364g.m1391a("Disabling hardware acceleration for an activation overlay after reading constants.");
                c0223a.m1030g();
            }
        }
        String str = (String) c0316bs.f1037a.m1379a();
        C0270ak c0270ak = (C0270ak) c0317btM1117h.f1070s.m1379a();
        if (c0270ak != null && !TextUtils.isEmpty(str)) {
            c0270ak.m1187a(str);
        }
        c0316bs.f1051o.m1380a(true);
    }
}
