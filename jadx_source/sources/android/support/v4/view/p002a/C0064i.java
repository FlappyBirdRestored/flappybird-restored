package android.support.v4.view.p002a;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: android.support.v4.view.a.i */
/* JADX INFO: loaded from: classes.dex */
class C0064i {
    /* JADX INFO: renamed from: a */
    public static void m434a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).setMovementGranularities(i);
    }

    /* JADX INFO: renamed from: a */
    public static void m435a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setVisibleToUser(z);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m436a(Object obj) {
        return ((AccessibilityNodeInfo) obj).isVisibleToUser();
    }

    /* JADX INFO: renamed from: b */
    public static int m437b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getMovementGranularities();
    }

    /* JADX INFO: renamed from: b */
    public static void m438b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setAccessibilityFocused(z);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m439c(Object obj) {
        return ((AccessibilityNodeInfo) obj).isAccessibilityFocused();
    }
}
