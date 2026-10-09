package org.andengine.p040d.p056i;

import android.os.Build;

/* JADX INFO: renamed from: org.andengine.d.i.a */
/* JADX INFO: loaded from: classes.dex */
public class C0949a {

    /* JADX INFO: renamed from: a */
    public static final boolean f2783a;

    /* JADX INFO: renamed from: b */
    public static final boolean f2784b;

    /* JADX INFO: renamed from: c */
    public static final boolean f2785c;

    /* JADX INFO: renamed from: d */
    public static final boolean f2786d;

    /* JADX INFO: renamed from: e */
    public static final boolean f2787e;

    static {
        f2783a = Build.VERSION.SDK_INT >= 5;
        f2784b = Build.VERSION.SDK_INT >= 8;
        f2785c = Build.VERSION.SDK_INT >= 9;
        f2786d = Build.VERSION.SDK_INT >= 11;
        f2787e = Build.VERSION.SDK_INT >= 14;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3843a(int i) {
        return Build.VERSION.SDK_INT <= i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3844a(int i, int i2) {
        return Build.VERSION.SDK_INT >= i && Build.VERSION.SDK_INT <= i2;
    }
}
