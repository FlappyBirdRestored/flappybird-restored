package com.google.tagmanager.p020a;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.tagmanager.a.ax */
/* JADX INFO: loaded from: classes.dex */
class C0791ax extends AbstractMap {

    /* JADX INFO: renamed from: a */
    private final int f2354a;

    /* JADX INFO: renamed from: b */
    private List f2355b;

    /* JADX INFO: renamed from: c */
    private Map f2356c;

    /* JADX INFO: renamed from: d */
    private boolean f2357d;

    /* JADX INFO: renamed from: e */
    private volatile C0799be f2358e;

    private C0791ax(int i) {
        this.f2354a = i;
        this.f2355b = Collections.emptyList();
        this.f2356c = Collections.emptyMap();
    }

    /* synthetic */ C0791ax(int i, C0792ay c0792ay) {
        this(i);
    }

    /* JADX INFO: renamed from: a */
    private int m3342a(Comparable comparable) {
        int i;
        int i2;
        int i3 = 0;
        int size = this.f2355b.size() - 1;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo(((C0797bc) this.f2355b.get(size)).m3363a());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i3 <= size) {
            int i4 = (i3 + size) / 2;
            int iCompareTo2 = comparable.compareTo(((C0797bc) this.f2355b.get(i4)).m3363a());
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
                i = i3;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                int i5 = size;
                i = i4 + 1;
                i2 = i5;
            }
            i3 = i;
            size = i2;
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: a */
    static C0791ax m3343a(int i) {
        return new C0792ay(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public Object m3347c(int i) {
        m3349e();
        Object value = ((C0797bc) this.f2355b.remove(i)).getValue();
        if (!this.f2356c.isEmpty()) {
            Iterator it = m3350f().entrySet().iterator();
            this.f2355b.add(new C0797bc(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m3349e() {
        if (this.f2357d) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: f */
    private SortedMap m3350f() {
        m3349e();
        if (this.f2356c.isEmpty() && !(this.f2356c instanceof TreeMap)) {
            this.f2356c = new TreeMap();
        }
        return (SortedMap) this.f2356c;
    }

    /* JADX INFO: renamed from: g */
    private void m3351g() {
        m3349e();
        if (!this.f2355b.isEmpty() || (this.f2355b instanceof ArrayList)) {
            return;
        }
        this.f2355b = new ArrayList(this.f2354a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object put(Comparable comparable, Object obj) {
        m3349e();
        int iM3342a = m3342a(comparable);
        if (iM3342a >= 0) {
            return ((C0797bc) this.f2355b.get(iM3342a)).setValue(obj);
        }
        m3351g();
        int i = -(iM3342a + 1);
        if (i >= this.f2354a) {
            return m3350f().put(comparable, obj);
        }
        if (this.f2355b.size() == this.f2354a) {
            C0797bc c0797bc = (C0797bc) this.f2355b.remove(this.f2354a - 1);
            m3350f().put(c0797bc.m3363a(), c0797bc.getValue());
        }
        this.f2355b.add(i, new C0797bc(this, comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void mo3353a() {
        if (this.f2357d) {
            return;
        }
        this.f2356c = this.f2356c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2356c);
        this.f2357d = true;
    }

    /* JADX INFO: renamed from: b */
    public Map.Entry m3354b(int i) {
        return (Map.Entry) this.f2355b.get(i);
    }

    /* JADX INFO: renamed from: b */
    public boolean m3355b() {
        return this.f2357d;
    }

    /* JADX INFO: renamed from: c */
    public int m3356c() {
        return this.f2355b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m3349e();
        if (!this.f2355b.isEmpty()) {
            this.f2355b.clear();
        }
        if (this.f2356c.isEmpty()) {
            return;
        }
        this.f2356c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m3342a(comparable) >= 0 || this.f2356c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public Iterable m3357d() {
        return this.f2356c.isEmpty() ? C0793az.m3358a() : this.f2356c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f2358e == null) {
            this.f2358e = new C0799be(this, null);
        }
        return this.f2358e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM3342a = m3342a(comparable);
        return iM3342a >= 0 ? ((C0797bc) this.f2355b.get(iM3342a)).getValue() : this.f2356c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m3349e();
        Comparable comparable = (Comparable) obj;
        int iM3342a = m3342a(comparable);
        if (iM3342a >= 0) {
            return m3347c(iM3342a);
        }
        if (this.f2356c.isEmpty()) {
            return null;
        }
        return this.f2356c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f2355b.size() + this.f2356c.size();
    }
}
