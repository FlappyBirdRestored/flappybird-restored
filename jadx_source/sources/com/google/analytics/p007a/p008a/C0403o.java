package com.google.analytics.p007a.p008a;

import com.google.tagmanager.p020a.AbstractC0832v;
import com.google.tagmanager.p020a.C0773af;
import com.google.tagmanager.p020a.C0821k;
import com.google.tagmanager.p020a.C0825o;
import com.google.tagmanager.p020a.InterfaceC0780am;

/* JADX INFO: renamed from: com.google.analytics.a.a.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0403o extends AbstractC0832v implements InterfaceC0404p {

    /* JADX INFO: renamed from: a */
    private int f1449a;

    /* JADX INFO: renamed from: b */
    private int f1450b;

    /* JADX INFO: renamed from: c */
    private int f1451c;

    private C0403o() {
        m1527m();
    }

    /* JADX INFO: renamed from: m */
    private void m1527m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static C0403o m1528n() {
        return new C0403o();
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v, com.google.tagmanager.p020a.AbstractC0794b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0403o clone() {
        return m1528n().mo1454a(m1536d());
    }

    /* JADX INFO: renamed from: a */
    public C0403o m1530a(int i) {
        this.f1449a |= 1;
        this.f1450b = i;
        return this;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0403o mo1454a(C0401m c0401m) {
        if (c0401m != C0401m.m1511a()) {
            if (c0401m.m1519d()) {
                m1530a(c0401m.m1520e());
            }
            if (c0401m.m1521f()) {
                m1534b(c0401m.m1522g());
            }
            m3495a(m3496r().m3401a(c0401m.f1443d));
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    /* JADX WARN: Code duplicated, block: B:22:? A[SYNTHETIC] */
    @Override // com.google.tagmanager.p020a.AbstractC0794b, com.google.tagmanager.p020a.InterfaceC0781an
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0403o mo1459c(C0821k c0821k, C0825o c0825o) throws Throwable {
        C0401m c0401m;
        Throwable th;
        try {
            try {
                C0401m c0401m2 = (C0401m) C0401m.f1440a.mo1445b(c0821k, c0825o);
                if (c0401m2 != null) {
                    mo1454a(c0401m2);
                }
                return this;
            } catch (C0773af e) {
                C0401m c0401m3 = (C0401m) e.m3295a();
                try {
                    throw e;
                } catch (Throwable th2) {
                    c0401m = c0401m3;
                    th = th2;
                    if (c0401m != null) {
                        throw th;
                    }
                    mo1454a(c0401m);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            c0401m = null;
            if (c0401m != null) {
                throw th;
            }
            mo1454a(c0401m);
            throw th;
        }
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v, com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0401m mo1443p() {
        return C0401m.m1511a();
    }

    /* JADX INFO: renamed from: b */
    public C0403o m1534b(int i) {
        this.f1449a |= 2;
        this.f1451c = i;
        return this;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0781an
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0401m mo1464h() {
        C0401m c0401mM1536d = m1536d();
        if (c0401mM1536d.mo1438j()) {
            return c0401mM1536d;
        }
        throw m3360a((InterfaceC0780am) c0401mM1536d);
    }

    /* JADX INFO: renamed from: d */
    public C0401m m1536d() {
        C0401m c0401m = new C0401m(this);
        int i = this.f1449a;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c0401m.f1445f = this.f1450b;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c0401m.f1446g = this.f1451c;
        c0401m.f1444e = i2;
        return c0401m;
    }

    /* JADX INFO: renamed from: i */
    public boolean m1537i() {
        return (this.f1449a & 1) == 1;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: j */
    public final boolean mo1438j() {
        return m1537i() && m1538k();
    }

    /* JADX INFO: renamed from: k */
    public boolean m1538k() {
        return (this.f1449a & 2) == 2;
    }
}
