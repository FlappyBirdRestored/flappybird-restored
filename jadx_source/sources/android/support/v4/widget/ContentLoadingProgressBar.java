package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: a */
    private long f375a;

    /* JADX INFO: renamed from: b */
    private boolean f376b;

    /* JADX INFO: renamed from: c */
    private boolean f377c;

    /* JADX INFO: renamed from: d */
    private boolean f378d;

    /* JADX INFO: renamed from: e */
    private final Runnable f379e;

    /* JADX INFO: renamed from: f */
    private final Runnable f380f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f375a = -1L;
        this.f376b = false;
        this.f377c = false;
        this.f378d = false;
        this.f379e = new RunnableC0166a(this);
        this.f380f = new RunnableC0173b(this);
    }

    /* JADX INFO: renamed from: a */
    private void m620a() {
        removeCallbacks(this.f379e);
        removeCallbacks(this.f380f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m620a();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m620a();
    }
}
