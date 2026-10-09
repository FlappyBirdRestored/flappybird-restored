package com.google.android.gms.internal;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.dl */
/* JADX INFO: loaded from: classes.dex */
public final class C0585dl {
    /* JADX INFO: renamed from: a */
    public static int m2700a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* JADX INFO: renamed from: a */
    public static C0587dn m2701a(Object obj) {
        return new C0587dn(obj);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2702a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
