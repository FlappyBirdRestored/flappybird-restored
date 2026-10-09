package com.google.android.gms.games;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.InterfaceC0447c;
import com.google.android.gms.common.InterfaceC0448d;

/* JADX INFO: renamed from: com.google.android.gms.games.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0476f {

    /* JADX INFO: renamed from: a */
    private final Context f1707a;

    /* JADX INFO: renamed from: b */
    private String f1708b;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0447c f1710d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0448d f1711e;

    /* JADX INFO: renamed from: h */
    private View f1714h;

    /* JADX INFO: renamed from: c */
    private String f1709c = "<<default account>>";

    /* JADX INFO: renamed from: f */
    private String[] f1712f = {"https://www.googleapis.com/auth/games"};

    /* JADX INFO: renamed from: g */
    private int f1713g = 49;

    public C0476f(Context context, InterfaceC0447c interfaceC0447c, InterfaceC0448d interfaceC0448d) {
        this.f1707a = context;
        this.f1708b = context.getPackageName();
        this.f1710d = interfaceC0447c;
        this.f1711e = interfaceC0448d;
    }

    /* JADX INFO: renamed from: a */
    public C0473c m2012a() {
        return new C0473c(this.f1707a, this.f1708b, this.f1709c, this.f1710d, this.f1711e, this.f1712f, this.f1713g, this.f1714h);
    }

    /* JADX INFO: renamed from: a */
    public C0476f m2013a(int i) {
        this.f1713g = i;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0476f m2014a(String... strArr) {
        this.f1712f = strArr;
        return this;
    }
}
