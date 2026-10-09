package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.games.h */
/* JADX INFO: loaded from: classes.dex */
public class C0478h implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2016a(GameEntity gameEntity, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1952a(parcel, 1, gameEntity.mo1965b(), false);
        C0465c.m1952a(parcel, 2, gameEntity.mo1966c(), false);
        C0465c.m1952a(parcel, 3, gameEntity.mo1967d(), false);
        C0465c.m1952a(parcel, 4, gameEntity.mo1968e(), false);
        C0465c.m1952a(parcel, 5, gameEntity.mo1969f(), false);
        C0465c.m1952a(parcel, 6, gameEntity.mo1970g(), false);
        C0465c.m1951a(parcel, 7, (Parcelable) gameEntity.mo1971h(), i, false);
        C0465c.m1951a(parcel, 8, (Parcelable) gameEntity.mo1972i(), i, false);
        C0465c.m1951a(parcel, 9, (Parcelable) gameEntity.mo1973j(), i, false);
        C0465c.m1955a(parcel, 10, gameEntity.mo1974k());
        C0465c.m1955a(parcel, 11, gameEntity.mo1975l());
        C0465c.m1952a(parcel, 12, gameEntity.mo1976m(), false);
        C0465c.m1946a(parcel, 13, gameEntity.mo1977n());
        C0465c.m1946a(parcel, 14, gameEntity.mo1978o());
        C0465c.m1946a(parcel, 15, gameEntity.mo1979p());
        C0465c.m1946a(parcel, 1000, gameEntity.m1986q());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GameEntity createFromParcel(Parcel parcel) {
        int iM1913b = C0463a.m1913b(parcel);
        int iM1920f = 0;
        String strM1926l = null;
        String strM1926l2 = null;
        String strM1926l3 = null;
        String strM1926l4 = null;
        String strM1926l5 = null;
        String strM1926l6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean zM1917c = false;
        boolean zM1917c2 = false;
        String strM1926l7 = null;
        int iM1920f2 = 0;
        int iM1920f3 = 0;
        int iM1920f4 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    strM1926l2 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    strM1926l3 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    strM1926l4 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    strM1926l5 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    strM1926l6 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    uri = (Uri) C0463a.m1910a(parcel, iM1908a, Uri.CREATOR);
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    uri2 = (Uri) C0463a.m1910a(parcel, iM1908a, Uri.CREATOR);
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    uri3 = (Uri) C0463a.m1910a(parcel, iM1908a, Uri.CREATOR);
                    break;
                case C0467e.MapAttrs_uiZoomControls /* 10 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                    zM1917c2 = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                    strM1926l7 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case 14:
                    iM1920f3 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case 15:
                    iM1920f4 = C0463a.m1920f(parcel, iM1908a);
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
        return new GameEntity(iM1920f, strM1926l, strM1926l2, strM1926l3, strM1926l4, strM1926l5, strM1926l6, uri, uri2, uri3, zM1917c, zM1917c2, strM1926l7, iM1920f2, iM1920f3, iM1920f4);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GameEntity[] newArray(int i) {
        return new GameEntity[i];
    }
}
