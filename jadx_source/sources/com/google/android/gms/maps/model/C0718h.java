package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.h */
/* JADX INFO: loaded from: classes.dex */
public class C0718h implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m3182a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, markerOptions.m3001a());
        C0465c.m1951a(parcel, 2, (Parcelable) markerOptions.m3003c(), i, false);
        C0465c.m1952a(parcel, 3, markerOptions.m3004d(), false);
        C0465c.m1952a(parcel, 4, markerOptions.m3005e(), false);
        C0465c.m1949a(parcel, 5, markerOptions.m3002b(), false);
        C0465c.m1945a(parcel, 6, markerOptions.m3006f());
        C0465c.m1945a(parcel, 7, markerOptions.m3007g());
        C0465c.m1955a(parcel, 8, markerOptions.m3008h());
        C0465c.m1955a(parcel, 9, markerOptions.m3009i());
        C0465c.m1955a(parcel, 10, markerOptions.m3010j());
        C0465c.m1945a(parcel, 11, markerOptions.m3011k());
        C0465c.m1945a(parcel, 12, markerOptions.m3012l());
        C0465c.m1945a(parcel, 13, markerOptions.m3013m());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MarkerOptions createFromParcel(Parcel parcel) {
        int iM1913b = C0463a.m1913b(parcel);
        int iM1920f = 0;
        LatLng latLng = null;
        String strM1926l = null;
        String strM1926l2 = null;
        IBinder iBinderM1927m = null;
        float fM1923i = 0.0f;
        float fM1923i2 = 0.0f;
        boolean zM1917c = false;
        boolean zM1917c2 = false;
        boolean zM1917c3 = false;
        float fM1923i3 = 0.0f;
        float fM1923i4 = 0.5f;
        float fM1923i5 = 0.0f;
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
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    strM1926l2 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    iBinderM1927m = C0463a.m1927m(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    fM1923i = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    fM1923i2 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    zM1917c2 = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiZoomControls /* 10 */:
                    zM1917c3 = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                    fM1923i3 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                    fM1923i4 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                    fM1923i5 = C0463a.m1923i(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new MarkerOptions(iM1920f, latLng, strM1926l, strM1926l2, iBinderM1927m, fM1923i, fM1923i2, zM1917c, zM1917c2, zM1917c3, fM1923i3, fM1923i4, fM1923i5);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
