package android.support.v4.view;

import android.view.View;

/* JADX INFO: renamed from: android.support.v4.view.ag */
/* JADX INFO: loaded from: classes.dex */
class ViewOnClickListenerC0088ag implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ PagerTabStrip f350a;

    ViewOnClickListenerC0088ag(PagerTabStrip pagerTabStrip) {
        this.f350a = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f350a.f252a.setCurrentItem(this.f350a.f252a.getCurrentItem() + 1);
    }
}
