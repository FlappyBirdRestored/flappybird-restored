package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.d */
/* JADX INFO: loaded from: classes.dex */
public class C0714d implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m3170a(CircleOptions circleOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, circleOptions.m2979a());
        C0465c.m1951a(parcel, 2, (Parcelable) circleOptions.m2980b(), i, false);
        C0465c.m1944a(parcel, 3, circleOptions.m2981c());
        C0465c.m1945a(parcel, 4, circleOptions.m2982d());
        C0465c.m1946a(parcel, 5, circleOptions.m2983e());
        C0465c.m1946a(parcel, 6, circleOptions.m2984f());
        C0465c.m1945a(parcel, 7, circleOptions.m2985g());
        C0465c.m1955a(parcel, 8, circleOptions.m2986h());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CircleOptions createFromParcel(Parcel parcel) {
        float fM1923i = 0.0f;
        boolean zM1917c = false;
        int iM1913b = C0463a.m1913b(parcel);
        LatLng latLng = null;
        double dM1924j = 0.0d;
        int iM1920f = 0;
        int iM1920f2 = 0;
        float fM1923i2 = 0.0f;
        int iM1920f3 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f3 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    latLng = (LatLng) C0463a.m1910a(parcel, iM1908a, LatLng.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    dM1924j = C0463a.m1924j(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    fM1923i2 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    fM1923i = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
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
        return new CircleOptions(iM1920f3, latLng, dM1924j, fM1923i2, iM1920f2, iM1920f, fM1923i, zM1917c);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }
}
