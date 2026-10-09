package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.C0585dl;
import com.google.android.gms.internal.C0588do;

/* JADX INFO: renamed from: com.google.android.gms.common.data.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0450b {

    /* JADX INFO: renamed from: a */
    protected final C0452d f1611a;

    /* JADX INFO: renamed from: b */
    protected final int f1612b;

    /* JADX INFO: renamed from: c */
    private final int f1613c;

    public AbstractC0450b(C0452d c0452d, int i) {
        this.f1611a = (C0452d) C0588do.m2704a(c0452d);
        C0588do.m2706a(i >= 0 && i < c0452d.m1864g());
        this.f1612b = i;
        this.f1613c = c0452d.m1851a(this.f1612b);
    }

    /* JADX INFO: renamed from: a */
    protected long m1844a(String str) {
        return this.f1611a.m1852a(str, this.f1612b, this.f1613c);
    }

    /* JADX INFO: renamed from: b */
    protected int m1845b(String str) {
        return this.f1611a.m1855b(str, this.f1612b, this.f1613c);
    }

    /* JADX INFO: renamed from: c */
    protected boolean m1846c(String str) {
        return this.f1611a.m1858d(str, this.f1612b, this.f1613c);
    }

    /* JADX INFO: renamed from: d */
    protected String m1847d(String str) {
        return this.f1611a.m1856c(str, this.f1612b, this.f1613c);
    }

    /* JADX INFO: renamed from: e */
    protected Uri m1848e(String str) {
        return this.f1611a.m1861e(str, this.f1612b, this.f1613c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC0450b)) {
            return false;
        }
        AbstractC0450b abstractC0450b = (AbstractC0450b) obj;
        return C0585dl.m2702a(Integer.valueOf(abstractC0450b.f1612b), Integer.valueOf(this.f1612b)) && C0585dl.m2702a(Integer.valueOf(abstractC0450b.f1613c), Integer.valueOf(this.f1613c)) && abstractC0450b.f1611a == this.f1611a;
    }

    /* JADX INFO: renamed from: f */
    protected boolean m1849f(String str) {
        return this.f1611a.m1863f(str, this.f1612b, this.f1613c);
    }

    public int hashCode() {
        return C0585dl.m2700a(Integer.valueOf(this.f1612b), Integer.valueOf(this.f1613c), this.f1611a);
    }
}
