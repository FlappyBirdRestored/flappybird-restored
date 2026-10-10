package com.dotgears;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.util.Log;

import java.io.IOException;

/**
 * AudioManager - Modern SoundPool-backed low-latency audio manager for Flappy Bird.
 * Replaces legacy 2012 AndEngine sound subsystem with a modern Android SoundPool (GLES20 / Android 14+ compatible).
 * Manages playback of the 5 authentic 2014 game sound effects with zero GC pauses.
 */
public class AudioManager {

    private static final String TAG = "AudioManager";

    /** Global singleton instance. */
    public static AudioManager instance;

    // Action ID constants matching DotGears GameEngine action queue
    public static final int ACTION_SWOOSHING_MENU = 7;
    public static final int ACTION_POINT = 9;
    public static final int ACTION_SWOOSHING = 10;
    public static final int ACTION_DIE = 11;
    public static final int ACTION_HIT = 12;
    public static final int ACTION_WING = 13;

    // Sound asset file names in assets/sounds/
    public static final String SFX_POINT = "sfx_point.ogg";
    public static final String SFX_DIE = "sfx_die.ogg";
    public static final String SFX_HIT = "sfx_hit.ogg";
    public static final String SFX_SWOOSHING = "sfx_swooshing.ogg";
    public static final String SFX_WING = "sfx_wing.ogg";

    // Loaded SoundPool sound IDs
    public int soundPointId = 0;
    public int soundDieId = 0;
    public int soundHitId = 0;
    public int soundSwooshingId = 0;
    public int soundWingId = 0;

    private SoundPool soundPool;
    public boolean isMuted = false;
    public boolean isLoaded = false;

    // Playback counters for testing and analytics
    public int playCountPoint = 0;
    public int playCountDie = 0;
    public int playCountHit = 0;
    public int playCountSwooshing = 0;
    public int playCountWing = 0;

    /**
     * Default constructor (headless / test friendly).
     */
    public AudioManager() {
        instance = this;
    }

    /**
     * Android runtime constructor initializing SoundPool and loading assets.
     */
    public AudioManager(Context context) {
        this();
        initSoundPool(context);
    }

    /**
     * Initializes SoundPool using modern AudioAttributes and loads the 5 sound effects.
     */
    public void initSoundPool(Context context) {
        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        this.soundPool = new SoundPool.Builder()
                .setMaxStreams(5)
                .setAudioAttributes(audioAttributes)
                .build();

        if (context != null) {
            loadSounds(context);
        }
    }

    /**
     * Loads the 5 original OGG sound files from assets/sounds/.
     */
    public void loadSounds(Context context) {
        if (this.soundPool == null || context == null) {
            return;
        }

        try {
            this.soundPointId = loadAsset(context, SFX_POINT);
            this.soundDieId = loadAsset(context, SFX_DIE);
            this.soundHitId = loadAsset(context, SFX_HIT);
            this.soundSwooshingId = loadAsset(context, SFX_SWOOSHING);
            this.soundWingId = loadAsset(context, SFX_WING);
            this.isLoaded = true;
        } catch (Exception e) {
            Log.e(TAG, "Error loading sounds: " + e.getMessage());
        }
    }

    private int loadAsset(Context context, String filename) {
        try {
            AssetFileDescriptor afd = context.getAssets().openFd("sounds/" + filename);
            return this.soundPool.load(afd, 1);
        } catch (IOException e) {
            Log.e(TAG, "Could not open asset sounds/" + filename + ": " + e.getMessage());
            return 0;
        }
    }

    /**
     * Dispatches an action log event from GameEngine / FlappyGame to the appropriate sound effect.
     *
     * @param actionType Action event ID (9 = point, 10 = swoosh, 11 = die, 12 = hit, 13 = wing).
     */
    public void handleAction(int actionType) {
        switch (actionType) {
            case ACTION_POINT:
                playPoint();
                break;
            case ACTION_SWOOSHING_MENU:
            case ACTION_SWOOSHING:
                playSwooshing();
                break;
            case ACTION_DIE:
                playDie();
                break;
            case ACTION_HIT:
                playHit();
                break;
            case ACTION_WING:
                playWing();
                break;
        }
    }

    /**
     * Plays the point scoring sound effect (sfx_point.ogg).
     */
    public void playPoint() {
        this.playCountPoint++;
        playSound(this.soundPointId);
    }

    /**
     * Plays the player death sound effect (sfx_die.ogg).
     */
    public void playDie() {
        this.playCountDie++;
        playSound(this.soundDieId);
    }

    /**
     * Plays the pipe / ground collision hit sound effect (sfx_hit.ogg).
     */
    public void playHit() {
        this.playCountHit++;
        playSound(this.soundHitId);
    }

    /**
     * Plays the swooshing transition sound effect (sfx_swooshing.ogg).
     */
    public void playSwooshing() {
        this.playCountSwooshing++;
        playSound(this.soundSwooshingId);
    }

    /**
     * Plays the wing flap sound effect (sfx_wing.ogg).
     */
    public void playWing() {
        this.playCountWing++;
        playSound(this.soundWingId);
    }

    private void playSound(int soundId) {
        if (this.isMuted || this.soundPool == null || soundId == 0) {
            return;
        }
        this.soundPool.play(soundId, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    /**
     * Sets sound muting state.
     */
    public void setMuted(boolean muted) {
        this.isMuted = muted;
    }

    /**
     * Releases SoundPool resources when activity is destroyed.
     */
    public void release() {
        if (this.soundPool != null) {
            this.soundPool.release();
            this.soundPool = null;
        }
        this.isLoaded = false;
    }
}
