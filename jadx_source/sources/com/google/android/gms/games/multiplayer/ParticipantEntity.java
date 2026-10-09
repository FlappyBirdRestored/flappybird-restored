package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.AbstractC0514av;
import com.google.android.gms.internal.C0585dl;

/* JADX INFO: loaded from: classes.dex */
public final class ParticipantEntity extends AbstractC0514av implements Participant {
    public static final Parcelable.Creator CREATOR = new C0482c();

    /* JADX INFO: renamed from: a */
    private final int f1723a;

    /* JADX INFO: renamed from: b */
    private final String f1724b;

    /* JADX INFO: renamed from: c */
    private final String f1725c;

    /* JADX INFO: renamed from: d */
    private final Uri f1726d;

    /* JADX INFO: renamed from: e */
    private final Uri f1727e;

    /* JADX INFO: renamed from: f */
    private final int f1728f;

    /* JADX INFO: renamed from: g */
    private final String f1729g;

    /* JADX INFO: renamed from: h */
    private final boolean f1730h;

    /* JADX INFO: renamed from: i */
    private final PlayerEntity f1731i;

    /* JADX INFO: renamed from: j */
    private final int f1732j;

    ParticipantEntity(int i, String str, String str2, Uri uri, Uri uri2, int i2, String str3, boolean z, PlayerEntity playerEntity, int i3) {
        this.f1723a = i;
        this.f1724b = str;
        this.f1725c = str2;
        this.f1726d = uri;
        this.f1727e = uri2;
        this.f1728f = i2;
        this.f1729g = str3;
        this.f1730h = z;
        this.f1731i = playerEntity;
        this.f1732j = i3;
    }

    public ParticipantEntity(Participant participant) {
        this.f1723a = 1;
        this.f1724b = participant.mo2042i();
        this.f1725c = participant.mo2039f();
        this.f1726d = participant.mo2040g();
        this.f1727e = participant.mo2041h();
        this.f1728f = participant.mo2035b();
        this.f1729g = participant.mo2036c();
        this.f1730h = participant.mo2038e();
        Player playerMo2043j = participant.mo2043j();
        this.f1731i = playerMo2043j == null ? null : new PlayerEntity(playerMo2043j);
        this.f1732j = participant.mo2037d();
    }

    /* JADX INFO: renamed from: a */
    static int m2044a(Participant participant) {
        return C0585dl.m2700a(participant.mo2043j(), Integer.valueOf(participant.mo2035b()), participant.mo2036c(), Boolean.valueOf(participant.mo2038e()), participant.mo2039f(), participant.mo2040g(), participant.mo2041h(), Integer.valueOf(participant.mo2037d()));
    }

    /* JADX INFO: renamed from: a */
    static boolean m2045a(Participant participant, Object obj) {
        if (!(obj instanceof Participant)) {
            return false;
        }
        if (participant == obj) {
            return true;
        }
        Participant participant2 = (Participant) obj;
        return C0585dl.m2702a(participant2.mo2043j(), participant.mo2043j()) && C0585dl.m2702a(Integer.valueOf(participant2.mo2035b()), Integer.valueOf(participant.mo2035b())) && C0585dl.m2702a(participant2.mo2036c(), participant.mo2036c()) && C0585dl.m2702a(Boolean.valueOf(participant2.mo2038e()), Boolean.valueOf(participant.mo2038e())) && C0585dl.m2702a(participant2.mo2039f(), participant.mo2039f()) && C0585dl.m2702a(participant2.mo2040g(), participant.mo2040g()) && C0585dl.m2702a(participant2.mo2041h(), participant.mo2041h()) && C0585dl.m2702a(Integer.valueOf(participant2.mo2037d()), Integer.valueOf(participant.mo2037d()));
    }

    /* JADX INFO: renamed from: b */
    static String m2048b(Participant participant) {
        return C0585dl.m2701a(participant).m2703a("Player", participant.mo2043j()).m2703a("Status", Integer.valueOf(participant.mo2035b())).m2703a("ClientAddress", participant.mo2036c()).m2703a("ConnectedToRoom", Boolean.valueOf(participant.mo2038e())).m2703a("DisplayName", participant.mo2039f()).m2703a("IconImage", participant.mo2040g()).m2703a("HiResImage", participant.mo2041h()).m2703a("Capabilities", Integer.valueOf(participant.mo2037d())).toString();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: b */
    public int mo2035b() {
        return this.f1728f;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: c */
    public String mo2036c() {
        return this.f1729g;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: d */
    public int mo2037d() {
        return this.f1732j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: e */
    public boolean mo2038e() {
        return this.f1730h;
    }

    public boolean equals(Object obj) {
        return m2045a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: f */
    public String mo2039f() {
        return this.f1731i == null ? this.f1725c : this.f1731i.mo1989c();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: g */
    public Uri mo2040g() {
        return this.f1731i == null ? this.f1726d : this.f1731i.mo1990d();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: h */
    public Uri mo2041h() {
        return this.f1731i == null ? this.f1727e : this.f1731i.mo1991e();
    }

    public int hashCode() {
        return m2044a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: i */
    public String mo2042i() {
        return this.f1724b;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* JADX INFO: renamed from: j */
    public Player mo2043j() {
        return this.f1731i;
    }

    /* JADX INFO: renamed from: k */
    public int m2050k() {
        return this.f1723a;
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Participant mo1843a() {
        return this;
    }

    public String toString() {
        return m2048b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!m2741v()) {
            C0486g.m2058a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f1724b);
        parcel.writeString(this.f1725c);
        parcel.writeString(this.f1726d == null ? null : this.f1726d.toString());
        parcel.writeString(this.f1727e != null ? this.f1727e.toString() : null);
        parcel.writeInt(this.f1728f);
        parcel.writeString(this.f1729g);
        parcel.writeInt(this.f1730h ? 1 : 0);
        parcel.writeInt(this.f1731i != null ? 1 : 0);
        if (this.f1731i != null) {
            this.f1731i.writeToParcel(parcel, i);
        }
    }
}
