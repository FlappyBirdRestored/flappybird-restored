package org.andengine.p040d.p055h;

import org.andengine.p026b.p029b.InterfaceC0880c;
import org.andengine.p040d.p041a.p042a.C0918b;

/* JADX INFO: renamed from: org.andengine.d.h.c */
/* JADX INFO: loaded from: classes.dex */
public class C0948c extends C0918b implements InterfaceC0880c {

    /* JADX INFO: renamed from: a */
    private final Object f2782a;

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(InterfaceC0946a interfaceC0946a) {
        if (interfaceC0946a == null) {
            throw new IllegalArgumentException("Supplied " + InterfaceC0946a.class.getSimpleName() + " must not be null.");
        }
        return super.add(interfaceC0946a);
    }

    @Override // org.andengine.p026b.p029b.InterfaceC0880c
    /* JADX INFO: renamed from: a_ */
    public void mo3622a_(float f) {
        int size = size();
        if (size > 0) {
            for (int i = size - 1; i >= 0; i--) {
                InterfaceC0946a interfaceC0946a = (InterfaceC0946a) get(i);
                interfaceC0946a.m3837a(f, this.f2782a);
                if (interfaceC0946a.m3838a() && interfaceC0946a.m3839b()) {
                    remove(i);
                }
            }
        }
    }
}
