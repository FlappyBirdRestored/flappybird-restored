package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.z */
/* JADX INFO: loaded from: classes.dex */
public class C0736z {
    /* JADX INFO: renamed from: a */
    static void m3209a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, tileOverlayOptions.m3032a());
        C0465c.m1949a(parcel, 2, tileOverlayOptions.m3033b(), false);
        C0465c.m1955a(parcel, 3, tileOverlayOptions.m3035d());
        C0465c.m1945a(parcel, 4, tileOverlayOptions.m3034c());
        C0465c.m1942a(parcel, iM1941a);
    }
}
