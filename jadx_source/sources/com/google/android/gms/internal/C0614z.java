package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.z */
/* JADX INFO: loaded from: classes.dex */
public class C0614z implements SafeParcelable {
    public static final C0492a CREATOR = new C0492a();

    /* JADX INFO: renamed from: a */
    private final int f2099a;

    /* JADX INFO: renamed from: b */
    private final C0494ab f2100b;

    C0614z(int i, C0494ab c0494ab) {
        this.f2099a = i;
        this.f2100b = c0494ab;
    }

    private C0614z(C0494ab c0494ab) {
        this.f2099a = 1;
        this.f2100b = c0494ab;
    }

    /* JADX INFO: renamed from: a */
    public static C0614z m2787a(InterfaceC0573d interfaceC0573d) {
        if (interfaceC0573d instanceof C0494ab) {
            return new C0614z((C0494ab) interfaceC0573d);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* JADX INFO: renamed from: a */
    int m2788a() {
        return this.f2099a;
    }

    /* JADX INFO: renamed from: b */
    C0494ab m2789b() {
        return this.f2100b;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0573d m2790c() {
        if (this.f2100b != null) {
            return this.f2100b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        C0492a c0492a = CREATOR;
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0492a c0492a = CREATOR;
        C0492a.m2083a(this, parcel, i);
    }
}
