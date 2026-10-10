package com.dotgears.flappy;

import com.dotgears.AtlasItem;
import com.dotgears.BitmapFont;
import com.dotgears.Button;
import com.dotgears.GameEngine;
import com.dotgears.GameMath;
import com.dotgears.GameObject;
import com.dotgears.NumberRenderer;
import com.dotgears.ScoreBoard;

import java.io.InputStream;

/**
 * FlappyGame - Reverse-engineered 1:1 recreation of com.dotgears.flappy.C0206c.
 * Main game world controller managing pipe generation, horizontal world scrolling,
 * AABB collision detection, title menu, gameplay loops, and UI screen flows.
 */
public class FlappyGame extends GameEngine {

    /** Title/menu screen active flag (decompiled from f537H). */
    public boolean inMenu;

    /** Game over triggered flag (decompiled from f538I). */
    public boolean isGameOver;

    /** Player bird entity (decompiled from f539J). */
    public Bird bird;

    /** Interactive UI buttons (decompiled from f540K - f547R). */
    public Button buttonPlay;
    public Button buttonOk;
    public Button buttonPause;
    public Button buttonResume;
    public Button buttonMenu;
    public Button buttonScore;
    public Button buttonShare;
    public Button buttonRate;

    /** Score panel number renderer (decompiled from f548S). */
    public NumberRenderer hudScoreRenderer;

    /** Background sprites (decompiled from f549T - f552W). */
    public AtlasItem currentBg;
    public AtlasItem bgDay;
    public AtlasItem bgNight;
    public AtlasItem bgForest;

    /** Land ground sprite (decompiled from f553X). */
    public AtlasItem land;

    /** Lower pipe (going up) and upper pipe (going down) sprites (decompiled from f554Y, f555Z). */
    public AtlasItem pipeUp;
    public AtlasItem pipeDown;

    /** Title and brand copyright sprites (decompiled from f556aa, f557ab). */
    public AtlasItem title;
    public AtlasItem brandCopyright;

    /** Horizontal scrolling land offset (0 to -24) (decompiled from f558ac). */
    public int landOffset;

    /** Y positions for the 3 active pipe pairs (decompiled from f559ad, f560ae, f561af). */
    public int pipe1Y;
    public int pipe2Y;
    public int pipe3Y;

    /** X positions for the 3 active pipe pairs (decompiled from f562ag, f563ah, f564ai). */
    public int pipe1X;
    public int pipe2X;
    public int pipe3X;

    /** Distance between consecutive pipes (105px) (decompiled from f565aj). */
    public int pipeSpacing;

    /** Startup pipe spawn delay/counter (decompiled from f566ak). */
    public int pipeDelay;

    /** Pre-game tutorial overlay (decompiled from f567al). */
    public Tutorial tutorial;

    /** Game over drop banner (decompiled from f568am). */
    public GameOverBanner gameOverBanner;

    /** HUD large score font renderer (decompiled from f569an). */
    public FlappyFont font;

    /** Horizontal world scrolling speed: 2 during play, 0 when dead (decompiled from f570ao). */
    public int scrollSpeed;

    /** Internal initialization flag (decompiled from f571ap). */
    public boolean initialized;

    /**
     * Default constructor for test harnesses and standalone instantiation.
     */
    public FlappyGame() {
        super();
        this.initialized = true;
    }

    /**
     * 1:1 reconstruction of C0206c(int, int, InputStream).
     *
     * @param highScore Saved all-time high score.
     * @param sessionPlays Session game count / parameter.
     * @param inputStream InputStream of atlas.txt.
     */
    public FlappyGame(int highScore, int sessionPlays, InputStream inputStream) {
        super(highScore, sessionPlays, inputStream);
        this.initialized = true;
    }

    /**
     * Axis-aligned bounding box (AABB) intersection check.
     * Decompiled from: C0206c.m833a
     */
    public static boolean intersects(int x1, int y1, int w1, int h1, int x2, int y2, int w2, int h2) {
        return x1 + w1 >= x2 && x1 <= x2 + w2 && y1 + h1 >= y2 && y1 <= y2 + h2;
    }


    /**
     * Touch down event hook.
     * Decompiled from: C0206c.mo834a(int, int)
     */
    @Override
    public void onPress(int x, int y) {
        if (this.inMenu) {
            return;
        }

        if (this.buttonPause == null || x < this.buttonPause.x - 20 || x > this.buttonPause.x + this.buttonPause.width + 20
                || y < this.buttonPause.y - 20 || y > this.buttonPause.y + this.buttonPause.height + 20) {
            if (this.bird != null) {
                if (!this.bird.hovering) {
                    if (this.scrollSpeed > 0) {
                        this.bird.flap();
                    }
                } else if (this.tutorial != null && this.tutorial.active && this.tutorial.state == Tutorial.STATE_WAIT_TAP) {
                    this.tutorial.state = Tutorial.STATE_FADE_OUT;
                    this.tutorial.tween.start(1.0f, 0.0f, 0, 0.5f);
                    this.bird.hovering = false;
                    this.bird.flap();
                }
            }
        }
    }

