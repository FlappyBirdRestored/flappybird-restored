package com.dotgears;

/**
 * ScoreBoard - Reverse-engineered 1:1 recreation of com.dotgears.C0219p.
 * Results dialog board displayed at game over. Handles smooth slide-in
 * animation via Tween (curve 11), rolling score counter up to target score,
 * high score tracking with "NEW" badge display, and awarded medal placement.
 */
public class ScoreBoard extends GameObject {

    /** Animation state: board sliding up into center view. */
    public static final int STATE_SLIDE_IN = 0;

    /** Animation state: current score counter rolling up from 0 to targetScore. */
    public static final int STATE_ROLL_SCORE = 1;

    /** Animation state: all counters finished, medal sparkles active. */
    public static final int STATE_DONE = 2;

    /** Default medal threshold scores. */
    public static final int DEFAULT_BRONZE = 10;
    public static final int DEFAULT_SILVER = 20;
    public static final int DEFAULT_GOLD = 30;
    public static final int DEFAULT_PLATINUM = 40;

    /** Default score panel dimensions from atlas. */
    public static final int DEFAULT_WIDTH = 238;
    public static final int DEFAULT_HEIGHT = 126;

    /** Board horizontal canvas position (decompiled from f691a). */
    public int x;

    /** Board vertical canvas position (decompiled from f692b). */
    public int y;

    /** Width of score panel sprite (decompiled from f693c). */
    public int width = DEFAULT_WIDTH;

    /** Height of score panel sprite (decompiled from f694d). */
    public int height = DEFAULT_HEIGHT;

    /** Animated rolling score currently displayed (decompiled from f695e). */
    public int currentScore = 0;

    /** High score value displayed (decompiled from f696f). */
    public int highScore = 0;

    /** Score threshold required for Bronze medal (decompiled from f697g, medals_3). */
    public int thresholdBronze = DEFAULT_BRONZE;

    /** Score threshold required for Silver medal (decompiled from f698h, medals_2). */
    public int thresholdSilver = DEFAULT_SILVER;

    /** Score threshold required for Gold medal (decompiled from f699i, medals_1). */
    public int thresholdGold = DEFAULT_GOLD;

    /** Score threshold required for Platinum medal (decompiled from f700j, medals_0). */
    public int thresholdPlatinum = DEFAULT_PLATINUM;

    /** Current animation state 0..2 (decompiled from f701k). */
    public int state = STATE_SLIDE_IN;

    /** Target final score achieved in the round (decompiled from f702l). */
    public int targetScore = 0;

    /** Flag indicating whether this round set a new high score (decompiled from f703m). */
    public boolean isNewHighScore = false;

    /** Target vertical center position on canvas: (512 - height) >> 1 (decompiled from f704n). */
    public int targetY = (512 - DEFAULT_HEIGHT) >> 1;

    /** Awarded medal display entity (decompiled from f705o). */
    public Medal medal = new Medal();

    /** Tween interpolator for slide-in and rolling score (decompiled from f706p). */
    public Tween tween = new Tween();

    /** Atlas sprite for the "NEW" badge indicator (decompiled from f707q). */
    public AtlasItem newBadgeSprite;

    /** Atlas sprite for the score panel background (decompiled from f708r). */
    public AtlasItem panelSprite;

    /** Number renderer for score digits (decompiled from f709s). */
    public NumberRenderer scoreRenderer;

    /**
     * Default constructor matching C0219p.<init>().
     */
    public ScoreBoard() {
        this.currentScore = 0;
        this.highScore = 0;
        this.targetScore = 0;

        if (GameEngine.instance != null) {
            this.panelSprite = GameEngine.instance.getItem("score_panel");
            this.newBadgeSprite = GameEngine.instance.getItem("new");
            this.scoreRenderer = GameEngine.instance.scoreRenderer;
        }

        if (this.panelSprite != null) {
            this.width = this.panelSprite.width;
            this.height = this.panelSprite.height;
        }
        this.targetY = (512 - this.height) >> 1;
    }

    /**
     * Constructor allowing explicit dependency injection (useful for tests).
     */
    public ScoreBoard(AtlasItem panelSprite, AtlasItem newBadgeSprite, NumberRenderer scoreRenderer, Medal medal) {
        this.panelSprite = panelSprite;
        this.newBadgeSprite = newBadgeSprite;
        this.scoreRenderer = scoreRenderer;
        if (medal != null) {
            this.medal = medal;
        }
        if (this.panelSprite != null) {
            this.width = this.panelSprite.width;
            this.height = this.panelSprite.height;
        }
        this.targetY = (512 - this.height) >> 1;
    }

