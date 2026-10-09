package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.p003a.C0223a;
import com.google.ads.p003a.C0256w;
import com.google.ads.util.C0364g;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.l */
/* JADX INFO: loaded from: classes.dex */
public class C0342l implements InterfaceC0318bu {
    @Override // com.google.ads.InterfaceC0318bu
    /* JADX INFO: renamed from: a */
    public void mo1305a(C0256w c0256w, HashMap map, WebView webView) {
        if (!(webView instanceof C0223a)) {
            C0364g.m1395b("Trying to activate an overlay when this is not an overlay.");
            return;
        }
        try {
            int i = !TextUtils.isEmpty((CharSequence) map.get("w")) ? Integer.parseInt((String) map.get("w")) : -1;
            int i2 = !TextUtils.isEmpty((CharSequence) map.get("h")) ? Integer.parseInt((String) map.get("h")) : -1;
            int i3 = !TextUtils.isEmpty((CharSequence) map.get("x")) ? Integer.parseInt((String) map.get("x")) : -1;
            int i4 = TextUtils.isEmpty((CharSequence) map.get("y")) ? -1 : Integer.parseInt((String) map.get("y"));
            if (map.get("a") != null && ((String) map.get("a")).equals("1")) {
                c0256w.m1099a(null, true, i3, i4, i, i2);
            } else if (map.get("a") == null || !((String) map.get("a")).equals("0")) {
                c0256w.m1094a(i3, i4, i, i2);
            } else {
                c0256w.m1099a(null, false, i3, i4, i, i2);
            }
        } catch (NumberFormatException e) {
            C0364g.m1400d("Invalid number format in activation overlay response.", e);
        }
    }
}
