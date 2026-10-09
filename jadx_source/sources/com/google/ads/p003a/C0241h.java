package com.google.ads.p003a;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.InterfaceC0318bu;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0364g;
import com.google.ads.util.InterfaceC0372o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.ads.a.h */
/* JADX INFO: loaded from: classes.dex */
public class C0241h {

    /* JADX INFO: renamed from: e */
    private static final C0241h f825e = new C0241h();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0372o f821a = new C0243j();

    /* JADX INFO: renamed from: b */
    public static final Map f822b = Collections.unmodifiableMap(new C0244k());

    /* JADX INFO: renamed from: c */
    public static final Map f823c = Collections.unmodifiableMap(new C0245l());

    /* JADX INFO: renamed from: d */
    public static final Map f824d = Collections.unmodifiableMap(new C0242i());

    /* JADX INFO: renamed from: a */
    public String m1036a(Uri uri, HashMap map) {
        if (!m1045c(uri)) {
            if (m1044b(uri)) {
                return uri.getPath();
            }
            C0364g.m1401e("Message was neither a GMSG nor an AMSG.");
            return null;
        }
        String host = uri.getHost();
        if (host == null) {
            C0364g.m1401e("An error occurred while parsing the AMSG parameters.");
            return null;
        }
        if (host.equals("launch")) {
            map.put("a", "intent");
            map.put("u", map.get("url"));
            map.remove("url");
            return "/open";
        }
        if (host.equals("closecanvas")) {
            return "/close";
        }
        if (host.equals("log")) {
            return "/log";
        }
        C0364g.m1401e("An error occurred while parsing the AMSG: " + uri.toString());
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m1037a(WebView webView) {
        m1039a(webView, "onshow", "{'version': 'afma-sdk-a-v6.4.1'}");
    }

    /* JADX INFO: renamed from: a */
    public void m1038a(WebView webView, String str) {
        C0364g.m1391a("Sending JS to a WebView: " + str);
        webView.loadUrl("javascript:" + str);
    }

    /* JADX INFO: renamed from: a */
    public void m1039a(WebView webView, String str, String str2) {
        if (str2 != null) {
            m1038a(webView, "AFMA_ReceiveMessage('" + str + "', " + str2 + ");");
        } else {
            m1038a(webView, "AFMA_ReceiveMessage('" + str + "');");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1040a(WebView webView, Map map) {
        m1039a(webView, "openableURLs", new JSONObject(map).toString());
    }

    /* JADX INFO: renamed from: a */
    public void m1041a(C0256w c0256w, Map map, Uri uri, WebView webView) {
        HashMap mapM1364b = AdUtil.m1364b(uri);
        if (mapM1364b == null) {
            C0364g.m1401e("An error occurred while parsing the message parameters.");
            return;
        }
        String strM1036a = m1036a(uri, mapM1364b);
        if (strM1036a == null) {
            C0364g.m1401e("An error occurred while parsing the message.");
            return;
        }
        InterfaceC0318bu interfaceC0318bu = (InterfaceC0318bu) map.get(strM1036a);
        if (interfaceC0318bu == null) {
            C0364g.m1401e("No AdResponse found, <message: " + strM1036a + ">");
        } else {
            interfaceC0318bu.mo1305a(c0256w, mapM1364b, webView);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m1042a(Uri uri) {
        if (uri == null || !uri.isHierarchical()) {
            return false;
        }
        return m1044b(uri) || m1045c(uri);
    }

    /* JADX INFO: renamed from: b */
    public void m1043b(WebView webView) {
        m1039a(webView, "onhide", null);
    }

    /* JADX INFO: renamed from: b */
    public boolean m1044b(Uri uri) {
        String authority;
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("gmsg") && (authority = uri.getAuthority()) != null && authority.equals("mobileads.google.com");
    }

    /* JADX INFO: renamed from: c */
    public boolean m1045c(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("admob");
    }
}
