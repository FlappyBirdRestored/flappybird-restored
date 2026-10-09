package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.j */
/* JADX INFO: loaded from: classes.dex */
public class C0720j implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m3188a(PolylineOptions polylineOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, polylineOptions.m3023a());
        C0465c.m1962b(parcel, 2, polylineOptions.m3024b(), false);
        C0465c.m1945a(parcel, 3, polylineOptions.m3025c());
        C0465c.m1946a(parcel, 4, polylineOptions.m3026d());
        C0465c.m1945a(parcel, 5, polylineOptions.m3027e());
        C0465c.m1955a(parcel, 6, polylineOptions.m3028f());
        C0465c.m1955a(parcel, 7, polylineOptions.m3029g());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PolylineOptions createFromParcel(Parcel parcel) {
        float fM1923i = 0.0f;
        boolean zM1917c = false;
        int iM1913b = C0463a.m1913b(parcel);
        ArrayList arrayListM1916c = null;
        boolean zM1917c2 = false;
        int iM1920f = 0;
        float fM1923i2 = 0.0f;
        int iM1920f2 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    arrayListM1916c = C0463a.m1916c(parcel, iM1908a, LatLng.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    fM1923i2 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    fM1923i = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    zM1917c2 = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new PolylineOptions(iM1920f2, arrayListM1916c, fM1923i2, iM1920f, fM1923i, zM1917c2, zM1917c);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PolylineOptions[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
