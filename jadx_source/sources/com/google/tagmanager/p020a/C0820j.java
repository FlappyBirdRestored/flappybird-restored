package com.google.tagmanager.p020a;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.tagmanager.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0820j extends OutputStream {

    /* JADX INFO: renamed from: a */
    private static final byte[] f2422a = new byte[0];

    /* JADX INFO: renamed from: b */
    private final int f2423b;

    /* JADX INFO: renamed from: c */
    private final ArrayList f2424c;

    /* JADX INFO: renamed from: d */
    private int f2425d;

    /* JADX INFO: renamed from: e */
    private byte[] f2426e;

    /* JADX INFO: renamed from: f */
    private int f2427f;

    C0820j(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Buffer size < 0");
        }
        this.f2423b = i;
        this.f2424c = new ArrayList();
        this.f2426e = new byte[i];
    }

    /* JADX INFO: renamed from: a */
    private void m3407a(int i) {
        this.f2424c.add(new C0777aj(this.f2426e));
        this.f2425d += this.f2426e.length;
        this.f2426e = new byte[Math.max(this.f2423b, Math.max(i, this.f2425d >>> 1))];
        this.f2427f = 0;
    }

    /* JADX INFO: renamed from: c */
    private void m3408c() {
        if (this.f2427f >= this.f2426e.length) {
            this.f2424c.add(new C0777aj(this.f2426e));
            this.f2426e = f2422a;
        } else if (this.f2427f > 0) {
            byte[] bArr = new byte[this.f2427f];
            System.arraycopy(this.f2426e, 0, bArr, 0, this.f2427f);
            this.f2424c.add(new C0777aj(bArr));
        }
        this.f2425d += this.f2427f;
        this.f2427f = 0;
    }

    /* JADX INFO: renamed from: a */
    public synchronized AbstractC0818h m3409a() {
        m3408c();
        return AbstractC0818h.m3397a(this.f2424c);
    }

    /* JADX INFO: renamed from: b */
    public synchronized int m3410b() {
        return this.f2425d + this.f2427f;
    }

    public String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m3410b()));
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
        if (this.f2427f == this.f2426e.length) {
            m3407a(1);
        }
        byte[] bArr = this.f2426e;
        int i2 = this.f2427f;
        this.f2427f = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        if (i2 <= this.f2426e.length - this.f2427f) {
            System.arraycopy(bArr, i, this.f2426e, this.f2427f, i2);
            this.f2427f += i2;
        } else {
            int length = this.f2426e.length - this.f2427f;
            System.arraycopy(bArr, i, this.f2426e, this.f2427f, length);
            int i3 = i + length;
            int i4 = i2 - length;
            m3407a(i4);
            System.arraycopy(bArr, i3, this.f2426e, 0, i4);
            this.f2427f = i4;
        }
    }
}
