package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p015a.C0657bk;
import com.google.android.gms.p013b.AbstractBinderC0438f;

/* JADX INFO: loaded from: classes.dex */
public final class GroundOverlayOptions implements SafeParcelable {
    public static final C0715e CREATOR = new C0715e();

    /* JADX INFO: renamed from: a */
    private final int f2172a;

    /* JADX INFO: renamed from: b */
    private C0686a f2173b;

    /* JADX INFO: renamed from: c */
    private LatLng f2174c;

    /* JADX INFO: renamed from: d */
    private float f2175d;

    /* JADX INFO: renamed from: e */
    private float f2176e;

    /* JADX INFO: renamed from: f */
    private LatLngBounds f2177f;

    /* JADX INFO: renamed from: g */
    private float f2178g;

    /* JADX INFO: renamed from: h */
    private float f2179h;

    /* JADX INFO: renamed from: i */
    private boolean f2180i;

    /* JADX INFO: renamed from: j */
    private float f2181j;

    /* JADX INFO: renamed from: k */
    private float f2182k;

    /* JADX INFO: renamed from: l */
    private float f2183l;

    public GroundOverlayOptions() {
        this.f2180i = true;
        this.f2181j = 0.0f;
        this.f2182k = 0.5f;
        this.f2183l = 0.5f;
        this.f2172a = 1;
    }

    GroundOverlayOptions(int i, IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7) {
        this.f2180i = true;
        this.f2181j = 0.0f;
        this.f2182k = 0.5f;
        this.f2183l = 0.5f;
        this.f2172a = i;
        this.f2173b = new C0686a(AbstractBinderC0438f.m1828a(iBinder));
        this.f2174c = latLng;
        this.f2175d = f;
        this.f2176e = f2;
        this.f2177f = latLngBounds;
        this.f2178g = f3;
        this.f2179h = f4;
        this.f2180i = z;
        this.f2181j = f5;
        this.f2182k = f6;
        this.f2183l = f7;
    }

    /* JADX INFO: renamed from: a */
    IBinder m2987a() {
        return this.f2173b.m3037a().asBinder();
    }

    /* JADX INFO: renamed from: b */
    int m2988b() {
        return this.f2172a;
    }

    /* JADX INFO: renamed from: c */
    public LatLng m2989c() {
        return this.f2174c;
    }

    /* JADX INFO: renamed from: d */
    public float m2990d() {
        return this.f2175d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public float m2991e() {
        return this.f2176e;
    }

    /* JADX INFO: renamed from: f */
    public LatLngBounds m2992f() {
        return this.f2177f;
    }

    /* JADX INFO: renamed from: g */
    public float m2993g() {
        return this.f2178g;
    }

    /* JADX INFO: renamed from: h */
    public float m2994h() {
        return this.f2179h;
    }

    /* JADX INFO: renamed from: i */
    public float m2995i() {
        return this.f2181j;
    }

    /* JADX INFO: renamed from: j */
    public float m2996j() {
        return this.f2182k;
    }

    /* JADX INFO: renamed from: k */
    public float m2997k() {
        return this.f2183l;
    }

    /* JADX INFO: renamed from: l */
    public boolean m2998l() {
        return this.f2180i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (C0657bk.m2880a()) {
            C0729s.m3202a(this, parcel, i);
        } else {
            C0715e.m3173a(this, parcel, i);
        }
    }
}
