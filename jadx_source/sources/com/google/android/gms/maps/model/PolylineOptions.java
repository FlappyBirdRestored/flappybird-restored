package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p015a.C0657bk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PolylineOptions implements SafeParcelable {
    public static final C0720j CREATOR = new C0720j();

    /* JADX INFO: renamed from: a */
    private final int f2212a;

    /* JADX INFO: renamed from: b */
    private final List f2213b;

    /* JADX INFO: renamed from: c */
    private float f2214c;

    /* JADX INFO: renamed from: d */
    private int f2215d;

    /* JADX INFO: renamed from: e */
    private float f2216e;

    /* JADX INFO: renamed from: f */
    private boolean f2217f;

    /* JADX INFO: renamed from: g */
    private boolean f2218g;

    public PolylineOptions() {
        this.f2214c = 10.0f;
        this.f2215d = -16777216;
        this.f2216e = 0.0f;
        this.f2217f = true;
        this.f2218g = false;
        this.f2212a = 1;
        this.f2213b = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int i2, float f2, boolean z, boolean z2) {
        this.f2214c = 10.0f;
        this.f2215d = -16777216;
        this.f2216e = 0.0f;
        this.f2217f = true;
        this.f2218g = false;
        this.f2212a = i;
        this.f2213b = list;
        this.f2214c = f;
        this.f2215d = i2;
        this.f2216e = f2;
        this.f2217f = z;
        this.f2218g = z2;
    }

    /* JADX INFO: renamed from: a */
    int m3023a() {
        return this.f2212a;
    }

    /* JADX INFO: renamed from: b */
    public List m3024b() {
        return this.f2213b;
    }

    /* JADX INFO: renamed from: c */
    public float m3025c() {
        return this.f2214c;
    }

    /* JADX INFO: renamed from: d */
    public int m3026d() {
        return this.f2215d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public float m3027e() {
        return this.f2216e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m3028f() {
        return this.f2217f;
    }

    /* JADX INFO: renamed from: g */
    public boolean m3029g() {
        return this.f2218g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (C0657bk.m2880a()) {
            C0734x.m3207a(this, parcel, i);
        } else {
            C0720j.m3188a(this, parcel, i);
        }
    }
}
