package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ScoreBoardTest {

    private static class RecordingEngine extends GameEngine {
        static class DrawCall {
            int spriteId;
            int x;
            int y;

            DrawCall(int spriteId, int x, int y) {
                this.spriteId = spriteId;
                this.x = x;
                this.y = y;
            }
        }

        List<DrawCall> drawCalls = new ArrayList<>();

        @Override
        public void draw(int spriteId, int x, int y, float scaleX, float scaleY, float alpha) {
            drawCalls.add(new DrawCall(spriteId, x, y));
        }
    }

    private RecordingEngine engine;
    private AtlasItem panelItem;
    private AtlasItem newItem;
    private AtlasItem[] medalItems;
    private NumberRenderer numberRenderer;

    @Before
    public void setUp() {
        engine = new RecordingEngine();
        GameEngine.instance = engine;

        panelItem = new AtlasItem("score_panel", 238, 126, 0f, 0f, 0.2f, 0.1f);
        newItem = new AtlasItem("new", 32, 14, 0f, 0f, 0.03f, 0.01f);

        engine.atlasItems[panelItem.id] = panelItem;
        engine.atlasItems[newItem.id] = newItem;

        AtlasItem[] digitItems = new AtlasItem[10];
        for (int i = 0; i < 10; i++) {
            digitItems[i] = new AtlasItem("number_score_" + i, 14, 20, 0f, 0f, 0.01f, 0.02f);
            engine.atlasItems[digitItems[i].id] = digitItems[i];
        }

        medalItems = new AtlasItem[]{
                new AtlasItem("medals_0", 44, 44, 0f, 0f, 0.1f, 0.1f), // Platinum
                new AtlasItem("medals_1", 44, 44, 0f, 0f, 0.1f, 0.2f), // Gold
                new AtlasItem("medals_2", 44, 44, 0f, 0f, 0.2f, 0.1f), // Silver
                new AtlasItem("medals_3", 44, 44, 0f, 0f, 0.2f, 0.2f)  // Bronze
        };
        for (AtlasItem item : medalItems) {
            engine.atlasItems[item.id] = item;
        }

        numberRenderer = new NumberRenderer(digitItems);
        engine.scoreRenderer = numberRenderer;
    }

    @Test
    public void testInitialState() {
        ScoreBoard board = new ScoreBoard(panelItem, newItem, numberRenderer, new Medal(medalItems));
        assertEquals(238, board.width);
        assertEquals(126, board.height);
        assertEquals(193, board.targetY);
        assertFalse(board.active);
        assertFalse(board.visible);
    }

    @Test
    public void testInitScoreBoardAndSlideIn() {
        Medal medal = new Medal(medalItems);
        ScoreBoard board = new ScoreBoard(panelItem, newItem, numberRenderer, medal);

        board.initScoreBoard(15, 10);

        assertEquals(15, board.targetScore);
        assertEquals(10, board.highScore);
        assertEquals(0, board.currentScore);
        assertEquals(25, board.x); // (288 - 238) / 2
        assertEquals(504, board.y); // start from off-screen bottom
        assertEquals(ScoreBoard.STATE_SLIDE_IN, board.state);
        assertTrue(board.active);
        assertTrue(board.visible);
        assertFalse(board.isNewHighScore);
        assertFalse(medal.active);
        assertFalse(medal.visible);
    }

    @Test
    public void testZeroScoreSkipsRollingDirectToDone() {
        ScoreBoard board = new ScoreBoard(panelItem, newItem, numberRenderer, new Medal(medalItems));
        board.initScoreBoard(0, 5);

        // Slide-in duration is 0.5s = 30 ticks (totalTicks in Tween)
        for (int i = 0; i < 30; i++) {
            board.update(0.016f);
        }

        // At end of slide-in, if targetScore is 0, state goes directly to STATE_DONE
        assertEquals(ScoreBoard.STATE_DONE, board.state);
        assertEquals(193, board.y);
        assertEquals(0, board.currentScore);
        assertFalse(board.isNewHighScore);
        assertFalse(board.medal.active);
    }

    @Test
    public void testRollingScoreAndNewHighScoreTrigger() {
        Medal medal = new Medal(medalItems);
        ScoreBoard board = new ScoreBoard(panelItem, newItem, numberRenderer, medal);
        // Current score 25 beats old high score 20
        board.initScoreBoard(25, 20);

        // Slide in: 30 ticks
        for (int i = 0; i < 30; i++) {
            board.update(0.016f);
        }

        assertEquals(ScoreBoard.STATE_ROLL_SCORE, board.state);
        assertEquals(193, board.y);

        // Roll score: 30 ticks
        for (int i = 0; i < 30; i++) {
            board.update(0.016f);
        }

        assertEquals(ScoreBoard.STATE_DONE, board.state);
        assertEquals(25, board.currentScore);
        assertEquals(25, board.highScore);
        assertTrue(board.isNewHighScore);
        assertEquals(25, engine.highScore); // submitted to engine

        // Score 25 >= 20 gives Silver medal (tier 2)
        assertEquals(2, medal.medalType);
        assertTrue(medal.active);
        assertTrue(medal.visible);
        assertEquals(25 + 32, medal.x);
        assertEquals(193 + 44, medal.y);
    }

    @Test
    public void testMedalTierAssignments() {
        // Platinum tier: score >= 40 -> medal 0
        ScoreBoard b1 = new ScoreBoard(panelItem, newItem, numberRenderer, new Medal(medalItems));
        b1.initScoreBoard(45, 10);
        for (int i = 0; i < 60; i++) b1.update(0.016f);
        assertEquals(0, b1.medal.medalType);
        assertTrue(b1.medal.active);

        // Gold tier: score 30..39 -> medal 1
        ScoreBoard b2 = new ScoreBoard(panelItem, newItem, numberRenderer, new Medal(medalItems));
        b2.initScoreBoard(35, 10);
        for (int i = 0; i < 60; i++) b2.update(0.016f);
        assertEquals(1, b2.medal.medalType);
        assertTrue(b2.medal.active);

        // Silver tier: score 20..29 -> medal 2
        ScoreBoard b3 = new ScoreBoard(panelItem, newItem, numberRenderer, new Medal(medalItems));
        b3.initScoreBoard(22, 10);
        for (int i = 0; i < 60; i++) b3.update(0.016f);
        assertEquals(2, b3.medal.medalType);
        assertTrue(b3.medal.active);

        // Bronze tier: score 10..19 -> medal 3
        ScoreBoard b4 = new ScoreBoard(panelItem, newItem, numberRenderer, new Medal(medalItems));
        b4.initScoreBoard(12, 10);
        for (int i = 0; i < 60; i++) b4.update(0.016f);
        assertEquals(3, b4.medal.medalType);
        assertTrue(b4.medal.active);

        // Below 10 -> no medal
        ScoreBoard b5 = new ScoreBoard(panelItem, newItem, numberRenderer, new Medal(medalItems));
        b5.initScoreBoard(8, 10);
        for (int i = 0; i < 60; i++) b5.update(0.016f);
        assertFalse(b5.medal.active);
    }

    @Test
    public void testRenderOffsetsAndNewBadge() {
        Medal medal = new Medal(medalItems);
        ScoreBoard board = new ScoreBoard(panelItem, newItem, numberRenderer, medal);
        board.initScoreBoard(25, 20);

        // Complete slide-in and roll
        for (int i = 0; i < 60; i++) board.update(0.016f);

        engine.drawCalls.clear();
        board.render(engine);

        // Panel background at (x, y) = (25, 193)
        assertEquals(panelItem.id, engine.drawCalls.get(0).spriteId);
        assertEquals(25, engine.drawCalls.get(0).x);
        assertEquals(193, engine.drawCalls.get(0).y);

        // NEW badge should be drawn at (x + 142, y + 60) = (167, 253)
        boolean hasNewBadge = false;
        for (RecordingEngine.DrawCall call : engine.drawCalls) {
            if (call.spriteId == newItem.id) {
                hasNewBadge = true;
                assertEquals(25 + 142, call.x);
                assertEquals(193 + 60, call.y);
            }
        }
        assertTrue("NEW badge must be drawn when score is new high score", hasNewBadge);
    }
}
