package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.internal.ap */
/* JADX INFO: loaded from: classes.dex */
public class C0508ap implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2283a(C0528bi c0528bi, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1952a(parcel, 1, c0528bi.m2379f(), false);
        C0465c.m1946a(parcel, 1000, c0528bi.m2374a());
        C0465c.m1947a(parcel, 2, c0528bi.m2380g());
        C0465c.m1954a(parcel, 3, c0528bi.m2375b());
        C0465c.m1944a(parcel, 4, c0528bi.m2376c());
        C0465c.m1944a(parcel, 5, c0528bi.m2377d());
        C0465c.m1945a(parcel, 6, c0528bi.m2378e());
        C0465c.m1946a(parcel, 7, c0528bi.m2381h());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0528bi createFromParcel(Parcel parcel) {
        double dM1924j = 0.0d;
        short sM1919e = 0;
        int iM1913b = C0463a.m1913b(parcel);
        String strM1926l = null;
        float fM1923i = 0.0f;
        long jM1921g = 0;
        double dM1924j2 = 0.0d;
        int iM1920f = 0;
        int iM1920f2 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    jM1921g = C0463a.m1921g(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    sM1919e = C0463a.m1919e(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    dM1924j2 = C0463a.m1924j(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    dM1924j = C0463a.m1924j(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    fM1923i = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case 1000:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new C0528bi(iM1920f2, strM1926l, iM1920f, sM1919e, dM1924j2, dM1924j, fM1923i, jM1921g);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0528bi[] newArray(int i) {
        return new C0528bi[i];
    }
}
