package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.cy */
/* JADX INFO: loaded from: classes.dex */
final class C0571cy {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0570cx f2047a;

    /* JADX INFO: renamed from: b */
    private final String f2048b;

    /* JADX INFO: renamed from: c */
    private final ServiceConnectionC0572cz f2049c = new ServiceConnectionC0572cz(this);

    /* JADX INFO: renamed from: d */
    private final HashSet f2050d = new HashSet();

    /* JADX INFO: renamed from: e */
    private int f2051e = 0;

    /* JADX INFO: renamed from: f */
    private boolean f2052f;

    /* JADX INFO: renamed from: g */
    private IBinder f2053g;

    /* JADX INFO: renamed from: h */
    private ComponentName f2054h;

    public C0571cy(C0570cx c0570cx, String str) {
        this.f2047a = c0570cx;
        this.f2048b = str;
    }

    /* JADX INFO: renamed from: a */
    public ServiceConnectionC0572cz m2664a() {
        return this.f2049c;
    }

    /* JADX INFO: renamed from: a */
    public void m2665a(ServiceConnectionC0568cv serviceConnectionC0568cv) {
        this.f2050d.add(serviceConnectionC0568cv);
    }

    /* JADX INFO: renamed from: a */
    public void m2666a(boolean z) {
        this.f2052f = z;
    }

    /* JADX INFO: renamed from: b */
    public String m2667b() {
        return this.f2048b;
    }

    /* JADX INFO: renamed from: b */
    public void m2668b(ServiceConnectionC0568cv serviceConnectionC0568cv) {
        this.f2050d.remove(serviceConnectionC0568cv);
    }

    /* JADX INFO: renamed from: c */
    public boolean m2669c() {
        return this.f2052f;
    }

    /* JADX INFO: renamed from: c */
    public boolean m2670c(ServiceConnectionC0568cv serviceConnectionC0568cv) {
        return this.f2050d.contains(serviceConnectionC0568cv);
    }

    /* JADX INFO: renamed from: d */
    public int m2671d() {
        return this.f2051e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m2672e() {
        return this.f2050d.isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public IBinder m2673f() {
        return this.f2053g;
    }

    /* JADX INFO: renamed from: g */
    public ComponentName m2674g() {
        return this.f2054h;
    }
}
