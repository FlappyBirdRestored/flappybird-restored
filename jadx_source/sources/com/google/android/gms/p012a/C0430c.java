package com.google.android.gms.p012a;

import android.content.Context;
import com.google.android.gms.common.InterfaceC0447c;
import com.google.android.gms.common.InterfaceC0448d;

/* JADX INFO: renamed from: com.google.android.gms.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0430c {

    /* JADX INFO: renamed from: a */
    private static final String[] f1586a = {"https://www.googleapis.com/auth/appstate"};

    /* JADX INFO: renamed from: b */
    private Context f1587b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0447c f1588c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0448d f1589d;

    /* JADX INFO: renamed from: e */
    private String[] f1590e = f1586a;

    /* JADX INFO: renamed from: f */
    private String f1591f = "<<default account>>";

    public C0430c(Context context, InterfaceC0447c interfaceC0447c, InterfaceC0448d interfaceC0448d) {
        this.f1587b = context;
        this.f1588c = interfaceC0447c;
        this.f1589d = interfaceC0448d;
    }

    /* JADX INFO: renamed from: a */
    public C0428a m1816a() {
        return new C0428a(this.f1587b, this.f1588c, this.f1589d, this.f1591f, this.f1590e);
    }

    /* JADX INFO: renamed from: a */
    public C0430c m1817a(String... strArr) {
        this.f1590e = strArr;
        return this;
    }
}
