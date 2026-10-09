package android.support.v4.view;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: android.support.v4.view.k */
/* JADX INFO: loaded from: classes.dex */
class C0150k {
    /* JADX INFO: renamed from: a */
    public static Object m594a(InterfaceC0152m interfaceC0152m) {
        return new C0151l(interfaceC0152m);
    }

    /* JADX INFO: renamed from: a */
    public static Object m595a(Object obj, View view) {
        return ((View.AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m596a(Object obj, View view, int i, Bundle bundle) {
        return ((View.AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }
}
