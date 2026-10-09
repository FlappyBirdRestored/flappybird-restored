package com.google.example.games.basegameutils;

/* JADX INFO: renamed from: com.google.example.games.basegameutils.c */
/* JADX INFO: loaded from: classes.dex */
public class C0763c {

    /* JADX INFO: renamed from: a */
    int f2310a;

    /* JADX INFO: renamed from: b */
    int f2311b;

    public C0763c(int i) {
        this(i, -100);
    }

    public C0763c(int i, int i2) {
        this.f2310a = 0;
        this.f2311b = -100;
        this.f2310a = i;
        this.f2311b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m3270a() {
        return this.f2310a;
    }

    /* JADX INFO: renamed from: b */
    public int m3271b() {
        return this.f2311b;
    }

    public String toString() {
        return "SignInFailureReason(serviceErrorCode:" + C0761a.m3240c(this.f2310a) + (this.f2311b == -100 ? ")" : ",activityResultCode:" + C0761a.m3239b(this.f2311b) + ")");
    }
}
