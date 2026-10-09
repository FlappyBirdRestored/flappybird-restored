package com.google.ads;

/* JADX INFO: renamed from: com.google.ads.ar */
/* JADX INFO: loaded from: classes.dex */
public class C0277ar {

    /* JADX INFO: renamed from: a */
    private final byte[] f942a = new byte[256];

    /* JADX INFO: renamed from: b */
    private int f943b;

    /* JADX INFO: renamed from: c */
    private int f944c;

    public C0277ar(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f942a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            i2 = (i2 + this.f942a[i3] + bArr[i3 % bArr.length]) & 255;
            byte b = this.f942a[i3];
            this.f942a[i3] = this.f942a[i2];
            this.f942a[i2] = b;
        }
        this.f943b = 0;
        this.f944c = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m1212a(byte[] bArr) {
        int i = this.f943b;
        int i2 = this.f944c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f942a[i]) & 255;
            byte b = this.f942a[i];
            this.f942a[i] = this.f942a[i2];
            this.f942a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f942a[(this.f942a[i] + this.f942a[i2]) & 255]);
        }
        this.f943b = i;
        this.f944c = i2;
    }
}
