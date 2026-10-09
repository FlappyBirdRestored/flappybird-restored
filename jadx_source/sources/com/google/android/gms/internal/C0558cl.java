package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.google.android.gms.internal.cl */
/* JADX INFO: loaded from: classes.dex */
final class C0558cl extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    int f1993a;

    /* JADX INFO: renamed from: b */
    int f1994b;

    C0558cl(C0558cl c0558cl) {
        if (c0558cl != null) {
            this.f1993a = c0558cl.f1993a;
            this.f1994b = c0558cl.f1994b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1993a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new C0554ch(this);
    }
}
