package com.google.tagmanager.p020a;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.tagmanager.a.bg */
/* JADX INFO: loaded from: classes.dex */
public class C0801bg extends AbstractList implements InterfaceC0776ai, RandomAccess {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0776ai f2370a;

    public C0801bg(InterfaceC0776ai interfaceC0776ai) {
        this.f2370a = interfaceC0776ai;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        return (String) this.f2370a.get(i);
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0776ai
    /* JADX INFO: renamed from: a */
    public List mo3301a() {
        return this.f2370a.mo3301a();
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0776ai
    /* JADX INFO: renamed from: a */
    public void mo3302a(AbstractC0818h abstractC0818h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0803bi(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        return new C0802bh(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2370a.size();
    }
}
