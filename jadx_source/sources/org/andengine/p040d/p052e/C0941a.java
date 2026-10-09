package org.andengine.p040d.p052e;

import android.util.Log;

/* JADX INFO: renamed from: org.andengine.d.e.a */
/* JADX INFO: loaded from: classes.dex */
public class C0941a {

    /* JADX INFO: renamed from: a */
    private static String f2769a = "AndEngine";

    /* JADX INFO: renamed from: b */
    private static String f2770b = "";

    /* JADX INFO: renamed from: c */
    private static EnumC0942b f2771c = EnumC0942b.VERBOSE;

    /* JADX INFO: renamed from: a */
    public static void m3821a(String str) {
        m3822a(f2769a, str, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m3822a(String str, String str2, Throwable th) {
        if (f2771c.m3832a(EnumC0942b.VERBOSE)) {
            if (th == null) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3823a(String str, Throwable th) {
        m3826b(f2769a, str, th);
    }

    /* JADX INFO: renamed from: a */
    public static void m3824a(Throwable th) {
        m3827b(f2769a, th);
    }

    /* JADX INFO: renamed from: b */
    public static void m3825b(String str) {
        m3826b(f2769a, str, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m3826b(String str, String str2, Throwable th) {
        if (f2771c.m3832a(EnumC0942b.DEBUG)) {
            if (th == null) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, th);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3827b(String str, Throwable th) {
        m3831d(f2769a, str, th);
    }

    /* JADX INFO: renamed from: c */
    public static void m3828c(String str) {
        m3829c(f2769a, str, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m3829c(String str, String str2, Throwable th) {
        if (f2771c.m3832a(EnumC0942b.WARNING)) {
            if (th == null) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, th);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3830d(String str) {
        m3831d(f2769a, str, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m3831d(String str, String str2, Throwable th) {
        if (f2771c.m3832a(EnumC0942b.ERROR)) {
            if (th == null) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, th);
            }
        }
    }
}
