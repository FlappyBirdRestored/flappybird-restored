package org.andengine.p075ui.activity;

import android.os.Bundle;
import android.os.PowerManager;
import android.widget.FrameLayout;
import com.google.android.gms.C0467e;
import org.andengine.opengl.p066c.C1008e;
import org.andengine.opengl.util.C1024e;
import org.andengine.opengl.view.InterfaceC1033h;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.p021a.p023b.C0865b;
import org.andengine.p021a.p024c.C0871c;
import org.andengine.p026b.ViewOnTouchListenerC0873a;
import org.andengine.p026b.p031c.C0887b;
import org.andengine.p026b.p031c.EnumC0890e;
import org.andengine.p026b.p031c.EnumC0893h;
import org.andengine.p040d.C0916a;
import org.andengine.p040d.p052e.C0941a;
import org.andengine.p040d.p056i.C0949a;
import org.andengine.p075ui.InterfaceC1034a;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGameActivity extends BaseActivity implements InterfaceC1033h, InterfaceC1034a {

    /* JADX INFO: renamed from: f */
    private static /* synthetic */ int[] f3043f;

    /* JADX INFO: renamed from: a */
    private PowerManager.WakeLock f3044a;

    /* JADX INFO: renamed from: b */
    private boolean f3045b;

    /* JADX INFO: renamed from: c */
    private boolean f3046c;

    /* JADX INFO: renamed from: d */
    private boolean f3047d;

    /* JADX INFO: renamed from: e */
    private boolean f3048e;

    /* JADX INFO: renamed from: k */
    protected ViewOnTouchListenerC0873a f3049k;

    /* JADX INFO: renamed from: l */
    protected RenderSurfaceView f3050l;

    /* JADX INFO: renamed from: B */
    protected static FrameLayout.LayoutParams m4079B() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* JADX INFO: renamed from: C */
    static /* synthetic */ int[] m4080C() {
        int[] iArr = f3043f;
        if (iArr == null) {
            iArr = new int[EnumC0890e.valuesCustom().length];
            try {
                iArr[EnumC0890e.LANDSCAPE_FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC0890e.LANDSCAPE_SENSOR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC0890e.PORTRAIT_FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC0890e.PORTRAIT_SENSOR.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            f3043f = iArr;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    private void m4081a(EnumC0893h enumC0893h) {
        if (enumC0893h == EnumC0893h.SCREEN_ON) {
            C0916a.m3751b(this);
            return;
        }
        this.f3044a = ((PowerManager) getSystemService("power")).newWakeLock(enumC0893h.m3678a() | 536870912, "AndEngine");
        try {
            this.f3044a.acquire();
        } catch (SecurityException e) {
            C0941a.m3827b("You have to add\n\t<uses-permission android:name=\"android.permission.WAKE_LOCK\"/>\nto your AndroidManifest.xml !", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m4083c() {
        runOnUiThread(new RunnableC1038d(this));
    }

    /* JADX INFO: renamed from: d */
    private void m4084d() {
        m4081a(this.f3049k.m3598d().m3666m());
    }

    /* JADX INFO: renamed from: e */
    private void m4085e() {
        if (this.f3044a == null || !this.f3044a.isHeld()) {
            return;
        }
        this.f3044a.release();
    }

    /* JADX INFO: renamed from: f */
    private void m4086f() {
        C0887b c0887bM3598d = this.f3049k.m3598d();
        if (c0887bM3598d.m3659f()) {
            C0916a.m3750a(this);
        }
        if (c0887bM3598d.m3657d().m3650c() || c0887bM3598d.m3657d().m3649b()) {
            setVolumeControlStream(3);
        }
        switch (m4080C()[c0887bM3598d.m3660g().ordinal()]) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                setRequestedOrientation(0);
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                if (!C0949a.f2785c) {
                    C0941a.m3828c(String.valueOf(EnumC0890e.class.getSimpleName()) + "." + EnumC0890e.LANDSCAPE_SENSOR + " is not supported on this device. Falling back to " + EnumC0890e.class.getSimpleName() + "." + EnumC0890e.LANDSCAPE_FIXED);
                    setRequestedOrientation(0);
                } else {
                    setRequestedOrientation(6);
                }
                break;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                setRequestedOrientation(1);
                break;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                if (!C0949a.f2785c) {
                    C0941a.m3828c(String.valueOf(EnumC0890e.class.getSimpleName()) + "." + EnumC0890e.PORTRAIT_SENSOR + " is not supported on this device. Falling back to " + EnumC0890e.class.getSimpleName() + "." + EnumC0890e.PORTRAIT_FIXED);
                    setRequestedOrientation(1);
                } else {
                    setRequestedOrientation(7);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public C0865b m4087A() {
        return this.f3049k.m3604j();
    }

    /* JADX INFO: renamed from: a */
    public ViewOnTouchListenerC0873a mo801a(C0887b c0887b) {
        return new ViewOnTouchListenerC0873a(c0887b);
    }

    @Override // org.andengine.opengl.view.InterfaceC1033h
    /* JADX INFO: renamed from: a */
    public synchronized void mo4074a(C1024e c1024e) {
        C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onSurfaceCreated @(Thread: '" + Thread.currentThread().getName() + "')");
        if (this.f3046c) {
            m4091t();
            if (this.f3045b && this.f3046c) {
                m4090s();
            }
        } else if (this.f3047d) {
            this.f3048e = true;
        } else {
            this.f3047d = true;
            m4088q();
        }
    }

    @Override // org.andengine.opengl.view.InterfaceC1033h
    /* JADX INFO: renamed from: a */
    public synchronized void mo4075a(C1024e c1024e, int i, int i2) {
        C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onSurfaceChanged(Width=" + i + ",  Height=" + i2 + ") @(Thread: '" + Thread.currentThread().getName() + "')");
    }

    /* JADX INFO: renamed from: b */
    protected void mo803b() {
        this.f3050l = new RenderSurfaceView(this);
        this.f3050l.m4060a(this.f3049k, this);
        setContentView(this.f3050l, m4079B());
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onCreate @(Thread: '" + Thread.currentThread().getName() + "')");
        super.onCreate(bundle);
        this.f3045b = true;
        this.f3049k = mo801a(mo802a());
        this.f3049k.m3580a();
        m4086f();
        mo803b();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onDestroy @(Thread: '" + Thread.currentThread().getName() + "')");
        super.onDestroy();
        this.f3049k.m3605k();
        try {
            m4093v();
        } catch (Throwable th) {
            C0941a.m3827b(String.valueOf(getClass().getSimpleName()) + ".onDestroyResources failed. @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
        m4094w();
        this.f3049k = null;
    }

    @Override // android.app.Activity
    protected void onPause() {
        C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onPause @(Thread: '" + Thread.currentThread().getName() + "')");
        super.onPause();
        this.f3050l.onPause();
        m4085e();
        if (this.f3045b) {
            return;
        }
        m4092u();
    }

    @Override // android.app.Activity
    protected synchronized void onResume() {
        C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onResume @(Thread: '" + Thread.currentThread().getName() + "')");
        super.onResume();
        m4084d();
        this.f3050l.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public synchronized void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f3045b && this.f3046c) {
            m4090s();
        }
    }

    /* JADX INFO: renamed from: q */
    protected synchronized void m4088q() {
        C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onCreateGame @(Thread: '" + Thread.currentThread().getName() + "')");
        C1037c c1037c = new C1037c(this, new C1036b(this, new C1035a(this)));
        try {
            C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onCreateResources @(Thread: '" + Thread.currentThread().getName() + "')");
            mo4077a(c1037c);
        } catch (Throwable th) {
            C0941a.m3827b(String.valueOf(getClass().getSimpleName()) + ".onCreateGame failed. @(Thread: '" + Thread.currentThread().getName() + "')", th);
        }
    }

    /* JADX INFO: renamed from: r */
    public synchronized void m4089r() {
        this.f3046c = true;
        if (this.f3048e) {
            this.f3048e = false;
            try {
                m4091t();
            } catch (Throwable th) {
                C0941a.m3827b(String.valueOf(getClass().getSimpleName()) + ".onReloadResources failed. @(Thread: '" + Thread.currentThread().getName() + "')", th);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m4090s() {
        C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onResumeGame @(Thread: '" + Thread.currentThread().getName() + "')");
        this.f3049k.m3592b();
        this.f3045b = false;
    }

    /* JADX INFO: renamed from: t */
    public void m4091t() {
        C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onReloadResources @(Thread: '" + Thread.currentThread().getName() + "')");
        this.f3049k.m3606l();
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m4092u() {
        C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onPauseGame @(Thread: '" + Thread.currentThread().getName() + "')");
        this.f3045b = true;
        this.f3049k.m3597c();
    }

    /* JADX INFO: renamed from: v */
    public void m4093v() {
        C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onDestroyResources @(Thread: '" + Thread.currentThread().getName() + "')");
        if (this.f3049k.m3598d().m3657d().m3650c()) {
            m4087A().mo3564b();
        }
        if (this.f3049k.m3598d().m3657d().m3649b()) {
            m4097z().mo3564b();
        }
    }

    /* JADX INFO: renamed from: w */
    public synchronized void m4094w() {
        C0941a.m3825b(String.valueOf(getClass().getSimpleName()) + ".onGameDestroyed @(Thread: '" + Thread.currentThread().getName() + "')");
        this.f3046c = false;
    }

    /* JADX INFO: renamed from: x */
    public ViewOnTouchListenerC0873a m4095x() {
        return this.f3049k;
    }

    /* JADX INFO: renamed from: y */
    public C1008e m4096y() {
        return this.f3049k.m3602h();
    }

    /* JADX INFO: renamed from: z */
    public C0871c m4097z() {
        return this.f3049k.m3603i();
    }
}
