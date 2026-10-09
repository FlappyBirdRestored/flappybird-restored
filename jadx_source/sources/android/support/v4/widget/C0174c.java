package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.C0051a;
import android.support.v4.view.C0101at;
import android.support.v4.view.p002a.C0052a;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: android.support.v4.widget.c */
/* JADX INFO: loaded from: classes.dex */
class C0174c extends C0051a {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ DrawerLayout f463b;

    /* JADX INFO: renamed from: c */
    private final Rect f464c = new Rect();

    C0174c(DrawerLayout drawerLayout) {
        this.f463b = drawerLayout;
    }

    /* JADX INFO: renamed from: a */
    private void m733a(C0052a c0052a, C0052a c0052a2) {
        Rect rect = this.f464c;
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
    }

    /* JADX INFO: renamed from: a */
    private void m734a(C0052a c0052a, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!m735b(childAt)) {
                switch (C0101at.m511c(childAt)) {
                    case C0467e.MapAttrs_mapType /* 0 */:
                        C0101at.m510b(childAt, 1);
                        break;
                    case C0467e.MapAttrs_cameraBearing /* 1 */:
                        break;
                    case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                        if (childAt instanceof ViewGroup) {
                            m734a(c0052a, (ViewGroup) childAt);
                        } else {
                            continue;
                        }
                        break;
                    case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    case C0467e.MapAttrs_cameraTilt /* 4 */:
                    default:
                        continue;
                }
                c0052a.m314b(childAt);
            }
        }
    }

    @Override // android.support.v4.view.C0051a
    /* JADX INFO: renamed from: a */
    public void mo295a(View view, C0052a c0052a) {
        C0052a c0052aM302a = C0052a.m302a(c0052a);
        super.mo295a(view, c0052aM302a);
        c0052a.m308a(view);
        Object objM514f = C0101at.m514f(view);
        if (objM514f instanceof View) {
            c0052a.m319c((View) objM514f);
        }
        m733a(c0052a, c0052aM302a);
        c0052aM302a.m345t();
        m734a(c0052a, (ViewGroup) view);
    }

    @Override // android.support.v4.view.C0051a
    /* JADX INFO: renamed from: a */
    public boolean mo298a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (m735b(view)) {
            return false;
        }
        return super.mo298a(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public boolean m735b(View view) {
        View viewM631a = this.f463b.m631a();
        return (viewM631a == null || viewM631a == view) ? false : true;
    }
}
