package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC0450b;
import com.google.android.gms.common.data.C0452d;

/* JADX INFO: renamed from: com.google.android.gms.games.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0474d extends AbstractC0450b implements Player {
    public C0474d(C0452d c0452d, int i) {
        super(c0452d, i);
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: b */
    public String mo1988b() {
        return m1847d("external_player_id");
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: c */
    public String mo1989c() {
        return m1847d("profile_name");
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: d */
    public Uri mo1990d() {
        return m1848e("profile_icon_image_uri");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: e */
    public Uri mo1991e() {
        return m1848e("profile_hi_res_image_uri");
    }

    @Override // com.google.android.gms.common.data.AbstractC0450b
    public boolean equals(Object obj) {
        return PlayerEntity.m1994a(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    /* JADX INFO: renamed from: f */
    public long mo1992f() {
        return m1844a("last_updated");
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Player mo1843a() {
        return new PlayerEntity(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC0450b
    public int hashCode() {
        return PlayerEntity.m1993a(this);
    }

    public String toString() {
        return PlayerEntity.m1997b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) mo1843a()).writeToParcel(parcel, i);
    }
}
