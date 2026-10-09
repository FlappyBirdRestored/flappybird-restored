package com.google.analytics.p007a.p008a;

import com.google.tagmanager.p020a.AbstractC0832v;
import com.google.tagmanager.p020a.C0773af;
import com.google.tagmanager.p020a.C0821k;
import com.google.tagmanager.p020a.C0825o;
import com.google.tagmanager.p020a.InterfaceC0780am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.analytics.a.a.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0411w extends AbstractC0832v implements InterfaceC0412x {

    /* JADX INFO: renamed from: a */
    private int f1508a;

    /* JADX INFO: renamed from: b */
    private List f1509b = Collections.emptyList();

    /* JADX INFO: renamed from: c */
    private List f1510c = Collections.emptyList();

    /* JADX INFO: renamed from: d */
    private List f1511d = Collections.emptyList();

    /* JADX INFO: renamed from: e */
    private List f1512e = Collections.emptyList();

    /* JADX INFO: renamed from: f */
    private List f1513f = Collections.emptyList();

    /* JADX INFO: renamed from: g */
    private List f1514g = Collections.emptyList();

    /* JADX INFO: renamed from: h */
    private List f1515h = Collections.emptyList();

    /* JADX INFO: renamed from: i */
    private List f1516i = Collections.emptyList();

    /* JADX INFO: renamed from: j */
    private List f1517j = Collections.emptyList();

    /* JADX INFO: renamed from: k */
    private List f1518k = Collections.emptyList();

    private C0411w() {
        m1695k();
    }

    /* JADX INFO: renamed from: k */
    private void m1695k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static C0411w m1696l() {
        return new C0411w();
    }

    /* JADX INFO: renamed from: m */
    private void m1697m() {
        if ((this.f1508a & 1) != 1) {
            this.f1509b = new ArrayList(this.f1509b);
            this.f1508a |= 1;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m1698n() {
        if ((this.f1508a & 2) != 2) {
            this.f1510c = new ArrayList(this.f1510c);
            this.f1508a |= 2;
        }
    }

    /* JADX INFO: renamed from: o */
    private void m1699o() {
        if ((this.f1508a & 4) != 4) {
            this.f1511d = new ArrayList(this.f1511d);
            this.f1508a |= 4;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m1700q() {
        if ((this.f1508a & 8) != 8) {
            this.f1512e = new ArrayList(this.f1512e);
            this.f1508a |= 8;
        }
    }

    /* JADX INFO: renamed from: s */
    private void m1701s() {
        if ((this.f1508a & 16) != 16) {
            this.f1513f = new ArrayList(this.f1513f);
            this.f1508a |= 16;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m1702t() {
        if ((this.f1508a & 32) != 32) {
            this.f1514g = new ArrayList(this.f1514g);
            this.f1508a |= 32;
        }
    }

    /* JADX INFO: renamed from: u */
    private void m1703u() {
        if ((this.f1508a & 64) != 64) {
            this.f1515h = new ArrayList(this.f1515h);
            this.f1508a |= 64;
        }
    }

    /* JADX INFO: renamed from: v */
    private void m1704v() {
        if ((this.f1508a & 128) != 128) {
            this.f1516i = new ArrayList(this.f1516i);
            this.f1508a |= 128;
        }
    }

    /* JADX INFO: renamed from: w */
    private void m1705w() {
        if ((this.f1508a & 256) != 256) {
            this.f1517j = new ArrayList(this.f1517j);
            this.f1508a |= 256;
        }
    }

    /* JADX INFO: renamed from: x */
    private void m1706x() {
        if ((this.f1508a & 512) != 512) {
            this.f1518k = new ArrayList(this.f1518k);
            this.f1508a |= 512;
        }
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v, com.google.tagmanager.p020a.AbstractC0794b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0411w clone() {
        return m1696l().mo1454a(m1712d());
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0411w mo1454a(C0409u c0409u) {
        if (c0409u != C0409u.m1647a()) {
            if (!c0409u.f1496e.isEmpty()) {
                if (this.f1509b.isEmpty()) {
                    this.f1509b = c0409u.f1496e;
                    this.f1508a &= -2;
                } else {
                    m1697m();
                    this.f1509b.addAll(c0409u.f1496e);
                }
            }
            if (!c0409u.f1497f.isEmpty()) {
                if (this.f1510c.isEmpty()) {
                    this.f1510c = c0409u.f1497f;
                    this.f1508a &= -3;
                } else {
                    m1698n();
                    this.f1510c.addAll(c0409u.f1497f);
                }
            }
            if (!c0409u.f1498g.isEmpty()) {
                if (this.f1511d.isEmpty()) {
                    this.f1511d = c0409u.f1498g;
                    this.f1508a &= -5;
                } else {
                    m1699o();
                    this.f1511d.addAll(c0409u.f1498g);
                }
            }
            if (!c0409u.f1499h.isEmpty()) {
                if (this.f1512e.isEmpty()) {
                    this.f1512e = c0409u.f1499h;
                    this.f1508a &= -9;
                } else {
                    m1700q();
                    this.f1512e.addAll(c0409u.f1499h);
                }
            }
            if (!c0409u.f1500i.isEmpty()) {
                if (this.f1513f.isEmpty()) {
                    this.f1513f = c0409u.f1500i;
                    this.f1508a &= -17;
                } else {
                    m1701s();
                    this.f1513f.addAll(c0409u.f1500i);
                }
            }
            if (!c0409u.f1501j.isEmpty()) {
                if (this.f1514g.isEmpty()) {
                    this.f1514g = c0409u.f1501j;
                    this.f1508a &= -33;
                } else {
                    m1702t();
                    this.f1514g.addAll(c0409u.f1501j);
                }
            }
            if (!c0409u.f1502k.isEmpty()) {
                if (this.f1515h.isEmpty()) {
                    this.f1515h = c0409u.f1502k;
                    this.f1508a &= -65;
                } else {
                    m1703u();
                    this.f1515h.addAll(c0409u.f1502k);
                }
            }
            if (!c0409u.f1503l.isEmpty()) {
                if (this.f1516i.isEmpty()) {
                    this.f1516i = c0409u.f1503l;
                    this.f1508a &= -129;
                } else {
                    m1704v();
                    this.f1516i.addAll(c0409u.f1503l);
                }
            }
            if (!c0409u.f1504m.isEmpty()) {
                if (this.f1517j.isEmpty()) {
                    this.f1517j = c0409u.f1504m;
                    this.f1508a &= -257;
                } else {
                    m1705w();
                    this.f1517j.addAll(c0409u.f1504m);
                }
            }
            if (!c0409u.f1505n.isEmpty()) {
                if (this.f1518k.isEmpty()) {
                    this.f1518k = c0409u.f1505n;
                    this.f1508a &= -513;
                } else {
                    m1706x();
                    this.f1518k.addAll(c0409u.f1505n);
                }
            }
            m3495a(m3496r().m3401a(c0409u.f1495d));
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    /* JADX WARN: Code duplicated, block: B:22:? A[SYNTHETIC] */
    @Override // com.google.tagmanager.p020a.AbstractC0794b, com.google.tagmanager.p020a.InterfaceC0781an
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0411w mo1459c(C0821k c0821k, C0825o c0825o) throws Throwable {
        C0409u c0409u;
        Throwable th;
        try {
            try {
                C0409u c0409u2 = (C0409u) C0409u.f1492a.mo1445b(c0821k, c0825o);
                if (c0409u2 != null) {
                    mo1454a(c0409u2);
                }
                return this;
            } catch (C0773af e) {
                C0409u c0409u3 = (C0409u) e.m3295a();
                try {
                    throw e;
                } catch (Throwable th2) {
                    c0409u = c0409u3;
                    th = th2;
                    if (c0409u != null) {
                        throw th;
                    }
                    mo1454a(c0409u);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            c0409u = null;
            if (c0409u != null) {
                throw th;
            }
            mo1454a(c0409u);
            throw th;
        }
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v, com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0409u mo1443p() {
        return C0409u.m1647a();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0781an
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0409u mo1464h() {
        C0409u c0409uM1712d = m1712d();
        if (c0409uM1712d.mo1438j()) {
            return c0409uM1712d;
        }
        throw m3360a((InterfaceC0780am) c0409uM1712d);
    }

    /* JADX INFO: renamed from: d */
    public C0409u m1712d() {
        C0409u c0409u = new C0409u(this);
        int i = this.f1508a;
        if ((this.f1508a & 1) == 1) {
            this.f1509b = Collections.unmodifiableList(this.f1509b);
            this.f1508a &= -2;
        }
        c0409u.f1496e = this.f1509b;
        if ((this.f1508a & 2) == 2) {
            this.f1510c = Collections.unmodifiableList(this.f1510c);
            this.f1508a &= -3;
        }
        c0409u.f1497f = this.f1510c;
        if ((this.f1508a & 4) == 4) {
            this.f1511d = Collections.unmodifiableList(this.f1511d);
            this.f1508a &= -5;
        }
        c0409u.f1498g = this.f1511d;
        if ((this.f1508a & 8) == 8) {
            this.f1512e = Collections.unmodifiableList(this.f1512e);
            this.f1508a &= -9;
        }
        c0409u.f1499h = this.f1512e;
        if ((this.f1508a & 16) == 16) {
            this.f1513f = Collections.unmodifiableList(this.f1513f);
            this.f1508a &= -17;
        }
        c0409u.f1500i = this.f1513f;
        if ((this.f1508a & 32) == 32) {
            this.f1514g = Collections.unmodifiableList(this.f1514g);
            this.f1508a &= -33;
        }
        c0409u.f1501j = this.f1514g;
        if ((this.f1508a & 64) == 64) {
            this.f1515h = Collections.unmodifiableList(this.f1515h);
            this.f1508a &= -65;
        }
        c0409u.f1502k = this.f1515h;
        if ((this.f1508a & 128) == 128) {
            this.f1516i = Collections.unmodifiableList(this.f1516i);
            this.f1508a &= -129;
        }
        c0409u.f1503l = this.f1516i;
        if ((this.f1508a & 256) == 256) {
            this.f1517j = Collections.unmodifiableList(this.f1517j);
            this.f1508a &= -257;
        }
        c0409u.f1504m = this.f1517j;
        if ((this.f1508a & 512) == 512) {
            this.f1518k = Collections.unmodifiableList(this.f1518k);
            this.f1508a &= -513;
        }
        c0409u.f1505n = this.f1518k;
        return c0409u;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: j */
    public final boolean mo1438j() {
        return true;
    }
}
