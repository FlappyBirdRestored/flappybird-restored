package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.C0445a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cw */
/* JADX INFO: loaded from: classes.dex */
public final class C0569cw extends AbstractC0566ct {

    /* JADX INFO: renamed from: a */
    public final int f2038a;

    /* JADX INFO: renamed from: c */
    public final Bundle f2039c;

    /* JADX INFO: renamed from: d */
    public final IBinder f2040d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ AbstractC0564cr f2041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0569cw(AbstractC0564cr abstractC0564cr, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC0564cr, true);
        this.f2041e = abstractC0564cr;
        this.f2038a = i;
        this.f2040d = iBinder;
        this.f2039c = bundle;
    }

    @Override // com.google.android.gms.internal.AbstractC0566ct
    /* JADX INFO: renamed from: a */
    protected void mo2649a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC0566ct
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo2650a(Boolean bool) {
        if (bool == null) {
            return;
        }
        switch (this.f2038a) {
            case C0467e.MapAttrs_mapType /* 0 */:
                try {
                    if (this.f2041e.mo2359d().equals(this.f2040d.getInterfaceDescriptor())) {
                        this.f2041e.f2023g = this.f2041e.mo2357b(this.f2040d);
                        if (this.f2041e.f2023g != null) {
                            this.f2041e.mo2641f();
                            return;
                        }
                    }
                } catch (RemoteException e) {
                }
                C0570cx.m2656a(this.f2041e.f2022f).m2659b(this.f2041e.mo2358c(), this.f2041e.f2029m);
                this.f2041e.f2029m = null;
                this.f2041e.f2023g = null;
                this.f2041e.mo2636a(new C0445a(8, null));
                return;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                PendingIntent pendingIntent = this.f2039c != null ? (PendingIntent) this.f2039c.getParcelable("pendingIntent") : null;
                if (this.f2041e.f2029m != null) {
                    C0570cx.m2656a(this.f2041e.f2022f).m2659b(this.f2041e.mo2358c(), this.f2041e.f2029m);
                    this.f2041e.f2029m = null;
                }
                this.f2041e.f2023g = null;
                this.f2041e.mo2636a(new C0445a(this.f2038a, pendingIntent));
                return;
        }
    }
}
