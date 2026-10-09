package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.e */
/* JADX INFO: loaded from: classes.dex */
public class C0715e implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m3173a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, groundOverlayOptions.m2988b());
        C0465c.m1949a(parcel, 2, groundOverlayOptions.m2987a(), false);
        C0465c.m1951a(parcel, 3, (Parcelable) groundOverlayOptions.m2989c(), i, false);
        C0465c.m1945a(parcel, 4, groundOverlayOptions.m2990d());
        C0465c.m1945a(parcel, 5, groundOverlayOptions.m2991e());
        C0465c.m1951a(parcel, 6, (Parcelable) groundOverlayOptions.m2992f(), i, false);
        C0465c.m1945a(parcel, 7, groundOverlayOptions.m2993g());
        C0465c.m1945a(parcel, 8, groundOverlayOptions.m2994h());
        C0465c.m1955a(parcel, 9, groundOverlayOptions.m2998l());
        C0465c.m1945a(parcel, 10, groundOverlayOptions.m2995i());
        C0465c.m1945a(parcel, 11, groundOverlayOptions.m2996j());
        C0465c.m1945a(parcel, 12, groundOverlayOptions.m2997k());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GroundOverlayOptions createFromParcel(Parcel parcel) {
        int iM1913b = C0463a.m1913b(parcel);
        int iM1920f = 0;
        IBinder iBinderM1927m = null;
        LatLng latLng = null;
        float fM1923i = 0.0f;
        float fM1923i2 = 0.0f;
        LatLngBounds latLngBounds = null;
        float fM1923i3 = 0.0f;
        float fM1923i4 = 0.0f;
        boolean zM1917c = false;
        float fM1923i5 = 0.0f;
        float fM1923i6 = 0.0f;
        float fM1923i7 = 0.0f;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    iBinderM1927m = C0463a.m1927m(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    latLng = (LatLng) C0463a.m1910a(parcel, iM1908a, LatLng.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    fM1923i = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    fM1923i2 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    latLngBounds = (LatLngBounds) C0463a.m1910a(parcel, iM1908a, LatLngBounds.CREATOR);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    fM1923i3 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    fM1923i4 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiZoomControls /* 10 */:
                    fM1923i5 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                    fM1923i6 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                    fM1923i7 = C0463a.m1923i(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new GroundOverlayOptions(iM1920f, iBinderM1927m, latLng, fM1923i, fM1923i2, latLngBounds, fM1923i3, fM1923i4, zM1917c, fM1923i5, fM1923i6, fM1923i7);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
