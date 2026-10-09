package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.AbstractC0514av;
import com.google.android.gms.internal.C0585dl;
import com.google.android.gms.internal.C0588do;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class InvitationEntity extends AbstractC0514av implements Invitation {
    public static final Parcelable.Creator CREATOR = new C0480a();

    /* JADX INFO: renamed from: a */
    private final int f1715a;

    /* JADX INFO: renamed from: b */
    private final GameEntity f1716b;

    /* JADX INFO: renamed from: c */
    private final String f1717c;

    /* JADX INFO: renamed from: d */
    private final long f1718d;

    /* JADX INFO: renamed from: e */
    private final int f1719e;

    /* JADX INFO: renamed from: f */
    private final ParticipantEntity f1720f;

    /* JADX INFO: renamed from: g */
    private final ArrayList f1721g;

    /* JADX INFO: renamed from: h */
    private final int f1722h;

    InvitationEntity(int i, GameEntity gameEntity, String str, long j, int i2, ParticipantEntity participantEntity, ArrayList arrayList, int i3) {
        this.f1715a = i;
        this.f1716b = gameEntity;
        this.f1717c = str;
        this.f1718d = j;
        this.f1719e = i2;
        this.f1720f = participantEntity;
        this.f1721g = arrayList;
        this.f1722h = i3;
    }

    InvitationEntity(Invitation invitation) {
        this.f1715a = 1;
        this.f1716b = new GameEntity(invitation.mo2020b());
        this.f1717c = invitation.mo2021c();
        this.f1718d = invitation.mo2023e();
        this.f1719e = invitation.mo2024f();
        this.f1722h = invitation.mo2025g();
        String strMo2042i = invitation.mo2022d().mo2042i();
        Participant participant = null;
        ArrayList arrayListI = invitation.mo2033i();
        int size = arrayListI.size();
        this.f1721g = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Participant participant2 = (Participant) arrayListI.get(i);
            if (participant2.mo2042i().equals(strMo2042i)) {
                participant = participant2;
            }
            this.f1721g.add((ParticipantEntity) participant2.mo1843a());
        }
        C0588do.m2705a(participant, "Must have a valid inviter!");
        this.f1720f = (ParticipantEntity) participant.mo1843a();
    }

    /* JADX INFO: renamed from: a */
    static int m2026a(Invitation invitation) {
        return C0585dl.m2700a(invitation.mo2020b(), invitation.mo2021c(), Long.valueOf(invitation.mo2023e()), Integer.valueOf(invitation.mo2024f()), invitation.mo2022d(), invitation.mo2033i(), Integer.valueOf(invitation.mo2025g()));
    }

    /* JADX INFO: renamed from: a */
    static boolean m2027a(Invitation invitation, Object obj) {
        if (!(obj instanceof Invitation)) {
            return false;
        }
        if (invitation == obj) {
            return true;
        }
        Invitation invitation2 = (Invitation) obj;
        return C0585dl.m2702a(invitation2.mo2020b(), invitation.mo2020b()) && C0585dl.m2702a(invitation2.mo2021c(), invitation.mo2021c()) && C0585dl.m2702a(Long.valueOf(invitation2.mo2023e()), Long.valueOf(invitation.mo2023e())) && C0585dl.m2702a(Integer.valueOf(invitation2.mo2024f()), Integer.valueOf(invitation.mo2024f())) && C0585dl.m2702a(invitation2.mo2022d(), invitation.mo2022d()) && C0585dl.m2702a(invitation2.mo2033i(), invitation.mo2033i()) && C0585dl.m2702a(Integer.valueOf(invitation2.mo2025g()), Integer.valueOf(invitation.mo2025g()));
    }

    /* JADX INFO: renamed from: b */
    static String m2030b(Invitation invitation) {
        return C0585dl.m2701a(invitation).m2703a("Game", invitation.mo2020b()).m2703a("InvitationId", invitation.mo2021c()).m2703a("CreationTimestamp", Long.valueOf(invitation.mo2023e())).m2703a("InvitationType", Integer.valueOf(invitation.mo2024f())).m2703a("Inviter", invitation.mo2022d()).m2703a("Participants", invitation.mo2033i()).m2703a("Variant", Integer.valueOf(invitation.mo2025g())).toString();
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* JADX INFO: renamed from: b */
    public Game mo2020b() {
        return this.f1716b;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* JADX INFO: renamed from: c */
    public String mo2021c() {
        return this.f1717c;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* JADX INFO: renamed from: d */
    public Participant mo2022d() {
        return this.f1720f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* JADX INFO: renamed from: e */
    public long mo2023e() {
        return this.f1718d;
    }

    public boolean equals(Object obj) {
        return m2027a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* JADX INFO: renamed from: f */
    public int mo2024f() {
        return this.f1719e;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* JADX INFO: renamed from: g */
    public int mo2025g() {
        return this.f1722h;
    }

    /* JADX INFO: renamed from: h */
    public int m2032h() {
        return this.f1715a;
    }

    public int hashCode() {
        return m2026a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.InterfaceC0484e
    /* JADX INFO: renamed from: i */
    public ArrayList mo2033i() {
        return new ArrayList(this.f1721g);
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Invitation mo1843a() {
        return this;
    }

    public String toString() {
        return m2030b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!m2741v()) {
            C0485f.m2056a(this, parcel, i);
            return;
        }
        this.f1716b.writeToParcel(parcel, i);
        parcel.writeString(this.f1717c);
        parcel.writeLong(this.f1718d);
        parcel.writeInt(this.f1719e);
        this.f1720f.writeToParcel(parcel, i);
        int size = this.f1721g.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((ParticipantEntity) this.f1721g.get(i2)).writeToParcel(parcel, i);
        }
    }
}
