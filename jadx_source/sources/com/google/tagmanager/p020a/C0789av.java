package com.google.tagmanager.p020a;

/* JADX INFO: renamed from: com.google.tagmanager.a.av */
/* JADX INFO: loaded from: classes.dex */
class C0789av implements InterfaceC0819i {

    /* JADX INFO: renamed from: a */
    int f2343a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0785ar f2344b;

    /* JADX INFO: renamed from: c */
    private final C0788au f2345c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0819i f2346d;

    private C0789av(C0785ar c0785ar) {
        this.f2344b = c0785ar;
        this.f2345c = new C0788au(c0785ar);
        this.f2346d = this.f2345c.next().iterator();
        this.f2343a = c0785ar.mo3307a();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte next() {
        return Byte.valueOf(mo3322b());
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0819i
    /* JADX INFO: renamed from: b */
    public byte mo3322b() {
        if (!this.f2346d.hasNext()) {
            this.f2346d = this.f2345c.next().iterator();
        }
        this.f2343a--;
        return this.f2346d.mo3322b();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2343a > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
