package com.google.android.gms.games.p014a;

import com.google.android.gms.common.data.C0452d;
import com.google.android.gms.internal.C0507ao;
import com.google.android.gms.internal.C0585dl;
import com.google.android.gms.internal.C0587dn;
import com.google.android.gms.internal.C0588do;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.games.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0470b {

    /* JADX INFO: renamed from: a */
    private static final String[] f1698a = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest"};

    /* JADX INFO: renamed from: b */
    private String f1699b;

    /* JADX INFO: renamed from: c */
    private String f1700c;

    /* JADX INFO: renamed from: d */
    private int f1701d;

    /* JADX INFO: renamed from: e */
    private HashMap f1702e = new HashMap();

    public C0470b(C0452d c0452d) {
        this.f1701d = c0452d.m1860e();
        int iM1864g = c0452d.m1864g();
        C0588do.m2709b(iM1864g == 3);
        for (int i = 0; i < iM1864g; i++) {
            int iM1851a = c0452d.m1851a(i);
            if (i == 0) {
                this.f1699b = c0452d.m1856c("leaderboardId", i, iM1851a);
                this.f1700c = c0452d.m1856c("playerId", i, iM1851a);
            }
            if (c0452d.m1858d("hasResult", i, iM1851a)) {
                m2003a(new C0471c(c0452d.m1852a("rawScore", i, iM1851a), c0452d.m1856c("formattedScore", i, iM1851a), c0452d.m1858d("newBest", i, iM1851a)), c0452d.m1855b("timeSpan", i, iM1851a));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2003a(C0471c c0471c, int i) {
        this.f1702e.put(Integer.valueOf(i), c0471c);
    }

    /* JADX INFO: renamed from: a */
    public int m2004a() {
        return this.f1701d;
    }

    public String toString() {
        C0587dn c0587dnM2703a = C0585dl.m2701a(this).m2703a("PlayerId", this.f1700c).m2703a("StatusCode", Integer.valueOf(this.f1701d));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 3) {
                return c0587dnM2703a.toString();
            }
            C0471c c0471c = (C0471c) this.f1702e.get(Integer.valueOf(i2));
            c0587dnM2703a.m2703a("TimesSpan", C0507ao.m2282a(i2));
            c0587dnM2703a.m2703a("Result", c0471c == null ? "null" : c0471c.toString());
            i = i2 + 1;
        }
    }
}
