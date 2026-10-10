package com.dotgears.flappy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.dotgears.GameActivity;
import com.dotgears.flappybird.R;

/**
 * 2-second splash screen displaying the .GEARS logo before launching {@link GameActivity}.
 * <p>
 * Recreation of {@code com.dotgears.flappy.SplashScreen} and {@code com.dotgears.flappy.d} (RunnableC0207d).
 */
public class SplashScreen extends Activity {

    /** Splash screen display duration in milliseconds (2000ms / 2 seconds). */
    public static final int SPLASH_DELAY_MS = 2000;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);

        new Handler(Looper.getMainLooper()).postDelayed(new SplashRunnable(this), SPLASH_DELAY_MS);
    }

    /**
     * Launches {@link GameActivity} and finishes this splash activity.
     */
    protected void launchGame() {
        startActivity(new Intent(this, GameActivity.class));
        finish();
    }

    /**
     * Delayed runnable transitioning from the splash screen to the main game.
     * Decompiled symbol: {@code RunnableC0207d} (smali: {@code com.dotgears.flappy.d}).
     */
    public static class SplashRunnable implements Runnable {
        final SplashScreen splashScreen;

        public SplashRunnable(SplashScreen splashScreen) {
            this.splashScreen = splashScreen;
        }

        @Override
        public void run() {
            splashScreen.launchGame();
        }
    }
}
