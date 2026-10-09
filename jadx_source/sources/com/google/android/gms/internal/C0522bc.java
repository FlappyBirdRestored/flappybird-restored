package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.bc */
/* JADX INFO: loaded from: classes.dex */
class C0522bc implements InterfaceC0520ba {

    /* JADX INFO: renamed from: a */
    private IBinder f1803a;

    C0522bc(IBinder iBinder) {
        this.f1803a = iBinder;
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public String mo2315a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            this.f1803a.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2316a(C0503ak c0503ak) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            if (c0503ak != null) {
                parcelObtain.writeInt(1);
                c0503ak.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1803a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2317a(InterfaceC0509aq interfaceC0509aq) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            this.f1803a.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2318a(InterfaceC0509aq interfaceC0509aq, int i, int i2, int i3, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeString(str);
            this.f1803a.transact(16, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2319a(InterfaceC0509aq interfaceC0509aq, int i, int i2, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str);
            this.f1803a.transact(39, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2320a(InterfaceC0509aq interfaceC0509aq, int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            this.f1803a.transact(20, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2321a(InterfaceC0509aq interfaceC0509aq, int i, String str, Uri uri, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str2);
            this.f1803a.transact(32, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2322a(InterfaceC0509aq interfaceC0509aq, int i, String str, Uri uri, String str2, String str3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str2);
            parcelObtain.writeString(str3);
            this.f1803a.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2323a(InterfaceC0509aq interfaceC0509aq, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1803a.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2324a(InterfaceC0509aq interfaceC0509aq, C0561co c0561co) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            if (c0561co != null) {
                parcelObtain.writeInt(1);
                c0561co.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1803a.transact(30, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2325a(InterfaceC0509aq interfaceC0509aq, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1803a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2326a(InterfaceC0509aq interfaceC0509aq, String str, int i, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            this.f1803a.transact(36, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2327a(InterfaceC0509aq interfaceC0509aq, String str, C0541bv c0541bv) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            if (c0541bv != null) {
                parcelObtain.writeInt(1);
                c0541bv.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1803a.transact(25, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2328a(InterfaceC0509aq interfaceC0509aq, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f1803a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2329a(InterfaceC0509aq interfaceC0509aq, String str, String str2, int i, String str3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str3);
            this.f1803a.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2330a(InterfaceC0509aq interfaceC0509aq, String str, String str2, boolean z, String str3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeString(str3);
            this.f1803a.transact(37, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2331a(InterfaceC0509aq interfaceC0509aq, String str, List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeTypedList(list);
            this.f1803a.transact(28, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2332a(InterfaceC0509aq interfaceC0509aq, String str, List list, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeTypedList(list);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1803a.transact(31, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2333a(InterfaceC0509aq interfaceC0509aq, String str, List list, List list2, List list3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeStringList(list);
            parcelObtain.writeStringList(list2);
            parcelObtain.writeStringList(list3);
            this.f1803a.transact(23, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2334a(InterfaceC0509aq interfaceC0509aq, String str, List list, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeTypedList(list);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1803a.transact(29, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2335a(InterfaceC0509aq interfaceC0509aq, String str, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1803a.transact(21, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2336a(InterfaceC0509aq interfaceC0509aq, String str, boolean z, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeString(str2);
            this.f1803a.transact(27, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2337a(InterfaceC0509aq interfaceC0509aq, List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeStringList(list);
            this.f1803a.transact(34, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2338a(InterfaceC0509aq interfaceC0509aq, boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.f1803a.transact(22, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2339a(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeString(str);
            this.f1803a.transact(17, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: a */
    public void mo2340a(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f1803a.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f1803a;
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: b */
    public void mo2341b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            this.f1803a.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: b */
    public void mo2342b(InterfaceC0509aq interfaceC0509aq) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            this.f1803a.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: b */
    public void mo2343b(InterfaceC0509aq interfaceC0509aq, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1803a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: c */
    public void mo2344c(InterfaceC0509aq interfaceC0509aq) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            this.f1803a.transact(19, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: c */
    public void mo2345c(InterfaceC0509aq interfaceC0509aq, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1803a.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: d */
    public void mo2346d(InterfaceC0509aq interfaceC0509aq) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            this.f1803a.transact(38, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: d */
    public void mo2347d(InterfaceC0509aq interfaceC0509aq, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1803a.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: e */
    public void mo2348e(InterfaceC0509aq interfaceC0509aq, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1803a.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: f */
    public void mo2349f(InterfaceC0509aq interfaceC0509aq, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1803a.transact(24, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: g */
    public void mo2350g(InterfaceC0509aq interfaceC0509aq, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1803a.transact(26, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: h */
    public void mo2351h(InterfaceC0509aq interfaceC0509aq, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1803a.transact(33, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0520ba
    /* JADX INFO: renamed from: i */
    public void mo2352i(InterfaceC0509aq interfaceC0509aq, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
            parcelObtain.writeStrongBinder(interfaceC0509aq != null ? interfaceC0509aq.asBinder() : null);
            parcelObtain.writeString(str);
            this.f1803a.transact(35, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
