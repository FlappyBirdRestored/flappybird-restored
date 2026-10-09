package android.support.v4.p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: android.support.v4.a.b */
/* JADX INFO: loaded from: classes.dex */
class C0001b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    final InterfaceC0002c f0a;

    public C0001b(InterfaceC0002c interfaceC0002c) {
        this.f0a = interfaceC0002c;
    }

    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return this.f0a.mo1a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return this.f0a.mo2a(i);
    }
}
