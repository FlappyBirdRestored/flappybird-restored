package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.p016a.AbstractBinderC0709w;
import com.google.android.gms.maps.model.p016a.InterfaceC0708v;
import com.google.android.gms.maps.p015a.C0657bk;

/* JADX INFO: loaded from: classes.dex */
public final class TileOverlayOptions implements SafeParcelable {
    public static final C0724n CREATOR = new C0724n();

    /* JADX INFO: renamed from: a */
    private final int f2223a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0708v f2224b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0725o f2225c;

    /* JADX INFO: renamed from: d */
    private boolean f2226d;

    /* JADX INFO: renamed from: e */
    private float f2227e;

    public TileOverlayOptions() {
        this.f2226d = true;
        this.f2223a = 1;
    }

    TileOverlayOptions(int i, IBinder iBinder, boolean z, float f) {
        this.f2226d = true;
        this.f2223a = i;
        this.f2224b = AbstractBinderC0709w.m3160a(iBinder);
        this.f2225c = this.f2224b == null ? null : new C0723m(this);
        this.f2226d = z;
        this.f2227e = f;
    }

    /* JADX INFO: renamed from: a */
    int m3032a() {
        return this.f2223a;
    }

    /* JADX INFO: renamed from: b */
    IBinder m3033b() {
        return this.f2224b.asBinder();
    }

    /* JADX INFO: renamed from: c */
    public float m3034c() {
        return this.f2227e;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3035d() {
        return this.f2226d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (C0657bk.m2880a()) {
            C0736z.m3209a(this, parcel, i);
        } else {
            C0724n.m3194a(this, parcel, i);
        }
    }
}
