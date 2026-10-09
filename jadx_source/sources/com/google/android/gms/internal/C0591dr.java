package com.google.android.gms.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.dr */
/* JADX INFO: loaded from: classes.dex */
public class C0591dr {

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap f2065a;

    /* JADX INFO: renamed from: b */
    private int f2066b;

    /* JADX INFO: renamed from: c */
    private int f2067c;

    /* JADX INFO: renamed from: d */
    private int f2068d;

    /* JADX INFO: renamed from: e */
    private int f2069e;

    /* JADX INFO: renamed from: f */
    private int f2070f;

    /* JADX INFO: renamed from: g */
    private int f2071g;

    /* JADX INFO: renamed from: c */
    private int m2715c(Object obj, Object obj2) {
        int iMo1896a = mo1896a(obj, obj2);
        if (iMo1896a < 0) {
            throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
        }
        return iMo1896a;
    }

    /* JADX INFO: renamed from: a */
    protected int mo1896a(Object obj, Object obj2) {
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m2716a() {
        m2717a(-1);
    }

    /* JADX INFO: renamed from: a */
    public void m2717a(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this) {
                if (this.f2066b < 0 || (this.f2065a.isEmpty() && this.f2066b != 0)) {
                    break;
                }
                if (this.f2066b <= i || this.f2065a.isEmpty()) {
                    return;
                }
                Map.Entry entry = (Map.Entry) this.f2065a.entrySet().iterator().next();
                key = entry.getKey();
                value = entry.getValue();
                this.f2065a.remove(key);
                this.f2066b -= m2715c(key, value);
                this.f2069e++;
            }
            mo1898a(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    /* JADX INFO: renamed from: a */
    protected void mo1898a(boolean z, Object obj, Object obj2, Object obj3) {
    }

    /* JADX INFO: renamed from: b */
    public final Object m2718b(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f2068d++;
            this.f2066b += m2715c(obj, obj2);
            objPut = this.f2065a.put(obj, obj2);
            if (objPut != null) {
                this.f2066b -= m2715c(obj, objPut);
            }
        }
        if (objPut != null) {
            mo1898a(false, obj, objPut, obj2);
        }
        m2717a(this.f2067c);
        return objPut;
    }

    public final synchronized String toString() {
        String str;
        synchronized (this) {
            int i = this.f2070f + this.f2071g;
            str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f2067c), Integer.valueOf(this.f2070f), Integer.valueOf(this.f2071g), Integer.valueOf(i != 0 ? (this.f2070f * 100) / i : 0));
        }
        return str;
    }
}
