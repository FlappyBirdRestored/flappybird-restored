package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0585dl;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest implements SafeParcelable {
    public static final C0617c CREATOR = new C0617c();

    /* JADX INFO: renamed from: a */
    int f2108a;

    /* JADX INFO: renamed from: b */
    long f2109b;

    /* JADX INFO: renamed from: c */
    long f2110c;

    /* JADX INFO: renamed from: d */
    boolean f2111d;

    /* JADX INFO: renamed from: e */
    long f2112e;

    /* JADX INFO: renamed from: f */
    int f2113f;

    /* JADX INFO: renamed from: g */
    float f2114g;

    /* JADX INFO: renamed from: h */
    private final int f2115h;

    public LocationRequest() {
        this.f2115h = 1;
        this.f2108a = 102;
        this.f2109b = 3600000L;
        this.f2110c = 600000L;
        this.f2111d = false;
        this.f2112e = Long.MAX_VALUE;
        this.f2113f = Integer.MAX_VALUE;
        this.f2114g = 0.0f;
    }

    LocationRequest(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f) {
        this.f2115h = i;
        this.f2108a = i2;
        this.f2109b = j;
        this.f2110c = j2;
        this.f2111d = z;
        this.f2112e = j3;
        this.f2113f = i3;
        this.f2114g = f;
    }

    /* JADX INFO: renamed from: a */
    public static String m2795a(int i) {
        switch (i) {
            case 100:
                return "PRIORITY_HIGH_ACCURACY";
            case 101:
            case 103:
            default:
                return "???";
            case 102:
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            case 104:
                return "PRIORITY_LOW_POWER";
            case 105:
                return "PRIORITY_NO_POWER";
        }
    }

    /* JADX INFO: renamed from: a */
    int m2796a() {
        return this.f2115h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f2108a == locationRequest.f2108a && this.f2109b == locationRequest.f2109b && this.f2110c == locationRequest.f2110c && this.f2111d == locationRequest.f2111d && this.f2112e == locationRequest.f2112e && this.f2113f == locationRequest.f2113f && this.f2114g == locationRequest.f2114g;
    }

    public int hashCode() {
        return C0585dl.m2700a(Integer.valueOf(this.f2108a), Long.valueOf(this.f2109b), Long.valueOf(this.f2110c), Boolean.valueOf(this.f2111d), Long.valueOf(this.f2112e), Integer.valueOf(this.f2113f), Float.valueOf(this.f2114g));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[").append(m2795a(this.f2108a));
        if (this.f2108a != 105) {
            sb.append(" requested=");
            sb.append(this.f2109b + "ms");
        }
        sb.append(" fastest=");
        sb.append(this.f2110c + "ms");
        if (this.f2112e != Long.MAX_VALUE) {
            long jElapsedRealtime = this.f2112e - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(jElapsedRealtime + "ms");
        }
        if (this.f2113f != Integer.MAX_VALUE) {
            sb.append(" num=").append(this.f2113f);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0617c.m2803a(this, parcel, i);
    }
}
