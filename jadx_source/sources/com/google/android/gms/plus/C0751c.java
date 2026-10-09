package com.google.android.gms.plus;

import android.content.Context;
import com.google.android.gms.common.InterfaceC0447c;
import com.google.android.gms.common.InterfaceC0448d;
import com.google.android.gms.internal.C0523bd;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.plus.c */
/* JADX INFO: loaded from: classes.dex */
public class C0751c {

    /* JADX INFO: renamed from: a */
    private Context f2271a;

    /* JADX INFO: renamed from: b */
    private String f2272b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0447c f2273c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0448d f2274d;

    /* JADX INFO: renamed from: e */
    private ArrayList f2275e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private String[] f2276f;

    /* JADX INFO: renamed from: g */
    private String[] f2277g;

    /* JADX INFO: renamed from: h */
    private String f2278h;

    /* JADX INFO: renamed from: i */
    private String f2279i;

    /* JADX INFO: renamed from: j */
    private String f2280j;

    public C0751c(Context context, InterfaceC0447c interfaceC0447c, InterfaceC0448d interfaceC0448d) {
        this.f2271a = context;
        this.f2273c = interfaceC0447c;
        this.f2274d = interfaceC0448d;
        this.f2279i = this.f2271a.getPackageName();
        this.f2278h = this.f2271a.getPackageName();
        this.f2275e.add("https://www.googleapis.com/auth/plus.login");
    }

    /* JADX INFO: renamed from: a */
    public C0750b m3229a() {
        if (this.f2272b == null) {
            this.f2272b = "<<default account>>";
        }
        return new C0750b(new C0523bd(this.f2271a, new C0737a(this.f2272b, (String[]) this.f2275e.toArray(new String[this.f2275e.size()]), this.f2276f, this.f2277g, this.f2278h, this.f2279i, this.f2280j), this.f2273c, this.f2274d));
    }

    /* JADX INFO: renamed from: a */
    public C0751c m3230a(String... strArr) {
        this.f2275e.clear();
        this.f2275e.addAll(Arrays.asList(strArr));
        return this;
    }
}
