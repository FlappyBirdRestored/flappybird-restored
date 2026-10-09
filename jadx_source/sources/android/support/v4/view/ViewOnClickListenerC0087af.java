package android.support.v4.view;

import android.view.View;

/* JADX INFO: renamed from: android.support.v4.view.af */
/* JADX INFO: loaded from: classes.dex */
class ViewOnClickListenerC0087af implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ PagerTabStrip f349a;

    ViewOnClickListenerC0087af(PagerTabStrip pagerTabStrip) {
        this.f349a = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f349a.f252a.setCurrentItem(this.f349a.f252a.getCurrentItem() - 1);
    }
}
