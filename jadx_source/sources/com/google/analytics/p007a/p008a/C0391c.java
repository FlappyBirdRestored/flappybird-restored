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

/* JADX INFO: renamed from: com.google.analytics.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0391c extends AbstractC0830t implements InterfaceC0396h {

    /* JADX INFO: renamed from: d */
    private final AbstractC0818h f1405d;

    /* JADX INFO: renamed from: e */
    private int f1406e;

    /* JADX INFO: renamed from: f */
    private EnumC0394f f1407f;

    /* JADX INFO: renamed from: g */
    private int f1408g;

    /* JADX INFO: renamed from: h */
    private int f1409h;

    /* JADX INFO: renamed from: i */
    private byte f1410i;

    /* JADX INFO: renamed from: j */
    private int f1411j;

    /* JADX INFO: renamed from: a */
    public static InterfaceC0784aq f1402a = new C0392d();

    /* JADX INFO: renamed from: k */
    private static volatile InterfaceC0783ap f1404k = null;

    /* JADX INFO: renamed from: c */
    private static final C0391c f1403c = new C0391c(true);

    static {
        f1403c.m1429q();
    }

    private C0391c(C0821k c0821k, C0825o c0825o) {
        this.f1410i = (byte) -1;
        this.f1411j = -1;
        m1429q();
        C0820j c0820jM3400i = AbstractC0818h.m3400i();
        C0823m c0823mM3453a = C0823m.m3453a(c0820jM3400i);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM3417a = c0821k.m3417a();
                    switch (iM3417a) {
                        case C0467e.MapAttrs_mapType /* 0 */:
                            z = true;
                            break;
                        case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                            int iM3440n = c0821k.m3440n();
                            EnumC0394f enumC0394fM1465a = EnumC0394f.m1465a(iM3440n);
                            if (enumC0394fM1465a != null) {
                                this.f1406e |= 1;
                                this.f1407f = enumC0394fM1465a;
                            } else {
                                c0823mM3453a.m3467d(iM3417a);
                                c0823mM3453a.m3467d(iM3440n);
                            }
                            break;
                        case 16:
                            this.f1406e |= 2;
                            this.f1408g = c0821k.m3431f();
                            break;
                        case 24:
                            this.f1406e |= 4;
                            this.f1409h = c0821k.m3431f();
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
                try {
                    c0823mM3453a.m3456a();
                } catch (IOException e3) {
                } finally {
                    this.f1405d = c0820jM3400i.m3409a();
                }
                mo3493R();
                throw th;
            }
        }
        try {
            c0823mM3453a.m3456a();
        } catch (IOException e4) {
        } finally {
            this.f1405d = c0820jM3400i.m3409a();
        }
        mo3493R();
    }

    private C0391c(AbstractC0832v abstractC0832v) {
        super(abstractC0832v);
        this.f1410i = (byte) -1;
        this.f1411j = -1;
        this.f1405d = abstractC0832v.m3496r();
    }

    private C0391c(boolean z) {
        this.f1410i = (byte) -1;
        this.f1411j = -1;
        this.f1405d = AbstractC0818h.f2420a;
    }

    /* JADX INFO: renamed from: a */
    public static C0391c m1422a() {
        return f1403c;
    }

    /* JADX INFO: renamed from: a */
    public static C0393e m1423a(C0391c c0391c) {
        return m1428k().mo1454a(c0391c);
    }

    /* JADX INFO: renamed from: k */
    public static C0393e m1428k() {
        return C0393e.m1448l();
    }

    /* JADX INFO: renamed from: q */
    private void m1429q() {
        this.f1407f = EnumC0394f.NO_CACHE;
        this.f1408g = 0;
        this.f1409h = 0;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0391c mo1443p() {
        return f1403c;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0830t, com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: c */
    public InterfaceC0784aq mo1431c() {
        return f1402a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1432d() {
        return (this.f1406e & 1) == 1;
    }

    /* JADX INFO: renamed from: e */
    public EnumC0394f m1433e() {
        return this.f1407f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0391c)) {
            return super.equals(obj);
        }
        C0391c c0391c = (C0391c) obj;
        boolean z = m1432d() == c0391c.m1432d();
        if (m1432d()) {
            z = z && m1433e() == c0391c.m1433e();
        }
        boolean z2 = z && m1434f() == c0391c.m1434f();
        if (m1434f()) {
            z2 = z2 && m1435g() == c0391c.m1435g();
        }
        boolean z3 = z2 && m1436h() == c0391c.m1436h();
        if (m1436h()) {
            return z3 && m1437i() == c0391c.m1437i();
        }
        return z3;
    }

    /* JADX INFO: renamed from: f */
    public boolean m1434f() {
        return (this.f1406e & 2) == 2;
    }

    /* JADX INFO: renamed from: g */
    public int m1435g() {
        return this.f1408g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m1436h() {
        return (this.f1406e & 4) == 4;
    }

    public int hashCode() {
        if (this.f2315b != 0) {
            return this.f2315b;
        }
        int iHashCode = C0391c.class.hashCode() + 779;
        if (m1432d()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + C0770ac.m3280a(m1433e());
        }
        if (m1434f()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + m1435g();
        }
        if (m1436h()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + m1437i();
        }
        int iHashCode2 = (iHashCode * 29) + this.f1405d.hashCode();
        this.f2315b = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: i */
    public int m1437i() {
        return this.f1409h;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: j */
    public final boolean mo1438j() {
        byte b = this.f1410i;
        if (b != -1) {
            return b == 1;
        }
        this.f1410i = (byte) 1;
        return true;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0393e mo1442o() {
        return m1428k();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0393e mo1441n() {
        return m1423a(this);
    }
}
