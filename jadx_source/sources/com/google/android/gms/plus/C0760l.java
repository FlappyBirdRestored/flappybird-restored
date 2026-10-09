package com.google.android.gms.plus;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.plus.l */
/* JADX INFO: loaded from: classes.dex */
public class C0760l implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m3236a(C0737a c0737a, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1952a(parcel, 1, c0737a.m3219b(), false);
        C0465c.m1946a(parcel, 1000, c0737a.m3218a());
        C0465c.m1958a(parcel, 2, c0737a.m3220c(), false);
        C0465c.m1958a(parcel, 3, c0737a.m3221d(), false);
        C0465c.m1958a(parcel, 4, c0737a.m3222e(), false);
        C0465c.m1952a(parcel, 5, c0737a.m3223f(), false);
        C0465c.m1952a(parcel, 6, c0737a.m3224g(), false);
        C0465c.m1952a(parcel, 7, c0737a.m3225h(), false);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0737a createFromParcel(Parcel parcel) {
        String strM1926l = null;
        int iM1913b = C0463a.m1913b(parcel);
        int iM1920f = 0;
        String strM1926l2 = null;
        String strM1926l3 = null;
        String[] strArrM1937w = null;
        String[] strArrM1937w2 = null;
        String[] strArrM1937w3 = null;
        String strM1926l4 = null;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    strM1926l4 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    strArrM1937w3 = C0463a.m1937w(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    strArrM1937w2 = C0463a.m1937w(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    strArrM1937w = C0463a.m1937w(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    strM1926l3 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    strM1926l2 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                case 1000:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new C0737a(iM1920f, strM1926l4, strArrM1937w3, strArrM1937w2, strArrM1937w, strM1926l3, strM1926l2, strM1926l);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0737a[] newArray(int i) {
        return new C0737a[i];
    }
}
