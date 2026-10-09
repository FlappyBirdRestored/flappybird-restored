package com.google.analytics.p007a.p008a;

import com.google.analytics.p009b.p010a.p011a.C0415c;
import com.google.android.gms.C0467e;
import com.google.tagmanager.p020a.AbstractC0818h;
import com.google.tagmanager.p020a.AbstractC0830t;
import com.google.tagmanager.p020a.AbstractC0832v;
import com.google.tagmanager.p020a.C0770ac;
import com.google.tagmanager.p020a.C0773af;
import com.google.tagmanager.p020a.C0775ah;
import com.google.tagmanager.p020a.C0801bg;
import com.google.tagmanager.p020a.C0820j;
import com.google.tagmanager.p020a.C0821k;
import com.google.tagmanager.p020a.C0823m;
import com.google.tagmanager.p020a.C0825o;
import com.google.tagmanager.p020a.InterfaceC0776ai;
import com.google.tagmanager.p020a.InterfaceC0783ap;
import com.google.tagmanager.p020a.InterfaceC0784aq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.analytics.a.a.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0405q extends AbstractC0830t implements InterfaceC0408t {

    /* JADX INFO: renamed from: d */
    private final AbstractC0818h f1455d;

    /* JADX INFO: renamed from: e */
    private int f1456e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0776ai f1457f;

    /* JADX INFO: renamed from: g */
    private List f1458g;

    /* JADX INFO: renamed from: h */
    private List f1459h;

    /* JADX INFO: renamed from: i */
    private List f1460i;

    /* JADX INFO: renamed from: j */
    private List f1461j;

    /* JADX INFO: renamed from: k */
    private List f1462k;

    /* JADX INFO: renamed from: l */
    private List f1463l;

    /* JADX INFO: renamed from: m */
    private Object f1464m;

    /* JADX INFO: renamed from: n */
    private Object f1465n;

    /* JADX INFO: renamed from: o */
    private Object f1466o;

    /* JADX INFO: renamed from: p */
    private Object f1467p;

    /* JADX INFO: renamed from: q */
    private C0391c f1468q;

    /* JADX INFO: renamed from: r */
    private float f1469r;

    /* JADX INFO: renamed from: s */
    private boolean f1470s;

    /* JADX INFO: renamed from: t */
    private InterfaceC0776ai f1471t;

    /* JADX INFO: renamed from: u */
    private int f1472u;

    /* JADX INFO: renamed from: v */
    private byte f1473v;

    /* JADX INFO: renamed from: w */
    private int f1474w;

    /* JADX INFO: renamed from: a */
    public static InterfaceC0784aq f1452a = new C0406r();

    /* JADX INFO: renamed from: x */
    private static volatile InterfaceC0783ap f1454x = null;

    /* JADX INFO: renamed from: c */
    private static final C0405q f1453c = new C0405q(true);

    static {
        f1453c.m1540S();
    }

    private C0405q(C0821k c0821k, C0825o c0825o) throws Throwable {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        this.f1473v = (byte) -1;
        this.f1474w = -1;
        m1540S();
        int i10 = 0;
        C0820j c0820jM3400i = AbstractC0818h.m3400i();
        C0823m c0823mM3453a = C0823m.m3453a(c0820jM3400i);
        boolean z2 = false;
        while (!z2) {
            try {
                try {
                    int iM3417a = c0821k.m3417a();
                    switch (iM3417a) {
                        case C0467e.MapAttrs_mapType /* 0 */:
                            z = true;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case C0467e.MapAttrs_uiZoomControls /* 10 */:
                            AbstractC0818h abstractC0818hM3438l = c0821k.m3438l();
                            if ((i10 & 1) != 1) {
                                this.f1457f = new C0775ah();
                                i9 = i10 | 1;
                            } else {
                                i9 = i10;
                            }
                            try {
                                this.f1457f.mo3302a(abstractC0818hM3438l);
                                boolean z3 = z2;
                                i = i9;
                                z = z3;
                                i10 = i;
                                z2 = z;
                            } catch (C0773af e) {
                                e = e;
                                throw e.m3294a(this);
                            } catch (IOException e2) {
                                e = e2;
                                throw new C0773af(e.getMessage()).m3294a(this);
                            } catch (Throwable th) {
                                i10 = i9;
                                th = th;
                                if ((i10 & 1) == 1) {
                                    this.f1457f = new C0801bg(this.f1457f);
                                }
                                if ((i10 & 2) == 2) {
                                    this.f1458g = Collections.unmodifiableList(this.f1458g);
                                }
                                if ((i10 & 4) == 4) {
                                    this.f1459h = Collections.unmodifiableList(this.f1459h);
                                }
                                if ((i10 & 8) == 8) {
                                    this.f1460i = Collections.unmodifiableList(this.f1460i);
                                }
                                if ((i10 & 16) == 16) {
                                    this.f1461j = Collections.unmodifiableList(this.f1461j);
                                }
                                if ((i10 & 32) == 32) {
                                    this.f1462k = Collections.unmodifiableList(this.f1462k);
                                }
                                if ((i10 & 64) == 64) {
                                    this.f1463l = Collections.unmodifiableList(this.f1463l);
                                }
                                if ((i10 & 16384) == 16384) {
                                    this.f1471t = new C0801bg(this.f1471t);
                                }
                                try {
                                    c0823mM3453a.m3456a();
                                } catch (IOException e3) {
                                } finally {
                                    this.f1455d = c0820jM3400i.m3409a();
                                }
                                mo3493R();
                                throw th;
                            }
                            break;
                        case 18:
                            if ((i10 & 2) != 2) {
                                this.f1458g = new ArrayList();
                                i8 = i10 | 2;
                            } else {
                                i8 = i10;
                            }
                            this.f1458g.add(c0821k.m3418a(C0415c.f1519a, c0825o));
                            boolean z4 = z2;
                            i = i8;
                            z = z4;
                            i10 = i;
                            z2 = z;
                            break;
                        case 26:
                            if ((i10 & 4) != 4) {
                                this.f1459h = new ArrayList();
                                i7 = i10 | 4;
                            } else {
                                i7 = i10;
                            }
                            this.f1459h.add(c0821k.m3418a(C0401m.f1440a, c0825o));
                            boolean z5 = z2;
                            i = i7;
                            z = z5;
                            i10 = i;
                            z2 = z;
                            break;
                        case 34:
                            if ((i10 & 8) != 8) {
                                this.f1460i = new ArrayList();
                                i6 = i10 | 8;
                            } else {
                                i6 = i10;
                            }
                            this.f1460i.add(c0821k.m3418a(C0397i.f1422a, c0825o));
                            boolean z6 = z2;
                            i = i6;
                            z = z6;
                            i10 = i;
                            z2 = z;
                            break;
                        case 42:
                            if ((i10 & 16) != 16) {
                                this.f1461j = new ArrayList();
                                i5 = i10 | 16;
                            } else {
                                i5 = i10;
                            }
                            this.f1461j.add(c0821k.m3418a(C0397i.f1422a, c0825o));
                            boolean z7 = z2;
                            i = i5;
                            z = z7;
                            i10 = i;
                            z2 = z;
                            break;
                        case 50:
                            if ((i10 & 32) != 32) {
                                this.f1462k = new ArrayList();
                                i4 = i10 | 32;
                            } else {
                                i4 = i10;
                            }
                            this.f1462k.add(c0821k.m3418a(C0397i.f1422a, c0825o));
                            boolean z8 = z2;
                            i = i4;
                            z = z8;
                            i10 = i;
                            z2 = z;
                            break;
                        case 58:
                            if ((i10 & 64) != 64) {
                                this.f1463l = new ArrayList();
                                i3 = i10 | 64;
                            } else {
                                i3 = i10;
                            }
                            this.f1463l.add(c0821k.m3418a(C0409u.f1492a, c0825o));
                            boolean z9 = z2;
                            i = i3;
                            z = z9;
                            i10 = i;
                            z2 = z;
                            break;
                        case 74:
                            AbstractC0818h abstractC0818hM3438l2 = c0821k.m3438l();
                            this.f1456e |= 1;
                            this.f1464m = abstractC0818hM3438l2;
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 82:
                            AbstractC0818h abstractC0818hM3438l3 = c0821k.m3438l();
                            this.f1456e |= 2;
                            this.f1465n = abstractC0818hM3438l3;
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 98:
                            AbstractC0818h abstractC0818hM3438l4 = c0821k.m3438l();
                            this.f1456e |= 4;
                            this.f1466o = abstractC0818hM3438l4;
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 106:
                            AbstractC0818h abstractC0818hM3438l5 = c0821k.m3438l();
                            this.f1456e |= 8;
                            this.f1467p = abstractC0818hM3438l5;
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 114:
                            C0393e c0393eMo1441n = (this.f1456e & 16) == 16 ? this.f1468q.mo1441n() : null;
                            this.f1468q = (C0391c) c0821k.m3418a(C0391c.f1402a, c0825o);
                            if (c0393eMo1441n != null) {
                                c0393eMo1441n.mo1454a(this.f1468q);
                                this.f1468q = c0393eMo1441n.m1460d();
                            }
                            this.f1456e |= 16;
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 125:
                            this.f1456e |= 32;
                            this.f1469r = c0821k.m3425c();
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 130:
                            AbstractC0818h abstractC0818hM3438l6 = c0821k.m3438l();
                            if ((i10 & 16384) != 16384) {
                                this.f1471t = new C0775ah();
                                i2 = i10 | 16384;
                            } else {
                                i2 = i10;
                            }
                            this.f1471t.mo3302a(abstractC0818hM3438l6);
                            boolean z10 = z2;
                            i = i2;
                            z = z10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 136:
                            this.f1456e |= 128;
                            this.f1472u = c0821k.m3431f();
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        case 144:
                            this.f1456e |= 64;
                            this.f1470s = c0821k.m3435i();
                            z = z2;
                            i = i10;
                            i10 = i;
                            z2 = z;
                            break;
                        default:
                            if (mo3494a(c0821k, c0823mM3453a, c0825o, iM3417a)) {
                                z = z2;
                                i = i10;
                            } else {
                                z = true;
                                i = i10;
                            }
                            i10 = i;
                            z2 = z;
                            break;
                    }
                } catch (C0773af e4) {
                    e = e4;
                } catch (IOException e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if ((i10 & 1) == 1) {
            this.f1457f = new C0801bg(this.f1457f);
        }
        if ((i10 & 2) == 2) {
            this.f1458g = Collections.unmodifiableList(this.f1458g);
        }
        if ((i10 & 4) == 4) {
            this.f1459h = Collections.unmodifiableList(this.f1459h);
        }
        if ((i10 & 8) == 8) {
            this.f1460i = Collections.unmodifiableList(this.f1460i);
        }
        if ((i10 & 16) == 16) {
            this.f1461j = Collections.unmodifiableList(this.f1461j);
        }
        if ((i10 & 32) == 32) {
            this.f1462k = Collections.unmodifiableList(this.f1462k);
        }
        if ((i10 & 64) == 64) {
            this.f1463l = Collections.unmodifiableList(this.f1463l);
        }
        if ((i10 & 16384) == 16384) {
            this.f1471t = new C0801bg(this.f1471t);
        }
        try {
            c0823mM3453a.m3456a();
        } catch (IOException e6) {
        } finally {
            this.f1455d = c0820jM3400i.m3409a();
        }
        mo3493R();
    }

    private C0405q(AbstractC0832v abstractC0832v) {
        super(abstractC0832v);
        this.f1473v = (byte) -1;
        this.f1474w = -1;
        this.f1455d = abstractC0832v.m3496r();
    }

    private C0405q(boolean z) {
        this.f1473v = (byte) -1;
        this.f1474w = -1;
        this.f1455d = AbstractC0818h.f2420a;
    }

    /* JADX INFO: renamed from: N */
    public static C0407s m1539N() {
        return C0407s.m1617s();
    }

    /* JADX INFO: renamed from: S */
    private void m1540S() {
        this.f1457f = C0775ah.f2326a;
        this.f1458g = Collections.emptyList();
        this.f1459h = Collections.emptyList();
        this.f1460i = Collections.emptyList();
        this.f1461j = Collections.emptyList();
        this.f1462k = Collections.emptyList();
        this.f1463l = Collections.emptyList();
        this.f1464m = "";
        this.f1465n = "";
        this.f1466o = "0";
        this.f1467p = "";
        this.f1468q = C0391c.m1422a();
        this.f1469r = 0.0f;
        this.f1470s = false;
        this.f1471t = C0775ah.f2326a;
        this.f1472u = 0;
    }

    /* JADX INFO: renamed from: a */
    public static C0405q m1544a() {
        return f1453c;
    }

    /* JADX INFO: renamed from: a */
    public static C0407s m1545a(C0405q c0405q) {
        return m1539N().mo1454a(c0405q);
    }

    /* JADX INFO: renamed from: A */
    public String m1573A() {
        Object obj = this.f1466o;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC0818h abstractC0818h = (AbstractC0818h) obj;
        String strM3406f = abstractC0818h.m3406f();
        if (abstractC0818h.mo3316g()) {
            this.f1466o = strM3406f;
        }
        return strM3406f;
    }

    /* JADX INFO: renamed from: B */
    public boolean m1574B() {
        return (this.f1456e & 8) == 8;
    }

    /* JADX INFO: renamed from: C */
    public String m1575C() {
        Object obj = this.f1467p;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC0818h abstractC0818h = (AbstractC0818h) obj;
        String strM3406f = abstractC0818h.m3406f();
        if (abstractC0818h.mo3316g()) {
            this.f1467p = strM3406f;
        }
        return strM3406f;
    }

    /* JADX INFO: renamed from: D */
    public boolean m1576D() {
        return (this.f1456e & 16) == 16;
    }

    /* JADX INFO: renamed from: E */
    public C0391c m1577E() {
        return this.f1468q;
    }

    /* JADX INFO: renamed from: F */
    public boolean m1578F() {
        return (this.f1456e & 32) == 32;
    }

    /* JADX INFO: renamed from: G */
    public float m1579G() {
        return this.f1469r;
    }

    /* JADX INFO: renamed from: H */
    public boolean m1580H() {
        return (this.f1456e & 64) == 64;
    }

    /* JADX INFO: renamed from: I */
    public boolean m1581I() {
        return this.f1470s;
    }

    /* JADX INFO: renamed from: J */
    public List m1582J() {
        return this.f1471t;
    }

    /* JADX INFO: renamed from: K */
    public int m1583K() {
        return this.f1471t.size();
    }

    /* JADX INFO: renamed from: L */
    public boolean m1584L() {
        return (this.f1456e & 128) == 128;
    }

    /* JADX INFO: renamed from: M */
    public int m1585M() {
        return this.f1472u;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public C0407s mo1442o() {
        return m1539N();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public C0407s mo1441n() {
        return m1545a(this);
    }

    /* JADX INFO: renamed from: a */
    public C0415c m1588a(int i) {
        return (C0415c) this.f1458g.get(i);
    }

    /* JADX INFO: renamed from: b */
    public C0401m m1589b(int i) {
        return (C0401m) this.f1459h.get(i);
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0405q mo1443p() {
        return f1453c;
    }

    /* JADX INFO: renamed from: c */
    public C0397i m1591c(int i) {
        return (C0397i) this.f1460i.get(i);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0830t, com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: c */
    public InterfaceC0784aq mo1431c() {
        return f1452a;
    }

    /* JADX INFO: renamed from: d */
    public C0397i m1592d(int i) {
        return (C0397i) this.f1461j.get(i);
    }

    /* JADX INFO: renamed from: d */
    public List m1593d() {
        return this.f1457f;
    }

    /* JADX INFO: renamed from: e */
    public int m1594e() {
        return this.f1457f.size();
    }

    /* JADX INFO: renamed from: e */
    public C0397i m1595e(int i) {
        return (C0397i) this.f1462k.get(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0405q)) {
            return super.equals(obj);
        }
        C0405q c0405q = (C0405q) obj;
        boolean z = (((((((m1593d().equals(c0405q.m1593d())) && m1596f().equals(c0405q.m1596f())) && m1598h().equals(c0405q.m1598h())) && m1600k().equals(c0405q.m1600k())) && m1602m().equals(c0405q.m1602m())) && m1604r().equals(c0405q.m1604r())) && m1606t().equals(c0405q.m1606t())) && m1608v() == c0405q.m1608v();
        if (m1608v()) {
            z = z && m1609w().equals(c0405q.m1609w());
        }
        boolean z2 = z && m1610x() == c0405q.m1610x();
        if (m1610x()) {
            z2 = z2 && m1611y().equals(c0405q.m1611y());
        }
        boolean z3 = z2 && m1612z() == c0405q.m1612z();
        if (m1612z()) {
            z3 = z3 && m1573A().equals(c0405q.m1573A());
        }
        boolean z4 = z3 && m1574B() == c0405q.m1574B();
        if (m1574B()) {
            z4 = z4 && m1575C().equals(c0405q.m1575C());
        }
        boolean z5 = z4 && m1576D() == c0405q.m1576D();
        if (m1576D()) {
            z5 = z5 && m1577E().equals(c0405q.m1577E());
        }
        boolean z6 = z5 && m1578F() == c0405q.m1578F();
        if (m1578F()) {
            z6 = z6 && Float.floatToIntBits(m1579G()) == Float.floatToIntBits(c0405q.m1579G());
        }
        boolean z7 = z6 && m1580H() == c0405q.m1580H();
        if (m1580H()) {
            z7 = z7 && m1581I() == c0405q.m1581I();
        }
        boolean z8 = (z7 && m1582J().equals(c0405q.m1582J())) && m1584L() == c0405q.m1584L();
        if (m1584L()) {
            return z8 && m1585M() == c0405q.m1585M();
        }
        return z8;
    }

    /* JADX INFO: renamed from: f */
    public List m1596f() {
        return this.f1458g;
    }

    /* JADX INFO: renamed from: g */
    public int m1597g() {
        return this.f1458g.size();
    }

    /* JADX INFO: renamed from: h */
    public List m1598h() {
        return this.f1459h;
    }

    public int hashCode() {
        if (this.f2315b != 0) {
            return this.f2315b;
        }
        int iHashCode = C0405q.class.hashCode() + 779;
        if (m1594e() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + m1593d().hashCode();
        }
        if (m1597g() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + m1596f().hashCode();
        }
        if (m1599i() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + m1598h().hashCode();
        }
        if (m1601l() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + m1600k().hashCode();
        }
        if (m1603q() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + m1602m().hashCode();
        }
        if (m1605s() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + m1604r().hashCode();
        }
        if (m1607u() > 0) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + m1606t().hashCode();
        }
        if (m1608v()) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + m1609w().hashCode();
        }
        if (m1610x()) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + m1611y().hashCode();
        }
        if (m1612z()) {
            iHashCode = (((iHashCode * 37) + 12) * 53) + m1573A().hashCode();
        }
        if (m1574B()) {
            iHashCode = (((iHashCode * 37) + 13) * 53) + m1575C().hashCode();
        }
        if (m1576D()) {
            iHashCode = (((iHashCode * 37) + 14) * 53) + m1577E().hashCode();
        }
        if (m1578F()) {
            iHashCode = (((iHashCode * 37) + 15) * 53) + Float.floatToIntBits(m1579G());
        }
        if (m1580H()) {
            iHashCode = (((iHashCode * 37) + 18) * 53) + C0770ac.m3282a(m1581I());
        }
        if (m1583K() > 0) {
            iHashCode = (((iHashCode * 37) + 16) * 53) + m1582J().hashCode();
        }
        if (m1584L()) {
            iHashCode = (((iHashCode * 37) + 17) * 53) + m1585M();
        }
        int iHashCode2 = (iHashCode * 29) + this.f1455d.hashCode();
        this.f2315b = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: i */
    public int m1599i() {
        return this.f1459h.size();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: j */
    public final boolean mo1438j() {
        byte b = this.f1473v;
        if (b != -1) {
            return b == 1;
        }
        for (int i = 0; i < m1597g(); i++) {
            if (!m1588a(i).mo1438j()) {
                this.f1473v = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < m1599i(); i2++) {
            if (!m1589b(i2).mo1438j()) {
                this.f1473v = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m1601l(); i3++) {
            if (!m1591c(i3).mo1438j()) {
                this.f1473v = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < m1603q(); i4++) {
            if (!m1592d(i4).mo1438j()) {
                this.f1473v = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < m1605s(); i5++) {
            if (!m1595e(i5).mo1438j()) {
                this.f1473v = (byte) 0;
                return false;
            }
        }
        this.f1473v = (byte) 1;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public List m1600k() {
        return this.f1460i;
    }

    /* JADX INFO: renamed from: l */
    public int m1601l() {
        return this.f1460i.size();
    }

    /* JADX INFO: renamed from: m */
    public List m1602m() {
        return this.f1461j;
    }

    /* JADX INFO: renamed from: q */
    public int m1603q() {
        return this.f1461j.size();
    }

    /* JADX INFO: renamed from: r */
    public List m1604r() {
        return this.f1462k;
    }

    /* JADX INFO: renamed from: s */
    public int m1605s() {
        return this.f1462k.size();
    }

    /* JADX INFO: renamed from: t */
    public List m1606t() {
        return this.f1463l;
    }

    /* JADX INFO: renamed from: u */
    public int m1607u() {
        return this.f1463l.size();
    }

    /* JADX INFO: renamed from: v */
    public boolean m1608v() {
        return (this.f1456e & 1) == 1;
    }

    /* JADX INFO: renamed from: w */
    public String m1609w() {
        Object obj = this.f1464m;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC0818h abstractC0818h = (AbstractC0818h) obj;
        String strM3406f = abstractC0818h.m3406f();
        if (abstractC0818h.mo3316g()) {
            this.f1464m = strM3406f;
        }
        return strM3406f;
    }

    /* JADX INFO: renamed from: x */
    public boolean m1610x() {
        return (this.f1456e & 2) == 2;
    }

    /* JADX INFO: renamed from: y */
    public String m1611y() {
        Object obj = this.f1465n;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC0818h abstractC0818h = (AbstractC0818h) obj;
        String strM3406f = abstractC0818h.m3406f();
        if (abstractC0818h.mo3316g()) {
            this.f1465n = strM3406f;
        }
        return strM3406f;
    }

    /* JADX INFO: renamed from: z */
    public boolean m1612z() {
        return (this.f1456e & 4) == 4;
    }
}
