package android.support.v4.view.p002a;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: android.support.v4.view.a.h */
/* JADX INFO: loaded from: classes.dex */
class C0063h {
    /* JADX INFO: renamed from: a */
    public static Object m399a(Object obj) {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo) obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m400a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    /* JADX INFO: renamed from: a */
    public static void m401a(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: a */
    public static void m402a(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).addChild(view);
    }

    /* JADX INFO: renamed from: a */
    public static void m403a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    /* JADX INFO: renamed from: a */
    public static void m404a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setClickable(z);
    }

    /* JADX INFO: renamed from: b */
    public static int m405b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    /* JADX INFO: renamed from: b */
    public static void m406b(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: b */
    public static void m407b(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setParent(view);
    }

    /* JADX INFO: renamed from: b */
    public static void m408b(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: b */
    public static void m409b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEnabled(z);
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m410c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    /* JADX INFO: renamed from: c */
    public static void m411c(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: c */
    public static void m412c(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setSource(view);
    }

    /* JADX INFO: renamed from: c */
    public static void m413c(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setPackageName(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static void m414c(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocusable(z);
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m415d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    /* JADX INFO: renamed from: d */
    public static void m416d(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: d */
    public static void m417d(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocused(z);
    }

    /* JADX INFO: renamed from: e */
    public static CharSequence m418e(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    /* JADX INFO: renamed from: e */
    public static void m419e(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setLongClickable(z);
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m420f(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }

    /* JADX INFO: renamed from: f */
    public static void m421f(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }

    /* JADX INFO: renamed from: g */
    public static void m422g(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setSelected(z);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m423g(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m424h(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m425i(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m426j(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m427k(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m428l(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m429m(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m430n(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m431o(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m432p(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    /* JADX INFO: renamed from: q */
    public static void m433q(Object obj) {
        ((AccessibilityNodeInfo) obj).recycle();
    }
}
