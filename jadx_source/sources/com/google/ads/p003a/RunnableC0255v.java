package com.google.ads.p003a;

import android.webkit.WebView;
import com.google.ads.C0317bt;
import com.google.ads.C0337g;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.google.ads.a.v */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0255v implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RunnableC0247n f871a;

    /* JADX INFO: renamed from: b */
    private final C0256w f872b;

    /* JADX INFO: renamed from: c */
    private final WebView f873c;

    /* JADX INFO: renamed from: d */
    private final LinkedList f874d;

    /* JADX INFO: renamed from: e */
    private final int f875e;

    /* JADX INFO: renamed from: f */
    private final boolean f876f;

    /* JADX INFO: renamed from: g */
    private final String f877g;

    /* JADX INFO: renamed from: h */
    private final C0337g f878h;

    public RunnableC0255v(RunnableC0247n runnableC0247n, C0256w c0256w, WebView webView, LinkedList linkedList, int i, boolean z, String str, C0337g c0337g) {
        this.f871a = runnableC0247n;
        this.f872b = c0256w;
        this.f873c = webView;
        this.f874d = linkedList;
        this.f875e = i;
        this.f876f = z;
        this.f877g = str;
        this.f878h = c0337g;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f873c != null) {
            this.f873c.stopLoading();
            this.f873c.destroy();
        }
        this.f872b.m1104a(this.f874d);
        this.f872b.m1093a(this.f875e);
        this.f872b.m1105a(this.f876f);
        this.f872b.m1102a(this.f877g);
        if (this.f878h != null) {
            ((C0226ac) ((C0317bt) this.f871a.f836j.f1030a.m1378a()).f1058g.m1378a()).m1004b(this.f878h);
            this.f872b.m1120k().setAdSize(this.f878h);
        }
        this.f872b.m1135z();
    }
}
