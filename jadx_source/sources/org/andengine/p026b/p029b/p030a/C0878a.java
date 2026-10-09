package org.andengine.p026b.p029b.p030a;

import java.util.ArrayList;
import org.andengine.p026b.p029b.InterfaceC0880c;

/* JADX INFO: renamed from: org.andengine.b.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0878a implements InterfaceC0880c {

    /* JADX INFO: renamed from: a */
    private final ArrayList f2588a = new ArrayList();

    @Override // org.andengine.p026b.p029b.InterfaceC0880c
    /* JADX INFO: renamed from: a_ */
    public synchronized void mo3622a_(float f) {
        ArrayList arrayList = this.f2588a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Runnable) arrayList.remove(size)).run();
        }
    }
}
