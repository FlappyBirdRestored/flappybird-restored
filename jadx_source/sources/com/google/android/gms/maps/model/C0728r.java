package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.r */
/* JADX INFO: loaded from: classes.dex */
public class C0728r {
    /* JADX INFO: renamed from: a */
    static void m3201a(CircleOptions circleOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, circleOptions.m2979a());
        C0465c.m1951a(parcel, 2, (Parcelable) circleOptions.m2980b(), i, false);
        C0465c.m1944a(parcel, 3, circleOptions.m2981c());
        C0465c.m1945a(parcel, 4, circleOptions.m2982d());
        C0465c.m1946a(parcel, 5, circleOptions.m2983e());
        C0465c.m1946a(parcel, 6, circleOptions.m2984f());
        C0465c.m1945a(parcel, 7, circleOptions.m2985g());
        C0465c.m1955a(parcel, 8, circleOptions.m2986h());
        C0465c.m1942a(parcel, iM1941a);
    }
}
