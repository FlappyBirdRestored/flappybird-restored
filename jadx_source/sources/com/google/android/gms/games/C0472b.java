package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC0450b;

/* JADX INFO: renamed from: com.google.android.gms.games.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0472b extends AbstractC0450b implements Game {
    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: b */
    public String mo1965b() {
        return m1847d("external_game_id");
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: c */
    public String mo1966c() {
        return m1847d("display_name");
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: d */
    public String mo1967d() {
        return m1847d("primary_category");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: e */
    public String mo1968e() {
        return m1847d("secondary_category");
    }

    @Override // com.google.android.gms.common.data.AbstractC0450b
    public boolean equals(Object obj) {
        return GameEntity.m1981a(this, obj);
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: f */
    public String mo1969f() {
        return m1847d("game_description");
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: g */
    public String mo1970g() {
        return m1847d("developer_name");
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: h */
    public Uri mo1971h() {
        return m1848e("game_icon_image_uri");
    }

    @Override // com.google.android.gms.common.data.AbstractC0450b
    public int hashCode() {
        return GameEntity.m1980a(this);
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: i */
    public Uri mo1972i() {
        return m1848e("game_hi_res_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: j */
    public Uri mo1973j() {
        return m1848e("featured_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: k */
    public boolean mo1974k() {
        return m1846c("play_enabled_game");
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: l */
    public boolean mo1975l() {
        return m1845b("installed") > 0;
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: m */
    public String mo1976m() {
        return m1847d("package_name");
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: n */
    public int mo1977n() {
        return m1845b("gameplay_acl_status");
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: o */
    public int mo1978o() {
        return m1845b("achievement_total_count");
    }

    @Override // com.google.android.gms.games.Game
    /* JADX INFO: renamed from: p */
    public int mo1979p() {
        return m1845b("leaderboard_count");
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Game mo1843a() {
        return new GameEntity(this);
    }

    public String toString() {
        return GameEntity.m1984b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((GameEntity) mo1843a()).writeToParcel(parcel, i);
    }
}
