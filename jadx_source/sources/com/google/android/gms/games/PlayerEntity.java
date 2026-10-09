package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC0514av;
import com.google.android.gms.internal.C0560cn;
import com.google.android.gms.internal.C0585dl;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerEntity extends AbstractC0514av implements Player {
    public static final Parcelable.Creator CREATOR = new C0477g();

    /* JADX INFO: renamed from: a */
    private final int f1692a;

    /* JADX INFO: renamed from: b */
    private final String f1693b;

    /* JADX INFO: renamed from: c */
    private final String f1694c;

    /* JADX INFO: renamed from: d */
    private final Uri f1695d;

    /* JADX INFO: renamed from: e */
    private final Uri f1696e;

    /* JADX INFO: renamed from: f */
    private final long f1697f;

    PlayerEntity(int i, String str, String str2, Uri uri, Uri uri2, long j) {
        this.f1692a = i;
        this.f1693b = str;
        this.f1694c = str2;
        this.f1695d = uri;
        this.f1696e = uri2;
        this.f1697f = j;
    }

    public PlayerEntity(Player player) {
        this.f1692a = 1;
        this.f1693b = player.mo1988b();
        this.f1694c = player.mo1989c();
        this.f1695d = player.mo1990d();
        this.f1696e = player.mo1991e();
        this.f1697f = player.mo1992f();
        C0560cn.m2606a((Object) this.f1693b);
        C0560cn.m2606a((Object) this.f1694c);
        C0560cn.m2608a(this.f1697f > 0);
    }

    /* JADX INFO: renamed from: a */
    static int m1993a(Player player) {
        return C0585dl.m2700a(player.mo1988b(), player.mo1989c(), player.mo1990d(), player.mo1991e(), Long.valueOf(player.mo1992f()));
    }

    /* JADX INFO: renamed from: a */
    static boolean m1994a(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return C0585dl.m2702a(player2.mo1988b(), player.mo1988b()) && C0585dl.m2702a(player2.mo1989c(), player.mo1989c()) && C0585dl.m2702a(player2.mo1990d(), player.mo1990d()) && C0585dl.m2702a(player2.mo1991e(), player.mo1991e()) && C0585dl.m2702a(Long.valueOf(player2.mo1992f()), Long.valueOf(player.mo1992f()));
    }

    /* JADX INFO: renamed from: b */
    static String m1997b(Player player) {
        return C0585dl.m2701a(player).m2703a("PlayerId", player.mo1988b()).m2703a("DisplayName", player.mo1989c()).m2703a("IconImageUri", player.mo1990d()).m2703a("HiResImageUri", player.mo1991e()).m2703a("RetrievedTimestamp", Long.valueOf(player.mo1992f())).toString();
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: b */
    public String mo1988b() {
        return this.f1693b;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: c */
    public String mo1989c() {
        return this.f1694c;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: d */
    public Uri mo1990d() {
        return this.f1695d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: e */
    public Uri mo1991e() {
        return this.f1696e;
    }

    public boolean equals(Object obj) {
        return m1994a(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: f */
    public long mo1992f() {
        return this.f1697f;
    }

    /* JADX INFO: renamed from: g */
    public int m1999g() {
        return this.f1692a;
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Player mo1843a() {
        return this;
    }

    public int hashCode() {
        return m1993a(this);
    }

    public String toString() {
        return m1997b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!m2741v()) {
            C0479i.m2018a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f1693b);
        parcel.writeString(this.f1694c);
        parcel.writeString(this.f1695d == null ? null : this.f1695d.toString());
        parcel.writeString(this.f1696e != null ? this.f1696e.toString() : null);
        parcel.writeLong(this.f1697f);
    }
}
