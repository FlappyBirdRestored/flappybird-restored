package com.google.ads.p003a;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.google.ads.a.aj */
/* JADX INFO: loaded from: classes.dex */
class DialogInterfaceOnClickListenerC0233aj implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0231ah f800a;

    DialogInterfaceOnClickListenerC0233aj(C0231ah c0231ah) {
        this.f800a = c0231ah;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        new Thread(new RunnableC0228ae(this.f800a.f798c.m1111c(), this.f800a.f797b.getApplicationContext())).start();
    }
}
