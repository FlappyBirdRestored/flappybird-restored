package com.google.analytics.p009b.p010a.p011a;

import com.google.android.gms.C0467e;
import com.google.tagmanager.p020a.AbstractC0818h;
import com.google.tagmanager.p020a.AbstractC0833w;
import com.google.tagmanager.p020a.AbstractC0834x;
import com.google.tagmanager.p020a.C0770ac;
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

/* JADX INFO: renamed from: com.google.analytics.b.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0415c extends AbstractC0834x implements InterfaceC0422j {

    /* JADX INFO: renamed from: d */
    private final AbstractC0818h f1522d;

    /* JADX INFO: renamed from: e */
    private int f1523e;

    /* JADX INFO: renamed from: f */
    private EnumC0420h f1524f;

    /* JADX INFO: renamed from: g */
    private Object f1525g;

    /* JADX INFO: renamed from: h */
    private List f1526h;

    /* JADX INFO: renamed from: i */
    private List f1527i;

    /* JADX INFO: renamed from: j */
    private List f1528j;

    /* JADX INFO: renamed from: k */
    private Object f1529k;

    /* JADX INFO: renamed from: l */
    private Object f1530l;

    /* JADX INFO: renamed from: m */
    private long f1531m;

    /* JADX INFO: renamed from: n */
    private boolean f1532n;

    /* JADX INFO: renamed from: o */
    private List f1533o;

    /* JADX INFO: renamed from: p */
    private List f1534p;

    /* JADX INFO: renamed from: q */
    private boolean f1535q;

    /* JADX INFO: renamed from: r */
    private byte f1536r;

    /* JADX INFO: renamed from: s */
    private int f1537s;

    /* JADX INFO: renamed from: a */
    public static InterfaceC0784aq f1519a = new C0416d();

    /* JADX INFO: renamed from: t */
    private static volatile InterfaceC0783ap f1521t = null;

    /* JADX INFO: renamed from: c */
    private static final C0415c f1520c = new C0415c(true);

    static {
        f1520c.m1714J();
    }

    private C0415c(C0821k c0821k, C0825o c0825o) throws Throwable {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        this.f1536r = (byte) -1;
        this.f1537s = -1;
        m1714J();
        int i7 = 0;
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
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                            int iM3440n = c0821k.m3440n();
                            EnumC0420h enumC0420hM1805a = EnumC0420h.m1805a(iM3440n);
                            if (enumC0420hM1805a == null) {
                                c0823mM3453a.m3467d(iM3417a);
                                c0823mM3453a.m3467d(iM3440n);
                                z = z2;
                                i2 = i7;
                            } else {
                                this.f1523e |= 1;
                                this.f1524f = enumC0420hM1805a;
                                z = z2;
                                i2 = i7;
                            }
                            i7 = i2;
                            z2 = z;
                            break;
                        case 18:
                            AbstractC0818h abstractC0818hM3438l = c0821k.m3438l();
                            this.f1523e |= 2;
                            this.f1525g = abstractC0818hM3438l;
                            z = z2;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 26:
                            if ((i7 & 4) != 4) {
                                this.f1526h = new ArrayList();
                                i6 = i7 | 4;
                            } else {
                                i6 = i7;
                            }
                            try {
                                this.f1526h.add(c0821k.m3418a(f1519a, c0825o));
                                boolean z3 = z2;
                                i2 = i6;
                                z = z3;
                                i7 = i2;
                                z2 = z;
                            } catch (C0773af e) {
                                e = e;
                                throw e.m3294a(this);
                            } catch (IOException e2) {
                                e = e2;
                                throw new C0773af(e.getMessage()).m3294a(this);
                            } catch (Throwable th) {
                                i7 = i6;
                                th = th;
                                if ((i7 & 4) == 4) {
                                    this.f1526h = Collections.unmodifiableList(this.f1526h);
                                }
                                if ((i7 & 8) == 8) {
                                    this.f1527i = Collections.unmodifiableList(this.f1527i);
                                }
                                if ((i7 & 16) == 16) {
                                    this.f1528j = Collections.unmodifiableList(this.f1528j);
                                }
                                if ((i7 & 1024) == 1024) {
                                    this.f1534p = Collections.unmodifiableList(this.f1534p);
                                }
                                if ((i7 & 512) == 512) {
                                    this.f1533o = Collections.unmodifiableList(this.f1533o);
                                }
                                try {
                                    c0823mM3453a.m3456a();
                                } catch (IOException e3) {
                                } finally {
                                    this.f1522d = c0820jM3400i.m3409a();
                                }
                                mo3493R();
                                throw th;
                            }
                            break;
                        case 34:
                            if ((i7 & 8) != 8) {
                                this.f1527i = new ArrayList();
                                i5 = i7 | 8;
                            } else {
                                i5 = i7;
                            }
                            this.f1527i.add(c0821k.m3418a(f1519a, c0825o));
                            boolean z4 = z2;
                            i2 = i5;
                            z = z4;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 42:
                            if ((i7 & 16) != 16) {
                                this.f1528j = new ArrayList();
                                i4 = i7 | 16;
                            } else {
                                i4 = i7;
                            }
                            this.f1528j.add(c0821k.m3418a(f1519a, c0825o));
                            boolean z5 = z2;
                            i2 = i4;
                            z = z5;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 50:
                            AbstractC0818h abstractC0818hM3438l2 = c0821k.m3438l();
                            this.f1523e |= 4;
                            this.f1529k = abstractC0818hM3438l2;
                            z = z2;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 58:
                            AbstractC0818h abstractC0818hM3438l3 = c0821k.m3438l();
                            this.f1523e |= 8;
                            this.f1530l = abstractC0818hM3438l3;
                            z = z2;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 64:
                            this.f1523e |= 16;
                            this.f1531m = c0821k.m3429e();
                            z = z2;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 72:
                            this.f1523e |= 64;
                            this.f1535q = c0821k.m3435i();
                            z = z2;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 80:
                            int iM3440n2 = c0821k.m3440n();
                            EnumC0418f enumC0418fM1803a = EnumC0418f.m1803a(iM3440n2);
                            if (enumC0418fM1803a == null) {
                                c0823mM3453a.m3467d(iM3417a);
                                c0823mM3453a.m3467d(iM3440n2);
                                z = z2;
                                i2 = i7;
                            } else {
                                if ((i7 & 1024) != 1024) {
                                    this.f1534p = new ArrayList();
                                    i3 = i7 | 1024;
                                } else {
                                    i3 = i7;
                                }
                                this.f1534p.add(enumC0418fM1803a);
                                boolean z6 = z2;
                                i2 = i3;
                                z = z6;
                            }
                            i7 = i2;
                            z2 = z;
                            break;
                        case 82:
                            int iM3426c = c0821k.m3426c(c0821k.m3445s());
                            int i8 = i7;
                            while (c0821k.m3449w() > 0) {
                                int iM3440n3 = c0821k.m3440n();
                                EnumC0418f enumC0418fM1803a2 = EnumC0418f.m1803a(iM3440n3);
                                if (enumC0418fM1803a2 == null) {
                                    c0823mM3453a.m3467d(iM3417a);
                                    c0823mM3453a.m3467d(iM3440n3);
                                } else {
                                    if ((i8 & 1024) != 1024) {
                                        this.f1534p = new ArrayList();
                                        i8 |= 1024;
                                    }
                                    this.f1534p.add(enumC0418fM1803a2);
                                }
                            }
                            c0821k.m3428d(iM3426c);
                            boolean z7 = z2;
                            i2 = i8;
                            z = z7;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 90:
                            if ((i7 & 512) != 512) {
                                this.f1533o = new ArrayList();
                                i = i7 | 512;
                            } else {
                                i = i7;
                            }
                            this.f1533o.add(c0821k.m3418a(f1519a, c0825o));
                            boolean z8 = z2;
                            i2 = i;
                            z = z8;
                            i7 = i2;
                            z2 = z;
                            break;
                        case 96:
                            this.f1523e |= 32;
                            this.f1532n = c0821k.m3435i();
                            z = z2;
                            i2 = i7;
                            i7 = i2;
                            z2 = z;
                            break;
                        default:
                            if (mo3494a(c0821k, c0823mM3453a, c0825o, iM3417a)) {
                                z = z2;
                                i2 = i7;
                            } else {
                                z = true;
                                i2 = i7;
                            }
                            i7 = i2;
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
        if ((i7 & 4) == 4) {
            this.f1526h = Collections.unmodifiableList(this.f1526h);
        }
        if ((i7 & 8) == 8) {
            this.f1527i = Collections.unmodifiableList(this.f1527i);
        }
        if ((i7 & 16) == 16) {
            this.f1528j = Collections.unmodifiableList(this.f1528j);
        }
        if ((i7 & 1024) == 1024) {
            this.f1534p = Collections.unmodifiableList(this.f1534p);
        }
        if ((i7 & 512) == 512) {
            this.f1533o = Collections.unmodifiableList(this.f1533o);
        }
        try {
            c0823mM3453a.m3456a();
        } catch (IOException e6) {
        } finally {
            this.f1522d = c0820jM3400i.m3409a();
        }
        mo3493R();
    }

    private C0415c(AbstractC0833w abstractC0833w) {
        super(abstractC0833w);
        this.f1536r = (byte) -1;
        this.f1537s = -1;
        this.f1522d = abstractC0833w.m3496r();
    }

    private C0415c(boolean z) {
        this.f1536r = (byte) -1;
        this.f1537s = -1;
        this.f1522d = AbstractC0818h.f2420a;
    }

    /* JADX INFO: renamed from: F */
    public static C0417e m1713F() {
        return C0417e.m1773u();
    }

    /* JADX INFO: renamed from: J */
    private void m1714J() {
        this.f1524f = EnumC0420h.STRING;
        this.f1525g = "";
        this.f1526h = Collections.emptyList();
        this.f1527i = Collections.emptyList();
        this.f1528j = Collections.emptyList();
        this.f1529k = "";
        this.f1530l = "";
        this.f1531m = 0L;
        this.f1532n = false;
        this.f1533o = Collections.emptyList();
        this.f1534p = Collections.emptyList();
        this.f1535q = false;
    }

    /* JADX INFO: renamed from: a */
    public static C0415c m1717a() {
        return f1520c;
    }

    /* JADX INFO: renamed from: a */
    public static C0417e m1718a(C0415c c0415c) {
        return m1713F().mo1454a(c0415c);
    }

    /* JADX INFO: renamed from: A */
    public int m1739A() {
        return this.f1533o.size();
    }

    /* JADX INFO: renamed from: B */
    public List m1740B() {
        return this.f1534p;
    }

    /* JADX INFO: renamed from: C */
    public int m1741C() {
        return this.f1534p.size();
    }

    /* JADX INFO: renamed from: D */
    public boolean m1742D() {
        return (this.f1523e & 64) == 64;
    }

    /* JADX INFO: renamed from: E */
    public boolean m1743E() {
        return this.f1535q;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public C0417e mo1442o() {
        return m1713F();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C0417e mo1441n() {
        return m1718a(this);
    }

    /* JADX INFO: renamed from: a */
    public C0415c m1746a(int i) {
        return (C0415c) this.f1526h.get(i);
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0415c mo1443p() {
        return f1520c;
    }

    /* JADX INFO: renamed from: b */
    public C0415c m1748b(int i) {
        return (C0415c) this.f1527i.get(i);
    }

    /* JADX INFO: renamed from: c */
    public C0415c m1749c(int i) {
        return (C0415c) this.f1528j.get(i);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0830t, com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: c */
    public InterfaceC0784aq mo1431c() {
        return f1519a;
    }

    /* JADX INFO: renamed from: d */
    public C0415c m1750d(int i) {
        return (C0415c) this.f1533o.get(i);
    }

    /* JADX INFO: renamed from: d */
    public boolean m1751d() {
        return (this.f1523e & 1) == 1;
    }

    /* JADX INFO: renamed from: e */
    public EnumC0420h m1752e() {
        return this.f1524f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0415c)) {
            return super.equals(obj);
        }
        C0415c c0415c = (C0415c) obj;
        boolean z = m1751d() == c0415c.m1751d();
        if (m1751d()) {
            z = z && m1752e() == c0415c.m1752e();
        }
        boolean z2 = z && m1753f() == c0415c.m1753f();
        if (m1753f()) {
            z2 = z2 && m1754g().equals(c0415c.m1754g());
        }
        boolean z3 = (((z2 && m1755h().equals(c0415c.m1755h())) && m1757k().equals(c0415c.m1757k())) && m1759m().equals(c0415c.m1759m())) && m1761r() == c0415c.m1761r();
        if (m1761r()) {
            z3 = z3 && m1762s().equals(c0415c.m1762s());
        }
        boolean z4 = z3 && m1763t() == c0415c.m1763t();
        if (m1763t()) {
            z4 = z4 && m1764u().equals(c0415c.m1764u());
        }
        boolean z5 = z4 && m1765v() == c0415c.m1765v();
        if (m1765v()) {
            z5 = z5 && m1766w() == c0415c.m1766w();
        }
        boolean z6 = z5 && m1767x() == c0415c.m1767x();
        if (m1767x()) {
            z6 = z6 && m1768y() == c0415c.m1768y();
        }
        boolean z7 = ((z6 && m1769z().equals(c0415c.m1769z())) && m1740B().equals(c0415c.m1740B())) && m1742D() == c0415c.m1742D();
        if (m1742D()) {
            return z7 && m1743E() == c0415c.m1743E();
        }
        return z7;
    }

    /* JADX INFO: renamed from: f */
    public boolean m1753f() {
        return (this.f1523e & 2) == 2;
    }

    /* JADX INFO: renamed from: g */
    public String m1754g() {
        Object obj = this.f1525g;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC0818h abstractC0818h = (AbstractC0818h) obj;
        String strM3406f = abstractC0818h.m3406f();
        if (abstractC0818h.mo3316g()) {
            this.f1525g = strM3406f;
        }
        return strM3406f;
    }

    /* JADX INFO: renamed from: h */
    public List m1755h() {
        return this.f1526h;
    }

    public int hashCode() {
        if (this.f2315b != 0) {
            return this.f2315b;
        }
        int iHashCode = C0415c.class.hashCode() + 779;
        if (m1751d()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + C0770ac.m3280a(m1752e());
        }
        if (m1753f()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + m1754g().hashCode();
        }
        if (m1756i() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + m1755h().hashCode();
        }
        if (m1758l() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + m1757k().hashCode();
        }
        if (m1760q() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + m1759m().hashCode();
        }
        if (m1761r()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + m1762s().hashCode();
        }
        if (m1763t()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + m1764u().hashCode();
        }
        if (m1765v()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + C0770ac.m3279a(m1766w());
        }
        if (m1767x()) {
            iHashCode = (((iHashCode * 37) + 12) * 53) + C0770ac.m3282a(m1768y());
        }
        if (m1739A() > 0) {
            iHashCode = (((iHashCode * 37) + 11) * 53) + m1769z().hashCode();
        }
        if (m1741C() > 0) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + C0770ac.m3281a(m1740B());
        }
        if (m1742D()) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + C0770ac.m3282a(m1743E());
        }
        int iHashCode2 = (iHashCode * 29) + this.f1522d.hashCode();
        this.f2315b = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: i */
    public int m1756i() {
        return this.f1526h.size();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: j */
    public final boolean mo1438j() {
        byte b = this.f1536r;
        if (b != -1) {
            return b == 1;
        }
        if (!m1751d()) {
            this.f1536r = (byte) 0;
            return false;
        }
        for (int i = 0; i < m1756i(); i++) {
            if (!m1746a(i).mo1438j()) {
                this.f1536r = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < m1758l(); i2++) {
            if (!m1748b(i2).mo1438j()) {
                this.f1536r = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m1760q(); i3++) {
            if (!m1749c(i3).mo1438j()) {
                this.f1536r = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < m1739A(); i4++) {
            if (!m1750d(i4).mo1438j()) {
                this.f1536r = (byte) 0;
                return false;
            }
        }
        if (m3503I()) {
            this.f1536r = (byte) 1;
            return true;
        }
        this.f1536r = (byte) 0;
        return false;
    }

    /* JADX INFO: renamed from: k */
    public List m1757k() {
        return this.f1527i;
    }

    /* JADX INFO: renamed from: l */
    public int m1758l() {
        return this.f1527i.size();
    }

    /* JADX INFO: renamed from: m */
    public List m1759m() {
        return this.f1528j;
    }

    /* JADX INFO: renamed from: q */
    public int m1760q() {
        return this.f1528j.size();
    }

    /* JADX INFO: renamed from: r */
    public boolean m1761r() {
        return (this.f1523e & 4) == 4;
    }

    /* JADX INFO: renamed from: s */
    public String m1762s() {
        Object obj = this.f1529k;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC0818h abstractC0818h = (AbstractC0818h) obj;
        String strM3406f = abstractC0818h.m3406f();
        if (abstractC0818h.mo3316g()) {
            this.f1529k = strM3406f;
        }
        return strM3406f;
    }

    /* JADX INFO: renamed from: t */
    public boolean m1763t() {
        return (this.f1523e & 8) == 8;
    }

    /* JADX INFO: renamed from: u */
    public String m1764u() {
        Object obj = this.f1530l;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC0818h abstractC0818h = (AbstractC0818h) obj;
        String strM3406f = abstractC0818h.m3406f();
        if (abstractC0818h.mo3316g()) {
            this.f1530l = strM3406f;
        }
        return strM3406f;
    }

    /* JADX INFO: renamed from: v */
    public boolean m1765v() {
        return (this.f1523e & 16) == 16;
    }

    /* JADX INFO: renamed from: w */
    public long m1766w() {
        return this.f1531m;
    }

    /* JADX INFO: renamed from: x */
    public boolean m1767x() {
        return (this.f1523e & 32) == 32;
    }

    /* JADX INFO: renamed from: y */
    public boolean m1768y() {
        return this.f1532n;
    }

    /* JADX INFO: renamed from: z */
    public List m1769z() {
        return this.f1533o;
    }
}
