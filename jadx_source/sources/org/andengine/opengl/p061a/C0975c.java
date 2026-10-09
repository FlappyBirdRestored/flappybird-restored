package org.andengine.opengl.p061a;

import java.util.ArrayList;
import org.andengine.opengl.util.C1024e;

/* JADX INFO: renamed from: org.andengine.opengl.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0975c {

    /* JADX INFO: renamed from: a */
    private final ArrayList f2831a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m3894a() {
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m3895a(C1024e c1024e) {
        ArrayList arrayList = this.f2831a;
        int size = arrayList.size();
        if (size > 0) {
            for (int i = size - 1; i >= 0; i--) {
                ((C0972a) arrayList.get(i)).m3890a(c1024e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m3896b() {
        ArrayList arrayList = this.f2831a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C0972a) arrayList.get(size)).m3891b();
        }
        this.f2831a.clear();
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m3897c() {
        ArrayList arrayList = this.f2831a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C0972a) arrayList.get(size)).m3891b();
        }
    }
}
