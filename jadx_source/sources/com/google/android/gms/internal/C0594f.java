package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.internal.f */
/* JADX INFO: loaded from: classes.dex */
public class C0594f implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2725a(C0500ah.b bVar, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, bVar.f1778a);
        C0465c.m1952a(parcel, 2, bVar.f1779b, false);
        C0465c.m1951a(parcel, 3, (Parcelable) bVar.f1780c, i, false);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0500ah.b createFromParcel(Parcel parcel) {
        AbstractC0497ae.a aVar = null;
        int iM1913b = C0463a.m1913b(parcel);
        int iM1920f = 0;
        String strM1926l = null;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    aVar = (AbstractC0497ae.a) C0463a.m1910a(parcel, iM1908a, AbstractC0497ae.a.CREATOR);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new C0500ah.b(iM1920f, strM1926l, aVar);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0500ah.b[] newArray(int i) {
        return new C0500ah.b[i];
    }
}
