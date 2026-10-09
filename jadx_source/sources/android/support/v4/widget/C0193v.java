package android.support.v4.widget;

import android.view.View;

/* JADX INFO: renamed from: android.support.v4.widget.v */
/* JADX INFO: loaded from: classes.dex */
class C0193v extends AbstractC0172af {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ SlidingPaneLayout f478a;

    private C0193v(SlidingPaneLayout slidingPaneLayout) {
        this.f478a = slidingPaneLayout;
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public int mo720a(View view) {
        return this.f478a.f418j;
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public int mo721a(View view, int i, int i2) {
        SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) this.f478a.f415g.getLayoutParams();
        int paddingLeft = layoutParams.leftMargin + this.f478a.getPaddingLeft();
        return Math.min(Math.max(i, paddingLeft), this.f478a.f418j + paddingLeft);
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public void mo722a(int i) {
        if (this.f478a.f424p.m698a() == 0) {
            if (this.f478a.f416h != 0.0f) {
                this.f478a.m669b(this.f478a.f415g);
                this.f478a.f425q = true;
            } else {
                this.f478a.m673d(this.f478a.f415g);
                this.f478a.m671c(this.f478a.f415g);
                this.f478a.f425q = false;
            }
        }
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public void mo724a(View view, float f, float f2) {
        SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        int paddingLeft = layoutParams.leftMargin + this.f478a.getPaddingLeft();
        if (f > 0.0f || (f == 0.0f && this.f478a.f416h > 0.5f)) {
            paddingLeft += this.f478a.f418j;
        }
        this.f478a.f424p.m702a(paddingLeft, view.getTop());
        this.f478a.invalidate();
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public void mo725a(View view, int i, int i2, int i3, int i4) {
        this.f478a.m651a(i);
        this.f478a.invalidate();
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: a */
    public boolean mo726a(View view, int i) {
        if (this.f478a.f419k) {
            return false;
        }
        return ((SlidingPaneLayout.LayoutParams) view.getLayoutParams()).f431b;
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: b */
    public void mo729b(int i, int i2) {
        this.f478a.f424p.m701a(this.f478a.f415g, i2);
    }

    @Override // android.support.v4.widget.AbstractC0172af
    /* JADX INFO: renamed from: b */
    public void mo730b(View view, int i) {
        this.f478a.m666a();
    }
}
