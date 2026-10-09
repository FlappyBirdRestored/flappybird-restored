package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.p015a.C0657bk;

/* JADX INFO: loaded from: classes.dex */
public final class Tile implements SafeParcelable {
    public static final C0722l CREATOR = new C0722l();

    /* JADX INFO: renamed from: a */
    public final int f2219a;

    /* JADX INFO: renamed from: b */
    public final int f2220b;

    /* JADX INFO: renamed from: c */
    public final byte[] f2221c;

    /* JADX INFO: renamed from: d */
    private final int f2222d;

    Tile(int i, int i2, int i3, byte[] bArr) {
        this.f2222d = i;
        this.f2219a = i2;
        this.f2220b = i3;
        this.f2221c = bArr;
    }

    public Tile(int i, int i2, byte[] bArr) {
        this(1, i, i2, bArr);
    }

    /* JADX INFO: renamed from: a */
    int m3030a() {
        return this.f2222d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (C0657bk.m2880a()) {
            C0735y.m3208a(this, parcel, i);
        } else {
            C0722l.m3191a(this, parcel, i);
        }
    }
}
