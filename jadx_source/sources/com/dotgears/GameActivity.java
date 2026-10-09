package com.dotgears;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.ads.AdView;
import com.google.ads.C0333d;
import com.google.ads.C0337g;
import com.google.android.gms.games.C0473c;
import com.google.example.games.basegameutils.C0761a;
import com.google.example.games.basegameutils.InterfaceC0762b;
import java.io.IOException;
import org.andengine.opengl.p066c.C1009f;
import org.andengine.opengl.p066c.p067a.p068a.C0992a;
import org.andengine.opengl.p066c.p067a.p068a.C0995b;
import org.andengine.opengl.p066c.p072c.C1005c;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.p021a.p024c.C0867a;
import org.andengine.p021a.p024c.C0870b;
import org.andengine.p026b.C0895e;
import org.andengine.p026b.ViewOnTouchListenerC0873a;
import org.andengine.p026b.p027a.C0874a;
import org.andengine.p026b.p031c.C0887b;
import org.andengine.p026b.p031c.EnumC0890e;
import org.andengine.p026b.p031c.EnumC0893h;
import org.andengine.p026b.p031c.p032a.C0885b;
import org.andengine.p033c.p035b.C0905e;
import org.andengine.p075ui.activity.BaseGameActivity;
import org.andengine.p075ui.activity.SimpleBaseGameActivity;

/* JADX INFO: loaded from: classes.dex */
public class GameActivity extends SimpleBaseGameActivity implements InterfaceC0762b {

    /* JADX INFO: renamed from: a */
    public AdView f479a;

    /* JADX INFO: renamed from: b */
    public C0867a f480b;

    /* JADX INFO: renamed from: c */
    public C0867a f481c;

    /* JADX INFO: renamed from: d */
    public C0867a f482d;

    /* JADX INFO: renamed from: e */
    public C0867a f483e;

    /* JADX INFO: renamed from: f */
    public C0867a f484f;

    /* JADX INFO: renamed from: g */
    protected C0761a f485g;

    /* JADX INFO: renamed from: h */
    protected int f486h = 1;

    /* JADX INFO: renamed from: i */
    protected String f487i = "BaseGameActivity";

    /* JADX INFO: renamed from: j */
    protected boolean f488j = false;

    /* JADX INFO: renamed from: m */
    private C0874a f489m;

    /* JADX INFO: renamed from: n */
    private C1005c f490n;

    /* JADX INFO: renamed from: o */
    private String[] f491o;

    @Override // org.andengine.p075ui.activity.BaseGameActivity
    /* JADX INFO: renamed from: a */
    public ViewOnTouchListenerC0873a mo801a(C0887b c0887b) {
        return new C0895e(c0887b, 60);
    }

    @Override // org.andengine.p075ui.InterfaceC1034a
    /* JADX INFO: renamed from: a */
    public C0887b mo802a() {
        this.f489m = new C0874a(0.0f, 0.0f, 288.0f, 512.0f);
        C0887b c0887b = new C0887b(true, EnumC0890e.PORTRAIT_FIXED, new C0885b(288.0f, 512.0f), this.f489m);
        c0887b.m3657d().m3648b(true).m3646a(true);
        c0887b.m3658e().m3669a(true);
        c0887b.m3656c().m3675a(true);
        c0887b.m3653a(EnumC0893h.SCREEN_ON);
        return c0887b;
    }

    @Override // org.andengine.p075ui.activity.BaseGameActivity
    /* JADX INFO: renamed from: b */
    protected void mo803b() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f3050l = new RenderSurfaceView(this);
        this.f3050l.m4060a(this.f3049k, this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((ViewGroup.MarginLayoutParams) BaseGameActivity.m4079B());
        layoutParams2.addRule(13);
        relativeLayout.addView(this.f3050l, layoutParams2);
        FrameLayout frameLayout = new FrameLayout(this);
        this.f479a = new AdView(this, C0337g.f1117a, "a152df006159b75");
        this.f479a.refreshDrawableState();
        frameLayout.addView(this.f479a, new FrameLayout.LayoutParams(-2, -2, 49));
        relativeLayout.addView(frameLayout);
        this.f479a.m958a(new C0333d());
        setContentView(relativeLayout, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m804c() {
        runOnUiThread(new RunnableC0198a(this));
    }

    /* JADX INFO: renamed from: d */
    public void m805d() {
        runOnUiThread(new RunnableC0199b(this));
    }

    /* JADX INFO: renamed from: e */
    public void m806e() {
        this.f480b.mo3558d();
    }

    /* JADX INFO: renamed from: f */
    public void m807f() {
        this.f481c.mo3558d();
    }

    /* JADX INFO: renamed from: g */
    public void m808g() {
        this.f482d.mo3558d();
    }

    /* JADX INFO: renamed from: h */
    public void m809h() {
        this.f483e.mo3558d();
    }

    /* JADX INFO: renamed from: i */
    public void m810i() {
        this.f484f.mo3558d();
    }

    @Override // com.google.example.games.basegameutils.InterfaceC0762b
    /* JADX INFO: renamed from: j */
    public void mo811j() {
    }

    @Override // com.google.example.games.basegameutils.InterfaceC0762b
    /* JADX INFO: renamed from: k */
    public void mo812k() {
    }

    @Override // org.andengine.p075ui.activity.SimpleBaseGameActivity
    /* JADX INFO: renamed from: l */
    protected void mo813l() {
        C0995b.m3940a("gfx/");
        C0992a c0992a = new C0992a(m4096y(), 1024, 1024, C1009f.f2945i);
        this.f490n = C0995b.m3936a(c0992a, this, "atlas.png", 0, 0);
        c0992a.m3975i();
        C0870b.m3574a("sounds/");
        try {
            this.f480b = C0870b.m3572a(this.f3049k.m3603i(), this, "sfx_point.ogg");
            this.f481c = C0870b.m3572a(this.f3049k.m3603i(), this, "sfx_die.ogg");
            this.f482d = C0870b.m3572a(this.f3049k.m3603i(), this, "sfx_hit.ogg");
            this.f483e = C0870b.m3572a(this.f3049k.m3603i(), this, "sfx_swooshing.ogg");
            this.f484f = C0870b.m3572a(this.f3049k.m3603i(), this, "sfx_wing.ogg");
        } catch (IOException e) {
        }
    }

    @Override // org.andengine.p075ui.activity.SimpleBaseGameActivity
    /* JADX INFO: renamed from: m */
    protected C0905e mo814m() {
        return new C0200c(this, this.f490n);
    }

    /* JADX INFO: renamed from: n */
    protected C0473c m815n() {
        return this.f485g.m3252b();
    }

    /* JADX INFO: renamed from: o */
    public boolean m816o() {
        return this.f485g.m3254c();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f485g.m3242a(i, i2, intent);
    }

    @Override // org.andengine.p075ui.activity.BaseGameActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f485g = new C0761a(this);
        if (this.f488j) {
            this.f485g.m3249a(this.f488j, this.f487i);
        }
        this.f485g.m3244a(this, this.f486h, this.f491o);
    }

    @Override // org.andengine.p075ui.activity.BaseGameActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        Log.i("FlappyBird", "Back key pressed.");
        return false;
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f485g.m3243a(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f485g.m3255d();
    }

    /* JADX INFO: renamed from: p */
    public void m817p() {
        this.f485g.m3259f();
    }
}
