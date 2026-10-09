package com.google.tagmanager.p020a;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.tagmanager.a.ay */
/* JADX INFO: loaded from: classes.dex */
final class C0792ay extends C0791ax {
    C0792ay(int i) {
        super(i, null);
    }

    @Override // com.google.tagmanager.p020a.C0791ax
    /* JADX INFO: renamed from: a */
    public void mo3353a() {
        if (!m3355b()) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= m3356c()) {
                    break;
                }
                Map.Entry entryB = m3354b(i2);
                if (((InterfaceC0829s) entryB.getKey()).mo3490c()) {
                    entryB.setValue(Collections.unmodifiableList((List) entryB.getValue()));
                }
                i = i2 + 1;
            }
            for (Map.Entry entry : m3357d()) {
                if (((InterfaceC0829s) entry.getKey()).mo3490c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo3353a();
    }

    @Override // com.google.tagmanager.p020a.C0791ax, java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((InterfaceC0829s) obj, obj2);
    }
}
