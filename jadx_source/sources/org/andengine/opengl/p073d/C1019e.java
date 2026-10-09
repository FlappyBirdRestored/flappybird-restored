package org.andengine.opengl.p073d;

import java.util.ArrayList;
import org.andengine.opengl.util.C1024e;

/* JADX INFO: renamed from: org.andengine.opengl.d.e */
/* JADX INFO: loaded from: classes.dex */
public class C1019e {

    /* JADX INFO: renamed from: a */
    private final ArrayList f2981a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final ArrayList f2982b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m3999a() {
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m4000a(InterfaceC1017c interfaceC1017c) {
        this.f2981a.add(interfaceC1017c);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m4001a(C1024e c1024e) {
        ArrayList arrayList = this.f2981a;
        ArrayList arrayList2 = this.f2982b;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            InterfaceC1017c interfaceC1017c = (InterfaceC1017c) arrayList2.remove(size);
            if (interfaceC1017c.mo3994d()) {
                interfaceC1017c.mo3990a(c1024e);
            }
            arrayList.remove(interfaceC1017c);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m4002b() {
        ArrayList arrayList = this.f2981a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((InterfaceC1017c) arrayList.get(size)).mo3995e();
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m4003b(InterfaceC1017c interfaceC1017c) {
        if (this.f2981a.remove(interfaceC1017c)) {
            this.f2982b.add(interfaceC1017c);
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m4004c() {
        ArrayList arrayList = this.f2981a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((InterfaceC1017c) arrayList.get(size)).mo3995e();
        }
        arrayList.clear();
    }
}
