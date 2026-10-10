package com.dotgears.flappy;

import com.dotgears.AtlasItem;
import com.dotgears.GameEngine;
import com.dotgears.GameMath;
import com.dotgears.ScoreBoard;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FlappyGameTest {

    private FlappyGame game;

    private static final String MOCK_ATLAS =
            "bg_day 288 512 0.0 0.0 0.28125 0.5\n" +
            "bg_night 288 512 0.28515625 0.0 0.28125 0.5\n" +
            "bg_forest 288 512 0.5703125 0.0 0.28125 0.5\n" +
            "bird0_0 48 48 0.0 0.9472656 0.046875 0.046875\n" +
            "bird0_1 48 48 0.0546875 0.9472656 0.046875 0.046875\n" +
            "bird0_2 48 48 0.109375 0.9472656 0.046875 0.046875\n" +
            "bird1_0 48 48 0.1640625 0.9472656 0.046875 0.046875\n" +
            "bird1_1 48 48 0.21875 0.6308594 0.046875 0.046875\n" +
            "bird1_2 48 48 0.21875 0.6816406 0.046875 0.046875\n" +
            "bird2_0 48 48 0.21875 0.7324219 0.046875 0.046875\n" +
            "bird2_1 48 48 0.21875 0.7832031 0.046875 0.046875\n" +
            "bird2_2 48 48 0.21875 0.8339844 0.046875 0.046875\n" +
            "black 32 32 0.5703125 0.40234375 0.03125 0.03125\n" +
            "white 32 32 0.5703125 0.4375 0.03125 0.03125\n" +
            "blink_00 10 10 0.26953125 0.6660156 0.009765625 0.009765625\n" +
            "blink_01 10 10 0.26953125 0.7167969 0.009765625 0.009765625\n" +
            "blink_02 10 10 0.26953125 0.7675781 0.009765625 0.009765625\n" +
            "brand_copyright 126 14 0.86328125 0.17773438 0.123046875 0.013671875\n" +
            "button_menu 80 28 0.90234375 0.05078125 0.078125 0.02734375\n" +
            "button_ok 80 28 0.90234375 0.08203125 0.078125 0.02734375\n" +
            "button_pause 26 28 0.23632812 0.59765625 0.025390625 0.02734375\n" +
            "button_play 116 70 0.6855469 0.22851562 0.11328125 0.068359375\n" +
            "button_rate 74 48 0.90234375 0.0 0.072265625 0.046875\n" +
            "button_resume 26 28 0.65234375 0.27734375 0.025390625 0.02734375\n" +
            "button_score 116 70 0.8027344 0.22851562 0.11328125 0.068359375\n" +
            "button_share 80 28 0.5703125 0.27734375 0.078125 0.02734375\n" +
            "font_048 24 44 0.96875 0.11328125 0.0234375 0.04296875\n" +
            "land 336 112 0.0 0.0 0.328125 0.109375\n" +
            "pipe_down 52 320 0.109375 0.6308594 0.05078125 0.3125\n" +
            "pipe_up 52 320 0.1640625 0.6308594 0.05078125 0.3125\n" +
            "score_panel 238 126 0.0 0.50390625 0.23242188 0.123046875\n" +
            "text_game_over 204 54 0.765625 0.11328125 0.19921875 0.052734375\n" +
            "text_ready 196 62 0.5703125 0.11328125 0.19140625 0.060546875\n" +
            "title 178 48 0.6855469 0.17773438 0.17382812 0.046875\n" +
            "tutorial 114 98 0.5703125 0.17773438 0.111328125 0.095703125\n";

    @Before
    public void setUp() {
        AtlasItem.resetIdCounter();
        GameMath.instance = new GameMath();
        ByteArrayInputStream stream = new ByteArrayInputStream(MOCK_ATLAS.getBytes(StandardCharsets.UTF_8));
        game = new FlappyGame(0, 0, stream);
        GameEngine.instance = game;
        game.init();
    }

    @Test
    public void testAABBIntersection() {
        // Overlapping rectangles
        assertTrue(FlappyGame.intersects(10, 10, 20, 20, 15, 15, 20, 20));
        assertTrue(FlappyGame.intersects(0, 0, 10, 10, 10, 10, 10, 10)); // Touching edge

        // Non-overlapping rectangles
        assertFalse(FlappyGame.intersects(0, 0, 10, 10, 20, 20, 10, 10));
        assertFalse(FlappyGame.intersects(0, 0, 10, 10, 0, 20, 10, 10));
    }

    @Test
    public void testInitialWorldState() {
        assertTrue(game.inMenu);
        assertNotNull(game.bird);
        assertNotNull(game.buttonPlay);
        assertNotNull(game.buttonScore);
        assertNotNull(game.buttonRate);
        assertNotNull(game.tutorial);
        assertNotNull(game.gameOverBanner);

        // Pipe geometry
        assertEquals(52, game.pipeUp.width);
        assertEquals(320, game.pipeUp.height);
        // pipeSpacing = (288 - ((52 * 3) / 2)) / 2 = 105
        assertEquals(105, game.pipeSpacing);
        // pipe1X = 105 - 26 = 79
        assertEquals(79, game.pipe1X);
        // pipe2X = 79 + 105 + 52 = 236
        assertEquals(236, game.pipe2X);
        // pipe3X = 236 + 105 + 52 = 393
        assertEquals(393, game.pipe3X);
    }

    @Test
    public void testResetGameLayoutAndBackgroundSelection() {
        game.resetGame();

        assertTrue(game.inMenu);
        assertEquals(0, game.score);
        assertEquals(2, game.scrollSpeed);
        assertEquals(1, game.pipeDelay);
        assertEquals(0, game.landOffset);

        // Play & Score buttons placed side by side centered at Y=340
        assertTrue(game.buttonPlay.active);
        assertTrue(game.buttonScore.active);
        assertEquals(340, game.buttonPlay.y);
        assertEquals(340, game.buttonScore.y);
        // buttonRate centered at Y=270
        assertTrue(game.buttonRate.active);
        assertEquals(270, game.buttonRate.y);

        // Background is day or night
        assertNotNull(game.currentBg);
        assertTrue(game.currentBg == game.bgDay || game.currentBg == game.bgNight);
    }

    @Test
    public void testMenuTouchIgnoredForFlap() {
        game.inMenu = true;
        float startY = game.bird.y;

        // Tapping in menu should NOT cause flap
        game.onPress(100, 200);
        assertEquals(startY, game.bird.y, 0.001f);
    }

    @Test
    public void testMenuCopyrightTouchTriggersEvent() {
        game.inMenu = true;
        game.clearEventQueue();
        // Copyright banner Y is checked between 482 - 14 (468) and 482
        game.onTouch(0, 0, 100, 475);

        // Should post event 7 with delay 5
        assertEquals(7, game.eventTypes[0]);
        assertEquals(5, game.eventDelays[0]);
    }

    @Test
    public void testStartGameSequence() {
        // Event 5 triggers start of game
        game.onEvent(5, game);

        assertFalse(game.inMenu);
        assertFalse(game.buttonPlay.active);
        assertFalse(game.buttonScore.active);
        assertFalse(game.buttonRate.active);
        assertTrue(game.tutorial.active);
        assertTrue(game.bird.hovering);
        assertEquals(1, game.sessionPlays);
    }

    @Test
    public void testTutorialDismissAndFirstFlap() {
        game.onEvent(5, game); // Start game, tutorial active
        game.tutorial.state = Tutorial.STATE_WAIT_TAP; // Fully visible

        game.onPress(100, 200); // User taps screen

        assertEquals(Tutorial.STATE_FADE_OUT, game.tutorial.state);
        assertFalse(game.bird.hovering);
        assertEquals(Bird.FLAP_IMPULSE, game.bird.velocityY, 0.001f);
    }

    @Test
    public void testScoreIncrementOnPipePass() {
        game.onEvent(5, game);
        game.bird.hovering = false;
        game.pipeDelay = 0; // Pipes active
        // Before scroll of 2px, set to bird.x + scrollSpeed so it reaches bird.x
        game.pipe1X = game.bird.x + game.scrollSpeed;
        game.score = 0;

        game.updateGame(0.015f);

        assertEquals(1, game.score);
        // Must log action 9 (sfx_point)
        boolean foundPointAction = false;
        for (int i = 0; i < game.actionLogCount; i++) {
            if (game.actionLogTypes[i] == 9) {
                foundPointAction = true;
                break;
            }
        }
        assertTrue("SFX point action should be recorded", foundPointAction);
    }

    @Test
    public void testPipeWrapping() {
        game.onEvent(5, game);
        game.bird.hovering = false;
        game.pipeDelay = 0;

        // Position pipe 1 past left boundary (< -52)
        game.pipe1X = -53;
        int oldPipe2X = game.pipe2X;
        int oldPipe3X = game.pipe3X;

        game.updateGame(0.015f);

        // Pipe 2 shifted to pipe 1, pipe 3 shifted to pipe 2
        assertEquals(oldPipe2X - game.scrollSpeed, game.pipe1X);
        assertEquals(oldPipe3X - game.scrollSpeed, game.pipe2X);
        // Pipe 3 respawned at pipe2X + pipeSpacing + pipeWidth
        assertTrue(game.pipe3X > game.pipe2X);
        assertTrue(game.pipe3Y >= 180 && game.pipe3Y <= 360);
    }

    @Test
    public void testGroundCollisionStopsScrollingAndTriggersGameOver() {
        game.onEvent(5, game);
        game.bird.hovering = false;
        game.bird.y = 400 - game.bird.colliderHeight; // 380 (Ground level)

        game.updateGame(0.015f);

        assertEquals(0, game.scrollSpeed);
        // Action 12 (SFX hit) logged
        boolean foundHitAction = false;
        for (int i = 0; i < game.actionLogCount; i++) {
            if (game.actionLogTypes[i] == 12) {
                foundHitAction = true;
                break;
            }
        }
        assertTrue("SFX hit should be recorded on ground impact", foundHitAction);

        // Event 2 posted with delay 1000 for ScoreBoard
        boolean foundGameOverEvent = false;
        for (int i = 0; i < 50; i++) {
            if (game.eventTypes[i] == 2 && game.eventDelays[i] == 1000) {
                foundGameOverEvent = true;
                break;
            }
        }
        assertTrue("Event 2 should be scheduled for Game Over presentation", foundGameOverEvent);
    }

    @Test
    public void testPipeCollisionTriggersDieSoundAndBanner() {
        game.onEvent(5, game);
        game.bird.hovering = false;
        game.pipeDelay = 0;

        // Place pipe 1 lower directly colliding with bird
        game.pipe1X = game.bird.x;
        game.pipe1Y = game.bird.y;

        game.updateGame(0.015f);

        assertTrue(game.bird.dead);
        assertEquals(0, game.scrollSpeed);

        // Event 3 (die sound after 500ms) and Event 2 (GameOver after 1000ms) posted
        boolean foundDieEvent = false;
        boolean foundBannerEvent = false;
        for (int i = 0; i < 50; i++) {
            if (game.eventTypes[i] == 3 && game.eventDelays[i] == 500) {
                foundDieEvent = true;
            }
            if (game.eventTypes[i] == 2 && game.eventDelays[i] == 1000) {
                foundBannerEvent = true;
            }
        }
        assertTrue(foundDieEvent);
        assertTrue(foundBannerEvent);
    }

    @Test
    public void testGameOverEventSequence() {
        game.score = 15;
        game.onEvent(2, game);

        assertTrue(game.isGameOver);
        assertTrue(game.gameOverBanner.active);
        // Action 0 logged with score
        assertEquals(0, game.actionLogTypes[0]);
        assertEquals(15.0, game.actionLogValues[0], 0.001);
    }

    @Test
    public void testScoreBoardDoneActivatesPlayAndScoreButtons() {
        game.onEvent(5, game); // in game
        game.buttonPlay.active = false;
        game.scoreBoard.active = true;
        game.scoreBoard.state = ScoreBoard.STATE_DONE;

        game.updateGame(0.015f);

        assertTrue(game.buttonPlay.active);
        assertTrue(game.buttonScore.active);
        assertEquals(340, game.buttonPlay.y);
        assertEquals(340, game.buttonScore.y);
    }
}
