package com.google.ads.util;

import android.os.Build;

/* JADX INFO: renamed from: com.google.ads.util.m */
/* JADX INFO: loaded from: classes.dex */
class C0370m {

    /* JADX INFO: renamed from: d */
    static final C0370m f1382d = new C0370m();

    /* JADX INFO: renamed from: e */
    static final C0370m f1383e = new C0370m("unknown", "generic", "generic");

    /* JADX INFO: renamed from: f */
    static final C0370m f1384f = new C0370m("unknown", "generic_x86", "Android");

    /* JADX INFO: renamed from: a */
    public final String f1385a;

    /* JADX INFO: renamed from: b */
    public final String f1386b;

    /* JADX INFO: renamed from: c */
    public final String f1387c;

    C0370m() {
        this.f1385a = Build.BOARD;
        this.f1386b = Build.DEVICE;
        this.f1387c = Build.BRAND;
    }

    C0370m(String str, String str2, String str3) {
        this.f1385a = str;
        this.f1386b = str2;
        this.f1387c = str3;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1407a(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        return str == str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0370m)) {
            return false;
        }
        C0370m c0370m = (C0370m) obj;
        return m1407a(this.f1385a, c0370m.f1385a) && m1407a(this.f1386b, c0370m.f1386b) && m1407a(this.f1387c, c0370m.f1387c);
    }

    public int hashCode() {
        int iHashCode = this.f1385a != null ? 0 + this.f1385a.hashCode() : 0;
        if (this.f1386b != null) {
            iHashCode += this.f1386b.hashCode();
        }
        return this.f1387c != null ? iHashCode + this.f1387c.hashCode() : iHashCode;
    }
}
