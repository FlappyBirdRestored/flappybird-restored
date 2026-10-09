package com.google.ads;

import com.google.ads.util.C0362e;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.google.ads.k */
/* JADX INFO: loaded from: classes.dex */
public class C0341k {

    /* JADX INFO: renamed from: a */
    private final String f1129a;

    /* JADX INFO: renamed from: b */
    private final String f1130b;

    /* JADX INFO: renamed from: c */
    private final List f1131c;

    /* JADX INFO: renamed from: d */
    private final List f1132d;

    /* JADX INFO: renamed from: e */
    private final HashMap f1133e;

    public C0341k(String str, String str2, List list, List list2, HashMap map) {
        C0362e.m1384a(str2);
        if (str != null) {
            C0362e.m1384a(str);
        }
        this.f1129a = str;
        this.f1130b = str2;
        this.f1131c = list;
        this.f1133e = map;
        this.f1132d = list2;
    }

    /* JADX INFO: renamed from: a */
    public String m1335a() {
        return this.f1129a;
    }

    /* JADX INFO: renamed from: b */
    public String m1336b() {
        return this.f1130b;
    }

    /* JADX INFO: renamed from: c */
    public List m1337c() {
        return this.f1131c;
    }

    /* JADX INFO: renamed from: d */
    public List m1338d() {
        return this.f1132d;
    }

    /* JADX INFO: renamed from: e */
    public HashMap m1339e() {
        return this.f1133e;
    }
}
