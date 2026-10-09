package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.ai */
/* JADX INFO: loaded from: classes.dex */
public class C0501ai {

    /* JADX INFO: renamed from: a */
    protected C0606r f1781a;

    /* JADX INFO: renamed from: b */
    protected C0504al f1782b;

    private C0501ai(C0606r c0606r, int i) {
        this.f1781a = c0606r;
        mo2264a(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0501ai m2262a(C0606r c0606r, int i) {
        return C0604p.m2756b() ? new ViewOnAttachStateChangeListenerC0505am(c0606r, i) : new C0501ai(c0606r, i);
    }

    /* JADX INFO: renamed from: a */
    public void mo2263a() {
        this.f1781a.m2764a(this.f1782b.f1790a, this.f1782b.m2279a());
    }

    /* JADX INFO: renamed from: a */
    protected void mo2264a(int i) {
        this.f1782b = new C0504al(i, new Binder());
    }

    /* JADX INFO: renamed from: a */
    public void mo2265a(View view) {
    }

    /* JADX INFO: renamed from: b */
    public IBinder m2266b() {
        return this.f1782b.f1790a;
    }
}
