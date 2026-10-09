package com.google.ads;

import android.webkit.WebView;
import com.google.ads.p003a.C0256w;
import com.google.ads.p003a.C0257x;
import com.google.ads.util.C0364g;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.cf */
/* JADX INFO: loaded from: classes.dex */
public class C0332cf implements InterfaceC0318bu {

    /* JADX INFO: renamed from: a */
    private C0286b f1092a;

    public C0332cf() {
        this(new C0286b());
    }

    public C0332cf(C0286b c0286b) {
        this.f1092a = c0286b;
    }

    @Override // com.google.ads.InterfaceC0318bu
    /* JADX INFO: renamed from: a */
    public void mo1305a(C0256w c0256w, HashMap map, WebView webView) {
        String str = (String) map.get("a");
        if (str == null) {
            C0364g.m1391a("Could not get the action parameter for open GMSG.");
            return;
        }
        if (str.equals("webapp")) {
            this.f1092a.m1238a(c0256w, new C0257x("webapp", map));
        } else if (str.equals("expand")) {
            this.f1092a.m1238a(c0256w, new C0257x("expand", map));
        } else {
            this.f1092a.m1238a(c0256w, new C0257x("intent", map));
        }
    }
}
