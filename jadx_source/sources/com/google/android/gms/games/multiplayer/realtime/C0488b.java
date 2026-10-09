package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.games.multiplayer.realtime.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0488b {
    /* JADX INFO: renamed from: a */
    public static Bundle m2078a(int i, int i2, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("min_automatch_players", i);
        bundle.putInt("max_automatch_players", i2);
        bundle.putLong("exclusive_bit_mask", j);
        return bundle;
    }
}
