package com.google.analytics.tracking.android;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class CampaignTrackingService extends IntentService {
    public CampaignTrackingService() {
        super("CampaignIntentService");
    }

    /* JADX INFO: renamed from: a */
    public void m1807a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("gaInstallData", 0);
            fileOutputStreamOpenFileOutput.write(stringExtra.getBytes());
            fileOutputStreamOpenFileOutput.close();
        } catch (IOException e) {
            C0424b.m1811a("Error storing install campaign.");
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        m1807a(this, intent);
    }
}
