package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.bt */
/* JADX INFO: loaded from: classes.dex */
public class C0539bt implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2411a(C0549cc.g gVar, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        Set setM2577e = gVar.m2577e();
        if (setM2577e.contains(1)) {
            C0465c.m1946a(parcel, 1, gVar.m2578f());
        }
        if (setM2577e.contains(2)) {
            C0465c.m1955a(parcel, 2, gVar.m2579g());
        }
        if (setM2577e.contains(3)) {
            C0465c.m1952a(parcel, 3, gVar.m2580h(), true);
        }
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0549cc.g createFromParcel(Parcel parcel) {
        boolean zM1917c = false;
        int iM1913b = C0463a.m1913b(parcel);
        HashSet hashSet = new HashSet();
        String strM1926l = null;
        int iM1920f = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(1);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    hashSet.add(2);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    hashSet.add(3);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new C0549cc.g(hashSet, iM1920f, zM1917c, strM1926l);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0549cc.g[] newArray(int i) {
        return new C0549cc.g[i];
    }
}
