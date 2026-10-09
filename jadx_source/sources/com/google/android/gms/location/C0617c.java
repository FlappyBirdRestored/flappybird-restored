package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.location.c */
/* JADX INFO: loaded from: classes.dex */
public class C0617c implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2803a(LocationRequest locationRequest, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, locationRequest.f2108a);
        C0465c.m1946a(parcel, 1000, locationRequest.m2796a());
        C0465c.m1947a(parcel, 2, locationRequest.f2109b);
        C0465c.m1947a(parcel, 3, locationRequest.f2110c);
        C0465c.m1955a(parcel, 4, locationRequest.f2111d);
        C0465c.m1947a(parcel, 5, locationRequest.f2112e);
        C0465c.m1946a(parcel, 6, locationRequest.f2113f);
        C0465c.m1945a(parcel, 7, locationRequest.f2114g);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LocationRequest createFromParcel(Parcel parcel) {
        boolean zM1917c = false;
        int iM1913b = C0463a.m1913b(parcel);
        int iM1920f = 102;
        long jM1921g = 3600000;
        long jM1921g2 = 600000;
        long jM1921g3 = Long.MAX_VALUE;
        int iM1920f2 = Integer.MAX_VALUE;
        float fM1923i = 0.0f;
        int iM1920f3 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    jM1921g = C0463a.m1921g(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    jM1921g2 = C0463a.m1921g(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    jM1921g3 = C0463a.m1921g(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    fM1923i = C0463a.m1923i(parcel, iM1908a);
                    break;
                case 1000:
                    iM1920f3 = C0463a.m1920f(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new LocationRequest(iM1920f3, iM1920f, jM1921g, jM1921g2, zM1917c, jM1921g3, iM1920f2, fM1923i);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
