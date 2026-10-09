package org.andengine.p021a;

import java.util.ArrayList;

/* JADX INFO: renamed from: org.andengine.a.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0863b implements InterfaceC0872d {

    /* JADX INFO: renamed from: a */
    protected final ArrayList f2531a = new ArrayList();

    /* JADX INFO: renamed from: b */
    protected float f2532b = 1.0f;

    @Override // org.andengine.p021a.InterfaceC0872d
    /* JADX INFO: renamed from: a */
    public float mo3562a() {
        return this.f2532b;
    }

    /* JADX INFO: renamed from: a */
    public void mo3563a(InterfaceC0866c interfaceC0866c) {
        this.f2531a.add(interfaceC0866c);
    }

    /* JADX INFO: renamed from: b */
    public void mo3564b() {
        ArrayList arrayList = this.f2531a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC0866c interfaceC0866c = (InterfaceC0866c) arrayList.get(size);
            interfaceC0866c.mo3559e();
            interfaceC0866c.mo3560f();
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean mo3565b(InterfaceC0866c interfaceC0866c) {
        return this.f2531a.remove(interfaceC0866c);
    }
}
