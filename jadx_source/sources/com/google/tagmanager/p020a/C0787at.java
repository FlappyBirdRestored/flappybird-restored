package com.google.tagmanager.p020a;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/* JADX INFO: renamed from: com.google.tagmanager.a.at */
/* JADX INFO: loaded from: classes.dex */
class C0787at {

    /* JADX INFO: renamed from: a */
    private final Deque f2340a;

    private C0787at() {
        this.f2340a = new ArrayDeque(C0785ar.f2333c.length);
    }

    /* JADX INFO: renamed from: a */
    private int m3330a(int i) {
        int iBinarySearch = Arrays.binarySearch(C0785ar.f2333c, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public AbstractC0818h m3332a(AbstractC0818h abstractC0818h, AbstractC0818h abstractC0818h2) {
        m3333a(abstractC0818h);
        m3333a(abstractC0818h2);
        AbstractC0818h c0785ar = (AbstractC0818h) this.f2340a.pop();
        while (!this.f2340a.isEmpty()) {
            c0785ar = new C0785ar((AbstractC0818h) this.f2340a.pop(), c0785ar);
        }
        return c0785ar;
    }

    /* JADX INFO: renamed from: a */
    private void m3333a(AbstractC0818h abstractC0818h) {
        if (abstractC0818h.mo3319k()) {
            m3334b(abstractC0818h);
        } else {
            if (!(abstractC0818h instanceof C0785ar)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC0818h.getClass());
            }
            C0785ar c0785ar = (C0785ar) abstractC0818h;
            m3333a(c0785ar.f2335e);
            m3333a(c0785ar.f2336f);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3334b(AbstractC0818h abstractC0818h) {
        C0786as c0786as = null;
        int iM3330a = m3330a(abstractC0818h.mo3307a());
        int i = C0785ar.f2333c[iM3330a + 1];
        if (this.f2340a.isEmpty() || ((AbstractC0818h) this.f2340a.peek()).mo3307a() >= i) {
            this.f2340a.push(abstractC0818h);
            return;
        }
        int i2 = C0785ar.f2333c[iM3330a];
        AbstractC0818h c0785ar = (AbstractC0818h) this.f2340a.pop();
        while (!this.f2340a.isEmpty() && ((AbstractC0818h) this.f2340a.peek()).mo3307a() < i2) {
            c0785ar = new C0785ar((AbstractC0818h) this.f2340a.pop(), c0785ar);
        }
        C0785ar c0785ar2 = new C0785ar(c0785ar, abstractC0818h);
        while (!this.f2340a.isEmpty()) {
            if (((AbstractC0818h) this.f2340a.peek()).mo3307a() >= C0785ar.f2333c[m3330a(c0785ar2.mo3307a()) + 1]) {
                break;
            } else {
                c0785ar2 = new C0785ar((AbstractC0818h) this.f2340a.pop(), c0785ar2);
            }
        }
        this.f2340a.push(c0785ar2);
    }
}
