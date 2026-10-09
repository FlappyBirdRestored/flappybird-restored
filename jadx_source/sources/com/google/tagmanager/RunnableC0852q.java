package com.google.tagmanager;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.tagmanager.q */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0852q implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ SharedPreferences.Editor f2503a;

    RunnableC0852q(SharedPreferences.Editor editor) {
        this.f2503a = editor;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2503a.commit();
    }
}
