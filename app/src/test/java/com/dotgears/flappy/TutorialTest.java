package com.dotgears.flappy;

import com.dotgears.AtlasItem;
import com.dotgears.GameEngine;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TutorialTest {

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

        List<ItemDrawCall> drawCalls = new ArrayList<>();

        @Override
        public void draw(AtlasItem item, int x, int y, float alpha) {
            drawCalls.add(new ItemDrawCall(item, x, y, alpha));
            super.draw(item, x, y, alpha);
        }
    }

    private RecordingEngine engine;
    private AtlasItem readySprite;
    private AtlasItem tutorialSprite;

    @Before
    public void setUp() {
        engine = new RecordingEngine();
        GameEngine.instance = engine;

        readySprite = new AtlasItem("text_ready", 196, 62, 0f, 0f, 0.2f, 0.06f);
        tutorialSprite = new AtlasItem("tutorial", 114, 98, 0f, 0f, 0.1f, 0.09f);

        engine.atlasItems[readySprite.id] = readySprite;
        engine.atlasItems[tutorialSprite.id] = tutorialSprite;
    }

    @Test
    public void testInitialStateAndStart() {
        Tutorial tutorial = new Tutorial(readySprite, tutorialSprite);
        assertFalse(tutorial.active);
        assertFalse(tutorial.visible);

        tutorial.start();

        assertTrue(tutorial.active);
        assertTrue(tutorial.visible);
        assertEquals(Tutorial.STATE_FADE_IN, tutorial.state);
        assertFalse(tutorial.tween.finished);
        assertEquals(1.0f, tutorial.tween.targetValue, 0.001f);
    }

    @Test
    public void testFadeInToWaitTapLifecycle() {
        Tutorial tutorial = new Tutorial(readySprite, tutorialSprite);
        tutorial.start();

        // 30 ticks (0.5s at 60 Hz) for linear fade-in
        for (int i = 0; i < 30; i++) {
            tutorial.update(0.016f);
        }

        assertTrue(tutorial.tween.finished);
        assertEquals(Tutorial.STATE_WAIT_TAP, tutorial.state);
        assertTrue(tutorial.active);
        assertTrue(tutorial.visible);
    }

    @Test
    public void testDismissFadeOutHidesVisibility() {
        Tutorial tutorial = new Tutorial(readySprite, tutorialSprite);
        tutorial.start();

        // Finish fade in
        for (int i = 0; i < 30; i++) {
            tutorial.update(0.016f);
        }
        assertEquals(Tutorial.STATE_WAIT_TAP, tutorial.state);

        // Player taps screen -> dismiss tutorial
        tutorial.dismiss();
        assertEquals(Tutorial.STATE_FADE_OUT, tutorial.state);
        assertFalse(tutorial.tween.finished);
        assertEquals(0.0f, tutorial.tween.targetValue, 0.001f);

        // Advance 30 ticks to finish fade-out
        for (int i = 0; i < 30; i++) {
            tutorial.update(0.016f);
        }

        assertTrue(tutorial.tween.finished);
        assertTrue(tutorial.active);
        assertFalse("Tutorial must become invisible after fade-out completes", tutorial.visible);
    }

    @Test
    public void testRenderCoordinatesAndCentering() {
        Tutorial tutorial = new Tutorial(readySprite, tutorialSprite);
        tutorial.start();

        // Complete fade in so alpha = 1.0
        for (int i = 0; i < 30; i++) {
            tutorial.update(0.016f);
        }

        engine.drawCalls.clear();
        tutorial.render(engine);

        assertEquals(2, engine.drawCalls.size());

        // Ready banner: centered (288 - 196) / 2 = 46, y = 146
        RecordingEngine.ItemDrawCall readyCall = engine.drawCalls.get(0);
        assertSame(readySprite, readyCall.item);
        assertEquals(46, readyCall.x);
        assertEquals(146, readyCall.y);
        assertEquals(1.0f, readyCall.alpha, 0.001f);

        // Tutorial hand: centered (288 - 114) / 2 = 87, y = 220
        RecordingEngine.ItemDrawCall tutCall = engine.drawCalls.get(1);
        assertSame(tutorialSprite, tutCall.item);
        assertEquals(87, tutCall.x);
        assertEquals(220, tutCall.y);
        assertEquals(1.0f, tutCall.alpha, 0.001f);
    }

    @Test
    public void testInvisibleTutorialProducesNoDrawCalls() {
        Tutorial tutorial = new Tutorial(readySprite, tutorialSprite);
        tutorial.visible = false;
        tutorial.render(engine);
        assertEquals(0, engine.drawCalls.size());
    }
}
