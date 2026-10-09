package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0612x implements SafeParcelable {
    public static final C0592ds CREATOR = new C0592ds();

    /* JADX INFO: renamed from: a */
    private final int f2092a;

    /* JADX INFO: renamed from: b */
    private final int f2093b;

    /* JADX INFO: renamed from: c */
    private final int f2094c;

    /* JADX INFO: renamed from: d */
    private final String f2095d;

    /* JADX INFO: renamed from: e */
    private final String f2096e;

    /* JADX INFO: renamed from: f */
    private final String f2097f;

    /* JADX INFO: renamed from: g */
    private final String f2098g;

    public C0612x(int i, int i2, int i3, String str, String str2, String str3, String str4) {
        this.f2092a = i;
        this.f2093b = i2;
        this.f2094c = i3;
        this.f2095d = str;
        this.f2096e = str2;
        this.f2097f = str3;
        this.f2098g = str4;
    }

    /* JADX INFO: renamed from: a */
    public int m2778a() {
        return this.f2092a;
    }

    /* JADX INFO: renamed from: b */
    public int m2779b() {
        return this.f2093b;
    }

    /* JADX INFO: renamed from: c */
    public int m2780c() {
        return this.f2094c;
    }

    /* JADX INFO: renamed from: d */
    public String m2781d() {
        return this.f2095d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public String m2782e() {
        return this.f2096e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0612x)) {
            return false;
        }
        C0612x c0612x = (C0612x) obj;
        return this.f2092a == c0612x.f2092a && this.f2093b == c0612x.f2093b && this.f2094c == c0612x.f2094c && C0585dl.m2702a(this.f2095d, c0612x.f2095d) && C0585dl.m2702a(this.f2096e, c0612x.f2096e);
    }

    /* JADX INFO: renamed from: f */
    public String m2783f() {
        return this.f2097f;
    }

    /* JADX INFO: renamed from: g */
    public String m2784g() {
        return this.f2098g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m2785h() {
        return this.f2093b == 1 && this.f2094c == -1;
    }

    public int hashCode() {
        return C0585dl.m2700a(Integer.valueOf(this.f2092a), Integer.valueOf(this.f2093b), Integer.valueOf(this.f2094c), this.f2095d, this.f2096e);
    }

    /* JADX INFO: renamed from: i */
    public boolean m2786i() {
        return this.f2093b == 2;
    }

    public String toString() {
        if (m2786i()) {
            return String.format("Person [%s] %s", m2782e(), m2783f());
        }
        return m2785h() ? String.format("Circle [%s] %s", m2781d(), m2783f()) : String.format("Group [%s] %s", m2781d(), m2783f());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0592ds.m2719a(this, parcel, i);
    }
}
