package android.support.v4.p001b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: android.support.v4.b.h */
/* JADX INFO: loaded from: classes.dex */
final class C0041h implements Set {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC0039f f199a;

    C0041h(AbstractC0039f abstractC0039f) {
        this.f199a = abstractC0039f;
    }

    @Override // java.util.Set, java.util.Collection
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        int iMo187a = this.f199a.mo187a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.f199a.mo192a(entry.getKey(), entry.getValue());
        }
        return iMo187a != this.f199a.mo187a();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f199a.mo195c();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int iMo188a = this.f199a.mo188a(entry.getKey());
        if (iMo188a >= 0) {
            return C0036c.m198a(this.f199a.mo189a(iMo188a, 1), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        return AbstractC0039f.m203a((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        int iMo187a = this.f199a.mo187a() - 1;
        int iHashCode = 0;
        while (iMo187a >= 0) {
            Object objMo189a = this.f199a.mo189a(iMo187a, 0);
            Object objMo189a2 = this.f199a.mo189a(iMo187a, 1);
            iMo187a--;
            iHashCode += (objMo189a2 == null ? 0 : objMo189a2.hashCode()) ^ (objMo189a == null ? 0 : objMo189a.hashCode());
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f199a.mo187a() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0043j(this.f199a);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f199a.mo187a();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}
