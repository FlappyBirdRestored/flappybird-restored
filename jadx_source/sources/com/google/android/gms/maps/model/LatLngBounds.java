package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0585dl;
import com.google.android.gms.internal.C0588do;
import com.google.android.gms.maps.p015a.C0657bk;

/* JADX INFO: loaded from: classes.dex */
public final class LatLngBounds implements SafeParcelable {
    public static final C0716f CREATOR = new C0716f();

    /* JADX INFO: renamed from: a */
    public final LatLng f2187a;

    /* JADX INFO: renamed from: b */
    public final LatLng f2188b;

    /* JADX INFO: renamed from: c */
    private final int f2189c;

    LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        C0588do.m2705a(latLng, "null southwest");
        C0588do.m2705a(latLng2, "null northeast");
        C0588do.m2708a(latLng2.f2184a >= latLng.f2184a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.f2184a), Double.valueOf(latLng2.f2184a));
        this.f2189c = i;
        this.f2187a = latLng;
        this.f2188b = latLng2;
    }

    /* JADX INFO: renamed from: a */
    int m3000a() {
        return this.f2189c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f2187a.equals(latLngBounds.f2187a) && this.f2188b.equals(latLngBounds.f2188b);
    }

    public int hashCode() {
        return C0585dl.m2700a(this.f2187a, this.f2188b);
    }

    public String toString() {
        return C0585dl.m2701a(this).m2703a("southwest", this.f2187a).m2703a("northeast", this.f2188b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (C0657bk.m2880a()) {
            C0730t.m3203a(this, parcel, i);
        } else {
            C0716f.m3176a(this, parcel, i);
        }
    }
}
