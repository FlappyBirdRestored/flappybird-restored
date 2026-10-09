package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.C0455e;
import com.google.android.gms.maps.model.C0721k;
import com.google.android.gms.maps.p015a.C0656bj;
import com.google.android.gms.p013b.AbstractC0434b;
import com.google.android.gms.p013b.BinderC0440h;
import com.google.android.gms.p013b.InterfaceC0441i;

/* JADX INFO: renamed from: com.google.android.gms.maps.d */
/* JADX INFO: loaded from: classes.dex */
class C0684d extends AbstractC0434b {

    /* JADX INFO: renamed from: a */
    protected InterfaceC0441i f2155a;

    /* JADX INFO: renamed from: b */
    private final ViewGroup f2156b;

    /* JADX INFO: renamed from: c */
    private final Context f2157c;

    /* JADX INFO: renamed from: d */
    private final GoogleMapOptions f2158d;

    C0684d(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f2156b = viewGroup;
        this.f2157c = context;
        this.f2158d = googleMapOptions;
    }

    /* JADX INFO: renamed from: b */
    public void m2974b() {
        if (this.f2155a == null || m1825a() != null) {
            return;
        }
        try {
            this.f2155a.mo1826a(new C0683c(this.f2156b, C0656bj.m2872a(this.f2157c).mo2841a(BinderC0440h.m1829a(this.f2157c), this.f2158d)));
        } catch (RemoteException e) {
            throw new C0721k(e);
        } catch (C0455e e2) {
        }
    }
}
