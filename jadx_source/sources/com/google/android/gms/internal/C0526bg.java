package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.bg */
/* JADX INFO: loaded from: classes.dex */
public class C0526bg implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2363a(C0541bv c0541bv, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1952a(parcel, 1, c0541bv.m2418b(), false);
        C0465c.m1946a(parcel, 1000, c0541bv.m2417a());
        C0465c.m1962b(parcel, 2, c0541bv.m2419c(), false);
        C0465c.m1962b(parcel, 3, c0541bv.m2420d(), false);
        C0465c.m1955a(parcel, 4, c0541bv.m2421e());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0541bv createFromParcel(Parcel parcel) {
        boolean zM1917c = false;
        ArrayList arrayListM1916c = null;
        int iM1913b = C0463a.m1913b(parcel);
        ArrayList arrayListM1916c2 = null;
        String strM1926l = null;
        int iM1920f = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    arrayListM1916c2 = C0463a.m1916c(parcel, iM1908a, C0612x.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    arrayListM1916c = C0463a.m1916c(parcel, iM1908a, C0612x.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
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
        return new C0541bv(iM1920f, strM1926l, arrayListM1916c2, arrayListM1916c, zM1917c);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0541bv[] newArray(int i) {
        return new C0541bv[i];
    }
}
