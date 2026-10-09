package com.google.tagmanager.p020a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.tagmanager.a.bd */
/* JADX INFO: loaded from: classes.dex */
class C0798bd implements Iterator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0791ax f2364a;

    /* JADX INFO: renamed from: b */
    private int f2365b;

    /* JADX INFO: renamed from: c */
    private boolean f2366c;

    /* JADX INFO: renamed from: d */
    private Iterator f2367d;

    private C0798bd(C0791ax c0791ax) {
        this.f2364a = c0791ax;
        this.f2365b = -1;
    }

    /* synthetic */ C0798bd(C0791ax c0791ax, C0792ay c0792ay) {
        this(c0791ax);
    }

    /* JADX INFO: renamed from: b */
    private Iterator m3364b() {
        if (this.f2367d == null) {
            this.f2367d = this.f2364a.f2356c.entrySet().iterator();
        }
        return this.f2367d;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        this.f2366c = true;
        int i = this.f2365b + 1;
        this.f2365b = i;
        return i < this.f2364a.f2355b.size() ? (Map.Entry) this.f2364a.f2355b.get(this.f2365b) : (Map.Entry) m3364b().next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2365b + 1 < this.f2364a.f2355b.size() || m3364b().hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f2366c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f2366c = false;
        this.f2364a.m3349e();
        if (this.f2365b >= this.f2364a.f2355b.size()) {
            m3364b().remove();
            return;
        }
        C0791ax c0791ax = this.f2364a;
        int i = this.f2365b;
        this.f2365b = i - 1;
        c0791ax.m3347c(i);
    }
}
