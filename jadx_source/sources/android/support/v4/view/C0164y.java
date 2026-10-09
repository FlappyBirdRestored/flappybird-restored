package android.support.v4.view;

import android.view.KeyEvent;

/* JADX INFO: renamed from: android.support.v4.view.y */
/* JADX INFO: loaded from: classes.dex */
class C0164y {
    /* JADX INFO: renamed from: a */
    public static int m609a(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m610a(int i, int i2) {
        return KeyEvent.metaStateHasModifiers(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m611b(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
