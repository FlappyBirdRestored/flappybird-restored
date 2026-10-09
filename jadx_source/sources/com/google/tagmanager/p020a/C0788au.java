package com.google.tagmanager.p020a;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.tagmanager.a.au */
/* JADX INFO: loaded from: classes.dex */
class C0788au implements Iterator {

    /* JADX INFO: renamed from: a */
    private final Deque f2341a;

    /* JADX INFO: renamed from: b */
    private C0777aj f2342b;

    private C0788au(AbstractC0818h abstractC0818h) {
        this.f2341a = new ArrayDeque(C0785ar.f2333c.length);
        this.f2342b = m3335a(abstractC0818h);
    }

    /* JADX INFO: renamed from: a */
    private C0777aj m3335a(AbstractC0818h abstractC0818h) {
        AbstractC0818h abstractC0818h2 = abstractC0818h;
        while (abstractC0818h2 instanceof C0785ar) {
            C0785ar c0785ar = (C0785ar) abstractC0818h2;
            this.f2341a.push(c0785ar);
            abstractC0818h2 = c0785ar.f2335e;
        }
        return (C0777aj) abstractC0818h2;
    }

    /* JADX INFO: renamed from: b */
    private C0777aj m3336b() {
        while (!this.f2341a.isEmpty()) {
            C0777aj c0777ajM3335a = m3335a(((C0785ar) this.f2341a.pop()).f2336f);
            if (!c0777ajM3335a.m3404d()) {
                return c0777ajM3335a;
            }
        }
        return null;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0777aj next() {
        if (this.f2342b == null) {
            throw new NoSuchElementException();
        }
        C0777aj c0777aj = this.f2342b;
        this.f2342b = m3336b();
        return c0777aj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2342b != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
