package com.google.ads.util;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.google.ads.util.u */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0378u implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JsResult f1392a;

    DialogInterfaceOnClickListenerC0378u(JsResult jsResult) {
        this.f1392a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1392a.confirm();
    }
}
