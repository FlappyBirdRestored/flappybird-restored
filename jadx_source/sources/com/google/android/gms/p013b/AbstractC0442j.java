package com.google.android.gms.p013b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C0456f;
import com.google.android.gms.internal.C0588do;

/* JADX INFO: renamed from: com.google.android.gms.b.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0442j {

    /* JADX INFO: renamed from: a */
    private final String f1602a;

    /* JADX INFO: renamed from: b */
    private Object f1603b;

    protected AbstractC0442j(String str) {
        this.f1602a = str;
    }

    /* JADX INFO: renamed from: a */
    protected final Object m1831a(Context context) throws C0443k {
        if (this.f1603b == null) {
            C0588do.m2704a(context);
            Context contextM1881b = C0456f.m1881b(context);
            if (contextM1881b == null) {
                throw new C0443k("Could not get remote context.");
            }
            try {
                this.f1603b = mo1832a((IBinder) contextM1881b.getClassLoader().loadClass(this.f1602a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new C0443k("Could not load creator class.");
            } catch (IllegalAccessException e2) {
                throw new C0443k("Could not access creator.");
            } catch (InstantiationException e3) {
                throw new C0443k("Could not instantiate creator.");
            }
        }
        return this.f1603b;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo1832a(IBinder iBinder);
}
