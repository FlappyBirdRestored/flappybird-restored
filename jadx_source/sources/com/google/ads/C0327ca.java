package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.p003a.C0256w;
import com.google.ads.util.C0364g;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.ca */
/* JADX INFO: loaded from: classes.dex */
public class C0327ca implements InterfaceC0318bu {
    @Override // com.google.ads.InterfaceC0318bu
    /* JADX INFO: renamed from: a */
    public void mo1305a(C0256w c0256w, HashMap map, WebView webView) {
        String str = (String) map.get("u");
        if (TextUtils.isEmpty(str)) {
            C0364g.m1401e("Could not get URL from track gmsg.");
        } else {
            new Thread(new RunnableC0345o(str, (Context) c0256w.m1117h().f1057f.m1378a())).start();
        }
    }
}
