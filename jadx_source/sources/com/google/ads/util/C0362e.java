package com.google.ads.util;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: com.google.ads.util.e */
/* JADX INFO: loaded from: classes.dex */
public class C0362e {

    /* JADX INFO: renamed from: a */
    private static boolean f1364a = Log.isLoggable("GoogleAdsAssertion", 3);

    /* JADX INFO: renamed from: a */
    public static void m1382a(Object obj) {
        m1388c(obj != null, "Assertion that an object is not null failed.");
    }

    /* JADX INFO: renamed from: a */
    public static void m1383a(Object obj, Object obj2) {
        m1388c(obj == obj2, "Assertion that 'a' and 'b' refer to the same object failed.a: " + obj + ", b: " + obj2);
    }

    /* JADX INFO: renamed from: a */
    public static void m1384a(String str) {
        m1388c(!TextUtils.isEmpty(str), "Expected a non empty string, got: " + str);
    }

    /* JADX INFO: renamed from: a */
    public static void m1385a(boolean z) {
        m1388c(!z, "Assertion failed.");
    }

    /* JADX INFO: renamed from: a */
    public static void m1386a(boolean z, String str) {
        m1388c(z, str);
    }

    /* JADX INFO: renamed from: b */
    public static void m1387b(boolean z, String str) {
        m1388c(!z, str);
    }

    /* JADX INFO: renamed from: c */
    private static void m1388c(boolean z, String str) {
        if ((Log.isLoggable("GoogleAdsAssertion", 3) || f1364a) && !z) {
            C0363f c0363f = new C0363f(str);
            Log.d("GoogleAdsAssertion", str, c0363f);
            throw c0363f;
        }
    }
}
