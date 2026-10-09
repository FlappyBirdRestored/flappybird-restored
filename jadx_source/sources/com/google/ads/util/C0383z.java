package com.google.ads.util;

import android.annotation.TargetApi;
import android.webkit.WebSettings;
import com.google.ads.C0317bt;

/* JADX INFO: renamed from: com.google.ads.util.z */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public final class C0383z {
    /* JADX INFO: renamed from: a */
    public static void m1420a(WebSettings webSettings, C0317bt c0317bt) {
        C0373p.m1414a(webSettings, c0317bt);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }
}
