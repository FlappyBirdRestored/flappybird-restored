package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.p */
/* JADX INFO: loaded from: classes.dex */
public class C0726p implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m3197a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, visibleRegion.m3036a());
        C0465c.m1951a(parcel, 2, (Parcelable) visibleRegion.f2228a, i, false);
        C0465c.m1951a(parcel, 3, (Parcelable) visibleRegion.f2229b, i, false);
        C0465c.m1951a(parcel, 4, (Parcelable) visibleRegion.f2230c, i, false);
        C0465c.m1951a(parcel, 5, (Parcelable) visibleRegion.f2231d, i, false);
        C0465c.m1951a(parcel, 6, (Parcelable) visibleRegion.f2232e, i, false);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public VisibleRegion createFromParcel(Parcel parcel) {
        LatLngBounds latLngBounds = null;
        int iM1913b = C0463a.m1913b(parcel);
        int iM1920f = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    latLng4 = (LatLng) C0463a.m1910a(parcel, iM1908a, LatLng.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    latLng3 = (LatLng) C0463a.m1910a(parcel, iM1908a, LatLng.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    latLng2 = (LatLng) C0463a.m1910a(parcel, iM1908a, LatLng.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    latLng = (LatLng) C0463a.m1910a(parcel, iM1908a, LatLng.CREATOR);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    latLngBounds = (LatLngBounds) C0463a.m1910a(parcel, iM1908a, LatLngBounds.CREATOR);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new VisibleRegion(iM1920f, latLng4, latLng3, latLng2, latLng, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
