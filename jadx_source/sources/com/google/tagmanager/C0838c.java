package com.google.tagmanager;

import com.google.analytics.p007a.p008a.C0405q;

/* JADX INFO: renamed from: com.google.tagmanager.c */
/* JADX INFO: loaded from: classes.dex */
public class C0838c {

    /* JADX INFO: renamed from: a */
    private final C0853r f2467a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0839d f2468b;

    /* JADX INFO: renamed from: c */
    private C0850o f2469c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0837b f2470d;

    /* JADX INFO: renamed from: e */
    private volatile String f2471e;

    /* JADX INFO: renamed from: f */
    private volatile C0405q f2472f;

    /* JADX INFO: renamed from: g */
    private volatile long f2473g;

    /* JADX INFO: renamed from: h */
    private volatile int f2474h;

    /* JADX INFO: renamed from: b */
    private boolean m3508b(long j) {
        if (this.f2473g == 0) {
            this.f2474h--;
            return true;
        }
        long j2 = j - this.f2473g;
        if (j2 < 5000) {
            return false;
        }
        if (this.f2474h < 30) {
            this.f2474h = Math.min(30, ((int) Math.floor(j2 / 900000)) + this.f2474h);
        }
        if (this.f2474h <= 0) {
            return false;
        }
        this.f2474h--;
        return true;
    }

    /* JADX INFO: renamed from: c */
    private synchronized C0850o m3509c() {
        return this.f2469c;
    }

    /* JADX INFO: renamed from: d */
    private boolean m3510d() {
        return this.f2467a.m3541a() == EnumC0858w.DEFAULT_CONTAINER;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m3511a() {
        try {
            if (m3509c() == null) {
                C0844i.m3527b("refresh called for closed container");
            } else {
                try {
                    if (m3510d()) {
                        C0844i.m3527b("Container is in DEFAULT_CONTAINER mode. Refresh request is ignored.");
                    } else {
                        long jM3507a = this.f2470d.m3507a();
                        if (m3508b(jM3507a)) {
                            C0844i.m3529d("Container refresh requested");
                            m3512a(0L);
                            this.f2473g = jM3507a;
                        } else {
                            C0844i.m3529d("Container refresh was called too often. Ignored.");
                        }
                    }
                } catch (Exception e) {
                    C0844i.m3526a("Calling refresh() throws an exception: " + e.getMessage());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    synchronized void m3512a(long j) {
        if (this.f2468b != null && !m3510d()) {
            this.f2468b.m3515a(j, this.f2472f == null ? null : this.f2472f.m1575C());
        }
    }

    /* JADX INFO: renamed from: a */
    synchronized void m3513a(String str) {
        this.f2471e = str;
        if (this.f2468b != null) {
            this.f2468b.m3516a(str);
        }
    }

    /* JADX INFO: renamed from: b */
    String m3514b() {
        return this.f2471e;
    }
}
