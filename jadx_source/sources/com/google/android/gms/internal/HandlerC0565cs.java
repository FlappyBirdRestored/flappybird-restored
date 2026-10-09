package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C0445a;
import com.google.android.gms.common.InterfaceC0447c;

/* JADX INFO: renamed from: com.google.android.gms.internal.cs */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC0565cs extends Handler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC0564cr f2032a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0565cs(AbstractC0564cr abstractC0564cr, Looper looper) {
        super(looper);
        this.f2032a = abstractC0564cr;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 1 && !this.f2032a.m2643i()) {
            AbstractC0566ct abstractC0566ct = (AbstractC0566ct) message.obj;
            abstractC0566ct.mo2649a();
            abstractC0566ct.m2652c();
            return;
        }
        synchronized (this.f2032a.f2031o) {
            this.f2032a.f2021d = false;
        }
        if (message.what == 3) {
            this.f2032a.mo2636a(new C0445a(((Integer) message.obj).intValue(), null));
            return;
        }
        if (message.what == 4) {
            synchronized (this.f2032a.f2024h) {
                if (this.f2032a.f2020c && this.f2032a.m2642h() && this.f2032a.f2024h.contains(message.obj)) {
                    ((InterfaceC0447c) message.obj).mo1841a(this.f2032a.mo2640e());
                }
            }
            return;
        }
        if (message.what == 2 && !this.f2032a.m2642h()) {
            AbstractC0566ct abstractC0566ct2 = (AbstractC0566ct) message.obj;
            abstractC0566ct2.mo2649a();
            abstractC0566ct2.m2652c();
        } else if (message.what == 2 || message.what == 1) {
            ((AbstractC0566ct) message.obj).m2651b();
        } else {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
        }
    }
}
