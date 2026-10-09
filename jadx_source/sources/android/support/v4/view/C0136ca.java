package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p002a.C0052a;
import android.support.v4.view.p002a.C0079x;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: android.support.v4.view.ca */
/* JADX INFO: loaded from: classes.dex */
class C0136ca extends C0051a {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewPager f366b;

    C0136ca(ViewPager viewPager) {
        this.f366b = viewPager;
    }

    /* JADX INFO: renamed from: b */
    private boolean m569b() {
        return this.f366b.f305h != null && this.f366b.f305h.m471a() > 1;
    }

    @Override // android.support.v4.view.C0051a
    /* JADX INFO: renamed from: a */
    public void mo295a(View view, C0052a c0052a) {
        super.mo295a(view, c0052a);
        c0052a.m315b(ViewPager.class.getName());
        c0052a.m333i(m569b());
        if (this.f366b.canScrollHorizontally(1)) {
            c0052a.m306a(4096);
        }
        if (this.f366b.canScrollHorizontally(-1)) {
            c0052a.m306a(8192);
        }
    }

    @Override // android.support.v4.view.C0051a
    /* JADX INFO: renamed from: a */
    public boolean mo297a(View view, int i, Bundle bundle) {
        if (super.mo297a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.f366b.canScrollHorizontally(1)) {
                    return false;
                }
                this.f366b.setCurrentItem(this.f366b.f306i + 1);
                return true;
            case 8192:
                if (!this.f366b.canScrollHorizontally(-1)) {
                    return false;
                }
                this.f366b.setCurrentItem(this.f366b.f306i - 1);
                return true;
            default:
                return false;
        }
    }

    @Override // android.support.v4.view.C0051a
    /* JADX INFO: renamed from: d */
    public void mo301d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo301d(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        C0079x c0079xM456a = C0079x.m456a();
        c0079xM456a.m458a(m569b());
        if (accessibilityEvent.getEventType() != 4096 || this.f366b.f305h == null) {
            return;
        }
        c0079xM456a.m457a(this.f366b.f305h.m471a());
        c0079xM456a.m459b(this.f366b.f306i);
        c0079xM456a.m460c(this.f366b.f306i);
    }
}
