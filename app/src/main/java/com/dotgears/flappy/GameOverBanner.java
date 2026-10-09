package com.dotgears.flappy;

import com.dotgears.AtlasItem;
import com.dotgears.GameEngine;
import com.dotgears.GameObject;
import com.dotgears.ScoreBoard;
import com.dotgears.Tween;

/**
 * GameOverBanner - Reverse-engineered 1:1 recreation of com.dotgears.flappy.C0208e.
 * "GAME OVER" text banner dropped in when the bird dies. Uses Tween curve 11 (elastic)
 * and vertical bounce physics, then triggers the ScoreBoard presentation.
 */
public class GameOverBanner extends GameObject {

    /** Animation state: banner dropping and fading in (f578f = 0). */
    public static final int STATE_BANNER_DROP = 0;

    /** Animation state: ScoreBoard presentation running (f578f = 1). */
    public static final int STATE_SCOREBOARD_ACTIVE = 1;

    /** Animation state: ScoreBoard presentation complete (f578f = 2). */
    public static final int STATE_DONE = 2;

    /** Tween interpolator for alpha / entrance (decompiled from f573a). */
    public Tween tween;

    /** Sprite for "text_game_over" (decompiled from f574b). */
    public AtlasItem sprite;

    /** Vertical bounce offset, clamped to <= 0 (decompiled from f575c). */
    public int offsetY;

    /** Vertical bounce velocity (decompiled from f576d). */
    public float velocityY;

    /** Vertical bounce acceleration (constant 0.25f) (decompiled from f577e). */
    public float accelerationY;

    /** State machine index 0..2 (decompiled from f578f). */
    public int state;

    /**
     * Default constructor matching C0208e.<init>().
     */
    public GameOverBanner() {
        this.tween = new Tween();
        if (GameEngine.instance != null) {
            this.sprite = GameEngine.instance.getItem("text_game_over");
        }
    }

    /**
     * Constructor allowing explicit AtlasItem sprite injection (useful for unit tests).
     */
    public GameOverBanner(AtlasItem sprite) {
        this.tween = new Tween();
        this.sprite = sprite;
    }

    /**
     * Starts the game over banner drop sequence.
     * Decompiled from: C0208e.m840a()
     */
    public void start() {
        this.active = true;
        this.visible = true;
        this.tween.start(0.0f, 1.0f, 11, 1.0f);
        this.offsetY = -1;
        this.velocityY = -2.0f;
        this.accelerationY = 0.25f;
        this.state = STATE_BANNER_DROP;
        if (GameEngine.instance != null) {
            GameEngine.instance.recordEvent(10, 0);
        }
    }

    /** Alias for start() matching C0208e.m840a(). */
    public void reset() {
        start();
    }

    /**
     * Updates bounce physics, entrance tween, and triggers ScoreBoard when banner finishes dropping.
     * Decompiled from: C0208e.mo826a(float)
     */
    @Override
    public void update(float dt) {
        this.tween.update(dt);

        if (this.offsetY < 0) {
            this.offsetY = (int) (this.offsetY + this.velocityY);
            this.velocityY += this.accelerationY;
        } else {
            this.offsetY = 0;
        }

        switch (this.state) {
            case STATE_BANNER_DROP:
                if (this.tween.finished) {
                    this.state = STATE_SCOREBOARD_ACTIVE;
                    if (GameEngine.instance != null) {
                        if (GameEngine.instance.scoreBoard != null) {
                            GameEngine.instance.scoreBoard.initScoreBoard(
                                    GameEngine.instance.score,
                                    GameEngine.instance.highScore,
                                    10, 20, 30, 40
                            );
                        }
                        GameEngine.instance.recordEvent(10, 0);
                    }
                }
                break;

            case STATE_SCOREBOARD_ACTIVE:
                if (GameEngine.instance != null && GameEngine.instance.scoreBoard != null) {
                    if (GameEngine.instance.scoreBoard.state == ScoreBoard.STATE_DONE) {
                        this.state = STATE_DONE;
                    }
                }
                break;
        }
    }

    /**
     * Renders the "GAME OVER" banner at centered X and (offsetY + 130).
     * Decompiled from: C0208e.mo828a(C0210g)
     */
    @Override
    public void render(GameEngine engine) {
        if (this.visible && engine != null) {
            if (this.sprite == null) {
                this.sprite = engine.getItem("text_game_over");
            }
            if (this.sprite != null) {
                int x = (288 - this.sprite.width) >> 1;
                int y = this.offsetY + 130;
                engine.draw(this.sprite, x, y, this.tween.value);
            }
        }
    }
}
