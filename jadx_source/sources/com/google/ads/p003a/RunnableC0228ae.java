package com.google.ads.p003a;

import android.content.Context;
import com.google.ads.C0315br;
import com.google.ads.C0316bs;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0364g;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: com.google.ads.a.ae */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0228ae implements Runnable {

    /* JADX INFO: renamed from: a */
    private String f792a;

    /* JADX INFO: renamed from: b */
    private Context f793b;

    public RunnableC0228ae(String str, Context context) {
        this.f792a = str;
        this.f793b = context;
    }

    /* JADX INFO: renamed from: a */
    protected BufferedOutputStream m1013a(HttpURLConnection httpURLConnection) {
        return new BufferedOutputStream(httpURLConnection.getOutputStream());
    }

    /* JADX INFO: renamed from: a */
    protected HttpURLConnection m1014a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(true);
        AdUtil.m1354a(httpURLConnection, this.f793b);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        return httpURLConnection;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            HttpURLConnection httpURLConnectionM1014a = m1014a(new URL((String) ((C0316bs) C0315br.m1302a().f1035b.m1378a()).f1044h.m1379a()));
            byte[] bytes = new C0229af(this.f792a).m1015a().toString().getBytes();
            httpURLConnectionM1014a.setFixedLengthStreamingMode(bytes.length);
            try {
                BufferedOutputStream bufferedOutputStreamM1013a = m1013a(httpURLConnectionM1014a);
                bufferedOutputStreamM1013a.write(bytes);
                bufferedOutputStreamM1013a.close();
                if (httpURLConnectionM1014a.getResponseCode() != 200) {
                    C0364g.m1395b("Got error response from BadAd backend: " + httpURLConnectionM1014a.getResponseMessage());
                }
            } finally {
                httpURLConnectionM1014a.disconnect();
            }
        } catch (IOException e) {
            C0364g.m1396b("Error reporting bad ad.", e);
        }
    }
}
