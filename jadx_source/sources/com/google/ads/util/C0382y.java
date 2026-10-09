package com.google.ads.util;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.ads.C0315br;
import com.google.ads.C0316bs;
import com.google.ads.p003a.C0227ad;
import com.google.ads.p003a.C0256w;
import com.google.ads.p003a.RunnableC0247n;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: com.google.ads.util.y */
/* JADX INFO: loaded from: classes.dex */
public class C0382y extends C0227ad {
    public C0382y(C0256w c0256w, Map map, boolean z, boolean z2) {
        super(c0256w, map, z, z2);
    }

    /* JADX INFO: renamed from: a */
    private static WebResourceResponse m1419a(String str, Context context) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            AdUtil.m1354a(httpURLConnection, context.getApplicationContext());
            httpURLConnection.connect();
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(AdUtil.m1349a(new InputStreamReader(httpURLConnection.getInputStream())).getBytes("UTF-8")));
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            if ("mraid.js".equalsIgnoreCase(new File(str).getName())) {
                RunnableC0247n runnableC0247nM1119j = this.f784a.m1119j();
                if (runnableC0247nM1119j != null) {
                    runnableC0247nM1119j.m1081c(true);
                } else {
                    this.f784a.m1105a(true);
                }
                C0316bs c0316bs = (C0316bs) ((C0315br) this.f784a.m1117h().f1055d.m1378a()).f1035b.m1378a();
                if (this.f784a.m1117h().m1304b()) {
                    String str2 = (String) c0316bs.f1043g.m1379a();
                    C0364g.m1391a("shouldInterceptRequest(" + str2 + ")");
                    return m1419a(str2, webView.getContext());
                }
                if (this.f785b) {
                    String str3 = (String) c0316bs.f1042f.m1379a();
                    C0364g.m1391a("shouldInterceptRequest(" + str3 + ")");
                    return m1419a(str3, webView.getContext());
                }
                String str4 = (String) c0316bs.f1041e.m1379a();
                C0364g.m1391a("shouldInterceptRequest(" + str4 + ")");
                return m1419a(str4, webView.getContext());
            }
        } catch (IOException e) {
            C0364g.m1400d("IOException fetching MRAID JS.", e);
        } catch (Throwable th) {
            C0364g.m1400d("An unknown error occurred fetching MRAID JS.", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
