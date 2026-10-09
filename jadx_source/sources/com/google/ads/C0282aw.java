package com.google.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.ads.aw */
/* JADX INFO: loaded from: classes.dex */
public final class C0282aw {

    /* JADX INFO: renamed from: a */
    private final byte[] f951a;

    /* JADX INFO: renamed from: b */
    private final int f952b;

    /* JADX INFO: renamed from: e */
    private final OutputStream f955e;

    /* JADX INFO: renamed from: d */
    private int f954d = 0;

    /* JADX INFO: renamed from: c */
    private int f953c = 0;

    private C0282aw(OutputStream outputStream, byte[] bArr) {
        this.f955e = outputStream;
        this.f951a = bArr;
        this.f952b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public static C0282aw m1217a(OutputStream outputStream) {
        return m1218a(outputStream, 4096);
    }

    /* JADX INFO: renamed from: a */
    public static C0282aw m1218a(OutputStream outputStream, int i) {
        return new C0282aw(outputStream, new byte[i]);
    }

    /* JADX INFO: renamed from: b */
    private void m1219b() throws IOException {
        if (this.f955e == null) {
            throw new C0283ax();
        }
        this.f955e.write(this.f951a, 0, this.f953c);
        this.f953c = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m1220a() throws IOException {
        if (this.f955e != null) {
            m1219b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1221a(byte b) throws IOException {
        if (this.f953c == this.f952b) {
            m1219b();
        }
        byte[] bArr = this.f951a;
        int i = this.f953c;
        this.f953c = i + 1;
        bArr[i] = b;
        this.f954d++;
    }

    /* JADX INFO: renamed from: a */
    public void m1222a(int i) throws IOException {
        m1221a((byte) i);
    }

    /* JADX INFO: renamed from: a */
    public void m1223a(int i, int i2) throws IOException {
        m1230b(C0284ay.m1232a(i, i2));
    }

    /* JADX INFO: renamed from: a */
    public void m1224a(int i, long j) throws IOException {
        m1223a(i, 0);
        m1226a(j);
    }

    /* JADX INFO: renamed from: a */
    public void m1225a(int i, String str) throws IOException {
        m1223a(i, 2);
        m1227a(str);
    }

    /* JADX INFO: renamed from: a */
    public void m1226a(long j) throws IOException {
        m1231b(j);
    }

    /* JADX INFO: renamed from: a */
    public void m1227a(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m1230b(bytes.length);
        m1228a(bytes);
    }

    /* JADX INFO: renamed from: a */
    public void m1228a(byte[] bArr) throws IOException {
        m1229a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public void m1229a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f952b - this.f953c >= i2) {
            System.arraycopy(bArr, i, this.f951a, this.f953c, i2);
            this.f953c += i2;
            this.f954d += i2;
            return;
        }
        int i3 = this.f952b - this.f953c;
        System.arraycopy(bArr, i, this.f951a, this.f953c, i3);
        int i4 = i + i3;
        int i5 = i2 - i3;
        this.f953c = this.f952b;
        this.f954d = i3 + this.f954d;
        m1219b();
        if (i5 <= this.f952b) {
            System.arraycopy(bArr, i4, this.f951a, 0, i5);
            this.f953c = i5;
        } else {
            this.f955e.write(bArr, i4, i5);
        }
        this.f954d += i5;
    }

    /* JADX INFO: renamed from: b */
    public void m1230b(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m1222a((i & 127) | 128);
            i >>>= 7;
        }
        m1222a(i);
    }

    /* JADX INFO: renamed from: b */
    public void m1231b(long j) throws IOException {
        while (((-128) & j) != 0) {
            m1222a((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m1222a((int) j);
    }
}
