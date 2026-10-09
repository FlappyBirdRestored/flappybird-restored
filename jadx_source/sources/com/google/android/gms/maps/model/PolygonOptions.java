package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p015a.C0657bk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PolygonOptions implements SafeParcelable {
    public static final C0719i CREATOR = new C0719i();

    /* JADX INFO: renamed from: a */
    private final int f2203a;

    /* JADX INFO: renamed from: b */
    private final List f2204b;

    /* JADX INFO: renamed from: c */
    private final List f2205c;

    /* JADX INFO: renamed from: d */
    private float f2206d;

    /* JADX INFO: renamed from: e */
    private int f2207e;

    /* JADX INFO: renamed from: f */
    private int f2208f;

    /* JADX INFO: renamed from: g */
    private float f2209g;

    /* JADX INFO: renamed from: h */
    private boolean f2210h;

    /* JADX INFO: renamed from: i */
    private boolean f2211i;

    public PolygonOptions() {
        this.f2206d = 10.0f;
        this.f2207e = -16777216;
        this.f2208f = 0;
        this.f2209g = 0.0f;
        this.f2210h = true;
        this.f2211i = false;
        this.f2203a = 1;
        this.f2204b = new ArrayList();
        this.f2205c = new ArrayList();
    }

    PolygonOptions(int i, List list, List list2, float f, int i2, int i3, float f2, boolean z, boolean z2) {
        this.f2206d = 10.0f;
        this.f2207e = -16777216;
        this.f2208f = 0;
        this.f2209g = 0.0f;
        this.f2210h = true;
        this.f2211i = false;
        this.f2203a = i;
        this.f2204b = list;
        this.f2205c = list2;
        this.f2206d = f;
        this.f2207e = i2;
        this.f2208f = i3;
        this.f2209g = f2;
        this.f2210h = z;
        this.f2211i = z2;
    }

    /* JADX INFO: renamed from: a */
    int m3014a() {
        return this.f2203a;
    }

    /* JADX INFO: renamed from: b */
    List m3015b() {
        return this.f2205c;
    }

    /* JADX INFO: renamed from: c */
    public List m3016c() {
        return this.f2204b;
    }

    /* JADX INFO: renamed from: d */
    public float m3017d() {
        return this.f2206d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m3018e() {
        return this.f2207e;
    }

    /* JADX INFO: renamed from: f */
    public int m3019f() {
        return this.f2208f;
    }

    /* JADX INFO: renamed from: g */
    public float m3020g() {
        return this.f2209g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m3021h() {
        return this.f2210h;
    }

    /* JADX INFO: renamed from: i */
    public boolean m3022i() {
        return this.f2211i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (C0657bk.m2880a()) {
            C0733w.m3206a(this, parcel, i);
        } else {
            C0719i.m3185a(this, parcel, i);
        }
    }
}