    /**
     * Touch release / touch event hook.
     * Decompiled from: C0206c.mo835a(int, int, int, int)
     */
    @Override
    public void onTouch(int x1, int y1, int x2, int y2) {
        int copyrightHeight = (this.brandCopyright != null) ? this.brandCopyright.height : 14;
        if (!this.inMenu || y2 < 482 - copyrightHeight || y2 > 482) {
            return;
        }
        postEvent(7, null, 5);
    }

    /**
     * Delayed / animation event handler.
     * Decompiled from: C0206c.mo836a(int, GameObject)
     */
    @Override
    public void onEvent(int eventType, GameObject sender) {
        switch (eventType) {
            case 2:
                this.isGameOver = true;
                logAction(0, this.score);
                if (this.gameOverBanner != null) {
                    this.gameOverBanner.start();
                }
                logAction(8, 0);
                break;
            case 3:
                logAction(11, 0); // SFX die
                break;
            case 4:
                logAction(13, 0);
                break;
            case 5:
                resetGame();
                if (this.buttonPlay != null) this.buttonPlay.active = false;
                if (this.buttonScore != null) this.buttonScore.active = false;
                if (this.buttonRate != null) this.buttonRate.active = false;
                this.inMenu = false;
                fade(false, 0, 0.5f);
                this.landOffset = 0;
                if (this.bird != null) this.bird.reset();
                this.scrollSpeed = 2;
                this.pipeDelay = 1;
                this.score = 0;
                if (this.tutorial != null) this.tutorial.start();
                this.sessionPlays++;
                logAction(7, 0); // SFX swooshing
                break;
            case 6:
                resetGame();
                fade(false, 0, 0.5f);
                logAction(6, 0);
                break;
            case 7:
                logAction(3, 0);
                break;
        }
    }

