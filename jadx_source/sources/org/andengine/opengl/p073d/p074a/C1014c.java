package org.andengine.opengl.p073d.p074a;

/* JADX INFO: renamed from: org.andengine.opengl.d.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C1014c {

    /* JADX INFO: renamed from: a */
    private final int f2964a;

    /* JADX INFO: renamed from: b */
    private final C1012a[] f2965b;

    public C1014c(int i, C1012a... c1012aArr) {
        this.f2965b = c1012aArr;
        this.f2964a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m3986a() {
        C1012a[] c1012aArr = this.f2965b;
        int i = this.f2964a;
        for (C1012a c1012a : c1012aArr) {
            c1012a.mo3985a(i);
        }
    }
}
