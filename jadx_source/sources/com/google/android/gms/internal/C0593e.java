package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.internal.e */
/* JADX INFO: loaded from: classes.dex */
public class C0593e implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2722a(AbstractC0497ae.a aVar, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, aVar.m2239a());
        C0465c.m1946a(parcel, 2, aVar.m2242b());
        C0465c.m1955a(parcel, 3, aVar.m2243c());
        C0465c.m1946a(parcel, 4, aVar.m2244d());
        C0465c.m1955a(parcel, 5, aVar.m2245e());
        C0465c.m1952a(parcel, 6, aVar.m2246f(), false);
        C0465c.m1946a(parcel, 7, aVar.m2247g());
        C0465c.m1952a(parcel, 8, aVar.m2249i(), false);
        C0465c.m1951a(parcel, 9, (Parcelable) aVar.m2251k(), i, false);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0497ae.a createFromParcel(Parcel parcel) {
        C0614z c0614z = null;
        int iM1920f = 0;
        int iM1913b = C0463a.m1913b(parcel);
        String strM1926l = null;
        String strM1926l2 = null;
        boolean zM1917c = false;
        int iM1920f2 = 0;
        boolean zM1917c2 = false;
        int iM1920f3 = 0;
        int iM1920f4 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f4 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    iM1920f3 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    zM1917c2 = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    strM1926l2 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    c0614z = (C0614z) C0463a.m1910a(parcel, iM1908a, C0614z.CREATOR);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new AbstractC0497ae.a(iM1920f4, iM1920f3, zM1917c2, iM1920f2, zM1917c, strM1926l2, iM1920f, strM1926l, c0614z);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0497ae.a[] newArray(int i) {
        return new AbstractC0497ae.a[i];
    }
}
