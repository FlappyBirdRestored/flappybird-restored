package com.google.ads.p003a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.C0268ai;
import com.google.ads.C0317bt;
import com.google.ads.C0337g;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0361d;
import com.google.ads.util.C0364g;
import com.google.ads.util.C0373p;
import com.google.ads.util.C0375r;
import com.google.ads.util.C0383z;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.ads.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C0238e extends WebView {

    /* JADX INFO: renamed from: a */
    protected final C0317bt f813a;

    /* JADX INFO: renamed from: b */
    private WeakReference f814b;

    /* JADX INFO: renamed from: c */
    private C0337g f815c;

    /* JADX INFO: renamed from: d */
    private boolean f816d;

    /* JADX INFO: renamed from: e */
    private boolean f817e;

    /* JADX INFO: renamed from: f */
    private boolean f818f;

    public C0238e(C0317bt c0317bt, C0337g c0337g) {
        super((Context) c0317bt.f1057f.m1378a());
        this.f813a = c0317bt;
        this.f815c = c0337g;
        this.f814b = null;
        this.f816d = false;
        this.f817e = false;
        this.f818f = false;
        setBackgroundColor(0);
        AdUtil.m1353a(this);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        setDownloadListener(new C0239f(this));
        if (AdUtil.f1336a >= 17) {
            C0383z.m1420a(settings, c0317bt);
        } else if (AdUtil.f1336a >= 11) {
            C0373p.m1414a(settings, c0317bt);
        }
        setScrollBarStyle(33554432);
        if (AdUtil.f1336a >= 14) {
            setWebChromeClient(new C0361d(c0317bt));
        } else if (AdUtil.f1336a >= 11) {
            setWebChromeClient(new C0375r(c0317bt));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1028a(boolean z) {
        if (z) {
            setOnTouchListener(new ViewOnTouchListenerC0240g(this));
        } else {
            setOnTouchListener(null);
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable th) {
            C0364g.m1400d("An error occurred while destroying an AdWebView:", th);
        }
        try {
            setWebViewClient(new WebViewClient());
        } catch (Throwable th2) {
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1029f() {
        AdActivity adActivityM1032i = m1032i();
        if (adActivityM1032i != null) {
            adActivityM1032i.finish();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1030g() {
        if (AdUtil.f1336a >= 11) {
            C0373p.m1412a(this);
        }
        this.f817e = true;
    }

    /* JADX INFO: renamed from: h */
    public void m1031h() {
        if (this.f817e && AdUtil.f1336a >= 11) {
            C0373p.m1415b(this);
        }
        this.f817e = false;
    }

    /* JADX INFO: renamed from: i */
    public AdActivity m1032i() {
        if (this.f814b != null) {
            return (AdActivity) this.f814b.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m1033j() {
        return this.f818f;
    }

    /* JADX INFO: renamed from: k */
    public boolean m1034k() {
        return this.f817e;
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            C0364g.m1400d("An error occurred while loading data in AdWebView:", th);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            C0364g.m1400d("An error occurred while loading a URL in AdWebView:", th);
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        synchronized (this) {
            if (isInEditMode() || this.f815c == null || this.f816d) {
                super.onMeasure(i, i2);
            } else {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size2 = View.MeasureSpec.getSize(i2);
                float f = getContext().getResources().getDisplayMetrics().density;
                int iM1327a = (int) (this.f815c.m1327a() * f);
                int iM1328b = (int) (this.f815c.m1328b() * f);
                int i3 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
                int i4 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size2 : Integer.MAX_VALUE;
                if (iM1327a - (f * 6.0f) > i3 || iM1328b > i4) {
                    C0364g.m1395b("Not enough space to show ad! Wants: <" + iM1327a + ", " + iM1328b + ">, Has: <" + size + ", " + size2 + ">");
                    setVisibility(8);
                    setMeasuredDimension(size, size2);
                } else {
                    setMeasuredDimension(iM1327a, iM1328b);
                }
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0268ai c0268ai = (C0268ai) this.f813a.f1069r.m1379a();
        if (c0268ai != null) {
            c0268ai.m1170a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdActivity(AdActivity adActivity) {
        this.f814b = new WeakReference(adActivity);
    }

    public synchronized void setAdSize(C0337g c0337g) {
        this.f815c = c0337g;
        requestLayout();
    }

    public void setCustomClose(boolean z) {
        AdActivity adActivity;
        this.f818f = z;
        if (this.f814b == null || (adActivity = (AdActivity) this.f814b.get()) == null) {
            return;
        }
        adActivity.m945a(z);
    }

    public void setIsExpandedMraid(boolean z) {
        this.f816d = z;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Throwable th) {
            C0364g.m1400d("An error occurred while stopping loading in AdWebView:", th);
        }
    }
}