    /**
     * Main world logic and scene render update.
     * Decompiled from: C0206c.mo837b(float)
     */
    @Override
    public void updateGame(float dt) {
        if (this.currentBg != null) {
            draw(this.currentBg, 0, 0, 1.0f);
        }

        this.landOffset -= this.scrollSpeed;
        if (this.landOffset <= -24) {
            this.landOffset = 0;
        }

        int pipeWidth = (this.pipeUp != null) ? this.pipeUp.width : 52;
        int pipeHeight = (this.pipeUp != null) ? this.pipeUp.height : 320;
        int pipeDownHeight = (this.pipeDown != null) ? this.pipeDown.height : 320;

        if (this.bird != null && !this.bird.hovering) {
            this.pipe1X -= this.scrollSpeed;
            this.pipe2X -= this.scrollSpeed;
            this.pipe3X -= this.scrollSpeed;

            if (this.scrollSpeed > 0 && this.pipeDelay <= 0 && (this.pipe1X == this.bird.x || this.pipe1X == this.bird.x - 1)) {
                this.score++;
                logAction(9, 0); // SFX point
            }

            if (this.pipe1X < -pipeWidth) {
                this.pipe1X = this.pipe2X;
                this.pipe1Y = this.pipe2Y;
                this.pipe2X = this.pipe3X;
                this.pipe2Y = this.pipe3Y;
                this.pipe3X = this.pipe2X + this.pipeSpacing + pipeWidth;
                this.pipe3Y = GameMath.random(180, 360);
                if (this.pipeDelay > 0) {
                    this.pipeDelay--;
                    if (this.pipeDelay == 0) {
                        this.pipe2X = -pipeWidth;
                        this.pipe1X = -pipeWidth;
                    }
                }
            }
        }

        if (this.bird != null) {
            this.bird.update(dt);
        }

        if (this.inMenu) {
            if (this.title != null) {
                draw(this.title, (288 - this.title.width) >> 1, 150, 1.0f);
                if (this.bird != null) {
                    this.bird.x = (288 - this.bird.colliderWidth) >> 1;
                    this.bird.y = this.title.height + 150 + 20;
                }
            }
            if (this.bird != null) {
                this.bird.render(this);
            }
            if (this.land != null) {
                draw(this.land, this.landOffset, 512 - this.land.height, 1.0f);
            }
        } else {
            // Ground collision
            if (this.bird != null && this.bird.y >= 400 - this.bird.colliderHeight && this.scrollSpeed > 0) {
                flash(1.0f);
                shake(4, 0.5f);
                this.scrollSpeed = 0;
                logAction(12, 0); // SFX hit
                postEvent(2, this.scoreBoard, 1000);
            }

            // Pipe collision
            if (this.bird != null && !this.bird.dead && this.pipeDelay <= 0 && this.scrollSpeed > 0) {
                if (intersects(this.bird.x, this.bird.y, this.bird.colliderWidth, this.bird.colliderHeight,
                        this.pipe1X, (this.pipe1Y - pipeDownHeight) - 96, pipeWidth, pipeDownHeight)) {
                    flash(1.0f);
                    shake(4, 0.5f);
                    this.scrollSpeed = 0;
                    logAction(12, 0);
                    postEvent(3, null, 500);
                    postEvent(2, this.scoreBoard, 1000);
                } else if (intersects(this.bird.x, this.bird.y, this.bird.colliderWidth, this.bird.colliderHeight,
                        this.pipe1X, this.pipe1Y, pipeWidth, pipeHeight)) {
                    flash(1.0f);
                    shake(4, 0.5f);
                    this.bird.dead = true;
                    this.scrollSpeed = 0;
                    logAction(12, 0);
                    postEvent(3, null, 500);
                    postEvent(2, this.scoreBoard, 1000);
                }

                if (intersects(this.bird.x, this.bird.y, this.bird.colliderWidth, this.bird.colliderHeight,
                        this.pipe2X, (this.pipe2Y - pipeDownHeight) - 96, pipeWidth, pipeDownHeight)
                        || intersects(this.bird.x, this.bird.y, this.bird.colliderWidth, this.bird.colliderHeight,
                        this.pipe2X, this.pipe2Y, pipeWidth, pipeHeight)) {
                    flash(1.0f);
                    shake(4, 0.5f);
                    this.bird.dead = true;
                    this.scrollSpeed = 0;
                    logAction(12, 0);
                    postEvent(3, null, 500);
                    postEvent(2, this.scoreBoard, 1000);
                }
            }

            // Render pipes
            if (this.pipeDelay <= 0) {
                if (this.pipeUp != null && this.pipeDown != null) {
                    draw(this.pipeUp, this.pipe1X, this.pipe1Y, 1.0f);
                    draw(this.pipeDown, this.pipe1X, (this.pipe1Y - pipeDownHeight) - 96, 1.0f);
                    draw(this.pipeUp, this.pipe2X, this.pipe2Y, 1.0f);
                    draw(this.pipeDown, this.pipe2X, (this.pipe2Y - pipeDownHeight) - 96, 1.0f);
                    if (this.pipe3X < 288) {
                        draw(this.pipeUp, this.pipe3X, this.pipe3Y, 1.0f);
                        draw(this.pipeDown, this.pipe3X, (this.pipe3Y - pipeDownHeight) - 96, 1.0f);
                    }
                }
            }

            // ScoreBoard presentation trigger for buttons
            if (this.scoreBoard != null && this.scoreBoard.active && this.scoreBoard.state == ScoreBoard.STATE_DONE && this.buttonPlay != null && !this.buttonPlay.active) {
                int playWidth = (this.buttonPlay != null) ? this.buttonPlay.width : 116;
                int scoreWidth = (this.buttonScore != null) ? this.buttonScore.width : 116;
                this.buttonPlay.set((288 - ((playWidth + scoreWidth) + 16)) >> 1, 340);
                this.buttonScore.set(this.buttonPlay.x + playWidth + 16, 340);
            }

            // Game over banner or large HUD score
            if (this.gameOverBanner != null && this.gameOverBanner.active) {
                this.gameOverBanner.update(dt);
                this.gameOverBanner.render(this);
            } else if (this.font != null) {
                this.font.setPosition(144, 100, BitmapFont.ALIGN_CENTER_HORIZONTAL | BitmapFont.ALIGN_CENTER_VERTICAL, 1.0f);
                this.font.formatNumber(this.score, 20);
                this.font.render(this);
            }

            if (this.bird != null) {
                this.bird.render(this);
            }

            if (this.land != null) {
                draw(this.land, this.landOffset, 512 - this.land.height, 1.0f);
            }
        }

        if (this.tutorial != null && this.tutorial.active) {
            this.tutorial.update(dt);
            this.tutorial.render(this);
        }

        if (this.inMenu) {
            if (this.brandCopyright != null) {
                draw(this.brandCopyright, (288 - this.brandCopyright.width) >> 1, 432 - this.brandCopyright.height, 1.0f);
            }
        }

        if (this.buttonPlay != null && this.buttonPlay.active) {
            this.buttonPlay.update(dt);
            this.buttonPlay.render(this);
            if (this.buttonScore != null) {
                this.buttonScore.update(dt);
                this.buttonScore.render(this);
            }

            if (this.buttonPlay.justReleased) {
                fade(true, 5, 0.5f);
                logAction(10, 0); // Button click sound
            }
            if (this.buttonScore != null && this.buttonScore.justReleased) {
                logAction(1, 0);  // Leaderboards
                logAction(10, 0);
            }
            if (this.buttonRate != null && this.buttonRate.active) {
                this.buttonRate.update(dt);
                this.buttonRate.render(this);
                if (this.buttonRate.justReleased) {
                    logAction(2, 0); // Rate URL
                }
            }
        }
    }

