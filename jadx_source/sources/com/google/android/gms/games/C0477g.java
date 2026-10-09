package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.games.g */
/* JADX INFO: loaded from: classes.dex */
final class C0477g extends C0479i {
    C0477g() {
    }

    @Override // com.google.android.gms.games.C0479i, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a */
    public PlayerEntity createFromParcel(Parcel parcel) {
        if (PlayerEntity.m2307b(PlayerEntity.m2740u()) || PlayerEntity.m2738b(PlayerEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        return new PlayerEntity(1, string, string2, string3 == null ? null : Uri.parse(string3), string4 != null ? Uri.parse(string4) : null, parcel.readLong());
    }
}
