package com.google.tagmanager.p020a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.tagmanager.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0823m {

    /* JADX INFO: renamed from: a */
    private final byte[] f2442a;

    /* JADX INFO: renamed from: b */
    private final int f2443b;

    /* JADX INFO: renamed from: e */
    private final OutputStream f2446e;

    /* JADX INFO: renamed from: d */
    private int f2445d = 0;

    /* JADX INFO: renamed from: c */
    private int f2444c = 0;

    private C0823m(OutputStream outputStream, byte[] bArr) {
        this.f2446e = outputStream;
        this.f2442a = bArr;
        this.f2443b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public static C0823m m3453a(OutputStream outputStream) {
        return m3454a(outputStream, 4096);
    }

    /* JADX INFO: renamed from: a */
    public static C0823m m3454a(OutputStream outputStream, int i) {
        return new C0823m(outputStream, new byte[i]);
    }

    /* JADX INFO: renamed from: b */
    private void m3455b() throws IOException {
        if (this.f2446e == null) {
            throw new C0824n();
        }
        this.f2446e.write(this.f2442a, 0, this.f2444c);
        this.f2444c = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m3456a() throws IOException {
        if (this.f2446e != null) {
            m3455b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3457a(byte b) throws IOException {
        if (this.f2444c == this.f2443b) {
            m3455b();
        }
        byte[] bArr = this.f2442a;
        int i = this.f2444c;
        this.f2444c = i + 1;
        bArr[i] = b;
        this.f2445d++;
    }

    /* JADX INFO: renamed from: a */
    public void m3458a(int i) throws IOException {
        m3469e(i);
    }

    /* JADX INFO: renamed from: a */
    public void m3459a(long j) throws IOException {
        m3466c(j);
    }

    /* JADX INFO: renamed from: a */
    public void m3460a(AbstractC0818h abstractC0818h) throws IOException {
        m3467d(abstractC0818h.mo3307a());
        m3464b(abstractC0818h);
    }

    /* JADX INFO: renamed from: a */
    public void m3461a(AbstractC0818h abstractC0818h, int i, int i2) throws IOException {
        if (this.f2443b - this.f2444c >= i2) {
            abstractC0818h.m3403b(this.f2442a, i, this.f2444c, i2);
            this.f2444c += i2;
            this.f2445d += i2;
            return;
        }
        int i3 = this.f2443b - this.f2444c;
        abstractC0818h.m3403b(this.f2442a, i, this.f2444c, i3);
        int i4 = i + i3;
        int i5 = i2 - i3;
        this.f2444c = this.f2443b;
        this.f2445d = i3 + this.f2445d;
        m3455b();
        if (i5 <= this.f2443b) {
            abstractC0818h.m3403b(this.f2442a, i4, 0, i5);
            this.f2444c = i5;
        } else {
            abstractC0818h.m3402a(this.f2446e, i4, i5);
        }
        this.f2445d += i5;
    }

    /* JADX INFO: renamed from: b */
    public void m3462b(int i) throws IOException {
        m3467d(i);
    }

    /* JADX INFO: renamed from: b */
    public void m3463b(long j) throws IOException {
        m3468d(j);
    }

    /* JADX INFO: renamed from: b */
    public void m3464b(AbstractC0818h abstractC0818h) throws IOException {
        m3461a(abstractC0818h, 0, abstractC0818h.mo3307a());
    }

    /* JADX INFO: renamed from: c */
    public void m3465c(int i) throws IOException {
        m3457a((byte) i);
    }

    /* JADX INFO: renamed from: c */
    public void m3466c(long j) throws IOException {
        while (((-128) & j) != 0) {
            m3465c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m3465c((int) j);
    }

    /* JADX INFO: renamed from: d */
    public void m3467d(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m3465c((i & 127) | 128);
            i >>>= 7;
        }
        m3465c(i);
    }

    /* JADX INFO: renamed from: d */
    public void m3468d(long j) throws IOException {
        m3465c(((int) j) & 255);
        m3465c(((int) (j >> 8)) & 255);
        m3465c(((int) (j >> 16)) & 255);
        m3465c(((int) (j >> 24)) & 255);
        m3465c(((int) (j >> 32)) & 255);
        m3465c(((int) (j >> 40)) & 255);
        m3465c(((int) (j >> 48)) & 255);
        m3465c(((int) (j >> 56)) & 255);
    }

    /* JADX INFO: renamed from: e */
    public void m3469e(int i) throws IOException {
        m3465c(i & 255);
        m3465c((i >> 8) & 255);
        m3465c((i >> 16) & 255);
        m3465c((i >> 24) & 255);
    }
}
