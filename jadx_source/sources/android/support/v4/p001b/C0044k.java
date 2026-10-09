package android.support.v4.p001b;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: android.support.v4.b.k */
/* JADX INFO: loaded from: classes.dex */
final class C0044k implements Collection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC0039f f205a;

    C0044k(AbstractC0039f abstractC0039f) {
        this.f205a = abstractC0039f;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.f205a.mo195c();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f205a.mo193b(obj) >= 0;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f205a.mo187a() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0040g(this.f205a, 1);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        int iMo193b = this.f205a.mo193b(obj);
        if (iMo193b < 0) {
            return false;
        }
        this.f205a.mo191a(iMo193b);
        return true;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        int i = 0;
        int iMo187a = this.f205a.mo187a();
        boolean z = false;
        while (i < iMo187a) {
            if (collection.contains(this.f205a.mo189a(i, 1))) {
                this.f205a.mo191a(i);
                i--;
                iMo187a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        int i = 0;
        int iMo187a = this.f205a.mo187a();
        boolean z = false;
        while (i < iMo187a) {
            if (!collection.contains(this.f205a.mo189a(i, 1))) {
                this.f205a.mo191a(i);
                i--;
                iMo187a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public int size() {
        return this.f205a.mo187a();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.f205a.m207b(1);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f205a.m206a(objArr, 1);
    }
}
