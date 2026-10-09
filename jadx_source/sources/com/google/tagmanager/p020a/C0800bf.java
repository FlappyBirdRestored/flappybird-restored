package com.google.tagmanager.p020a;

import java.util.List;

/* JADX INFO: renamed from: com.google.tagmanager.a.bf */
/* JADX INFO: loaded from: classes.dex */
public class C0800bf extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final List f2369a;

    public C0800bf(InterfaceC0780am interfaceC0780am) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f2369a = null;
    }

    /* JADX INFO: renamed from: a */
    public C0773af m3367a() {
        return new C0773af(getMessage());
    }
}
