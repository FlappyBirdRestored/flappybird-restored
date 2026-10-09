package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.cg */
/* JADX INFO: loaded from: classes.dex */
class C0553cg implements InterfaceC0551ce {

    /* JADX INFO: renamed from: a */
    private IBinder f1974a;

    C0553cg(IBinder iBinder) {
        this.f1974a = iBinder;
    }

    @Override // com.google.android.gms.internal.InterfaceC0551ce
    /* JADX INFO: renamed from: a */
    public int mo2589a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            this.f1974a.transact(5001, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0551ce
    /* JADX INFO: renamed from: a */
    public void mo2590a(InterfaceC0547ca interfaceC0547ca) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(interfaceC0547ca != null ? interfaceC0547ca.asBinder() : null);
            this.f1974a.transact(5005, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0551ce
    /* JADX INFO: renamed from: a */
    public void mo2591a(InterfaceC0547ca interfaceC0547ca, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(interfaceC0547ca != null ? interfaceC0547ca.asBinder() : null);
            parcelObtain.writeInt(i);
            this.f1974a.transact(5004, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0551ce
    /* JADX INFO: renamed from: a */
    public void mo2592a(InterfaceC0547ca interfaceC0547ca, int i, String str, byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(interfaceC0547ca != null ? interfaceC0547ca.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeByteArray(bArr);
            this.f1974a.transact(5006, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0551ce
    /* JADX INFO: renamed from: a */
    public void mo2593a(InterfaceC0547ca interfaceC0547ca, int i, byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(interfaceC0547ca != null ? interfaceC0547ca.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeByteArray(bArr);
            this.f1974a.transact(5003, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f1974a;
    }

    @Override // com.google.android.gms.internal.InterfaceC0551ce
    /* JADX INFO: renamed from: b */
    public int mo2594b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            this.f1974a.transact(5002, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0551ce
    /* JADX INFO: renamed from: b */
    public void mo2595b(InterfaceC0547ca interfaceC0547ca) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(interfaceC0547ca != null ? interfaceC0547ca.asBinder() : null);
            this.f1974a.transact(5008, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0551ce
    /* JADX INFO: renamed from: b */
    public void mo2596b(InterfaceC0547ca interfaceC0547ca, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(interfaceC0547ca != null ? interfaceC0547ca.asBinder() : null);
            parcelObtain.writeInt(i);
            this.f1974a.transact(5007, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0551ce
    /* JADX INFO: renamed from: c */
    public void mo2597c(InterfaceC0547ca interfaceC0547ca) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            parcelObtain.writeStrongBinder(interfaceC0547ca != null ? interfaceC0547ca.asBinder() : null);
            this.f1974a.transact(5009, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