    /**
     * Initializes game entities, buttons, fonts, and pipes.
     * Decompiled from: C0206c.mo838c()
     */
    @Override
    public void initGame() {
        this.font = new FlappyFont();
        this.buttonPlay = new Button();
        this.buttonPlay.initButton("button_play");
        this.buttonScore = new Button();
        this.buttonScore.initButton("button_score");
        this.buttonOk = new Button();
        this.buttonOk.initButton("button_ok");
        this.buttonMenu = new Button();
        this.buttonMenu.initButton("button_menu");
        this.buttonPause = new Button();
        this.buttonPause.initButton("button_pause");
        this.buttonResume = new Button();
        this.buttonResume.initButton("button_resume");
        this.buttonShare = new Button();
        this.buttonShare.initButton("button_share");
        this.buttonRate = new Button();
        this.buttonRate.initButton("button_rate");
        this.hudScoreRenderer = new NumberRenderer("number_score");

        this.bgDay = getItem("bg_day");
        this.bgNight = getItem("bg_night");
        this.bgForest = getItem("bg_forest");
        this.land = getItem("land");
        this.pipeUp = getItem("pipe_up");
        this.pipeDown = getItem("pipe_down");
        this.title = getItem("title");
        this.brandCopyright = getItem("brand_copyright");

        int pipeWidth = (this.pipeUp != null) ? this.pipeUp.width : 52;
        this.pipeSpacing = (288 - ((pipeWidth * 3) / 2)) / 2;
        this.pipe1X = this.pipeSpacing - (pipeWidth >> 1);
        this.pipe1Y = 274;
        this.pipe2X = this.pipe1X + this.pipeSpacing + pipeWidth;
        this.pipe2Y = 274;
        this.pipe3X = this.pipe2X + this.pipeSpacing + pipeWidth;
        this.pipe3Y = 274;

        this.bird = new Bird();
        this.bird.reset();
        this.tutorial = new Tutorial();
        this.gameOverBanner = new GameOverBanner();
        this.inMenu = true;

        postEvent(6, this, 1);
    }

    /**
     * Resets game world state, positions UI buttons, and selects day/night background.
     * Decompiled from: C0206c.m839e()
     */
    public void resetGame() {
        // Background selection rule: RNG % 10 > 3 ? bg_day : bg_night
        if (GameMath.random() % 10 > 3) {
            this.currentBg = this.bgDay;
        } else {
            this.currentBg = this.bgNight;
        }

        if (this.sparkles != null) {
            this.sparkles.reset();
        }

        int playWidth = (this.buttonPlay != null && this.buttonPlay.width > 0) ? this.buttonPlay.width : 116;
        int scoreWidth = (this.buttonScore != null && this.buttonScore.width > 0) ? this.buttonScore.width : 116;
        int rateWidth = (this.buttonRate != null && this.buttonRate.width > 0) ? this.buttonRate.width : 74;

        if (this.buttonPlay != null) {
            this.buttonPlay.set((288 - ((playWidth + scoreWidth) + 16)) >> 1, 340);
        }
        if (this.buttonScore != null && this.buttonPlay != null) {
            this.buttonScore.set(this.buttonPlay.x + playWidth + 16, 340);
        }
        if (this.buttonRate != null) {
            this.buttonRate.set((288 - rateWidth) >> 1, 270);
        }

        if (this.tutorial != null) this.tutorial.active = false;
        if (this.gameOverBanner != null) this.gameOverBanner.active = false;

        if (this.scoreBoard != null) {
            this.scoreBoard.active = false;
            this.scoreBoard.visible = false;
        }
        if (this.buttonOk != null) {
            this.buttonOk.active = false;
            this.buttonOk.visible = false;
        }
        if (this.buttonMenu != null) {
            this.buttonMenu.active = false;
            this.buttonMenu.visible = false;
        }
        if (this.buttonPause != null) {
            this.buttonPause.active = false;
            this.buttonPause.visible = false;
        }
        if (this.buttonResume != null) {
            this.buttonResume.active = false;
            this.buttonResume.visible = false;
        }
        if (this.buttonShare != null) {
            this.buttonShare.active = false;
            this.buttonShare.visible = false;
        }

        this.inMenu = true;
        this.landOffset = 0;
        if (this.bird != null) this.bird.reset();
        this.scrollSpeed = 2;
        this.pipeDelay = 1;
        this.score = 0;
    }
}
