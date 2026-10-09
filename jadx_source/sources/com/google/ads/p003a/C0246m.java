package com.google.ads.p003a;

import com.google.ads.util.C0364g;

/* JADX INFO: renamed from: com.google.ads.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0246m extends Exception {

    /* JADX INFO: renamed from: a */
    public final boolean f826a;

    public C0246m(String str, boolean z) {
        super(str);
        this.f826a = z;
    }

    public C0246m(String str, boolean z, Throwable th) {
        super(str, th);
        this.f826a = z;
    }

    /* JADX INFO: renamed from: a */
    public void m1048a(String str) {
        C0364g.m1395b(m1050c(str));
        C0364g.m1392a((String) null, this);
    }

    /* JADX INFO: renamed from: b */
    public void m1049b(String str) {
        String strM1050c = m1050c(str);
        if (!this.f826a) {
            this = null;
        }
        throw new RuntimeException(strM1050c, this);
    }

    /* JADX INFO: renamed from: c */
    public String m1050c(String str) {
        return this.f826a ? str + ": " + getMessage() : str;
    }
}
