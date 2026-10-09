package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.internal.i */
/* JADX INFO: loaded from: classes.dex */
public class C0597i implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2734a(C0503ak c0503ak, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, c0503ak.m2276a());
        C0465c.m1950a(parcel, 2, c0503ak.m2277e(), false);
        C0465c.m1951a(parcel, 3, (Parcelable) c0503ak.m2278f(), i, false);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0503ak createFromParcel(Parcel parcel) {
        C0500ah c0500ah = null;
        int iM1913b = C0463a.m1913b(parcel);
        int iM1920f = 0;
        Parcel parcelM1939y = null;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    parcelM1939y = C0463a.m1939y(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    c0500ah = (C0500ah) C0463a.m1910a(parcel, iM1908a, C0500ah.CREATOR);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new C0503ak(iM1920f, parcelM1939y, c0500ah);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0503ak[] newArray(int i) {
        return new C0503ak[i];
    }
}
