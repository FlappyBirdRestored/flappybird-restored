package com.dotgears.flappy;

import android.content.Intent;
import com.dotgears.GameActivity;

/* JADX INFO: renamed from: com.dotgears.flappy.d */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0207d implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ SplashScreen f572a;

    RunnableC0207d(SplashScreen splashScreen) {
        this.f572a = splashScreen;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f572a.startActivity(new Intent(this.f572a, (Class<?>) GameActivity.class));
        this.f572a.finish();
    }
}
