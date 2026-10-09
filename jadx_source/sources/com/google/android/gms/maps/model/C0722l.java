package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.l */
/* JADX INFO: loaded from: classes.dex */
public class C0722l implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m3191a(Tile tile, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, tile.m3030a());
        C0465c.m1946a(parcel, 2, tile.f2219a);
        C0465c.m1946a(parcel, 3, tile.f2220b);
        C0465c.m1956a(parcel, 4, tile.f2221c, false);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Tile createFromParcel(Parcel parcel) {
        int iM1920f = 0;
        int iM1913b = C0463a.m1913b(parcel);
        byte[] bArrM1929o = null;
        int iM1920f2 = 0;
        int iM1920f3 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f3 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    bArrM1929o = C0463a.m1929o(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new Tile(iM1920f3, iM1920f2, iM1920f, bArrM1929o);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Tile[] newArray(int i) {
        return new Tile[i];
    }
}
