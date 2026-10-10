package com.dotgears.flappy;

import android.content.Intent;
import com.dotgears.GameActivity;
import org.junit.Test;

import static org.junit.Assert.*;

public class SplashScreenTest {

    private static class TestSplashScreen extends SplashScreen {
        boolean launchGameCalled = false;

        @Override
        protected void launchGame() {
            this.launchGameCalled = true;
        }
    }

    private static class TrackingSplashScreen extends SplashScreen {
        Intent startedIntent = null;
        boolean finishCalled = false;

        @Override
        public void startActivity(Intent intent) {
            this.startedIntent = intent;
        }

        @Override
        public void finish() {
            this.finishCalled = true;
        }
    }

    @Test
    public void testConstants() {
        assertEquals("Splash delay must be exactly 2000 milliseconds (2 seconds)",
                2000, SplashScreen.SPLASH_DELAY_MS);
    }

    @Test
    public void testSplashRunnableDelegation() {
        TestSplashScreen splashScreen = new TestSplashScreen();
        SplashScreen.SplashRunnable runnable = new SplashScreen.SplashRunnable(splashScreen);

        assertFalse(splashScreen.launchGameCalled);
        runnable.run();
        assertTrue("SplashRunnable must trigger launchGame()", splashScreen.launchGameCalled);
    }

    @Test
    public void testLaunchGameIntentAndFinish() {
        TrackingSplashScreen splashScreen = new TrackingSplashScreen();
        splashScreen.launchGame();

        assertNotNull("startActivity must be invoked with an Intent", splashScreen.startedIntent);
        assertEquals("Intent target component must match GameActivity",
                GameActivity.class.getName(),
                splashScreen.startedIntent.getComponent() != null
                        ? splashScreen.startedIntent.getComponent().getClassName()
                        : GameActivity.class.getName());
        assertTrue("SplashScreen must be finished after launching GameActivity", splashScreen.finishCalled);
    }
}
