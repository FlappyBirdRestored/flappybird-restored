package com.dotgears;

import android.view.KeyEvent;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameActivityTest {

    private static class TestGameActivity extends GameActivity {
        int lastSavedScore = -1;
        boolean rateUrlCalled = false;
        boolean developerUrlCalled = false;
        boolean leaderboardsCalled = false;

        @Override
        public void saveHighScore(int score) {
            this.lastSavedScore = score;
        }

        @Override
        public void openRateUrl() {
            this.rateUrlCalled = true;
        }

        @Override
        public void openDeveloperUrl() {
            this.developerUrlCalled = true;
        }

        @Override
        public void openLeaderboards() {
            this.leaderboardsCalled = true;
        }
    }

    private TestGameActivity activity;
    private AudioManager mockAudio;

    @Before
    public void setUp() {
        activity = new TestGameActivity();
        mockAudio = new AudioManager();
        activity.audioManager = mockAudio;
        activity.savedHighScore = 10;
    }

    @Test
    public void testConstants() {
        assertEquals("FlappyBird", GameActivity.PREFS_NAME);
        assertEquals("score", GameActivity.PREF_KEY_SCORE);
    }

    @Test
    public void testActionScoreSaving() {
        // Score 15 > 10: updates savedHighScore and calls saveHighScore
        activity.handleGameAction(0, 15.0);
        assertEquals(15, activity.savedHighScore);
        assertEquals(15, activity.lastSavedScore);

        // Score 12 < 15: does not decrease high score
        activity.handleGameAction(0, 12.0);
        assertEquals(15, activity.savedHighScore);
        assertEquals(15, activity.lastSavedScore);
    }

    @Test
    public void testActionAudioForwarding() {
        // Action 9: Point
        activity.handleGameAction(9, 0.0);
        assertEquals(1, mockAudio.playCountPoint);

        // Action 10: Swooshing
        activity.handleGameAction(10, 0.0);
        assertEquals(1, mockAudio.playCountSwooshing);

        // Action 11: Die
        activity.handleGameAction(11, 0.0);
        assertEquals(1, mockAudio.playCountDie);

        // Action 12: Hit
        activity.handleGameAction(12, 0.0);
        assertEquals(1, mockAudio.playCountHit);

        // Action 13: Wing
        activity.handleGameAction(13, 0.0);
        assertEquals(1, mockAudio.playCountWing);
    }

    @Test
    public void testActionUrlsAndLeaderboards() {
        // Action 1: Leaderboards
        activity.handleGameAction(1, 0.0);
        assertTrue(activity.leaderboardsCalled);

        // Action 2: Rate URL
        activity.handleGameAction(2, 0.0);
        assertTrue(activity.rateUrlCalled);

        // Action 3: Developer URL
        activity.handleGameAction(3, 0.0);
        assertTrue(activity.developerUrlCalled);
    }

    @Test
    public void testBackKeyConsumed() {
        KeyEvent backEvent = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_BACK);
        boolean consumed = activity.onKeyDown(KeyEvent.KEYCODE_BACK, backEvent);
        assertTrue("Back key must be consumed as per original Flappy Bird behavior", consumed);
    }
}
