package org.andengine.p033c;

import java.util.Comparator;
import java.util.List;
import org.andengine.p040d.p047b.p049b.C0934a;

/* JADX INFO: renamed from: org.andengine.c.d */
/* JADX INFO: loaded from: classes.dex */
public class C0911d extends C0934a {

    /* JADX INFO: renamed from: a */
    private static C0911d f2696a;

    /* JADX INFO: renamed from: b */
    private final Comparator f2697b = new C0915e(this);

    private C0911d() {
    }

    /* JADX INFO: renamed from: a */
    public static C0911d m3734a() {
        if (f2696a == null) {
            f2696a = new C0911d();
        }
        return f2696a;
    }

    /* JADX INFO: renamed from: a */
    public void m3735a(List list) {
        m3803a(list, this.f2697b);
    }
}
