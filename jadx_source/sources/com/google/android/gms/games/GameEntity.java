package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC0514av;
import com.google.android.gms.internal.C0585dl;

/* JADX INFO: loaded from: classes.dex */
public final class GameEntity extends AbstractC0514av implements Game {
    public static final Parcelable.Creator CREATOR = new C0468a();

    /* JADX INFO: renamed from: a */
    private final int f1676a;

    /* JADX INFO: renamed from: b */
    private final String f1677b;

    /* JADX INFO: renamed from: c */
    private final String f1678c;

    /* JADX INFO: renamed from: d */
    private final String f1679d;

    /* JADX INFO: renamed from: e */
    private final String f1680e;

    /* JADX INFO: renamed from: f */
    private final String f1681f;

    /* JADX INFO: renamed from: g */
    private final String f1682g;

    /* JADX INFO: renamed from: h */
    private final Uri f1683h;

    /* JADX INFO: renamed from: i */
    private final Uri f1684i;

    /* JADX INFO: renamed from: j */
    private final Uri f1685j;

    /* JADX INFO: renamed from: k */
    private final boolean f1686k;

    /* JADX INFO: renamed from: l */
    private final boolean f1687l;

    /* JADX INFO: renamed from: m */
    private final String f1688m;

    /* JADX INFO: renamed from: n */
    private final int f1689n;

    /* JADX INFO: renamed from: o */
    private final int f1690o;

    /* JADX INFO: renamed from: p */
    private final int f1691p;

    GameEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i2, int i3, int i4) {
        this.f1676a = i;
        this.f1677b = str;
        this.f1678c = str2;
        this.f1679d = str3;
        this.f1680e = str4;
        this.f1681f = str5;
        this.f1682g = str6;
        this.f1683h = uri;
        this.f1684i = uri2;
        this.f1685j = uri3;
        this.f1686k = z;
        this.f1687l = z2;
        this.f1688m = str7;
        this.f1689n = i2;
        this.f1690o = i3;
        this.f1691p = i4;
    }

    public GameEntity(Game game) {
        this.f1676a = 1;
        this.f1677b = game.mo1965b();
        this.f1679d = game.mo1967d();
        this.f1680e = game.mo1968e();
        this.f1681f = game.mo1969f();
        this.f1682g = game.mo1970g();
        this.f1678c = game.mo1966c();
        this.f1683h = game.mo1971h();
        this.f1684i = game.mo1972i();
        this.f1685j = game.mo1973j();
        this.f1686k = game.mo1974k();
        this.f1687l = game.mo1975l();
        this.f1688m = game.mo1976m();
        this.f1689n = game.mo1977n();
        this.f1690o = game.mo1978o();
        this.f1691p = game.mo1979p();
    }

    /* JADX INFO: renamed from: a */
    static int m1980a(Game game) {
        return C0585dl.m2700a(game.mo1965b(), game.mo1966c(), game.mo1967d(), game.mo1968e(), game.mo1969f(), game.mo1970g(), game.mo1971h(), game.mo1972i(), game.mo1973j(), Boolean.valueOf(game.mo1974k()), Boolean.valueOf(game.mo1975l()), game.mo1976m(), Integer.valueOf(game.mo1977n()), Integer.valueOf(game.mo1978o()), Integer.valueOf(game.mo1979p()));
    }

    /* JADX INFO: renamed from: a */
    static boolean m1981a(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        return C0585dl.m2702a(game2.mo1965b(), game.mo1965b()) && C0585dl.m2702a(game2.mo1966c(), game.mo1966c()) && C0585dl.m2702a(game2.mo1967d(), game.mo1967d()) && C0585dl.m2702a(game2.mo1968e(), game.mo1968e()) && C0585dl.m2702a(game2.mo1969f(), game.mo1969f()) && C0585dl.m2702a(game2.mo1970g(), game.mo1970g()) && C0585dl.m2702a(game2.mo1971h(), game.mo1971h()) && C0585dl.m2702a(game2.mo1972i(), game.mo1972i()) && C0585dl.m2702a(game2.mo1973j(), game.mo1973j()) && C0585dl.m2702a(Boolean.valueOf(game2.mo1974k()), Boolean.valueOf(game.mo1974k())) && C0585dl.m2702a(Boolean.valueOf(game2.mo1975l()), Boolean.valueOf(game.mo1975l())) && C0585dl.m2702a(game2.mo1976m(), game.mo1976m()) && C0585dl.m2702a(Integer.valueOf(game2.mo1977n()), Integer.valueOf(game.mo1977n())) && C0585dl.m2702a(Integer.valueOf(game2.mo1978o()), Integer.valueOf(game.mo1978o())) && C0585dl.m2702a(Integer.valueOf(game2.mo1979p()), Integer.valueOf(game.mo1979p()));
    }

    /* JADX INFO: renamed from: b */
    static String m1984b(Game game) {
        return C0585dl.m2701a(game).m2703a("ApplicationId", game.mo1965b()).m2703a("DisplayName", game.mo1966c()).m2703a("PrimaryCategory", game.mo1967d()).m2703a("SecondaryCategory", game.mo1968e()).m2703a("Description", game.mo1969f()).m2703a("DeveloperName", game.mo1970g()).m2703a("IconImageUri", game.mo1971h()).m2703a("HiResImageUri", game.mo1972i()).m2703a("FeaturedImageUri", game.mo1973j()).m2703a("PlayEnabledGame", Boolean.valueOf(game.mo1974k())).m2703a("InstanceInstalled", Boolean.valueOf(game.mo1975l())).m2703a("InstancePackageName", game.mo1976m()).m2703a("GameplayAclStatus", Integer.valueOf(game.mo1977n())).m2703a("AchievementTotalCount", Integer.valueOf(game.mo1978o())).m2703a("LeaderboardCount", Integer.valueOf(game.mo1979p())).toString();
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: b */
    public String mo1965b() {
        return this.f1677b;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: c */
    public String mo1966c() {
        return this.f1678c;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: d */
    public String mo1967d() {
        return this.f1679d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: e */
    public String mo1968e() {
        return this.f1680e;
    }

    public boolean equals(Object obj) {
        return m1981a(this, obj);
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: f */
    public String mo1969f() {
        return this.f1681f;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: g */
    public String mo1970g() {
        return this.f1682g;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: h */
    public Uri mo1971h() {
        return this.f1683h;
    }

    public int hashCode() {
        return m1980a(this);
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: i */
    public Uri mo1972i() {
        return this.f1684i;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: j */
    public Uri mo1973j() {
        return this.f1685j;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: k */
    public boolean mo1974k() {
        return this.f1686k;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: l */
    public boolean mo1975l() {
        return this.f1687l;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: m */
    public String mo1976m() {
        return this.f1688m;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: n */
    public int mo1977n() {
        return this.f1689n;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: o */
    public int mo1978o() {
        return this.f1690o;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: p */
    public int mo1979p() {
        return this.f1691p;
    }

    /* JADX INFO: renamed from: q */
    public int m1986q() {
        return this.f1676a;
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Game mo1843a() {
        return this;
    }

    public String toString() {
        return m1984b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!m2741v()) {
            C0478h.m2016a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f1677b);
        parcel.writeString(this.f1678c);
        parcel.writeString(this.f1679d);
        parcel.writeString(this.f1680e);
        parcel.writeString(this.f1681f);
        parcel.writeString(this.f1682g);
        parcel.writeString(this.f1683h == null ? null : this.f1683h.toString());
        parcel.writeString(this.f1684i == null ? null : this.f1684i.toString());
        parcel.writeString(this.f1685j != null ? this.f1685j.toString() : null);
        parcel.writeInt(this.f1686k ? 1 : 0);
        parcel.writeInt(this.f1687l ? 1 : 0);
        parcel.writeString(this.f1688m);
        parcel.writeInt(this.f1689n);
        parcel.writeInt(this.f1690o);
        parcel.writeInt(this.f1691p);
    }
}
