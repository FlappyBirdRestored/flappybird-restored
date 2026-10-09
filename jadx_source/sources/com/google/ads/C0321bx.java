package com.google.ads;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.p003a.C0225ab;
import com.google.ads.p003a.C0256w;
import com.google.ads.util.C0364g;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.ads.bx */
/* JADX INFO: loaded from: classes.dex */
public class C0321bx implements InterfaceC0318bu {
    @Override // com.google.ads.InterfaceC0318bu
    /* JADX INFO: renamed from: a */
    public void mo1305a(C0256w c0256w, HashMap map, WebView webView) {
        Uri uriM1186a;
        Uri uri;
        String host;
        String str = (String) map.get("u");
        if (str == null) {
            C0364g.m1401e("Could not get URL from click gmsg.");
            return;
        }
        C0225ab c0225abM1122m = c0256w.m1122m();
        if (c0225abM1122m != null && (host = (uri = Uri.parse(str)).getHost()) != null && host.toLowerCase(Locale.US).endsWith(".admob.com")) {
            String str2 = null;
            String path = uri.getPath();
            if (path != null) {
                String[] strArrSplit = path.split("/");
                if (strArrSplit.length >= 4) {
                    str2 = strArrSplit[2] + "/" + strArrSplit[3];
                }
            }
            c0225abM1122m.m974a(str2);
        }
        C0317bt c0317btM1117h = c0256w.m1117h();
        Context context = (Context) c0317btM1117h.f1057f.m1378a();
        Uri uri2 = Uri.parse(str);
        try {
            C0270ak c0270ak = (C0270ak) c0317btM1117h.f1070s.m1379a();
            uriM1186a = (c0270ak == null || !c0270ak.m1188a(uri2)) ? uri2 : c0270ak.m1186a(uri2, context);
        } catch (C0271al e) {
            C0364g.m1401e("Unable to append parameter to URL: " + str);
        }
        new Thread(new RunnableC0345o(uriM1186a.toString(), context)).start();
    }
}
