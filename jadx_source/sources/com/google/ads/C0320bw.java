package com.google.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.p003a.C0241h;
import com.google.ads.p003a.C0256w;
import com.google.ads.util.C0364g;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.bw */
/* JADX INFO: loaded from: classes.dex */
public class C0320bw implements InterfaceC0318bu {

    /* JADX INFO: renamed from: a */
    private static final C0241h f1072a = (C0241h) C0241h.f821a.mo1047b();

    @Override // com.google.ads.InterfaceC0318bu
    /* JADX INFO: renamed from: a */
    public void mo1305a(C0256w c0256w, HashMap map, WebView webView) {
        String str = (String) map.get("urls");
        if (str == null) {
            C0364g.m1401e("Could not get the urls param from canOpenURLs gmsg.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = webView.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            map2.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length >= 2 ? strArrSplit2[1] : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0])), 65536) != null));
        }
        f1072a.m1040a(webView, map2);
    }
}
