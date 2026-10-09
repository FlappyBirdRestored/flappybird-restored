package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.x */
/* JADX INFO: loaded from: classes.dex */
public class C0734x {
    /* JADX INFO: renamed from: a */
    static void m3207a(PolylineOptions polylineOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, polylineOptions.m3023a());
        C0465c.m1962b(parcel, 2, polylineOptions.m3024b(), false);
        C0465c.m1945a(parcel, 3, polylineOptions.m3025c());
        C0465c.m1946a(parcel, 4, polylineOptions.m3026d());
        C0465c.m1945a(parcel, 5, polylineOptions.m3027e());
        C0465c.m1955a(parcel, 6, polylineOptions.m3028f());
        C0465c.m1955a(parcel, 7, polylineOptions.m3029g());
        C0465c.m1942a(parcel, iM1941a);
    }
}
