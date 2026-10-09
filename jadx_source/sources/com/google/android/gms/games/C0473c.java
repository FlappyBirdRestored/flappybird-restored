package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.InterfaceC0446b;
import com.google.android.gms.common.InterfaceC0447c;
import com.google.android.gms.common.InterfaceC0448d;
import com.google.android.gms.games.p014a.InterfaceC0469a;
import com.google.android.gms.internal.C0606r;

/* JADX INFO: renamed from: com.google.android.gms.games.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0473c implements InterfaceC0446b {

    /* JADX INFO: renamed from: a */
    private final C0606r f1706a;

    private C0473c(Context context, String str, String str2, InterfaceC0447c interfaceC0447c, InterfaceC0448d interfaceC0448d, String[] strArr, int i, View view) {
        this.f1706a = new C0606r(context, str, str2, interfaceC0447c, interfaceC0448d, strArr, i, view, false);
    }

    /* JADX INFO: renamed from: a */
    public Intent m2006a(String str) {
        return this.f1706a.m2762a(str);
    }

    /* JADX INFO: renamed from: a */
    public void m2007a() {
        this.f1706a.mo2635a();
    }

    /* JADX INFO: renamed from: a */
    public void m2008a(String str, long j) {
        this.f1706a.m2766a((InterfaceC0469a) null, str, j);
    }

    /* JADX INFO: renamed from: b */
    public boolean m2009b() {
        return this.f1706a.m2642h();
    }

    /* JADX INFO: renamed from: c */
    public void m2010c() {
        this.f1706a.mo2638b();
    }
}
