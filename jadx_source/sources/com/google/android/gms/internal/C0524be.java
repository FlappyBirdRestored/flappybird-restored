package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.C0456f;
import com.google.android.gms.p013b.BinderC0440h;
import com.google.android.gms.plus.C0754f;

/* JADX INFO: renamed from: com.google.android.gms.internal.be */
/* JADX INFO: loaded from: classes.dex */
public final class C0524be {

    /* JADX INFO: renamed from: a */
    private static Context f1806a;

    /* JADX INFO: renamed from: b */
    private static InterfaceC0512at f1807b;

    /* JADX INFO: renamed from: a */
    public static View m2360a(Context context, int i, int i2, String str, int i3) {
        try {
            if (str == null) {
                throw new NullPointerException();
            }
            return (View) BinderC0440h.m1830a(m2362a(context).mo2304a(BinderC0440h.m1829a(context), i, i2, str, i3));
        } catch (Exception e) {
            return new C0754f(context, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static View m2361a(Context context, int i, int i2, String str, String str2) {
        try {
            if (str == null) {
                throw new NullPointerException();
            }
            return (View) BinderC0440h.m1830a(m2362a(context).mo2305a(BinderC0440h.m1829a(context), i, i2, str, str2));
        } catch (Exception e) {
            return new C0754f(context, i);
        }
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC0512at m2362a(Context context) throws C0525bf {
        C0588do.m2704a(context);
        if (f1807b == null) {
            if (f1806a == null) {
                f1806a = C0456f.m1881b(context);
                if (f1806a == null) {
                    throw new C0525bf("Could not get remote context.");
                }
            }
            try {
                f1807b = AbstractBinderC0513au.m2306a((IBinder) f1806a.getClassLoader().loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
            } catch (ClassNotFoundException e) {
                throw new C0525bf("Could not load creator class.");
            } catch (IllegalAccessException e2) {
                throw new C0525bf("Could not access creator.");
            } catch (InstantiationException e3) {
                throw new C0525bf("Could not instantiate creator.");
            }
        }
        return f1807b;
    }
}
