package com.google.ads.util;

import android.view.View;
import android.webkit.WebChromeClient;
import com.google.ads.C0317bt;

/* JADX INFO: renamed from: com.google.ads.util.d */
/* JADX INFO: loaded from: classes.dex */
public class C0361d extends C0375r {
    public C0361d(C0317bt c0317bt) {
        super(c0317bt);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }
}
