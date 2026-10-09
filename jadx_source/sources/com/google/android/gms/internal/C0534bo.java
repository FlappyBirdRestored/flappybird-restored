package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.bo */
/* JADX INFO: loaded from: classes.dex */
public class C0534bo implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2396a(C0549cc.b.a aVar, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        Set setM2541e = aVar.m2541e();
        if (setM2541e.contains(1)) {
            C0465c.m1946a(parcel, 1, aVar.m2542f());
        }
        if (setM2541e.contains(2)) {
            C0465c.m1946a(parcel, 2, aVar.m2543g());
        }
        if (setM2541e.contains(3)) {
            C0465c.m1946a(parcel, 3, aVar.m2544h());
        }
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0549cc.b.a createFromParcel(Parcel parcel) {
        int iM1920f = 0;
        int iM1913b = C0463a.m1913b(parcel);
        HashSet hashSet = new HashSet();
        int iM1920f2 = 0;
        int iM1920f3 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f3 = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(1);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(2);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
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
        return new C0549cc.b.a(hashSet, iM1920f3, iM1920f2, iM1920f);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0549cc.b.a[] newArray(int i) {
        return new C0549cc.b.a[i];
    }
}
