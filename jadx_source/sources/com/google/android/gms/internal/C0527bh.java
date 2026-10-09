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

/* JADX INFO: renamed from: com.google.android.gms.internal.bh */
/* JADX INFO: loaded from: classes.dex */
public class C0527bh implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2366a(C0543bx c0543bx, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        Set setM2460e = c0543bx.m2460e();
        if (setM2460e.contains(1)) {
            C0465c.m1946a(parcel, 1, c0543bx.m2461f());
        }
        if (setM2460e.contains(2)) {
            C0465c.m1951a(parcel, 2, (Parcelable) c0543bx.m2462g(), i, true);
        }
        if (setM2460e.contains(3)) {
            C0465c.m1953a(parcel, 3, c0543bx.m2463h(), true);
        }
        if (setM2460e.contains(4)) {
            C0465c.m1951a(parcel, 4, (Parcelable) c0543bx.m2464i(), i, true);
        }
        if (setM2460e.contains(5)) {
            C0465c.m1952a(parcel, 5, c0543bx.m2465j(), true);
        }
        if (setM2460e.contains(6)) {
            C0465c.m1952a(parcel, 6, c0543bx.m2466k(), true);
        }
        if (setM2460e.contains(7)) {
            C0465c.m1952a(parcel, 7, c0543bx.m2467l(), true);
        }
        if (setM2460e.contains(8)) {
            C0465c.m1962b(parcel, 8, c0543bx.m2468m(), true);
        }
        if (setM2460e.contains(9)) {
            C0465c.m1946a(parcel, 9, c0543bx.m2469n());
        }
        if (setM2460e.contains(10)) {
            C0465c.m1962b(parcel, 10, c0543bx.m2470o(), true);
        }
        if (setM2460e.contains(11)) {
            C0465c.m1951a(parcel, 11, (Parcelable) c0543bx.m2471p(), i, true);
        }
        if (setM2460e.contains(12)) {
            C0465c.m1962b(parcel, 12, c0543bx.m2472q(), true);
        }
        if (setM2460e.contains(13)) {
            C0465c.m1952a(parcel, 13, c0543bx.m2473r(), true);
        }
        if (setM2460e.contains(14)) {
            C0465c.m1952a(parcel, 14, c0543bx.m2474s(), true);
        }
        if (setM2460e.contains(15)) {
            C0465c.m1951a(parcel, 15, (Parcelable) c0543bx.m2475t(), i, true);
        }
        if (setM2460e.contains(17)) {
            C0465c.m1952a(parcel, 17, c0543bx.m2477v(), true);
        }
        if (setM2460e.contains(16)) {
            C0465c.m1952a(parcel, 16, c0543bx.m2476u(), true);
        }
        if (setM2460e.contains(19)) {
            C0465c.m1962b(parcel, 19, c0543bx.m2479x(), true);
        }
        if (setM2460e.contains(18)) {
            C0465c.m1952a(parcel, 18, c0543bx.m2478w(), true);
        }
        if (setM2460e.contains(21)) {
            C0465c.m1952a(parcel, 21, c0543bx.m2481z(), true);
        }
        if (setM2460e.contains(20)) {
            C0465c.m1952a(parcel, 20, c0543bx.m2480y(), true);
        }
        if (setM2460e.contains(23)) {
            C0465c.m1952a(parcel, 23, c0543bx.m2426B(), true);
        }
        if (setM2460e.contains(22)) {
            C0465c.m1952a(parcel, 22, c0543bx.m2425A(), true);
        }
        if (setM2460e.contains(25)) {
            C0465c.m1952a(parcel, 25, c0543bx.m2428D(), true);
        }
        if (setM2460e.contains(24)) {
            C0465c.m1952a(parcel, 24, c0543bx.m2427C(), true);
        }
        if (setM2460e.contains(27)) {
            C0465c.m1952a(parcel, 27, c0543bx.m2430F(), true);
        }
        if (setM2460e.contains(26)) {
            C0465c.m1952a(parcel, 26, c0543bx.m2429E(), true);
        }
        if (setM2460e.contains(29)) {
            C0465c.m1951a(parcel, 29, (Parcelable) c0543bx.m2432H(), i, true);
        }
        if (setM2460e.contains(28)) {
            C0465c.m1952a(parcel, 28, c0543bx.m2431G(), true);
        }
        if (setM2460e.contains(31)) {
            C0465c.m1952a(parcel, 31, c0543bx.m2434J(), true);
        }
        if (setM2460e.contains(30)) {
            C0465c.m1952a(parcel, 30, c0543bx.m2433I(), true);
        }
        if (setM2460e.contains(34)) {
            C0465c.m1951a(parcel, 34, (Parcelable) c0543bx.m2437M(), i, true);
        }
        if (setM2460e.contains(32)) {
            C0465c.m1952a(parcel, 32, c0543bx.m2435K(), true);
        }
        if (setM2460e.contains(33)) {
            C0465c.m1952a(parcel, 33, c0543bx.m2436L(), true);
        }
        if (setM2460e.contains(38)) {
            C0465c.m1944a(parcel, 38, c0543bx.m2440P());
        }
        if (setM2460e.contains(39)) {
            C0465c.m1952a(parcel, 39, c0543bx.m2441Q(), true);
        }
        if (setM2460e.contains(36)) {
            C0465c.m1944a(parcel, 36, c0543bx.m2438N());
        }
        if (setM2460e.contains(37)) {
            C0465c.m1951a(parcel, 37, (Parcelable) c0543bx.m2439O(), i, true);
        }
        if (setM2460e.contains(42)) {
            C0465c.m1952a(parcel, 42, c0543bx.m2444T(), true);
        }
        if (setM2460e.contains(43)) {
            C0465c.m1952a(parcel, 43, c0543bx.m2445U(), true);
        }
        if (setM2460e.contains(40)) {
            C0465c.m1951a(parcel, 40, (Parcelable) c0543bx.m2442R(), i, true);
        }
        if (setM2460e.contains(41)) {
            C0465c.m1962b(parcel, 41, c0543bx.m2443S(), true);
        }
        if (setM2460e.contains(46)) {
            C0465c.m1951a(parcel, 46, (Parcelable) c0543bx.m2448X(), i, true);
        }
        if (setM2460e.contains(47)) {
            C0465c.m1952a(parcel, 47, c0543bx.m2449Y(), true);
        }
        if (setM2460e.contains(44)) {
            C0465c.m1952a(parcel, 44, c0543bx.m2446V(), true);
        }
        if (setM2460e.contains(45)) {
            C0465c.m1952a(parcel, 45, c0543bx.m2447W(), true);
        }
        if (setM2460e.contains(51)) {
            C0465c.m1952a(parcel, 51, c0543bx.m2453ac(), true);
        }
        if (setM2460e.contains(50)) {
            C0465c.m1951a(parcel, 50, (Parcelable) c0543bx.m2452ab(), i, true);
        }
        if (setM2460e.contains(49)) {
            C0465c.m1952a(parcel, 49, c0543bx.m2451aa(), true);
        }
        if (setM2460e.contains(48)) {
            C0465c.m1952a(parcel, 48, c0543bx.m2450Z(), true);
        }
        if (setM2460e.contains(55)) {
            C0465c.m1952a(parcel, 55, c0543bx.m2457ag(), true);
        }
        if (setM2460e.contains(54)) {
            C0465c.m1952a(parcel, 54, c0543bx.m2456af(), true);
        }
        if (setM2460e.contains(53)) {
            C0465c.m1952a(parcel, 53, c0543bx.m2455ae(), true);
        }
        if (setM2460e.contains(52)) {
            C0465c.m1952a(parcel, 52, c0543bx.m2454ad(), true);
        }
        if (setM2460e.contains(56)) {
            C0465c.m1952a(parcel, 56, c0543bx.m2458ah(), true);
        }
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0543bx createFromParcel(Parcel parcel) {
        int iM1913b = C0463a.m1913b(parcel);
        HashSet hashSet = new HashSet();
        int iM1920f = 0;
        C0543bx c0543bx = null;
        ArrayList arrayListM1938x = null;
        C0543bx c0543bx2 = null;
        String strM1926l = null;
        String strM1926l2 = null;
        String strM1926l3 = null;
        ArrayList arrayListM1916c = null;
        int iM1920f2 = 0;
        ArrayList arrayListM1916c2 = null;
        C0543bx c0543bx3 = null;
        ArrayList arrayListM1916c3 = null;
        String strM1926l4 = null;
        String strM1926l5 = null;
        C0543bx c0543bx4 = null;
        String strM1926l6 = null;
        String strM1926l7 = null;
        String strM1926l8 = null;
        ArrayList arrayListM1916c4 = null;
        String strM1926l9 = null;
        String strM1926l10 = null;
        String strM1926l11 = null;
        String strM1926l12 = null;
        String strM1926l13 = null;
        String strM1926l14 = null;
        String strM1926l15 = null;
        String strM1926l16 = null;
        String strM1926l17 = null;
        C0543bx c0543bx5 = null;
        String strM1926l18 = null;
        String strM1926l19 = null;
        String strM1926l20 = null;
        String strM1926l21 = null;
        C0543bx c0543bx6 = null;
        double dM1924j = 0.0d;
        C0543bx c0543bx7 = null;
        double dM1924j2 = 0.0d;
        String strM1926l22 = null;
        C0543bx c0543bx8 = null;
        ArrayList arrayListM1916c5 = null;
        String strM1926l23 = null;
        String strM1926l24 = null;
        String strM1926l25 = null;
        String strM1926l26 = null;
        C0543bx c0543bx9 = null;
        String strM1926l27 = null;
        String strM1926l28 = null;
        String strM1926l29 = null;
        C0543bx c0543bx10 = null;
        String strM1926l30 = null;
        String strM1926l31 = null;
        String strM1926l32 = null;
        String strM1926l33 = null;
        String strM1926l34 = null;
        String strM1926l35 = null;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(1);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    C0543bx c0543bx11 = (C0543bx) C0463a.m1910a(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(2);
                    c0543bx = c0543bx11;
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    arrayListM1938x = C0463a.m1938x(parcel, iM1908a);
                    hashSet.add(3);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    C0543bx c0543bx12 = (C0543bx) C0463a.m1910a(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(4);
                    c0543bx2 = c0543bx12;
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(5);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    strM1926l2 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(6);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    strM1926l3 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(7);
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    arrayListM1916c = C0463a.m1916c(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(8);
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(9);
                    break;
                case C0467e.MapAttrs_uiZoomControls /* 10 */:
                    arrayListM1916c2 = C0463a.m1916c(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(10);
                    break;
                case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                    C0543bx c0543bx13 = (C0543bx) C0463a.m1910a(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(11);
                    c0543bx3 = c0543bx13;
                    break;
                case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                    arrayListM1916c3 = C0463a.m1916c(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(12);
                    break;
                case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                    strM1926l4 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(13);
                    break;
                case 14:
                    strM1926l5 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(14);
                    break;
                case 15:
                    C0543bx c0543bx14 = (C0543bx) C0463a.m1910a(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(15);
                    c0543bx4 = c0543bx14;
                    break;
                case 16:
                    strM1926l6 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(16);
                    break;
                case 17:
                    strM1926l7 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(17);
                    break;
                case 18:
                    strM1926l8 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(18);
                    break;
                case 19:
                    arrayListM1916c4 = C0463a.m1916c(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(19);
                    break;
                case 20:
                    strM1926l9 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(20);
                    break;
                case 21:
                    strM1926l10 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(21);
                    break;
                case 22:
                    strM1926l11 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(22);
                    break;
                case 23:
                    strM1926l12 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(23);
                    break;
                case 24:
                    strM1926l13 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(24);
                    break;
                case 25:
                    strM1926l14 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(25);
                    break;
                case 26:
                    strM1926l15 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(26);
                    break;
                case 27:
                    strM1926l16 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(27);
                    break;
                case 28:
                    strM1926l17 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(28);
                    break;
                case 29:
                    C0543bx c0543bx15 = (C0543bx) C0463a.m1910a(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(29);
                    c0543bx5 = c0543bx15;
                    break;
                case 30:
                    strM1926l18 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(30);
                    break;
                case 31:
                    strM1926l19 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(31);
                    break;
                case 32:
                    strM1926l20 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(32);
                    break;
                case 33:
                    strM1926l21 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(33);
                    break;
                case 34:
                    C0543bx c0543bx16 = (C0543bx) C0463a.m1910a(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(34);
                    c0543bx6 = c0543bx16;
                    break;
                case 35:
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
                case 36:
                    dM1924j = C0463a.m1924j(parcel, iM1908a);
                    hashSet.add(36);
                    break;
                case 37:
                    C0543bx c0543bx17 = (C0543bx) C0463a.m1910a(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(37);
                    c0543bx7 = c0543bx17;
                    break;
                case 38:
                    dM1924j2 = C0463a.m1924j(parcel, iM1908a);
                    hashSet.add(38);
                    break;
                case 39:
                    strM1926l22 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(39);
                    break;
                case 40:
                    C0543bx c0543bx18 = (C0543bx) C0463a.m1910a(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(40);
                    c0543bx8 = c0543bx18;
                    break;
                case 41:
                    arrayListM1916c5 = C0463a.m1916c(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(41);
                    break;
                case 42:
                    strM1926l23 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(42);
                    break;
                case 43:
                    strM1926l24 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(43);
                    break;
                case 44:
                    strM1926l25 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(44);
                    break;
                case 45:
                    strM1926l26 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(45);
                    break;
                case 46:
                    C0543bx c0543bx19 = (C0543bx) C0463a.m1910a(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(46);
                    c0543bx9 = c0543bx19;
                    break;
                case 47:
                    strM1926l27 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(47);
                    break;
                case 48:
                    strM1926l28 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(48);
                    break;
                case 49:
                    strM1926l29 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(49);
                    break;
                case 50:
                    C0543bx c0543bx20 = (C0543bx) C0463a.m1910a(parcel, iM1908a, C0543bx.CREATOR);
                    hashSet.add(50);
                    c0543bx10 = c0543bx20;
                    break;
                case 51:
                    strM1926l30 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(51);
                    break;
                case 52:
                    strM1926l31 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(52);
                    break;
                case 53:
                    strM1926l32 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(53);
                    break;
                case 54:
                    strM1926l33 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(54);
                    break;
                case 55:
                    strM1926l34 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(55);
                    break;
                case 56:
                    strM1926l35 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(56);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new C0543bx(hashSet, iM1920f, c0543bx, arrayListM1938x, c0543bx2, strM1926l, strM1926l2, strM1926l3, arrayListM1916c, iM1920f2, arrayListM1916c2, c0543bx3, arrayListM1916c3, strM1926l4, strM1926l5, c0543bx4, strM1926l6, strM1926l7, strM1926l8, arrayListM1916c4, strM1926l9, strM1926l10, strM1926l11, strM1926l12, strM1926l13, strM1926l14, strM1926l15, strM1926l16, strM1926l17, c0543bx5, strM1926l18, strM1926l19, strM1926l20, strM1926l21, c0543bx6, dM1924j, c0543bx7, dM1924j2, strM1926l22, c0543bx8, arrayListM1916c5, strM1926l23, strM1926l24, strM1926l25, strM1926l26, c0543bx9, strM1926l27, strM1926l28, strM1926l29, c0543bx10, strM1926l30, strM1926l31, strM1926l32, strM1926l33, strM1926l34, strM1926l35);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0543bx[] newArray(int i) {
        return new C0543bx[i];
    }
}
