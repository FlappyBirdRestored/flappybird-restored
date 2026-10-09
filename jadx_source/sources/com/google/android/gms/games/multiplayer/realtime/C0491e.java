package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.games.multiplayer.realtime.e */
/* JADX INFO: loaded from: classes.dex */
public class C0491e implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2081a(RoomEntity roomEntity, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1952a(parcel, 1, roomEntity.mo2060b(), false);
        C0465c.m1946a(parcel, 1000, roomEntity.m2074k());
        C0465c.m1952a(parcel, 2, roomEntity.mo2061c(), false);
        C0465c.m1947a(parcel, 3, roomEntity.mo2062d());
        C0465c.m1946a(parcel, 4, roomEntity.mo2063e());
        C0465c.m1952a(parcel, 5, roomEntity.mo2064f(), false);
        C0465c.m1946a(parcel, 6, roomEntity.mo2065g());
        C0465c.m1948a(parcel, 7, roomEntity.mo2066h(), false);
        C0465c.m1962b(parcel, 8, roomEntity.mo2033i(), false);
        C0465c.m1946a(parcel, 9, roomEntity.mo2067j());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RoomEntity createFromParcel(Parcel parcel) {
        int iM1920f = 0;
        ArrayList arrayListM1916c = null;
        int iM1913b = C0463a.m1913b(parcel);
        long jM1921g = 0;
        Bundle bundleM1928n = null;
        int iM1920f2 = 0;
        String strM1926l = null;
        int iM1920f3 = 0;
        String strM1926l2 = null;
        String strM1926l3 = null;
        int iM1920f4 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    strM1926l3 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    strM1926l2 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    jM1921g = C0463a.m1921g(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    iM1920f3 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    bundleM1928n = C0463a.m1928n(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    arrayListM1916c = C0463a.m1916c(parcel, iM1908a, ParticipantEntity.CREATOR);
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case 1000:
                    iM1920f4 = C0463a.m1920f(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new RoomEntity(iM1920f4, strM1926l3, strM1926l2, jM1921g, iM1920f3, strM1926l, iM1920f2, bundleM1928n, arrayListM1916c, iM1920f);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RoomEntity[] newArray(int i) {
        return new RoomEntity[i];
    }
}
