package com.google.ads;

import android.webkit.WebView;
import com.google.ads.p003a.C0238e;
import com.google.ads.p003a.C0256w;
import com.google.ads.util.C0364g;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.bz */
/* JADX INFO: loaded from: classes.dex */
public class C0323bz implements InterfaceC0318bu {
    @Override // com.google.ads.InterfaceC0318bu
    /* JADX INFO: renamed from: a */
    public void mo1305a(C0256w c0256w, HashMap map, WebView webView) {
        if (webView instanceof C0238e) {
            ((C0238e) webView).setCustomClose("1".equals(map.get("custom_close")));
        } else {
            C0364g.m1395b("Trying to set a custom close icon on a WebView that isn't an AdWebView");
        }
    }
}
