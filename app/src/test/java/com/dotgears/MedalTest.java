package com.dotgears;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MedalTest {

    private static class RecordingEngine extends GameEngine {
        int drawCallCount = 0;
        int lastSpriteId = -1;
        int lastX = -1;
        int lastY = -1;
        float lastScaleX = 0f;
        float lastScaleY = 0f;
        float lastAlpha = 0f;

        List<int[]> spawnedSparkles = new ArrayList<>();

        @Override
        public void draw(int spriteId, int x, int y, float scaleX, float scaleY, float alpha) {
            this.drawCallCount++;
            this.lastSpriteId = spriteId;
            this.lastX = x;
            this.lastY = y;
            this.lastScaleX = scaleX;
            this.lastScaleY = scaleY;
            this.lastAlpha = alpha;
        }

        @Override
        public void spawnSparkle(int x, int y) {
            spawnedSparkles.add(new int[]{x, y});
            super.spawnSparkle(x, y);
        }
    }

    private RecordingEngine engine;
    private AtlasItem[] mockMedals;

    @Before
    public void setUp() {
        engine = new RecordingEngine();
        GameEngine.instance = engine;

        mockMedals = new AtlasItem[]{
                new AtlasItem("medals_0", 44, 44, 0f, 0f, 0.1f, 0.1f), // Bronze
                new AtlasItem("medals_1", 44, 44, 0f, 0.1f, 0.1f, 0.2f), // Silver
                new AtlasItem("medals_2", 44, 44, 0f, 0.2f, 0.1f, 0.3f), // Gold
                new AtlasItem("medals_3", 44, 44, 0f, 0.3f, 0.1f, 0.4f)  // Platinum
        };

        for (AtlasItem item : mockMedals) {
            engine.atlasItems[item.id] = item;
        }
    }

    @Test
    public void testMedalInitialState() {
        Medal medal = new Medal(mockMedals);
        assertEquals(44, medal.width);
        assertEquals(44, medal.height);
        assertEquals(30, medal.sparkleTimer);
        assertFalse(medal.active);
        assertFalse(medal.visible);
    }

    @Test
    public void testResetAndPosition() {
        Medal medal = new Medal(mockMedals);
        medal.reset(Medal.TYPE_GOLD);

        assertEquals(0, medal.x);
        assertEquals(0, medal.y);
        assertEquals(44, medal.width);
        assertEquals(44, medal.height);
        assertEquals(Medal.TYPE_GOLD, medal.medalType);
        assertEquals(30, medal.sparkleTimer);
        assertTrue(medal.active);
        assertTrue(medal.visible);

        medal.setPosition(100, 200);
        assertEquals(100, medal.x);
        assertEquals(200, medal.y);

        // Test set(type) alias
        medal.set(Medal.TYPE_PLATINUM);
        assertEquals(Medal.TYPE_PLATINUM, medal.medalType);
        assertEquals(30, medal.sparkleTimer);
    }

    @Test
    public void testSparkleTimerCountdownAndTrigger() {
        Medal medal = new Medal(mockMedals);
        medal.reset(Medal.TYPE_BRONZE);
        medal.setPosition(50, 100);

        // Frame 1 to 29: countdown without spawning sparkles
        for (int i = 0; i < 29; i++) {
            medal.update(0.016f);
            assertEquals(29 - i, medal.sparkleTimer);
            assertEquals(0, engine.spawnedSparkles.size());
        }

        // Frame 30: timer reaches 0, resets to 30, and spawns sparkle
        medal.update(0.016f);
        assertEquals(30, medal.sparkleTimer);
        assertEquals(1, engine.spawnedSparkles.size());

        int[] coords = engine.spawnedSparkles.get(0);
        int sx = coords[0];
        int sy = coords[1];

        // Bounds: (x - 3) to (x - 3 + 50 - 1) = [47 .. 96]
        assertTrue("Sparkle X should be within bounds: " + sx, sx >= 47 && sx <= 96);
        // Bounds: (y - 3) to (y - 3 + 50 - 1) = [97 .. 146]
        assertTrue("Sparkle Y should be within bounds: " + sy, sy >= 97 && sy <= 146);
    }

    @Test
    public void testNoSparklesWhenInactive() {
        Medal medal = new Medal(mockMedals);
        medal.active = false;
        medal.sparkleTimer = 5;

        medal.update(0.016f);
        assertEquals(5, medal.sparkleTimer);
        assertEquals(0, engine.spawnedSparkles.size());
    }

    @Test
    public void testRenderTiers() {
        Medal medal = new Medal(mockMedals);
        medal.reset(Medal.TYPE_SILVER);
        medal.setPosition(60, 120);

        // Render visible
        medal.render(engine);
        assertEquals(1, engine.drawCallCount);
        assertEquals(mockMedals[Medal.TYPE_SILVER].id, engine.lastSpriteId);
        assertEquals(60, engine.lastX);
        assertEquals(120, engine.lastY);

        // Render invisible
        medal.visible = false;
        medal.render(engine);
        assertEquals(1, engine.drawCallCount); // no new draw calls
    }
}
