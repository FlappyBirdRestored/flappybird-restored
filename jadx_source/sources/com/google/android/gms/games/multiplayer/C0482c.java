package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.PlayerEntity;

/* JADX INFO: renamed from: com.google.android.gms.games.multiplayer.c */
/* JADX INFO: loaded from: classes.dex */
final class C0482c extends C0486g {
    C0482c() {
    }

    @Override // com.google.android.gms.games.multiplayer.C0486g, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        if (ParticipantEntity.m2307b(ParticipantEntity.m2740u()) || ParticipantEntity.m2738b(ParticipantEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        Uri uri = string3 == null ? null : Uri.parse(string3);
        String string4 = parcel.readString();
        return new ParticipantEntity(1, string, string2, uri, string4 == null ? null : Uri.parse(string4), parcel.readInt(), parcel.readString(), parcel.readInt() > 0, parcel.readInt() > 0 ? (PlayerEntity) PlayerEntity.CREATOR.createFromParcel(parcel) : null, 7);
    }
}
