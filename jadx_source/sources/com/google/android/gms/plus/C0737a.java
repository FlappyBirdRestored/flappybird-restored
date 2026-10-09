package com.google.android.gms.plus;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0585dl;

/* JADX INFO: renamed from: com.google.android.gms.plus.a */
/* JADX INFO: loaded from: classes.dex */
public class C0737a implements SafeParcelable {
    public static final C0760l CREATOR = new C0760l();

    /* JADX INFO: renamed from: a */
    private final int f2262a;

    /* JADX INFO: renamed from: b */
    private final String f2263b;

    /* JADX INFO: renamed from: c */
    private final String[] f2264c;

    /* JADX INFO: renamed from: d */
    private final String[] f2265d;

    /* JADX INFO: renamed from: e */
    private final String[] f2266e;

    /* JADX INFO: renamed from: f */
    private final String f2267f;

    /* JADX INFO: renamed from: g */
    private final String f2268g;

    /* JADX INFO: renamed from: h */
    private final String f2269h;

    public C0737a(int i, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4) {
        this.f2262a = i;
        this.f2263b = str;
        this.f2264c = strArr;
        this.f2265d = strArr2;
        this.f2266e = strArr3;
        this.f2267f = str2;
        this.f2268g = str3;
        this.f2269h = str4;
    }

    public C0737a(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4) {
        this.f2262a = 1;
        this.f2263b = str;
        this.f2264c = strArr;
        this.f2265d = strArr2;
        this.f2266e = strArr3;
        this.f2267f = str2;
        this.f2268g = str3;
        this.f2269h = str4;
    }

    /* JADX INFO: renamed from: a */
    public int m3218a() {
        return this.f2262a;
    }

    /* JADX INFO: renamed from: b */
    public String m3219b() {
        return this.f2263b;
    }

    /* JADX INFO: renamed from: c */
    public String[] m3220c() {
        return this.f2264c;
    }

    /* JADX INFO: renamed from: d */
    public String[] m3221d() {
        return this.f2265d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public String[] m3222e() {
        return this.f2266e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0737a)) {
            return false;
        }
        C0737a c0737a = (C0737a) obj;
        return this.f2262a == c0737a.f2262a && C0585dl.m2702a(this.f2263b, c0737a.f2263b) && C0585dl.m2702a(this.f2264c, c0737a.f2264c) && C0585dl.m2702a(this.f2265d, c0737a.f2265d) && C0585dl.m2702a(this.f2266e, c0737a.f2266e) && C0585dl.m2702a(this.f2267f, c0737a.f2267f) && C0585dl.m2702a(this.f2268g, c0737a.f2268g) && C0585dl.m2702a(this.f2269h, c0737a.f2269h);
    }

    /* JADX INFO: renamed from: f */
    public String m3223f() {
        return this.f2267f;
    }

    /* JADX INFO: renamed from: g */
    public String m3224g() {
        return this.f2268g;
    }

    /* JADX INFO: renamed from: h */
    public String m3225h() {
        return this.f2269h;
    }

    public int hashCode() {
        return C0585dl.m2700a(Integer.valueOf(this.f2262a), this.f2263b, this.f2264c, this.f2265d, this.f2266e, this.f2267f, this.f2268g, this.f2269h);
    }

    public String toString() {
        return C0585dl.m2701a(this).m2703a("versionCode", Integer.valueOf(this.f2262a)).m2703a("accountName", this.f2263b).m2703a("requestedScopes", this.f2264c).m2703a("visibleActivities", this.f2265d).m2703a("requiredFeatures", this.f2266e).m2703a("packageNameForAuth", this.f2267f).m2703a("callingPackageName", this.f2268g).m2703a("applicationName", this.f2269h).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0760l.m3236a(this, parcel, i);
    }
}
