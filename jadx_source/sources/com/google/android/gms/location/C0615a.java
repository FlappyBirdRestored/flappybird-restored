package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.location.a */
/* JADX INFO: loaded from: classes.dex */
public class C0615a implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2797a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1962b(parcel, 1, activityRecognitionResult.f2101a, false);
        C0465c.m1946a(parcel, 1000, activityRecognitionResult.m2791a());
        C0465c.m1947a(parcel, 2, activityRecognitionResult.f2102b);
        C0465c.m1947a(parcel, 3, activityRecognitionResult.f2103c);
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ActivityRecognitionResult createFromParcel(Parcel parcel) {
        long jM1921g = 0;
        int iM1913b = C0463a.m1913b(parcel);
        int iM1920f = 0;
        ArrayList arrayListM1916c = null;
        long jM1921g2 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    arrayListM1916c = C0463a.m1916c(parcel, iM1908a, DetectedActivity.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    jM1921g2 = C0463a.m1921g(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
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
        return new ActivityRecognitionResult(iM1920f, arrayListM1916c, jM1921g2, jM1921g);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ActivityRecognitionResult[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
