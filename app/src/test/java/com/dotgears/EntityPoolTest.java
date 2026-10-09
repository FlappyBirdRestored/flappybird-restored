package com.dotgears;

import org.junit.Test;

import static org.junit.Assert.*;

public class EntityPoolTest {

    static class DummyEntity extends GameObject {
        int updateCount = 0;
        int renderCount = 0;

        @Override
        public void update(float dt) {
            updateCount++;
        }

        @Override
        public void render(GameEngine engine) {
            renderCount++;
        }
    }

    @Test
    public void testPoolAddAndSize() {
        EntityPool pool = new EntityPool();
        assertEquals(0, pool.size());

        DummyEntity e1 = new DummyEntity();
        DummyEntity e2 = new DummyEntity();

        pool.add(e1);
        assertEquals(1, pool.size());

        pool.add(e2);
        assertEquals(2, pool.size());
    }

    @Test
    public void testAcquireNextCyclesRoundRobin() {
        EntityPool pool = new EntityPool();
        DummyEntity e1 = new DummyEntity();
        DummyEntity e2 = new DummyEntity();
        DummyEntity e3 = new DummyEntity();

        pool.add(e1);
        pool.add(e2);
        pool.add(e3);

        // Cycle 1
        assertSame(e1, pool.acquireNext());
        assertSame(e2, pool.acquireNext());
        assertSame(e3, pool.acquireNext());

        // Cycle 2 (wraps back to beginning)
        assertSame(e1, pool.acquireNext());
        assertSame(e2, pool.acquireNext());
        assertSame(e3, pool.acquireNext());
    }

    @Test
    public void testResetClearsFlagsAndHead() {
        EntityPool pool = new EntityPool();
        DummyEntity e1 = new DummyEntity();
        DummyEntity e2 = new DummyEntity();

        e1.active = true;
        e1.visible = true;
        e2.active = true;
        e2.visible = true;

        pool.add(e1);
        pool.add(e2);

        // Advance head
        pool.acquireNext(); // returns e1, head is now 1

        pool.reset();

        assertFalse(e1.active);
        assertFalse(e1.visible);
        assertFalse(e2.active);
        assertFalse(e2.visible);

        // Next acquire after reset must start at e1 again
        assertSame(e1, pool.acquireNext());
    }

    @Test
    public void testBatchUpdateAndRender() {
        EntityPool pool = new EntityPool();
        DummyEntity e1 = new DummyEntity();
        DummyEntity e2 = new DummyEntity();

        pool.add(e1);
        pool.add(e2);

        pool.update(0.016f);
        assertEquals(1, e1.updateCount);
        assertEquals(1, e2.updateCount);

        pool.render(null);
        assertEquals(1, e1.renderCount);
        assertEquals(1, e2.renderCount);
    }
}
