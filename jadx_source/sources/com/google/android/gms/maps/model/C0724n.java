package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.n */
/* JADX INFO: loaded from: classes.dex */
public class C0724n implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m3194a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, tileOverlayOptions.m3032a());
        C0465c.m1949a(parcel, 2, tileOverlayOptions.m3033b(), false);
        C0465c.m1955a(parcel, 3, tileOverlayOptions.m3035d());
        C0465c.m1945a(parcel, 4, tileOverlayOptions.m3034c());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TileOverlayOptions createFromParcel(Parcel parcel) {
        boolean zM1917c = false;
        int iM1913b = C0463a.m1913b(parcel);
        IBinder iBinderM1927m = null;
        float fM1923i = 0.0f;
        int iM1920f = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    iBinderM1927m = C0463a.m1927m(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    fM1923i = C0463a.m1923i(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new TileOverlayOptions(iM1920f, iBinderM1927m, zM1917c, fM1923i);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TileOverlayOptions[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
