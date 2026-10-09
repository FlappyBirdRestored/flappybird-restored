package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.games.multiplayer.a */
/* JADX INFO: loaded from: classes.dex */
final class C0480a extends C0485f {
    C0480a() {
    }

    @Override // com.google.android.gms.games.multiplayer.C0485f, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a */
    public InvitationEntity createFromParcel(Parcel parcel) {
        if (InvitationEntity.m2307b(InvitationEntity.m2740u()) || InvitationEntity.m2738b(InvitationEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
        String string = parcel.readString();
        long j = parcel.readLong();
        int i = parcel.readInt();
        ParticipantEntity participantEntity = (ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel);
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }
        return new InvitationEntity(1, gameEntity, string, j, i, participantEntity, arrayList, -1);
    }
}
