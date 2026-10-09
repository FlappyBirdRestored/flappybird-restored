package com.google.tagmanager.p020a;

/* JADX INFO: renamed from: com.google.tagmanager.a.e */
/* JADX INFO: loaded from: classes.dex */
class C0815e extends C0777aj {

    /* JADX INFO: renamed from: d */
    private final int f2415d;

    /* JADX INFO: renamed from: e */
    private final int f2416e;

    C0815e(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            throw new IllegalArgumentException("Offset too small: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Length too small: " + i);
        }
        if (((long) i) + ((long) i2) > bArr.length) {
            throw new IllegalArgumentException("Offset+Length too large: " + i + "+" + i2);
        }
        this.f2415d = i;
        this.f2416e = i2;
    }

    @Override // com.google.tagmanager.p020a.C0777aj
    /* JADX INFO: renamed from: a */
    public byte mo3306a(int i) {
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index too small: " + i);
        }
        if (i >= mo3307a()) {
            throw new ArrayIndexOutOfBoundsException("Index too large: " + i + ", " + mo3307a());
        }
        return this.f2328c[this.f2415d + i];
    }

    @Override // com.google.tagmanager.p020a.C0777aj, com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: a */
    public int mo3307a() {
        return this.f2416e;
    }

    @Override // com.google.tagmanager.p020a.C0777aj, com.google.tagmanager.p020a.AbstractC0818h
    /* JADX INFO: renamed from: a */
    protected void mo3310a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f2328c, mo3312b() + i, bArr, i2, i3);
    }

    @Override // com.google.tagmanager.p020a.C0777aj
    /* JADX INFO: renamed from: b */
    protected int mo3312b() {
        return this.f2415d;
    }

    @Override // com.google.tagmanager.p020a.C0777aj, com.google.tagmanager.p020a.AbstractC0818h, java.lang.Iterable
    /* JADX INFO: renamed from: c */
    public InterfaceC0819i iterator() {
        return new C0817g(this);
    }
}
