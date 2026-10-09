package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC0450b;
import com.google.android.gms.common.data.C0452d;
import com.google.android.gms.games.C0474d;
import com.google.android.gms.games.Player;

/* JADX INFO: renamed from: com.google.android.gms.games.multiplayer.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0483d extends AbstractC0450b implements Participant {

    /* JADX INFO: renamed from: c */
    private final C0474d f1736c;

    public C0483d(C0452d c0452d, int i) {
        super(c0452d, i);
        this.f1736c = new C0474d(c0452d, i);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: b */
    public int mo2035b() {
        return m1845b("player_status");
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: c */
    public String mo2036c() {
        return m1847d("client_address");
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: d */
    public int mo2037d() {
        return m1845b("capabilities");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: e */
    public boolean mo2038e() {
        return m1845b("connected") > 0;
    }

    @Override // com.google.android.gms.common.data.AbstractC0450b
    public boolean equals(Object obj) {
        return ParticipantEntity.m2045a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: f */
    public String mo2039f() {
        return m1849f("external_player_id") ? m1847d("default_display_name") : this.f1736c.mo1989c();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: g */
    public Uri mo2040g() {
        return m1849f("external_player_id") ? m1848e("default_display_image_uri") : this.f1736c.mo1990d();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: h */
    public Uri mo2041h() {
        if (m1849f("external_player_id")) {
            return null;
        }
        return this.f1736c.mo1991e();
    }

    @Override // com.google.android.gms.common.data.AbstractC0450b
    public int hashCode() {
        return ParticipantEntity.m2044a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: i */
    public String mo2042i() {
        return m1847d("external_participant_id");
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: j */
    public Player mo2043j() {
        if (m1849f("external_player_id")) {
            return null;
        }
        return this.f1736c;
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Participant mo1843a() {
        return new ParticipantEntity(this);
    }

    public String toString() {
        return ParticipantEntity.m2048b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((ParticipantEntity) mo1843a()).writeToParcel(parcel, i);
    }
}
