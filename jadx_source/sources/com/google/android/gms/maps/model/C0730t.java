package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.t */
/* JADX INFO: loaded from: classes.dex */
public class C0730t {
    /* JADX INFO: renamed from: a */
    static void m3203a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, latLngBounds.m3000a());
        C0465c.m1951a(parcel, 2, (Parcelable) latLngBounds.f2187a, i, false);
        C0465c.m1951a(parcel, 3, (Parcelable) latLngBounds.f2188b, i, false);
        C0465c.m1942a(parcel, iM1941a);
    }
}
