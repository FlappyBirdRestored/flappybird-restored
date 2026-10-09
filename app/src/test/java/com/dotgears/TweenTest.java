package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TweenTest {

    @Before
    public void setUp() {
        new GameMath();
    }

    @Test
    public void testLinearTweenProgression() {
        Tween tween = new Tween();
        // 0.5s duration = 30 ticks
        tween.start(0.0f, 100.0f, 0, 0.5f);

        assertFalse(tween.finished);
        assertEquals(0.0f, tween.value, 0.001f);

        // Advance 15 ticks (halfway)
        for (int i = 0; i < 15; i++) {
            tween.update(0.016f);
        }

        assertFalse(tween.finished);
        assertEquals(50.0f, tween.value, 0.001f);

        // Advance remaining 15 ticks
        for (int i = 0; i < 15; i++) {
            tween.update(0.016f);
        }

        assertTrue(tween.finished);
        assertEquals(100.0f, tween.value, 0.001f);
        assertEquals(1.0f, tween.progress, 0.001f);
    }

    @Test
    public void testEasingTweenProgression() {
        Tween tween = new Tween();
        // 1.0s duration = 60 ticks with Quintic Out easing (type 11)
        tween.start(0.0f, 1.0f, 11, 1.0f);

        assertFalse(tween.finished);

        // Advance 60 ticks
        for (int i = 0; i < 60; i++) {
            tween.update(0.016f);
        }

        assertTrue(tween.finished);
        assertEquals(1.0f, tween.value, 0.0001f);
    }

    @Test
    public void testUpdateDoesNothingWhenFinished() {
        Tween tween = new Tween();
        assertTrue(tween.finished);
        float initial = tween.value;

        tween.update(0.016f);
        assertEquals(initial, tween.value, 0.0001f);
    }
}
