package com.google.tagmanager.p020a;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.tagmanager.a.bh */
/* JADX INFO: loaded from: classes.dex */
class C0802bh implements ListIterator {

    /* JADX INFO: renamed from: a */
    ListIterator f2371a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f2372b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0801bg f2373c;

    C0802bh(C0801bg c0801bg, int i) {
        this.f2373c = c0801bg;
        this.f2372b = i;
        this.f2371a = this.f2373c.f2370a.listIterator(this.f2372b);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        return (String) this.f2371a.next();
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void set(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String previous() {
        return (String) this.f2371a.previous();
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f2371a.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f2371a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f2371a.nextIndex();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f2371a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
