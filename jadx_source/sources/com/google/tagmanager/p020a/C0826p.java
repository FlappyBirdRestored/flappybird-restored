package com.google.tagmanager.p020a;

/* JADX INFO: renamed from: com.google.tagmanager.a.p */
/* JADX INFO: loaded from: classes.dex */
final class C0826p {

    /* JADX INFO: renamed from: a */
    private final Object f2450a;

    /* JADX INFO: renamed from: b */
    private final int f2451b;

    C0826p(Object obj, int i) {
        this.f2450a = obj;
        this.f2451b = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0826p)) {
            return false;
        }
        C0826p c0826p = (C0826p) obj;
        return this.f2450a == c0826p.f2450a && this.f2451b == c0826p.f2451b;
    }

    public int hashCode() {
        return (System.identityHashCode(this.f2450a) * 65535) + this.f2451b;
    }
}
