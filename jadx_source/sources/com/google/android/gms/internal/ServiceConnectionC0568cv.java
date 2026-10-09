package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: com.google.android.gms.internal.cv */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC0568cv implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC0564cr f2037a;

    ServiceConnectionC0568cv(AbstractC0564cr abstractC0564cr) {
        this.f2037a = abstractC0564cr;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2037a.m2639c(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f2037a.f2023g = null;
        this.f2037a.m2646l();
    }
}
