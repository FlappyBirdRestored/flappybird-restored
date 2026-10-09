package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;

/* JADX INFO: renamed from: android.support.v4.widget.h */
/* JADX INFO: loaded from: classes.dex */
public class C0179h {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0182k f470b;

    /* JADX INFO: renamed from: a */
    private Object f471a;

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f470b = new C0181j();
        } else {
            f470b = new C0180i();
        }
    }

    public C0179h(Context context) {
        this.f471a = f470b.mo753a(context);
    }

    /* JADX INFO: renamed from: a */
    public void m747a(int i, int i2) {
        f470b.mo754a(this.f471a, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m748a() {
        return f470b.mo755a(this.f471a);
    }

    /* JADX INFO: renamed from: a */
    public boolean m749a(float f) {
        return f470b.mo756a(this.f471a, f);
    }

    /* JADX INFO: renamed from: a */
    public boolean m750a(Canvas canvas) {
        return f470b.mo757a(this.f471a, canvas);
    }

    /* JADX INFO: renamed from: b */
    public void m751b() {
        f470b.mo758b(this.f471a);
    }

    /* JADX INFO: renamed from: c */
    public boolean m752c() {
        return f470b.mo759c(this.f471a);
    }
}
