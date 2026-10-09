package com.google.tagmanager.p020a;

import java.io.InputStream;

/* JADX INFO: renamed from: com.google.tagmanager.a.aw */
/* JADX INFO: loaded from: classes.dex */
class C0790aw extends InputStream {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0785ar f2347a;

    /* JADX INFO: renamed from: b */
    private C0788au f2348b;

    /* JADX INFO: renamed from: c */
    private C0777aj f2349c;

    /* JADX INFO: renamed from: d */
    private int f2350d;

    /* JADX INFO: renamed from: e */
    private int f2351e;

    /* JADX INFO: renamed from: f */
    private int f2352f;

    /* JADX INFO: renamed from: g */
    private int f2353g;

    public C0790aw(C0785ar c0785ar) {
        this.f2347a = c0785ar;
        m3340a();
    }

    /* JADX INFO: renamed from: a */
    private int m3339a(byte[] bArr, int i, int i2) {
        int i3 = i2;
        int i4 = i;
        while (i3 > 0) {
            m3341b();
            if (this.f2349c == null) {
                if (i3 != i2) {
                    break;
                }
                return -1;
            }
            int iMin = Math.min(this.f2350d - this.f2351e, i3);
            if (bArr != null) {
                this.f2349c.m3403b(bArr, this.f2351e, i4, iMin);
                i4 += iMin;
            }
            this.f2351e += iMin;
            i3 -= iMin;
        }
        return i2 - i3;
    }

    /* JADX INFO: renamed from: a */
    private void m3340a() {
        this.f2348b = new C0788au(this.f2347a);
        this.f2349c = this.f2348b.next();
        this.f2350d = this.f2349c.mo3307a();
        this.f2351e = 0;
        this.f2352f = 0;
    }

    /* JADX INFO: renamed from: b */
    private void m3341b() {
        if (this.f2349c == null || this.f2351e != this.f2350d) {
            return;
        }
        this.f2352f += this.f2350d;
        this.f2351e = 0;
        if (this.f2348b.hasNext()) {
            this.f2349c = this.f2348b.next();
            this.f2350d = this.f2349c.mo3307a();
        } else {
            this.f2349c = null;
            this.f2350d = 0;
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f2347a.mo3307a() - (this.f2352f + this.f2351e);
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f2353g = this.f2352f + this.f2351e;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        m3341b();
        if (this.f2349c == null) {
            return -1;
        }
        C0777aj c0777aj = this.f2349c;
        int i = this.f2351e;
        this.f2351e = i + 1;
        return c0777aj.mo3306a(i) & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        return m3339a(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        m3340a();
        m3339a(null, 0, this.f2353g);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return m3339a(null, 0, (int) j);
    }
}
