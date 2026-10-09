package com.google.ads;

import android.webkit.WebView;
import com.google.ads.p003a.C0256w;
import com.google.ads.p003a.RunnableC0247n;
import com.google.ads.util.C0364g;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.cb */
/* JADX INFO: loaded from: classes.dex */
public class C0328cb implements InterfaceC0318bu {
    @Override // com.google.ads.InterfaceC0318bu
    /* JADX INFO: renamed from: a */
    public void mo1305a(C0256w c0256w, HashMap map, WebView webView) {
        C0364g.m1401e("Invalid " + ((String) map.get("type")) + " request error: " + ((String) map.get("errors")));
        RunnableC0247n runnableC0247nM1119j = c0256w.m1119j();
        if (runnableC0247nM1119j != null) {
            runnableC0247nM1119j.m1071a(EnumC0335e.INVALID_REQUEST);
        }
    }
}
