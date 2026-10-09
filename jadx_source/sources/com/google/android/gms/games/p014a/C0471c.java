package com.google.android.gms.games.p014a;

import com.google.android.gms.internal.C0585dl;

/* JADX INFO: renamed from: com.google.android.gms.games.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0471c {

    /* JADX INFO: renamed from: a */
    public final long f1703a;

    /* JADX INFO: renamed from: b */
    public final String f1704b;

    /* JADX INFO: renamed from: c */
    public final boolean f1705c;

    public C0471c(long j, String str, boolean z) {
        this.f1703a = j;
        this.f1704b = str;
        this.f1705c = z;
    }

    public String toString() {
        return C0585dl.m2701a(this).m2703a("RawScore", Long.valueOf(this.f1703a)).m2703a("FormattedScore", this.f1704b).m2703a("NewBest", Boolean.valueOf(this.f1705c)).toString();
    }
}
