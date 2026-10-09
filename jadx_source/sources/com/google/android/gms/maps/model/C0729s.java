package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.s */
/* JADX INFO: loaded from: classes.dex */
public class C0729s {
    /* JADX INFO: renamed from: a */
    static void m3202a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, groundOverlayOptions.m2988b());
        C0465c.m1949a(parcel, 2, groundOverlayOptions.m2987a(), false);
        C0465c.m1951a(parcel, 3, (Parcelable) groundOverlayOptions.m2989c(), i, false);
        C0465c.m1945a(parcel, 4, groundOverlayOptions.m2990d());
        C0465c.m1945a(parcel, 5, groundOverlayOptions.m2991e());
        C0465c.m1951a(parcel, 6, (Parcelable) groundOverlayOptions.m2992f(), i, false);
        C0465c.m1945a(parcel, 7, groundOverlayOptions.m2993g());
        C0465c.m1945a(parcel, 8, groundOverlayOptions.m2994h());
        C0465c.m1955a(parcel, 9, groundOverlayOptions.m2998l());
        C0465c.m1945a(parcel, 10, groundOverlayOptions.m2995i());
        C0465c.m1945a(parcel, 11, groundOverlayOptions.m2996j());
        C0465c.m1945a(parcel, 12, groundOverlayOptions.m2997k());
        C0465c.m1942a(parcel, iM1941a);
    }
}
