package org.andengine.p075ui.activity;

import org.andengine.p033c.p035b.C0905e;
import org.andengine.p040d.p052e.C0941a;
import org.andengine.p075ui.InterfaceC1040c;
import org.andengine.p075ui.InterfaceC1041d;

/* JADX INFO: renamed from: org.andengine.ui.activity.b */
/* JADX INFO: loaded from: classes.dex */
class C1036b implements InterfaceC1040c {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BaseGameActivity f3052a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ InterfaceC1041d f3053b;

    C1036b(BaseGameActivity baseGameActivity, InterfaceC1041d interfaceC1041d) {
        this.f3052a = baseGameActivity;
        this.f3053b = interfaceC1041d;
    }

    @Override // org.andengine.p075ui.InterfaceC1040c
    /* JADX INFO: renamed from: a */
    public void mo4099a(C0905e c0905e) {
        this.f3052a.f3049k.m3584a(c0905e);
        try {
            C0941a.m3825b(String.valueOf(this.f3052a.getClass().getSimpleName()) + ".onPopulateScene @(Thread: '" + Thread.currentThread().getName() + "')");
            this.f3052a.mo4076a(c0905e, this.f3053b);
        } catch (Throwable th) {
            C0941a.m3827b(String.valueOf(this.f3052a.getClass().getSimpleName()) + ".onPopulateScene failed. @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
    }
}
