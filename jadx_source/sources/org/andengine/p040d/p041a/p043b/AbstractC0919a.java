package org.andengine.p040d.p041a.p043b;

import java.util.ArrayList;
import org.andengine.p040d.p052e.C0941a;

/* JADX INFO: renamed from: org.andengine.d.a.b.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0919a {

    /* JADX INFO: renamed from: a */
    private final ArrayList f2707a;

    /* JADX INFO: renamed from: b */
    private final int f2708b;

    /* JADX INFO: renamed from: c */
    private final int f2709c;

    /* JADX INFO: renamed from: d */
    private int f2710d;

    public AbstractC0919a() {
        this(0);
    }

    public AbstractC0919a(int i) {
        this(i, 1);
    }

    public AbstractC0919a(int i, int i2) {
        this(i, i2, Integer.MAX_VALUE);
    }

    public AbstractC0919a(int i, int i2, int i3) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("pGrowth must be greater than 0!");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("pAvailableItemsMaximum must be at least 0!");
        }
        this.f2708b = i2;
        this.f2709c = i3;
        this.f2707a = new ArrayList(i);
        if (i > 0) {
            m3756a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m3756a(int i) {
        ArrayList arrayList = this.f2707a;
        int size = this.f2709c - arrayList.size();
        if (i >= size) {
            i = size;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            arrayList.add(mo3760c());
        }
    }

    /* JADX INFO: renamed from: a */
    protected void mo3757a(Object obj) {
    }

    /* JADX INFO: renamed from: b */
    protected abstract Object mo3758b();

    /* JADX INFO: renamed from: b */
    protected void mo3759b(Object obj) {
    }

    /* JADX INFO: renamed from: c */
    protected Object mo3760c() {
        return mo3758b();
    }

    /* JADX INFO: renamed from: c */
    public synchronized void mo3761c(Object obj) {
        try {
            if (obj == null) {
                throw new IllegalArgumentException("Cannot recycle null item!");
            }
            mo3757a(obj);
            if (this.f2707a.size() < this.f2709c) {
                this.f2707a.add(obj);
            }
            this.f2710d--;
            if (this.f2710d < 0) {
                C0941a.m3830d("More items recycled than obtained!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized Object m3762d() {
        Object objMo3760c;
        if (this.f2707a.size() > 0) {
            objMo3760c = this.f2707a.remove(this.f2707a.size() - 1);
        } else {
            if (this.f2708b == 1 || this.f2709c == 0) {
                objMo3760c = mo3760c();
            } else {
                m3756a(this.f2708b);
                objMo3760c = this.f2707a.remove(this.f2707a.size() - 1);
            }
            C0941a.m3821a(String.valueOf(getClass().getName()) + "<" + objMo3760c.getClass().getSimpleName() + "> was exhausted, with " + this.f2710d + " item not yet recycled. Allocated " + this.f2708b + " more.");
        }
        mo3759b(objMo3760c);
        this.f2710d++;
        return objMo3760c;
    }
}
