package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p015a.C0657bk;
import com.google.android.gms.p013b.AbstractBinderC0438f;

/* JADX INFO: loaded from: classes.dex */
public final class MarkerOptions implements SafeParcelable {
    public static final C0718h CREATOR = new C0718h();

    /* JADX INFO: renamed from: a */
    private final int f2190a;

    /* JADX INFO: renamed from: b */
    private LatLng f2191b;

    /* JADX INFO: renamed from: c */
    private String f2192c;

    /* JADX INFO: renamed from: d */
    private String f2193d;

    /* JADX INFO: renamed from: e */
    private C0686a f2194e;

    /* JADX INFO: renamed from: f */
    private float f2195f;

    /* JADX INFO: renamed from: g */
    private float f2196g;

    /* JADX INFO: renamed from: h */
    private boolean f2197h;

    /* JADX INFO: renamed from: i */
    private boolean f2198i;

    /* JADX INFO: renamed from: j */
    private boolean f2199j;

    /* JADX INFO: renamed from: k */
    private float f2200k;

    /* JADX INFO: renamed from: l */
    private float f2201l;

    /* JADX INFO: renamed from: m */
    private float f2202m;

    public MarkerOptions() {
        this.f2195f = 0.5f;
        this.f2196g = 1.0f;
        this.f2198i = true;
        this.f2199j = false;
        this.f2200k = 0.0f;
        this.f2201l = 0.5f;
        this.f2202m = 0.0f;
        this.f2190a = 1;
    }

    MarkerOptions(int i, LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5) {
        this.f2195f = 0.5f;
        this.f2196g = 1.0f;
        this.f2198i = true;
        this.f2199j = false;
        this.f2200k = 0.0f;
        this.f2201l = 0.5f;
        this.f2202m = 0.0f;
        this.f2190a = i;
        this.f2191b = latLng;
        this.f2192c = str;
        this.f2193d = str2;
        this.f2194e = iBinder == null ? null : new C0686a(AbstractBinderC0438f.m1828a(iBinder));
        this.f2195f = f;
        this.f2196g = f2;
        this.f2197h = z;
        this.f2198i = z2;
        this.f2199j = z3;
        this.f2200k = f3;
        this.f2201l = f4;
        this.f2202m = f5;
    }

    /* JADX INFO: renamed from: a */
    int m3001a() {
        return this.f2190a;
    }

    /* JADX INFO: renamed from: b */
    IBinder m3002b() {
        if (this.f2194e == null) {
            return null;
        }
        return this.f2194e.m3037a().asBinder();
    }

    /* JADX INFO: renamed from: c */
    public LatLng m3003c() {
        return this.f2191b;
    }

    /* JADX INFO: renamed from: d */
    public String m3004d() {
        return this.f2192c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public String m3005e() {
        return this.f2193d;
    }

    /* JADX INFO: renamed from: f */
    public float m3006f() {
        return this.f2195f;
    }

    /* JADX INFO: renamed from: g */
    public float m3007g() {
        return this.f2196g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m3008h() {
        return this.f2197h;
    }

    /* JADX INFO: renamed from: i */
    public boolean m3009i() {
        return this.f2198i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m3010j() {
        return this.f2199j;
    }

    /* JADX INFO: renamed from: k */
    public float m3011k() {
        return this.f2200k;
    }

    /* JADX INFO: renamed from: l */
    public float m3012l() {
        return this.f2201l;
    }

    /* JADX INFO: renamed from: m */
    public float m3013m() {
        return this.f2202m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (C0657bk.m2880a()) {
            C0732v.m3205a(this, parcel, i);
        } else {
            C0718h.m3182a(this, parcel, i);
        }
    }
}
