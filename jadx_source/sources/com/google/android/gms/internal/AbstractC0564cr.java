package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C0445a;
import com.google.android.gms.common.C0456f;
import com.google.android.gms.common.InterfaceC0446b;
import com.google.android.gms.common.InterfaceC0447c;
import com.google.android.gms.common.InterfaceC0448d;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.cr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0564cr implements InterfaceC0446b {

    /* JADX INFO: renamed from: e */
    public static final String[] f2017e = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: a */
    final Handler f2018a;

    /* JADX INFO: renamed from: f */
    private final Context f2022f;

    /* JADX INFO: renamed from: g */
    private IInterface f2023g;

    /* JADX INFO: renamed from: j */
    private ArrayList f2026j;

    /* JADX INFO: renamed from: m */
    private ServiceConnectionC0568cv f2029m;

    /* JADX INFO: renamed from: n */
    private final String[] f2030n;

    /* JADX INFO: renamed from: b */
    final ArrayList f2019b = new ArrayList();

    /* JADX INFO: renamed from: i */
    private boolean f2025i = false;

    /* JADX INFO: renamed from: k */
    private boolean f2027k = false;

    /* JADX INFO: renamed from: l */
    private final ArrayList f2028l = new ArrayList();

    /* JADX INFO: renamed from: c */
    boolean f2020c = false;

    /* JADX INFO: renamed from: d */
    boolean f2021d = false;

    /* JADX INFO: renamed from: o */
    private final Object f2031o = new Object();

    /* JADX INFO: renamed from: h */
    private ArrayList f2024h = new ArrayList();

    protected AbstractC0564cr(Context context, InterfaceC0447c interfaceC0447c, InterfaceC0448d interfaceC0448d, String... strArr) {
        this.f2022f = (Context) C0588do.m2704a(context);
        this.f2024h.add(C0588do.m2704a(interfaceC0447c));
        this.f2026j = new ArrayList();
        this.f2026j.add(C0588do.m2704a(interfaceC0448d));
        this.f2018a = new HandlerC0565cs(this, context.getMainLooper());
        mo2383a(strArr);
        this.f2030n = strArr;
    }

    /* JADX INFO: renamed from: a */
    public void mo2635a() {
        this.f2020c = true;
        synchronized (this.f2031o) {
            this.f2021d = true;
        }
        int iM1869a = C0456f.m1869a(this.f2022f);
        if (iM1869a != 0) {
            this.f2018a.sendMessage(this.f2018a.obtainMessage(3, Integer.valueOf(iM1869a)));
            return;
        }
        if (this.f2029m != null) {
            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
            this.f2023g = null;
            C0570cx.m2656a(this.f2022f).m2659b(mo2358c(), this.f2029m);
        }
        this.f2029m = new ServiceConnectionC0568cv(this);
        if (C0570cx.m2656a(this.f2022f).m2658a(mo2358c(), this.f2029m)) {
            return;
        }
        Log.e("GmsClient", "unable to connect to service: " + mo2358c());
        this.f2018a.sendMessage(this.f2018a.obtainMessage(3, 9));
    }

    /* JADX INFO: renamed from: a */
    protected void mo2355a(int i, IBinder iBinder, Bundle bundle) {
        this.f2018a.sendMessage(this.f2018a.obtainMessage(1, new C0569cw(this, i, iBinder, bundle)));
    }

    /* JADX INFO: renamed from: a */
    protected void mo2636a(C0445a c0445a) {
        this.f2018a.removeMessages(4);
        synchronized (this.f2026j) {
            this.f2027k = true;
            ArrayList arrayList = this.f2026j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!this.f2020c) {
                    return;
                }
                if (this.f2026j.contains(arrayList.get(i))) {
                    ((InterfaceC0448d) arrayList.get(i)).mo1842a(c0445a);
                }
            }
            this.f2027k = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2637a(AbstractC0566ct abstractC0566ct) {
        synchronized (this.f2028l) {
            this.f2028l.add(abstractC0566ct);
        }
        this.f2018a.sendMessage(this.f2018a.obtainMessage(2, abstractC0566ct));
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo2356a(InterfaceC0579df interfaceC0579df, BinderC0567cu binderC0567cu);

    /* JADX INFO: renamed from: a */
    protected void mo2383a(String... strArr) {
    }

    /* JADX INFO: renamed from: b */
    protected abstract IInterface mo2357b(IBinder iBinder);

    /* JADX INFO: renamed from: b */
    public void mo2638b() {
        this.f2020c = false;
        synchronized (this.f2031o) {
            this.f2021d = false;
        }
        synchronized (this.f2028l) {
            int size = this.f2028l.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0566ct) this.f2028l.get(i)).m2653d();
            }
            this.f2028l.clear();
        }
        this.f2023g = null;
        if (this.f2029m != null) {
            C0570cx.m2656a(this.f2022f).m2659b(mo2358c(), this.f2029m);
            this.f2029m = null;
        }
    }

    /* JADX INFO: renamed from: c */
    protected abstract String mo2358c();

    /* JADX INFO: renamed from: c */
    protected final void m2639c(IBinder iBinder) {
        try {
            mo2356a(AbstractBinderC0580dg.m2697a(iBinder), new BinderC0567cu(this));
        } catch (RemoteException e) {
            Log.w("GmsClient", "service died");
        }
    }

    /* JADX INFO: renamed from: d */
    protected abstract String mo2359d();

    /* JADX INFO: renamed from: e */
    protected Bundle mo2640e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    protected void mo2641f() {
        synchronized (this.f2024h) {
            C0588do.m2706a(!this.f2025i);
            this.f2018a.removeMessages(4);
            this.f2025i = true;
            C0588do.m2706a(this.f2019b.size() == 0);
            Bundle bundleMo2640e = mo2640e();
            ArrayList arrayList = this.f2024h;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f2020c && m2642h(); i++) {
                this.f2019b.size();
                if (!this.f2019b.contains(arrayList.get(i))) {
                    ((InterfaceC0447c) arrayList.get(i)).mo1841a(bundleMo2640e);
                }
            }
            this.f2019b.clear();
            this.f2025i = false;
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m2642h() {
        return this.f2023g != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m2643i() {
        boolean z;
        synchronized (this.f2031o) {
            z = this.f2021d;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final Context m2644j() {
        return this.f2022f;
    }

    /* JADX INFO: renamed from: k */
    public final String[] m2645k() {
        return this.f2030n;
    }

    /* JADX INFO: renamed from: l */
    protected final void m2646l() {
        this.f2018a.removeMessages(4);
        synchronized (this.f2024h) {
            this.f2025i = true;
            ArrayList arrayList = this.f2024h;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f2020c; i++) {
                if (this.f2024h.contains(arrayList.get(i))) {
                    ((InterfaceC0447c) arrayList.get(i)).mo1840a();
                }
            }
            this.f2025i = false;
        }
    }

    /* JADX INFO: renamed from: m */
    protected final void m2647m() {
        if (!m2642h()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: renamed from: n */
    protected final IInterface m2648n() {
        m2647m();
        return this.f2023g;
    }
}
