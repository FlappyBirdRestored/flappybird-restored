package com.google.tagmanager.p020a;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.tagmanager.a.ar */
/* JADX INFO: loaded from: classes.dex */
class C0785ar extends AbstractC0818h {

    /* JADX INFO: renamed from: c */
    private static final int[] f2333c;

    /* JADX INFO: renamed from: d */
    private final int f2334d;

    /* JADX INFO: renamed from: e */
    private final AbstractC0818h f2335e;

    /* JADX INFO: renamed from: f */
    private final AbstractC0818h f2336f;

    /* JADX INFO: renamed from: g */
    private final int f2337g;

    /* JADX INFO: renamed from: h */
    private final int f2338h;

    /* JADX INFO: renamed from: i */
    private int f2339i;

    static {
        int i = 1;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f2333c = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= f2333c.length) {
                return;
            }
            f2333c[i5] = ((Integer) arrayList.get(i5)).intValue();
            i4 = i5 + 1;
        }
    }

    private C0785ar(AbstractC0818h abstractC0818h, AbstractC0818h abstractC0818h2) {
        this.f2339i = 0;
        this.f2335e = abstractC0818h;
        this.f2336f = abstractC0818h2;
        this.f2337g = abstractC0818h.mo3307a();
        this.f2334d = this.f2337g + abstractC0818h2.mo3307a();
        this.f2338h = Math.max(abstractC0818h.mo3318j(), abstractC0818h2.mo3318j()) + 1;
    }

    /* JADX INFO: renamed from: a */
    static AbstractC0818h m3325a(AbstractC0818h abstractC0818h, AbstractC0818h abstractC0818h2) {
        C0785ar c0785ar = abstractC0818h instanceof C0785ar ? (C0785ar) abstractC0818h : null;
        if (abstractC0818h2.mo3307a() == 0) {
            return abstractC0818h;
        }
        if (abstractC0818h.mo3307a() == 0) {
            return abstractC0818h2;
        }
        int iMo3307a = abstractC0818h.mo3307a() + abstractC0818h2.mo3307a();
        if (iMo3307a < 128) {
            return m3326b(abstractC0818h, abstractC0818h2);
        }
        if (c0785ar != null && c0785ar.f2336f.mo3307a() + abstractC0818h2.mo3307a() < 128) {
            return new C0785ar(c0785ar.f2335e, m3326b(c0785ar.f2336f, abstractC0818h2));
        }
        if (c0785ar == null || c0785ar.f2335e.mo3318j() <= c0785ar.f2336f.mo3318j() || c0785ar.mo3318j() <= abstractC0818h2.mo3318j()) {
            return iMo3307a >= f2333c[Math.max(abstractC0818h.mo3318j(), abstractC0818h2.mo3318j()) + 1] ? new C0785ar(abstractC0818h, abstractC0818h2) : new C0787at().m3332a(abstractC0818h, abstractC0818h2);
        }
        return new C0785ar(c0785ar.f2335e, new C0785ar(c0785ar.f2336f, abstractC0818h2));
    }

    /* JADX INFO: renamed from: b */
    private static C0777aj m3326b(AbstractC0818h abstractC0818h, AbstractC0818h abstractC0818h2) {
        int iMo3307a = abstractC0818h.mo3307a();
        int iMo3307a2 = abstractC0818h2.mo3307a();
        byte[] bArr = new byte[iMo3307a + iMo3307a2];
        abstractC0818h.m3403b(bArr, 0, 0, iMo3307a);
        abstractC0818h2.m3403b(bArr, 0, iMo3307a, iMo3307a2);
        return new C0777aj(bArr);
    }

    /* JADX INFO: renamed from: b */
    private boolean m3328b(AbstractC0818h abstractC0818h) {
        int i;
        C0777aj c0777aj;
        C0786as c0786as = null;
        C0788au c0788au = new C0788au(this);
        C0777aj c0777aj2 = (C0777aj) c0788au.next();
        C0788au c0788au2 = new C0788au(abstractC0818h);
        C0777aj c0777aj3 = (C0777aj) c0788au2.next();
        int i2 = 0;
        C0777aj c0777aj4 = c0777aj2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int iMo3307a = c0777aj4.mo3307a() - i3;
            int iMo3307a2 = c0777aj3.mo3307a() - i2;
            int iMin = Math.min(iMo3307a, iMo3307a2);
            if (!(i3 == 0 ? c0777aj4.m3311a(c0777aj3, i2, iMin) : c0777aj3.m3311a(c0777aj4, i3, iMin))) {
                return false;
            }
            int i5 = i4 + iMin;
            if (i5 >= this.f2334d) {
                if (i5 == this.f2334d) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iMo3307a) {
                c0777aj4 = (C0777aj) c0788au.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
            if (iMin == iMo3307a2) {
                c0777aj = (C0777aj) c0788au2.next();
                i = 0;
            } else {
                C0777aj c0777aj5 = c0777aj3;
                i = i2 + iMin;
                c0777aj = c0777aj5;
            }
            i2 = i;
            c0777aj3 = c0777aj;
            i4 = i5;
        }
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: a */
    public int mo3307a() {
        return this.f2334d;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: a */
    protected int mo3308a(int i, int i2, int i3) {
        if (i2 + i3 <= this.f2337g) {
            return this.f2335e.mo3308a(i, i2, i3);
        }
        if (i2 >= this.f2337g) {
            return this.f2336f.mo3308a(i, i2 - this.f2337g, i3);
        }
        int i4 = this.f2337g - i2;
        return this.f2336f.mo3308a(this.f2335e.mo3308a(i, i2, i4), 0, i3 - i4);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: a */
    public String mo3309a(String str) {
        return new String(m3405e(), str);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: a */
    protected void mo3310a(byte[] bArr, int i, int i2, int i3) {
        if (i + i3 <= this.f2337g) {
            this.f2335e.mo3310a(bArr, i, i2, i3);
        } else {
            if (i >= this.f2337g) {
                this.f2336f.mo3310a(bArr, i - this.f2337g, i2, i3);
                return;
            }
            int i4 = this.f2337g - i;
            this.f2335e.mo3310a(bArr, i, i2, i4);
            this.f2336f.mo3310a(bArr, 0, i2 + i4, i3 - i4);
        }
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: b */
    protected int mo3313b(int i, int i2, int i3) {
        if (i2 + i3 <= this.f2337g) {
            return this.f2335e.mo3313b(i, i2, i3);
        }
        if (i2 >= this.f2337g) {
            return this.f2336f.mo3313b(i, i2 - this.f2337g, i3);
        }
        int i4 = this.f2337g - i2;
        return this.f2336f.mo3313b(this.f2335e.mo3313b(i, i2, i4), 0, i3 - i4);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: b */
    void mo3314b(OutputStream outputStream, int i, int i2) {
        if (i + i2 <= this.f2337g) {
            this.f2335e.mo3314b(outputStream, i, i2);
        } else {
            if (i >= this.f2337g) {
                this.f2336f.mo3314b(outputStream, i - this.f2337g, i2);
                return;
            }
            int i3 = this.f2337g - i;
            this.f2335e.mo3314b(outputStream, i, i3);
            this.f2336f.mo3314b(outputStream, 0, i2 - i3);
        }
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h, java.lang.Iterable
    /* JADX INFO: renamed from: c */
    public InterfaceC0819i iterator() {
        return new C0789av(this);
    }

    public boolean equals(Object obj) {
        int iMo3320l;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0818h)) {
            return false;
        }
        AbstractC0818h abstractC0818h = (AbstractC0818h) obj;
        if (this.f2334d != abstractC0818h.mo3307a()) {
            return false;
        }
        if (this.f2334d == 0) {
            return true;
        }
        if (this.f2339i == 0 || (iMo3320l = abstractC0818h.mo3320l()) == 0 || this.f2339i == iMo3320l) {
            return m3328b(abstractC0818h);
        }
        return false;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: g */
    public boolean mo3316g() {
        return this.f2336f.mo3308a(this.f2335e.mo3308a(0, 0, this.f2337g), 0, this.f2336f.mo3307a()) == 0;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: h */
    public C0821k mo3317h() {
        return C0821k.m3413a(new C0790aw(this));
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    public int hashCode() {
        int iMo3313b = this.f2339i;
        if (iMo3313b == 0) {
            iMo3313b = mo3313b(this.f2334d, 0, this.f2334d);
            if (iMo3313b == 0) {
                iMo3313b = 1;
            }
            this.f2339i = iMo3313b;
        }
        return iMo3313b;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: j */
    protected int mo3318j() {
        return this.f2338h;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: k */
    protected boolean mo3319k() {
        return this.f2334d >= f2333c[this.f2338h];
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: l */
    protected int mo3320l() {
        return this.f2339i;
    }
}
