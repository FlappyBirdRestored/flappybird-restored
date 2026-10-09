package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.C0051a;
import android.support.v4.view.C0101at;
import android.support.v4.view.p002a.C0052a;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: android.support.v4.widget.t */
/* JADX INFO: loaded from: classes.dex */
class C0191t extends C0051a {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ SlidingPaneLayout f474b;

    /* JADX INFO: renamed from: c */
    private final Rect f475c = new Rect();

    C0191t(SlidingPaneLayout slidingPaneLayout) {
        this.f474b = slidingPaneLayout;
    }

    /* JADX INFO: renamed from: a */
    private void m794a(C0052a c0052a, C0052a c0052a2) {
        Rect rect = this.f475c;
        c0052a2.m307a(rect);
        c0052a.m313b(rect);
        c0052a2.m318c(rect);
        c0052a.m322d(rect);
        c0052a.m321c(c0052a2.m332h());
        c0052a.m309a(c0052a2.m341p());
        c0052a.m315b(c0052a2.m342q());
        c0052a.m320c(c0052a2.m344s());
        c0052a.m331h(c0052a2.m338m());
        c0052a.m327f(c0052a2.m336k());
        c0052a.m310a(c0052a2.m328f());
        c0052a.m316b(c0052a2.m330g());
        c0052a.m323d(c0052a2.m334i());
        c0052a.m325e(c0052a2.m335j());
        c0052a.m329g(c0052a2.m337l());
        c0052a.m306a(c0052a2.m311b());
        c0052a.m312b(c0052a2.m317c());
    }

    @Override // android.support.v4.view.C0051a
    /* JADX INFO: renamed from: a */
    public void mo295a(View view, C0052a c0052a) {
        C0052a c0052aM302a = C0052a.m302a(c0052a);
        super.mo295a(view, c0052aM302a);
        m794a(c0052a, c0052aM302a);
        c0052aM302a.m345t();
        c0052a.m315b(SlidingPaneLayout.class.getName());
        c0052a.m308a(view);
        Object objM514f = C0101at.m514f(view);
        if (objM514f instanceof View) {
            c0052a.m319c((View) objM514f);
        }
        int childCount = this.f474b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f474b.getChildAt(i);
            if (!m795b(childAt) && childAt.getVisibility() == 0) {
                C0101at.m510b(childAt, 1);
                c0052a.m314b(childAt);
            }
        }
    }

    @Override // android.support.v4.view.C0051a
    /* JADX INFO: renamed from: a */
    public boolean mo298a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (m795b(view)) {
            return false;
        }
        return super.mo298a(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public boolean m795b(View view) {
        return this.f474b.m676e(view);
    }

    @Override // android.support.v4.view.C0051a
    /* JADX INFO: renamed from: d */
    public void mo301d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo301d(view, accessibilityEvent);
        accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }
}
