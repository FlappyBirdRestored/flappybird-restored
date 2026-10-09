package com.google.ads;

import android.content.Context;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0364g;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: com.google.ads.o */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0345o implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Context f1135a;

    /* JADX INFO: renamed from: b */
    private final String f1136b;

    public RunnableC0345o(String str, Context context) {
        this.f1136b = str;
        this.f1135a = context;
    }

    /* JADX INFO: renamed from: a */
    protected HttpURLConnection m1341a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0364g.m1391a("Pinging URL: " + this.f1136b);
            HttpURLConnection httpURLConnectionM1341a = m1341a(new URL(this.f1136b));
            try {
                AdUtil.m1354a(httpURLConnectionM1341a, this.f1135a);
                httpURLConnectionM1341a.setInstanceFollowRedirects(true);
                httpURLConnectionM1341a.connect();
                int responseCode = httpURLConnectionM1341a.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    C0364g.m1401e("Did not receive 2XX (got " + responseCode + ") from pinging URL: " + this.f1136b);
                }
            } finally {
                httpURLConnectionM1341a.disconnect();
            }
        } catch (Throwable th) {
            C0364g.m1400d("Unable to ping the URL: " + this.f1136b, th);
        }
    }
}
