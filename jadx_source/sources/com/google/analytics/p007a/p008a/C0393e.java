package com.google.analytics.p007a.p008a;

import com.google.tagmanager.p020a.AbstractC0832v;
import com.google.tagmanager.p020a.C0773af;
import com.google.tagmanager.p020a.C0821k;
import com.google.tagmanager.p020a.C0825o;
import com.google.tagmanager.p020a.InterfaceC0780am;

/* JADX INFO: renamed from: com.google.analytics.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0393e extends AbstractC0832v implements InterfaceC0396h {

    /* JADX INFO: renamed from: a */
    private int f1412a;

    /* JADX INFO: renamed from: b */
    private EnumC0394f f1413b = EnumC0394f.NO_CACHE;

    /* JADX INFO: renamed from: c */
    private int f1414c;

    /* JADX INFO: renamed from: d */
    private int f1415d;

    private C0393e() {
        m1447k();
    }

    /* JADX INFO: renamed from: k */
    private void m1447k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static C0393e m1448l() {
        return new C0393e();
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v, com.google.tagmanager.p020a.AbstractC0794b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0393e clone() {
        return m1448l().mo1454a(m1460d());
    }

    /* JADX INFO: renamed from: a */
    public C0393e m1450a(int i) {
        this.f1412a |= 2;
        this.f1414c = i;
        return this;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0393e mo1454a(C0391c c0391c) {
        if (c0391c != C0391c.m1422a()) {
            if (c0391c.m1432d()) {
                m1452a(c0391c.m1433e());
            }
            if (c0391c.m1434f()) {
                m1450a(c0391c.m1435g());
            }
            if (c0391c.m1436h()) {
                m1456b(c0391c.m1437i());
            }
            m3495a(m3496r().m3401a(c0391c.f1405d));
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0393e m1452a(EnumC0394f enumC0394f) {
        if (enumC0394f == null) {
            throw new NullPointerException();
        }
        this.f1412a |= 1;
        this.f1413b = enumC0394f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    /* JADX WARN: Code duplicated, block: B:22:? A[SYNTHETIC] */
    @Override // com.google.tagmanager.p020a.AbstractC0794b, com.google.tagmanager.p020a.InterfaceC0781an
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0393e mo1459c(C0821k c0821k, C0825o c0825o) throws Throwable {
        C0391c c0391c;
        Throwable th;
        try {
            try {
                C0391c c0391c2 = (C0391c) C0391c.f1402a.mo1445b(c0821k, c0825o);
                if (c0391c2 != null) {
                    mo1454a(c0391c2);
                }
                return this;
            } catch (C0773af e) {
                C0391c c0391c3 = (C0391c) e.m3295a();
                try {
                    throw e;
                } catch (Throwable th2) {
                    c0391c = c0391c3;
                    th = th2;
                    if (c0391c != null) {
                        throw th;
                    }
                    mo1454a(c0391c);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            c0391c = null;
            if (c0391c != null) {
                throw th;
            }
            mo1454a(c0391c);
            throw th;
        }
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v, com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0391c mo1443p() {
        return C0391c.m1422a();
    }

    /* JADX INFO: renamed from: b */
    public C0393e m1456b(int i) {
        this.f1412a |= 4;
        this.f1415d = i;
        return this;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0781an
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0391c mo1464h() {
        C0391c c0391cM1460d = m1460d();
        if (c0391cM1460d.mo1438j()) {
            return c0391cM1460d;
        }
        throw m3360a((InterfaceC0780am) c0391cM1460d);
    }

    /* JADX INFO: renamed from: d */
    public C0391c m1460d() {
        C0391c c0391c = new C0391c(this);
        int i = this.f1412a;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c0391c.f1407f = this.f1413b;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c0391c.f1408g = this.f1414c;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c0391c.f1409h = this.f1415d;
        c0391c.f1406e = i2;
        return c0391c;
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: j */
    public final boolean mo1438j() {
        return true;
    }
}
