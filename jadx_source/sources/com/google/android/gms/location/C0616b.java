package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;

/* JADX INFO: renamed from: com.google.android.gms.location.b */
/* JADX INFO: loaded from: classes.dex */
public class C0616b implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2800a(DetectedActivity detectedActivity, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1946a(parcel, 1, detectedActivity.f2105a);
        C0465c.m1946a(parcel, 1000, detectedActivity.m2794b());
        C0465c.m1946a(parcel, 2, detectedActivity.f2106b);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DetectedActivity createFromParcel(Parcel parcel) {
        int iM1920f = 0;
        int iM1913b = C0463a.m1913b(parcel);
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
        return new DetectedActivity(iM1920f3, iM1920f2, iM1920f);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DetectedActivity[] newArray(int i) {
        return new DetectedActivity[i];
    }
}
