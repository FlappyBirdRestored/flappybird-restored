package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import com.google.android.gms.games.PlayerEntity;

/* JADX INFO: renamed from: com.google.android.gms.games.multiplayer.g */
/* JADX INFO: loaded from: classes.dex */
public class C0486g implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m2058a(ParticipantEntity participantEntity, Parcel parcel, int i) {
        int iM1941a = C0465c.m1941a(parcel);
        C0465c.m1952a(parcel, 1, participantEntity.mo2042i(), false);
        C0465c.m1946a(parcel, 1000, participantEntity.m2050k());
        C0465c.m1952a(parcel, 2, participantEntity.mo2039f(), false);
        C0465c.m1951a(parcel, 3, (Parcelable) participantEntity.mo2040g(), i, false);
        C0465c.m1951a(parcel, 4, (Parcelable) participantEntity.mo2041h(), i, false);
        C0465c.m1946a(parcel, 5, participantEntity.mo2035b());
        C0465c.m1952a(parcel, 6, participantEntity.mo2036c(), false);
        C0465c.m1955a(parcel, 7, participantEntity.mo2038e());
        C0465c.m1951a(parcel, 8, (Parcelable) participantEntity.mo2043j(), i, false);
        C0465c.m1946a(parcel, 9, participantEntity.mo2037d());
        C0465c.m1942a(parcel, iM1941a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        int iM1920f = 0;
        PlayerEntity playerEntity = null;
        int iM1913b = C0463a.m1913b(parcel);
        boolean zM1917c = false;
        String strM1926l = null;
        int iM1920f2 = 0;
        Uri uri = null;
        Uri uri2 = null;
        String strM1926l2 = null;
        String strM1926l3 = null;
        int iM1920f3 = 0;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            switch (C0463a.m1907a(iM1908a)) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    strM1926l3 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    strM1926l2 = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    uri2 = (Uri) C0463a.m1910a(parcel, iM1908a, Uri.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    uri = (Uri) C0463a.m1910a(parcel, iM1908a, Uri.CREATOR);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    iM1920f2 = C0463a.m1920f(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    strM1926l = C0463a.m1926l(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    zM1917c = C0463a.m1917c(parcel, iM1908a);
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    playerEntity = (PlayerEntity) C0463a.m1910a(parcel, iM1908a, PlayerEntity.CREATOR);
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
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
        return new ParticipantEntity(iM1920f3, strM1926l3, strM1926l2, uri2, uri, iM1920f2, strM1926l, zM1917c, playerEntity, iM1920f);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParticipantEntity[] newArray(int i) {
        return new ParticipantEntity[i];
    }
}
