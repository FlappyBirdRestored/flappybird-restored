package com.google.tagmanager.p020a;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.tagmanager.a.al */
/* JADX INFO: loaded from: classes.dex */
class C0779al implements InterfaceC0819i {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0777aj f2330a;

    /* JADX INFO: renamed from: b */
    private int f2331b;

    /* JADX INFO: renamed from: c */
    private final int f2332c;

    private C0779al(C0777aj c0777aj) {
        this.f2330a = c0777aj;
        this.f2331b = 0;
        this.f2332c = c0777aj.mo3307a();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte next() {
        return Byte.valueOf(mo3322b());
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0819i
    /* JADX INFO: renamed from: b */
    public byte mo3322b() {
        try {
            byte[] bArr = this.f2330a.f2328c;
            int i = this.f2331b;
            this.f2331b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2331b < this.f2332c;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
