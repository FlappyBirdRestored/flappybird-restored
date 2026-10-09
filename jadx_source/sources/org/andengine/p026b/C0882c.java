package org.andengine.p026b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: org.andengine.b.c */
/* JADX INFO: loaded from: classes.dex */
public class C0882c extends ReentrantLock {

    /* JADX INFO: renamed from: a */
    final Condition f2589a;

    /* JADX INFO: renamed from: b */
    final AtomicBoolean f2590b;

    public C0882c(boolean z) {
        super(z);
        this.f2589a = newCondition();
        this.f2590b = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    void m3642a() {
        this.f2590b.set(true);
        this.f2589a.signalAll();
    }

    /* JADX INFO: renamed from: b */
    void m3643b() {
        this.f2590b.set(false);
        this.f2589a.signalAll();
    }

    /* JADX INFO: renamed from: c */
    void m3644c() throws InterruptedException {
        while (!this.f2590b.get()) {
            this.f2589a.await();
        }
    }

    /* JADX INFO: renamed from: d */
    void m3645d() throws InterruptedException {
        while (this.f2590b.get()) {
            this.f2589a.await();
        }
    }
}
