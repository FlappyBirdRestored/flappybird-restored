package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.e */
/* JADX INFO: loaded from: classes.dex */
public class C0685e {
    /* JADX INFO: renamed from: a */
    static void m2975a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, googleMapOptions.m2807a());
        C0465c.m1943a(parcel, 2, googleMapOptions.m2811b());
        C0465c.m1943a(parcel, 3, googleMapOptions.m2813c());
        C0465c.m1946a(parcel, 4, googleMapOptions.m2826j());
        C0465c.m1951a(parcel, 5, (Parcelable) googleMapOptions.m2827k(), i, false);
        C0465c.m1943a(parcel, 6, googleMapOptions.m2815d());
        C0465c.m1943a(parcel, 7, googleMapOptions.m2817e());
        C0465c.m1943a(parcel, 8, googleMapOptions.m2819f());
        C0465c.m1943a(parcel, 9, googleMapOptions.m2821g());
        C0465c.m1943a(parcel, 10, googleMapOptions.m2823h());
        C0465c.m1943a(parcel, 11, googleMapOptions.m2825i());
        C0465c.m1942a(parcel, iM1941a);
    }
}
