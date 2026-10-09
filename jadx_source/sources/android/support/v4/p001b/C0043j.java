package android.support.v4.p001b;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: android.support.v4.b.j */
/* JADX INFO: loaded from: classes.dex */
final class C0043j implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    int f201a;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ AbstractC0039f f204d;

    /* JADX INFO: renamed from: c */
    boolean f203c = false;

    /* JADX INFO: renamed from: b */
    int f202b = -1;

    C0043j(AbstractC0039f abstractC0039f) {
        this.f204d = abstractC0039f;
        this.f201a = abstractC0039f.mo187a() - 1;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        this.f202b++;
        this.f203c = true;
        return this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f203c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C0036c.m198a(entry.getKey(), this.f204d.mo189a(this.f202b, 0)) && C0036c.m198a(entry.getValue(), this.f204d.mo189a(this.f202b, 1));
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        if (this.f203c) {
            return this.f204d.mo189a(this.f202b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        if (this.f203c) {
            return this.f204d.mo189a(this.f202b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f202b < this.f201a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f203c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object objMo189a = this.f204d.mo189a(this.f202b, 0);
        Object objMo189a2 = this.f204d.mo189a(this.f202b, 1);
        return (objMo189a2 != null ? objMo189a2.hashCode() : 0) ^ (objMo189a == null ? 0 : objMo189a.hashCode());
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f203c) {
            throw new IllegalStateException();
        }
        this.f202b--;
        this.f201a--;
        this.f203c = false;
        this.f204d.mo191a(this.f202b);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (this.f203c) {
            return this.f204d.mo190a(this.f202b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
