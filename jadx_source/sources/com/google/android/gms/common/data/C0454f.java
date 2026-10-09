package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.common.data.f */
/* JADX INFO: loaded from: classes.dex */
public class C0454f implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m1866a(C0452d c0452d, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1958a(parcel, 1, c0452d.m1857c(), false);
        C0465c.m1946a(parcel, 1000, c0452d.m1854b());
        C0465c.m1957a(parcel, 2, (Parcelable[]) c0452d.m1859d(), i, false);
        C0465c.m1946a(parcel, 3, c0452d.m1860e());
        C0465c.m1948a(parcel, 4, c0452d.m1862f(), false);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0452d createFromParcel(Parcel parcel) {
        int iM1920f = 0;
        Bundle bundleM1928n = null;
        int iM1913b = C0463a.m1913b(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArrM1937w = null;
        int iM1920f2 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    strArrM1937w = C0463a.m1937w(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    cursorWindowArr = (CursorWindow[]) C0463a.m1915b(parcel, iM1908a, CursorWindow.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    bundleM1928n = C0463a.m1928n(parcel, iM1908a);
                    break;
                case 1000:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        C0452d c0452d = new C0452d(iM1920f2, strArrM1937w, cursorWindowArr, iM1920f, bundleM1928n);
        c0452d.m1853a();
        return c0452d;
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0452d[] newArray(int i) {
        return new C0452d[i];
    }
}
