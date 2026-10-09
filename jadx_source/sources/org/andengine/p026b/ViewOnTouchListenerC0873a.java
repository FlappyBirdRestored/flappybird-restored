package org.andengine.p026b;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.C0467e;
import org.andengine.input.p057a.C0950a;
import org.andengine.input.p057a.p058a.C0956f;
import org.andengine.input.p057a.p058a.C0957g;
import org.andengine.input.p057a.p058a.InterfaceC0954d;
import org.andengine.input.p057a.p058a.InterfaceC0955e;
import org.andengine.input.sensor.EnumC0967b;
import org.andengine.input.sensor.location.EnumC0971b;
import org.andengine.input.sensor.location.InterfaceC0970a;
import org.andengine.input.sensor.p059a.C0960a;
import org.andengine.input.sensor.p059a.InterfaceC0966g;
import org.andengine.input.sensor.p060b.C0969b;
import org.andengine.input.sensor.p060b.InterfaceC0968a;
import org.andengine.opengl.p061a.C0974b;
import org.andengine.opengl.p061a.C0975c;
import org.andengine.opengl.p063b.C0989h;
import org.andengine.opengl.p066c.C1008e;
import org.andengine.opengl.p066c.p067a.p068a.C0995b;
import org.andengine.opengl.p073d.C1019e;
import org.andengine.opengl.util.C1024e;
import org.andengine.p021a.p023b.C0864a;
import org.andengine.p021a.p023b.C0865b;
import org.andengine.p021a.p024c.C0870b;
import org.andengine.p021a.p024c.C0871c;
import org.andengine.p026b.p027a.C0874a;
import org.andengine.p026b.p029b.C0877a;
import org.andengine.p026b.p029b.C0881d;
import org.andengine.p026b.p029b.p030a.C0878a;
import org.andengine.p026b.p031c.C0887b;
import org.andengine.p033c.p035b.C0905e;
import org.andengine.p040d.p052e.C0941a;

