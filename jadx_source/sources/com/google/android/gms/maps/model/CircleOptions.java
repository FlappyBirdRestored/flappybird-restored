package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p015a.C0657bk;

/* JADX INFO: loaded from: classes.dex */
public final class CircleOptions implements SafeParcelable {
    public static final C0714d CREATOR = new C0714d();

    /* JADX INFO: renamed from: a */
    private final int f2164a;

    /* JADX INFO: renamed from: b */
    private LatLng f2165b;

    /* JADX INFO: renamed from: c */
    private double f2166c;

    /* JADX INFO: renamed from: d */
    private float f2167d;

    /* JADX INFO: renamed from: e */
    private int f2168e;

    /* JADX INFO: renamed from: f */
    private int f2169f;

    /* JADX INFO: renamed from: g */
    private float f2170g;

    /* JADX INFO: renamed from: h */
    private boolean f2171h;

    public CircleOptions() {
        this.f2165b = null;
        this.f2166c = 0.0d;
        this.f2167d = 10.0f;
        this.f2168e = -16777216;
        this.f2169f = 0;
        this.f2170g = 0.0f;
        this.f2171h = true;
        this.f2164a = 1;
    }

    CircleOptions(int i, LatLng latLng, double d, float f, int i2, int i3, float f2, boolean z) {
        this.f2165b = null;
        this.f2166c = 0.0d;
        this.f2167d = 10.0f;
        this.f2168e = -16777216;
        this.f2169f = 0;
        this.f2170g = 0.0f;
        this.f2171h = true;
        this.f2164a = i;
        this.f2165b = latLng;
        this.f2166c = d;
        this.f2167d = f;
        this.f2168e = i2;
        this.f2169f = i3;
        this.f2170g = f2;
        this.f2171h = z;
    }

    /* JADX INFO: renamed from: a */
    int m2979a() {
        return this.f2164a;
    }

    /* JADX INFO: renamed from: b */
    public LatLng m2980b() {
        return this.f2165b;
    }

    /* JADX INFO: renamed from: c */
    public double m2981c() {
        return this.f2166c;
    }

    /* JADX INFO: renamed from: d */
    public float m2982d() {
        return this.f2167d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m2983e() {
        return this.f2168e;
    }

    /* JADX INFO: renamed from: f */
    public int m2984f() {
        return this.f2169f;
    }

    /* JADX INFO: renamed from: g */
    public float m2985g() {
        return this.f2170g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m2986h() {
        return this.f2171h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (C0657bk.m2880a()) {
            C0728r.m3201a(this, parcel, i);
        } else {
            C0714d.m3170a(this, parcel, i);
        }
    }
}
