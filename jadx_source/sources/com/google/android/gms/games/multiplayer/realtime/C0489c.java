package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC0450b;
import com.google.android.gms.games.multiplayer.C0483d;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.games.multiplayer.realtime.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0489c extends AbstractC0450b implements Room {

    /* JADX INFO: renamed from: c */
    private final int f1750c;

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: b */
    public String mo2060b() {
        return m1847d("external_match_id");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: c */
    public String mo2061c() {
        return m1847d("creator_external");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: d */
    public long mo2062d() {
        return m1844a("creation_timestamp");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: e */
    public int mo2063e() {
        return m1845b("status");
    }

    @Override // com.google.android.gms.common.data.AbstractC0450b
    public boolean equals(Object obj) {
        return RoomEntity.m2069a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: f */
    public String mo2064f() {
        return m1847d("description");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: g */
    public int mo2065g() {
        return m1845b("variant");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: h */
    public Bundle mo2066h() {
        if (m1846c("has_automatch_criteria")) {
            return C0488b.m2078a(m1845b("automatch_min_players"), m1845b("automatch_max_players"), m1844a("automatch_bit_mask"));
        }
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractC0450b
    public int hashCode() {
        return RoomEntity.m2068a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.InterfaceC0484e
    /* JADX INFO: renamed from: i */
    public ArrayList mo2033i() {
        ArrayList arrayList = new ArrayList(this.f1750c);
        for (int i = 0; i < this.f1750c; i++) {
            arrayList.add(new C0483d(this.f1611a, this.f1612b + i));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: j */
    public int mo2067j() {
        return m1845b("automatch_wait_estimate_sec");
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Room mo1843a() {
        return new RoomEntity(this);
    }

    public String toString() {
        return RoomEntity.m2072b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((RoomEntity) mo1843a()).writeToParcel(parcel, i);
    }
}
