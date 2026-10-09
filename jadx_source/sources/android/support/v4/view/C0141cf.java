package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.p000a.InterfaceC0002c;

/* JADX INFO: renamed from: android.support.v4.view.cf */
/* JADX INFO: loaded from: classes.dex */
final class C0141cf implements InterfaceC0002c {
    C0141cf() {
    }

    @Override // android.support.v4.p000a.InterfaceC0002c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ViewPager.SavedState mo1a(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager.SavedState(parcel, classLoader);
    }

    @Override // android.support.v4.p000a.InterfaceC0002c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ViewPager.SavedState[] mo2a(int i) {
        return new ViewPager.SavedState[i];
    }
}
