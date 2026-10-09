package android.support.v4.view.p002a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.view.a.p */
/* JADX INFO: loaded from: classes.dex */
class C0071p implements InterfaceC0078w {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0066k f342a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0070o f343b;

    C0071p(C0070o c0070o, C0066k c0066k) {
        this.f343b = c0070o;
        this.f342a = c0066k;
    }

    @Override // android.support.v4.view.p002a.InterfaceC0078w
    /* JADX INFO: renamed from: a */
    public Object mo450a(int i) {
        C0052a c0052aM441a = this.f342a.m441a(i);
        if (c0052aM441a == null) {
            return null;
        }
        return c0052aM441a.m305a();
    }

    @Override // android.support.v4.view.p002a.InterfaceC0078w
    /* JADX INFO: renamed from: a */
    public List mo451a(String str, int i) {
        List listM443a = this.f342a.m443a(str, i);
        ArrayList arrayList = new ArrayList();
        int size = listM443a.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((C0052a) listM443a.get(i2)).m305a());
        }
        return arrayList;
    }

    @Override // android.support.v4.view.p002a.InterfaceC0078w
    /* JADX INFO: renamed from: a */
    public boolean mo452a(int i, int i2, Bundle bundle) {
        return this.f342a.m444a(i, i2, bundle);
    }

    @Override // android.support.v4.view.p002a.InterfaceC0078w
    /* JADX INFO: renamed from: b */
    public Object mo453b(int i) {
        C0052a c0052aM445b = this.f342a.m445b(i);
        if (c0052aM445b == null) {
            return null;
        }
        return c0052aM445b.m305a();
    }
}
