package com.google.tagmanager.p020a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.tagmanager.a.aj */
/* JADX INFO: loaded from: classes.dex */
class C0777aj extends AbstractC0818h {

    /* JADX INFO: renamed from: c */
    protected final byte[] f2328c;

    /* JADX INFO: renamed from: d */
    private int f2329d = 0;

    C0777aj(byte[] bArr) {
        this.f2328c = bArr;
    }

    /* JADX INFO: renamed from: a */
    static int m3305a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public byte mo3306a(int i) {
        return this.f2328c[i];
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: a */
    public int mo3307a() {
        return this.f2328c.length;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: a */
    protected int mo3308a(int i, int i2, int i3) {
        int iMo3312b = mo3312b() + i2;
        return C0804bj.m3378a(i, this.f2328c, iMo3312b, iMo3312b + i3);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: a */
    public String mo3309a(String str) {
        return new String(this.f2328c, mo3312b(), mo3307a(), str);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: a */
    protected void mo3310a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f2328c, i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    boolean m3311a(C0777aj c0777aj, int i, int i2) {
        if (i2 > c0777aj.mo3307a()) {
            throw new IllegalArgumentException("Length too large: " + i2 + mo3307a());
        }
        if (i + i2 > c0777aj.mo3307a()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + c0777aj.mo3307a());
        }
        byte[] bArr = this.f2328c;
        byte[] bArr2 = c0777aj.f2328c;
        int iMo3312b = mo3312b() + i2;
        int iMo3312b2 = mo3312b();
        int iMo3312b3 = c0777aj.mo3312b() + i;
        while (iMo3312b2 < iMo3312b) {
            if (bArr[iMo3312b2] != bArr2[iMo3312b3]) {
                return false;
            }
            iMo3312b2++;
            iMo3312b3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    protected int mo3312b() {
        return 0;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: b */
    protected int mo3313b(int i, int i2, int i3) {
        return m3305a(i, this.f2328c, mo3312b() + i2, i3);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: b */
    void mo3314b(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f2328c, mo3312b() + i, i2);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h, java.lang.Iterable
    /* JADX INFO: renamed from: c */
    public InterfaceC0819i iterator() {
        return new C0779al(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0818h) && mo3307a() == ((AbstractC0818h) obj).mo3307a()) {
            if (mo3307a() == 0) {
                return true;
            }
            if (obj instanceof C0777aj) {
                return m3311a((C0777aj) obj, 0, mo3307a());
            }
            if (obj instanceof C0785ar) {
                return obj.equals(this);
            }
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + obj.getClass());
        }
        return false;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: g */
    public boolean mo3316g() {
        int iMo3312b = mo3312b();
        return C0804bj.m3380a(this.f2328c, iMo3312b, mo3307a() + iMo3312b);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: h */
    public C0821k mo3317h() {
        return C0821k.m3412a(this);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    public int hashCode() {
        int iMo3313b = this.f2329d;
        if (iMo3313b == 0) {
            int iMo3307a = mo3307a();
            iMo3313b = mo3313b(iMo3307a, 0, iMo3307a);
            if (iMo3313b == 0) {
                iMo3313b = 1;
            }
            this.f2329d = iMo3313b;
        }
        return iMo3313b;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: j */
    protected int mo3318j() {
        return 0;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: k */
    protected boolean mo3319k() {
        return true;
    }

    @Override // com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: l */
    protected int mo3320l() {
        return this.f2329d;
    }
}
