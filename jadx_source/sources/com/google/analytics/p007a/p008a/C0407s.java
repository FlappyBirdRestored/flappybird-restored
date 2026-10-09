package com.google.analytics.p007a.p008a;

import com.google.analytics.p009b.p010a.p011a.C0415c;
import com.google.tagmanager.p020a.AbstractC0832v;
import com.google.tagmanager.p020a.C0773af;
import com.google.tagmanager.p020a.C0775ah;
import com.google.tagmanager.p020a.C0801bg;
import com.google.tagmanager.p020a.C0821k;
import com.google.tagmanager.p020a.C0825o;
import com.google.tagmanager.p020a.InterfaceC0776ai;
import com.google.tagmanager.p020a.InterfaceC0780am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.analytics.a.a.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0407s extends AbstractC0832v implements InterfaceC0408t {

    /* JADX INFO: renamed from: a */
    private int f1475a;

    /* JADX INFO: renamed from: n */
    private float f1488n;

    /* JADX INFO: renamed from: o */
    private boolean f1489o;

    /* JADX INFO: renamed from: q */
    private int f1491q;

    /* JADX INFO: renamed from: b */
    private InterfaceC0776ai f1476b = C0775ah.f2326a;

    /* JADX INFO: renamed from: c */
    private List f1477c = Collections.emptyList();

    /* JADX INFO: renamed from: d */
    private List f1478d = Collections.emptyList();

    /* JADX INFO: renamed from: e */
    private List f1479e = Collections.emptyList();

    /* JADX INFO: renamed from: f */
    private List f1480f = Collections.emptyList();

    /* JADX INFO: renamed from: g */
    private List f1481g = Collections.emptyList();

    /* JADX INFO: renamed from: h */
    private List f1482h = Collections.emptyList();

    /* JADX INFO: renamed from: i */
    private Object f1483i = "";

    /* JADX INFO: renamed from: j */
    private Object f1484j = "";

    /* JADX INFO: renamed from: k */
    private Object f1485k = "0";

    /* JADX INFO: renamed from: l */
    private Object f1486l = "";

    /* JADX INFO: renamed from: m */
    private C0391c f1487m = C0391c.m1422a();

    /* JADX INFO: renamed from: p */
    private InterfaceC0776ai f1490p = C0775ah.f2326a;

    private C0407s() {
        m1616q();
    }

    /* JADX INFO: renamed from: A */
    private void m1614A() {
        if ((this.f1475a & 16384) != 16384) {
            this.f1490p = new C0775ah(this.f1490p);
            this.f1475a |= 16384;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m1616q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static C0407s m1617s() {
        return new C0407s();
    }

    /* JADX INFO: renamed from: t */
    private void m1618t() {
        if ((this.f1475a & 1) != 1) {
            this.f1476b = new C0775ah(this.f1476b);
            this.f1475a |= 1;
        }
    }

    /* JADX INFO: renamed from: u */
    private void m1619u() {
        if ((this.f1475a & 2) != 2) {
            this.f1477c = new ArrayList(this.f1477c);
            this.f1475a |= 2;
        }
    }

    /* JADX INFO: renamed from: v */
    private void m1620v() {
        if ((this.f1475a & 4) != 4) {
            this.f1478d = new ArrayList(this.f1478d);
            this.f1475a |= 4;
        }
    }

    /* JADX INFO: renamed from: w */
    private void m1621w() {
        if ((this.f1475a & 8) != 8) {
            this.f1479e = new ArrayList(this.f1479e);
            this.f1475a |= 8;
        }
    }

    /* JADX INFO: renamed from: x */
    private void m1622x() {
        if ((this.f1475a & 16) != 16) {
            this.f1480f = new ArrayList(this.f1480f);
            this.f1475a |= 16;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m1623y() {
        if ((this.f1475a & 32) != 32) {
            this.f1481g = new ArrayList(this.f1481g);
            this.f1475a |= 32;
        }
    }

    /* JADX INFO: renamed from: z */
    private void m1624z() {
        if ((this.f1475a & 64) != 64) {
            this.f1482h = new ArrayList(this.f1482h);
            this.f1475a |= 64;
        }
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v, com.google.tagmanager.p020a.AbstractC0794b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0407s clone() {
        return m1617s().mo1454a(m1637d());
    }

    /* JADX INFO: renamed from: a */
    public C0407s m1626a(float f) {
        this.f1475a |= 4096;
        this.f1488n = f;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0407s m1627a(C0391c c0391c) {
        if ((this.f1475a & 2048) != 2048 || this.f1487m == C0391c.m1422a()) {
            this.f1487m = c0391c;
        } else {
            this.f1487m = C0391c.m1423a(this.f1487m).mo1454a(c0391c).m1460d();
        }
        this.f1475a |= 2048;
        return this;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0407s mo1454a(C0405q c0405q) {
        if (c0405q != C0405q.m1544a()) {
            if (!c0405q.f1457f.isEmpty()) {
                if (this.f1476b.isEmpty()) {
                    this.f1476b = c0405q.f1457f;
                    this.f1475a &= -2;
                } else {
                    m1618t();
                    this.f1476b.addAll(c0405q.f1457f);
                }
            }
            if (!c0405q.f1458g.isEmpty()) {
                if (this.f1477c.isEmpty()) {
                    this.f1477c = c0405q.f1458g;
                    this.f1475a &= -3;
                } else {
                    m1619u();
                    this.f1477c.addAll(c0405q.f1458g);
                }
            }
            if (!c0405q.f1459h.isEmpty()) {
                if (this.f1478d.isEmpty()) {
                    this.f1478d = c0405q.f1459h;
                    this.f1475a &= -5;
                } else {
                    m1620v();
                    this.f1478d.addAll(c0405q.f1459h);
                }
            }
            if (!c0405q.f1460i.isEmpty()) {
                if (this.f1479e.isEmpty()) {
                    this.f1479e = c0405q.f1460i;
                    this.f1475a &= -9;
                } else {
                    m1621w();
                    this.f1479e.addAll(c0405q.f1460i);
                }
            }
            if (!c0405q.f1461j.isEmpty()) {
                if (this.f1480f.isEmpty()) {
                    this.f1480f = c0405q.f1461j;
                    this.f1475a &= -17;
                } else {
                    m1622x();
                    this.f1480f.addAll(c0405q.f1461j);
                }
            }
            if (!c0405q.f1462k.isEmpty()) {
                if (this.f1481g.isEmpty()) {
                    this.f1481g = c0405q.f1462k;
                    this.f1475a &= -33;
                } else {
                    m1623y();
                    this.f1481g.addAll(c0405q.f1462k);
                }
            }
            if (!c0405q.f1463l.isEmpty()) {
                if (this.f1482h.isEmpty()) {
                    this.f1482h = c0405q.f1463l;
                    this.f1475a &= -65;
                } else {
                    m1624z();
                    this.f1482h.addAll(c0405q.f1463l);
                }
            }
            if (c0405q.m1608v()) {
                this.f1475a |= 128;
                this.f1483i = c0405q.f1464m;
            }
            if (c0405q.m1610x()) {
                this.f1475a |= 256;
                this.f1484j = c0405q.f1465n;
            }
            if (c0405q.m1612z()) {
                this.f1475a |= 512;
                this.f1485k = c0405q.f1466o;
            }
            if (c0405q.m1574B()) {
                this.f1475a |= 1024;
                this.f1486l = c0405q.f1467p;
            }
            if (c0405q.m1576D()) {
                m1627a(c0405q.m1577E());
            }
            if (c0405q.m1578F()) {
                m1626a(c0405q.m1579G());
            }
            if (c0405q.m1580H()) {
                m1630a(c0405q.m1581I());
            }
            if (!c0405q.f1471t.isEmpty()) {
                if (this.f1490p.isEmpty()) {
                    this.f1490p = c0405q.f1471t;
                    this.f1475a &= -16385;
                } else {
                    m1614A();
                    this.f1490p.addAll(c0405q.f1471t);
                }
            }
            if (c0405q.m1584L()) {
                m1639f(c0405q.m1585M());
            }
            m3495a(m3496r().m3401a(c0405q.f1455d));
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    /* JADX WARN: Code duplicated, block: B:22:? A[SYNTHETIC] */
    @Override // com.google.tagmanager.p020a.AbstractC0794b, com.google.tagmanager.p020a.InterfaceC0781an
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0407s mo1459c(C0821k c0821k, C0825o c0825o) throws Throwable {
        C0405q c0405q;
        Throwable th;
        try {
            try {
                C0405q c0405q2 = (C0405q) C0405q.f1452a.mo1445b(c0821k, c0825o);
                if (c0405q2 != null) {
                    mo1454a(c0405q2);
                }
                return this;
            } catch (C0773af e) {
                C0405q c0405q3 = (C0405q) e.m3295a();
                try {
                    throw e;
                } catch (Throwable th2) {
                    c0405q = c0405q3;
                    th = th2;
                    if (c0405q != null) {
                        throw th;
                    }
                    mo1454a(c0405q);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            c0405q = null;
            if (c0405q != null) {
                throw th;
            }
            mo1454a(c0405q);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0407s m1630a(boolean z) {
        this.f1475a |= 8192;
        this.f1489o = z;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0415c m1631a(int i) {
        return (C0415c) this.f1477c.get(i);
    }

    /* JADX INFO: renamed from: b */
    public C0401m m1632b(int i) {
        return (C0401m) this.f1478d.get(i);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v, com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0405q mo1443p() {
        return C0405q.m1544a();
    }

    /* JADX INFO: renamed from: c */
    public C0397i m1634c(int i) {
        return (C0397i) this.f1479e.get(i);
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0781an
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0405q mo1464h() {
        C0405q c0405qM1637d = m1637d();
        if (c0405qM1637d.mo1438j()) {
            return c0405qM1637d;
        }
        throw m3360a((InterfaceC0780am) c0405qM1637d);
    }

    /* JADX INFO: renamed from: d */
    public C0397i m1636d(int i) {
        return (C0397i) this.f1480f.get(i);
    }

    /* JADX INFO: renamed from: d */
    public C0405q m1637d() {
        C0405q c0405q = new C0405q(this);
        int i = this.f1475a;
        if ((this.f1475a & 1) == 1) {
            this.f1476b = new C0801bg(this.f1476b);
            this.f1475a &= -2;
        }
        c0405q.f1457f = this.f1476b;
        if ((this.f1475a & 2) == 2) {
            this.f1477c = Collections.unmodifiableList(this.f1477c);
            this.f1475a &= -3;
        }
        c0405q.f1458g = this.f1477c;
        if ((this.f1475a & 4) == 4) {
            this.f1478d = Collections.unmodifiableList(this.f1478d);
            this.f1475a &= -5;
        }
        c0405q.f1459h = this.f1478d;
        if ((this.f1475a & 8) == 8) {
            this.f1479e = Collections.unmodifiableList(this.f1479e);
            this.f1475a &= -9;
        }
        c0405q.f1460i = this.f1479e;
        if ((this.f1475a & 16) == 16) {
            this.f1480f = Collections.unmodifiableList(this.f1480f);
            this.f1475a &= -17;
        }
        c0405q.f1461j = this.f1480f;
        if ((this.f1475a & 32) == 32) {
            this.f1481g = Collections.unmodifiableList(this.f1481g);
            this.f1475a &= -33;
        }
        c0405q.f1462k = this.f1481g;
        if ((this.f1475a & 64) == 64) {
            this.f1482h = Collections.unmodifiableList(this.f1482h);
            this.f1475a &= -65;
        }
        c0405q.f1463l = this.f1482h;
        int i2 = (i & 128) != 128 ? 0 : 1;
        c0405q.f1464m = this.f1483i;
        if ((i & 256) == 256) {
            i2 |= 2;
        }
        c0405q.f1465n = this.f1484j;
        if ((i & 512) == 512) {
            i2 |= 4;
        }
        c0405q.f1466o = this.f1485k;
        if ((i & 1024) == 1024) {
            i2 |= 8;
        }
        c0405q.f1467p = this.f1486l;
        if ((i & 2048) == 2048) {
            i2 |= 16;
        }
        c0405q.f1468q = this.f1487m;
        if ((i & 4096) == 4096) {
            i2 |= 32;
        }
        c0405q.f1469r = this.f1488n;
        if ((i & 8192) == 8192) {
            i2 |= 64;
        }
        c0405q.f1470s = this.f1489o;
        if ((this.f1475a & 16384) == 16384) {
            this.f1490p = new C0801bg(this.f1490p);
            this.f1475a &= -16385;
        }
        c0405q.f1471t = this.f1490p;
        if ((i & 32768) == 32768) {
            i2 |= 128;
        }
        c0405q.f1472u = this.f1491q;
        c0405q.f1456e = i2;
        return c0405q;
    }

    /* JADX INFO: renamed from: e */
    public C0397i m1638e(int i) {
        return (C0397i) this.f1481g.get(i);
    }

    /* JADX INFO: renamed from: f */
    public C0407s m1639f(int i) {
        this.f1475a |= 32768;
        this.f1491q = i;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public int m1640i() {
        return this.f1477c.size();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: j */
    public final boolean mo1438j() {
        for (int i = 0; i < m1640i(); i++) {
            if (!m1631a(i).mo1438j()) {
                return false;
            }
        }
        for (int i2 = 0; i2 < m1641k(); i2++) {
            if (!m1632b(i2).mo1438j()) {
                return false;
            }
        }
        for (int i3 = 0; i3 < m1642l(); i3++) {
            if (!m1634c(i3).mo1438j()) {
                return false;
            }
        }
        for (int i4 = 0; i4 < m1643m(); i4++) {
            if (!m1636d(i4).mo1438j()) {
                return false;
            }
        }
        for (int i5 = 0; i5 < m1644n(); i5++) {
            if (!m1638e(i5).mo1438j()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public int m1641k() {
        return this.f1478d.size();
    }

    /* JADX INFO: renamed from: l */
    public int m1642l() {
        return this.f1479e.size();
    }

    /* JADX INFO: renamed from: m */
    public int m1643m() {
        return this.f1480f.size();
    }

    /* JADX INFO: renamed from: n */
    public int m1644n() {
        return this.f1481g.size();
    }
}
