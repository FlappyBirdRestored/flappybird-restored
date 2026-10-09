package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: renamed from: com.google.android.gms.internal.cu */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0567cu extends AbstractBinderC0577dd {

    /* JADX INFO: renamed from: a */
    private AbstractC0564cr f2036a;

    public BinderC0567cu(AbstractC0564cr abstractC0564cr) {
        this.f2036a = abstractC0564cr;
    }

    @Override // com.google.android.gms.internal.InterfaceC0576dc
    /* JADX INFO: renamed from: a */
    public void mo2654a(int i, IBinder iBinder, Bundle bundle) {
        C0588do.m2705a("onPostInitComplete can be called only once per call to getServiceFromBroker", this.f2036a);
        this.f2036a.mo2355a(i, iBinder, bundle);
        this.f2036a = null;
    }
}
