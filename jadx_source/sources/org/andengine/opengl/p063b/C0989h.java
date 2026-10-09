package org.andengine.opengl.p063b;

import java.util.ArrayList;
import org.andengine.p040d.p052e.C0941a;

/* JADX INFO: renamed from: org.andengine.opengl.b.h */
/* JADX INFO: loaded from: classes.dex */
public class C0989h {

    /* JADX INFO: renamed from: a */
    private final ArrayList f2882a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public synchronized void m3916a() {
        m3917a(C0981b.m3903a());
        m3917a(C0985d.m3906a());
        m3917a(C0987f.m3908a());
        m3917a(C0977a.m3899a());
        m3917a(C0986e.m3907a());
        m3917a(C0984c.m3905a());
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m3917a(C0988g c0988g) {
        try {
            if (c0988g == null) {
                throw new IllegalArgumentException("pShaderProgram must not be null!");
            }
            if (c0988g.m3914b()) {
                C0941a.m3828c("Loading an already compiled " + C0988g.class.getSimpleName() + ": '" + c0988g.getClass().getSimpleName() + "'. '" + c0988g.getClass().getSimpleName() + "' will be recompiled.");
                c0988g.m3913a(false);
            }
            if (this.f2882a.contains(c0988g)) {
                C0941a.m3828c("Loading an already loaded " + C0988g.class.getSimpleName() + ": '" + c0988g.getClass().getSimpleName() + "'.");
            } else {
                this.f2882a.add(c0988g);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m3918b() {
        ArrayList arrayList = this.f2882a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C0988g) arrayList.get(size)).m3913a(false);
        }
        this.f2882a.clear();
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m3919c() {
        ArrayList arrayList = this.f2882a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C0988g) arrayList.get(size)).m3913a(false);
        }
    }
}
