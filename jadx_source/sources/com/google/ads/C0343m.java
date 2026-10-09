package com.google.ads;

import android.app.Activity;
import android.webkit.WebView;
import com.google.ads.p003a.C0256w;
import com.google.ads.util.C0364g;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.m */
/* JADX INFO: loaded from: classes.dex */
public class C0343m implements InterfaceC0318bu {
    @Override // com.google.ads.InterfaceC0318bu
    /* JADX INFO: renamed from: a */
    public void mo1305a(C0256w c0256w, HashMap map, WebView webView) {
        if (((Activity) c0256w.m1117h().f1054c.m1381a()) == null) {
            C0364g.m1401e("Activity was null while responding to touch gmsg.");
            return;
        }
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i = Integer.parseInt(str);
            int i2 = Integer.parseInt(str2);
            int i3 = Integer.parseInt(str3);
            C0268ai c0268ai = (C0268ai) c0256w.m1117h().f1069r.m1379a();
            if (c0268ai != null) {
                c0268ai.m1167a(i, i2, i3);
            }
        } catch (NumberFormatException e) {
            C0364g.m1401e("Could not parse touch parameters from gmsg.");
        }
    }
}
