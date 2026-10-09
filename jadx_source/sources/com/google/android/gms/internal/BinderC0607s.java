package com.google.android.gms.internal;

import com.google.android.gms.common.data.C0452d;
import com.google.android.gms.games.p014a.C0470b;
import com.google.android.gms.games.p014a.InterfaceC0469a;

/* JADX INFO: renamed from: com.google.android.gms.internal.s */
/* JADX INFO: loaded from: classes.dex */
final class BinderC0607s extends AbstractBinderC0605q {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0606r f2087a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0469a f2088b;

    public BinderC0607s(C0606r c0606r, InterfaceC0469a interfaceC0469a) {
        this.f2087a = c0606r;
        this.f2088b = (InterfaceC0469a) C0588do.m2705a(interfaceC0469a, "Listener must not be null");
    }

    @Override // com.google.android.gms.internal.AbstractBinderC0605q, com.google.android.gms.internal.InterfaceC0613y
    /* JADX INFO: renamed from: c */
    public void mo2112c(C0452d c0452d) {
        this.f2087a.m2637a(new C0608t(this.f2087a, this.f2088b, new C0470b(c0452d)));
    }
}
