package com.google.tagmanager;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class PreviewActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            C0844i.m3528c("Preview activity");
            Uri data = getIntent().getData();
            if (C0853r.m3540a(this).m3542a(data)) {
                Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                if (launchIntentForPackage != null) {
                    C0844i.m3528c("Invoke the launch activity for package name: " + getPackageName());
                    startActivity(launchIntentForPackage);
                } else {
                    C0844i.m3528c("No launch activity found for package name: " + getPackageName());
                }
            } else {
                C0844i.m3527b("Cannot preview the app with the uri: " + data);
            }
        } catch (Exception e) {
            C0844i.m3526a("Calling preview threw an exception: " + e.getMessage());
        }
    }
}
