package com.google.ads.p003a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.ads.AdActivity;
import com.google.ads.AdView;
import com.google.ads.C0279at;
import com.google.ads.C0285az;
import com.google.ads.C0298ba;
import com.google.ads.C0300bc;
import com.google.ads.C0301bd;
import com.google.ads.C0305bh;
import com.google.ads.C0306bi;
import com.google.ads.C0308bk;
import com.google.ads.C0314bq;
import com.google.ads.C0315br;
import com.google.ads.C0316bs;
import com.google.ads.C0317bt;
import com.google.ads.C0333d;
import com.google.ads.C0337g;
import com.google.ads.C0339i;
import com.google.ads.EnumC0335e;
import com.google.ads.InterfaceC0222a;
import com.google.ads.InterfaceC0324c;
import com.google.ads.InterfaceC0338h;
import com.google.ads.InterfaceC0340j;
import com.google.ads.RunnableC0345o;
import com.google.ads.RunnableC0346p;
import com.google.ads.doubleclick.SwipeableDfpAdView;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0360c;
import com.google.ads.util.C0364g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.google.ads.a.w */
/* JADX INFO: loaded from: classes.dex */
public class C0256w {

    /* JADX INFO: renamed from: a */
    private static final Object f879a = new Object();

    /* JADX INFO: renamed from: b */
    private final C0317bt f882b;

    /* JADX INFO: renamed from: f */
    private C0238e f886f;

    /* JADX INFO: renamed from: g */
    private C0227ad f887g;

    /* JADX INFO: renamed from: i */
    private long f889i;

    /* JADX INFO: renamed from: j */
    private boolean f890j;

    /* JADX INFO: renamed from: o */
    private SharedPreferences f895o;

    /* JADX INFO: renamed from: q */
    private RunnableC0346p f897q;

    /* JADX INFO: renamed from: r */
    private boolean f898r;

    /* JADX INFO: renamed from: s */
    private LinkedList f899s;

    /* JADX INFO: renamed from: t */
    private LinkedList f900t;

    /* JADX INFO: renamed from: u */
    private LinkedList f901u;

    /* JADX INFO: renamed from: w */
    private Boolean f903w;

    /* JADX INFO: renamed from: x */
    private C0300bc f904x;

    /* JADX INFO: renamed from: y */
    private C0301bd f905y;

    /* JADX INFO: renamed from: z */
    private C0305bh f906z;

    /* JADX INFO: renamed from: h */
    private boolean f888h = false;

    /* JADX INFO: renamed from: v */
    private int f902v = -1;

    /* JADX INFO: renamed from: A */
    private String f880A = null;

    /* JADX INFO: renamed from: B */
    private String f881B = null;

    /* JADX INFO: renamed from: e */
    private C0225ab f885e = new C0225ab();

    /* JADX INFO: renamed from: c */
    private RunnableC0247n f883c = null;

    /* JADX INFO: renamed from: d */
    private C0333d f884d = null;

    /* JADX INFO: renamed from: k */
    private boolean f891k = false;

    /* JADX INFO: renamed from: p */
    private long f896p = 60000;

    /* JADX INFO: renamed from: l */
    private boolean f892l = false;

    /* JADX INFO: renamed from: n */
    private boolean f894n = false;

    /* JADX INFO: renamed from: m */
    private boolean f893m = true;

    public C0256w(InterfaceC0222a interfaceC0222a, Activity activity, C0337g c0337g, String str, ViewGroup viewGroup, boolean z) {
        this.f898r = z;
        C0226ac c0226acM1001a = c0337g == null ? C0226ac.f779a : C0226ac.m1001a(c0337g, activity.getApplicationContext());
        if (interfaceC0222a instanceof SwipeableDfpAdView) {
            c0226acM1001a.m1002a(true);
        }
        if (activity == null) {
            this.f882b = new C0317bt(C0315br.m1302a(), interfaceC0222a, interfaceC0222a instanceof AdView ? (AdView) interfaceC0222a : null, interfaceC0222a instanceof C0339i ? (C0339i) interfaceC0222a : null, str, null, null, viewGroup, c0226acM1001a, this);
            return;
        }
        synchronized (f879a) {
            this.f895o = activity.getApplicationContext().getSharedPreferences("GoogleAdMobAdsPrefs", 0);
            if (z) {
                long j = this.f895o.getLong("Timeout" + str, -1L);
                if (j < 0) {
                    this.f889i = 5000L;
                } else {
                    this.f889i = j;
                }
            } else {
                this.f889i = 60000L;
            }
        }
        this.f882b = new C0317bt(C0315br.m1302a(), interfaceC0222a, interfaceC0222a instanceof AdView ? (AdView) interfaceC0222a : null, interfaceC0222a instanceof C0339i ? (C0339i) interfaceC0222a : null, str, activity, activity.getApplicationContext(), viewGroup, c0226acM1001a, this);
        this.f897q = new RunnableC0346p(this);
        this.f899s = new LinkedList();
        this.f900t = new LinkedList();
        this.f901u = new LinkedList();
        m1091a();
        AdUtil.m1374h((Context) this.f882b.f1057f.m1378a());
        this.f904x = new C0300bc();
        this.f905y = new C0301bd(this);
        this.f903w = null;
        this.f906z = null;
    }

