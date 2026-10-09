package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.bn */
/* JADX INFO: loaded from: classes.dex */
public class C0533bn implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2393a(C0549cc.b bVar, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        Set setM2535e = bVar.m2535e();
        if (setM2535e.contains(1)) {
            C0465c.m1946a(parcel, 1, bVar.m2536f());
        }
        if (setM2535e.contains(2)) {
            C0465c.m1951a(parcel, 2, (Parcelable) bVar.m2537g(), i, true);
        }
        if (setM2535e.contains(3)) {
            C0465c.m1951a(parcel, 3, (Parcelable) bVar.m2538h(), i, true);
        }
        if (setM2535e.contains(4)) {
            C0465c.m1946a(parcel, 4, bVar.m2539i());
        }
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0549cc.b createFromParcel(Parcel parcel) {
        C0549cc.b.C1042b c1042b = null;
        int iM1920f = 0;
        int iM1913b = C0463a.m1913b(parcel);
        HashSet hashSet = new HashSet();
        C0549cc.b.a aVar = null;
        int iM1920f2 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(1);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    C0549cc.b.a aVar2 = (C0549cc.b.a) C0463a.m1910a(parcel, iM1908a, C0549cc.b.a.CREATOR);
                    hashSet.add(2);
                    aVar = aVar2;
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    C0549cc.b.C1042b c1042b2 = (C0549cc.b.C1042b) C0463a.m1910a(parcel, iM1908a, C0549cc.b.C1042b.CREATOR);
                    hashSet.add(3);
                    c1042b = c1042b2;
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    hashSet.add(4);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new C0549cc.b(hashSet, iM1920f2, aVar, c1042b, iM1920f);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0549cc.b[] newArray(int i) {
        return new C0549cc.b[i];
    }
}
