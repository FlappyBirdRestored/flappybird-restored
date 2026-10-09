package com.google.ads;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.ads.bc */
/* JADX INFO: loaded from: classes.dex */
public class C0300bc {

    /* JADX INFO: renamed from: a */
    private C0298ba f977a = null;

    /* JADX INFO: renamed from: b */
    private long f978b = -1;

    /* JADX INFO: renamed from: a */
    public void m1265a(C0298ba c0298ba, int i) {
        this.f977a = c0298ba;
        this.f978b = TimeUnit.MILLISECONDS.convert(i, TimeUnit.SECONDS) + SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: a */
    public boolean m1266a() {
        return this.f977a != null && SystemClock.elapsedRealtime() < this.f978b;
    }

    /* JADX INFO: renamed from: b */
    public C0298ba m1267b() {
        return this.f977a;
    }
}
