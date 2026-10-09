package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: renamed from: com.google.android.gms.maps.b */
/* JADX INFO: loaded from: classes.dex */
public class C0682b implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2970a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, googleMapOptions.m2807a());
        C0465c.m1943a(parcel, 2, googleMapOptions.m2811b());
        C0465c.m1943a(parcel, 3, googleMapOptions.m2813c());
        C0465c.m1946a(parcel, 4, googleMapOptions.m2826j());
        C0465c.m1951a(parcel, 5, (Parcelable) googleMapOptions.m2827k(), i, false);
        C0465c.m1943a(parcel, 6, googleMapOptions.m2815d());
        C0465c.m1943a(parcel, 7, googleMapOptions.m2817e());
        C0465c.m1943a(parcel, 8, googleMapOptions.m2819f());
        C0465c.m1943a(parcel, 9, googleMapOptions.m2821g());
        C0465c.m1943a(parcel, 10, googleMapOptions.m2823h());
        C0465c.m1943a(parcel, 11, googleMapOptions.m2825i());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GoogleMapOptions createFromParcel(Parcel parcel) {
        byte bM1918d = 0;
        int iM1913b = C0463a.m1913b(parcel);
        CameraPosition cameraPosition = null;
        byte bM1918d2 = 0;
        byte bM1918d3 = 0;
        byte bM1918d4 = 0;
        byte bM1918d5 = 0;
        byte bM1918d6 = 0;
        int iM1920f = 0;
        byte bM1918d7 = 0;
        byte bM1918d8 = 0;
        int iM1920f2 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    bM1918d8 = C0463a.m1918d(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    bM1918d7 = C0463a.m1918d(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    cameraPosition = (CameraPosition) C0463a.m1910a(parcel, iM1908a, CameraPosition.CREATOR);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    bM1918d6 = C0463a.m1918d(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    bM1918d5 = C0463a.m1918d(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    bM1918d4 = C0463a.m1918d(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    bM1918d3 = C0463a.m1918d(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiZoomControls /* 10 */:
                    bM1918d2 = C0463a.m1918d(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                    bM1918d = C0463a.m1918d(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new GoogleMapOptions(iM1920f2, bM1918d8, bM1918d7, iM1920f, cameraPosition, bM1918d6, bM1918d5, bM1918d4, bM1918d3, bM1918d2, bM1918d);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
