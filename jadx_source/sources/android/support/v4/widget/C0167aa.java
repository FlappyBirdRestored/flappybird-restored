package android.support.v4.widget;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: android.support.v4.widget.aa */
/* JADX INFO: loaded from: classes.dex */
class C0167aa extends C0197z {

    /* JADX INFO: renamed from: a */
    private Method f436a;

    /* JADX INFO: renamed from: b */
    private Field f437b;

    C0167aa() {
        try {
            this.f436a = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
        } catch (NoSuchMethodException e) {
            Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
        }
        try {
            this.f437b = View.class.getDeclaredField("mRecreateDisplayList");
            this.f437b.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
        }
    }

    @Override // android.support.v4.widget.C0197z, android.support.v4.widget.InterfaceC0196y
    /* JADX INFO: renamed from: a */
    public void mo677a(SlidingPaneLayout slidingPaneLayout, View view) {
        if (this.f436a == null || this.f437b == null) {
            view.invalidate();
            return;
        }
        try {
            this.f437b.setBoolean(view, true);
            this.f436a.invoke(view, (Object[]) null);
        } catch (Exception e) {
            Log.e("SlidingPaneLayout", "Error refreshing display list state", e);
        }
        super.mo677a(slidingPaneLayout, view);
    }
}
