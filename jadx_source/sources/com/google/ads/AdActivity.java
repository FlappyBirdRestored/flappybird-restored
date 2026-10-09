package com.google.ads;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.google.ads.p003a.C0227ad;
import com.google.ads.p003a.C0236c;
import com.google.ads.p003a.C0238e;
import com.google.ads.p003a.C0241h;
import com.google.ads.p003a.C0256w;
import com.google.ads.p003a.C0257x;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0364g;
import com.google.ads.util.C0371n;
import com.google.ads.util.C0373p;
import com.google.android.gms.C0467e;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AdActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private static final C0241h f736a = (C0241h) C0241h.f821a.mo1047b();

    /* JADX INFO: renamed from: b */
    private static final Object f737b = new Object();

    /* JADX INFO: renamed from: c */
    private static AdActivity f738c = null;

    /* JADX INFO: renamed from: d */
    private static C0256w f739d = null;

    /* JADX INFO: renamed from: e */
    private static AdActivity f740e = null;

    /* JADX INFO: renamed from: f */
    private static AdActivity f741f = null;

    /* JADX INFO: renamed from: g */
    private static final C0286b f742g = new C0286b();

    /* JADX INFO: renamed from: h */
    private C0238e f743h;

    /* JADX INFO: renamed from: i */
    private FrameLayout f744i;

    /* JADX INFO: renamed from: j */
    private int f745j;

    /* JADX INFO: renamed from: l */
    private boolean f747l;

    /* JADX INFO: renamed from: m */
    private long f748m;

    /* JADX INFO: renamed from: n */
    private RelativeLayout f749n;

    /* JADX INFO: renamed from: p */
    private boolean f751p;

    /* JADX INFO: renamed from: q */
    private boolean f752q;

    /* JADX INFO: renamed from: r */
    private boolean f753r;

    /* JADX INFO: renamed from: s */
    private boolean f754s;

    /* JADX INFO: renamed from: t */
    private C0236c f755t;

    /* JADX INFO: renamed from: k */
    private ViewGroup f746k = null;

    /* JADX INFO: renamed from: o */
    private AdActivity f750o = null;

    /* JADX INFO: renamed from: a */
    public static void m926a(C0256w c0256w, C0257x c0257x) {
        f742g.m1238a(c0256w, c0257x);
    }

    /* JADX INFO: renamed from: a */
    private void m927a(String str) {
        C0364g.m1395b(str);
        finish();
    }

    /* JADX INFO: renamed from: a */
    private void m928a(String str, Throwable th) {
        C0364g.m1396b(str, th);
        finish();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m930b() {
        return f742g.m1239a();
    }

    /* JADX INFO: renamed from: c */
    private RelativeLayout.LayoutParams m931c(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        return layoutParams;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m932c() {
        return f742g.m1240b();
    }

    /* JADX INFO: renamed from: h */
    private void m937h() {
        if (this.f747l) {
            return;
        }
        if (this.f743h != null) {
            f736a.m1043b(this.f743h);
            this.f743h.setAdActivity(null);
            this.f743h.setIsExpandedMraid(false);
            if (!this.f752q && this.f749n != null && this.f746k != null) {
                if (this.f753r && !this.f754s) {
                    C0364g.m1391a("Disabling hardware acceleration on collapsing MRAID WebView.");
                    this.f743h.m1030g();
                } else if (!this.f753r && this.f754s) {
                    C0364g.m1391a("Re-enabling hardware acceleration on collapsing MRAID WebView.");
                    this.f743h.m1031h();
                }
                this.f749n.removeView(this.f743h);
                this.f746k.addView(this.f743h);
            }
        }
        if (this.f755t != null) {
            this.f755t.m1025e();
            this.f755t = null;
        }
        if (this == f738c) {
            f738c = null;
        }
        f741f = this.f750o;
        synchronized (f737b) {
            if (f739d != null && this.f752q && this.f743h != null) {
                if (this.f743h == f739d.m1120k()) {
                    f739d.m1091a();
                }
                this.f743h.stopLoading();
            }
            if (this == f740e) {
                f740e = null;
                if (f739d != null) {
                    f739d.m1128s();
                    f739d = null;
                } else {
                    C0364g.m1401e("currentAdManager is null while trying to destroy AdActivity.");
                }
            }
        }
        this.f747l = true;
        C0364g.m1391a("AdActivity is closing.");
    }

    /* JADX INFO: renamed from: a */
    protected View m938a(int i, boolean z) {
        this.f745j = (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
        this.f744i = new FrameLayout(getApplicationContext());
        this.f744i.setMinimumWidth(this.f745j);
        this.f744i.setMinimumHeight(this.f745j);
        this.f744i.setOnClickListener(this);
        m945a(z);
        return this.f744i;
    }

    /* JADX INFO: renamed from: a */
    public C0236c m939a() {
        return this.f755t;
    }

    /* JADX INFO: renamed from: a */
    protected C0236c m940a(Activity activity) {
        return new C0236c(activity, this.f743h);
    }

    /* JADX INFO: renamed from: a */
    public void m941a(int i, int i2, int i3, int i4) {
        if (this.f755t != null) {
            this.f755t.setLayoutParams(m931c(i, i2, i3, i4));
            this.f755t.requestLayout();
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m942a(C0238e c0238e, boolean z, int i, boolean z2, boolean z3) {
        requestWindowFeature(1);
        Window window = getWindow();
        window.setFlags(1024, 1024);
        if (AdUtil.f1336a >= 11) {
            if (this.f753r) {
                C0364g.m1391a("Enabling hardware acceleration on the AdActivity window.");
                C0373p.m1413a(window);
            } else {
                C0364g.m1391a("Disabling hardware acceleration on the AdActivity WebView.");
                c0238e.m1030g();
            }
        }
        ViewParent parent = c0238e.getParent();
        if (parent != null) {
            if (!z2) {
                m927a("Interstitial created with an AdWebView that has a parent.");
                return;
            } else if (!(parent instanceof ViewGroup)) {
                m927a("MRAID banner was not a child of a ViewGroup.");
                return;
            } else {
                this.f746k = (ViewGroup) parent;
                this.f746k.removeView(c0238e);
            }
        }
        if (c0238e.m1032i() != null) {
            m927a("Interstitial created with an AdWebView that is already in use by another AdActivity.");
            return;
        }
        setRequestedOrientation(i);
        c0238e.setAdActivity(this);
        View viewM938a = m938a(z2 ? 50 : 32, z3);
        this.f749n.addView(c0238e, -1, -1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (z2) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        }
        this.f749n.addView(viewM938a, layoutParams);
        this.f749n.setKeepScreenOn(true);
        setContentView(this.f749n);
        this.f749n.getRootView().setBackgroundColor(-16777216);
        if (z) {
            f736a.m1037a(c0238e);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m943a(C0256w c0256w) {
        this.f743h = null;
        this.f748m = SystemClock.elapsedRealtime();
        this.f751p = true;
        synchronized (f737b) {
            if (f738c == null) {
                f738c = this;
                c0256w.m1130u();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m944a(HashMap map, C0256w c0256w) {
        int i;
        if (map == null) {
            m927a("Could not get the paramMap in launchIntent()");
            return;
        }
        Intent intent = new Intent();
        String str = (String) map.get("u");
        String str2 = (String) map.get("m");
        String str3 = (String) map.get("i");
        String str4 = (String) map.get("p");
        String str5 = (String) map.get("c");
        String str6 = (String) map.get("f");
        String str7 = (String) map.get("e");
        boolean z = !TextUtils.isEmpty(str);
        boolean z2 = !TextUtils.isEmpty(str2);
        if (z && z2) {
            intent.setDataAndType(Uri.parse(str), str2);
        } else if (z) {
            intent.setData(Uri.parse(str));
        } else if (z2) {
            intent.setType(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.setAction(str3);
        } else if (z) {
            intent.setAction("android.intent.action.VIEW");
        }
        if (!TextUtils.isEmpty(str4) && AdUtil.f1336a >= 4) {
            C0371n.m1410a(intent, str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/");
            if (strArrSplit.length < 2) {
                C0364g.m1401e("Warning: Could not parse component name from open GMSG: " + str5);
            }
            intent.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        if (!TextUtils.isEmpty(str6)) {
            try {
                i = Integer.parseInt(str6);
            } catch (NumberFormatException e) {
                C0364g.m1401e("Warning: Could not parse flags from open GMSG: " + str6);
                i = 0;
            }
            intent.addFlags(i);
        }
        if (!TextUtils.isEmpty(str7)) {
            try {
                JSONObject jSONObject = new JSONObject(str7);
                JSONArray jSONArrayNames = jSONObject.names();
                for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                    String string = jSONArrayNames.getString(i2);
                    JSONObject jSONObject2 = jSONObject.getJSONObject(string);
                    int i3 = jSONObject2.getInt("t");
                    switch (i3) {
                        case C0467e.MapAttrs_cameraBearing /* 1 */:
                            intent.putExtra(string, jSONObject2.getBoolean("v"));
                            break;
                        case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                            intent.putExtra(string, jSONObject2.getDouble("v"));
                            break;
                        case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                            intent.putExtra(string, jSONObject2.getInt("v"));
                            break;
                        case C0467e.MapAttrs_cameraTilt /* 4 */:
                            intent.putExtra(string, jSONObject2.getLong("v"));
                            break;
                        case C0467e.MapAttrs_cameraZoom /* 5 */:
                            intent.putExtra(string, jSONObject2.getString("v"));
                            break;
                        default:
                            C0364g.m1401e("Warning: Unknown type in extras from open GMSG: " + string + " (type: " + i3 + ")");
                            break;
                    }
                }
            } catch (JSONException e2) {
                C0364g.m1401e("Warning: Could not parse extras from open GMSG: " + str7);
            }
        }
        if (intent.filterEquals(new Intent())) {
            m927a("Tried to launch empty intent.");
            return;
        }
        try {
            C0364g.m1391a("Launching an intent from AdActivity: " + intent);
            startActivity(intent);
            m943a(c0256w);
        } catch (ActivityNotFoundException e3) {
            m928a(e3.getMessage(), e3);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m945a(boolean z) {
        if (this.f744i != null) {
            this.f744i.removeAllViews();
            if (z) {
                return;
            }
            ImageButton imageButton = new ImageButton(this);
            imageButton.setImageResource(R.drawable.btn_dialog);
            imageButton.setBackgroundColor(0);
            imageButton.setOnClickListener(this);
            imageButton.setPadding(0, 0, 0, 0);
            this.f744i.addView(imageButton, new FrameLayout.LayoutParams(this.f745j, this.f745j, 17));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m946b(int i, int i2, int i3, int i4) {
        if (this.f755t == null) {
            this.f755t = m940a(this);
            this.f749n.addView(this.f755t, 0, m931c(i, i2, i3, i4));
            synchronized (f737b) {
                if (f739d == null) {
                    C0364g.m1401e("currentAdManager was null while trying to get the opening AdWebView.");
                } else {
                    f739d.m1121l().m1010b(false);
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean zM1033j;
        int iM1123n;
        boolean z = false;
        super.onCreate(bundle);
        this.f747l = false;
        synchronized (f737b) {
            if (f739d == null) {
                m927a("Could not get currentAdManager.");
                return;
            }
            C0256w c0256w = f739d;
            if (f740e == null) {
                f740e = this;
                c0256w.m1129t();
            }
            if (this.f750o == null && f741f != null) {
                this.f750o = f741f;
            }
            f741f = this;
            if ((c0256w.m1117h().m1303a() && f740e == this) || (c0256w.m1117h().m1304b() && this.f750o == f740e)) {
                c0256w.m1131v();
            }
            boolean zM1126q = c0256w.m1126q();
            C0316bs c0316bs = (C0316bs) ((C0315br) c0256w.m1117h().f1055d.m1378a()).f1035b.m1378a();
            this.f754s = AdUtil.f1336a >= ((Integer) c0316bs.f1038b.m1379a()).intValue();
            this.f753r = AdUtil.f1336a >= ((Integer) c0316bs.f1040d.m1379a()).intValue();
            this.f749n = null;
            this.f751p = false;
            this.f752q = true;
            this.f755t = null;
            Bundle bundleExtra = getIntent().getBundleExtra("com.google.ads.AdOpener");
            if (bundleExtra == null) {
                m927a("Could not get the Bundle used to create AdActivity.");
                return;
            }
            C0257x c0257x = new C0257x(bundleExtra);
            String strM1138b = c0257x.m1138b();
            HashMap mapM1139c = c0257x.m1139c();
            if (strM1138b.equals("intent")) {
                m944a(mapM1139c, c0256w);
                return;
            }
            this.f749n = new RelativeLayout(getApplicationContext());
            if (!strM1138b.equals("webapp")) {
                if (!strM1138b.equals("interstitial") && !strM1138b.equals("expand")) {
                    m927a("Unknown AdOpener, <action: " + strM1138b + ">");
                    return;
                }
                this.f743h = c0256w.m1120k();
                int iM1123n2 = c0256w.m1123n();
                if (strM1138b.equals("expand")) {
                    this.f743h.setIsExpandedMraid(true);
                    this.f752q = false;
                    if (mapM1139c != null && "1".equals(mapM1139c.get("custom_close"))) {
                        z = true;
                    }
                    if (!this.f753r || this.f754s) {
                        zM1033j = z;
                    } else {
                        C0364g.m1391a("Re-enabling hardware acceleration on expanding MRAID WebView.");
                        this.f743h.m1031h();
                        zM1033j = z;
                    }
                } else {
                    zM1033j = this.f743h.m1033j();
                }
                m942a(this.f743h, true, iM1123n2, zM1126q, zM1033j);
                return;
            }
            this.f743h = new C0238e(c0256w.m1117h(), null);
            C0227ad c0227adM1007a = C0227ad.m1007a(c0256w, C0241h.f824d, true, !zM1126q);
            c0227adM1007a.m1012d(true);
            if (zM1126q) {
                c0227adM1007a.m1008a(true);
            }
            this.f743h.setWebViewClient(c0227adM1007a);
            String str = (String) mapM1139c.get("u");
            String str2 = (String) mapM1139c.get("baseurl");
            String str3 = (String) mapM1139c.get("html");
            if (str != null) {
                this.f743h.loadUrl(str);
            } else {
                if (str3 == null) {
                    m927a("Could not get the URL or HTML parameter to show a web app.");
                    return;
                }
                this.f743h.loadDataWithBaseURL(str2, str3, "text/html", "utf-8", null);
            }
            String str4 = (String) mapM1139c.get("o");
            if ("p".equals(str4)) {
                iM1123n = AdUtil.m1361b();
            } else if ("l".equals(str4)) {
                iM1123n = AdUtil.m1343a();
            } else {
                iM1123n = this == f740e ? c0256w.m1123n() : -1;
            }
            m942a(this.f743h, false, iM1123n, zM1126q, mapM1139c != null && "1".equals(mapM1139c.get("custom_close")));
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.f749n != null) {
            this.f749n.removeAllViews();
        }
        if (isFinishing()) {
            m937h();
            if (this.f752q && this.f743h != null) {
                this.f743h.stopLoading();
                this.f743h.destroy();
                this.f743h = null;
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        if (isFinishing()) {
            m937h();
        }
        super.onPause();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (this.f751p && z && SystemClock.elapsedRealtime() - this.f748m > 250) {
            C0364g.m1399d("Launcher AdActivity got focus and is closing.");
            finish();
        }
        super.onWindowFocusChanged(z);
    }
}
