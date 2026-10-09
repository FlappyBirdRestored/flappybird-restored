package android.support.v4.view.p002a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.view.a.n */
/* JADX INFO: loaded from: classes.dex */
class C0069n implements InterfaceC0075t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0066k f340a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0068m f341b;

    C0069n(C0068m c0068m, C0066k c0066k) {
        this.f341b = c0068m;
        this.f340a = c0066k;
    }

    @Override // android.support.v4.view.p002a.InterfaceC0075t
    /* JADX INFO: renamed from: a */
    public Object mo447a(int i) {
        C0052a c0052aM441a = this.f340a.m441a(i);
        if (c0052aM441a == null) {
            return null;
        }
        return c0052aM441a.m305a();
    }

    @Override // android.support.v4.view.p002a.InterfaceC0075t
    /* JADX INFO: renamed from: a */
    public List mo448a(String str, int i) {
        List listM443a = this.f340a.m443a(str, i);
        ArrayList arrayList = new ArrayList();
        int size = listM443a.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((C0052a) listM443a.get(i2)).m305a());
        }
        return arrayList;
    }

    @Override // android.support.v4.view.p002a.InterfaceC0075t
    /* JADX INFO: renamed from: a */
    public boolean mo449a(int i, int i2, Bundle bundle) {
        return this.f340a.m444a(i, i2, bundle);
    }
}
