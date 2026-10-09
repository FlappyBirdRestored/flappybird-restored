package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.C0452d;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

/* JADX INFO: renamed from: com.google.android.gms.internal.ac */
/* JADX INFO: loaded from: classes.dex */
class C0495ac implements InterfaceC0613y {

    /* JADX INFO: renamed from: a */
    private IBinder f1758a;

    C0495ac(IBinder iBinder) {
        this.f1758a = iBinder;
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: a */
    public void mo2095a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            this.f1758a.transact(5016, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: a */
    public void mo2096a(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcelObtain.writeInt(i);
            this.f1758a.transact(5013, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: a */
    public void mo2097a(int i, int i2, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str);
            this.f1758a.transact(5033, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: a */
    public void mo2098a(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            this.f1758a.transact(5001, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: a */
    public void mo2099a(int i, String str, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f1758a.transact(5034, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: a */
    public void mo2100a(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5002, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: a */
    public void mo2101a(C0452d c0452d, C0452d c0452d2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (c0452d2 != null) {
                parcelObtain.writeInt(1);
                c0452d2.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5005, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: a */
    public void mo2102a(C0452d c0452d, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStringArray(strArr);
            this.f1758a.transact(5026, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: a */
    public void mo2103a(RealTimeMessage realTimeMessage) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (realTimeMessage != null) {
                parcelObtain.writeInt(1);
                realTimeMessage.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5032, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: a */
    public void mo2104a(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcelObtain.writeString(str);
            this.f1758a.transact(6001, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f1758a;
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: b */
    public void mo2105b(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcelObtain.writeInt(i);
            this.f1758a.transact(5015, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: b */
    public void mo2106b(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            this.f1758a.transact(5003, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: b */
    public void mo2107b(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5004, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: b */
    public void mo2108b(C0452d c0452d, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStringArray(strArr);
            this.f1758a.transact(5027, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: b */
    public void mo2109b(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcelObtain.writeString(str);
            this.f1758a.transact(6002, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: c */
    public void mo2110c(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcelObtain.writeInt(i);
            this.f1758a.transact(5036, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: c */
    public void mo2111c(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            this.f1758a.transact(5020, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: c */
    public void mo2112c(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5006, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: c */
    public void mo2113c(C0452d c0452d, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStringArray(strArr);
            this.f1758a.transact(5028, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: d */
    public void mo2114d(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcelObtain.writeInt(i);
            this.f1758a.transact(5040, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: d */
    public void mo2115d(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5007, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: d */
    public void mo2116d(C0452d c0452d, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStringArray(strArr);
            this.f1758a.transact(5029, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: e */
    public void mo2117e(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5008, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: e */
    public void mo2118e(C0452d c0452d, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStringArray(strArr);
            this.f1758a.transact(5030, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: f */
    public void mo2119f(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5009, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: f */
    public void mo2120f(C0452d c0452d, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStringArray(strArr);
            this.f1758a.transact(5031, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: g */
    public void mo2121g(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5010, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: h */
    public void mo2122h(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5011, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: i */
    public void mo2123i(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5017, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: j */
    public void mo2124j(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5037, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: k */
    public void mo2125k(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5012, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: l */
    public void mo2126l(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5014, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: m */
    public void mo2127m(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5018, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: n */
    public void mo2128n(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5019, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: o */
    public void mo2129o(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5021, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: p */
    public void mo2130p(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5022, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: q */
    public void mo2131q(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5023, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: r */
    public void mo2132r(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5024, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: s */
    public void mo2133s(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5025, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: t */
    public void mo2134t(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5038, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: u */
    public void mo2135u(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5035, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: v */
    public void mo2136v(C0452d c0452d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (c0452d != null) {
                parcelObtain.writeInt(1);
                c0452d.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1758a.transact(5039, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
