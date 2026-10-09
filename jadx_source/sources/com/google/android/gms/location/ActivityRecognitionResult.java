package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ActivityRecognitionResult implements SafeParcelable {
    public static final C0615a CREATOR = new C0615a();

    /* JADX INFO: renamed from: a */
    List f2101a;

    /* JADX INFO: renamed from: b */
    long f2102b;

    /* JADX INFO: renamed from: c */
    long f2103c;

    /* JADX INFO: renamed from: d */
    private final int f2104d = 1;

    public ActivityRecognitionResult(int i, List list, long j, long j2) {
        this.f2101a = list;
        this.f2102b = j;
        this.f2103c = j2;
    }

    /* JADX INFO: renamed from: a */
    public int m2791a() {
        return this.f2104d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + this.f2101a + ", timeMillis=" + this.f2102b + ", elapsedRealtimeMillis=" + this.f2103c + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0615a.m2797a(this, parcel, i);
    }
}
