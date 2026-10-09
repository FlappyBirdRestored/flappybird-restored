package com.google.ads.util;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: renamed from: com.google.ads.util.v */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnCancelListenerC0379v implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JsPromptResult f1393a;

    DialogInterfaceOnCancelListenerC0379v(JsPromptResult jsPromptResult) {
        this.f1393a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f1393a.cancel();
    }
}
