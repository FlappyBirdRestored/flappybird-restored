package com.google.ads.p003a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.C0270ak;
import com.google.ads.C0271al;
import com.google.ads.C0317bt;
import com.google.ads.EnumC0335e;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0364g;
import com.google.ads.util.C0382y;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.ads.a.ad */
/* JADX INFO: loaded from: classes.dex */
public class C0227ad extends WebViewClient {

    /* JADX INFO: renamed from: c */
    private static final C0241h f783c = (C0241h) C0241h.f821a.mo1047b();

    /* JADX INFO: renamed from: a */
    protected C0256w f784a;

    /* JADX INFO: renamed from: d */
    private final Map f786d;

    /* JADX INFO: renamed from: e */
    private final boolean f787e;

    /* JADX INFO: renamed from: f */
    private boolean f788f;

    /* JADX INFO: renamed from: g */
    private boolean f789g;

    /* JADX INFO: renamed from: b */
    protected boolean f785b = false;

    /* JADX INFO: renamed from: h */
    private boolean f790h = false;

    /* JADX INFO: renamed from: i */
    private boolean f791i = false;

    public C0227ad(C0256w c0256w, Map map, boolean z, boolean z2) {
        this.f784a = c0256w;
        this.f786d = map;
        this.f787e = z;
        this.f789g = z2;
    }

    /* JADX INFO: renamed from: a */
    public static C0227ad m1007a(C0256w c0256w, Map map, boolean z, boolean z2) {
        return AdUtil.f1336a >= 11 ? new C0382y(c0256w, map, z, z2) : new C0227ad(c0256w, map, z, z2);
    }

    /* JADX INFO: renamed from: a */
    public void m1008a(boolean z) {
        this.f785b = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1009a() {
        return this.f788f;
    }

    /* JADX INFO: renamed from: b */
    public void m1010b(boolean z) {
        this.f789g = z;
    }

    /* JADX INFO: renamed from: c */
    public void m1011c(boolean z) {
        this.f790h = z;
    }

    /* JADX INFO: renamed from: d */
    public void m1012d(boolean z) {
        this.f791i = z;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.f788f = false;
        if (this.f790h) {
            RunnableC0247n runnableC0247nM1119j = this.f784a.m1119j();
            if (runnableC0247nM1119j != null) {
                runnableC0247nM1119j.m1077b();
            } else {
                C0364g.m1391a("adLoader was null while trying to setFinishedLoadingHtml().");
            }
            this.f790h = false;
        }
        if (this.f791i) {
            f783c.m1037a(webView);
            this.f791i = false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f788f = true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f788f = false;
        RunnableC0247n runnableC0247nM1119j = this.f784a.m1119j();
        if (runnableC0247nM1119j != null) {
            runnableC0247nM1119j.m1071a(EnumC0335e.NETWORK_ERROR);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uriM1186a;
        try {
            C0364g.m1391a("shouldOverrideUrlLoading(\"" + str + "\")");
            Uri uri = Uri.parse(str);
            if (f783c.m1042a(uri)) {
                f783c.m1041a(this.f784a, this.f786d, uri, webView);
                return true;
            }
            if (this.f789g) {
                if (AdUtil.m1359a(uri)) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                HashMap map = new HashMap();
                map.put("u", str);
                AdActivity.m926a(this.f784a, new C0257x("intent", map));
                return true;
            }
            if (!this.f787e) {
                C0364g.m1401e("URL is not a GMSG and can't handle URL: " + str);
                return true;
            }
            try {
                C0317bt c0317btM1117h = this.f784a.m1117h();
                Context context = (Context) c0317btM1117h.f1057f.m1378a();
                C0270ak c0270ak = (C0270ak) c0317btM1117h.f1070s.m1379a();
                uriM1186a = (c0270ak == null || !c0270ak.m1188a(uri)) ? uri : c0270ak.m1186a(uri, context);
            } catch (C0271al e) {
                C0364g.m1401e("Unable to append parameter to URL: " + str);
            }
            HashMap map2 = new HashMap();
            map2.put("u", uriM1186a.toString());
            AdActivity.m926a(this.f784a, new C0257x("intent", map2));
            return true;
        } catch (Throwable th) {
            C0364g.m1400d("An unknown error occurred in shouldOverrideUrlLoading.", th);
        }
    }
}
