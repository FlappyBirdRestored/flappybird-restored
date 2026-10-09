package android.support.v4.view.p002a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.view.a.s */
/* JADX INFO: loaded from: classes.dex */
final class C0074s extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC0075t f344a;

    C0074s(InterfaceC0075t interfaceC0075t) {
        this.f344a = interfaceC0075t;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        return (AccessibilityNodeInfo) this.f344a.mo447a(i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i) {
        return this.f344a.mo448a(str, i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f344a.mo449a(i, i2, bundle);
    }
}
