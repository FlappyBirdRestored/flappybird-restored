package com.google.analytics.p007a.p008a;

import com.google.android.gms.C0467e;
import com.google.tagmanager.p020a.AbstractC0818h;
import com.google.tagmanager.p020a.AbstractC0830t;
import com.google.tagmanager.p020a.AbstractC0832v;
import com.google.tagmanager.p020a.C0773af;
import com.google.tagmanager.p020a.C0820j;
import com.google.tagmanager.p020a.C0821k;
import com.google.tagmanager.p020a.C0823m;
import com.google.tagmanager.p020a.C0825o;
import com.google.tagmanager.p020a.InterfaceC0783ap;
import com.google.tagmanager.p020a.InterfaceC0784aq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.analytics.a.a.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0409u extends AbstractC0830t implements InterfaceC0412x {

    /* JADX INFO: renamed from: d */
    private final AbstractC0818h f1495d;

    /* JADX INFO: renamed from: e */
    private List f1496e;

    /* JADX INFO: renamed from: f */
    private List f1497f;

    /* JADX INFO: renamed from: g */
    private List f1498g;

    /* JADX INFO: renamed from: h */
    private List f1499h;

    /* JADX INFO: renamed from: i */
    private List f1500i;

    /* JADX INFO: renamed from: j */
    private List f1501j;

    /* JADX INFO: renamed from: k */
    private List f1502k;

    /* JADX INFO: renamed from: l */
    private List f1503l;

    /* JADX INFO: renamed from: m */
    private List f1504m;

    /* JADX INFO: renamed from: n */
    private List f1505n;

    /* JADX INFO: renamed from: o */
    private byte f1506o;

    /* JADX INFO: renamed from: p */
    private int f1507p;

    /* JADX INFO: renamed from: a */
    public static InterfaceC0784aq f1492a = new C0410v();

    /* JADX INFO: renamed from: q */
    private static volatile InterfaceC0783ap f1494q = null;

    /* JADX INFO: renamed from: c */
    private static final C0409u f1493c = new C0409u(true);

    static {
        f1493c.m1646E();
    }

    private C0409u(C0821k c0821k, C0825o c0825o) {
        this.f1506o = (byte) -1;
        this.f1507p = -1;
        m1646E();
        int i = 0;
        C0820j c0820jM3400i = AbstractC0818h.m3400i();
        C0823m c0823mM3453a = C0823m.m3453a(c0820jM3400i);
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int iM3417a = c0821k.m3417a();
                        switch (iM3417a) {
                            case C0467e.MapAttrs_mapType /* 0 */:
                                z = true;
                                break;
                            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                                if ((i & 1) != 1) {
                                    this.f1496e = new ArrayList();
                                    i |= 1;
                                }
                                this.f1496e.add(Integer.valueOf(c0821k.m3431f()));
                                break;
                            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                                int iM3426c = c0821k.m3426c(c0821k.m3445s());
                                if ((i & 1) != 1 && c0821k.m3449w() > 0) {
                                    this.f1496e = new ArrayList();
                                    i |= 1;
                                }
                                while (c0821k.m3449w() > 0) {
                                    this.f1496e.add(Integer.valueOf(c0821k.m3431f()));
                                }
                                c0821k.m3428d(iM3426c);
                                break;
                            case 16:
                                if ((i & 2) != 2) {
                                    this.f1497f = new ArrayList();
                                    i |= 2;
                                }
                                this.f1497f.add(Integer.valueOf(c0821k.m3431f()));
                                break;
                            case 18:
                                int iM3426c2 = c0821k.m3426c(c0821k.m3445s());
                                if ((i & 2) != 2 && c0821k.m3449w() > 0) {
                                    this.f1497f = new ArrayList();
                                    i |= 2;
                                }
                                while (c0821k.m3449w() > 0) {
                                    this.f1497f.add(Integer.valueOf(c0821k.m3431f()));
                                }
                                c0821k.m3428d(iM3426c2);
                                break;
                            case 24:
                                if ((i & 4) != 4) {
                                    this.f1498g = new ArrayList();
                                    i |= 4;
                                }
                                this.f1498g.add(Integer.valueOf(c0821k.m3431f()));
                                break;
                            case 26:
                                int iM3426c3 = c0821k.m3426c(c0821k.m3445s());
                                if ((i & 4) != 4 && c0821k.m3449w() > 0) {
                                    this.f1498g = new ArrayList();
                                    i |= 4;
                                }
                                while (c0821k.m3449w() > 0) {
                                    this.f1498g.add(Integer.valueOf(c0821k.m3431f()));
                                }
                                c0821k.m3428d(iM3426c3);
                                break;
                            case 32:
                                if ((i & 8) != 8) {
                                    this.f1499h = new ArrayList();
                                    i |= 8;
                                }
                                this.f1499h.add(Integer.valueOf(c0821k.m3431f()));
                                break;
                            case 34:
                                int iM3426c4 = c0821k.m3426c(c0821k.m3445s());
                                if ((i & 8) != 8 && c0821k.m3449w() > 0) {
                                    this.f1499h = new ArrayList();
                                    i |= 8;
                                }
                                while (c0821k.m3449w() > 0) {
                                    this.f1499h.add(Integer.valueOf(c0821k.m3431f()));
                                }
                                c0821k.m3428d(iM3426c4);
                                break;
                            case 40:
                                if ((i & 16) != 16) {
                                    this.f1500i = new ArrayList();
                                    i |= 16;
                                }
                                this.f1500i.add(Integer.valueOf(c0821k.m3431f()));
                                break;
                            case 42:
                                int iM3426c5 = c0821k.m3426c(c0821k.m3445s());
                                if ((i & 16) != 16 && c0821k.m3449w() > 0) {
                                    this.f1500i = new ArrayList();
                                    i |= 16;
                                }
                                while (c0821k.m3449w() > 0) {
                                    this.f1500i.add(Integer.valueOf(c0821k.m3431f()));
                                }
                                c0821k.m3428d(iM3426c5);
                                break;
                            case 48:
                                if ((i & 32) != 32) {
                                    this.f1501j = new ArrayList();
                                    i |= 32;
                                }
                                this.f1501j.add(Integer.valueOf(c0821k.m3431f()));
                                break;
                            case 50:
                                int iM3426c6 = c0821k.m3426c(c0821k.m3445s());
                                if ((i & 32) != 32 && c0821k.m3449w() > 0) {
                                    this.f1501j = new ArrayList();
                                    i |= 32;
                                }
                                while (c0821k.m3449w() > 0) {
                                    this.f1501j.add(Integer.valueOf(c0821k.m3431f()));
                                }
                                c0821k.m3428d(iM3426c6);
                                break;
                            case 56:
                                if ((i & 64) != 64) {
                                    this.f1502k = new ArrayList();
                                    i |= 64;
                                }
                                this.f1502k.add(Integer.valueOf(c0821k.m3431f()));
                                break;
                            case 58:
                                int iM3426c7 = c0821k.m3426c(c0821k.m3445s());
                                if ((i & 64) != 64 && c0821k.m3449w() > 0) {
                                    this.f1502k = new ArrayList();
                                    i |= 64;
                                }
                                while (c0821k.m3449w() > 0) {
                                    this.f1502k.add(Integer.valueOf(c0821k.m3431f()));
                                }
                                c0821k.m3428d(iM3426c7);
                                break;
                            case 64:
                                if ((i & 128) != 128) {
                                    this.f1503l = new ArrayList();
                                    i |= 128;
                                }
                                this.f1503l.add(Integer.valueOf(c0821k.m3431f()));
                                break;
                            case 66:
                                int iM3426c8 = c0821k.m3426c(c0821k.m3445s());
                                if ((i & 128) != 128 && c0821k.m3449w() > 0) {
                                    this.f1503l = new ArrayList();
                                    i |= 128;
                                }
                                while (c0821k.m3449w() > 0) {
                                    this.f1503l.add(Integer.valueOf(c0821k.m3431f()));
                                }
                                c0821k.m3428d(iM3426c8);
                                break;
                            case 72:
                                if ((i & 256) != 256) {
                                    this.f1504m = new ArrayList();
                                    i |= 256;
                                }
                                this.f1504m.add(Integer.valueOf(c0821k.m3431f()));
                                break;
                            case 74:
                                int iM3426c9 = c0821k.m3426c(c0821k.m3445s());
                                if ((i & 256) != 256 && c0821k.m3449w() > 0) {
                                    this.f1504m = new ArrayList();
                                    i |= 256;
                                }
                                while (c0821k.m3449w() > 0) {
                                    this.f1504m.add(Integer.valueOf(c0821k.m3431f()));
                                }
                                c0821k.m3428d(iM3426c9);
                                break;
                            case 80:
                                if ((i & 512) != 512) {
                                    this.f1505n = new ArrayList();
                                    i |= 512;
                                }
                                this.f1505n.add(Integer.valueOf(c0821k.m3431f()));
                                break;
                            case 82:
                                int iM3426c10 = c0821k.m3426c(c0821k.m3445s());
                                if ((i & 512) != 512 && c0821k.m3449w() > 0) {
                                    this.f1505n = new ArrayList();
                                    i |= 512;
                                }
                                while (c0821k.m3449w() > 0) {
                                    this.f1505n.add(Integer.valueOf(c0821k.m3431f()));
                                }
                                c0821k.m3428d(iM3426c10);
                                break;
                            default:
                                if (!mo3494a(c0821k, c0823mM3453a, c0825o, iM3417a)) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (IOException e) {
                        throw new C0773af(e.getMessage()).m3294a(this);
                    }
                } catch (C0773af e2) {
                    throw e2.m3294a(this);
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.f1496e = Collections.unmodifiableList(this.f1496e);
                }
                if ((i & 2) == 2) {
                    this.f1497f = Collections.unmodifiableList(this.f1497f);
                }
                if ((i & 4) == 4) {
                    this.f1498g = Collections.unmodifiableList(this.f1498g);
                }
                if ((i & 8) == 8) {
                    this.f1499h = Collections.unmodifiableList(this.f1499h);
                }
                if ((i & 16) == 16) {
                    this.f1500i = Collections.unmodifiableList(this.f1500i);
                }
                if ((i & 32) == 32) {
                    this.f1501j = Collections.unmodifiableList(this.f1501j);
                }
                if ((i & 64) == 64) {
                    this.f1502k = Collections.unmodifiableList(this.f1502k);
                }
                if ((i & 128) == 128) {
                    this.f1503l = Collections.unmodifiableList(this.f1503l);
                }
                if ((i & 256) == 256) {
                    this.f1504m = Collections.unmodifiableList(this.f1504m);
                }
                if ((i & 512) == 512) {
                    this.f1505n = Collections.unmodifiableList(this.f1505n);
                }
                try {
                    c0823mM3453a.m3456a();
                } catch (IOException e3) {
                } finally {
                    this.f1495d = c0820jM3400i.m3409a();
                }
                mo3493R();
                throw th;
            }
        }
        if ((i & 1) == 1) {
            this.f1496e = Collections.unmodifiableList(this.f1496e);
        }
        if ((i & 2) == 2) {
            this.f1497f = Collections.unmodifiableList(this.f1497f);
        }
        if ((i & 4) == 4) {
            this.f1498g = Collections.unmodifiableList(this.f1498g);
        }
        if ((i & 8) == 8) {
            this.f1499h = Collections.unmodifiableList(this.f1499h);
        }
        if ((i & 16) == 16) {
            this.f1500i = Collections.unmodifiableList(this.f1500i);
        }
        if ((i & 32) == 32) {
            this.f1501j = Collections.unmodifiableList(this.f1501j);
        }
        if ((i & 64) == 64) {
            this.f1502k = Collections.unmodifiableList(this.f1502k);
        }
        if ((i & 128) == 128) {
            this.f1503l = Collections.unmodifiableList(this.f1503l);
        }
        if ((i & 256) == 256) {
            this.f1504m = Collections.unmodifiableList(this.f1504m);
        }
        if ((i & 512) == 512) {
            this.f1505n = Collections.unmodifiableList(this.f1505n);
        }
        try {
            c0823mM3453a.m3456a();
        } catch (IOException e4) {
        } finally {
            this.f1495d = c0820jM3400i.m3409a();
        }
        mo3493R();
    }

    private C0409u(AbstractC0832v abstractC0832v) {
        super(abstractC0832v);
        this.f1506o = (byte) -1;
        this.f1507p = -1;
        this.f1495d = abstractC0832v.m3496r();
    }

    private C0409u(boolean z) {
        this.f1506o = (byte) -1;
        this.f1507p = -1;
        this.f1495d = AbstractC0818h.f2420a;
    }

    /* JADX INFO: renamed from: B */
    public static C0411w m1645B() {
        return C0411w.m1696l();
    }

    /* JADX INFO: renamed from: E */
    private void m1646E() {
        this.f1496e = Collections.emptyList();
        this.f1497f = Collections.emptyList();
        this.f1498g = Collections.emptyList();
        this.f1499h = Collections.emptyList();
        this.f1500i = Collections.emptyList();
        this.f1501j = Collections.emptyList();
        this.f1502k = Collections.emptyList();
        this.f1503l = Collections.emptyList();
        this.f1504m = Collections.emptyList();
        this.f1505n = Collections.emptyList();
    }

    /* JADX INFO: renamed from: a */
    public static C0409u m1647a() {
        return f1493c;
    }

    /* JADX INFO: renamed from: a */
    public static C0411w m1648a(C0409u c0409u) {
        return m1645B().mo1454a(c0409u);
    }

    /* JADX INFO: renamed from: A */
    public int m1670A() {
        return this.f1505n.size();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C0411w mo1442o() {
        return m1645B();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0411w mo1441n() {
        return m1648a(this);
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0409u mo1443p() {
        return f1493c;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0830t, com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: c */
    public InterfaceC0784aq mo1431c() {
        return f1492a;
    }

    /* JADX INFO: renamed from: d */
    public List m1674d() {
        return this.f1496e;
    }

    /* JADX INFO: renamed from: e */
    public int m1675e() {
        return this.f1496e.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0409u)) {
            return super.equals(obj);
        }
        C0409u c0409u = (C0409u) obj;
        return (((((((((m1674d().equals(c0409u.m1674d())) && m1676f().equals(c0409u.m1676f())) && m1678h().equals(c0409u.m1678h())) && m1680k().equals(c0409u.m1680k())) && m1682m().equals(c0409u.m1682m())) && m1684r().equals(c0409u.m1684r())) && m1686t().equals(c0409u.m1686t())) && m1688v().equals(c0409u.m1688v())) && m1690x().equals(c0409u.m1690x())) && m1692z().equals(c0409u.m1692z());
    }

    /* JADX INFO: renamed from: f */
    public List m1676f() {
        return this.f1497f;
    }

    /* JADX INFO: renamed from: g */
    public int m1677g() {
        return this.f1497f.size();
    }

    /* JADX INFO: renamed from: h */
    public List m1678h() {
        return this.f1498g;
    }

    public int hashCode() {
        if (this.f2315b != 0) {
            return this.f2315b;
        }
        int iHashCode = C0409u.class.hashCode() + 779;
        if (m1675e() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + m1674d().hashCode();
        }
        if (m1677g() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + m1676f().hashCode();
        }
        if (m1679i() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + m1678h().hashCode();
        }
        if (m1681l() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + m1680k().hashCode();
        }
        if (m1683q() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + m1682m().hashCode();
        }
        if (m1685s() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + m1684r().hashCode();
        }
        if (m1687u() > 0) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + m1686t().hashCode();
        }
        if (m1689w() > 0) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + m1688v().hashCode();
        }
        if (m1691y() > 0) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + m1690x().hashCode();
        }
        if (m1670A() > 0) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + m1692z().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.f1495d.hashCode();
        this.f2315b = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: i */
    public int m1679i() {
        return this.f1498g.size();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: j */
    public final boolean mo1438j() {
        byte b = this.f1506o;
        if (b != -1) {
            return b == 1;
        }
        this.f1506o = (byte) 1;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public List m1680k() {
        return this.f1499h;
    }

    /* JADX INFO: renamed from: l */
    public int m1681l() {
        return this.f1499h.size();
    }

    /* JADX INFO: renamed from: m */
    public List m1682m() {
        return this.f1500i;
    }

    /* JADX INFO: renamed from: q */
    public int m1683q() {
        return this.f1500i.size();
    }

    /* JADX INFO: renamed from: r */
    public List m1684r() {
        return this.f1501j;
    }

    /* JADX INFO: renamed from: s */
    public int m1685s() {
        return this.f1501j.size();
    }

    /* JADX INFO: renamed from: t */
    public List m1686t() {
        return this.f1502k;
    }

    /* JADX INFO: renamed from: u */
    public int m1687u() {
        return this.f1502k.size();
    }

    /* JADX INFO: renamed from: v */
    public List m1688v() {
        return this.f1503l;
    }

    /* JADX INFO: renamed from: w */
    public int m1689w() {
        return this.f1503l.size();
    }

    /* JADX INFO: renamed from: x */
    public List m1690x() {
        return this.f1504m;
    }

    /* JADX INFO: renamed from: y */
    public int m1691y() {
        return this.f1504m.size();
    }

    /* JADX INFO: renamed from: z */
    public List m1692z() {
        return this.f1505n;
    }
}
