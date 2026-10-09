package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ads.p003a.C0226ac;
import com.google.ads.p003a.C0230ag;
import com.google.ads.p003a.C0238e;
import com.google.ads.p003a.C0241h;
import com.google.ads.p003a.C0246m;
import com.google.ads.p003a.C0256w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0364g;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class AdView extends RelativeLayout implements InterfaceC0222a {

    /* JADX INFO: renamed from: b */
    private static final C0241h f756b = (C0241h) C0241h.f821a.mo1047b();

    /* JADX INFO: renamed from: a */
    protected C0256w f757a;

    public AdView(Activity activity, C0337g c0337g, String str) {
        super(activity.getApplicationContext());
        try {
            m951a(activity, c0337g, (AttributeSet) null);
            m955b(activity, c0337g, null);
            m947a(activity, c0337g, str);
        } catch (C0246m e) {
            m949a(activity, e.m1050c("Could not initialize AdView"), c0337g, (AttributeSet) null);
            e.m1048a("Could not initialize AdView");
        }
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m948a(context, attributeSet);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private void m947a(Activity activity, C0337g c0337g, String str) {
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setFocusable(false);
        this.f757a = new C0256w(this, activity, c0337g, str, frameLayout, false);
        setGravity(17);
        try {
            ViewGroup viewGroupM1016a = C0230ag.m1016a(activity, this.f757a);
            if (viewGroupM1016a != null) {
                viewGroupM1016a.addView(frameLayout, -2, -2);
                addView(viewGroupM1016a, -2, -2);
            } else {
                addView(frameLayout, -2, -2);
            }
        } catch (VerifyError e) {
            C0364g.m1392a("Gestures disabled: Not supported on this version of Android.", e);
            addView(frameLayout, -2, -2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m948a(Context context, AttributeSet attributeSet) {
        C0337g[] c0337gArr;
        C0246m c0246m;
        if (attributeSet == null) {
            return;
        }
        try {
            String strM954b = m954b("adSize", context, attributeSet, true);
            C0337g[] c0337gArrM960a = m960a(strM954b);
            if (c0337gArrM960a != null) {
                try {
                    if (c0337gArrM960a.length != 0) {
                        if (!m953a("adUnitId", attributeSet)) {
                            throw new C0246m("Required XML attribute \"adUnitId\" missing", true);
                        }
                        if (isInEditMode()) {
                            m957a(context, "Ads by Google", -1, c0337gArrM960a[0], attributeSet);
                            return;
                        }
                        String strM954b2 = m954b("adUnitId", context, attributeSet, true);
                        boolean zM952a = m952a("loadAdOnCreate", context, attributeSet, false);
                        if (!(context instanceof Activity)) {
                            throw new C0246m("AdView was initialized with a Context that wasn't an Activity.", true);
                        }
                        Activity activity = (Activity) context;
                        m951a(activity, c0337gArrM960a[0], attributeSet);
                        m955b(activity, c0337gArrM960a[0], attributeSet);
                        if (c0337gArrM960a.length == 1) {
                            m947a(activity, c0337gArrM960a[0], strM954b2);
                        } else {
                            m947a(activity, new C0337g(0, 0), strM954b2);
                            m950a(c0337gArrM960a);
                        }
                        if (zM952a) {
                            Set setM956c = m956c("testDevices", context, attributeSet, false);
                            if (setM956c.contains("TEST_EMULATOR")) {
                                setM956c.remove("TEST_EMULATOR");
                                setM956c.add(C0333d.f1093a);
                            }
                            m958a(new C0333d().m1319b(setM956c).m1317a(m956c("keywords", context, attributeSet, false)));
                            return;
                        }
                        return;
                    }
                } catch (C0246m e) {
                    c0246m = e;
                    c0337gArr = c0337gArrM960a;
                    m949a(context, c0246m.m1050c("Could not initialize AdView"), (c0337gArr == null || c0337gArr.length <= 0) ? C0337g.f1118b : c0337gArr[0], attributeSet);
                    c0246m.m1048a("Could not initialize AdView");
                    if (isInEditMode()) {
                        return;
                    }
                    c0246m.m1049b("Could not initialize AdView");
                    return;
                }
            }
            throw new C0246m("Attribute \"adSize\" invalid: " + strM954b, true);
        } catch (C0246m e2) {
            c0337gArr = null;
            c0246m = e2;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m949a(Context context, String str, C0337g c0337g, AttributeSet attributeSet) {
        C0364g.m1395b(str);
        m957a(context, str, -65536, c0337g, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private void m950a(C0337g... c0337gArr) {
        C0337g[] c0337gArr2 = new C0337g[c0337gArr.length];
        for (int i = 0; i < c0337gArr.length; i++) {
            c0337gArr2[i] = C0337g.m1324a(c0337gArr[i], getContext());
        }
        this.f757a.m1117h().f1065n.m1380a(c0337gArr2);
    }

    /* JADX INFO: renamed from: a */
    private boolean m951a(Context context, C0337g c0337g, AttributeSet attributeSet) {
        if (AdUtil.m1368c(context)) {
            return true;
        }
        m949a(context, "You must have AdActivity declared in AndroidManifest.xml with configChanges.", c0337g, attributeSet);
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m952a(String str, Context context, AttributeSet attributeSet, boolean z) throws C0246m {
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", str);
        boolean attributeBooleanValue = attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/lib/com.google.ads", str, z);
        if (attributeValue != null) {
            String packageName = context.getPackageName();
            if (attributeValue.matches("^@([^:]+)\\:(.*)$")) {
                packageName = attributeValue.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
                attributeValue = attributeValue.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
            }
            if (attributeValue.startsWith("@bool/")) {
                String strSubstring = attributeValue.substring("@bool/".length());
                TypedValue typedValue = new TypedValue();
                try {
                    getResources().getValue(packageName + ":bool/" + strSubstring, typedValue, true);
                    if (typedValue.type == 18) {
                        return typedValue.data != 0;
                    }
                    throw new C0246m("Resource " + str + " was not a boolean: " + typedValue, true);
                } catch (Resources.NotFoundException e) {
                    throw new C0246m("Could not find resource for " + str + ": " + attributeValue, true, e);
                }
            }
        }
        return attributeBooleanValue;
    }

    /* JADX INFO: renamed from: a */
    private boolean m953a(String str, AttributeSet attributeSet) {
        return attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", str) != null;
    }

    /* JADX INFO: renamed from: b */
    private String m954b(String str, Context context, AttributeSet attributeSet, boolean z) throws C0246m {
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", str);
        if (attributeValue != null) {
            String packageName = context.getPackageName();
            if (attributeValue.matches("^@([^:]+)\\:(.*)$")) {
                packageName = attributeValue.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
                attributeValue = attributeValue.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
            }
            if (attributeValue.startsWith("@string/")) {
                String strSubstring = attributeValue.substring("@string/".length());
                TypedValue typedValue = new TypedValue();
                try {
                    getResources().getValue(packageName + ":string/" + strSubstring, typedValue, true);
                    if (typedValue.string == null) {
                        throw new C0246m("Resource " + str + " was not a string: " + typedValue, true);
                    }
                    attributeValue = typedValue.string.toString();
                } catch (Resources.NotFoundException e) {
                    throw new C0246m("Could not find resource for " + str + ": " + attributeValue, true, e);
                }
            }
        }
        if (z && attributeValue == null) {
            throw new C0246m("Required XML attribute \"" + str + "\" missing", true);
        }
        return attributeValue;
    }

    /* JADX INFO: renamed from: b */
    private boolean m955b(Context context, C0337g c0337g, AttributeSet attributeSet) {
        if (AdUtil.m1366b(context)) {
            return true;
        }
        m949a(context, "You must have INTERNET and ACCESS_NETWORK_STATE permissions in AndroidManifest.xml.", c0337g, attributeSet);
        return false;
    }

    /* JADX INFO: renamed from: c */
    private Set m956c(String str, Context context, AttributeSet attributeSet, boolean z) throws C0246m {
        String strM954b = m954b(str, context, attributeSet, z);
        HashSet hashSet = new HashSet();
        if (strM954b != null) {
            String[] strArrSplit = strM954b.split(",");
            for (String str2 : strArrSplit) {
                String strTrim = str2.trim();
                if (strTrim.length() != 0) {
                    hashSet.add(strTrim);
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    void m957a(Context context, String str, int i, C0337g c0337g, AttributeSet attributeSet) {
        if (c0337g == null) {
            c0337g = C0337g.f1118b;
        }
        C0337g c0337gM1324a = C0337g.m1324a(c0337g, context.getApplicationContext());
        if (getChildCount() == 0) {
            TextView textView = attributeSet == null ? new TextView(context) : new TextView(context, attributeSet);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(-16777216);
            LinearLayout linearLayout = attributeSet == null ? new LinearLayout(context) : new LinearLayout(context, attributeSet);
            linearLayout.setGravity(17);
            LinearLayout linearLayout2 = attributeSet == null ? new LinearLayout(context) : new LinearLayout(context, attributeSet);
            linearLayout2.setGravity(17);
            linearLayout2.setBackgroundColor(i);
            int iM1344a = AdUtil.m1344a(context, c0337gM1324a.m1327a());
            int iM1344a2 = AdUtil.m1344a(context, c0337gM1324a.m1328b());
            linearLayout.addView(textView, iM1344a - 2, iM1344a2 - 2);
            linearLayout2.addView(linearLayout);
            addView(linearLayout2, iM1344a, iM1344a2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m958a(C0333d c0333d) {
        if (this.f757a != null) {
            if (m959a()) {
                this.f757a.m1114e();
            }
            this.f757a.m1100a(c0333d);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m959a() {
        if (this.f757a == null) {
            return false;
        }
        return this.f757a.m1127r();
    }

    /* JADX INFO: renamed from: a */
    C0337g[] m960a(String str) {
        C0337g c0337g;
        String[] strArrSplit = str.split(",");
        C0337g[] c0337gArr = new C0337g[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    c0337g = new C0337g("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException e) {
                    return null;
                }
            } else if ("BANNER".equals(strTrim)) {
                c0337g = C0337g.f1118b;
            } else if ("SMART_BANNER".equals(strTrim)) {
                c0337g = C0337g.f1117a;
            } else if ("IAB_MRECT".equals(strTrim)) {
                c0337g = C0337g.f1119c;
            } else if ("IAB_BANNER".equals(strTrim)) {
                c0337g = C0337g.f1120d;
            } else if ("IAB_LEADERBOARD".equals(strTrim)) {
                c0337g = C0337g.f1121e;
            } else {
                c0337g = "IAB_WIDE_SKYSCRAPER".equals(strTrim) ? C0337g.f1122f : null;
            }
            if (c0337g == null) {
                return null;
            }
            c0337gArr[i] = c0337g;
        }
        return c0337gArr;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        C0238e c0238eM1120k;
        if (!isInEditMode() && (c0238eM1120k = this.f757a.m1120k()) != null) {
            c0238eM1120k.setVisibility(0);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (isInEditMode() || !((C0226ac) this.f757a.m1117h().f1058g.m1378a()).m1005b() || i == 0 || this.f757a.m1117h().f1063l.m1379a() == null || this.f757a.m1117h().f1056e.m1378a() == null) {
            return;
        }
        if (!AdActivity.m930b() || AdActivity.m932c()) {
            f756b.m1039a((WebView) this.f757a.m1117h().f1056e.m1378a(), "onleaveapp", null);
        } else {
            f756b.m1039a((WebView) this.f757a.m1117h().f1056e.m1378a(), "onopeninapp", null);
        }
    }

    public void setAdListener(InterfaceC0324c interfaceC0324c) {
        this.f757a.m1117h().f1066o.m1380a(interfaceC0324c);
    }

    protected void setAppEventListener(InterfaceC0338h interfaceC0338h) {
        this.f757a.m1117h().f1067p.m1380a(interfaceC0338h);
    }

    protected void setSupportedAdSizes(C0337g... c0337gArr) {
        if (this.f757a.m1117h().f1065n.m1379a() == null) {
            C0364g.m1401e("Warning: Tried to set supported ad sizes on a single-size AdView. AdSizes ignored. To create a multi-sized AdView, use an AdView constructor that takes in an AdSize[] array.");
        } else {
            m950a(c0337gArr);
        }
    }

    protected void setSwipeableEventListener(InterfaceC0340j interfaceC0340j) {
        this.f757a.m1117h().f1068q.m1380a(interfaceC0340j);
    }
}
