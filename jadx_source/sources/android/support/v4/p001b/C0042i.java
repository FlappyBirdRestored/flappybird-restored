package android.support.v4.p001b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: android.support.v4.b.i */
/* JADX INFO: loaded from: classes.dex */
final class C0042i implements Set {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC0039f f200a;

    C0042i(AbstractC0039f abstractC0039f) {
        this.f200a = abstractC0039f;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f200a.mo195c();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f200a.mo188a(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return AbstractC0039f.m202a(this.f200a.mo194b(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        return AbstractC0039f.m203a((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        int iHashCode = 0;
        for (int iMo187a = this.f200a.mo187a() - 1; iMo187a >= 0; iMo187a--) {
            Object objMo189a = this.f200a.mo189a(iMo187a, 0);
            iHashCode += objMo189a == null ? 0 : objMo189a.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f200a.mo187a() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0040g(this.f200a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int iMo188a = this.f200a.mo188a(obj);
        if (iMo188a < 0) {
            return false;
        }
        this.f200a.mo191a(iMo188a);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        return AbstractC0039f.m204b(this.f200a.mo194b(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        return AbstractC0039f.m205c(this.f200a.mo194b(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f200a.mo187a();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f200a.m207b(0);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f200a.m206a(objArr, 0);
    }
}
