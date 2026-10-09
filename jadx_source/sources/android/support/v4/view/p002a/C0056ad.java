package android.support.v4.view.p002a;

import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: renamed from: android.support.v4.view.a.ad */
/* JADX INFO: loaded from: classes.dex */
class C0056ad {
    /* JADX INFO: renamed from: a */
    public static Object m352a() {
        return AccessibilityRecord.obtain();
    }

    /* JADX INFO: renamed from: a */
    public static void m353a(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    /* JADX INFO: renamed from: a */
    public static void m354a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    /* JADX INFO: renamed from: b */
    public static void m355b(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    /* JADX INFO: renamed from: c */
    public static void m356c(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }
}
