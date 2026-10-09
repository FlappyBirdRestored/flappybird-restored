package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.analytics.internal.a */
/* JADX INFO: loaded from: classes.dex */
final class C0431a implements Parcelable.Creator {
    C0431a() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Command createFromParcel(Parcel parcel) {
        return new Command(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Command[] newArray(int i) {
        return new Command[i];
    }
}
