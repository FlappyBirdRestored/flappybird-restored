package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.u */
/* JADX INFO: loaded from: classes.dex */
public class C0731u {
    /* JADX INFO: renamed from: a */
    static void m3204a(LatLng latLng, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, latLng.m2999a());
        C0465c.m1944a(parcel, 2, latLng.f2184a);
        C0465c.m1944a(parcel, 3, latLng.f2185b);
        C0465c.m1942a(parcel, iM1941a);
    }
}
