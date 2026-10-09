package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.InterfaceC0447c;
import com.google.android.gms.common.InterfaceC0448d;
import com.google.android.gms.plus.C0737a;
import com.google.android.gms.plus.p017a.p019b.InterfaceC0740a;

/* JADX INFO: renamed from: com.google.android.gms.internal.bd */
/* JADX INFO: loaded from: classes.dex */
public class C0523bd extends AbstractC0564cr {

    /* JADX INFO: renamed from: f */
    private InterfaceC0740a f1804f;

    /* JADX INFO: renamed from: g */
    private C0737a f1805g;

    public C0523bd(Context context, C0737a c0737a, InterfaceC0447c interfaceC0447c, InterfaceC0448d interfaceC0448d) {
        super(context, interfaceC0447c, interfaceC0448d, c0737a.m3220c());
        this.f1805g = c0737a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC0520ba mo2357b(IBinder iBinder) {
        return AbstractBinderC0521bb.m2353a(iBinder);
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: a */
    protected void mo2355a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            this.f1804f = C0549cc.m2502a(bundle.getByteArray("loaded_person"));
        }
        super.mo2355a(i, iBinder, bundle);
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: a */
    protected void mo2356a(InterfaceC0579df interfaceC0579df, BinderC0567cu binderC0567cu) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("skip_oob", false);
        bundle.putStringArray("request_visible_actions", this.f1805g.m3221d());
        if (this.f1805g.m3222e() != null) {
            bundle.putStringArray("required_features", this.f1805g.m3222e());
        }
        if (this.f1805g.m3225h() != null) {
            bundle.putString("application_name", this.f1805g.m3225h());
        }
        interfaceC0579df.mo2688a(binderC0567cu, 3265100, this.f1805g.m3224g(), this.f1805g.m3223f(), m2645k(), this.f1805g.m3219b(), bundle);
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: c */
    protected String mo2358c() {
        return "com.google.android.gms.plus.service.START";
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: d */
    protected String mo2359d() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }
}
