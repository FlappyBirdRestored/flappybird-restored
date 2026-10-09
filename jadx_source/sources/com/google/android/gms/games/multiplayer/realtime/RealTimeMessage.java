package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C0588do;

/* JADX INFO: loaded from: classes.dex */
public final class RealTimeMessage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0487a();

    /* JADX INFO: renamed from: a */
    private final String f1737a;

    /* JADX INFO: renamed from: b */
    private final byte[] f1738b;

    /* JADX INFO: renamed from: c */
    private final int f1739c;

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    /* synthetic */ RealTimeMessage(Parcel parcel, C0487a c0487a) {
        this(parcel);
    }

    public RealTimeMessage(String str, byte[] bArr, int i) {
        this.f1737a = (String) C0588do.m2704a(str);
        this.f1738b = (byte[]) ((byte[]) C0588do.m2704a(bArr)).clone();
        this.f1739c = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1737a);
        parcel.writeByteArray(this.f1738b);
        parcel.writeInt(this.f1739c);
    }
}
