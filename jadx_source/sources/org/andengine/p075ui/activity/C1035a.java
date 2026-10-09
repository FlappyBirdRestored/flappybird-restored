package org.andengine.p075ui.activity;

import org.andengine.p040d.p052e.C0941a;
import org.andengine.p075ui.InterfaceC1041d;

/* JADX INFO: renamed from: org.andengine.ui.activity.a */
/* JADX INFO: loaded from: classes.dex */
class C1035a implements InterfaceC1041d {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BaseGameActivity f3051a;

    C1035a(BaseGameActivity baseGameActivity) {
        this.f3051a = baseGameActivity;
    }

    @Override // org.andengine.p075ui.InterfaceC1041d
    /* JADX INFO: renamed from: a */
    public void mo4098a() {
        try {
            C0941a.m3825b(String.valueOf(this.f3051a.getClass().getSimpleName()) + ".onGameCreated @(Thread: '" + Thread.currentThread().getName() + "')");
            this.f3051a.m4089r();
        } catch (Throwable th) {
            C0941a.m3827b(String.valueOf(this.f3051a.getClass().getSimpleName()) + ".onGameCreated failed. @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
        this.f3051a.m4083c();
    }
}
