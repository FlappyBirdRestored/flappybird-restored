package com.dotgears.flappy;

import com.dotgears.AtlasItem;
import com.dotgears.GameEngine;
import com.dotgears.ScoreBoard;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameOverBannerTest {

    private static class RecordingEngine extends GameEngine {
        static class ItemDrawCall {
            AtlasItem item;
            int x;
            int y;
            float alpha;

            ItemDrawCall(AtlasItem item, int x, int y, float alpha) {
                this.item = item;
                this.x = x;
                this.y = y;
                this.alpha = alpha;
            }
        }

        List<ItemDrawCall> itemDrawCalls = new ArrayList<>();
        List<int[]> recordedEvents = new ArrayList<>();

        @Override
        public void draw(AtlasItem item, int x, int y, float alpha) {
            itemDrawCalls.add(new ItemDrawCall(item, x, y, alpha));
            super.draw(item, x, y, alpha);
        }

        @Override
        public void recordEvent(int type, int value) {
            recordedEvents.add(new int[]{type, value});
            super.recordEvent(type, value);
        }
    }

    private RecordingEngine engine;
    private AtlasItem bannerSprite;

    @Before
    public void setUp() {
        engine = new RecordingEngine();
        GameEngine.instance = engine;

        bannerSprite = new AtlasItem("text_game_over", 204, 54, 0f, 0f, 0.2f, 0.05f);
        engine.atlasItems[bannerSprite.id] = bannerSprite;
    }

    @Test
    public void testInitialStateAndStart() {
        GameOverBanner banner = new GameOverBanner(bannerSprite);
        assertFalse(banner.active);
        assertFalse(banner.visible);

        banner.start();

        assertTrue(banner.active);
        assertTrue(banner.visible);
        assertEquals(-1, banner.offsetY);
        assertEquals(-2.0f, banner.velocityY, 0.001f);
        assertEquals(0.25f, banner.accelerationY, 0.001f);
        assertEquals(GameOverBanner.STATE_BANNER_DROP, banner.state);
        assertFalse(banner.tween.finished);

        // Event 10 was recorded on start
        assertTrue(engine.recordedEvents.size() >= 1);
        assertEquals(10, engine.recordedEvents.get(0)[0]);
    }

    @Test
    public void testBouncePhysicsSettlesAtZero() {
        GameOverBanner banner = new GameOverBanner(bannerSprite);
        banner.start();

        // While offsetY < 0, it arcs upwards and falls down
        // With initial velocity -2.0 and accel 0.25, velocity will cross 0 and become positive:
        // Frame 1: offsetY becomes -1 + (-2) = -3, vel = -1.75
        // Frame 2: offsetY becomes -3 + (-1.75) = -4, vel = -1.5
        // ...
        // Eventually it must reach >= 0 and lock strictly to 0
        for (int i = 0; i < 30; i++) {
            banner.update(0.016f);
        }

        assertEquals(0, banner.offsetY);

        // After settling, subsequent updates must stay at 0
        banner.update(0.016f);
        assertEquals(0, banner.offsetY);
    }

    @Test
    public void testStateTransitionToScoreBoardAndDone() {
        GameOverBanner banner = new GameOverBanner(bannerSprite);
        engine.score = 15;
        engine.highScore = 20;

        banner.start();
        assertEquals(GameOverBanner.STATE_BANNER_DROP, banner.state);

        // Tween duration is 1.0s = 60 ticks
        for (int i = 0; i < 60; i++) {
            banner.update(0.016f);
        }

        // Tween finished -> transitions to STATE_SCOREBOARD_ACTIVE
        assertEquals(GameOverBanner.STATE_SCOREBOARD_ACTIVE, banner.state);
        assertTrue(engine.scoreBoard.active);
        assertTrue(engine.scoreBoard.visible);
        assertEquals(15, engine.scoreBoard.targetScore);
        assertEquals(20, engine.scoreBoard.highScore);

        // When ScoreBoard completes (transitions to STATE_DONE)
        engine.scoreBoard.state = ScoreBoard.STATE_DONE;
        banner.update(0.016f);
        assertEquals(GameOverBanner.STATE_DONE, banner.state);
    }

    @Test
    public void testRenderPositioningAndAlpha() {
        GameOverBanner banner = new GameOverBanner(bannerSprite);
        banner.start();

        // Step 30 frames: offsetY has settled at 0
        for (int i = 0; i < 30; i++) {
            banner.update(0.016f);
        }

        engine.itemDrawCalls.clear();
        banner.render(engine);

        assertEquals(1, engine.itemDrawCalls.size());
        RecordingEngine.ItemDrawCall call = engine.itemDrawCalls.get(0);
        assertSame(bannerSprite, call.item);

        // Centered horizontal: (288 - 204) >> 1 = 42
        assertEquals(42, call.x);
        // Vertical position: offsetY + 130 = 0 + 130 = 130
        assertEquals(130, call.y);
        assertTrue(call.alpha > 0f);
    }
}
