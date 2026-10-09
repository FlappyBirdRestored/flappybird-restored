package android.support.v4.p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: android.support.v4.a.d */
/* JADX INFO: loaded from: classes.dex */
class C0003d implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0002c f1a;

    public C0003d(InterfaceC0002c interfaceC0002c) {
        this.f1a = interfaceC0002c;
    }

    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return this.f1a.mo1a(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f1a.mo1a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return this.f1a.mo2a(i);
    }
}
