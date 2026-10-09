package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.dn */
/* JADX INFO: loaded from: classes.dex */
public final class C0587dn {

    /* JADX INFO: renamed from: a */
    private final List f2062a;

    /* JADX INFO: renamed from: b */
    private final Object f2063b;

    private C0587dn(Object obj) {
        this.f2063b = C0588do.m2704a(obj);
        this.f2062a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public C0587dn m2703a(String str, Object obj) {
        this.f2062a.add(((String) C0588do.m2704a(str)) + "=" + String.valueOf(obj));
        return this;
    }

    public String toString() {
        StringBuilder sbAppend = new StringBuilder(100).append(this.f2063b.getClass().getSimpleName()).append('{');
        int size = this.f2062a.size();
        for (int i = 0; i < size; i++) {
            sbAppend.append((String) this.f2062a.get(i));
            if (i < size - 1) {
                sbAppend.append(", ");
            }
        }
        return sbAppend.append('}').toString();
    }
}
