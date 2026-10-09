package com.google.android.gms.maps.model.p016a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.a.x */
/* JADX INFO: loaded from: classes.dex */
class C0710x implements InterfaceC0708v {

    /* JADX INFO: renamed from: a */
    private IBinder f2242a;

    C0710x(IBinder iBinder) {
        this.f2242a = iBinder;
    }

    @Override // com.google.android.gms.maps.model.p016a.InterfaceC0708v
    /* JADX INFO: renamed from: a */
    public Tile mo3159a(int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.f2242a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? Tile.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2242a;
    }
}