    /* JADX INFO: renamed from: a */
    private void m1087a(C0305bh c0305bh, Boolean bool) {
        List listM1284d = c0305bh.m1284d();
        if (listM1284d == null) {
            listM1284d = new ArrayList();
            listM1284d.add("http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@&adt=@gw_adt@&aec=@gw_aec@");
        }
        m1089a(listM1284d, c0305bh.m1281a(), c0305bh.m1282b(), c0305bh.m1283c(), bool, this.f885e.m977d(), this.f885e.m978e());
    }

    /* JADX INFO: renamed from: a */
    private void m1088a(List list, String str) {
        List arrayList;
        if (list == null) {
            arrayList = new ArrayList();
            arrayList.add("http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&adt=@gw_adt@&aec=@gw_aec@");
        } else {
            arrayList = list;
        }
        m1089a(arrayList, null, null, str, null, this.f885e.m977d(), this.f885e.m978e());
    }

    /* JADX INFO: renamed from: a */
    private void m1089a(List list, String str, String str2, String str3, Boolean bool, String str4, String str5) {
        String strM1348a = AdUtil.m1348a((Context) this.f882b.f1057f.m1378a());
        C0285az c0285azM1233a = C0285az.m1233a();
        String string = c0285azM1233a.m1236b().toString();
        String string2 = c0285azM1233a.m1237c().toString();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            new Thread(new RunnableC0345o(C0306bi.m1286a((String) it.next(), (String) this.f882b.f1059h.m1378a(), bool, strM1348a, str, str2, str3, string, string2, str4, str5), (Context) this.f882b.f1057f.m1378a())).start();
        }
        this.f885e.m975b();
    }

    /* JADX INFO: renamed from: A */
    public LinkedList m1090A() {
        return this.f900t;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1091a() {
        C0337g c0337gM1006c = ((C0226ac) this.f882b.f1058g.m1378a()).m1006c();
        this.f886f = AdUtil.f1336a >= 14 ? new C0360c(this.f882b, c0337gM1006c) : new C0238e(this.f882b, c0337gM1006c);
        this.f886f.setVisibility(8);
        this.f887g = C0227ad.m1007a(this, C0241h.f824d, true, this.f882b.m1304b());
        this.f886f.setWebViewClient(this.f887g);
        if (AdUtil.f1336a < ((Integer) ((C0316bs) ((C0315br) this.f882b.f1055d.m1378a()).f1035b.m1378a()).f1038b.m1379a()).intValue() && !((C0226ac) this.f882b.f1058g.m1378a()).m1003a()) {
            C0364g.m1391a("Disabling hardware acceleration for a banner.");
            this.f886f.m1030g();
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1092a(float f) {
        long j = this.f896p;
        this.f896p = (long) (1000.0f * f);
        if (m1127r() && this.f896p != j) {
            m1114e();
            m1115f();
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1093a(int i) {
        this.f902v = i;
    }

    /* JADX INFO: renamed from: a */
    public void m1094a(int i, int i2, int i3, int i4) {
        int iM963c;
        int i5;
        C0223a c0223a = (C0223a) this.f882b.f1056e.m1378a();
        int iM1344a = AdUtil.m1344a((Context) this.f882b.f1057f.m1378a(), i3 < 0 ? ((C0226ac) this.f882b.f1058g.m1378a()).m1006c().m1327a() : i3);
        Context context = (Context) this.f882b.f1057f.m1378a();
        if (i4 < 0) {
            i4 = ((C0226ac) this.f882b.f1058g.m1378a()).m1006c().m1328b();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM1344a, AdUtil.m1344a(context, i4));
        if (i3 < 0) {
            iM963c = 0;
            i5 = 0;
        } else {
            iM963c = i2;
            i5 = i;
        }
        int iM964d = i5 < 0 ? ((C0223a) this.f882b.f1056e.m1378a()).m964d() : i5;
        if (iM963c < 0) {
            iM963c = ((C0223a) this.f882b.f1056e.m1378a()).m963c();
        }
        ((C0223a) this.f882b.f1056e.m1378a()).setXPosition(iM964d);
        ((C0223a) this.f882b.f1056e.m1378a()).setYPosition(iM963c);
        layoutParams.setMargins(AdUtil.m1344a((Context) this.f882b.f1057f.m1378a(), iM964d), AdUtil.m1344a((Context) this.f882b.f1057f.m1378a(), iM963c), 0, 0);
        c0223a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    public void m1095a(long j) {
        synchronized (f879a) {
            SharedPreferences.Editor editorEdit = this.f895o.edit();
            editorEdit.putLong("Timeout" + this.f882b.f1059h, j);
            editorEdit.commit();
            if (this.f898r) {
                this.f889i = j;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1096a(View view) {
        ((ViewGroup) this.f882b.f1060i.m1378a()).setVisibility(0);
        ((ViewGroup) this.f882b.f1060i.m1378a()).removeAllViews();
        ((ViewGroup) this.f882b.f1060i.m1378a()).addView(view);
        if (((C0226ac) this.f882b.f1058g.m1378a()).m1005b()) {
            ((C0256w) this.f882b.f1053b.m1378a()).m1099a((C0314bq) this.f882b.f1063l.m1379a(), false, -1, -1, -1, -1);
            if (((C0223a) this.f882b.f1056e.m1378a()).m961a()) {
                ((ViewGroup) this.f882b.f1060i.m1378a()).addView((View) this.f882b.f1056e.m1378a(), AdUtil.m1344a((Context) this.f882b.f1057f.m1378a(), ((C0226ac) this.f882b.f1058g.m1378a()).m1006c().m1327a()), AdUtil.m1344a((Context) this.f882b.f1057f.m1378a(), ((C0226ac) this.f882b.f1058g.m1378a()).m1006c().m1328b()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1097a(View view, C0308bk c0308bk, C0305bh c0305bh, boolean z) {
        C0364g.m1391a("AdManager.onReceiveGWhirlAd() called.");
        this.f891k = true;
        this.f906z = c0305bh;
        if (this.f882b.m1303a()) {
            m1096a(view);
            m1087a(c0305bh, Boolean.valueOf(z));
        }
        this.f905y.m1279a(c0308bk);
        InterfaceC0324c interfaceC0324c = (InterfaceC0324c) this.f882b.f1066o.m1379a();
        if (interfaceC0324c != null) {
            interfaceC0324c.m1306a((InterfaceC0222a) this.f882b.f1052a.m1378a());
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1098a(C0298ba c0298ba) {
        this.f883c = null;
        this.f905y.m1278a(c0298ba, this.f884d);
    }

    /* JADX INFO: renamed from: a */
    public void m1099a(C0314bq c0314bq, boolean z, int i, int i2, int i3, int i4) {
        ((C0223a) this.f882b.f1056e.m1378a()).setOverlayActivated(!z);
        m1094a(i, i2, i3, i4);
        if (this.f882b.f1068q.m1379a() != null) {
            if (z) {
                ((InterfaceC0340j) this.f882b.f1068q.m1379a()).m1333a((InterfaceC0222a) this.f882b.f1052a.m1378a());
            } else {
                ((InterfaceC0340j) this.f882b.f1068q.m1379a()).m1334b((InterfaceC0222a) this.f882b.f1052a.m1378a());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1100a(C0333d c0333d) {
        C0364g.m1399d("v6.4.1 RC00");
        if (this.f888h) {
            C0364g.m1401e("loadAd called after ad was destroyed.");
        } else if (m1125p()) {
            C0364g.m1401e("loadAd called while the ad is already loading, so aborting.");
        } else if (AdActivity.m930b()) {
            C0364g.m1401e("loadAd called while an interstitial or landing page is displayed, so aborting");
        } else if (AdUtil.m1368c((Context) this.f882b.f1057f.m1378a()) && AdUtil.m1366b((Context) this.f882b.f1057f.m1378a())) {
            if (C0279at.m1214a((Context) this.f882b.f1057f.m1378a(), this.f895o.getLong("GoogleAdMobDoritosLife", 60000L))) {
                C0279at.m1213a((Activity) this.f882b.f1054c.m1381a());
            }
            this.f891k = false;
            this.f899s.clear();
            this.f900t.clear();
            this.f884d = c0333d;
            if (this.f904x.m1266a()) {
                this.f905y.m1278a(this.f904x.m1267b(), c0333d);
            } else {
                C0314bq c0314bq = new C0314bq(this.f882b);
                this.f882b.f1064m.m1380a(c0314bq);
                this.f883c = (RunnableC0247n) c0314bq.f1031b.m1379a();
                this.f883c.m1070a(c0333d);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1101a(EnumC0335e enumC0335e) {
        this.f883c = null;
        if (enumC0335e == EnumC0335e.NETWORK_ERROR) {
            m1092a(60.0f);
            if (!m1127r()) {
                m1116g();
            }
        }
        if (this.f882b.m1304b()) {
            if (enumC0335e == EnumC0335e.NO_FILL) {
                this.f885e.m969B();
            } else if (enumC0335e == EnumC0335e.NETWORK_ERROR) {
                this.f885e.m999z();
            }
        }
        C0364g.m1397c("onFailedToReceiveAd(" + enumC0335e + ")");
        InterfaceC0324c interfaceC0324c = (InterfaceC0324c) this.f882b.f1066o.m1379a();
        if (interfaceC0324c != null) {
            interfaceC0324c.m1307a((InterfaceC0222a) this.f882b.f1052a.m1378a(), enumC0335e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1102a(String str) {
        this.f881B = str;
        Uri uriBuild = new Uri.Builder().encodedQuery(str).build();
        StringBuilder sb = new StringBuilder();
        HashMap mapM1364b = AdUtil.m1364b(uriBuild);
        for (String str2 : mapM1364b.keySet()) {
            sb.append(str2).append(" = ").append((String) mapM1364b.get(str2)).append("\n");
        }
        this.f880A = sb.toString().trim();
        if (TextUtils.isEmpty(this.f880A)) {
            this.f880A = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1103a(String str, String str2) {
        InterfaceC0338h interfaceC0338h = (InterfaceC0338h) this.f882b.f1067p.m1379a();
        if (interfaceC0338h != null) {
            interfaceC0338h.m1332a((InterfaceC0222a) this.f882b.f1052a.m1378a(), str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    protected synchronized void m1104a(LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C0364g.m1391a("Adding a click tracking URL: " + ((String) it.next()));
        }
        this.f901u = linkedList;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1105a(boolean z) {
        this.f890j = z;
    }

    /* JADX INFO: renamed from: b */
    public String m1106b() {
        return this.f880A;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m1107b(long j) {
        if (j > 0) {
            this.f895o.edit().putLong("GoogleAdMobDoritosLife", j).commit();
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m1108b(C0298ba c0298ba) {
        C0364g.m1391a("AdManager.onGWhirlNoFill() called.");
        m1088a(c0298ba.m1263i(), c0298ba.m1257c());
        InterfaceC0324c interfaceC0324c = (InterfaceC0324c) this.f882b.f1066o.m1379a();
        if (interfaceC0324c != null) {
            interfaceC0324c.m1307a((InterfaceC0222a) this.f882b.f1052a.m1378a(), EnumC0335e.NO_FILL);
        }
    }

    /* JADX INFO: renamed from: b */
    protected synchronized void m1109b(String str) {
        C0364g.m1391a("Adding a tracking URL: " + str);
        this.f899s.add(str);
    }

    /* JADX INFO: renamed from: b */
    public void m1110b(boolean z) {
        this.f903w = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: c */
    public String m1111c() {
        return this.f881B;
    }

    /* JADX INFO: renamed from: c */
    protected synchronized void m1112c(String str) {
        C0364g.m1391a("Adding a manual tracking URL: " + str);
        m1090A().add(str);
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m1113d() {
        this.f893m = false;
        C0364g.m1391a("Refreshing is no longer allowed on this AdView.");
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m1114e() {
        if (this.f892l) {
            C0364g.m1391a("Disabling refreshing.");
            ((Handler) C0315br.m1302a().f1036c.m1378a()).removeCallbacks(this.f897q);
            this.f892l = false;
        } else {
            C0364g.m1391a("Refreshing is already disabled.");
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m1115f() {
        this.f894n = false;
        if (!this.f882b.m1303a()) {
            C0364g.m1391a("Tried to enable refreshing on something other than an AdView.");
        } else if (!this.f893m) {
            C0364g.m1391a("Refreshing disabled on this AdView");
        } else if (this.f892l) {
            C0364g.m1391a("Refreshing is already enabled.");
        } else {
            C0364g.m1391a("Enabling refreshing every " + this.f896p + " milliseconds.");
            ((Handler) C0315br.m1302a().f1036c.m1378a()).postDelayed(this.f897q, this.f896p);
            this.f892l = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1116g() {
        m1115f();
        this.f894n = true;
    }

    /* JADX INFO: renamed from: h */
    public C0317bt m1117h() {
        return this.f882b;
    }

    /* JADX INFO: renamed from: i */
    public synchronized C0300bc m1118i() {
        return this.f904x;
    }

    /* JADX INFO: renamed from: j */
    public synchronized RunnableC0247n m1119j() {
        return this.f883c;
    }

    /* JADX INFO: renamed from: k */
    public synchronized C0238e m1120k() {
        return this.f886f;
    }

    /* JADX INFO: renamed from: l */
    public synchronized C0227ad m1121l() {
        return this.f887g;
    }

    /* JADX INFO: renamed from: m */
    public C0225ab m1122m() {
        return this.f885e;
    }

    /* JADX INFO: renamed from: n */
    public synchronized int m1123n() {
        return this.f902v;
    }

    /* JADX INFO: renamed from: o */
    public long m1124o() {
        return this.f889i;
    }

    /* JADX INFO: renamed from: p */
    public synchronized boolean m1125p() {
        return this.f883c != null;
    }

    /* JADX INFO: renamed from: q */
    public synchronized boolean m1126q() {
        return this.f890j;
    }

    /* JADX INFO: renamed from: r */
    public synchronized boolean m1127r() {
        return this.f892l;
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m1128s() {
        this.f885e.m970C();
        C0364g.m1397c("onDismissScreen()");
        InterfaceC0324c interfaceC0324c = (InterfaceC0324c) this.f882b.f1066o.m1379a();
        if (interfaceC0324c != null) {
            interfaceC0324c.m1309c((InterfaceC0222a) this.f882b.f1052a.m1378a());
        }
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m1129t() {
        C0364g.m1397c("onPresentScreen()");
        InterfaceC0324c interfaceC0324c = (InterfaceC0324c) this.f882b.f1066o.m1379a();
        if (interfaceC0324c != null) {
            interfaceC0324c.m1308b((InterfaceC0222a) this.f882b.f1052a.m1378a());
        }
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m1130u() {
        C0364g.m1397c("onLeaveApplication()");
        InterfaceC0324c interfaceC0324c = (InterfaceC0324c) this.f882b.f1066o.m1379a();
        if (interfaceC0324c != null) {
            interfaceC0324c.m1310d((InterfaceC0222a) this.f882b.f1052a.m1378a());
        }
    }

    /* JADX INFO: renamed from: v */
    public void m1131v() {
        this.f885e.m979f();
        m1134y();
    }

    /* JADX INFO: renamed from: w */
    public synchronized void m1132w() {
        Activity activity = (Activity) this.f882b.f1054c.m1381a();
        if (activity == null) {
            C0364g.m1401e("activity was null while trying to ping tracking URLs.");
        } else {
            Iterator it = this.f899s.iterator();
            while (it.hasNext()) {
                new Thread(new RunnableC0345o((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public synchronized void m1133x() {
        if (!this.f888h) {
            if (this.f884d == null) {
                C0364g.m1391a("Tried to refresh before calling loadAd().");
            } else if (this.f882b.m1303a()) {
                if (((AdView) this.f882b.f1061j.m1378a()).isShown() && AdUtil.m1370d()) {
                    C0364g.m1397c("Refreshing ad.");
                    m1100a(this.f884d);
                } else {
                    C0364g.m1391a("Not refreshing because the ad is not visible.");
                }
                if (this.f894n) {
                    m1114e();
                } else {
                    ((Handler) C0315br.m1302a().f1036c.m1378a()).postDelayed(this.f897q, this.f896p);
                }
            } else {
                C0364g.m1391a("Tried to refresh an ad that wasn't an AdView.");
            }
        }
    }

    /* JADX INFO: renamed from: y */
    protected synchronized void m1134y() {
        Activity activity = (Activity) this.f882b.f1054c.m1381a();
        if (activity == null) {
            C0364g.m1401e("activity was null while trying to ping click tracking URLs.");
        } else {
            Iterator it = this.f901u.iterator();
            while (it.hasNext()) {
                new Thread(new RunnableC0345o((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    protected synchronized void m1135z() {
        this.f883c = null;
        this.f891k = true;
        this.f886f.setVisibility(0);
        if (this.f882b.m1303a()) {
            m1096a(this.f886f);
        }
        this.f885e.m980g();
        if (this.f882b.m1303a()) {
            m1132w();
        }
        C0364g.m1397c("onReceiveAd()");
        InterfaceC0324c interfaceC0324c = (InterfaceC0324c) this.f882b.f1066o.m1379a();
        if (interfaceC0324c != null) {
            interfaceC0324c.m1306a((InterfaceC0222a) this.f882b.f1052a.m1378a());
        }
        this.f882b.f1063l.m1380a(this.f882b.f1064m.m1379a());
        this.f882b.f1064m.m1380a(null);
    }
}
