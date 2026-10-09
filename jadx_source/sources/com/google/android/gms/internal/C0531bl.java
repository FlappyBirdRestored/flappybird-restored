package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.bl */
/* JADX INFO: loaded from: classes.dex */
public class C0531bl implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2387a(C0549cc c0549cc, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        Set setM2508e = c0549cc.m2508e();
        if (setM2508e.contains(1)) {
            C0465c.m1946a(parcel, 1, c0549cc.m2509f());
        }
        if (setM2508e.contains(2)) {
            C0465c.m1952a(parcel, 2, c0549cc.m2510g(), true);
        }
        if (setM2508e.contains(3)) {
            C0465c.m1951a(parcel, 3, (Parcelable) c0549cc.m2511h(), i, true);
        }
        if (setM2508e.contains(4)) {
            C0465c.m1952a(parcel, 4, c0549cc.m2512i(), true);
        }
        if (setM2508e.contains(5)) {
            C0465c.m1952a(parcel, 5, c0549cc.m2513j(), true);
        }
        if (setM2508e.contains(6)) {
            C0465c.m1946a(parcel, 6, c0549cc.m2514k());
        }
        if (setM2508e.contains(7)) {
            C0465c.m1951a(parcel, 7, (Parcelable) c0549cc.m2515l(), i, true);
        }
        if (setM2508e.contains(8)) {
            C0465c.m1952a(parcel, 8, c0549cc.m2516m(), true);
        }
        if (setM2508e.contains(9)) {
            C0465c.m1952a(parcel, 9, c0549cc.m2517n(), true);
        }
        if (setM2508e.contains(12)) {
            C0465c.m1946a(parcel, 12, c0549cc.m2518o());
        }
        if (setM2508e.contains(14)) {
            C0465c.m1952a(parcel, 14, c0549cc.m2519p(), true);
        }
        if (setM2508e.contains(15)) {
            C0465c.m1951a(parcel, 15, (Parcelable) c0549cc.m2520q(), i, true);
        }
        if (setM2508e.contains(16)) {
            C0465c.m1955a(parcel, 16, c0549cc.m2521r());
        }
        if (setM2508e.contains(19)) {
            C0465c.m1951a(parcel, 19, (Parcelable) c0549cc.m2523t(), i, true);
        }
        if (setM2508e.contains(18)) {
            C0465c.m1952a(parcel, 18, c0549cc.m2522s(), true);
        }
        if (setM2508e.contains(21)) {
            C0465c.m1946a(parcel, 21, c0549cc.m2525v());
        }
        if (setM2508e.contains(20)) {
            C0465c.m1952a(parcel, 20, c0549cc.m2524u(), true);
        }
        if (setM2508e.contains(23)) {
            C0465c.m1962b(parcel, 23, c0549cc.m2527x(), true);
        }
        if (setM2508e.contains(22)) {
            C0465c.m1962b(parcel, 22, c0549cc.m2526w(), true);
        }
        if (setM2508e.contains(25)) {
            C0465c.m1946a(parcel, 25, c0549cc.m2529z());
        }
        if (setM2508e.contains(24)) {
            C0465c.m1946a(parcel, 24, c0549cc.m2528y());
        }
        if (setM2508e.contains(27)) {
            C0465c.m1952a(parcel, 27, c0549cc.m2504B(), true);
        }
        if (setM2508e.contains(26)) {
            C0465c.m1952a(parcel, 26, c0549cc.m2503A(), true);
        }
        if (setM2508e.contains(29)) {
            C0465c.m1955a(parcel, 29, c0549cc.m2506D());
        }
        if (setM2508e.contains(28)) {
            C0465c.m1962b(parcel, 28, c0549cc.m2505C(), true);
        }
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0549cc createFromParcel(Parcel parcel) {
        int iM1913b = C0463a.m1913b(parcel);
        HashSet hashSet = new HashSet();
        int iM1920f = 0;
        String strM1926l = null;
        C0549cc.a aVar = null;
        String strM1926l2 = null;
        String strM1926l3 = null;
        int iM1920f2 = 0;
        C0549cc.b bVar = null;
        String strM1926l4 = null;
        String strM1926l5 = null;
        int iM1920f3 = 0;
        String strM1926l6 = null;
        C0549cc.c cVar = null;
        boolean zM1917c = false;
        String strM1926l7 = null;
        C0549cc.d dVar = null;
        String strM1926l8 = null;
        int iM1920f4 = 0;
        ArrayList arrayListM1916c = null;
        ArrayList arrayListM1916c2 = null;
        int iM1920f5 = 0;
        int iM1920f6 = 0;
        String strM1926l9 = null;
        String strM1926l10 = null;
        ArrayList arrayListM1916c3 = null;
        boolean zM1917c2 = false;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(1);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(2);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    C0549cc.a aVar2 = (C0549cc.a) C0463a.m1910a(parcel, iM1908a, C0549cc.a.CREATOR);
                    hashSet.add(3);
                    aVar = aVar2;
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    strM1926l2 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(4);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    strM1926l3 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(5);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(6);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    C0549cc.b bVar2 = (C0549cc.b) C0463a.m1910a(parcel, iM1908a, C0549cc.b.CREATOR);
                    hashSet.add(7);
                    bVar = bVar2;
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    strM1926l4 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(8);
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    strM1926l5 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(9);
                    break;
                case C0467e.MapAttrs_uiZoomControls /* 10 */:
                case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                case 17:
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                    iM1920f3 = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(12);
                    break;
                case 14:
                    strM1926l6 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(14);
                    break;
                case 15:
                    C0549cc.c cVar2 = (C0549cc.c) C0463a.m1910a(parcel, iM1908a, C0549cc.c.CREATOR);
                    hashSet.add(15);
                    cVar = cVar2;
                    break;
                case 16:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    hashSet.add(16);
                    break;
                case 18:
                    strM1926l7 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(18);
                    break;
                case 19:
                    C0549cc.d dVar2 = (C0549cc.d) C0463a.m1910a(parcel, iM1908a, C0549cc.d.CREATOR);
                    hashSet.add(19);
                    dVar = dVar2;
                    break;
                case 20:
                    strM1926l8 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(20);
                    break;
                case 21:
                    iM1920f4 = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(21);
                    break;
                case 22:
                    arrayListM1916c = C0463a.m1916c(parcel, iM1908a, C0549cc.f.CREATOR);
                    hashSet.add(22);
                    break;
                case 23:
                    arrayListM1916c2 = C0463a.m1916c(parcel, iM1908a, C0549cc.g.CREATOR);
                    hashSet.add(23);
                    break;
                case 24:
                    iM1920f5 = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(24);
                    break;
                case 25:
                    iM1920f6 = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(25);
                    break;
                case 26:
                    strM1926l9 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(26);
                    break;
                case 27:
                    strM1926l10 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(27);
                    break;
                case 28:
                    arrayListM1916c3 = C0463a.m1916c(parcel, iM1908a, C0549cc.h.CREATOR);
                    hashSet.add(28);
                    break;
                case 29:
                    zM1917c2 = C0463a.m1917c(parcel, iM1908a);
                    hashSet.add(29);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new C0549cc(hashSet, iM1920f, strM1926l, aVar, strM1926l2, strM1926l3, iM1920f2, bVar, strM1926l4, strM1926l5, iM1920f3, strM1926l6, cVar, zM1917c, strM1926l7, dVar, strM1926l8, iM1920f4, arrayListM1916c, arrayListM1916c2, iM1920f5, iM1920f6, strM1926l9, strM1926l10, arrayListM1916c3, zM1917c2);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0549cc[] newArray(int i) {
        return new C0549cc[i];
    }
}
