package com.google.android.gms.plus;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.google.android.gms.plus.h */
/* JADX INFO: loaded from: classes.dex */
class C0756h implements InterfaceC0759k {

    /* JADX INFO: renamed from: a */
    private Context f2283a;

    private C0756h(Context context) {
        this.f2283a = context;
    }

    @Override // com.google.android.gms.plus.InterfaceC0759k
    /* JADX INFO: renamed from: a */
    public Drawable mo3234a(int i) {
        return this.f2283a.getResources().getDrawable(R.drawable.btn_default);
    }

    @Override // com.google.android.gms.plus.InterfaceC0759k
    /* JADX INFO: renamed from: a */
    public boolean mo3235a() {
        return true;
    }
}
