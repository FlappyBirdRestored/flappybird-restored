package com.google.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: com.google.ads.g */
/* JADX INFO: loaded from: classes.dex */
public class C0337g {

    /* JADX INFO: renamed from: a */
    public static final C0337g f1117a = new C0337g(-1, -2, "mb");

    /* JADX INFO: renamed from: b */
    public static final C0337g f1118b = new C0337g(320, 50, "mb");

    /* JADX INFO: renamed from: c */
    public static final C0337g f1119c = new C0337g(300, 250, "as");

    /* JADX INFO: renamed from: d */
    public static final C0337g f1120d = new C0337g(468, 60, "as");

    /* JADX INFO: renamed from: e */
    public static final C0337g f1121e = new C0337g(728, 90, "as");

    /* JADX INFO: renamed from: f */
    public static final C0337g f1122f = new C0337g(160, 600, "as");

    /* JADX INFO: renamed from: g */
    private final int f1123g;

    /* JADX INFO: renamed from: h */
    private final int f1124h;

    /* JADX INFO: renamed from: i */
    private boolean f1125i;

    /* JADX INFO: renamed from: j */
    private boolean f1126j;

    /* JADX INFO: renamed from: k */
    private boolean f1127k;

    /* JADX INFO: renamed from: l */
    private String f1128l;

    public C0337g(int i, int i2) {
        this(i, i2, null);
        if (!m1326f()) {
            this.f1127k = true;
        } else {
            this.f1127k = false;
            this.f1128l = "mb";
        }
    }

    private C0337g(int i, int i2, String str) {
        this.f1123g = i;
        this.f1124h = i2;
        this.f1128l = str;
        this.f1125i = i == -1;
        this.f1126j = i2 == -2;
        this.f1127k = false;
    }

    /* JADX INFO: renamed from: a */
    private static int m1323a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    /* JADX INFO: renamed from: a */
    public static C0337g m1324a(C0337g c0337g, Context context) {
        if (context == null || !c0337g.m1326f()) {
            return c0337g.m1326f() ? f1118b : c0337g;
        }
        C0337g c0337g2 = new C0337g(c0337g.f1125i ? m1323a(context) : c0337g.m1327a(), c0337g.f1126j ? m1325b(context) : c0337g.m1328b(), c0337g.f1128l);
        c0337g2.f1126j = c0337g.f1126j;
        c0337g2.f1125i = c0337g.f1125i;
        c0337g2.f1127k = c0337g.f1127k;
        return c0337g2;
    }

    /* JADX INFO: renamed from: b */
    private static int m1325b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    /* JADX INFO: renamed from: f */
    private boolean m1326f() {
        return this.f1123g < 0 || this.f1124h < 0;
    }

    /* JADX INFO: renamed from: a */
    public int m1327a() {
        if (this.f1123g < 0) {
            throw new UnsupportedOperationException("Ad size was not set before getWidth() was called.");
        }
        return this.f1123g;
    }

    /* JADX INFO: renamed from: b */
    public int m1328b() {
        if (this.f1124h < 0) {
            throw new UnsupportedOperationException("Ad size was not set before getHeight() was called.");
        }
        return this.f1124h;
    }

    /* JADX INFO: renamed from: c */
    public boolean m1329c() {
        return this.f1125i;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1330d() {
        return this.f1126j;
    }

    /* JADX INFO: renamed from: e */
    public boolean m1331e() {
        return this.f1127k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0337g)) {
            return false;
        }
        C0337g c0337g = (C0337g) obj;
        return this.f1123g == c0337g.f1123g && this.f1124h == c0337g.f1124h;
    }

    public int hashCode() {
        return (Integer.valueOf(this.f1123g).hashCode() << 16) | (Integer.valueOf(this.f1124h).hashCode() & 65535);
    }

    public String toString() {
        return m1327a() + "x" + m1328b() + (this.f1128l == null ? "" : "_" + this.f1128l);
    }
}
