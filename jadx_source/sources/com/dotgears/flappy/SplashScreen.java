package com.dotgears.flappy;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.dotgears.flappybird.R;

/* JADX INFO: loaded from: classes.dex */
public class SplashScreen extends Activity {

    /* JADX INFO: renamed from: a */
    private static int f523a = 2000;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new RunnableC0207d(this), f523a);
    }
}
