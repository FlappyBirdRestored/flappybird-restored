package com.google.ads.util;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.google.ads.util.s */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnCancelListenerC0376s implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JsResult f1390a;

    DialogInterfaceOnCancelListenerC0376s(JsResult jsResult) {
        this.f1390a = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f1390a.cancel();
    }
}
