package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p015a.C0657bk;

/* JADX INFO: loaded from: classes.dex */
public final class LatLng implements SafeParcelable {
    public static final C0717g CREATOR = new C0717g();

    /* JADX INFO: renamed from: a */
    public final double f2184a;

    /* JADX INFO: renamed from: b */
    public final double f2185b;

    /* JADX INFO: renamed from: c */
    private final int f2186c;

    public LatLng(double d, double d2) {
        this(1, d, d2);
    }

    LatLng(int i, double d, double d2) {
        this.f2186c = i;
        if (-180.0d > d2 || d2 >= 180.0d) {
            this.f2185b = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f2185b = d2;
        }
        this.f2184a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    /* JADX INFO: renamed from: a */
    int m2999a() {
        return this.f2186c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f2184a) == Double.doubleToLongBits(latLng.f2184a) && Double.doubleToLongBits(this.f2185b) == Double.doubleToLongBits(latLng.f2185b);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f2184a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f2185b);
        return ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f2184a + "," + this.f2185b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (C0657bk.m2880a()) {
            C0731u.m3204a(this, parcel, i);
        } else {
            C0717g.m3179a(this, parcel, i);
        }
    }
}
