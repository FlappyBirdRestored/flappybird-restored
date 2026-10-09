package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.by */
/* JADX INFO: loaded from: classes.dex */
public class C0544by implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2482a(C0563cq c0563cq, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1000, c0563cq.m2626f());
        C0465c.m1962b(parcel, 2, c0563cq.m2621a(), false);
        C0465c.m1962b(parcel, 3, c0563cq.m2622b(), false);
        C0465c.m1948a(parcel, 4, c0563cq.m2623c(), false);
        C0465c.m1955a(parcel, 5, c0563cq.m2624d());
        C0465c.m1946a(parcel, 6, c0563cq.m2625e());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0563cq createFromParcel(Parcel parcel) {
        Bundle bundleM1928n = null;
        int iM1920f = 0;
        int iM1913b = C0463a.m1913b(parcel);
        boolean zM1917c = false;
        ArrayList arrayListM1916c = null;
        ArrayList arrayListM1916c2 = null;
        int iM1920f2 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    arrayListM1916c2 = C0463a.m1916c(parcel, iM1908a, C0612x.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    arrayListM1916c = C0463a.m1916c(parcel, iM1908a, C0612x.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    bundleM1928n = C0463a.m1928n(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
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
        return new C0563cq(iM1920f2, arrayListM1916c2, arrayListM1916c, bundleM1928n, zM1917c, iM1920f);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0563cq[] newArray(int i) {
        return new C0563cq[i];
    }
}
