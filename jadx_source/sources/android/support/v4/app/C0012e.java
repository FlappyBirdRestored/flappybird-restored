package android.support.v4.app;

import android.view.View;

/* JADX INFO: renamed from: android.support.v4.app.e */
/* JADX INFO: loaded from: classes.dex */
class C0012e implements InterfaceC0019l {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Fragment f132a;

    C0012e(Fragment fragment) {
        this.f132a = fragment;
    }

    @Override // android.support.v4.app.InterfaceC0019l
    /* JADX INFO: renamed from: a */
    public View mo98a(int i) {
        if (this.f132a.f20I == null) {
            throw new IllegalStateException("Fragment does not have a view");
        }
        return this.f132a.f20I.findViewById(i);
    }
}
