package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: android.support.v4.view.cg */
/* JADX INFO: loaded from: classes.dex */
class C0142cg implements Comparator {
    C0142cg() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(View view, View view2) {
        ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) view.getLayoutParams();
        ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams) view2.getLayoutParams();
        if (layoutParams.f324a != layoutParams2.f324a) {
            return layoutParams.f324a ? 1 : -1;
        }
        return layoutParams.f328e - layoutParams2.f328e;
    }
}
