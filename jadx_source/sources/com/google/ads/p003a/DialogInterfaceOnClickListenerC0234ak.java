package com.google.ads.p003a;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: com.google.ads.a.ak */
/* JADX INFO: loaded from: classes.dex */
class DialogInterfaceOnClickListenerC0234ak implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f801a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0231ah f802b;

    DialogInterfaceOnClickListenerC0234ak(C0231ah c0231ah, String str) {
        this.f802b = c0231ah;
        this.f801a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f802b.f797b.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.f801a), "Share via"));
    }
}
