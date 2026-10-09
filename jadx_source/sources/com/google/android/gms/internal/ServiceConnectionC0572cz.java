package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.cz */
/* JADX INFO: loaded from: classes.dex */
public class ServiceConnectionC0572cz implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0571cy f2055a;

    public ServiceConnectionC0572cz(C0571cy c0571cy) {
        this.f2055a = c0571cy;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f2055a.f2047a.f2045d) {
            this.f2055a.f2053g = iBinder;
            this.f2055a.f2054h = componentName;
            Iterator it = this.f2055a.f2050d.iterator();
            while (it.hasNext()) {
                ((ServiceConnectionC0568cv) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f2055a.f2051e = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f2055a.f2047a.f2045d) {
            this.f2055a.f2053g = null;
            this.f2055a.f2054h = componentName;
            Iterator it = this.f2055a.f2050d.iterator();
            while (it.hasNext()) {
                ((ServiceConnectionC0568cv) it.next()).onServiceDisconnected(componentName);
            }
            this.f2055a.f2051e = 2;
        }
    }
}
