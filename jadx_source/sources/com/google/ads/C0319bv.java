package com.google.ads;

import android.webkit.WebView;
import com.google.ads.p003a.C0256w;
import com.google.ads.util.C0364g;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.bv */
/* JADX INFO: loaded from: classes.dex */
public class C0319bv implements InterfaceC0318bu {
    @Override // com.google.ads.InterfaceC0318bu
    /* JADX INFO: renamed from: a */
    public void mo1305a(C0256w c0256w, HashMap map, WebView webView) {
        String str = (String) map.get("name");
        if (str == null) {
            C0364g.m1395b("Error: App event with no name parameter.");
        } else {
            c0256w.m1103a(str, (String) map.get("info"));
        }
    }
}
