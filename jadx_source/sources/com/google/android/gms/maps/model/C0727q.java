package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.q */
/* JADX INFO: loaded from: classes.dex */
public class C0727q {
    /* JADX INFO: renamed from: a */
    static void m3200a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, cameraPosition.m2978a());
        C0465c.m1951a(parcel, 2, (Parcelable) cameraPosition.f2159a, i, false);
        C0465c.m1945a(parcel, 3, cameraPosition.f2160b);
        C0465c.m1945a(parcel, 4, cameraPosition.f2161c);
        C0465c.m1945a(parcel, 5, cameraPosition.f2162d);
        C0465c.m1942a(parcel, iM1941a);
    }
}
