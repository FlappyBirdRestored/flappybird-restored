package com.google.android.gms.internal;

import com.google.android.gms.games.p014a.C0470b;
import com.google.android.gms.games.p014a.InterfaceC0469a;

/* JADX INFO: renamed from: com.google.android.gms.internal.t */
/* JADX INFO: loaded from: classes.dex */
final class C0608t extends AbstractC0566ct {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0606r f2089a;

    /* JADX INFO: renamed from: c */
    private final C0470b f2090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0608t(C0606r c0606r, InterfaceC0469a interfaceC0469a, C0470b c0470b) {
        super(c0606r, interfaceC0469a);
        this.f2089a = c0606r;
        this.f2090c = c0470b;
    }

    @Override // com.google.android.gms.internal.AbstractC0566ct
    /* JADX INFO: renamed from: a */
    protected void mo2649a() {
    }

    @Override // com.google.android.gms.internal.AbstractC0566ct
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo2650a(InterfaceC0469a interfaceC0469a) {
        interfaceC0469a.m2002a(this.f2090c.m2004a(), this.f2090c);
    }
}
