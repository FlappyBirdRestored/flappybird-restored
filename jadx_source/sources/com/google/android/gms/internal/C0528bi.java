package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.bi */
/* JADX INFO: loaded from: classes.dex */
public class C0528bi implements SafeParcelable {
    public static final C0508ap CREATOR = new C0508ap();

    /* JADX INFO: renamed from: a */
    private final int f1808a;

    /* JADX INFO: renamed from: b */
    private final String f1809b;

    /* JADX INFO: renamed from: c */
    private final long f1810c;

    /* JADX INFO: renamed from: d */
    private final short f1811d;

    /* JADX INFO: renamed from: e */
    private final double f1812e;

    /* JADX INFO: renamed from: f */
    private final double f1813f;

    /* JADX INFO: renamed from: g */
    private final float f1814g;

    /* JADX INFO: renamed from: h */
    private final int f1815h;

    public C0528bi(int i, String str, int i2, short s, double d, double d2, float f, long j) {
        m2372a(str);
        m2371a(f);
        m2370a(d, d2);
        int iM2369a = m2369a(i2);
        this.f1808a = i;
        this.f1811d = s;
        this.f1809b = str;
        this.f1812e = d;
        this.f1813f = d2;
        this.f1814g = f;
        this.f1810c = j;
        this.f1815h = iM2369a;
    }

    /* JADX INFO: renamed from: a */
    private static int m2369a(int i) {
        int i2 = i & 3;
        if (i2 == 0) {
            throw new IllegalArgumentException("No supported transition specified: " + i);
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    private static void m2370a(double d, double d2) {
        if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2371a(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2372a(String str) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: " + str);
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m2373b(int i) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return "CIRCLE";
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m2374a() {
        return this.f1808a;
    }

    /* JADX INFO: renamed from: b */
    public short m2375b() {
        return this.f1811d;
    }

    /* JADX INFO: renamed from: c */
    public double m2376c() {
        return this.f1812e;
    }

    /* JADX INFO: renamed from: d */
    public double m2377d() {
        return this.f1813f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        C0508ap c0508ap = CREATOR;
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public float m2378e() {
        return this.f1814g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0528bi)) {
            C0528bi c0528bi = (C0528bi) obj;
            return this.f1814g == c0528bi.f1814g && this.f1812e == c0528bi.f1812e && this.f1813f == c0528bi.f1813f && this.f1811d == c0528bi.f1811d;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public String m2379f() {
        return this.f1809b;
    }

    /* JADX INFO: renamed from: g */
    public long m2380g() {
        return this.f1810c;
    }

    /* JADX INFO: renamed from: h */
    public int m2381h() {
        return this.f1815h;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f1812e);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f1813f);
        return ((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f1814g)) * 31) + this.f1811d) * 31) + this.f1815h;
    }

    public String toString() {
        return String.format("Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, @%d]", m2373b(this.f1811d), this.f1809b, Integer.valueOf(this.f1815h), Double.valueOf(this.f1812e), Double.valueOf(this.f1813f), Float.valueOf(this.f1814g), Long.valueOf(this.f1810c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0508ap c0508ap = CREATOR;
        C0508ap.m2283a(this, parcel, i);
    }
}
