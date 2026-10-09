package com.google.ads.util;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.google.ads.util.t */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0377t implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JsResult f1391a;

    DialogInterfaceOnClickListenerC0377t(JsResult jsResult) {
        this.f1391a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1391a.cancel();
    }
}
