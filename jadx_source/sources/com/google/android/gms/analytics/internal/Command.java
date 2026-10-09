package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class Command implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0431a();

    /* JADX INFO: renamed from: a */
    private String f1592a;

    /* JADX INFO: renamed from: b */
    private String f1593b;

    /* JADX INFO: renamed from: c */
    private String f1594c;

    public Command() {
    }

    Command(Parcel parcel) {
        m1818a(parcel);
    }

    /* JADX INFO: renamed from: a */
    private void m1818a(Parcel parcel) {
        this.f1592a = parcel.readString();
        this.f1593b = parcel.readString();
        this.f1594c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1592a);
        parcel.writeString(this.f1593b);
        parcel.writeString(this.f1594c);
    }
}
