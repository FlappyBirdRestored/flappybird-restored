package com.google.example.games.basegameutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGameActivity extends FragmentActivity implements InterfaceC0762b {

    /* JADX INFO: renamed from: r */
    private String[] f2290r;

    /* JADX INFO: renamed from: o */
    protected int f2287o = 1;

    /* JADX INFO: renamed from: p */
    protected String f2288p = "BaseGameActivity";

    /* JADX INFO: renamed from: q */
    protected boolean f2289q = false;

    /* JADX INFO: renamed from: n */
    protected C0761a f2286n = new C0761a(this);

    protected BaseGameActivity() {
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f2286n.m3242a(i, i2, intent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2286n = new C0761a(this);
        if (this.f2289q) {
            this.f2286n.m3249a(this.f2289q, this.f2288p);
        }
        this.f2286n.m3244a(this, this.f2287o, this.f2290r);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f2286n.m3243a(this);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f2286n.m3255d();
    }
}
