package com.google.android.gms.internal;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.ct */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0566ct {

    /* JADX INFO: renamed from: a */
    private Object f2033a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractC0564cr f2034b;

    /* JADX INFO: renamed from: c */
    private boolean f2035c = false;

    public AbstractC0566ct(AbstractC0564cr abstractC0564cr, Object obj) {
        this.f2034b = abstractC0564cr;
        this.f2033a = obj;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo2649a();

    /* JADX INFO: renamed from: a */
    protected abstract void mo2650a(Object obj);

    /* JADX INFO: renamed from: b */
    public void m2651b() {
        Object obj;
        synchronized (this) {
            obj = this.f2033a;
            if (this.f2035c) {
                Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                mo2650a(obj);
            } catch (RuntimeException e) {
                mo2649a();
                throw e;
            }
        } else {
            mo2649a();
        }
        synchronized (this) {
            this.f2035c = true;
        }
        m2652c();
    }

    /* JADX INFO: renamed from: c */
    public void m2652c() {
        m2653d();
        synchronized (this.f2034b.f2028l) {
            this.f2034b.f2028l.remove(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2653d() {
        synchronized (this) {
            this.f2033a = null;
        }
    }
}
