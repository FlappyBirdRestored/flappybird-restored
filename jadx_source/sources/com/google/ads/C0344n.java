package com.google.ads;

import android.app.Activity;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.google.ads.p003a.C0236c;
import com.google.ads.p003a.C0238e;
import com.google.ads.p003a.C0241h;
import com.google.ads.p003a.C0256w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0364g;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.n */
/* JADX INFO: loaded from: classes.dex */
public class C0344n implements InterfaceC0318bu {

    /* JADX INFO: renamed from: a */
    private static final C0241h f1134a = (C0241h) C0241h.f821a.mo1047b();

    /* JADX INFO: renamed from: a */
    protected int m1340a(HashMap map, String str, int i, DisplayMetrics displayMetrics) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            return (int) TypedValue.applyDimension(1, Integer.parseInt(str2), displayMetrics);
        } catch (NumberFormatException e) {
            C0364g.m1391a("Could not parse \"" + str + "\" in a video gmsg: " + str2);
            return i;
        }
    }

    @Override // com.google.ads.InterfaceC0318bu
    /* JADX INFO: renamed from: a */
    public void mo1305a(C0256w c0256w, HashMap map, WebView webView) {
        String str = (String) map.get("action");
        if (str == null) {
            C0364g.m1391a("No \"action\" parameter in a video gmsg.");
            return;
        }
        if (!(webView instanceof C0238e)) {
            C0364g.m1391a("Could not get adWebView for a video gmsg.");
            return;
        }
        C0238e c0238e = (C0238e) webView;
        AdActivity adActivityM1032i = c0238e.m1032i();
        if (adActivityM1032i == null) {
            C0364g.m1391a("Could not get adActivity for a video gmsg.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            DisplayMetrics displayMetricsM1347a = AdUtil.m1347a((Activity) adActivityM1032i);
            int iM1340a = m1340a(map, "x", 0, displayMetricsM1347a);
            int iM1340a2 = m1340a(map, "y", 0, displayMetricsM1347a);
            int iM1340a3 = m1340a(map, "w", -1, displayMetricsM1347a);
            int iM1340a4 = m1340a(map, "h", -1, displayMetricsM1347a);
            if (zEquals && adActivityM1032i.m939a() == null) {
                adActivityM1032i.m946b(iM1340a, iM1340a2, iM1340a3, iM1340a4);
                return;
            } else {
                adActivityM1032i.m941a(iM1340a, iM1340a2, iM1340a3, iM1340a4);
                return;
            }
        }
        C0236c c0236cM939a = adActivityM1032i.m939a();
        if (c0236cM939a == null) {
            f1134a.m1039a(c0238e, "onVideoEvent", "{'event': 'error', 'what': 'no_video_view'}");
            return;
        }
        if (str.equals("click")) {
            DisplayMetrics displayMetricsM1347a2 = AdUtil.m1347a((Activity) adActivityM1032i);
            int iM1340a5 = m1340a(map, "x", 0, displayMetricsM1347a2);
            int iM1340a6 = m1340a(map, "y", 0, displayMetricsM1347a2);
            long jUptimeMillis = SystemClock.uptimeMillis();
            c0236cM939a.m1021a(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iM1340a5, iM1340a6, 0));
            return;
        }
        if (str.equals("controls")) {
            String str2 = (String) map.get("enabled");
            if (str2 == null) {
                C0364g.m1391a("No \"enabled\" parameter in a controls video gmsg.");
                return;
            } else if (str2.equals("true")) {
                c0236cM939a.setMediaControllerEnabled(true);
                return;
            } else {
                c0236cM939a.setMediaControllerEnabled(false);
                return;
            }
        }
        if (str.equals("currentTime")) {
            String str3 = (String) map.get("time");
            if (str3 == null) {
                C0364g.m1391a("No \"time\" parameter in a currentTime video gmsg.");
                return;
            }
            try {
                c0236cM939a.m1020a((int) (Float.parseFloat(str3) * 1000.0f));
                return;
            } catch (NumberFormatException e) {
                C0364g.m1391a("Could not parse \"time\" parameter: " + str3);
                return;
            }
        }
        if (str.equals("hide")) {
            c0236cM939a.setVisibility(4);
            return;
        }
        if (str.equals("load")) {
            c0236cM939a.m1022b();
            return;
        }
        if (str.equals("pause")) {
            c0236cM939a.m1023c();
            return;
        }
        if (str.equals("play")) {
            c0236cM939a.m1024d();
            return;
        }
        if (str.equals("show")) {
            c0236cM939a.setVisibility(0);
        } else if (str.equals("src")) {
            c0236cM939a.setSrc((String) map.get("src"));
        } else {
            C0364g.m1391a("Unknown video action: " + str);
        }
    }
}
