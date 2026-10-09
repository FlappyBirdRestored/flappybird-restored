package android.support.v4.p001b;

import java.util.Iterator;

/* JADX INFO: renamed from: android.support.v4.b.g */
/* JADX INFO: loaded from: classes.dex */
final class C0040g implements Iterator {

    /* JADX INFO: renamed from: a */
    final int f194a;

    /* JADX INFO: renamed from: b */
    int f195b;

    /* JADX INFO: renamed from: c */
    int f196c;

    /* JADX INFO: renamed from: d */
    boolean f197d = false;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ AbstractC0039f f198e;

    C0040g(AbstractC0039f abstractC0039f, int i) {
        this.f198e = abstractC0039f;
        this.f194a = i;
        this.f195b = abstractC0039f.mo187a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f196c < this.f195b;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object objMo189a = this.f198e.mo189a(this.f196c, this.f194a);
        this.f196c++;
        this.f197d = true;
        return objMo189a;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f197d) {
            throw new IllegalStateException();
        }
        this.f196c--;
        this.f195b--;
        this.f197d = false;
        this.f198e.mo191a(this.f196c);
    }
}
