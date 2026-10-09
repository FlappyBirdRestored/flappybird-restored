package com.google.android.gms.internal;

import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0604p {
    /* JADX INFO: renamed from: a */
    public static boolean m2754a() {
        return m2755a(11);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2755a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2756b() {
        return m2755a(12);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2757c() {
        return m2755a(13);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2758d() {
        return m2755a(16);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2759e() {
        return m2755a(17);
    }
}
