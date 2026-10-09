package com.dotgears;

/**
 * SpriteAnimation - Reverse-engineered 1:1 recreation of com.dotgears.C0201d.
 * Frame sequence player supporting variable frame rates and looping.
 */
public class SpriteAnimation {

    /** Animation playback finished flag (decompiled from f504a). */
    public boolean finished;

    /** Animation identifier name (e.g. "flap", "auto", "blink") (f505b). */
    public String name;

    /** Total number of frames in sequence (f506c). */
    public int frameCount;

    /** Array of frame indices (f507d). */
    public int[] frames;

    /** Duration per frame in milliseconds (1000 / fps) (f508e). */
    public float frameDurationMs;

    /** Looping animation flag (f509f). */
    public boolean loop;

    /** Animation slot ID (f510g). */
    public int id;

    /** Accumulated millisecond timer (f511h). */
    public int timerMs;

    /** Current position index in frames array (f512i). */
    public int frameIndex;

    /** Current sprite frame index from atlas (f513j). */
    public int currentFrame;

    public SpriteAnimation(int id, String name, int[] frameSeq, int count, int fps, boolean loop) {
        this.id = id;
        this.name = name;
        this.frameCount = count;
        this.frames = new int[this.frameCount];
        System.arraycopy(frameSeq, 0, this.frames, 0, this.frameCount);
        this.frameDurationMs = 1000.0f / (float) fps;
        this.loop = loop;
    }

    /**
     * Resets animation playback to the beginning.
     * Decompiled from: C0201d.m823a
     */
    public void reset() {
        this.timerMs = 0;
        this.frameIndex = 0;
        this.currentFrame = this.frames[0];
    }

    /**
     * Advances animation by frame step (adds 15ms per tick).
     * Decompiled from: C0201d.m824a(float)
     */
    public void update(float dt) {
        if (this.finished) {
            return;
        }
        this.timerMs += 15;
        if (this.timerMs >= this.frameDurationMs) {
            this.timerMs = 0;
            this.frameIndex++;
            if (this.frameIndex >= this.frameCount) {
                if (this.loop) {
                    this.frameIndex = 0;
                } else {
                    this.finished = true;
                    this.frameIndex = 0;
                }
            }
            this.currentFrame = this.frames[this.frameIndex];
        }
    }

    /**
     * Resumes or starts animation.
     * Decompiled from: C0201d.m825b
     */
    public void play() {
        if (!this.loop && this.finished) {
            reset();
        }
        this.finished = false;
    }
}
