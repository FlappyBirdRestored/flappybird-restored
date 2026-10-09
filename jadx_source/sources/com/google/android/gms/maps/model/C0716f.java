package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.f */
/* JADX INFO: loaded from: classes.dex */
public class C0716f implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m3176a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, latLngBounds.m3000a());
        C0465c.m1951a(parcel, 2, (Parcelable) latLngBounds.f2187a, i, false);
        C0465c.m1951a(parcel, 3, (Parcelable) latLngBounds.f2188b, i, false);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LatLngBounds createFromParcel(Parcel parcel) {
        LatLng latLng;
        LatLng latLng2;
        int iM1920f;
        LatLng latLng3 = null;
        int iM1913b = C0463a.m1913b(parcel);
        int i = 0;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    LatLng latLng5 = latLng3;
                    latLng2 = latLng4;
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    latLng = latLng5;
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    LatLng latLng6 = (LatLng) C0463a.m1910a(parcel, iM1908a, LatLng.CREATOR);
                    iM1920f = i;
                    latLng = latLng3;
                    latLng2 = latLng6;
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    latLng = (LatLng) C0463a.m1910a(parcel, iM1908a, LatLng.CREATOR);
                    latLng2 = latLng4;
                    iM1920f = i;
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    latLng = latLng3;
                    latLng2 = latLng4;
                    iM1920f = i;
                    break;
            }
            i = iM1920f;
            latLng4 = latLng2;
            latLng3 = latLng;
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new LatLngBounds(i, latLng4, latLng3);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
