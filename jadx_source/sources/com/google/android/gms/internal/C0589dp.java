package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.p013b.AbstractC0442j;
import com.google.android.gms.p013b.BinderC0440h;
import com.google.android.gms.p013b.C0443k;

/* JADX INFO: renamed from: com.google.android.gms.internal.dp */
/* JADX INFO: loaded from: classes.dex */
public final class C0589dp extends AbstractC0442j {

    /* JADX INFO: renamed from: a */
    private static final C0589dp f2064a = new C0589dp();

    private C0589dp() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* JADX INFO: renamed from: a */
    public static View m2711a(Context context, int i, int i2) {
        return f2064a.m2712b(context, i, i2);
    }

    /* JADX INFO: renamed from: b */
    private View m2712b(Context context, int i, int i2) throws C0443k {
        try {
            return (View) BinderC0440h.m1830a(((InterfaceC0582di) m1831a(context)).mo2698a(BinderC0440h.m1829a(context), i, i2));
        } catch (Exception e) {
            throw new C0443k("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    @Override // com.google.android.gms.p013b.AbstractC0442j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC0582di mo1832a(IBinder iBinder) {
        return AbstractBinderC0583dj.m2699a(iBinder);
    }
}
