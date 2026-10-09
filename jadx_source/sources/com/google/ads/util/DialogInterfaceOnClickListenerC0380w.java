package com.google.ads.util;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: renamed from: com.google.ads.util.w */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0380w implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JsPromptResult f1394a;

    DialogInterfaceOnClickListenerC0380w(JsPromptResult jsPromptResult) {
        this.f1394a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1394a.cancel();
    }
}
