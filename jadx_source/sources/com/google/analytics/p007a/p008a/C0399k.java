package com.google.analytics.p007a.p008a;

import com.google.tagmanager.p020a.AbstractC0832v;
import com.google.tagmanager.p020a.C0773af;
import com.google.tagmanager.p020a.C0821k;
import com.google.tagmanager.p020a.C0825o;
import com.google.tagmanager.p020a.InterfaceC0780am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.analytics.a.a.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0399k extends AbstractC0832v implements InterfaceC0400l {

    /* JADX INFO: renamed from: a */
    private int f1434a;

    /* JADX INFO: renamed from: b */
    private List f1435b = Collections.emptyList();

    /* JADX INFO: renamed from: c */
    private int f1436c;

    /* JADX INFO: renamed from: d */
    private int f1437d;

    /* JADX INFO: renamed from: e */
    private boolean f1438e;

    /* JADX INFO: renamed from: f */
    private boolean f1439f;

    private C0399k() {
        m1496l();
    }

    /* JADX INFO: renamed from: l */
    private void m1496l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static C0399k m1497m() {
        return new C0399k();
    }

    /* JADX INFO: renamed from: n */
    private void m1498n() {
        if ((this.f1434a & 1) != 1) {
            this.f1435b = new ArrayList(this.f1435b);
            this.f1434a |= 1;
        }
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v, com.google.tagmanager.p020a.AbstractC0794b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0399k clone() {
        return m1497m().mo1454a(m1508d());
    }

    /* JADX INFO: renamed from: a */
    public C0399k m1500a(int i) {
        this.f1434a |= 2;
        this.f1436c = i;
        return this;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0399k mo1454a(C0397i c0397i) {
        if (c0397i != C0397i.m1470a()) {
            if (!c0397i.f1427f.isEmpty()) {
                if (this.f1435b.isEmpty()) {
                    this.f1435b = c0397i.f1427f;
                    this.f1434a &= -2;
                } else {
                    m1498n();
                    this.f1435b.addAll(c0397i.f1427f);
                }
            }
            if (c0397i.m1484f()) {
                m1500a(c0397i.m1485g());
            }
            if (c0397i.m1486h()) {
                m1505b(c0397i.m1487i());
            }
            if (c0397i.m1488k()) {
                m1503a(c0397i.m1489l());
            }
            if (c0397i.m1490m()) {
                m1506b(c0397i.m1491q());
            }
            m3495a(m3496r().m3401a(c0397i.f1425d));
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    /* JADX WARN: Code duplicated, block: B:22:? A[SYNTHETIC] */
    @Override // com.google.tagmanager.p020a.AbstractC0794b, com.google.tagmanager.p020a.InterfaceC0781an
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0399k mo1459c(C0821k c0821k, C0825o c0825o) throws Throwable {
        C0397i c0397i;
        Throwable th;
        try {
            try {
                C0397i c0397i2 = (C0397i) C0397i.f1422a.mo1445b(c0821k, c0825o);
                if (c0397i2 != null) {
                    mo1454a(c0397i2);
                }
                return this;
            } catch (C0773af e) {
                C0397i c0397i3 = (C0397i) e.m3295a();
                try {
                    throw e;
                } catch (Throwable th2) {
                    c0397i = c0397i3;
                    th = th2;
                    if (c0397i != null) {
                        throw th;
                    }
                    mo1454a(c0397i);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            c0397i = null;
            if (c0397i != null) {
                throw th;
            }
            mo1454a(c0397i);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0399k m1503a(boolean z) {
        this.f1434a |= 8;
        this.f1438e = z;
        return this;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v, com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0397i mo1443p() {
        return C0397i.m1470a();
    }

    /* JADX INFO: renamed from: b */
    public C0399k m1505b(int i) {
        this.f1434a |= 4;
        this.f1437d = i;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0399k m1506b(boolean z) {
        this.f1434a |= 16;
        this.f1439f = z;
        return this;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0781an
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0397i mo1464h() {
        C0397i c0397iM1508d = m1508d();
        if (c0397iM1508d.mo1438j()) {
            return c0397iM1508d;
        }
        throw m3360a((InterfaceC0780am) c0397iM1508d);
    }

    /* JADX INFO: renamed from: d */
    public C0397i m1508d() {
        C0397i c0397i = new C0397i(this);
        int i = this.f1434a;
        if ((this.f1434a & 1) == 1) {
            this.f1435b = Collections.unmodifiableList(this.f1435b);
            this.f1434a &= -2;
        }
        c0397i.f1427f = this.f1435b;
        int i2 = (i & 2) != 2 ? 0 : 1;
        c0397i.f1428g = this.f1436c;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        c0397i.f1429h = this.f1437d;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        c0397i.f1430i = this.f1438e;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        c0397i.f1431j = this.f1439f;
        c0397i.f1426e = i2;
        return c0397i;
    }

    /* JADX INFO: renamed from: i */
    public boolean m1509i() {
        return (this.f1434a & 2) == 2;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: j */
    public final boolean mo1438j() {
        return m1509i();
    }
}
