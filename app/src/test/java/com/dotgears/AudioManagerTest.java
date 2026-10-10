package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AudioManagerTest {

    private AudioManager audioManager;

    @Before
    public void setUp() {
        audioManager = new AudioManager();
        AudioManager.instance = audioManager;
    }

    @Test
    public void testInitialization() {
        assertNotNull(audioManager);
        assertSame(audioManager, AudioManager.instance);
        assertFalse(audioManager.isMuted);
        assertEquals(0, audioManager.playCountPoint);
        assertEquals(0, audioManager.playCountDie);
        assertEquals(0, audioManager.playCountHit);
        assertEquals(0, audioManager.playCountSwooshing);
        assertEquals(0, audioManager.playCountWing);
    }

    @Test
    public void testDirectSoundPlaybackCounters() {
        audioManager.playPoint();
        assertEquals(1, audioManager.playCountPoint);

        audioManager.playDie();
        assertEquals(1, audioManager.playCountDie);

        audioManager.playHit();
        assertEquals(1, audioManager.playCountHit);

        audioManager.playSwooshing();
        assertEquals(1, audioManager.playCountSwooshing);

        audioManager.playWing();
        assertEquals(1, audioManager.playCountWing);
    }

    @Test
    public void testActionDispatchMapping() {
        // Action 9 = point
        audioManager.handleAction(AudioManager.ACTION_POINT);
        assertEquals(1, audioManager.playCountPoint);

        // Action 10 = swooshing (button clicks)
        audioManager.handleAction(AudioManager.ACTION_SWOOSHING);
        assertEquals(1, audioManager.playCountSwooshing);

        // Action 7 = swooshing (menu transition)
        audioManager.handleAction(AudioManager.ACTION_SWOOSHING_MENU);
        assertEquals(2, audioManager.playCountSwooshing);

        // Action 11 = die
        audioManager.handleAction(AudioManager.ACTION_DIE);
        assertEquals(1, audioManager.playCountDie);

        // Action 12 = hit
        audioManager.handleAction(AudioManager.ACTION_HIT);
        assertEquals(1, audioManager.playCountHit);

        // Action 13 = wing flap
        audioManager.handleAction(AudioManager.ACTION_WING);
        assertEquals(1, audioManager.playCountWing);

        // Non-audio action (e.g. 0 = save score, 1 = leaderboard)
        audioManager.handleAction(0);
        audioManager.handleAction(1);
        // Counters unchanged
        assertEquals(1, audioManager.playCountPoint);
        assertEquals(2, audioManager.playCountSwooshing);
        assertEquals(1, audioManager.playCountDie);
        assertEquals(1, audioManager.playCountHit);
        assertEquals(1, audioManager.playCountWing);
    }

    @Test
    public void testMuteState() {
        audioManager.setMuted(true);
        assertTrue(audioManager.isMuted);

        audioManager.setMuted(false);
        assertFalse(audioManager.isMuted);
    }

    @Test
    public void testGameEngineActionLogQueueIntegration() {
        GameEngine engine = new GameEngine();

        // Simulate game engine emitting actions in a tick
        engine.logAction(AudioManager.ACTION_WING, 0);
        engine.logAction(AudioManager.ACTION_POINT, 0);
        engine.logAction(AudioManager.ACTION_HIT, 0);

        assertEquals(3, engine.actionLogCount);

        // Drain queue as Done in FlappyScene / GameActivity
        for (int i = 0; i < engine.actionLogCount; i++) {
            audioManager.handleAction(engine.actionLogTypes[i]);
        }

        assertEquals(1, audioManager.playCountWing);
        assertEquals(1, audioManager.playCountPoint);
        assertEquals(1, audioManager.playCountHit);
    }

    @Test
    public void testRelease() {
        audioManager.release();
        assertFalse(audioManager.isLoaded);
    }
}
