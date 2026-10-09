package com.google.ads.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.ads.C0315br;
import com.google.ads.C0316bs;
import com.google.ads.C0317bt;
import com.google.android.gms.C0467e;
import java.io.File;

/* JADX INFO: renamed from: com.google.ads.util.p */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(C0467e.MapAttrs_uiZoomGestures)
public class C0373p {
    /* JADX INFO: renamed from: a */
    public static void m1412a(View view) {
        view.setLayerType(1, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m1413a(Window window) {
        window.setFlags(16777216, 16777216);
    }

    /* JADX INFO: renamed from: a */
    public static void m1414a(WebSettings webSettings, C0317bt c0317bt) {
        Context context = (Context) c0317bt.f1057f.m1378a();
        C0316bs c0316bs = (C0316bs) ((C0315br) c0317bt.f1055d.m1378a()).f1035b.m1378a();
        webSettings.setAppCacheEnabled(true);
        webSettings.setAppCacheMaxSize(((Long) c0316bs.f1045i.m1379a()).longValue());
        webSettings.setAppCachePath(new File(context.getCacheDir(), "admob").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDatabasePath(context.getDatabasePath("admob").getAbsolutePath());
        webSettings.setDomStorageEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
    }

    /* JADX INFO: renamed from: b */
    public static void m1415b(View view) {
        view.setLayerType(0, null);
    }
}
