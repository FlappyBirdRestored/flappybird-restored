package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.do */
/* JADX INFO: loaded from: classes.dex */
public final class C0588do {
    /* JADX INFO: renamed from: a */
    public static Object m2704a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public static Object m2705a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public static void m2706a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2707a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2708a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2709b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2710b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
