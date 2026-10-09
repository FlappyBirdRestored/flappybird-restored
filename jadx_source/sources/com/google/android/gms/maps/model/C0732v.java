package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.v */
/* JADX INFO: loaded from: classes.dex */
public class C0732v {
    /* JADX INFO: renamed from: a */
    static void m3205a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, markerOptions.m3001a());
        C0465c.m1951a(parcel, 2, (Parcelable) markerOptions.m3003c(), i, false);
        C0465c.m1952a(parcel, 3, markerOptions.m3004d(), false);
        C0465c.m1952a(parcel, 4, markerOptions.m3005e(), false);
        C0465c.m1949a(parcel, 5, markerOptions.m3002b(), false);
        C0465c.m1945a(parcel, 6, markerOptions.m3006f());
        C0465c.m1945a(parcel, 7, markerOptions.m3007g());
        C0465c.m1955a(parcel, 8, markerOptions.m3008h());
        C0465c.m1955a(parcel, 9, markerOptions.m3009i());
        C0465c.m1942a(parcel, iM1941a);
    }
}
