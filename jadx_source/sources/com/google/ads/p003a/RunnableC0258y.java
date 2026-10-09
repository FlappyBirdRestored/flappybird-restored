package com.google.ads.p003a;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.C0314bq;
import com.google.ads.C0317bt;
import com.google.ads.C0337g;
import com.google.ads.EnumC0335e;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0364g;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: renamed from: com.google.ads.a.y */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0258y implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C0314bq f909a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0224aa f910b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f911c;

    /* JADX INFO: renamed from: d */
    private boolean f912d;

    /* JADX INFO: renamed from: e */
    private String f913e;

    /* JADX INFO: renamed from: f */
    private Thread f914f;

    RunnableC0258y(C0314bq c0314bq) {
        this(c0314bq, new C0259z());
    }

    RunnableC0258y(C0314bq c0314bq, InterfaceC0224aa interfaceC0224aa) {
        this.f914f = null;
        this.f909a = c0314bq;
        this.f910b = interfaceC0224aa;
    }

    /* JADX INFO: renamed from: a */
    private void m1140a(Context context, HttpURLConnection httpURLConnection) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("drt", "");
        if (!this.f912d || TextUtils.isEmpty(string)) {
            return;
        }
        if (AdUtil.f1336a == 8) {
            httpURLConnection.addRequestProperty("X-Afma-drt-Cookie", string);
        } else {
            httpURLConnection.addRequestProperty("Cookie", string);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1141a(HttpURLConnection httpURLConnection) {
        m1144b(httpURLConnection);
        m1148f(httpURLConnection);
        m1149g(httpURLConnection);
        m1150h(httpURLConnection);
        m1151i(httpURLConnection);
        m1147e(httpURLConnection);
        m1152j(httpURLConnection);
        m1153k(httpURLConnection);
        m1154l(httpURLConnection);
        m1146d(httpURLConnection);
        m1145c(httpURLConnection);
        m1155m(httpURLConnection);
        m1156n(httpURLConnection);
    }

    /* JADX INFO: renamed from: a */
    private void m1142a(HttpURLConnection httpURLConnection, int i) {
        if (300 <= i && i < 400) {
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField != null) {
                m1141a(httpURLConnection);
                this.f913e = headerField;
                return;
            } else {
                C0364g.m1397c("Could not get redirect location from a " + i + " redirect.");
                ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1071a(EnumC0335e.INTERNAL_ERROR);
                m1157a();
                return;
            }
        }
        if (i != 200) {
            if (i == 400) {
                C0364g.m1397c("Bad request");
                ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1071a(EnumC0335e.INVALID_REQUEST);
                m1157a();
                return;
            } else {
                C0364g.m1397c("Invalid response code: " + i);
                ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1071a(EnumC0335e.INTERNAL_ERROR);
                m1157a();
                return;
            }
        }
        m1141a(httpURLConnection);
        String strTrim = AdUtil.m1349a(new InputStreamReader(httpURLConnection.getInputStream())).trim();
        C0364g.m1391a("Response content is: " + strTrim);
        if (!TextUtils.isEmpty(strTrim)) {
            ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1075a(strTrim, this.f913e);
            m1157a();
        } else {
            C0364g.m1391a("Response message is null or zero length: " + strTrim);
            ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1071a(EnumC0335e.NO_FILL);
            m1157a();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1143b() {
        while (!this.f911c) {
            HttpURLConnection httpURLConnectionMo966a = this.f910b.mo966a(new URL(this.f913e));
            try {
                m1140a((Context) ((C0317bt) this.f909a.f1030a.m1378a()).f1057f.m1378a(), httpURLConnectionMo966a);
                AdUtil.m1354a(httpURLConnectionMo966a, (Context) ((C0317bt) this.f909a.f1030a.m1378a()).f1057f.m1378a());
                httpURLConnectionMo966a.setInstanceFollowRedirects(false);
                httpURLConnectionMo966a.connect();
                m1142a(httpURLConnectionMo966a, httpURLConnectionMo966a.getResponseCode());
                httpURLConnectionMo966a.disconnect();
            } catch (Throwable th) {
                httpURLConnectionMo966a.disconnect();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1144b(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Debug-Dialog");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1086f(headerField);
    }

    /* JADX INFO: renamed from: c */
    private void m1145c(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Type");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1078b(headerField);
    }

    /* JADX INFO: renamed from: d */
    private void m1146d(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Mediation");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1079b(Boolean.valueOf(headerField).booleanValue());
    }

    /* JADX INFO: renamed from: e */
    private void m1147e(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Interstitial-Timeout");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        try {
            ((C0256w) ((C0317bt) this.f909a.f1030a.m1378a()).f1053b.m1378a()).m1095a((long) (Float.parseFloat(headerField) * 1000.0f));
        } catch (NumberFormatException e) {
            C0364g.m1400d("Could not get timeout value: " + headerField, e);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m1148f(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Tracking-Urls");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        for (String str : headerField.trim().split("\\s+")) {
            ((C0256w) ((C0317bt) this.f909a.f1030a.m1378a()).f1053b.m1378a()).m1109b(str);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m1149g(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Manual-Tracking-Urls");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        for (String str : headerField.trim().split("\\s+")) {
            ((C0256w) ((C0317bt) this.f909a.f1030a.m1378a()).f1053b.m1378a()).m1112c(str);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m1150h(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Click-Tracking-Urls");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        for (String str : headerField.trim().split("\\s+")) {
            ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1074a(str);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m1151i(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Refresh-Rate");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        try {
            float f = Float.parseFloat(headerField);
            C0256w c0256w = (C0256w) ((C0317bt) this.f909a.f1030a.m1378a()).f1053b.m1378a();
            if (f <= 0.0f) {
                if (c0256w.m1127r()) {
                    c0256w.m1114e();
                }
            } else {
                c0256w.m1092a(f);
                if (c0256w.m1127r()) {
                    return;
                }
                c0256w.m1115f();
            }
        } catch (NumberFormatException e) {
            C0364g.m1400d("Could not get refresh value: " + headerField, e);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m1152j(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Orientation");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        if (headerField.equals("portrait")) {
            ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1068a(AdUtil.m1361b());
        } else if (headerField.equals("landscape")) {
            ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1068a(AdUtil.m1343a());
        }
    }

    /* JADX INFO: renamed from: k */
    private void m1153k(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"))) {
            return;
        }
        try {
            ((C0256w) ((C0317bt) this.f909a.f1030a.m1378a()).f1053b.m1378a()).m1107b(Long.parseLong(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life")));
        } catch (NumberFormatException e) {
            C0364g.m1401e("Got bad value of Doritos cookie cache life from header: " + httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life") + ". Using default value instead.");
        }
    }

    /* JADX INFO: renamed from: l */
    private void m1154l(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Cache-Control");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1080c(headerField);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    private void m1155m(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Ad-Size");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        try {
            String[] strArrSplit = headerField.split("x", 2);
            if (strArrSplit.length != 2) {
                C0364g.m1401e("Could not parse size header: " + headerField);
                headerField = headerField;
            } else {
                int i = Integer.parseInt(strArrSplit[0]);
                int i2 = Integer.parseInt(strArrSplit[1]);
                RunnableC0247n runnableC0247n = (RunnableC0247n) this.f909a.f1031b.m1379a();
                runnableC0247n.m1073a(new C0337g(i, i2));
                headerField = runnableC0247n;
            }
        } catch (NumberFormatException e) {
            C0364g.m1401e("Could not parse size header: " + headerField);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m1156n(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Disable-Activation-And-Scroll");
        if (TextUtils.isEmpty(headerField)) {
            return;
        }
        ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1076a(headerField.equals("1"));
    }

    /* JADX INFO: renamed from: a */
    void m1157a() {
        this.f911c = true;
    }

    /* JADX INFO: renamed from: a */
    synchronized void m1158a(String str) {
        if (this.f914f == null) {
            this.f913e = str;
            this.f911c = false;
            this.f914f = new Thread(this);
            this.f914f.start();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1159a(boolean z) {
        this.f912d = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            m1143b();
        } catch (MalformedURLException e) {
            C0364g.m1396b("Received malformed ad url from javascript.", e);
            ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1071a(EnumC0335e.INTERNAL_ERROR);
        } catch (IOException e2) {
            C0364g.m1396b("IOException connecting to ad url.", e2);
            ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1071a(EnumC0335e.NETWORK_ERROR);
        } catch (Throwable th) {
            C0364g.m1396b("An unknown error occurred in AdResponseLoader.", th);
            ((RunnableC0247n) this.f909a.f1031b.m1379a()).m1071a(EnumC0335e.INTERNAL_ERROR);
        }
    }
}
