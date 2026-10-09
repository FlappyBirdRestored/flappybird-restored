package com.google.tagmanager.p020a;

import java.util.Map;

/* JADX INFO: renamed from: com.google.tagmanager.a.bc */
/* JADX INFO: loaded from: classes.dex */
class C0797bc implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0791ax f2361a;

    /* JADX INFO: renamed from: b */
    private final Comparable f2362b;

    /* JADX INFO: renamed from: c */
    private Object f2363c;

    C0797bc(C0791ax c0791ax, Comparable comparable, Object obj) {
        this.f2361a = c0791ax;
        this.f2362b = comparable;
        this.f2363c = obj;
    }

    C0797bc(C0791ax c0791ax, Map.Entry entry) {
        this(c0791ax, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: a */
    private boolean m3361a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0797bc c0797bc) {
        return getKey().compareTo(c0797bc.getKey());
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Comparable getKey() {
        return this.f2362b;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m3361a(this.f2362b, entry.getKey()) && m3361a(this.f2363c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f2363c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (this.f2362b == null ? 0 : this.f2362b.hashCode()) ^ (this.f2363c != null ? this.f2363c.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        this.f2361a.m3349e();
        Object obj2 = this.f2363c;
        this.f2363c = obj;
        return obj2;
    }

    public String toString() {
        return this.f2362b + "=" + this.f2363c;
    }
}
