package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.i */
/* JADX INFO: loaded from: classes.dex */
public class C0719i implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m3185a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, polygonOptions.m3014a());
        C0465c.m1962b(parcel, 2, polygonOptions.m3016c(), false);
        C0465c.m1964c(parcel, 3, polygonOptions.m3015b(), false);
        C0465c.m1945a(parcel, 4, polygonOptions.m3017d());
        C0465c.m1946a(parcel, 5, polygonOptions.m3018e());
        C0465c.m1946a(parcel, 6, polygonOptions.m3019f());
        C0465c.m1945a(parcel, 7, polygonOptions.m3020g());
        C0465c.m1955a(parcel, 8, polygonOptions.m3021h());
        C0465c.m1955a(parcel, 9, polygonOptions.m3022i());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PolygonOptions createFromParcel(Parcel parcel) {
        float fM1923i = 0.0f;
        boolean zM1917c = false;
        int iM1913b = C0463a.m1913b(parcel);
        ArrayList arrayListM1916c = null;
        ArrayList arrayList = new ArrayList();
        boolean zM1917c2 = false;
        int iM1920f = 0;
        int iM1920f2 = 0;
        float fM1923i2 = 0.0f;
        int iM1920f3 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f3 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    arrayListM1916c = C0463a.m1916c(parcel, iM1908a, LatLng.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    C0463a.m1912a(parcel, iM1908a, arrayList, getClass().getClassLoader());
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    fM1923i2 = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    fM1923i = C0463a.m1923i(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    zM1917c2 = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new PolygonOptions(iM1920f3, arrayListM1916c, arrayList, fM1923i2, iM1920f2, iM1920f, fM1923i, zM1917c2, zM1917c);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
