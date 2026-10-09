package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.bw */
/* JADX INFO: loaded from: classes.dex */
public class C0542bw implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2422a(C0561co c0561co, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1952a(parcel, 1, c0561co.m2616g(), false);
        C0465c.m1946a(parcel, 1000, c0561co.m2620k());
        C0465c.m1962b(parcel, 2, c0561co.m2610a(), false);
        C0465c.m1962b(parcel, 3, c0561co.m2611b(), false);
        C0465c.m1951a(parcel, 4, (Parcelable) c0561co.m2612c(), i, false);
        C0465c.m1952a(parcel, 5, c0561co.m2613d(), false);
        C0465c.m1952a(parcel, 6, c0561co.m2614e(), false);
        C0465c.m1952a(parcel, 7, c0561co.m2615f(), false);
        C0465c.m1948a(parcel, 8, c0561co.m2617h(), false);
        C0465c.m1948a(parcel, 9, c0561co.m2618i(), false);
        C0465c.m1946a(parcel, 10, c0561co.m2619j());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0561co createFromParcel(Parcel parcel) {
        int iM1920f = 0;
        Bundle bundleM1928n = null;
        int iM1913b = C0463a.m1913b(parcel);
        Bundle bundleM1928n2 = null;
        String strM1926l = null;
        String strM1926l2 = null;
        String strM1926l3 = null;
        Uri uri = null;
        ArrayList arrayListM1916c = null;
        ArrayList arrayListM1916c2 = null;
        String strM1926l4 = null;
        int iM1920f2 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    strM1926l4 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    arrayListM1916c2 = C0463a.m1916c(parcel, iM1908a, C0612x.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    arrayListM1916c = C0463a.m1916c(parcel, iM1908a, Uri.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    uri = (Uri) C0463a.m1910a(parcel, iM1908a, Uri.CREATOR);
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
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    bundleM1928n2 = C0463a.m1928n(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    bundleM1928n = C0463a.m1928n(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiZoomControls /* 10 */:
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
        return new C0561co(iM1920f2, strM1926l4, arrayListM1916c2, arrayListM1916c, uri, strM1926l3, strM1926l2, strM1926l, bundleM1928n2, bundleM1928n, iM1920f);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0561co[] newArray(int i) {
        return new C0561co[i];
    }
}
