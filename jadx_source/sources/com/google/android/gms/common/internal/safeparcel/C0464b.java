package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.safeparcel.b */
/* JADX INFO: loaded from: classes.dex */
public class C0464b extends RuntimeException {
    public C0464b(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
