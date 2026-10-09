package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.aa */
/* JADX INFO: loaded from: classes.dex */
public class C0711aa {
    /* JADX INFO: renamed from: a */
    static void m3161a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, visibleRegion.m3036a());
        C0465c.m1951a(parcel, 2, (Parcelable) visibleRegion.f2228a, i, false);
        C0465c.m1951a(parcel, 3, (Parcelable) visibleRegion.f2229b, i, false);
        C0465c.m1951a(parcel, 4, (Parcelable) visibleRegion.f2230c, i, false);
        C0465c.m1951a(parcel, 5, (Parcelable) visibleRegion.f2231d, i, false);
        C0465c.m1951a(parcel, 6, (Parcelable) visibleRegion.f2232e, i, false);
        C0465c.m1942a(parcel, iM1941a);
    }
}
