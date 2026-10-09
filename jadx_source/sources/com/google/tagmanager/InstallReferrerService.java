package com.google.tagmanager;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.analytics.tracking.android.CampaignTrackingService;

/* JADX INFO: loaded from: classes.dex */
public final class InstallReferrerService extends IntentService {

    /* JADX INFO: renamed from: a */
    CampaignTrackingService f2312a;

    /* JADX INFO: renamed from: b */
    Context f2313b;

    public InstallReferrerService() {
        super("InstallReferrerService");
    }

    /* JADX INFO: renamed from: a */
    private void m3272a(Context context, Intent intent) {
        if (this.f2312a == null) {
            this.f2312a = new CampaignTrackingService();
        }
        this.f2312a.m1807a(context, intent);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        Context applicationContext = this.f2313b != null ? this.f2313b : getApplicationContext();
        C0843h.m3523a(applicationContext, stringExtra);
        m3272a(applicationContext, intent);
    }
}
