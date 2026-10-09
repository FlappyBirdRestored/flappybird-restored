package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.C0467e;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.cx */
/* JADX INFO: loaded from: classes.dex */
public final class C0570cx implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    private static final Object f2042a = new Object();

    /* JADX INFO: renamed from: b */
    private static C0570cx f2043b;

    /* JADX INFO: renamed from: c */
    private final Context f2044c;

    /* JADX INFO: renamed from: d */
    private final HashMap f2045d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final Handler f2046e;

    private C0570cx(Context context) {
        this.f2046e = new Handler(context.getMainLooper(), this);
        this.f2044c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static C0570cx m2656a(Context context) {
        synchronized (f2042a) {
            if (f2043b == null) {
                f2043b = new C0570cx(context.getApplicationContext());
            }
        }
        return f2043b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2658a(String str, ServiceConnectionC0568cv serviceConnectionC0568cv) {
        boolean zM2669c;
        synchronized (this.f2045d) {
            C0571cy c0571cy = (C0571cy) this.f2045d.get(str);
            if (c0571cy != null) {
                this.f2046e.removeMessages(0, c0571cy);
                if (!c0571cy.m2670c(serviceConnectionC0568cv)) {
                    c0571cy.m2665a(serviceConnectionC0568cv);
                    switch (c0571cy.m2671d()) {
                        case C0467e.MapAttrs_cameraBearing /* 1 */:
                            serviceConnectionC0568cv.onServiceConnected(c0571cy.m2674g(), c0571cy.m2673f());
                            break;
                        case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                            c0571cy.m2666a(this.f2044c.bindService(new Intent(str).setPackage("com.google.android.gms"), c0571cy.m2664a(), 129));
                            break;
                    }
                } else {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + str);
                }
            } else {
                c0571cy = new C0571cy(this, str);
                c0571cy.m2665a(serviceConnectionC0568cv);
                c0571cy.m2666a(this.f2044c.bindService(new Intent(str).setPackage("com.google.android.gms"), c0571cy.m2664a(), 129));
                this.f2045d.put(str, c0571cy);
            }
            zM2669c = c0571cy.m2669c();
        }
        return zM2669c;
    }

    /* JADX INFO: renamed from: b */
    public void m2659b(String str, ServiceConnectionC0568cv serviceConnectionC0568cv) {
        synchronized (this.f2045d) {
            C0571cy c0571cy = (C0571cy) this.f2045d.get(str);
            if (c0571cy == null) {
                throw new IllegalStateException("Nonexistent connection status for service action: " + str);
            }
            if (!c0571cy.m2670c(serviceConnectionC0568cv)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + str);
            }
            c0571cy.m2668b(serviceConnectionC0568cv);
            if (c0571cy.m2672e()) {
                this.f2046e.sendMessageDelayed(this.f2046e.obtainMessage(0, c0571cy), 5000L);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case C0467e.MapAttrs_mapType /* 0 */:
                C0571cy c0571cy = (C0571cy) message.obj;
                synchronized (this.f2045d) {
                    if (c0571cy.m2672e()) {
                        this.f2044c.unbindService(c0571cy.m2664a());
                        this.f2045d.remove(c0571cy.m2667b());
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
