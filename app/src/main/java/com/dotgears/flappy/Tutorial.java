package com.dotgears.flappy;

import com.dotgears.AtlasItem;
import com.dotgears.GameEngine;
import com.dotgears.GameObject;
import com.dotgears.Tween;

/**
 * Tutorial - Reverse-engineered 1:1 recreation of com.dotgears.flappy.C0209f.
 * "Get Ready" banner and tapping finger tutorial overlay shown before game start.
 * Fades in linearly over 0.5s, waits for user tap, and fades out over 0.5s.
 */
public class Tutorial extends GameObject {

    /** State 0: Overlay fading in from alpha 0.0 to 1.0 (decompiled from f582d = 0). */
    public static final int STATE_FADE_IN = 0;

    /** State 1: Overlay fully visible, waiting for user tap (decompiled from f582d = 1). */
    public static final int STATE_WAIT_TAP = 1;

    /** State 2: Overlay fading out from alpha 1.0 to 0.0 (decompiled from f582d = 2). */
    public static final int STATE_FADE_OUT = 2;

    /** Interpolator for fade-in and fade-out alpha (decompiled from f579a). */
    public Tween tween;

    /** Sprite for "text_ready" ("Get Ready") (decompiled from f580b). */
    public AtlasItem readySprite;

    /** Sprite for "tutorial" (tap hand indicator) (decompiled from f581c). */
    public AtlasItem tutorialSprite;

    /** State index 0..2 (decompiled from f582d). */
    public int state;

    /**
     * Default constructor matching C0209f.<init>().
     */
    public Tutorial() {
        this.tween = new Tween();
        if (GameEngine.instance != null) {
            this.readySprite = GameEngine.instance.getItem("text_ready");
            this.tutorialSprite = GameEngine.instance.getItem("tutorial");
        }
    }

    /**
     * Constructor allowing explicit injection of AtlasItem sprites (useful for unit tests).
     */
    public Tutorial(AtlasItem readySprite, AtlasItem tutorialSprite) {
        this.tween = new Tween();
        this.readySprite = readySprite;
        this.tutorialSprite = tutorialSprite;
    }

    /**
     * Starts the tutorial fade-in presentation.
     * Decompiled from: C0209f.m841a()
     */
    public void start() {
        this.active = true;
        this.visible = true;
        this.tween.start(0.0f, 1.0f, 0, 0.5f);
        this.state = STATE_FADE_IN;
    }

    /** Alias for start() matching C0209f.m841a(). */
    public void reset() {
        start();
    }

    /**
     * Initiates the fade-out transition when the player taps to start.
     * Corresponds to FlappyGame (C0206c lines 144-145).
     */
    public void dismiss() {
        this.state = STATE_FADE_OUT;
        this.tween.start(1.0f, 0.0f, 0, 0.5f);
    }

    /** Alias for dismiss(). */
    public void fadeOut() {
        dismiss();
    }

    /**
     * Updates tween and state transitions.
     * Decompiled from: C0209f.mo826a(float)
     */
    @Override
    public void update(float dt) {
        this.tween.update(dt);

        switch (this.state) {
            case STATE_FADE_IN:
                if (this.tween.finished) {
                    this.state = STATE_WAIT_TAP;
                }
                break;

            case STATE_FADE_OUT:
                if (this.tween.finished) {
                    this.active = true;
                    this.visible = false;
                }
                break;
        }
    }

    /**
     * Renders "Get Ready" banner and tap finger instructions.
     * Decompiled from: C0209f.mo828a(C0210g)
     */
    @Override
    public void render(GameEngine engine) {
        if (this.visible && engine != null) {
            if (this.readySprite == null) {
                this.readySprite = engine.getItem("text_ready");
            }
            if (this.tutorialSprite == null) {
                this.tutorialSprite = engine.getItem("tutorial");
            }

            if (this.readySprite != null) {
                int rx = (288 - this.readySprite.width) >> 1;
                engine.draw(this.readySprite, rx, 146, this.tween.value);
            }

            if (this.tutorialSprite != null) {
                int tx = (288 - this.tutorialSprite.width) >> 1;
                engine.draw(this.tutorialSprite, tx, 220, this.tween.value);
            }
        }
    }
}
