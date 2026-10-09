package com.google.android.gms.internal;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.cn */
/* JADX INFO: loaded from: classes.dex */
public final class C0560cn {
    /* JADX INFO: renamed from: a */
    public static void m2606a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2607a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            Log.e("Asserts", "checkMainThread: current thread " + Thread.currentThread() + " IS NOT the main thread " + Looper.getMainLooper().getThread() + "!");
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2608a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2609b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Log.e("Asserts", "checkNotMainThread: current thread " + Thread.currentThread() + " IS the main thread " + Looper.getMainLooper().getThread() + "!");
            throw new IllegalStateException(str);
        }
    }
}
