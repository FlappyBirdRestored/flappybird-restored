package com.dotgears;

/**
 * AtlasItem - Reverse-engineered 1:1 recreation of com.dotgears.C0212i.
 * Represents a sprite region in the 1024x1024 texture atlas (atlas.png).
 */
public class AtlasItem {

    /** Global incremental item ID counter (decompiled from f626h). */
    public static int nextId = 0;

    /** Sprite identifier name (e.g. "bird0_0", "pipe_up", "bg_day") (f627a). */
    public String name;

    /** Sprite width in pixels (f628b). */
    public int width;

    /** Sprite height in pixels (f629c). */
    public int height;

    /** Starting normalized texture U coordinate [0.0..1.0] (f630d). */
    public float u1;

    /** Starting normalized texture V coordinate [0.0..1.0] (f631e). */
    public float v1;

    /**
     * Normalized texture width, later transformed to ending U coordinate (u1 + uWidth) (f632f).
     */
    public float u2;

    /**
     * Normalized texture height, later transformed to ending V coordinate (v1 + vHeight) (f633g).
     */
    public float v2;

    /** Sequential item index in atlas (f634i). */
    public int id;

    public AtlasItem(String name, int width, int height, float u1, float v1, float uWidth, float vHeight) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.u1 = u1;
        this.v1 = v1;
        this.u2 = uWidth;
        this.v2 = vHeight;
        this.id = nextId++;
    }

    /**
     * Resets the global ID counter. Useful for test isolation and re-loading atlas.
     */
    public static void resetIdCounter() {
        nextId = 0;
    }
}
