package com.google.ads.p003a;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.EnumC0335e;

/* JADX INFO: renamed from: com.google.ads.a.r */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0251r implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C0256w f855a;

    /* JADX INFO: renamed from: b */
    private final WebView f856b;

    /* JADX INFO: renamed from: c */
    private final RunnableC0258y f857c;

    /* JADX INFO: renamed from: d */
    private final EnumC0335e f858d;

    /* JADX INFO: renamed from: e */
    private final boolean f859e;

    public RunnableC0251r(C0256w c0256w, WebView webView, RunnableC0258y runnableC0258y, EnumC0335e enumC0335e, boolean z) {
        this.f855a = c0256w;
        this.f856b = webView;
        this.f857c = runnableC0258y;
        this.f858d = enumC0335e;
        this.f859e = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f856b != null) {
            this.f856b.stopLoading();
            this.f856b.destroy();
        }
        if (this.f857c != null) {
            this.f857c.m1157a();
        }
        if (this.f859e) {
            this.f855a.m1120k().stopLoading();
            if (this.f855a.m1117h().f1060i.m1378a() != null) {
                ((ViewGroup) this.f855a.m1117h().f1060i.m1378a()).setVisibility(8);
            }
        }
        this.f855a.m1101a(this.f858d);
    }
}
