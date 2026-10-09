package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p002a.C0066k;
import android.view.View;

/* JADX INFO: renamed from: android.support.v4.view.e */
/* JADX INFO: loaded from: classes.dex */
class C0144e extends C0108b {
    C0144e() {
    }

    @Override // android.support.v4.view.C0146g, android.support.v4.view.InterfaceC0143d
    /* JADX INFO: renamed from: a */
    public C0066k mo574a(Object obj, View view) {
        Object objM595a = C0150k.m595a(obj, view);
        if (objM595a != null) {
            return new C0066k(objM595a);
        }
        return null;
    }

    @Override // android.support.v4.view.C0108b, android.support.v4.view.C0146g, android.support.v4.view.InterfaceC0143d
    /* JADX INFO: renamed from: a */
    public Object mo532a(C0051a c0051a) {
        return C0150k.m594a(new C0145f(this, c0051a));
    }

    @Override // android.support.v4.view.C0146g, android.support.v4.view.InterfaceC0143d
    /* JADX INFO: renamed from: a */
    public boolean mo575a(Object obj, View view, int i, Bundle bundle) {
        return C0150k.m596a(obj, view, i, bundle);
    }
}
