package com.google.tagmanager.p020a;

/* JADX INFO: renamed from: com.google.tagmanager.a.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0813c implements InterfaceC0783ap {

    /* JADX INFO: renamed from: b */
    private boolean f2413b = true;

    /* JADX INFO: renamed from: a */
    protected int f2412a = -1;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC0783ap clone() {
        throw new UnsupportedOperationException("clone() should be implemented by subclasses.");
    }

    /* JADX INFO: renamed from: b */
    C0800bf m3391b() {
        return new C0800bf(this);
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: n */
    public InterfaceC0781an mo1441n() {
        throw new UnsupportedOperationException("toBuilder() is not supported in mutable messages.");
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: o */
    public InterfaceC0781an mo1442o() {
        throw new UnsupportedOperationException("newBuilderForType() is not supported in mutable messages.");
    }
}
