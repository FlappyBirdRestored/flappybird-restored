package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.plus.d */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC0752d implements View.OnClickListener, InterfaceC0753e {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ PlusOneButton f2281a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0753e f2282b;

    public ViewOnClickListenerC0752d(PlusOneButton plusOneButton, InterfaceC0753e interfaceC0753e) {
        this.f2281a = plusOneButton;
        this.f2282b = interfaceC0753e;
    }

    @Override // com.google.android.gms.plus.InterfaceC0753e
    /* JADX INFO: renamed from: a */
    public void mo3231a(Intent intent) {
        Context context = this.f2281a.getContext();
        if (!(context instanceof Activity) || intent == null) {
            return;
        }
        ((Activity) context).startActivityForResult(intent, this.f2281a.f2254e);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent = (Intent) this.f2281a.f2250a.getTag();
        if (this.f2282b != null) {
            this.f2282b.mo3231a(intent);
        } else {
            mo3231a(intent);
        }
    }
}
