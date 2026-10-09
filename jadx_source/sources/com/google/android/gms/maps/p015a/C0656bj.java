package com.google.android.gms.maps.p015a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C0455e;
import com.google.android.gms.common.C0456f;
import com.google.android.gms.internal.C0588do;
import com.google.android.gms.maps.model.C0721k;
import com.google.android.gms.p013b.BinderC0440h;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.bj */
/* JADX INFO: loaded from: classes.dex */
public class C0656bj {

    /* JADX INFO: renamed from: a */
    private static Context f2142a;

    /* JADX INFO: renamed from: b */
    private static InterfaceC0681z f2143b;

    /* JADX INFO: renamed from: a */
    public static InterfaceC0681z m2872a(Context context) throws C0455e {
        C0588do.m2704a(context);
        m2876b(context);
        if (f2143b == null) {
            m2878d(context);
        }
        if (f2143b != null) {
            return f2143b;
        }
        f2143b = AbstractBinderC0620aa.m2839a((IBinder) m2875a(m2879e(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        m2877c(context);
        return f2143b;
    }

    /* JADX INFO: renamed from: a */
    private static Class m2873a() {
        try {
            return Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Object m2874a(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to call the default constructor of " + cls.getName());
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + cls.getName());
        }
    }

    /* JADX INFO: renamed from: a */
    private static Object m2875a(ClassLoader classLoader, String str) {
        try {
            return m2874a(((ClassLoader) C0588do.m2704a(classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class " + str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2876b(Context context) throws C0455e {
        int iM1869a = C0456f.m1869a(context);
        if (iM1869a != 0) {
            throw new C0455e(iM1869a);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m2877c(Context context) {
        try {
            f2143b.mo2843a(BinderC0440h.m1829a(m2879e(context).getResources()), 3265100);
        } catch (RemoteException e) {
            throw new C0721k(e);
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m2878d(Context context) {
        Class clsM2873a = m2873a();
        if (clsM2873a != null) {
            Log.i(C0656bj.class.getSimpleName(), "Making Creator statically");
            f2143b = (InterfaceC0681z) m2874a(clsM2873a);
            m2877c(context);
        }
    }

    /* JADX INFO: renamed from: e */
    private static Context m2879e(Context context) {
        if (f2142a == null) {
            if (m2873a() != null) {
                f2142a = context;
            } else {
                f2142a = C0456f.m1881b(context);
            }
        }
        return f2142a;
    }
}
