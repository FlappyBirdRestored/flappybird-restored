package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.bs */
/* JADX INFO: loaded from: classes.dex */
public class C0538bs implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2408a(C0549cc.f fVar, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        Set setM2565e = fVar.m2565e();
        if (setM2565e.contains(1)) {
            C0465c.m1946a(parcel, 1, fVar.m2566f());
        }
        if (setM2565e.contains(2)) {
            C0465c.m1952a(parcel, 2, fVar.m2567g(), true);
        }
        if (setM2565e.contains(3)) {
            C0465c.m1952a(parcel, 3, fVar.m2568h(), true);
        }
        if (setM2565e.contains(4)) {
            C0465c.m1952a(parcel, 4, fVar.m2569i(), true);
        }
        if (setM2565e.contains(5)) {
            C0465c.m1952a(parcel, 5, fVar.m2570j(), true);
        }
        if (setM2565e.contains(6)) {
            C0465c.m1952a(parcel, 6, fVar.m2571k(), true);
        }
        if (setM2565e.contains(7)) {
            C0465c.m1955a(parcel, 7, fVar.m2572l());
        }
        if (setM2565e.contains(8)) {
            C0465c.m1952a(parcel, 8, fVar.m2573m(), true);
        }
        if (setM2565e.contains(9)) {
            C0465c.m1952a(parcel, 9, fVar.m2574n(), true);
        }
        if (setM2565e.contains(10)) {
            C0465c.m1946a(parcel, 10, fVar.m2575o());
        }
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0549cc.f createFromParcel(Parcel parcel) {
        int iM1920f = 0;
        String strM1926l = null;
        int iM1913b = C0463a.m1913b(parcel);
        HashSet hashSet = new HashSet();
        String strM1926l2 = null;
        boolean zM1917c = false;
        String strM1926l3 = null;
        String strM1926l4 = null;
        String strM1926l5 = null;
        String strM1926l6 = null;
        String strM1926l7 = null;
        int iM1920f2 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(1);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    strM1926l7 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(2);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    strM1926l6 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(3);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    strM1926l5 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(4);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    strM1926l4 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(5);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    strM1926l3 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(6);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    hashSet.add(7);
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    strM1926l2 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(8);
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(9);
                    break;
                case C0467e.MapAttrs_uiZoomControls /* 10 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(10);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new C0549cc.f(hashSet, iM1920f2, strM1926l7, strM1926l6, strM1926l5, strM1926l4, strM1926l3, zM1917c, strM1926l2, strM1926l, iM1920f);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0549cc.f[] newArray(int i) {
        return new C0549cc.f[i];
    }
}
