package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.p003a.C0256w;
import com.google.ads.p003a.EnumC0254u;
import com.google.ads.p003a.RunnableC0247n;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0364g;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.ads.cc */
/* JADX INFO: loaded from: classes.dex */
public class C0329cc implements InterfaceC0318bu {
    @Override // com.google.ads.InterfaceC0318bu
    /* JADX INFO: renamed from: a */
    public void mo1305a(C0256w c0256w, HashMap map, WebView webView) {
        EnumC0254u enumC0254u;
        String strReplaceAll = (String) map.get("url");
        String str = (String) map.get("type");
        String str2 = (String) map.get("afma_notify_dt");
        String str3 = (String) map.get("activation_overlay_url");
        String str4 = (String) map.get("check_packages");
        boolean zEquals = "1".equals(map.get("drt_include"));
        String str5 = (String) map.get("request_scenario");
        boolean zEquals2 = "1".equals(map.get("use_webview_loadurl"));
        if (EnumC0254u.OFFLINE_EMPTY.f870e.equals(str5)) {
            enumC0254u = EnumC0254u.OFFLINE_EMPTY;
        } else if (EnumC0254u.OFFLINE_USING_BUFFERED_ADS.f870e.equals(str5)) {
            enumC0254u = EnumC0254u.OFFLINE_USING_BUFFERED_ADS;
        } else {
            enumC0254u = EnumC0254u.ONLINE_USING_BUFFERED_ADS.f870e.equals(str5) ? EnumC0254u.ONLINE_USING_BUFFERED_ADS : EnumC0254u.ONLINE_SERVER_REQUEST;
        }
        C0364g.m1397c("Received ad url: <url: \"" + strReplaceAll + "\" type: \"" + str + "\" afmaNotifyDt: \"" + str2 + "\" activationOverlayUrl: \"" + str3 + "\" useWebViewLoadUrl: \"" + zEquals2 + "\">");
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(strReplaceAll)) {
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] strArrSplit = str4.split(",");
            BigInteger bit = bigInteger;
            for (int i = 0; i < strArrSplit.length; i++) {
                if (AdUtil.m1357a((Context) c0256w.m1117h().f1054c.m1381a(), strArrSplit[i])) {
                    bit = bit.setBit(i);
                }
            }
            String str6 = String.format(Locale.US, "%X", bit);
            strReplaceAll = strReplaceAll.replaceAll("%40installed_markets%40", str6);
            C0315br.m1302a().f1034a.m1380a(str6);
            C0364g.m1397c("Ad url modified to " + strReplaceAll);
        }
        RunnableC0247n runnableC0247nM1119j = c0256w.m1119j();
        if (runnableC0247nM1119j != null) {
            runnableC0247nM1119j.m1083d(zEquals);
            runnableC0247nM1119j.m1069a(enumC0254u);
            runnableC0247nM1119j.m1085e(zEquals2);
            runnableC0247nM1119j.m1084e(str3);
            runnableC0247nM1119j.m1082d(strReplaceAll);
        }
    }
}
