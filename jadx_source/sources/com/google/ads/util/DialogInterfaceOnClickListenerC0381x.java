package com.google.ads.util;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: renamed from: com.google.ads.util.x */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0381x implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JsPromptResult f1395a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ EditText f1396b;

    DialogInterfaceOnClickListenerC0381x(JsPromptResult jsPromptResult, EditText editText) {
        this.f1395a = jsPromptResult;
        this.f1396b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1395a.confirm(this.f1396b.getText().toString());
    }
}
