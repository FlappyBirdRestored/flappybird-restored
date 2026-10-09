package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0585dl;
import com.google.android.gms.maps.p015a.C0657bk;

/* JADX INFO: loaded from: classes.dex */
public final class VisibleRegion implements SafeParcelable {
    public static final C0726p CREATOR = new C0726p();

    /* JADX INFO: renamed from: a */
    public final LatLng f2228a;

    /* JADX INFO: renamed from: b */
    public final LatLng f2229b;

    /* JADX INFO: renamed from: c */
    public final LatLng f2230c;

    /* JADX INFO: renamed from: d */
    public final LatLng f2231d;

    /* JADX INFO: renamed from: e */
    public final LatLngBounds f2232e;

    /* JADX INFO: renamed from: f */
    private final int f2233f;

    VisibleRegion(int i, LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f2233f = i;
        this.f2228a = latLng;
        this.f2229b = latLng2;
        this.f2230c = latLng3;
        this.f2231d = latLng4;
        this.f2232e = latLngBounds;
    }

    /* JADX INFO: renamed from: a */
    int m3036a() {
        return this.f2233f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f2228a.equals(visibleRegion.f2228a) && this.f2229b.equals(visibleRegion.f2229b) && this.f2230c.equals(visibleRegion.f2230c) && this.f2231d.equals(visibleRegion.f2231d) && this.f2232e.equals(visibleRegion.f2232e);
    }

    public int hashCode() {
        return C0585dl.m2700a(this.f2228a, this.f2229b, this.f2230c, this.f2231d, this.f2232e);
    }

    public String toString() {
        return C0585dl.m2701a(this).m2703a("nearLeft", this.f2228a).m2703a("nearRight", this.f2229b).m2703a("farLeft", this.f2230c).m2703a("farRight", this.f2231d).m2703a("latLngBounds", this.f2232e).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (C0657bk.m2880a()) {
            C0711aa.m3161a(this, parcel, i);
        } else {
            C0726p.m3197a(this, parcel, i);
        }
    }
}
