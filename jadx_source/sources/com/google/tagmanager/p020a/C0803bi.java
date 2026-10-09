package com.google.tagmanager.p020a;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.tagmanager.a.bi */
/* JADX INFO: loaded from: classes.dex */
class C0803bi implements Iterator {

    /* JADX INFO: renamed from: a */
    Iterator f2374a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0801bg f2375b;

    C0803bi(C0801bg c0801bg) {
        this.f2375b = c0801bg;
        this.f2374a = this.f2375b.f2370a.iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        return (String) this.f2374a.next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2374a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
