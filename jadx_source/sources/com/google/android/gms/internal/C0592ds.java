package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.internal.ds */
/* JADX INFO: loaded from: classes.dex */
public class C0592ds implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2719a(C0612x c0612x, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, c0612x.m2779b());
        C0465c.m1946a(parcel, 1000, c0612x.m2778a());
        C0465c.m1946a(parcel, 2, c0612x.m2780c());
        C0465c.m1952a(parcel, 3, c0612x.m2781d(), false);
        C0465c.m1952a(parcel, 4, c0612x.m2782e(), false);
        C0465c.m1952a(parcel, 5, c0612x.m2783f(), false);
        C0465c.m1952a(parcel, 6, c0612x.m2784g(), false);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0612x createFromParcel(Parcel parcel) {
        int iM1920f = 0;
        String strM1926l = null;
        int iM1913b = C0463a.m1913b(parcel);
        String strM1926l2 = null;
        String strM1926l3 = null;
        String strM1926l4 = null;
        int iM1920f2 = 0;
        int iM1920f3 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    strM1926l4 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    strM1926l3 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    strM1926l2 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                case 1000:
                    iM1920f3 = C0463a.m1920f(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new C0612x(iM1920f3, iM1920f2, iM1920f, strM1926l4, strM1926l3, strM1926l2, strM1926l);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0612x[] newArray(int i) {
        return new C0612x[i];
    }
}
