package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.w */
/* JADX INFO: loaded from: classes.dex */
public class C0733w {
    /* JADX INFO: renamed from: a */
    static void m3206a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, polygonOptions.m3014a());
        C0465c.m1962b(parcel, 2, polygonOptions.m3016c(), false);
        C0465c.m1964c(parcel, 3, polygonOptions.m3015b(), false);
        C0465c.m1945a(parcel, 4, polygonOptions.m3017d());
        C0465c.m1946a(parcel, 5, polygonOptions.m3018e());
        C0465c.m1946a(parcel, 6, polygonOptions.m3019f());
        C0465c.m1945a(parcel, 7, polygonOptions.m3020g());
        C0465c.m1955a(parcel, 8, polygonOptions.m3021h());
        C0465c.m1955a(parcel, 9, polygonOptions.m3022i());
        C0465c.m1942a(parcel, iM1941a);
    }
}
