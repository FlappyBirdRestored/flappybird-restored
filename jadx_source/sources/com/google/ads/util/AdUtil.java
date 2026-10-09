package com.google.ads.util;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.webkit.WebView;
import com.google.ads.AdActivity;
import com.google.android.gms.C0467e;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AdUtil {

    /* JADX INFO: renamed from: d */
    private static String f1339d;

    /* JADX INFO: renamed from: f */
    private static AudioManager f1341f;

    /* JADX INFO: renamed from: a */
    public static final int f1336a = m1346a(Build.VERSION.SDK);

    /* JADX INFO: renamed from: b */
    private static Boolean f1337b = null;

    /* JADX INFO: renamed from: c */
    private static String f1338c = null;

    /* JADX INFO: renamed from: e */
    private static String f1340e = null;

    /* JADX INFO: renamed from: g */
    private static boolean f1342g = true;

    /* JADX INFO: renamed from: h */
    private static boolean f1343h = false;

    /* JADX INFO: renamed from: i */
    private static String f1344i = null;

    public class UserActivityReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.USER_PRESENT")) {
                AdUtil.m1355a(true);
            } else if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                AdUtil.m1355a(false);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m1343a() {
        return f1336a >= 9 ? 6 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m1344a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: a */
    public static int m1345a(Context context, DisplayMetrics displayMetrics) {
        return f1336a >= 4 ? C0371n.m1409a(context, displayMetrics) : displayMetrics.heightPixels;
    }

    /* JADX INFO: renamed from: a */
    public static int m1346a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            C0364g.m1401e("The Android SDK version couldn't be parsed to an int: " + Build.VERSION.SDK);
            C0364g.m1401e("Defaulting to Android SDK version 3.");
            return 3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static DisplayMetrics m1347a(Activity activity) {
        if (activity.getWindowManager() == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX INFO: renamed from: a */
    public static String m1348a(Context context) {
        if (f1338c == null) {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            String strM1363b = (string == null || m1367c()) ? m1363b("emulator") : m1363b(string);
            if (strM1363b == null) {
                return null;
            }
            f1338c = strM1363b.toUpperCase(Locale.US);
        }
        return f1338c;
    }

    /* JADX INFO: renamed from: a */
    public static String m1349a(Readable readable) throws IOException {
        StringBuilder sb = new StringBuilder();
        CharBuffer charBufferAllocate = CharBuffer.allocate(2048);
        while (true) {
            int i = readable.read(charBufferAllocate);
            if (i == -1) {
                return sb.toString();
            }
            charBufferAllocate.flip();
            sb.append((CharSequence) charBufferAllocate, 0, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1350a(Map map) {
        try {
            return m1365b(map).toString();
        } catch (JSONException e) {
            C0364g.m1400d("JsonException in serialization: ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m1351a(Location location) {
        if (location == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("time", Long.valueOf(location.getTime() * 1000));
        map.put("lat", Long.valueOf((long) (location.getLatitude() * 1.0E7d)));
        map.put("long", Long.valueOf((long) (location.getLongitude() * 1.0E7d)));
        map.put("radius", Long.valueOf((long) (location.getAccuracy() * 1000.0f)));
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1352a(Set set) {
        JSONArray jSONArray = new JSONArray();
        if (set == null || set.isEmpty()) {
            return jSONArray;
        }
        for (Object obj : set) {
            if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof Float)) {
                jSONArray.put(obj);
            } else if (obj instanceof Map) {
                try {
                    jSONArray.put(m1365b((Map) obj));
                } catch (ClassCastException e) {
                    C0364g.m1400d("Unknown map type in json serialization: ", e);
                }
            } else if (obj instanceof Set) {
                try {
                    jSONArray.put(m1352a((Set) obj));
                } catch (ClassCastException e2) {
                    C0364g.m1400d("Unknown map type in json serialization: ", e2);
                }
            } else {
                C0364g.m1401e("Unknown value in json serialization: " + obj);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static void m1353a(WebView webView) {
        webView.getSettings().setUserAgentString(m1375i(webView.getContext().getApplicationContext()));
    }

    /* JADX INFO: renamed from: a */
    public static void m1354a(HttpURLConnection httpURLConnection, Context context) {
        httpURLConnection.setRequestProperty("User-Agent", m1375i(context));
    }

    /* JADX INFO: renamed from: a */
    public static void m1355a(boolean z) {
        f1342g = z;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1356a(int i, int i2, String str) {
        if ((i & i2) != 0) {
            return true;
        }
        C0364g.m1395b("The android:configChanges value of the com.google.ads.AdActivity must include " + str + ".");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1357a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1358a(Intent intent, Context context) {
        return context.getPackageManager().resolveActivity(intent, 65536) != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1359a(Uri uri) {
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    /* JADX INFO: renamed from: a */
    static boolean m1360a(C0370m c0370m) {
        if (c0370m == null) {
            c0370m = C0370m.f1382d;
        }
        return c0370m.equals(C0370m.f1383e) || c0370m.equals(C0370m.f1384f);
    }

    /* JADX INFO: renamed from: b */
    public static int m1361b() {
        return f1336a >= 9 ? 7 : 1;
    }

    /* JADX INFO: renamed from: b */
    public static int m1362b(Context context, DisplayMetrics displayMetrics) {
        return f1336a >= 4 ? C0371n.m1411b(context, displayMetrics) : displayMetrics.widthPixels;
    }

    /* JADX INFO: renamed from: b */
    public static String m1363b(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(), 0, str.length());
            return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            return str.substring(0, 32);
        }
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m1364b(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null) {
            String[] strArrSplit = encodedQuery.split("&");
            for (String str : strArrSplit) {
                int iIndexOf = str.indexOf("=");
                if (iIndexOf < 0) {
                    map.put(Uri.decode(str), null);
                } else {
                    map.put(Uri.decode(str.substring(0, iIndexOf)), Uri.decode(str.substring(iIndexOf + 1, str.length())));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m1365b(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map == null || map.isEmpty()) {
            return jSONObject;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof Float)) {
                jSONObject.put(str, obj);
            } else if (obj instanceof Map) {
                try {
                    jSONObject.put(str, m1365b((Map) obj));
                } catch (ClassCastException e) {
                    C0364g.m1400d("Unknown map type in json serialization: ", e);
                }
            } else if (obj instanceof Set) {
                try {
                    jSONObject.put(str, m1352a((Set) obj));
                } catch (ClassCastException e2) {
                    C0364g.m1400d("Unknown map type in json serialization: ", e2);
                }
            } else {
                C0364g.m1401e("Unknown value in json serialization: " + obj);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1366b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (packageManager.checkPermission("android.permission.INTERNET", packageName) == -1) {
            C0364g.m1395b("INTERNET permissions must be enabled in AndroidManifest.xml.");
            return false;
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", packageName) != -1) {
            return true;
        }
        C0364g.m1395b("ACCESS_NETWORK_STATE permissions must be enabled in AndroidManifest.xml.");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1367c() {
        return m1360a((C0370m) null);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1368c(Context context) {
        if (f1337b != null) {
            return f1337b.booleanValue();
        }
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent(context, (Class<?>) AdActivity.class), 65536);
        f1337b = true;
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null) {
            C0364g.m1395b("Could not find com.google.ads.AdActivity, please make sure it is registered in AndroidManifest.xml.");
            f1337b = false;
        } else {
            if (!m1356a(resolveInfoResolveActivity.activityInfo.configChanges, 16, "keyboard")) {
                f1337b = false;
            }
            if (!m1356a(resolveInfoResolveActivity.activityInfo.configChanges, 32, "keyboardHidden")) {
                f1337b = false;
            }
            if (!m1356a(resolveInfoResolveActivity.activityInfo.configChanges, 128, "orientation")) {
                f1337b = false;
            }
            if (!m1356a(resolveInfoResolveActivity.activityInfo.configChanges, 256, "screenLayout")) {
                f1337b = false;
            }
            if (!m1356a(resolveInfoResolveActivity.activityInfo.configChanges, 512, "uiMode")) {
                f1337b = false;
            }
            if (!m1356a(resolveInfoResolveActivity.activityInfo.configChanges, 1024, "screenSize")) {
                f1337b = false;
            }
            if (!m1356a(resolveInfoResolveActivity.activityInfo.configChanges, 2048, "smallestScreenSize")) {
                f1337b = false;
            }
        }
        return f1337b.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public static String m1369d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        switch (activeNetworkInfo.getType()) {
            case C0467e.MapAttrs_mapType /* 0 */:
                return "ed";
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return "wi";
            default:
                return "unknown";
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1370d() {
        return f1342g;
    }

    /* JADX INFO: renamed from: e */
    public static String m1371e(Context context) {
        if (f1339d == null) {
            StringBuilder sb = new StringBuilder();
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536);
            if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
                sb.append("m");
            }
            List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pname:com.google")), 65536);
            if (listQueryIntentActivities2 == null || listQueryIntentActivities2.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append("a");
            }
            f1339d = sb.toString();
        }
        return f1339d;
    }

    /* JADX INFO: renamed from: f */
    public static String m1372f(Context context) {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        if (f1340e != null) {
            return f1340e;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads")), 65536);
            if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null || (packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0)) == null) {
                return null;
            }
            f1340e = packageInfo.versionCode + "." + activityInfo.packageName;
            return f1340e;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static EnumC0352a m1373g(Context context) {
        if (f1341f == null) {
            f1341f = (AudioManager) context.getSystemService("audio");
        }
        EnumC0352a enumC0352a = EnumC0352a.OTHER;
        int mode = f1341f.getMode();
        if (m1367c()) {
            return EnumC0352a.EMULATOR;
        }
        if (f1341f.isMusicActive() || f1341f.isSpeakerphoneOn() || mode == 2 || mode == 1) {
            return EnumC0352a.VIBRATE;
        }
        int ringerMode = f1341f.getRingerMode();
        return (ringerMode == 0 || ringerMode == 1) ? EnumC0352a.VIBRATE : EnumC0352a.SPEAKER;
    }

    /* JADX INFO: renamed from: h */
    public static void m1374h(Context context) {
        if (f1343h) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(new UserActivityReceiver(), intentFilter);
        f1343h = true;
    }

    /* JADX INFO: renamed from: i */
    public static String m1375i(Context context) {
        if (f1344i == null) {
            String userAgentString = new WebView(context).getSettings().getUserAgentString();
            if (userAgentString == null || userAgentString.length() == 0 || userAgentString.equals("Java0")) {
                String property = System.getProperty("os.name", "Linux");
                String str = "Android " + Build.VERSION.RELEASE;
                Locale locale = Locale.getDefault();
                String lowerCase = locale.getLanguage().toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    lowerCase = "en";
                }
                String lowerCase2 = locale.getCountry().toLowerCase(Locale.US);
                if (lowerCase2.length() > 0) {
                    lowerCase = lowerCase + "-" + lowerCase2;
                }
                userAgentString = "Mozilla/5.0 (" + property + "; U; " + str + "; " + lowerCase + "; " + (Build.MODEL + " Build/" + Build.ID) + ") AppleWebKit/0.0 (KHTML, like Gecko) Version/0.0 Mobile Safari/0.0";
            }
            f1344i = userAgentString + " (Mobile; afma-sdk-a-v6.4.1)";
        }
        return f1344i;
    }
}
