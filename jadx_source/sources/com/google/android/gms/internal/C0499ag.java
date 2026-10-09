package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.C0452d;

/* JADX INFO: renamed from: com.google.android.gms.internal.ag */
/* JADX INFO: loaded from: classes.dex */
class C0499ag implements InterfaceC0496ad {

    /* JADX INFO: renamed from: a */
    private IBinder f1770a;

    C0499ag(IBinder iBinder) {
        this.f1770a = iBinder;
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public int mo2137a(InterfaceC0613y interfaceC0613y, byte[] bArr, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f1770a.transact(5033, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public int mo2138a(byte[] bArr, String str, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeString(str);
            parcelObtain.writeStringArray(strArr);
            this.f1770a.transact(5034, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public ParcelFileDescriptor mo2139a(Uri uri) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1770a.transact(6507, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public String mo2140a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1770a.transact(5003, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public String mo2141a(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeString(str);
            this.f1770a.transact(5064, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2142a(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeInt(i);
            this.f1770a.transact(5036, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2143a(long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeLong(j);
            this.f1770a.transact(5001, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2144a(IBinder iBinder, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(iBinder);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1770a.transact(5005, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2145a(InterfaceC0613y interfaceC0613y) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            this.f1770a.transact(5002, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2146a(InterfaceC0613y interfaceC0613y, int i, int i2, boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.f1770a.transact(5044, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2147a(InterfaceC0613y interfaceC0613y, int i, boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.f1770a.transact(5015, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2148a(InterfaceC0613y interfaceC0613y, long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeLong(j);
            this.f1770a.transact(5058, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2149a(InterfaceC0613y interfaceC0613y, Bundle bundle, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.f1770a.transact(5021, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2150a(InterfaceC0613y interfaceC0613y, IBinder iBinder, int i, String[] strArr, Bundle bundle, boolean z, long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i);
            parcelObtain.writeStringArray(strArr);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeLong(j);
            this.f1770a.transact(5030, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2151a(InterfaceC0613y interfaceC0613y, IBinder iBinder, String str, boolean z, long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeLong(j);
            this.f1770a.transact(5031, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2152a(InterfaceC0613y interfaceC0613y, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1770a.transact(5008, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2153a(InterfaceC0613y interfaceC0613y, String str, int i, int i2, int i3, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(5019, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2154a(InterfaceC0613y interfaceC0613y, String str, int i, IBinder iBinder, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1770a.transact(5025, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2155a(InterfaceC0613y interfaceC0613y, String str, int i, boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.f1770a.transact(5045, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2156a(InterfaceC0613y interfaceC0613y, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            parcelObtain.writeInt(z3 ? 1 : 0);
            parcelObtain.writeInt(z4 ? 1 : 0);
            this.f1770a.transact(6501, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2157a(InterfaceC0613y interfaceC0613y, String str, long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeLong(j);
            this.f1770a.transact(5016, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2158a(InterfaceC0613y interfaceC0613y, String str, IBinder iBinder, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongBinder(iBinder);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1770a.transact(5023, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2159a(InterfaceC0613y interfaceC0613y, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f1770a.transact(5009, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2160a(InterfaceC0613y interfaceC0613y, String str, String str2, int i, int i2, int i3, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(5039, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2161a(InterfaceC0613y interfaceC0613y, String str, String str2, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(6002, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2162a(InterfaceC0613y interfaceC0613y, String str, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(5054, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2163a(InterfaceC0613y interfaceC0613y, String str, boolean z, long[] jArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeLongArray(jArr);
            this.f1770a.transact(5011, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2164a(InterfaceC0613y interfaceC0613y, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(5063, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2165a(String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f1770a.transact(5028, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2166a(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f1770a.transact(5065, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2167a(String str, String str2, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            this.f1770a.transact(5051, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: a */
    public void mo2168a(boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(5068, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f1770a;
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public Bundle mo2169b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1770a.transact(5004, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public String mo2170b(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeString(str);
            this.f1770a.transact(5035, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2171b(long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeLong(j);
            this.f1770a.transact(5059, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2172b(InterfaceC0613y interfaceC0613y) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            this.f1770a.transact(5017, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2173b(InterfaceC0613y interfaceC0613y, int i, boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.f1770a.transact(5046, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2174b(InterfaceC0613y interfaceC0613y, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1770a.transact(5010, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2175b(InterfaceC0613y interfaceC0613y, String str, int i, int i2, int i3, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(5020, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2176b(InterfaceC0613y interfaceC0613y, String str, int i, boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.f1770a.transact(5501, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2177b(InterfaceC0613y interfaceC0613y, String str, IBinder iBinder, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongBinder(iBinder);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1770a.transact(5024, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2178b(InterfaceC0613y interfaceC0613y, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f1770a.transact(5038, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2179b(InterfaceC0613y interfaceC0613y, String str, String str2, int i, int i2, int i3, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(5040, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2180b(InterfaceC0613y interfaceC0613y, String str, String str2, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(6506, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2181b(InterfaceC0613y interfaceC0613y, String str, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(6502, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2182b(InterfaceC0613y interfaceC0613y, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(6001, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: b */
    public void mo2183b(String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f1770a.transact(5029, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: c */
    public void mo2184c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1770a.transact(5006, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: c */
    public void mo2185c(InterfaceC0613y interfaceC0613y) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            this.f1770a.transact(5022, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: c */
    public void mo2186c(InterfaceC0613y interfaceC0613y, int i, boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.f1770a.transact(5048, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: c */
    public void mo2187c(InterfaceC0613y interfaceC0613y, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1770a.transact(5014, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: c */
    public void mo2188c(InterfaceC0613y interfaceC0613y, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f1770a.transact(5041, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: c */
    public void mo2189c(InterfaceC0613y interfaceC0613y, String str, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(6504, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: c */
    public void mo2190c(InterfaceC0613y interfaceC0613y, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(6503, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: c */
    public void mo2191c(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeString(str);
            this.f1770a.transact(5050, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: c */
    public void mo2192c(String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f1770a.transact(5055, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: d */
    public int mo2193d(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeString(str);
            this.f1770a.transact(5060, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: d */
    public String mo2194d() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1770a.transact(5007, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: d */
    public void mo2195d(InterfaceC0613y interfaceC0613y) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            this.f1770a.transact(5026, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: d */
    public void mo2196d(InterfaceC0613y interfaceC0613y, int i, boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.f1770a.transact(6003, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: d */
    public void mo2197d(InterfaceC0613y interfaceC0613y, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1770a.transact(5018, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: d */
    public void mo2198d(InterfaceC0613y interfaceC0613y, String str, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1770a.transact(6505, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: e */
    public Uri mo2199e(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeString(str);
            this.f1770a.transact(5066, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: e */
    public String mo2200e() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1770a.transact(5012, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: e */
    public void mo2201e(InterfaceC0613y interfaceC0613y) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            this.f1770a.transact(5027, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: e */
    public void mo2202e(InterfaceC0613y interfaceC0613y, int i, boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.f1770a.transact(6004, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: e */
    public void mo2203e(InterfaceC0613y interfaceC0613y, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1770a.transact(5032, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: f */
    public C0452d mo2204f() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1770a.transact(5013, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: f */
    public void mo2205f(InterfaceC0613y interfaceC0613y) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            this.f1770a.transact(5047, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: f */
    public void mo2206f(InterfaceC0613y interfaceC0613y, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1770a.transact(5037, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: g */
    public void mo2207g(InterfaceC0613y interfaceC0613y) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            this.f1770a.transact(5049, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: g */
    public void mo2208g(InterfaceC0613y interfaceC0613y, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1770a.transact(5042, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: g */
    public boolean mo2209g() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1770a.transact(5067, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: h */
    public C0452d mo2210h() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            this.f1770a.transact(5502, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: h */
    public void mo2211h(InterfaceC0613y interfaceC0613y) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            this.f1770a.transact(5056, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: h */
    public void mo2212h(InterfaceC0613y interfaceC0613y, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1770a.transact(5043, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: i */
    public void mo2213i(InterfaceC0613y interfaceC0613y) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            this.f1770a.transact(5062, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: i */
    public void mo2214i(InterfaceC0613y interfaceC0613y, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1770a.transact(5052, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: j */
    public int mo2215j(InterfaceC0613y interfaceC0613y, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1770a.transact(5053, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: k */
    public void mo2216k(InterfaceC0613y interfaceC0613y, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1770a.transact(5061, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0496ad
    /* JADX INFO: renamed from: l */
    public void mo2217l(InterfaceC0613y interfaceC0613y, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            parcelObtain.writeStrongBinder(interfaceC0613y != null ? interfaceC0613y.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1770a.transact(5057, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
