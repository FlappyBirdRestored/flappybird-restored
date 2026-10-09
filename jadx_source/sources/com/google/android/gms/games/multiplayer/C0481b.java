package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC0450b;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.games.multiplayer.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0481b extends AbstractC0450b implements Invitation {

    /* JADX INFO: renamed from: c */
    private final Game f1733c;

    /* JADX INFO: renamed from: d */
    private final C0483d f1734d;

    /* JADX INFO: renamed from: e */
    private final ArrayList f1735e;

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* JADX INFO: renamed from: b */
    public Game mo2020b() {
        return this.f1733c;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* JADX INFO: renamed from: c */
    public String mo2021c() {
        return m1847d("external_invitation_id");
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* JADX INFO: renamed from: d */
    public Participant mo2022d() {
        return this.f1734d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* JADX INFO: renamed from: e */
    public long mo2023e() {
        return m1844a("creation_timestamp");
    }

    @Override // com.google.android.gms.common.data.AbstractC0450b
    public boolean equals(Object obj) {
        return InvitationEntity.m2027a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* JADX INFO: renamed from: f */
    public int mo2024f() {
        return m1845b("type");
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* JADX INFO: renamed from: g */
    public int mo2025g() {
        return m1845b("variant");
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Invitation mo1843a() {
        return new InvitationEntity(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC0450b
    public int hashCode() {
        return InvitationEntity.m2026a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.InterfaceC0484e
    /* JADX INFO: renamed from: i */
    public ArrayList mo2033i() {
        return this.f1735e;
    }

    public String toString() {
        return InvitationEntity.m2030b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((InvitationEntity) mo1843a()).writeToParcel(parcel, i);
    }
}
