package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameMathTest {

    @Before
    public void setUp() {
        new GameMath();
    }

    @Test
    public void testTrigTablesLengthAndValues() {
        assertEquals(360, GameMath.sinTable.length);
        assertEquals(360, GameMath.cosTable.length);

        // Verify angle 0
        assertEquals(0.0f, GameMath.sin(0), 0.0001f);
        assertEquals(1.0f, GameMath.cos(0), 0.0001f);

        // Verify angle 90
        assertEquals(1.0f, GameMath.sin(90), 0.0001f);
        assertEquals(0.0f, GameMath.cos(90), 0.0001f);

        // Verify angle 180
        assertEquals(0.0f, GameMath.sin(180), 0.0001f);
        assertEquals(-1.0f, GameMath.cos(180), 0.0001f);

        // Verify angle 270
        assertEquals(-1.0f, GameMath.sin(270), 0.0001f);
        assertEquals(0.0f, GameMath.cos(270), 0.0001f);
    }

    @Test
    public void testAngleNormalization() {
        assertEquals(0.0f, GameMath.normalizeAngle(0.0f), 0.0001f);
        assertEquals(45.0f, GameMath.normalizeAngle(405.0f), 0.0001f);
        assertEquals(315.0f, GameMath.normalizeAngle(-45.0f), 0.0001f);
        assertEquals(90.0f, GameMath.normalizeAngle(810.0f), 0.0001f);
    }

    @Test
    public void testDeterministicPRNG() {
        GameMath.randomize(12345);
        int r1 = GameMath.random();
        int r2 = GameMath.random();
        int r3 = GameMath.random();

        // Re-seed with same seed to guarantee determinism
        GameMath.randomize(12345);
        assertEquals(r1, GameMath.random());
        assertEquals(r2, GameMath.random());
        assertEquals(r3, GameMath.random());

        // Range bounded random
        int bounded = GameMath.random(10, 20);
        assertTrue(bounded >= 10 && bounded < 20);
    }

    @Test
    public void testRotatePoint() {
        // Rotate (10, 0) around (0, 0) by 90 degrees -> should be approx (0, 10)
        GameMath.rotatePoint(10.0f, 0.0f, 0.0f, 0.0f, 90.0f);
        assertEquals(0.0f, GameMath.rotatedX, 0.001f);
        assertEquals(10.0f, GameMath.rotatedY, 0.001f);

        // Rotate (10, 0) around (0, 0) by 180 degrees -> should be approx (-10, 0)
        GameMath.rotatePoint(10.0f, 0.0f, 0.0f, 0.0f, 180.0f);
        assertEquals(-10.0f, GameMath.rotatedX, 0.001f);
        assertEquals(0.0f, GameMath.rotatedY, 0.001f);
    }

    @Test
    public void testEasingBoundaries() {
        // Easing curves should start around 0 at t=0 and reach ~1 at t=100
        assertEquals(0.0f, GameMath.easeQuadInTable[0], 0.0001f);
        assertEquals(1.0f, GameMath.easeQuadInTable[100], 0.0001f);

        assertEquals(0.0f, GameMath.easeCubicOutTable[0], 0.0001f);
        assertEquals(1.0f, GameMath.easeCubicOutTable[100], 0.0001f);

        assertEquals(0.0f, GameMath.easeBounceOutTable[0], 0.0001f);
        assertEquals(1.0f, GameMath.easeBounceOutTable[100], 0.0001f);
    }
}
