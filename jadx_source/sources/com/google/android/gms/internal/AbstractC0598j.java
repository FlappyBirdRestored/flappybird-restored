package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0598j implements SafeParcelable {

    /* JADX INFO: renamed from: a */
    private static final Object f2072a = new Object();

    /* JADX INFO: renamed from: b */
    private static ClassLoader f2073b = null;

    /* JADX INFO: renamed from: c */
    private static Integer f2074c = null;

    /* JADX INFO: renamed from: d */
    private boolean f2075d = false;

    /* JADX INFO: renamed from: a */
    private static boolean m2737a(Class cls) {
        try {
            return SafeParcelable.NULL.equals(cls.getField("NULL").get(null));
        } catch (IllegalAccessException e) {
            return false;
        } catch (NoSuchFieldException e2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    protected static boolean m2738b(String str) {
        ClassLoader classLoaderM2739t = m2739t();
        if (classLoaderM2739t == null) {
            return true;
        }
        try {
            return m2737a(classLoaderM2739t.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: t */
    protected static ClassLoader m2739t() {
        ClassLoader classLoader;
        synchronized (f2072a) {
            classLoader = f2073b;
        }
        return classLoader;
    }

    /* JADX INFO: renamed from: u */
    protected static Integer m2740u() {
        Integer num;
        synchronized (f2072a) {
            num = f2074c;
        }
        return num;
    }

    /* JADX INFO: renamed from: v */
    protected boolean m2741v() {
        return this.f2075d;
    }
}
