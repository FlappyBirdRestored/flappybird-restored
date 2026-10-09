package org.andengine.p075ui.activity;

import org.andengine.p033c.p035b.C0905e;
import org.andengine.p075ui.InterfaceC1039b;
import org.andengine.p075ui.InterfaceC1040c;
import org.andengine.p075ui.InterfaceC1041d;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleBaseGameActivity extends BaseGameActivity {
    @Override // org.andengine.p075ui.InterfaceC1034a
    /* JADX INFO: renamed from: a */
    public final void mo4076a(C0905e c0905e, InterfaceC1041d interfaceC1041d) {
        interfaceC1041d.mo4098a();
    }

    @Override // org.andengine.p075ui.InterfaceC1034a
    /* JADX INFO: renamed from: a */
    public final void mo4077a(InterfaceC1039b interfaceC1039b) {
        mo813l();
        interfaceC1039b.mo4100a();
    }

    @Override // org.andengine.p075ui.InterfaceC1034a
    /* JADX INFO: renamed from: a */
    public final void mo4078a(InterfaceC1040c interfaceC1040c) {
        interfaceC1040c.mo4099a(mo814m());
    }

    /* JADX INFO: renamed from: l */
    protected abstract void mo813l();

    /* JADX INFO: renamed from: m */
    protected abstract C0905e mo814m();
}