    /**
     * Initializes and starts the score board presentation with custom medal thresholds.
     * Decompiled from: C0219p.m920a(int, int, int, int, int, int)
     */
    public void initScoreBoard(int score, int highScore, int bronze, int silver, int gold, int platinum) {
        this.targetScore = score;
        this.highScore = highScore;
        this.currentScore = 0;
        this.thresholdBronze = bronze;
        this.thresholdSilver = silver;
        this.thresholdGold = gold;
        this.thresholdPlatinum = platinum;
        this.active = true;
        this.visible = true;
        this.isNewHighScore = false;
        this.x = (288 - this.width) >> 1;
        this.y = 504;
        this.tween.start(this.y, this.targetY, 11, 0.5f);
        this.state = STATE_SLIDE_IN;
        this.medal.active = false;
        this.medal.visible = false;
    }

    /**
     * Convenience overload using standard Flappy Bird medal thresholds (10, 20, 30, 40).
     */
    public void initScoreBoard(int score, int highScore) {
        initScoreBoard(score, highScore, DEFAULT_BRONZE, DEFAULT_SILVER, DEFAULT_GOLD, DEFAULT_PLATINUM);
    }

    /** Alias for initScoreBoard matching C0219p.m920a. */
    public void reset(int score, int highScore, int bronze, int silver, int gold, int platinum) {
        initScoreBoard(score, highScore, bronze, silver, gold, platinum);
    }

    /** Alias for initScoreBoard. */
    public void set(int score, int highScore, int bronze, int silver, int gold, int platinum) {
        initScoreBoard(score, highScore, bronze, silver, gold, platinum);
    }

    /** Alias for initScoreBoard. */
    public void show(int score, int highScore, int bronze, int silver, int gold, int platinum) {
        initScoreBoard(score, highScore, bronze, silver, gold, platinum);
    }

    /**
     * Updates slide-in tween, rolling score, and medal sparkle timers.
     * Decompiled from: C0219p.mo826a(float)
     */
    @Override
    public void update(float dt) {
        if (this.active) {
            if (!this.tween.finished) {
                this.tween.update(dt);
            }

            switch (this.state) {
                case STATE_SLIDE_IN:
                    this.y = (int) this.tween.value;
                    if (this.tween.finished) {
                        if (this.targetScore <= 0) {
                            this.state = STATE_DONE;
                        } else {
                            this.state = STATE_ROLL_SCORE;
                            this.tween.start(0.0f, this.targetScore, 0, 0.5f);
                        }
                    }
                    break;

                case STATE_ROLL_SCORE:
                    this.currentScore = (int) this.tween.value;
                    if (this.tween.finished) {
                        this.state = STATE_DONE;
                        if (GameEngine.instance != null) {
                            GameEngine.instance.submitScore(this.currentScore);
                        }
                        if (this.currentScore > this.highScore) {
                            this.highScore = this.currentScore;
                            this.isNewHighScore = true;
                        }
                        if (this.currentScore >= this.thresholdPlatinum) {
                            this.medal.reset(0);
                        } else if (this.currentScore >= this.thresholdGold) {
                            this.medal.reset(1);
                        } else if (this.currentScore >= this.thresholdSilver) {
                            this.medal.reset(2);
                        } else if (this.currentScore >= this.thresholdBronze) {
                            this.medal.reset(3);
                        }
                        this.medal.x = this.x + 32;
                        this.medal.y = this.y + 44;
                    }
                    break;

                case STATE_DONE:
                    this.medal.update(dt);
                    break;
            }
        }
    }

    /**
     * Renders panel background, current score, high score, NEW badge, and medal.
     * Decompiled from: C0219p.mo828a(C0210g)
     */
    @Override
    public void render(GameEngine engine) {
        if (this.visible && engine != null) {
            if (this.panelSprite == null) {
                this.panelSprite = engine.getItem("score_panel");
            }
            if (this.newBadgeSprite == null) {
                this.newBadgeSprite = engine.getItem("new");
            }
            if (this.scoreRenderer == null) {
                this.scoreRenderer = engine.scoreRenderer;
                if (this.scoreRenderer == null) {
                    this.scoreRenderer = new NumberRenderer("number_score");
                }
            }

            // Draw panel background
            if (this.panelSprite != null) {
                engine.draw(this.panelSprite.id, this.x, this.y, 1.0f, 1.0f, 1.0f);
            }

            // Draw current score and high score right-aligned at relative offset
            if (this.scoreRenderer != null) {
                this.scoreRenderer.render(engine, this.currentScore, this.x + 210, this.y + 36, false, 10);
                this.scoreRenderer.render(engine, this.highScore, this.x + 210, this.y + 78, false, 10);
            }

            // Draw "NEW" badge if current score surpassed previous high score
            if (this.isNewHighScore && this.newBadgeSprite != null) {
                engine.draw(this.newBadgeSprite.id, this.x + 142, this.y + 60, 1.0f, 1.0f, 1.0f);
            }

            // Draw medal (if awarded)
            this.medal.render(engine);
        }
    }
}
