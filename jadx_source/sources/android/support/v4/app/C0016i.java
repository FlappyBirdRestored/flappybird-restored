package android.support.v4.app;

import android.view.View;

/* JADX INFO: renamed from: android.support.v4.app.i */
/* JADX INFO: loaded from: classes.dex */
class C0016i implements InterfaceC0019l {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FragmentActivity f134a;

    C0016i(FragmentActivity fragmentActivity) {
        this.f134a = fragmentActivity;
    }

    @Override // android.support.v4.app.InterfaceC0019l
    /* JADX INFO: renamed from: a */
    public View mo98a(int i) {
        return this.f134a.findViewById(i);
    }
}
