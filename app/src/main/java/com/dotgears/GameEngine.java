package com.dotgears;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * GameEngine - Reverse-engineered 1:1 recreation of com.dotgears.C0210g.
 * Core engine handling sprite atlas lookup, touch dispatch, and sprite draw queue.
 */
public class GameEngine extends GameObject {

    /** Global engine singleton instance (decompiled from f583D). */
    public static GameEngine instance;

    /** Pre-allocated array of up to 512 AtlasItems loaded from atlas.txt (f588a). */
    public AtlasItem[] atlasItems = new AtlasItem[512];

    /** Number of active touch points (decompiled from f608u). */
    public int touchCount = 0;

    /** Touch X coordinate buffer for up to 10 points (decompiled from f606s). */
    public int[] touchX = new int[10];

    /** Touch Y coordinate buffer for up to 10 points (decompiled from f607t). */
    public int[] touchY = new int[10];

    /** Pre-allocated pool of 10 Sparkle objects for medal glints (decompiled from f601n). */
    public EntityPool sparkles = new EntityPool();

    public GameEngine() {
        instance = this;
        for (int i = 0; i < 10; i++) {
            this.sparkles.add(new Sparkle());
        }
    }

    /**
     * Spawns a sparkle particle at (x, y).
     * Decompiled from: C0210g.m857b(int, int)
     */
    public void spawnSparkle(int x, int y) {
        if (this.sparkles != null && this.sparkles.size() > 0) {
            Sparkle sparkle = (Sparkle) this.sparkles.acquireNext();
            if (sparkle != null) {
                sparkle.reset(x, y);
            }
        }
    }

    /** Alias for spawnSparkle to match C0210g.m857b. */
    public void addSparkle(int x, int y) {
        spawnSparkle(x, y);
    }

    /**
     * Loads and parses the sprite atlas definitions from atlas.txt.
     */
    public void loadAtlas(InputStream inputStream) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().length() > 1) {
                    String[] parts = line.trim().split("\\s+");
                    AtlasItem item = new AtlasItem(
                            parts[0],
                            Integer.parseInt(parts[1]),
                            Integer.parseInt(parts[2]),
                            Float.parseFloat(parts[3]),
                            Float.parseFloat(parts[4]),
                            Float.parseFloat(parts[5]),
                            Float.parseFloat(parts[6])
                    );
                    // End coordinate calculation from C0210g lines 118-119:
                    item.u2 = item.u1 + item.u2;
                    item.v2 = item.v1 + item.v2;
                    if (item.id < this.atlasItems.length) {
                        this.atlasItems[item.id] = item;
                    }
                    Log.i("FlappyBird", item.name + " " + item.width + " " + item.height + " " + item.u1 + " " + item.v1 + " " + item.u2 + " " + item.v2);
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns an array of AtlasItems whose names start with the given prefix.
     * Decompiled from: C0210g.m854a(String)
     */
    public AtlasItem[] getItems(String prefix) {
        int count = 0;
        for (int i = 0; i < 512; i++) {
            if (this.atlasItems[i] != null && this.atlasItems[i].name.startsWith(prefix)) {
                count++;
            }
        }
        if (count <= 0) {
            return null;
        }
        AtlasItem[] result = new AtlasItem[count];
        int index = 0;
        for (int i = 0; i < 512; i++) {
            if (this.atlasItems[i] != null && this.atlasItems[i].name.startsWith(prefix)) {
                result[index] = this.atlasItems[i];
                index++;
            }
        }
        return result;
    }

    /**
     * Finds the first AtlasItem whose name starts with the given prefix.
     * Decompiled from: C0210g.m855b(String)
     */
    public AtlasItem getItem(String prefix) {
        for (int i = 0; i < 512; i++) {
            if (this.atlasItems[i] != null && this.atlasItems[i].name.startsWith(prefix)) {
                return this.atlasItems[i];
            }
        }
        return null;
    }

    /**
     * Draw sprite by ID with scaling and alpha.
     * Decompiled from: C0210g.m845a
     */
    public void draw(int spriteId, int x, int y, float scaleX, float scaleY, float alpha) {
        AtlasItem item = this.atlasItems[spriteId];
        if (item != null) {
            draw(x, y, (int) (x + (item.width * scaleX)), (int) (y + (item.height * scaleY)),
                    item.u1, item.v1, item.u2, item.v2, alpha);
        }
    }

    /**
     * Draw sprite item directly at (x, y) with alpha.
     * Decompiled from: C0210g.m850a
     */
    public void draw(AtlasItem item, int x, int y, float alpha) {
        if (item != null) {
            draw(x, y, x + item.width, y + item.height, item.u1, item.v1, item.u2, item.v2, alpha);
        }
    }

    /**
     * Draw sprite item directly at (x, y) with alpha and rotation angle.
     * Decompiled from: C0210g.m851a
     */
    public void draw(AtlasItem item, int x, int y, float alpha, int angle) {
        if (item != null) {
            draw(x, y, x + item.width, y + item.height, item.u1, item.v1, item.u2, item.v2, alpha, angle);
        }
    }

    /**
     * Primitive draw quad with texture UV and alpha.
     * Decompiled from: C0210g.m846a
     */
    public void draw(int x1, int y1, int x2, int y2, float u1, float v1, float u2, float v2, float alpha) {
        // Will be routed to the GLRenderer in Phase 6
    }

    /**
     * Primitive draw quad with texture UV, alpha, and rotation angle.
     * Decompiled from: C0210g.m847a
     */
    public void draw(int x1, int y1, int x2, int y2, float u1, float v1, float u2, float v2, float alpha, int angle) {
        // Will be routed to the GLRenderer in Phase 6
    }
}
