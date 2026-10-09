package com.google.ads.util;

import android.util.Log;

/* JADX INFO: renamed from: com.google.ads.util.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0364g {

    /* JADX INFO: renamed from: a */
    public static InterfaceC0366i f1365a = null;

    /* JADX INFO: renamed from: b */
    private static int f1366b = 5;

    /* JADX INFO: renamed from: a */
    private static void m1389a(EnumC0365h enumC0365h, String str) {
        m1390a(enumC0365h, str, null);
    }

    /* JADX INFO: renamed from: a */
    private static void m1390a(EnumC0365h enumC0365h, String str, Throwable th) {
        if (f1365a != null) {
            f1365a.m1402a(enumC0365h, str, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1391a(String str) {
        if (m1394a("Ads", 3)) {
            Log.d("Ads", str);
        }
        m1389a(EnumC0365h.DEBUG, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m1392a(String str, Throwable th) {
        if (m1394a("Ads", 3)) {
            Log.d("Ads", str, th);
        }
        m1390a(EnumC0365h.DEBUG, str, th);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1393a(int i) {
        return i >= f1366b;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1394a(String str, int i) {
        return m1393a(i) || Log.isLoggable(str, i);
    }

    /* JADX INFO: renamed from: b */
    public static void m1395b(String str) {
        if (m1394a("Ads", 6)) {
            Log.e("Ads", str);
        }
        m1389a(EnumC0365h.ERROR, str);
    }

    /* JADX INFO: renamed from: b */
    public static void m1396b(String str, Throwable th) {
        if (m1394a("Ads", 6)) {
            Log.e("Ads", str);
            Log.i("Ads", "The following was caught and handled:", th);
        }
        m1390a(EnumC0365h.ERROR, str, th);
    }

    /* JADX INFO: renamed from: c */
    public static void m1397c(String str) {
        if (m1394a("Ads", 4)) {
            Log.i("Ads", str);
        }
        m1389a(EnumC0365h.INFO, str);
    }

    /* JADX INFO: renamed from: c */
    public static void m1398c(String str, Throwable th) {
        if (m1394a("Ads", 4)) {
            Log.i("Ads", str, th);
        }
        m1390a(EnumC0365h.INFO, str, th);
    }

    /* JADX INFO: renamed from: d */
    public static void m1399d(String str) {
        if (m1394a("Ads", 2)) {
            Log.v("Ads", str);
        }
        m1389a(EnumC0365h.VERBOSE, str);
    }

    /* JADX INFO: renamed from: d */
    public static void m1400d(String str, Throwable th) {
        if (m1394a("Ads", 5)) {
            Log.w("Ads", str);
            Log.i("Ads", "The following was caught and handled:", th);
        }
        m1390a(EnumC0365h.WARN, str, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m1401e(String str) {
        if (m1394a("Ads", 5)) {
            Log.w("Ads", str);
        }
        m1389a(EnumC0365h.WARN, str);
    }
}
