package com.google.analytics.p009b.p010a.p011a;

import com.google.tagmanager.p020a.AbstractC0833w;
import com.google.tagmanager.p020a.AbstractC0834x;
import com.google.tagmanager.p020a.C0773af;
import com.google.tagmanager.p020a.C0821k;
import com.google.tagmanager.p020a.C0825o;
import com.google.tagmanager.p020a.InterfaceC0780am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.analytics.b.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0417e extends AbstractC0833w implements InterfaceC0422j {

    /* JADX INFO: renamed from: a */
    private int f1538a;

    /* JADX INFO: renamed from: i */
    private long f1546i;

    /* JADX INFO: renamed from: j */
    private boolean f1547j;

    /* JADX INFO: renamed from: m */
    private boolean f1550m;

    /* JADX INFO: renamed from: b */
    private EnumC0420h f1539b = EnumC0420h.STRING;

    /* JADX INFO: renamed from: c */
    private Object f1540c = "";

    /* JADX INFO: renamed from: d */
    private List f1541d = Collections.emptyList();

    /* JADX INFO: renamed from: e */
    private List f1542e = Collections.emptyList();

    /* JADX INFO: renamed from: f */
    private List f1543f = Collections.emptyList();

    /* JADX INFO: renamed from: g */
    private Object f1544g = "";

    /* JADX INFO: renamed from: h */
    private Object f1545h = "";

    /* JADX INFO: renamed from: k */
    private List f1548k = Collections.emptyList();

    /* JADX INFO: renamed from: l */
    private List f1549l = Collections.emptyList();

    private C0417e() {
        m1772t();
    }

    /* JADX INFO: renamed from: t */
    private void m1772t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static C0417e m1773u() {
        return new C0417e();
    }

    /* JADX INFO: renamed from: v */
    private void m1774v() {
        if ((this.f1538a & 4) != 4) {
            this.f1541d = new ArrayList(this.f1541d);
            this.f1538a |= 4;
        }
    }

    /* JADX INFO: renamed from: w */
    private void m1775w() {
        if ((this.f1538a & 8) != 8) {
            this.f1542e = new ArrayList(this.f1542e);
            this.f1538a |= 8;
        }
    }

    /* JADX INFO: renamed from: x */
    private void m1776x() {
        if ((this.f1538a & 16) != 16) {
            this.f1543f = new ArrayList(this.f1543f);
            this.f1538a |= 16;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m1777y() {
        if ((this.f1538a & 512) != 512) {
            this.f1548k = new ArrayList(this.f1548k);
            this.f1538a |= 512;
        }
    }

    /* JADX INFO: renamed from: z */
    private void m1778z() {
        if ((this.f1538a & 1024) != 1024) {
            this.f1549l = new ArrayList(this.f1549l);
            this.f1538a |= 1024;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0415c m1779a(int i) {
        return (C0415c) this.f1541d.get(i);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0833w
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0417e clone() {
        return m1773u().mo1454a(m1794d());
    }

    /* JADX INFO: renamed from: a */
    public C0417e m1781a(long j) {
        this.f1538a |= 128;
        this.f1546i = j;
        return this;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0417e mo1454a(C0415c c0415c) {
        if (c0415c != C0415c.m1717a()) {
            if (c0415c.m1751d()) {
                m1783a(c0415c.m1752e());
            }
            if (c0415c.m1753f()) {
                this.f1538a |= 2;
                this.f1540c = c0415c.f1525g;
            }
            if (!c0415c.f1526h.isEmpty()) {
                if (this.f1541d.isEmpty()) {
                    this.f1541d = c0415c.f1526h;
                    this.f1538a &= -5;
                } else {
                    m1774v();
                    this.f1541d.addAll(c0415c.f1526h);
                }
            }
            if (!c0415c.f1527i.isEmpty()) {
                if (this.f1542e.isEmpty()) {
                    this.f1542e = c0415c.f1527i;
                    this.f1538a &= -9;
                } else {
                    m1775w();
                    this.f1542e.addAll(c0415c.f1527i);
                }
            }
            if (!c0415c.f1528j.isEmpty()) {
                if (this.f1543f.isEmpty()) {
                    this.f1543f = c0415c.f1528j;
                    this.f1538a &= -17;
                } else {
                    m1776x();
                    this.f1543f.addAll(c0415c.f1528j);
                }
            }
            if (c0415c.m1761r()) {
                this.f1538a |= 32;
                this.f1544g = c0415c.f1529k;
            }
            if (c0415c.m1763t()) {
                this.f1538a |= 64;
                this.f1545h = c0415c.f1530l;
            }
            if (c0415c.m1765v()) {
                m1781a(c0415c.m1766w());
            }
            if (c0415c.m1767x()) {
                m1786a(c0415c.m1768y());
            }
            if (!c0415c.f1533o.isEmpty()) {
                if (this.f1548k.isEmpty()) {
                    this.f1548k = c0415c.f1533o;
                    this.f1538a &= -513;
                } else {
                    m1777y();
                    this.f1548k.addAll(c0415c.f1533o);
                }
            }
            if (!c0415c.f1534p.isEmpty()) {
                if (this.f1549l.isEmpty()) {
                    this.f1549l = c0415c.f1534p;
                    this.f1538a &= -1025;
                } else {
                    m1778z();
                    this.f1549l.addAll(c0415c.f1534p);
                }
            }
            if (c0415c.m1742D()) {
                m1790b(c0415c.m1743E());
            }
            m3500a((AbstractC0834x) c0415c);
            m3495a(m3496r().m3401a(c0415c.f1522d));
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0417e m1783a(EnumC0420h enumC0420h) {
        if (enumC0420h == null) {
            throw new NullPointerException();
        }
        this.f1538a |= 1;
        this.f1539b = enumC0420h;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    /* JADX WARN: Code duplicated, block: B:22:? A[SYNTHETIC] */
    @Override // com.google.tagmanager.p020a.AbstractC0794b, com.google.tagmanager.p020a.InterfaceC0781an
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0417e mo1459c(C0821k c0821k, C0825o c0825o) throws Throwable {
        C0415c c0415c;
        Throwable th;
        try {
            try {
                C0415c c0415c2 = (C0415c) C0415c.f1519a.mo1445b(c0821k, c0825o);
                if (c0415c2 != null) {
                    mo1454a(c0415c2);
                }
                return this;
            } catch (C0773af e) {
                C0415c c0415c3 = (C0415c) e.m3295a();
                try {
                    throw e;
                } catch (Throwable th2) {
                    c0415c = c0415c3;
                    th = th2;
                    if (c0415c != null) {
                        throw th;
                    }
                    mo1454a(c0415c);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            c0415c = null;
            if (c0415c != null) {
                throw th;
            }
            mo1454a(c0415c);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0417e m1785a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f1538a |= 2;
        this.f1540c = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0417e m1786a(boolean z) {
        this.f1538a |= 256;
        this.f1547j = z;
        return this;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v, com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0415c mo1443p() {
        return C0415c.m1717a();
    }

    /* JADX INFO: renamed from: b */
    public C0415c m1788b(int i) {
        return (C0415c) this.f1542e.get(i);
    }

    /* JADX INFO: renamed from: b */
    public C0417e m1789b(C0415c c0415c) {
        if (c0415c == null) {
            throw new NullPointerException();
        }
        m1774v();
        this.f1541d.add(c0415c);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0417e m1790b(boolean z) {
        this.f1538a |= 2048;
        this.f1550m = z;
        return this;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0781an
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0415c mo1464h() {
        C0415c c0415cM1794d = m1794d();
        if (c0415cM1794d.mo1438j()) {
            return c0415cM1794d;
        }
        throw m3360a((InterfaceC0780am) c0415cM1794d);
    }

    /* JADX INFO: renamed from: c */
    public C0415c m1792c(int i) {
        return (C0415c) this.f1543f.get(i);
    }

    /* JADX INFO: renamed from: c */
    public C0417e m1793c(C0415c c0415c) {
        if (c0415c == null) {
            throw new NullPointerException();
        }
        m1775w();
        this.f1542e.add(c0415c);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C0415c m1794d() {
        C0415c c0415c = new C0415c(this);
        int i = this.f1538a;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c0415c.f1524f = this.f1539b;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c0415c.f1525g = this.f1540c;
        if ((this.f1538a & 4) == 4) {
            this.f1541d = Collections.unmodifiableList(this.f1541d);
            this.f1538a &= -5;
        }
        c0415c.f1526h = this.f1541d;
        if ((this.f1538a & 8) == 8) {
            this.f1542e = Collections.unmodifiableList(this.f1542e);
            this.f1538a &= -9;
        }
        c0415c.f1527i = this.f1542e;
        if ((this.f1538a & 16) == 16) {
            this.f1543f = Collections.unmodifiableList(this.f1543f);
            this.f1538a &= -17;
        }
        c0415c.f1528j = this.f1543f;
        if ((i & 32) == 32) {
            i2 |= 4;
        }
        c0415c.f1529k = this.f1544g;
        if ((i & 64) == 64) {
            i2 |= 8;
        }
        c0415c.f1530l = this.f1545h;
        if ((i & 128) == 128) {
            i2 |= 16;
        }
        c0415c.f1531m = this.f1546i;
        if ((i & 256) == 256) {
            i2 |= 32;
        }
        c0415c.f1532n = this.f1547j;
        if ((this.f1538a & 512) == 512) {
            this.f1548k = Collections.unmodifiableList(this.f1548k);
            this.f1538a &= -513;
        }
        c0415c.f1533o = this.f1548k;
        if ((this.f1538a & 1024) == 1024) {
            this.f1549l = Collections.unmodifiableList(this.f1549l);
            this.f1538a &= -1025;
        }
        c0415c.f1534p = this.f1549l;
        if ((i & 2048) == 2048) {
            i2 |= 64;
        }
        c0415c.f1535q = this.f1550m;
        c0415c.f1523e = i2;
        return c0415c;
    }

    /* JADX INFO: renamed from: d */
    public C0415c m1795d(int i) {
        return (C0415c) this.f1548k.get(i);
    }

    /* JADX INFO: renamed from: d */
    public C0417e m1796d(C0415c c0415c) {
        if (c0415c == null) {
            throw new NullPointerException();
        }
        m1776x();
        this.f1543f.add(c0415c);
        return this;
    }

    /* JADX INFO: renamed from: i */
    public boolean m1797i() {
        return (this.f1538a & 1) == 1;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: j */
    public final boolean mo1438j() {
        if (!m1797i()) {
            return false;
        }
        for (int i = 0; i < m1798k(); i++) {
            if (!m1779a(i).mo1438j()) {
                return false;
            }
        }
        for (int i2 = 0; i2 < m1799l(); i2++) {
            if (!m1788b(i2).mo1438j()) {
                return false;
            }
        }
        for (int i3 = 0; i3 < m1800m(); i3++) {
            if (!m1792c(i3).mo1438j()) {
                return false;
            }
        }
        for (int i4 = 0; i4 < m1801n(); i4++) {
            if (!m1795d(i4).mo1438j()) {
                return false;
            }
        }
        return m3501s();
    }

    /* JADX INFO: renamed from: k */
    public int m1798k() {
        return this.f1541d.size();
    }

    /* JADX INFO: renamed from: l */
    public int m1799l() {
        return this.f1542e.size();
    }

    /* JADX INFO: renamed from: m */
    public int m1800m() {
        return this.f1543f.size();
    }

    /* JADX INFO: renamed from: n */
    public int m1801n() {
        return this.f1548k.size();
    }
}
