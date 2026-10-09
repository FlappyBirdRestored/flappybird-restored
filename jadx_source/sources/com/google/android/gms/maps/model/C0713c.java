package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.c */
/* JADX INFO: loaded from: classes.dex */
public class C0713c implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m3167a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, cameraPosition.m2978a());
        C0465c.m1951a(parcel, 2, (Parcelable) cameraPosition.f2159a, i, false);
        C0465c.m1945a(parcel, 3, cameraPosition.f2160b);
        C0465c.m1945a(parcel, 4, cameraPosition.f2161c);
        C0465c.m1945a(parcel, 5, cameraPosition.f2162d);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CameraPosition createFromParcel(Parcel parcel) {
        float fM1923i = 0.0f;
        int iM1913b = C0463a.m1913b(parcel);
        int iM1920f = 0;
        LatLng latLng = null;
        float fM1923i2 = 0.0f;
        float fM1923i3 = 0.0f;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    latLng = (LatLng) C0463a.m1910a(parcel, iM1908a, LatLng.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    fM1923i3 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    fM1923i2 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    fM1923i = C0463a.m1923i(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new CameraPosition(iM1920f, latLng, fM1923i3, fM1923i2, fM1923i);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }
}
