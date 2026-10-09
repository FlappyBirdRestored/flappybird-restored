package com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.ads.p003a.C0256w;
import com.google.ads.p003a.C0257x;
import com.google.ads.util.C0364g;

/* JADX INFO: renamed from: com.google.ads.b */
/* JADX INFO: loaded from: classes.dex */
public class C0286b {
    /* JADX INFO: renamed from: a */
    public void m1238a(C0256w c0256w, C0257x c0257x) {
        synchronized (AdActivity.f737b) {
            if (AdActivity.f739d == null) {
                C0256w unused = AdActivity.f739d = c0256w;
            } else if (AdActivity.f739d != c0256w) {
                C0364g.m1395b("Tried to launch a new AdActivity with a different AdManager.");
                return;
            }
            Activity activity = (Activity) c0256w.m1117h().f1054c.m1381a();
            if (activity == null) {
                C0364g.m1401e("activity was null while launching an AdActivity.");
                return;
            }
            Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) AdActivity.class);
            intent.putExtra("com.google.ads.AdOpener", c0257x.m1137a());
            try {
                C0364g.m1391a("Launching AdActivity.");
                activity.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                C0364g.m1396b("Activity not found.", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m1239a() {
        boolean z;
        synchronized (AdActivity.f737b) {
            z = AdActivity.f740e != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1240b() {
        boolean z;
        synchronized (AdActivity.f737b) {
            z = AdActivity.f738c != null;
        }
        return z;
    }
}
