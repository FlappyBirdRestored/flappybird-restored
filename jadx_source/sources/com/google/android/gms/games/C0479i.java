package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.games.i */
/* JADX INFO: loaded from: classes.dex */
public class C0479i implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2018a(PlayerEntity playerEntity, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1952a(parcel, 1, playerEntity.mo1988b(), false);
        C0465c.m1946a(parcel, 1000, playerEntity.m1999g());
        C0465c.m1952a(parcel, 2, playerEntity.mo1989c(), false);
        C0465c.m1951a(parcel, 3, (Parcelable) playerEntity.mo1990d(), i, false);
        C0465c.m1951a(parcel, 4, (Parcelable) playerEntity.mo1991e(), i, false);
        C0465c.m1947a(parcel, 5, playerEntity.mo1992f());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PlayerEntity createFromParcel(Parcel parcel) {
        Uri uri = null;
        int iM1913b = C0463a.m1913b(parcel);
        int iM1920f = 0;
        long jM1921g = 0;
        Uri uri2 = null;
        String strM1926l = null;
        String strM1926l2 = null;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    strM1926l2 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    uri2 = (Uri) C0463a.m1910a(parcel, iM1908a, Uri.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    uri = (Uri) C0463a.m1910a(parcel, iM1908a, Uri.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    jM1921g = C0463a.m1921g(parcel, iM1908a);
                    break;
                case 1000:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new PlayerEntity(iM1920f, strM1926l2, strM1926l, uri2, uri, jM1921g);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PlayerEntity[] newArray(int i) {
        return new PlayerEntity[i];
    }
}
