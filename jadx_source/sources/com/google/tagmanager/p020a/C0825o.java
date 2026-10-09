package com.google.tagmanager.p020a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.tagmanager.a.o */
/* JADX INFO: loaded from: classes.dex */
public class C0825o {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f2447a = false;

    /* JADX INFO: renamed from: c */
    private static final C0825o f2448c = new C0825o(true);

    /* JADX INFO: renamed from: b */
    private final Map f2449b;

    C0825o() {
        this.f2449b = new HashMap();
    }

    private C0825o(boolean z) {
        this.f2449b = Collections.emptyMap();
    }

    /* JADX INFO: renamed from: a */
    public static C0825o m3470a() {
        return f2448c;
    }

    /* JADX INFO: renamed from: a */
    public C0768aa m3471a(InterfaceC0780am interfaceC0780am, int i) {
        return (C0768aa) this.f2449b.get(new C0826p(interfaceC0780am, i));
    }
}