/* JADX INFO: renamed from: org.andengine.b.a */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnTouchListenerC0873a implements SensorEventListener, LocationListener, View.OnTouchListener, InterfaceC0955e {

    /* JADX INFO: renamed from: e */
    private static final EnumC0967b f2542e = EnumC0967b.GAME;

    /* JADX INFO: renamed from: a */
    protected final C0874a f2545a;

    /* JADX INFO: renamed from: b */
    protected C0905e f2546b;

    /* JADX INFO: renamed from: f */
    private boolean f2549f;

    /* JADX INFO: renamed from: g */
    private boolean f2550g;

    /* JADX INFO: renamed from: h */
    private long f2551h;

    /* JADX INFO: renamed from: i */
    private float f2552i;

    /* JADX INFO: renamed from: j */
    private final C0882c f2553j;

    /* JADX INFO: renamed from: k */
    private final C0894d f2554k;

    /* JADX INFO: renamed from: m */
    private final C0887b f2556m;

    /* JADX INFO: renamed from: n */
    private InterfaceC0954d f2557n;

    /* JADX INFO: renamed from: s */
    private final C0871c f2562s;

    /* JADX INFO: renamed from: t */
    private final C0865b f2563t;

    /* JADX INFO: renamed from: u */
    private InterfaceC0970a f2564u;

    /* JADX INFO: renamed from: v */
    private Location f2565v;

    /* JADX INFO: renamed from: w */
    private InterfaceC0966g f2566w;

    /* JADX INFO: renamed from: x */
    private C0960a f2567x;

    /* JADX INFO: renamed from: y */
    private InterfaceC0968a f2568y;

    /* JADX INFO: renamed from: z */
    private C0969b f2569z;

    /* JADX INFO: renamed from: l */
    private final C0878a f2555l = new C0878a();

    /* JADX INFO: renamed from: o */
    private final C1019e f2558o = new C1019e();

    /* JADX INFO: renamed from: p */
    private final C1008e f2559p = new C1008e();

    /* JADX INFO: renamed from: q */
    private final C0975c f2560q = new C0975c();

    /* JADX INFO: renamed from: r */
    private final C0989h f2561r = new C0989h();

    /* JADX INFO: renamed from: A */
    private final C0881d f2543A = new C0881d(8);

    /* JADX INFO: renamed from: B */
    private final C0877a f2544B = new C0877a(4);

    /* JADX INFO: renamed from: c */
    protected int f2547c = 1;

    /* JADX INFO: renamed from: d */
    protected int f2548d = 1;

    public ViewOnTouchListenerC0873a(C0887b c0887b) {
        C0995b.m3939a();
        C0870b.m3573a();
        C0864a.m3566a();
        C0974b.m3892a();
        this.f2558o.m3999a();
        this.f2559p.m3976a();
        this.f2560q.m3894a();
        this.f2561r.m3916a();
        this.f2556m = c0887b;
        if (this.f2556m.m3654a()) {
            this.f2553j = c0887b.m3655b();
        } else {
            this.f2553j = new C0882c(false);
        }
        this.f2545a = c0887b.m3662i();
        if (this.f2556m.m3656c().m3676a()) {
            m3585a(new C0956f());
        } else {
            m3585a(new C0957g());
        }
        if (this.f2556m.m3657d().m3649b()) {
            this.f2562s = new C0871c(this.f2556m.m3657d().m3647a().m3674b());
        } else {
            this.f2562s = null;
        }
        if (this.f2556m.m3657d().m3650c()) {
            this.f2563t = new C0865b();
        } else {
            this.f2563t = null;
        }
        if (this.f2556m.m3663j()) {
            this.f2554k = this.f2556m.m3664k();
        } else {
            this.f2554k = new C0894d();
        }
        this.f2554k.m3679a(this);
    }

    /* JADX INFO: renamed from: n */
    private void m3578n() throws C0876b {
        if (this.f2550g) {
            throw new C0876b(this);
        }
    }

    /* JADX INFO: renamed from: o */
    private long m3579o() {
        return System.nanoTime() - this.f2551h;
    }

    /* JADX INFO: renamed from: a */
    public void m3580a() {
        this.f2554k.start();
    }

    /* JADX INFO: renamed from: a */
    protected void m3581a(float f) {
        if (this.f2546b != null) {
            this.f2546b.mo3622a_(f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3582a(int i, int i2) {
        this.f2547c = i;
        this.f2548d = i2;
        m3600f();
    }

    /* JADX INFO: renamed from: a */
    public void mo3583a(long j) {
        float f = j * 1.0E-9f;
        this.f2552i += f;
        this.f2551h += j;
        this.f2557n.mo3622a_(f);
        m3593b(f);
        m3581a(f);
    }

    /* JADX INFO: renamed from: a */
    public void m3584a(C0905e c0905e) {
        this.f2546b = c0905e;
    }

    /* JADX INFO: renamed from: a */
    public void m3585a(InterfaceC0954d interfaceC0954d) {
        this.f2557n = interfaceC0954d;
        this.f2557n.mo3862a(this);
    }

    /* JADX INFO: renamed from: a */
    public void m3586a(C1024e c1024e) {
        C0882c c0882c = this.f2553j;
        c0882c.lock();
        try {
            c0882c.m3644c();
            this.f2558o.m4001a(c1024e);
            this.f2559p.m3977a(c1024e);
            this.f2560q.m3895a(c1024e);
            m3587a(c1024e, this.f2545a);
            m3595b(c1024e, this.f2545a);
            c0882c.m3643b();
        } finally {
            c0882c.unlock();
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m3587a(C1024e c1024e, C0874a c0874a) {
        this.f2544B.mo3641a(c1024e, c0874a);
    }

    /* JADX INFO: renamed from: a */
    protected boolean m3588a(C0874a c0874a, C0950a c0950a) {
        if (c0874a.m3638j()) {
            return c0874a.m3637i().mo3714a(c0950a);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    protected boolean m3589a(C0905e c0905e, C0950a c0950a) {
        if (c0905e != null) {
            return c0905e.mo3714a(c0950a);
        }
        return false;
    }

    @Override // org.andengine.input.p057a.p058a.InterfaceC0955e
    /* JADX INFO: renamed from: a */
    public boolean mo3590a(C0950a c0950a) {
        C0905e c0905eM3596c = m3596c(c0950a);
        C0874a c0874aM3591b = m3591b(c0950a);
        m3594b(c0874aM3591b, c0950a);
        if (m3588a(c0874aM3591b, c0950a)) {
            return true;
        }
        return m3589a(c0905eM3596c, c0950a);
    }

    /* JADX INFO: renamed from: b */
    protected C0874a m3591b(C0950a c0950a) {
        return m3599e();
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m3592b() {
        if (!this.f2549f) {
            this.f2551h = System.nanoTime();
            this.f2549f = true;
        }
    }

    /* JADX INFO: renamed from: b */
    protected void m3593b(float f) {
        this.f2555l.mo3622a_(f);
        this.f2543A.mo3622a_(f);
        m3599e().mo3622a_(f);
    }

    /* JADX INFO: renamed from: b */
    protected void m3594b(C0874a c0874a, C0950a c0950a) {
        c0874a.m3620a(c0950a, this.f2547c, this.f2548d);
    }

    /* JADX INFO: renamed from: b */
    protected void m3595b(C1024e c1024e, C0874a c0874a) {
        if (this.f2546b != null) {
            this.f2546b.mo3641a(c1024e, c0874a);
        }
        c0874a.m3621a(c1024e);
    }

    /* JADX INFO: renamed from: c */
    protected C0905e m3596c(C0950a c0950a) {
        return this.f2546b;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m3597c() {
        if (this.f2549f) {
            this.f2549f = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public C0887b m3598d() {
        return this.f2556m;
    }

    /* JADX INFO: renamed from: e */
    public C0874a m3599e() {
        return this.f2545a;
    }

    /* JADX INFO: renamed from: f */
    protected void m3600f() {
        this.f2545a.m3617a(0, 0, this.f2547c, this.f2548d);
    }

    /* JADX INFO: renamed from: g */
    public C1019e m3601g() {
        return this.f2558o;
    }

    /* JADX INFO: renamed from: h */
    public C1008e m3602h() {
        return this.f2559p;
    }

    /* JADX INFO: renamed from: i */
    public C0871c m3603i() {
        if (this.f2562s != null) {
            return this.f2562s;
        }
        throw new IllegalStateException("To enable the SoundManager, check the EngineOptions!");
    }

    /* JADX INFO: renamed from: j */
    public C0865b m3604j() {
        if (this.f2563t != null) {
            return this.f2563t;
        }
        throw new IllegalStateException("To enable the MusicManager, check the EngineOptions!");
    }

    /* JADX INFO: renamed from: k */
    public void m3605k() {
        this.f2553j.lock();
        try {
            this.f2550g = true;
            this.f2553j.m3643b();
            this.f2553j.unlock();
            try {
                this.f2554k.join();
            } catch (InterruptedException e) {
                C0941a.m3827b("Could not join UpdateThread.", e);
                C0941a.m3828c("Trying to manually interrupt UpdateThread.");
                this.f2554k.interrupt();
            }
            this.f2558o.m4002b();
            this.f2559p.m3980c();
            this.f2560q.m3896b();
            this.f2561r.m3918b();
        } catch (Throwable th) {
            this.f2553j.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m3606l() {
        this.f2558o.m4004c();
        this.f2559p.m3979b();
        this.f2560q.m3897c();
        this.f2561r.m3919c();
    }

    /* JADX INFO: renamed from: m */
    void m3607m() throws InterruptedException {
        if (this.f2549f) {
            long jM3579o = m3579o();
            this.f2553j.lock();
            try {
                m3578n();
                mo3583a(jM3579o);
                m3578n();
                this.f2553j.m3642a();
                this.f2553j.m3645d();
                return;
            } finally {
                this.f2553j.unlock();
            }
        }
        this.f2553j.lock();
        try {
            m3578n();
            this.f2553j.m3642a();
            this.f2553j.m3645d();
            this.f2553j.unlock();
            Thread.sleep(16L);
        } catch (Throwable th) {
            this.f2553j.unlock();
            throw th;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        if (this.f2549f) {
            switch (sensor.getType()) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    if (this.f2567x != null) {
                        this.f2567x.mo3870a(i);
                        this.f2566w.m3873a(this.f2567x);
                    } else if (this.f2569z != null) {
                        this.f2569z.m3878b(i);
                        this.f2568y.m3875a(this.f2569z);
                    }
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    this.f2569z.m3880c(i);
                    this.f2568y.m3875a(this.f2569z);
                    break;
            }
        }
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (this.f2565v == null) {
            this.f2565v = location;
        } else if (location == null) {
            this.f2564u.m3885b();
        } else {
            this.f2565v = location;
            this.f2564u.m3883a(location);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        this.f2564u.m3886c();
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        this.f2564u.m3882a();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f2549f) {
            switch (sensorEvent.sensor.getType()) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    if (this.f2567x != null) {
                        this.f2567x.mo3871a(sensorEvent.values);
                        this.f2566w.m3874b(this.f2567x);
                    } else if (this.f2569z != null) {
                        this.f2569z.m3879b(sensorEvent.values);
                        this.f2568y.m3876b(this.f2569z);
                    }
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    this.f2569z.m3881c(sensorEvent.values);
                    this.f2568y.m3876b(this.f2569z);
                    break;
            }
        }
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
        switch (i) {
            case C0467e.MapAttrs_mapType /* 0 */:
                this.f2564u.m3884a(EnumC0971b.OUT_OF_SERVICE, bundle);
                break;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                this.f2564u.m3884a(EnumC0971b.TEMPORARILY_UNAVAILABLE, bundle);
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                this.f2564u.m3884a(EnumC0971b.AVAILABLE, bundle);
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f2549f) {
            return false;
        }
        this.f2557n.mo3865a(motionEvent);
        try {
            Thread.sleep(this.f2556m.m3656c().m3677b());
        } catch (InterruptedException e) {
            C0941a.m3824a(e);
        }
        return true;
    }
}
