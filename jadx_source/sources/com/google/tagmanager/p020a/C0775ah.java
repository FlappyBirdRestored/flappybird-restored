package com.google.tagmanager.p020a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.tagmanager.a.ah */
/* JADX INFO: loaded from: classes.dex */
public class C0775ah extends AbstractList implements InterfaceC0776ai, RandomAccess {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0776ai f2326a = new C0801bg(new C0775ah());

    /* JADX INFO: renamed from: b */
    private final List f2327b;

    public C0775ah() {
        this.f2327b = new ArrayList();
    }

    public C0775ah(InterfaceC0776ai interfaceC0776ai) {
        this.f2327b = new ArrayList(interfaceC0776ai.size());
        addAll(interfaceC0776ai);
    }

    /* JADX INFO: renamed from: a */
    private static String m3298a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof AbstractC0818h ? ((AbstractC0818h) obj).m3406f() : C0770ac.m3284b((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        Object obj = this.f2327b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0818h) {
            AbstractC0818h abstractC0818h = (AbstractC0818h) obj;
            String strM3406f = abstractC0818h.m3406f();
            if (abstractC0818h.mo3316g()) {
                this.f2327b.set(i, strM3406f);
            }
            return strM3406f;
        }
        byte[] bArr = (byte[]) obj;
        String strM3284b = C0770ac.m3284b(bArr);
        if (C0770ac.m3283a(bArr)) {
            this.f2327b.set(i, strM3284b);
        }
        return strM3284b;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        return m3298a(this.f2327b.set(i, str));
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0776ai
    /* JADX INFO: renamed from: a */
    public List mo3301a() {
        return Collections.unmodifiableList(this.f2327b);
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0776ai
    /* JADX INFO: renamed from: a */
    public void mo3302a(AbstractC0818h abstractC0818h) {
        this.f2327b.add(abstractC0818h);
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC0776ai) {
            collection = ((InterfaceC0776ai) collection).mo3301a();
        }
        boolean zAddAll = this.f2327b.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        Object objRemove = this.f2327b.remove(i);
        this.modCount++;
        return m3298a(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        this.f2327b.add(i, str);
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f2327b.clear();
        this.modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2327b.size();
    }
}
