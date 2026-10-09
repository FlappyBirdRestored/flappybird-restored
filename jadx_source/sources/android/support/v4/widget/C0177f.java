package android.support.v4.widget;

import android.view.View;

/* JADX INFO: renamed from: android.support.v4.widget.f */
/* JADX INFO: loaded from: classes.dex */
class C0177f extends AbstractC0172af {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DrawerLayout f465a;

    /* JADX INFO: renamed from: b */
    private final int f466b;

    /* JADX INFO: renamed from: c */
    private C0169ac f467c;

    /* JADX INFO: renamed from: d */
    private final Runnable f468d = new RunnableC0178g(this);

    public C0177f(DrawerLayout drawerLayout, int i) {
        this.f465a = drawerLayout;
        this.f466b = i;
    }

    /* JADX INFO: renamed from: b */
    private void m743b() {
        View viewM632a = this.f465a.m632a(this.f466b == 3 ? 5 : 3);
        if (viewM632a != null) {
            this.f465a.m648i(viewM632a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m744c() {
        View view;
        int i;
        int iM706b = this.f467c.m706b();
        boolean z = this.f466b == 3;
        if (z) {
            View viewM632a = this.f465a.m632a(3);
            int i2 = (viewM632a != null ? -viewM632a.getWidth() : 0) + iM706b;
            view = viewM632a;
            i = i2;
        } else {
            View viewM632a2 = this.f465a.m632a(5);
            int width = this.f465a.getWidth() - iM706b;
            view = viewM632a2;
            i = width;
        }
        if (view != null) {
            if (((!z || view.getLeft() >= i) && (z || view.getLeft() <= i)) || this.f465a.m630a(view) != 0) {
                return;
            }
            DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams) view.getLayoutParams();
            this.f467c.m704a(view, i, view.getTop());
            layoutParams.f404c = true;
            this.f465a.invalidate();
            m743b();
            this.f465a.m641c();
        }
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public int mo720a(View view) {
        return view.getWidth();
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public int mo721a(View view, int i, int i2) {
        if (this.f465a.m637a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.f465a.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    /* JADX INFO: renamed from: a */
    public void m745a() {
        this.f465a.removeCallbacks(this.f468d);
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public void mo722a(int i) {
        this.f465a.m634a(this.f466b, i, this.f467c.m712c());
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public void mo723a(int i, int i2) {
        this.f465a.postDelayed(this.f468d, 160L);
    }

    /* JADX INFO: renamed from: a */
    public void m746a(C0169ac c0169ac) {
        this.f467c = c0169ac;
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public void mo724a(View view, float f, float f2) {
        int width;
        float fM643d = this.f465a.m643d(view);
        int width2 = view.getWidth();
        if (this.f465a.m637a(view, 3)) {
            width = (f > 0.0f || (f == 0.0f && fM643d > 0.5f)) ? 0 : -width2;
        } else {
            width = this.f465a.getWidth();
            if (f < 0.0f || (f == 0.0f && fM643d > 0.5f)) {
                width -= width2;
            }
        }
        this.f467c.m702a(width, view.getTop());
        this.f465a.invalidate();
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public void mo725a(View view, int i, int i2, int i3, int i4) {
        int width = view.getWidth();
        float width2 = this.f465a.m637a(view, 3) ? (width + i) / width : (this.f465a.getWidth() - i) / width;
        this.f465a.m640b(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        this.f465a.invalidate();
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public boolean mo726a(View view, int i) {
        return this.f465a.m646g(view) && this.f465a.m637a(view, this.f466b) && this.f465a.m630a(view) == 0;
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: b */
    public int mo728b(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: b */
    public void mo729b(int i, int i2) {
        View viewM632a = (i & 1) == 1 ? this.f465a.m632a(3) : this.f465a.m632a(5);
        if (viewM632a == null || this.f465a.m630a(viewM632a) != 0) {
            return;
        }
        this.f467c.m701a(viewM632a, i2);
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: b */
    public void mo730b(View view, int i) {
        ((DrawerLayout.LayoutParams) view.getLayoutParams()).f404c = false;
        m743b();
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: b */
    public boolean mo731b(int i) {
        return false;
    }
}
