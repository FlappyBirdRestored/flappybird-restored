package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.InterfaceC0447c;
import com.google.android.gms.common.InterfaceC0448d;

/* JADX INFO: renamed from: com.google.android.gms.internal.bj */
/* JADX INFO: loaded from: classes.dex */
public final class C0529bj extends AbstractC0564cr {

    /* JADX INFO: renamed from: f */
    private final String f1816f;

    public C0529bj(Context context, InterfaceC0447c interfaceC0447c, InterfaceC0448d interfaceC0448d, String str, String[] strArr) {
        super(context, interfaceC0447c, interfaceC0448d, strArr);
        this.f1816f = (String) C0588do.m2704a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC0551ce mo2357b(IBinder iBinder) {
        return AbstractBinderC0552cf.m2598a(iBinder);
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: a */
    protected void mo2356a(InterfaceC0579df interfaceC0579df, BinderC0567cu binderC0567cu) {
        interfaceC0579df.mo2687a(binderC0567cu, 3265100, m2644j().getPackageName(), this.f1816f, m2645k());
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: a */
    protected void mo2383a(String... strArr) {
        boolean z = false;
        for (String str : strArr) {
            if (str.equals("https://www.googleapis.com/auth/appstate")) {
                z = true;
            }
        }
        C0588do.m2707a(z, String.format("AppStateClient requires %s to function.", "https://www.googleapis.com/auth/appstate"));
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: c */
    protected String mo2358c() {
        return "com.google.android.gms.appstate.service.START";
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: d */
    protected String mo2359d() {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }
}
