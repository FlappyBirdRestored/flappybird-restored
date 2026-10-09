package com.google.ads.util;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.util.aa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0353aa {

    /* JADX INFO: renamed from: a */
    private static final Object f1352a = new Object();

    /* JADX INFO: renamed from: b */
    private static int f1353b = 0;

    /* JADX INFO: renamed from: c */
    private static HashMap f1354c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final ArrayList f1355d = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final int f1356u;

    public AbstractC0353aa() {
        synchronized (f1352a) {
            int i = f1353b;
            f1353b = i + 1;
            this.f1356u = i;
            Integer num = (Integer) f1354c.get(getClass());
            if (num == null) {
                f1354c.put(getClass(), 1);
            } else {
                f1354c.put(getClass(), Integer.valueOf(num.intValue() + 1));
            }
        }
        C0364g.m1399d("State created: " + toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m1377a(AbstractC0355ac abstractC0355ac) {
        this.f1355d.add(abstractC0355ac);
    }

    protected void finalize() throws Throwable {
        synchronized (f1352a) {
            f1354c.put(getClass(), Integer.valueOf(((Integer) f1354c.get(getClass())).intValue() - 1));
        }
        super.finalize();
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this.f1356u + "]";
    }
}
