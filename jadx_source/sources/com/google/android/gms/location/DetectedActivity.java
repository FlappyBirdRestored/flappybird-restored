package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class DetectedActivity implements SafeParcelable {
    public static final C0616b CREATOR = new C0616b();

    /* JADX INFO: renamed from: a */
    int f2105a;

    /* JADX INFO: renamed from: b */
    int f2106b;

    /* JADX INFO: renamed from: c */
    private final int f2107c;

    public DetectedActivity(int i, int i2, int i3) {
        this.f2107c = i;
        this.f2105a = i2;
        this.f2106b = i3;
    }

    /* JADX INFO: renamed from: a */
    private int m2792a(int i) {
        if (i > 5) {
            return 4;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public int m2793a() {
        return m2792a(this.f2105a);
    }

    /* JADX INFO: renamed from: b */
    public int m2794b() {
        return this.f2107c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DetectedActivity [type=" + m2793a() + ", confidence=" + this.f2106b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0616b.m2800a(this, parcel, i);
    }
}
