package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.g */
/* JADX INFO: loaded from: classes.dex */
public class C0595g implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2728a(C0500ah c0500ah, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, c0500ah.m2257b());
        C0465c.m1962b(parcel, 2, c0500ah.m2258c(), false);
        C0465c.m1952a(parcel, 3, c0500ah.m2259d(), false);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0500ah createFromParcel(Parcel parcel) {
        String strM1926l = null;
        int iM1913b = C0463a.m1913b(parcel);
        int iM1920f = 0;
        ArrayList arrayListM1916c = null;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    arrayListM1916c = C0463a.m1916c(parcel, iM1908a, C0500ah.a.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new C0500ah(iM1920f, arrayListM1916c, strM1926l);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0500ah[] newArray(int i) {
        return new C0500ah[i];
    }
}
