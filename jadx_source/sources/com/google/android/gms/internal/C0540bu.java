package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.bu */
/* JADX INFO: loaded from: classes.dex */
public class C0540bu implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2414a(C0549cc.h hVar, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        Set setM2582e = hVar.m2582e();
        if (setM2582e.contains(1)) {
            C0465c.m1946a(parcel, 1, hVar.m2583f());
        }
        if (setM2582e.contains(3)) {
            C0465c.m1946a(parcel, 3, hVar.m2585h());
        }
        if (setM2582e.contains(4)) {
            C0465c.m1952a(parcel, 4, hVar.m2587j(), true);
        }
        if (setM2582e.contains(5)) {
            C0465c.m1952a(parcel, 5, hVar.m2584g(), true);
        }
        if (setM2582e.contains(6)) {
            C0465c.m1946a(parcel, 6, hVar.m2586i());
        }
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0549cc.h createFromParcel(Parcel parcel) {
        String strM1926l = null;
        int iM1920f = 0;
        int iM1913b = C0463a.m1913b(parcel);
        HashSet hashSet = new HashSet();
        int iM1920f2 = 0;
        String strM1926l2 = null;
        int iM1920f3 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f3 = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(1);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(3);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(4);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    strM1926l2 = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(5);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(6);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new C0549cc.h(hashSet, iM1920f3, strM1926l2, iM1920f2, strM1926l, iM1920f);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0549cc.h[] newArray(int i) {
        return new C0549cc.h[i];
    }
}
