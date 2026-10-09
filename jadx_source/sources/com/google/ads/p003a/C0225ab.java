package com.google.ads.p003a;

import android.os.SystemClock;
import com.google.ads.EnumC0307bj;
import com.google.ads.util.C0364g;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.google.ads.a.ab */
/* JADX INFO: loaded from: classes.dex */
public class C0225ab {

    /* JADX INFO: renamed from: f */
    private static long f763f = 0;

    /* JADX INFO: renamed from: g */
    private static long f764g = 0;

    /* JADX INFO: renamed from: h */
    private static long f765h = 0;

    /* JADX INFO: renamed from: i */
    private static long f766i = 0;

    /* JADX INFO: renamed from: j */
    private static long f767j = -1;

    /* JADX INFO: renamed from: b */
    private long f769b;

    /* JADX INFO: renamed from: c */
    private long f770c;

    /* JADX INFO: renamed from: d */
    private long f771d;

    /* JADX INFO: renamed from: m */
    private String f775m;

    /* JADX INFO: renamed from: n */
    private long f776n;

    /* JADX INFO: renamed from: k */
    private boolean f773k = false;

    /* JADX INFO: renamed from: l */
    private boolean f774l = false;

    /* JADX INFO: renamed from: a */
    private final LinkedList f768a = new LinkedList();

    /* JADX INFO: renamed from: e */
    private final LinkedList f772e = new LinkedList();

    /* JADX INFO: renamed from: o */
    private final LinkedList f777o = new LinkedList();

    /* JADX INFO: renamed from: p */
    private final LinkedList f778p = new LinkedList();

    public C0225ab() {
        m972a();
    }

    /* JADX INFO: renamed from: E */
    public static long m967E() {
        if (f767j != -1) {
            return SystemClock.elapsedRealtime() - f767j;
        }
        f767j = SystemClock.elapsedRealtime();
        return 0L;
    }

    /* JADX INFO: renamed from: A */
    protected boolean m968A() {
        return this.f774l;
    }

    /* JADX INFO: renamed from: B */
    protected void m969B() {
        C0364g.m1399d("Interstitial no fill.");
        this.f774l = true;
    }

    /* JADX INFO: renamed from: C */
    public void m970C() {
        C0364g.m1399d("Landing page dismissed.");
        this.f772e.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: renamed from: D */
    protected String m971D() {
        return this.f775m;
    }

    /* JADX INFO: renamed from: a */
    protected synchronized void m972a() {
        this.f768a.clear();
        this.f769b = 0L;
        this.f770c = 0L;
        this.f771d = 0L;
        this.f772e.clear();
        this.f776n = -1L;
        this.f777o.clear();
        this.f778p.clear();
        this.f773k = false;
        this.f774l = false;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m973a(EnumC0307bj enumC0307bj) {
        this.f777o.add(Long.valueOf(SystemClock.elapsedRealtime() - this.f776n));
        this.f778p.add(enumC0307bj);
    }

    /* JADX INFO: renamed from: a */
    public void m974a(String str) {
        C0364g.m1399d("Prior impression ticket = " + str);
        this.f775m = str;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m975b() {
        this.f777o.clear();
        this.f778p.clear();
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m976c() {
        this.f776n = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m977d() {
        StringBuilder sb;
        sb = new StringBuilder();
        Iterator it = this.f777o.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(jLongValue);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public synchronized String m978e() {
        StringBuilder sb;
        sb = new StringBuilder();
        for (EnumC0307bj enumC0307bj : this.f778p) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(enumC0307bj.ordinal());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    protected void m979f() {
        C0364g.m1399d("Ad clicked.");
        this.f768a.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: renamed from: g */
    protected void m980g() {
        C0364g.m1399d("Ad request loaded.");
        this.f769b = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: h */
    protected synchronized void m981h() {
        C0364g.m1399d("Ad request before rendering.");
        this.f770c = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: i */
    protected void m982i() {
        C0364g.m1399d("Ad request started.");
        this.f771d = SystemClock.elapsedRealtime();
        f763f++;
    }

    /* JADX INFO: renamed from: j */
    protected long m983j() {
        if (this.f768a.size() != this.f772e.size()) {
            return -1L;
        }
        return this.f768a.size();
    }

    /* JADX INFO: renamed from: k */
    protected String m984k() {
        if (this.f768a.isEmpty() || this.f768a.size() != this.f772e.size()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f768a.size()) {
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(((Long) this.f772e.get(i2)).longValue() - ((Long) this.f768a.get(i2)).longValue()));
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: l */
    protected String m985l() {
        if (this.f768a.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f768a.size()) {
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(((Long) this.f768a.get(i2)).longValue() - this.f769b));
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: m */
    protected long m986m() {
        return this.f769b - this.f771d;
    }

    /* JADX INFO: renamed from: n */
    protected synchronized long m987n() {
        return this.f770c - this.f771d;
    }

    /* JADX INFO: renamed from: o */
    protected long m988o() {
        return f763f;
    }

    /* JADX INFO: renamed from: p */
    protected synchronized long m989p() {
        return f764g;
    }

    /* JADX INFO: renamed from: q */
    protected synchronized void m990q() {
        C0364g.m1399d("Ad request network error");
        f764g++;
    }

    /* JADX INFO: renamed from: r */
    protected synchronized void m991r() {
        f764g = 0L;
    }

    /* JADX INFO: renamed from: s */
    protected synchronized long m992s() {
        return f765h;
    }

    /* JADX INFO: renamed from: t */
    protected synchronized void m993t() {
        f765h++;
    }

    /* JADX INFO: renamed from: u */
    protected synchronized void m994u() {
        f765h = 0L;
    }

    /* JADX INFO: renamed from: v */
    protected synchronized long m995v() {
        return f766i;
    }

    /* JADX INFO: renamed from: w */
    protected synchronized void m996w() {
        f766i++;
    }

    /* JADX INFO: renamed from: x */
    protected synchronized void m997x() {
        f766i = 0L;
    }

    /* JADX INFO: renamed from: y */
    protected boolean m998y() {
        return this.f773k;
    }

    /* JADX INFO: renamed from: z */
    protected void m999z() {
        C0364g.m1399d("Interstitial network error.");
        this.f773k = true;
    }
}
