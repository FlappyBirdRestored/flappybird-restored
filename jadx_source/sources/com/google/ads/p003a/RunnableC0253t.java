package com.google.ads.p003a;

import android.webkit.WebView;
import com.google.ads.C0317bt;

/* JADX INFO: renamed from: com.google.ads.a.t */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0253t implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RunnableC0247n f861a;

    /* JADX INFO: renamed from: b */
    private final String f862b;

    /* JADX INFO: renamed from: c */
    private final String f863c;

    /* JADX INFO: renamed from: d */
    private final WebView f864d;

    public RunnableC0253t(RunnableC0247n runnableC0247n, WebView webView, String str, String str2) {
        this.f861a = runnableC0247n;
        this.f864d = webView;
        this.f862b = str;
        this.f863c = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f861a.f836j.f1032c.m1380a(Boolean.valueOf(this.f861a.f842p));
        ((C0256w) ((C0317bt) this.f861a.f836j.f1030a.m1378a()).f1053b.m1378a()).m1120k().m1028a(this.f861a.f842p);
        if (((C0317bt) this.f861a.f836j.f1030a.m1378a()).f1056e.m1378a() != null) {
            ((C0223a) ((C0317bt) this.f861a.f836j.f1030a.m1378a()).f1056e.m1378a()).setOverlayEnabled(!this.f861a.f842p);
        }
        if (this.f863c != null) {
            this.f864d.loadDataWithBaseURL(this.f862b, this.f863c, "text/html", "utf-8", null);
        } else {
            this.f864d.loadUrl(this.f862b);
        }
    }
}
