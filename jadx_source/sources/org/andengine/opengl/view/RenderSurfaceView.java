package org.andengine.opengl.view;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import org.andengine.p026b.ViewOnTouchListenerC0873a;

/* JADX INFO: loaded from: classes.dex */
public class RenderSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: a */
    private C1032g f3018a;

    /* JADX INFO: renamed from: b */
    private C1026a f3019b;

    public RenderSurfaceView(Context context) {
        super(context);
        setEGLContextClientVersion(2);
    }

    public RenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEGLContextClientVersion(2);
    }

    /* JADX INFO: renamed from: a */
    public void m4059a(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m4060a(ViewOnTouchListenerC0873a viewOnTouchListenerC0873a, InterfaceC1033h interfaceC1033h) {
        if (this.f3019b == null) {
            this.f3019b = new C1026a(viewOnTouchListenerC0873a.m3598d().m3658e().m3670a());
        }
        setEGLConfigChooser(this.f3019b);
        setOnTouchListener(viewOnTouchListenerC0873a);
        this.f3018a = new C1032g(viewOnTouchListenerC0873a, this.f3019b, interfaceC1033h);
        setRenderer(this.f3018a);
    }

    public C1026a getConfigChooser() {
        if (this.f3019b == null) {
            throw new IllegalStateException(String.valueOf(C1026a.class.getSimpleName()) + " not yet set.");
        }
        return this.f3019b;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            super.onMeasure(i, i2);
        } else {
            this.f3018a.f3038a.m3598d().m3661h().mo3652a(this, i, i2);
        }
    }
}
