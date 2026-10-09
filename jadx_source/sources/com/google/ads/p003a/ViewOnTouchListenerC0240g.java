package com.google.ads.p003a;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.google.ads.a.g */
/* JADX INFO: loaded from: classes.dex */
class ViewOnTouchListenerC0240g implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0238e f820a;

    ViewOnTouchListenerC0240g(C0238e c0238e) {
        this.f820a = c0238e;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() == 2;
    }
}
