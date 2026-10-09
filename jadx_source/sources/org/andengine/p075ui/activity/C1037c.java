package org.andengine.p075ui.activity;

import org.andengine.p040d.p052e.C0941a;
import org.andengine.p075ui.InterfaceC1039b;
import org.andengine.p075ui.InterfaceC1040c;

/* JADX INFO: renamed from: org.andengine.ui.activity.c */
/* JADX INFO: loaded from: classes.dex */
class C1037c implements InterfaceC1039b {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BaseGameActivity f3054a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ InterfaceC1040c f3055b;

    C1037c(BaseGameActivity baseGameActivity, InterfaceC1040c interfaceC1040c) {
        this.f3054a = baseGameActivity;
        this.f3055b = interfaceC1040c;
    }

    @Override // org.andengine.p075ui.InterfaceC1039b
    /* JADX INFO: renamed from: a */
    public void mo4100a() {
        try {
            C0941a.m3825b(String.valueOf(this.f3054a.getClass().getSimpleName()) + ".onCreateScene @(Thread: '" + Thread.currentThread().getName() + "')");
            this.f3054a.mo4078a(this.f3055b);
        } catch (Throwable th) {
            C0941a.m3827b(String.valueOf(this.f3054a.getClass().getSimpleName()) + ".onCreateScene failed. @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
    }
}
