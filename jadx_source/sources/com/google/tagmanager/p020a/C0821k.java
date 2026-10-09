package com.google.tagmanager.p020a;

import com.google.android.gms.C0467e;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.tagmanager.a.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0821k {

    /* JADX INFO: renamed from: a */
    private final byte[] f2428a;

    /* JADX INFO: renamed from: b */
    private final boolean f2429b;

    /* JADX INFO: renamed from: c */
    private int f2430c;

    /* JADX INFO: renamed from: d */
    private int f2431d;

    /* JADX INFO: renamed from: e */
    private int f2432e;

    /* JADX INFO: renamed from: f */
    private final InputStream f2433f;

    /* JADX INFO: renamed from: g */
    private int f2434g;

    /* JADX INFO: renamed from: h */
    private boolean f2435h;

    /* JADX INFO: renamed from: i */
    private int f2436i;

    /* JADX INFO: renamed from: j */
    private int f2437j;

    /* JADX INFO: renamed from: k */
    private int f2438k;

    /* JADX INFO: renamed from: l */
    private int f2439l;

    /* JADX INFO: renamed from: m */
    private int f2440m;

    /* JADX INFO: renamed from: n */
    private InterfaceC0822l f2441n;

    private C0821k(C0777aj c0777aj) {
        this.f2435h = false;
        this.f2437j = Integer.MAX_VALUE;
        this.f2439l = 64;
        this.f2440m = 67108864;
        this.f2441n = null;
        this.f2428a = c0777aj.f2328c;
        this.f2432e = c0777aj.mo3312b();
        this.f2430c = c0777aj.mo3312b() + c0777aj.mo3307a();
        this.f2436i = -this.f2432e;
        this.f2433f = null;
        this.f2429b = true;
    }

    private C0821k(InputStream inputStream) {
        this.f2435h = false;
        this.f2437j = Integer.MAX_VALUE;
        this.f2439l = 64;
        this.f2440m = 67108864;
        this.f2441n = null;
        this.f2428a = new byte[4096];
        this.f2430c = 0;
        this.f2432e = 0;
        this.f2436i = 0;
        this.f2433f = inputStream;
        this.f2429b = false;
    }

    /* JADX INFO: renamed from: a */
    public static long m3411a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX INFO: renamed from: a */
    static C0821k m3412a(C0777aj c0777aj) {
        C0821k c0821k = new C0821k(c0777aj);
        try {
            c0821k.m3426c(c0777aj.mo3307a());
            return c0821k;
        } catch (C0773af e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0821k m3413a(InputStream inputStream) {
        return new C0821k(inputStream);
    }

    /* JADX INFO: renamed from: a */
    private boolean m3414a(boolean z) throws C0773af {
        if (this.f2432e < this.f2430c) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        if (this.f2436i + this.f2430c == this.f2437j) {
            if (z) {
                throw C0773af.m3285b();
            }
            return false;
        }
        if (this.f2441n != null) {
            this.f2441n.m3452a();
        }
        this.f2436i += this.f2430c;
        this.f2432e = 0;
        this.f2430c = this.f2433f == null ? -1 : this.f2433f.read(this.f2428a);
        if (this.f2430c == 0 || this.f2430c < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f2430c + "\nThe InputStream implementation is buggy.");
        }
        if (this.f2430c == -1) {
            this.f2430c = 0;
            if (z) {
                throw C0773af.m3285b();
            }
            return false;
        }
        m3416z();
        int i = this.f2436i + this.f2430c + this.f2431d;
        if (i > this.f2440m || i < 0) {
            throw C0773af.m3292i();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m3415b(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* JADX INFO: renamed from: z */
    private void m3416z() {
        this.f2430c += this.f2431d;
        int i = this.f2436i + this.f2430c;
        if (i <= this.f2437j) {
            this.f2431d = 0;
        } else {
            this.f2431d = i - this.f2437j;
            this.f2430c -= this.f2431d;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m3417a() throws C0773af {
        if (m3450x()) {
            this.f2434g = 0;
            return 0;
        }
        this.f2434g = m3445s();
        if (C0805bk.m3386b(this.f2434g) == 0) {
            throw C0773af.m3288e();
        }
        return this.f2434g;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0780am m3418a(InterfaceC0784aq interfaceC0784aq, C0825o c0825o) throws C0773af {
        int iM3445s = m3445s();
        if (this.f2438k >= this.f2439l) {
            throw C0773af.m3291h();
        }
        int iM3426c = m3426c(iM3445s);
        this.f2438k++;
        InterfaceC0780am interfaceC0780am = (InterfaceC0780am) interfaceC0784aq.mo1445b(this, c0825o);
        m3419a(0);
        this.f2438k--;
        m3428d(iM3426c);
        return interfaceC0780am;
    }

    /* JADX INFO: renamed from: a */
    public void m3419a(int i) throws C0773af {
        if (this.f2434g != i) {
            throw C0773af.m3289f();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3420a(int i, InterfaceC0781an interfaceC0781an, C0825o c0825o) throws C0773af {
        if (this.f2438k >= this.f2439l) {
            throw C0773af.m3291h();
        }
        this.f2438k++;
        interfaceC0781an.mo1459c(this, c0825o);
        m3419a(C0805bk.m3385a(i, 4));
        this.f2438k--;
    }

    /* JADX INFO: renamed from: a */
    public void m3421a(InterfaceC0781an interfaceC0781an, C0825o c0825o) throws C0773af {
        int iM3445s = m3445s();
        if (this.f2438k >= this.f2439l) {
            throw C0773af.m3291h();
        }
        int iM3426c = m3426c(iM3445s);
        this.f2438k++;
        interfaceC0781an.mo1459c(this, c0825o);
        m3419a(0);
        this.f2438k--;
        m3428d(iM3426c);
    }

    /* JADX INFO: renamed from: a */
    public void m3422a(C0823m c0823m) throws C0773af {
        int iM3417a;
        do {
            iM3417a = m3417a();
            if (iM3417a == 0) {
                return;
            }
        } while (m3423a(iM3417a, c0823m));
    }

    /* JADX INFO: renamed from: a */
    public boolean m3423a(int i, C0823m c0823m) throws IOException {
        switch (C0805bk.m3384a(i)) {
            case C0467e.MapAttrs_mapType /* 0 */:
                long jM3429e = m3429e();
                c0823m.m3467d(i);
                c0823m.m3459a(jM3429e);
                return true;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                long jM3448v = m3448v();
                c0823m.m3467d(i);
                c0823m.m3463b(jM3448v);
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                AbstractC0818h abstractC0818hM3438l = m3438l();
                c0823m.m3467d(i);
                c0823m.m3460a(abstractC0818hM3438l);
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                c0823m.m3467d(i);
                m3422a(c0823m);
                int iM3385a = C0805bk.m3385a(C0805bk.m3386b(i), 4);
                m3419a(iM3385a);
                c0823m.m3467d(iM3385a);
                return true;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                return false;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                int iM3447u = m3447u();
                c0823m.m3467d(i);
                c0823m.m3458a(iM3447u);
                return true;
            default:
                throw C0773af.m3290g();
        }
    }

    /* JADX INFO: renamed from: b */
    public double m3424b() {
        return Double.longBitsToDouble(m3448v());
    }

    /* JADX INFO: renamed from: c */
    public float m3425c() {
        return Float.intBitsToFloat(m3447u());
    }

    /* JADX INFO: renamed from: c */
    public int m3426c(int i) throws C0773af {
        if (i < 0) {
            throw C0773af.m3286c();
        }
        int i2 = this.f2436i + this.f2432e + i;
        int i3 = this.f2437j;
        if (i2 > i3) {
            throw C0773af.m3285b();
        }
        this.f2437j = i2;
        m3416z();
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public long m3427d() {
        return m3446t();
    }

    /* JADX INFO: renamed from: d */
    public void m3428d(int i) {
        this.f2437j = i;
        m3416z();
    }

    /* JADX INFO: renamed from: e */
    public long m3429e() {
        return m3446t();
    }

    /* JADX INFO: renamed from: e */
    public byte[] m3430e(int i) throws C0773af {
        if (i < 0) {
            throw C0773af.m3286c();
        }
        if (this.f2436i + this.f2432e + i > this.f2437j) {
            m3432f((this.f2437j - this.f2436i) - this.f2432e);
            throw C0773af.m3285b();
        }
        if (i <= this.f2430c - this.f2432e) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f2428a, this.f2432e, bArr, 0, i);
            this.f2432e += i;
            return bArr;
        }
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i2 = this.f2430c - this.f2432e;
            System.arraycopy(this.f2428a, this.f2432e, bArr2, 0, i2);
            this.f2432e = this.f2430c;
            m3414a(true);
            while (i - i2 > this.f2430c) {
                System.arraycopy(this.f2428a, 0, bArr2, i2, this.f2430c);
                i2 += this.f2430c;
                this.f2432e = this.f2430c;
                m3414a(true);
            }
            System.arraycopy(this.f2428a, 0, bArr2, i2, i - i2);
            this.f2432e = i - i2;
            return bArr2;
        }
        int i3 = this.f2432e;
        int i4 = this.f2430c;
        this.f2436i += this.f2430c;
        this.f2432e = 0;
        this.f2430c = 0;
        ArrayList arrayList = new ArrayList();
        int i5 = i - (i4 - i3);
        while (i5 > 0) {
            byte[] bArr3 = new byte[Math.min(i5, 4096)];
            int i6 = 0;
            while (i6 < bArr3.length) {
                int i7 = this.f2433f == null ? -1 : this.f2433f.read(bArr3, i6, bArr3.length - i6);
                if (i7 == -1) {
                    throw C0773af.m3285b();
                }
                this.f2436i += i7;
                i6 += i7;
            }
            int length = i5 - bArr3.length;
            arrayList.add(bArr3);
            i5 = length;
        }
        byte[] bArr4 = new byte[i];
        int length2 = i4 - i3;
        System.arraycopy(this.f2428a, i3, bArr4, 0, length2);
        Iterator it = arrayList.iterator();
        while (true) {
            int i8 = length2;
            if (!it.hasNext()) {
                return bArr4;
            }
            byte[] bArr5 = (byte[]) it.next();
            System.arraycopy(bArr5, 0, bArr4, i8, bArr5.length);
            length2 = bArr5.length + i8;
        }
    }

    /* JADX INFO: renamed from: f */
    public int m3431f() {
        return m3445s();
    }

    /* JADX INFO: renamed from: f */
    public void m3432f(int i) throws C0773af {
        if (i < 0) {
            throw C0773af.m3286c();
        }
        if (this.f2436i + this.f2432e + i > this.f2437j) {
            m3432f((this.f2437j - this.f2436i) - this.f2432e);
            throw C0773af.m3285b();
        }
        if (i <= this.f2430c - this.f2432e) {
            this.f2432e += i;
            return;
        }
        int i2 = this.f2430c - this.f2432e;
        this.f2432e = this.f2430c;
        m3414a(true);
        while (i - i2 > this.f2430c) {
            i2 += this.f2430c;
            this.f2432e = this.f2430c;
            m3414a(true);
        }
        this.f2432e = i - i2;
    }

    /* JADX INFO: renamed from: g */
    public long m3433g() {
        return m3448v();
    }

    /* JADX INFO: renamed from: h */
    public int m3434h() {
        return m3447u();
    }

    /* JADX INFO: renamed from: i */
    public boolean m3435i() {
        return m3445s() != 0;
    }

    /* JADX INFO: renamed from: j */
    public String m3436j() throws C0773af {
        int iM3445s = m3445s();
        if (iM3445s > this.f2430c - this.f2432e || iM3445s <= 0) {
            return new String(m3430e(iM3445s), "UTF-8");
        }
        String str = new String(this.f2428a, this.f2432e, iM3445s, "UTF-8");
        this.f2432e = iM3445s + this.f2432e;
        return str;
    }

    /* JADX INFO: renamed from: k */
    public String m3437k() throws C0773af {
        AbstractC0818h c0777aj;
        int iM3445s = m3445s();
        if (iM3445s > this.f2430c - this.f2432e || iM3445s <= 0) {
            c0777aj = new C0777aj(m3430e(iM3445s));
        } else {
            c0777aj = AbstractC0818h.m3399a(this.f2428a, this.f2432e, iM3445s);
            this.f2432e = iM3445s + this.f2432e;
        }
        if (c0777aj.mo3316g()) {
            return c0777aj.m3406f();
        }
        throw C0773af.m3293j();
    }

    /* JADX INFO: renamed from: l */
    public AbstractC0818h m3438l() throws C0773af {
        int iM3445s = m3445s();
        if (iM3445s == 0) {
            return AbstractC0818h.f2420a;
        }
        if (iM3445s > this.f2430c - this.f2432e || iM3445s <= 0) {
            return new C0777aj(m3430e(iM3445s));
        }
        AbstractC0818h c0815e = (this.f2429b && this.f2435h) ? new C0815e(this.f2428a, this.f2432e, iM3445s) : AbstractC0818h.m3399a(this.f2428a, this.f2432e, iM3445s);
        this.f2432e = iM3445s + this.f2432e;
        return c0815e;
    }

    /* JADX INFO: renamed from: m */
    public int m3439m() {
        return m3445s();
    }

    /* JADX INFO: renamed from: n */
    public int m3440n() {
        return m3445s();
    }

    /* JADX INFO: renamed from: o */
    public int m3441o() {
        return m3447u();
    }

    /* JADX INFO: renamed from: p */
    public long m3442p() {
        return m3448v();
    }

    /* JADX INFO: renamed from: q */
    public int m3443q() {
        return m3415b(m3445s());
    }

    /* JADX INFO: renamed from: r */
    public long m3444r() {
        return m3411a(m3446t());
    }

    /* JADX INFO: renamed from: s */
    public int m3445s() throws C0773af {
        byte bM3451y = m3451y();
        if (bM3451y >= 0) {
            return bM3451y;
        }
        int i = bM3451y & 127;
        byte bM3451y2 = m3451y();
        if (bM3451y2 >= 0) {
            return i | (bM3451y2 << 7);
        }
        int i2 = i | ((bM3451y2 & 127) << 7);
        byte bM3451y3 = m3451y();
        if (bM3451y3 >= 0) {
            return i2 | (bM3451y3 << 14);
        }
        int i3 = i2 | ((bM3451y3 & 127) << 14);
        byte bM3451y4 = m3451y();
        if (bM3451y4 >= 0) {
            return i3 | (bM3451y4 << 21);
        }
        int i4 = i3 | ((bM3451y4 & 127) << 21);
        byte bM3451y5 = m3451y();
        int i5 = i4 | (bM3451y5 << 28);
        if (bM3451y5 >= 0) {
            return i5;
        }
        for (int i6 = 0; i6 < 5; i6++) {
            if (m3451y() >= 0) {
                return i5;
            }
        }
        throw C0773af.m3287d();
    }

    /* JADX INFO: renamed from: t */
    public long m3446t() throws C0773af {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM3451y = m3451y();
            j |= ((long) (bM3451y & 127)) << i;
            if ((bM3451y & 128) == 0) {
                return j;
            }
        }
        throw C0773af.m3287d();
    }

    /* JADX INFO: renamed from: u */
    public int m3447u() throws C0773af {
        return (m3451y() & 255) | ((m3451y() & 255) << 8) | ((m3451y() & 255) << 16) | ((m3451y() & 255) << 24);
    }

    /* JADX INFO: renamed from: v */
    public long m3448v() throws C0773af {
        byte bM3451y = m3451y();
        return ((((long) m3451y()) & 255) << 8) | (((long) bM3451y) & 255) | ((((long) m3451y()) & 255) << 16) | ((((long) m3451y()) & 255) << 24) | ((((long) m3451y()) & 255) << 32) | ((((long) m3451y()) & 255) << 40) | ((((long) m3451y()) & 255) << 48) | ((((long) m3451y()) & 255) << 56);
    }

    /* JADX INFO: renamed from: w */
    public int m3449w() {
        if (this.f2437j == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f2437j - (this.f2436i + this.f2432e);
    }

    /* JADX INFO: renamed from: x */
    public boolean m3450x() {
        return this.f2432e == this.f2430c && !m3414a(false);
    }

    /* JADX INFO: renamed from: y */
    public byte m3451y() throws C0773af {
        if (this.f2432e == this.f2430c) {
            m3414a(true);
        }
        byte[] bArr = this.f2428a;
        int i = this.f2432e;
        this.f2432e = i + 1;
        return bArr[i];
    }
}
