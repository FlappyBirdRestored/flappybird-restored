package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.games.multiplayer.f */
/* JADX INFO: loaded from: classes.dex */
public class C0485f implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2056a(InvitationEntity invitationEntity, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1951a(parcel, 1, (Parcelable) invitationEntity.mo2020b(), i, false);
        C0465c.m1946a(parcel, 1000, invitationEntity.m2032h());
        C0465c.m1952a(parcel, 2, invitationEntity.mo2021c(), false);
        C0465c.m1947a(parcel, 3, invitationEntity.mo2023e());
        C0465c.m1946a(parcel, 4, invitationEntity.mo2024f());
        C0465c.m1951a(parcel, 5, (Parcelable) invitationEntity.mo2022d(), i, false);
        C0465c.m1962b(parcel, 6, invitationEntity.mo2033i(), false);
        C0465c.m1946a(parcel, 7, invitationEntity.mo2025g());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvitationEntity createFromParcel(Parcel parcel) {
        int iM1920f = 0;
        ArrayList arrayListM1916c = null;
        int iM1913b = C0463a.m1913b(parcel);
        long jM1921g = 0;
        ParticipantEntity participantEntity = null;
        int iM1920f2 = 0;
        String strM1926l = null;
        GameEntity gameEntity = null;
        int iM1920f3 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    gameEntity = (GameEntity) C0463a.m1910a(parcel, iM1908a, GameEntity.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    jM1921g = C0463a.m1921g(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    participantEntity = (ParticipantEntity) C0463a.m1910a(parcel, iM1908a, ParticipantEntity.CREATOR);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    arrayListM1916c = C0463a.m1916c(parcel, iM1908a, ParticipantEntity.CREATOR);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    iM1920f = C0463a.m1920f(parcel, iM1908a);
                    break;
                case 1000:
                    iM1920f3 = C0463a.m1920f(parcel, iM1908a);
                    break;
                default:
                    C0463a.m1914b(parcel, iM1908a);
                    break;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        return new InvitationEntity(iM1920f3, gameEntity, strM1926l, jM1921g, iM1920f2, participantEntity, arrayListM1916c, iM1920f);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvitationEntity[] newArray(int i) {
        return new InvitationEntity[i];
    }
}
