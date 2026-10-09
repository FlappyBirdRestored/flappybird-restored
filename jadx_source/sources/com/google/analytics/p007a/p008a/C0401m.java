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

/* JADX INFO: renamed from: com.google.analytics.a.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0401m extends AbstractC0830t implements InterfaceC0404p {

    /* JADX INFO: renamed from: d */
    private final AbstractC0818h f1443d;

    /* JADX INFO: renamed from: e */
    private int f1444e;

    /* JADX INFO: renamed from: f */
    private int f1445f;

    /* JADX INFO: renamed from: g */
    private int f1446g;

    /* JADX INFO: renamed from: h */
    private byte f1447h;

    /* JADX INFO: renamed from: i */
    private int f1448i;

    /* JADX INFO: renamed from: a */
    public static InterfaceC0784aq f1440a = new C0402n();

    /* JADX INFO: renamed from: j */
    private static volatile InterfaceC0783ap f1442j = null;

    /* JADX INFO: renamed from: c */
    private static final C0401m f1441c = new C0401m(true);

    static {
        f1441c.m1517l();
    }

    private C0401m(C0821k c0821k, C0825o c0825o) {
        this.f1447h = (byte) -1;
        this.f1448i = -1;
        m1517l();
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
                            this.f1444e |= 1;
                            this.f1445f = c0821k.m3431f();
                            break;
                        case 16:
                            this.f1444e |= 2;
                            this.f1446g = c0821k.m3431f();
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
                    this.f1443d = c0820jM3400i.m3409a();
                }
                mo3493R();
                throw th;
            }
        }
        try {
            c0823mM3453a.m3456a();
        } catch (IOException e4) {
        } finally {
            this.f1443d = c0820jM3400i.m3409a();
        }
        mo3493R();
    }

    private C0401m(AbstractC0832v abstractC0832v) {
        super(abstractC0832v);
        this.f1447h = (byte) -1;
        this.f1448i = -1;
        this.f1443d = abstractC0832v.m3496r();
    }

    private C0401m(boolean z) {
        this.f1447h = (byte) -1;
        this.f1448i = -1;
        this.f1443d = AbstractC0818h.f2420a;
    }

    /* JADX INFO: renamed from: a */
    public static C0401m m1511a() {
        return f1441c;
    }

    /* JADX INFO: renamed from: a */
    public static C0403o m1512a(C0401m c0401m) {
        return m1516h().mo1454a(c0401m);
    }

    /* JADX INFO: renamed from: h */
    public static C0403o m1516h() {
        return C0403o.m1528n();
    }

    /* JADX INFO: renamed from: l */
    private void m1517l() {
        this.f1445f = 0;
        this.f1446g = 0;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0401m mo1443p() {
        return f1441c;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0830t, com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: c */
    public InterfaceC0784aq mo1431c() {
        return f1440a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1519d() {
        return (this.f1444e & 1) == 1;
    }

    /* JADX INFO: renamed from: e */
    public int m1520e() {
        return this.f1445f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0401m)) {
            return super.equals(obj);
        }
        C0401m c0401m = (C0401m) obj;
        boolean z = m1519d() == c0401m.m1519d();
        if (m1519d()) {
            z = z && m1520e() == c0401m.m1520e();
        }
        boolean z2 = z && m1521f() == c0401m.m1521f();
        if (m1521f()) {
            return z2 && m1522g() == c0401m.m1522g();
        }
        return z2;
    }

    /* JADX INFO: renamed from: f */
    public boolean m1521f() {
        return (this.f1444e & 2) == 2;
    }

    /* JADX INFO: renamed from: g */
    public int m1522g() {
        return this.f1446g;
    }

    public int hashCode() {
        if (this.f2315b != 0) {
            return this.f2315b;
        }
        int iHashCode = C0401m.class.hashCode() + 779;
        if (m1519d()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + m1520e();
        }
        if (m1521f()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + m1522g();
        }
        int iHashCode2 = (iHashCode * 29) + this.f1443d.hashCode();
        this.f2315b = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0403o mo1442o() {
        return m1516h();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: j */
    public final boolean mo1438j() {
        byte b = this.f1447h;
        if (b != -1) {
            return b == 1;
        }
        if (!m1519d()) {
            this.f1447h = (byte) 0;
            return false;
        }
        if (m1521f()) {
            this.f1447h = (byte) 1;
            return true;
        }
        this.f1447h = (byte) 0;
        return false;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0403o mo1441n() {
        return m1512a(this);
    }
}
