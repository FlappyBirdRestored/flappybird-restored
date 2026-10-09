package com.google.analytics.p007a.p008a;

import com.google.android.gms.C0467e;
import com.google.tagmanager.p020a.AbstractC0818h;
import com.google.tagmanager.p020a.AbstractC0830t;
import com.google.tagmanager.p020a.AbstractC0832v;
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

/* JADX INFO: renamed from: com.google.analytics.a.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0397i extends AbstractC0830t implements InterfaceC0400l {

    /* JADX INFO: renamed from: d */
    private final AbstractC0818h f1425d;

    /* JADX INFO: renamed from: e */
    private int f1426e;

    /* JADX INFO: renamed from: f */
    private List f1427f;

    /* JADX INFO: renamed from: g */
    private int f1428g;

    /* JADX INFO: renamed from: h */
    private int f1429h;

    /* JADX INFO: renamed from: i */
    private boolean f1430i;

    /* JADX INFO: renamed from: j */
    private boolean f1431j;

    /* JADX INFO: renamed from: k */
    private byte f1432k;

    /* JADX INFO: renamed from: l */
    private int f1433l;

    /* JADX INFO: renamed from: a */
    public static InterfaceC0784aq f1422a = new C0398j();

    /* JADX INFO: renamed from: m */
    private static volatile InterfaceC0783ap f1424m = null;

    /* JADX INFO: renamed from: c */
    private static final C0397i f1423c = new C0397i(true);

    static {
        f1423c.m1480u();
    }

    private C0397i(C0821k c0821k, C0825o c0825o) {
        boolean z = false;
        this.f1432k = (byte) -1;
        this.f1433l = -1;
        m1480u();
        C0820j c0820jM3400i = AbstractC0818h.m3400i();
        C0823m c0823mM3453a = C0823m.m3453a(c0820jM3400i);
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM3417a = c0821k.m3417a();
                    switch (iM3417a) {
                        case C0467e.MapAttrs_mapType /* 0 */:
                            z = true;
                            break;
                        case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                            this.f1426e |= 8;
                            this.f1431j = c0821k.m3435i();
                            break;
                        case 16:
                            this.f1426e |= 1;
                            this.f1428g = c0821k.m3431f();
                            break;
                        case 24:
                            if (!(z2 & true)) {
                                this.f1427f = new ArrayList();
                                z2 |= true;
                            }
                            this.f1427f.add(Integer.valueOf(c0821k.m3431f()));
                            break;
                        case 26:
                            int iM3426c = c0821k.m3426c(c0821k.m3445s());
                            if (!(z2 & true) && c0821k.m3449w() > 0) {
                                this.f1427f = new ArrayList();
                                z2 |= true;
                            }
                            while (c0821k.m3449w() > 0) {
                                this.f1427f.add(Integer.valueOf(c0821k.m3431f()));
                            }
                            c0821k.m3428d(iM3426c);
                            break;
                        case 32:
                            this.f1426e |= 2;
                            this.f1429h = c0821k.m3431f();
                            break;
                        case 48:
                            this.f1426e |= 4;
                            this.f1430i = c0821k.m3435i();
                            break;
                        default:
                            if (!mo3494a(c0821k, c0823mM3453a, c0825o, iM3417a)) {
                                z = true;
                            }
                            break;
                    }
                } catch (C0773af e) {
                    throw e.m3294a(this);
                } catch (IOException e2) {
                    throw new C0773af(e2.getMessage()).m3294a(this);
                }
            } catch (Throwable th) {
                if (z2 & true) {
                    this.f1427f = Collections.unmodifiableList(this.f1427f);
                }
                try {
                    c0823mM3453a.m3456a();
                } catch (IOException e3) {
                } finally {
                    this.f1425d = c0820jM3400i.m3409a();
                }
                mo3493R();
                throw th;
            }
        }
        if (z2 & true) {
            this.f1427f = Collections.unmodifiableList(this.f1427f);
        }
        try {
            c0823mM3453a.m3456a();
        } catch (IOException e4) {
        } finally {
            this.f1425d = c0820jM3400i.m3409a();
        }
        mo3493R();
    }

    private C0397i(AbstractC0832v abstractC0832v) {
        super(abstractC0832v);
        this.f1432k = (byte) -1;
        this.f1433l = -1;
        this.f1425d = abstractC0832v.m3496r();
    }

    private C0397i(boolean z) {
        this.f1432k = (byte) -1;
        this.f1433l = -1;
        this.f1425d = AbstractC0818h.f2420a;
    }

    /* JADX INFO: renamed from: a */
    public static C0397i m1470a() {
        return f1423c;
    }

    /* JADX INFO: renamed from: a */
    public static C0399k m1471a(C0397i c0397i) {
        return m1479r().mo1454a(c0397i);
    }

    /* JADX INFO: renamed from: r */
    public static C0399k m1479r() {
        return C0399k.m1497m();
    }

    /* JADX INFO: renamed from: u */
    private void m1480u() {
        this.f1427f = Collections.emptyList();
        this.f1428g = 0;
        this.f1429h = 0;
        this.f1430i = false;
        this.f1431j = false;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0397i mo1443p() {
        return f1423c;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0830t, com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: c */
    public InterfaceC0784aq mo1431c() {
        return f1422a;
    }

    /* JADX INFO: renamed from: d */
    public List m1482d() {
        return this.f1427f;
    }

    /* JADX INFO: renamed from: e */
    public int m1483e() {
        return this.f1427f.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0397i)) {
            return super.equals(obj);
        }
        C0397i c0397i = (C0397i) obj;
        boolean z = (m1482d().equals(c0397i.m1482d())) && m1484f() == c0397i.m1484f();
        if (m1484f()) {
            z = z && m1485g() == c0397i.m1485g();
        }
        boolean z2 = z && m1486h() == c0397i.m1486h();
        if (m1486h()) {
            z2 = z2 && m1487i() == c0397i.m1487i();
        }
        boolean z3 = z2 && m1488k() == c0397i.m1488k();
        if (m1488k()) {
            z3 = z3 && m1489l() == c0397i.m1489l();
        }
        boolean z4 = z3 && m1490m() == c0397i.m1490m();
        if (m1490m()) {
            return z4 && m1491q() == c0397i.m1491q();
        }
        return z4;
    }

    /* JADX INFO: renamed from: f */
    public boolean m1484f() {
        return (this.f1426e & 1) == 1;
    }

    /* JADX INFO: renamed from: g */
    public int m1485g() {
        return this.f1428g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m1486h() {
        return (this.f1426e & 2) == 2;
    }

    public int hashCode() {
        if (this.f2315b != 0) {
            return this.f2315b;
        }
        int iHashCode = C0397i.class.hashCode() + 779;
        if (m1483e() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + m1482d().hashCode();
        }
        if (m1484f()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + m1485g();
        }
        if (m1486h()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + m1487i();
        }
        if (m1488k()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + C0770ac.m3282a(m1489l());
        }
        if (m1490m()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + C0770ac.m3282a(m1491q());
        }
        int iHashCode2 = (iHashCode * 29) + this.f1425d.hashCode();
        this.f2315b = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: i */
    public int m1487i() {
        return this.f1429h;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: j */
    public final boolean mo1438j() {
        byte b = this.f1432k;
        if (b != -1) {
            return b == 1;
        }
        if (m1484f()) {
            this.f1432k = (byte) 1;
            return true;
        }
        this.f1432k = (byte) 0;
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m1488k() {
        return (this.f1426e & 4) == 4;
    }

    /* JADX INFO: renamed from: l */
    public boolean m1489l() {
        return this.f1430i;
    }

    /* JADX INFO: renamed from: m */
    public boolean m1490m() {
        return (this.f1426e & 8) == 8;
    }

    /* JADX INFO: renamed from: q */
    public boolean m1491q() {
        return this.f1431j;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0399k mo1442o() {
        return m1479r();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public C0399k mo1441n() {
        return m1471a(this);
    }
}
