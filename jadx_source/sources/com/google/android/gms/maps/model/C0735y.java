package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.y */
/* JADX INFO: loaded from: classes.dex */
public class C0735y {
    /* JADX INFO: renamed from: a */
    static void m3208a(Tile tile, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, tile.m3030a());
        C0465c.m1946a(parcel, 2, tile.f2219a);
        C0465c.m1946a(parcel, 3, tile.f2220b);
        C0465c.m1956a(parcel, 4, tile.f2221c, false);
        C0465c.m1942a(parcel, iM1941a);
    }
}
