package android.support.v4.view.p002a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.view.a.v */
/* JADX INFO: loaded from: classes.dex */
final class C0077v extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC0078w f345a;

    C0077v(InterfaceC0078w interfaceC0078w) {
        this.f345a = interfaceC0078w;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        return (AccessibilityNodeInfo) this.f345a.mo450a(i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i) {
        return this.f345a.mo451a(str, i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i) {
        return (AccessibilityNodeInfo) this.f345a.mo453b(i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f345a.mo452a(i, i2, bundle);
    }
}
