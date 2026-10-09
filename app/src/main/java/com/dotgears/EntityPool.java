package com.dotgears;

/**
 * EntityPool - Reverse-engineered 1:1 recreation of com.dotgears.C0217n.
 * Pre-allocated array-backed object pool enabling zero-allocation recycling
 * of particles (e.g. Sparkles, ScoreParticles) and batch update/render cycles.
 */
public class EntityPool extends GameObject {

    /** Pre-allocated array storing up to 30 pooled game objects (decompiled from f675a). */
    public GameObject[] pool = new GameObject[30];

    /** Index pointer to the next entity to acquire in circular order (decompiled from f676b). */
    int head;

    /** Total number of registered entities in the pool (decompiled from f677c). */
    int count;

    public EntityPool() {
        this.head = 0;
        this.count = 0;
    }

    /**
     * Returns the number of registered objects in this pool.
     * Decompiled from: C0217n.m915a
     */
    public int size() {
        return this.count;
    }

    @Override
    public void update(float dt) {
        for (int i = 0; i < size(); i++) {
            this.pool[i].update(dt);
        }
    }

    @Override
    public void render(GameEngine engine) {
        for (int i = 0; i < size(); i++) {
            this.pool[i].render(engine);
        }
    }

    /**
     * Registers a new GameObject into the pool during initialization.
     * Decompiled from: C0217n.m916a
     */
    public void add(GameObject obj) {
        this.pool[this.count] = obj;
        this.head = 0;
        this.count++;
    }

    /**
     * Deactivates all entities in the pool (active = false, visible = false)
     * and resets the head pointer to 0.
     * Decompiled from: C0217n.m917b
     */
    public void reset() {
        for (int i = 0; i < size(); i++) {
            this.pool[i].active = false;
            this.pool[i].visible = false;
        }
        this.head = 0;
    }

    /**
     * Acquires the next pooled entity in round-robin sequence.
     * Decompiled from: C0217n.m918c
     */
    public GameObject acquireNext() {
        GameObject obj = this.pool[this.head];
        this.head++;
        if (this.head == size()) {
            this.head = 0;
        }
        return obj;
    }
}
