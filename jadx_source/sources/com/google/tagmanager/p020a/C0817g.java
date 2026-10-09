package com.google.tagmanager.p020a;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.tagmanager.a.g */
/* JADX INFO: loaded from: classes.dex */
class C0817g implements InterfaceC0819i {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0815e f2417a;

    /* JADX INFO: renamed from: b */
    private int f2418b;

    /* JADX INFO: renamed from: c */
    private final int f2419c;

    private C0817g(C0815e c0815e) {
        this.f2417a = c0815e;
        this.f2418b = c0815e.mo3312b();
        this.f2419c = this.f2418b + c0815e.mo3307a();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte next() {
        return Byte.valueOf(mo3322b());
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0819i
    /* JADX INFO: renamed from: b */
    public byte mo3322b() {
        if (this.f2418b >= this.f2419c) {
            throw new NoSuchElementException();
        }
        byte[] bArr = this.f2417a.f2328c;
        int i = this.f2418b;
        this.f2418b = i + 1;
        return bArr[i];
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2418b < this.f2419c;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
