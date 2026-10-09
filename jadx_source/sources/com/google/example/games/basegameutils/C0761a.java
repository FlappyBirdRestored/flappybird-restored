package com.google.example.games.basegameutils;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.C0445a;
import com.google.android.gms.common.C0456f;
import com.google.android.gms.common.InterfaceC0447c;
import com.google.android.gms.common.InterfaceC0448d;
import com.google.android.gms.games.C0473c;
import com.google.android.gms.games.C0476f;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.p012a.C0428a;
import com.google.android.gms.p012a.C0430c;
import com.google.android.gms.plus.C0750b;
import com.google.android.gms.plus.C0751c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Vector;

/* JADX INFO: renamed from: com.google.example.games.basegameutils.a */
/* JADX INFO: loaded from: classes.dex */
public class C0761a implements InterfaceC0447c, InterfaceC0448d {

    /* JADX INFO: renamed from: a */
    public static final String[] f2291a = {"UNCONFIGURED", "DISCONNECTED", "CONNECTING", "CONNECTED"};

    /* JADX INFO: renamed from: d */
    Activity f2294d;

    /* JADX INFO: renamed from: e */
    String[] f2295e;

    /* JADX INFO: renamed from: r */
    String f2308r;

    /* JADX INFO: renamed from: b */
    int f2292b = 0;

    /* JADX INFO: renamed from: c */
    boolean f2293c = false;

    /* JADX INFO: renamed from: f */
    C0473c f2296f = null;

    /* JADX INFO: renamed from: g */
    C0750b f2297g = null;

    /* JADX INFO: renamed from: h */
    C0428a f2298h = null;

    /* JADX INFO: renamed from: i */
    int f2299i = 0;

    /* JADX INFO: renamed from: j */
    int f2300j = 0;

    /* JADX INFO: renamed from: k */
    int f2301k = 0;

    /* JADX INFO: renamed from: l */
    boolean f2302l = true;

    /* JADX INFO: renamed from: m */
    boolean f2303m = false;

    /* JADX INFO: renamed from: n */
    C0445a f2304n = null;

    /* JADX INFO: renamed from: o */
    C0763c f2305o = null;

    /* JADX INFO: renamed from: p */
    boolean f2306p = false;

    /* JADX INFO: renamed from: q */
    String f2307q = "GameHelper";

    /* JADX INFO: renamed from: s */
    InterfaceC0762b f2309s = null;

    public C0761a(Activity activity) {
        this.f2294d = null;
        this.f2294d = activity;
    }

    /* JADX INFO: renamed from: b */
    static String m3239b(int i) {
        switch (i) {
            case -1:
                return "RESULT_OK";
            case C0467e.MapAttrs_mapType /* 0 */:
                return "RESULT_CANCELED";
            case 10001:
                return "RESULT_RECONNECT_REQUIRED";
            case 10002:
                return "SIGN_IN_FAILED";
            case 10003:
                return "RESULT_LICENSE_FAILED";
            case 10004:
                return "RESULT_APP_MISCONFIGURED";
            case 10005:
                return "RESULT_LEFT_ROOM";
            default:
                return String.valueOf(i);
        }
    }

    /* JADX INFO: renamed from: c */
    static String m3240c(int i) {
        switch (i) {
            case C0467e.MapAttrs_mapType /* 0 */:
                return "SUCCESS(" + i + ")";
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return "SERVICE_MISSING(" + i + ")";
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return "SERVICE_VERSION_UPDATE_REQUIRED(" + i + ")";
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                return "SERVICE_DISABLED(" + i + ")";
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                return "SIGN_IN_REQUIRED(" + i + ")";
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                return "INVALID_ACCOUNT(" + i + ")";
            case C0467e.MapAttrs_uiCompass /* 6 */:
                return "RESOLUTION_REQUIRED(" + i + ")";
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                return "NETWORK_ERROR(" + i + ")";
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                return "INTERNAL_ERROR(" + i + ")";
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                return "SERVICE_INVALID(" + i + ")";
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                return "DEVELOPER_ERROR(" + i + ")";
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                return "LICENSE_CHECK_FAILED(" + i + ")";
            default:
                return "Unknown error code " + i;
        }
    }

    @Override // com.google.android.gms.common.InterfaceC0447c
    /* JADX INFO: renamed from: a */
    public void mo1840a() {
        m3253c("onDisconnected.");
        if (this.f2292b == 1) {
            m3253c("onDisconnected is expected, so no action taken.");
            return;
        }
        m3256d("Unexpectedly disconnected. Severing remaining connections.");
        m3257e();
        this.f2305o = null;
        m3253c("Making extraordinary call to onSignInFailed callback");
        m3248a(false);
    }

    /* JADX INFO: renamed from: a */
    void m3241a(int i) {
        String str = f2291a[this.f2292b];
        String str2 = f2291a[i];
        this.f2292b = i;
        m3253c("State change " + str + " -> " + str2);
    }

    /* JADX INFO: renamed from: a */
    public void m3242a(int i, int i2, Intent intent) {
        m3253c("onActivityResult: req=" + (i == 9001 ? "RC_RESOLVE" : String.valueOf(i)) + ", resp=" + m3239b(i2));
        if (i != 9001) {
            m3253c("onActivityResult: request code not meant for us. Ignoring.");
            return;
        }
        this.f2293c = false;
        if (this.f2292b != 2) {
            m3253c("onActivityResult: ignoring because state isn't STATE_CONNECTING (it's " + f2291a[this.f2292b] + ")");
            return;
        }
        if (i2 == -1) {
            m3253c("onAR: Resolution was RESULT_OK, so connecting current client again.");
            m3263j();
            return;
        }
        if (i2 == 10001) {
            m3253c("onAR: Resolution was RECONNECT_REQUIRED, so reconnecting.");
            m3263j();
        } else {
            if (i2 != 0) {
                m3253c("onAR: responseCode=" + m3239b(i2) + ", so giving up.");
                m3245a(new C0763c(this.f2304n.m1839b(), i2));
                return;
            }
            m3253c("onAR: Got a cancellation result, so disconnecting.");
            this.f2302l = false;
            this.f2303m = false;
            this.f2305o = null;
            m3257e();
            m3248a(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3243a(Activity activity) {
        this.f2294d = activity;
        m3253c("onStart, state = " + f2291a[this.f2292b]);
        m3246a("onStart");
        switch (this.f2292b) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                if (!this.f2302l) {
                    m3253c("onStart: Not connecting (user specifically signed out).");
                    return;
                } else {
                    m3253c("onStart: Now connecting clients.");
                    m3261h();
                    return;
                }
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                m3253c("onStart: connection process in progress, no action taken.");
                return;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                m3253c("onStart: already connected (unusual, but ok).");
                return;
            default:
                String str = "onStart: BUG: unexpected state " + f2291a[this.f2292b];
                m3258e(str);
                throw new IllegalStateException(str);
        }
    }

    @Override // com.google.android.gms.common.InterfaceC0447c
    /* JADX INFO: renamed from: a */
    public void mo1841a(Bundle bundle) {
        m3253c("onConnected: connected! client=" + this.f2301k);
        this.f2300j |= this.f2301k;
        m3253c("Connected clients updated to: " + this.f2300j);
        if (this.f2301k == 1 && bundle != null) {
            m3253c("onConnected: connection hint provided. Checking for invite.");
            Invitation invitation = (Invitation) bundle.getParcelable("invitation");
            if (invitation != null && invitation.mo2021c() != null) {
                m3253c("onConnected: connection hint has a room invite!");
                this.f2308r = invitation.mo2021c();
                m3253c("Invitation ID: " + this.f2308r);
            }
            m3253c("onConnected: connection hint provided. Checking for TBMP game.");
        }
        m3262i();
    }

    @Override // com.google.android.gms.common.InterfaceC0448d
    /* JADX INFO: renamed from: a */
    public void mo1842a(C0445a c0445a) {
        m3253c("onConnectionFailed");
        this.f2304n = c0445a;
        m3253c("Connection failure:");
        m3253c("   - code: " + m3240c(this.f2304n.m1839b()));
        m3253c("   - resolvable: " + this.f2304n.m1838a());
        m3253c("   - details: " + this.f2304n.toString());
        if (this.f2303m) {
            m3253c("onConnectionFailed: since user initiated sign-in, resolving problem.");
            m3265l();
        } else {
            m3253c("onConnectionFailed: since user didn't initiate sign-in, failing now.");
            this.f2304n = c0445a;
            m3241a(1);
            m3248a(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3244a(InterfaceC0762b interfaceC0762b, int i, String... strArr) {
        if (this.f2292b != 0) {
            m3258e("GameHelper: you called GameHelper.setup() twice. You can only call it once.");
            throw new IllegalStateException("GameHelper: you called GameHelper.setup() twice. You can only call it once.");
        }
        this.f2309s = interfaceC0762b;
        this.f2299i = i;
        m3253c("Setup: requested clients: " + this.f2299i);
        Vector vector = new Vector();
        if ((i & 1) != 0) {
            vector.add("https://www.googleapis.com/auth/games");
        }
        if ((i & 2) != 0) {
            vector.add("https://www.googleapis.com/auth/plus.login");
        }
        if ((i & 4) != 0) {
            vector.add("https://www.googleapis.com/auth/appstate");
        }
        if (strArr != null) {
            for (String str : strArr) {
                vector.add(str);
            }
        }
        this.f2295e = new String[vector.size()];
        vector.copyInto(this.f2295e);
        m3253c("setup: scopes:");
        for (String str2 : this.f2295e) {
            m3253c("  - " + str2);
        }
        if ((i & 1) != 0) {
            m3253c("setup: creating GamesClient");
            this.f2296f = new C0476f(m3260g(), this, this).m2013a(49).m2014a(this.f2295e).m2012a();
        }
        if ((i & 2) != 0) {
            m3253c("setup: creating GamesPlusClient");
            this.f2297g = new C0751c(m3260g(), this, this).m3230a(this.f2295e).m3229a();
        }
        if ((i & 4) != 0) {
            m3253c("setup: creating AppStateClient");
            this.f2298h = new C0430c(m3260g(), this, this).m1817a(this.f2295e).m1816a();
        }
        m3241a(1);
    }

    /* JADX INFO: renamed from: a */
    void m3245a(C0763c c0763c) {
        m3250a(1002, "giveUp", "giveUp should only be called when connecting. Proceeding anyway.", 2);
        this.f2302l = false;
        m3257e();
        this.f2305o = c0763c;
        m3266m();
        m3248a(false);
    }

    /* JADX INFO: renamed from: a */
    void m3246a(String str) {
        if (this.f2292b == 0) {
            String str2 = "GameHelper error: Operation attempted without setup: " + str + ". The setup() method must be called before attempting any other operation.";
            m3258e(str2);
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: a */
    void m3247a(StringBuilder sb, byte b) {
        int i = b;
        if (b < 0) {
            i = b + 256;
        }
        int i2 = i / 16;
        int i3 = i % 16;
        sb.append("0123456789ABCDEF".substring(i2, i2 + 1));
        sb.append("0123456789ABCDEF".substring(i3, i3 + 1));
    }

    /* JADX INFO: renamed from: a */
    void m3248a(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("Notifying LISTENER of sign-in ");
        if (z) {
            str = "SUCCESS";
        } else {
            str = this.f2305o != null ? "FAILURE (error)" : "FAILURE (no error)";
        }
        m3253c(sb.append(str).toString());
        if (this.f2309s != null) {
            if (z) {
                this.f2309s.mo812k();
            } else {
                this.f2309s.mo811j();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3249a(boolean z, String str) {
        this.f2306p = z;
        this.f2307q = str;
        if (z) {
            m3253c("Debug log enabled, tag: " + str);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean m3250a(int i, String str, String str2, int... iArr) {
        for (int i2 : iArr) {
            if (this.f2292b == i2) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i == 1001) {
            sb.append("GameHelper: you attempted an operation at an invalid. ");
        } else {
            sb.append("GameHelper: bug detected. Please report it at our bug tracker ");
            sb.append("https://github.com/playgameservices/android-samples/issues. ");
            sb.append("Please include the last couple hundred lines of logcat output ");
            sb.append("and describe the operation that caused this. ");
        }
        sb.append("Explanation: ").append(str2);
        sb.append("Operation: ").append(str).append(". ");
        sb.append("State: ").append(f2291a[this.f2292b]).append(". ");
        if (iArr.length == 1) {
            sb.append("Expected state: ").append(f2291a[iArr[0]]).append(".");
        } else {
            sb.append("Expected states:");
            for (int i3 : iArr) {
                sb.append(" ").append(f2291a[i3]);
            }
            sb.append(".");
        }
        m3256d(sb.toString());
        return false;
    }

    /* JADX INFO: renamed from: b */
    Dialog m3251b(String str) {
        return new AlertDialog.Builder(m3260g()).setMessage(str).setNeutralButton(R.string.ok, (DialogInterface.OnClickListener) null).create();
    }

    /* JADX INFO: renamed from: b */
    public C0473c m3252b() {
        if (this.f2296f == null) {
            throw new IllegalStateException("No GamesClient. Did you request it at setup?");
        }
        return this.f2296f;
    }

    /* JADX INFO: renamed from: c */
    void m3253c(String str) {
        if (this.f2306p) {
            Log.d(this.f2307q, "GameHelper: " + str);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m3254c() {
        return this.f2292b == 3;
    }

    /* JADX INFO: renamed from: d */
    public void m3255d() {
        m3253c("onStop, state = " + f2291a[this.f2292b]);
        m3246a("onStop");
        switch (this.f2292b) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                m3253c("onStop: not connected, so no action taken.");
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                m3253c("onStop: Killing connections");
                m3257e();
                break;
            default:
                String str = "onStop: BUG: unexpected state " + f2291a[this.f2292b];
                m3258e(str);
                throw new IllegalStateException(str);
        }
        this.f2294d = null;
    }

    /* JADX INFO: renamed from: d */
    void m3256d(String str) {
        Log.w(this.f2307q, "!!! GameHelper WARNING: " + str);
    }

    /* JADX INFO: renamed from: e */
    void m3257e() {
        if (m3250a(1002, "killConnections", "killConnections() should only get called while connected or connecting.", 3, 2)) {
            m3253c("killConnections: killing connections.");
            this.f2304n = null;
            this.f2305o = null;
            if (this.f2296f != null && this.f2296f.m2009b()) {
                m3253c("Disconnecting GamesClient.");
                this.f2296f.m2010c();
            }
            if (this.f2297g != null && this.f2297g.m3227b()) {
                m3253c("Disconnecting PlusClient.");
                this.f2297g.m3228c();
            }
            if (this.f2298h != null && this.f2298h.m1814b()) {
                m3253c("Disconnecting AppStateClient.");
                this.f2298h.m1815c();
            }
            this.f2300j = 0;
            m3253c("killConnections: all clients disconnected.");
            m3241a(1);
        }
    }

    /* JADX INFO: renamed from: e */
    void m3258e(String str) {
        Log.e(this.f2307q, "*** GameHelper ERROR: " + str);
    }

    /* JADX INFO: renamed from: f */
    public void m3259f() {
        if (this.f2292b == 3) {
            m3256d("beginUserInitiatedSignIn() called when already connected. Calling listener directly to notify of success.");
            m3248a(true);
            return;
        }
        if (this.f2292b == 2) {
            m3256d("beginUserInitiatedSignIn() called when already connecting. Be patient! You can only call this method after you get an onSignInSucceeded() or onSignInFailed() callback. Suggestion: disable the sign-in button on startup and also when it's clicked, and re-enable when you get the callback.");
            return;
        }
        m3253c("Starting USER-INITIATED sign-in flow.");
        this.f2302l = true;
        int iM1869a = C0456f.m1869a(m3260g());
        m3253c("isGooglePlayServicesAvailable returned " + iM1869a);
        if (iM1869a != 0) {
            m3253c("Google Play services not available. Show error dialog.");
            this.f2305o = new C0763c(iM1869a, 0);
            m3266m();
            m3248a(false);
            return;
        }
        this.f2303m = true;
        if (this.f2304n == null) {
            m3253c("beginUserInitiatedSignIn: starting new sign-in flow.");
            m3261h();
        } else {
            m3253c("beginUserInitiatedSignIn: continuing pending sign-in flow.");
            m3241a(2);
            m3265l();
        }
    }

    /* JADX INFO: renamed from: g */
    Context m3260g() {
        return this.f2294d;
    }

    /* JADX INFO: renamed from: h */
    void m3261h() {
        if (m3250a(1002, "startConnections", "startConnections should only get called when disconnected.", 1)) {
            m3253c("Starting connections.");
            m3241a(2);
            this.f2308r = null;
            m3262i();
        }
    }

    /* JADX INFO: renamed from: i */
    void m3262i() {
        m3253c("connectNextClient: requested clients: " + this.f2299i + ", connected clients: " + this.f2300j);
        if (this.f2296f != null && this.f2296f.m2009b() && (this.f2300j & 1) == 0) {
            m3256d("GamesClient was already connected. Fixing.");
            this.f2300j |= 1;
        }
        if (this.f2297g != null && this.f2297g.m3227b() && (this.f2300j & 2) == 0) {
            m3256d("PlusClient was already connected. Fixing.");
            this.f2300j |= 2;
        }
        if (this.f2298h != null && this.f2298h.m1814b() && (this.f2300j & 4) == 0) {
            m3256d("AppStateClient was already connected. Fixing");
            this.f2300j |= 4;
        }
        int i = this.f2299i & (this.f2300j ^ (-1));
        m3253c("Pending clients: " + i);
        if (i == 0) {
            m3253c("All clients now connected. Sign-in successful!");
            m3264k();
            return;
        }
        if (this.f2296f != null && (i & 1) != 0) {
            m3253c("Connecting GamesClient.");
            this.f2301k = 1;
        } else if (this.f2297g != null && (i & 2) != 0) {
            m3253c("Connecting PlusClient.");
            this.f2301k = 2;
        } else {
            if (this.f2298h == null || (i & 4) == 0) {
                throw new AssertionError("Not all clients connected, yet no one is next. R=" + this.f2299i + ", C=" + this.f2300j);
            }
            m3253c("Connecting AppStateClient.");
            this.f2301k = 4;
        }
        m3263j();
    }

    /* JADX INFO: renamed from: j */
    void m3263j() {
        if (this.f2292b == 1) {
            m3256d("GameHelper got disconnected during connection process. Aborting.");
        }
        if (m3250a(1002, "connectCurrentClient", "connectCurrentClient should only get called when connecting.", 2)) {
            switch (this.f2301k) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    this.f2296f.m2007a();
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    this.f2297g.m3226a();
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    this.f2298h.m1813a();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    void m3264k() {
        m3250a(1002, "succeedSignIn", "succeedSignIn should only get called in the connecting or connected state. Proceeding anyway.", 2, 3);
        m3253c("All requested clients connected. Sign-in succeeded!");
        m3241a(3);
        this.f2305o = null;
        this.f2302l = true;
        this.f2303m = false;
        m3248a(true);
    }

    /* JADX INFO: renamed from: l */
    void m3265l() {
        m3250a(1002, "resolveConnectionResult", "resolveConnectionResult should only be called when connecting. Proceeding anyway.", 2);
        if (this.f2293c) {
            m3253c("We're already expecting the result of a previous resolution.");
            return;
        }
        m3253c("resolveConnectionResult: trying to resolve result: " + this.f2304n);
        if (!this.f2304n.m1838a()) {
            m3253c("resolveConnectionResult: result has no resolution. Giving up.");
            m3245a(new C0763c(this.f2304n.m1839b()));
            return;
        }
        m3253c("Result has resolution. Starting it.");
        try {
            this.f2293c = true;
            this.f2304n.m1837a(this.f2294d, 9001);
        } catch (IntentSender.SendIntentException e) {
            m3253c("SendIntentException, so connecting again.");
            m3263j();
        }
    }

    /* JADX INFO: renamed from: m */
    void m3266m() {
        Dialog dialogM3251b;
        Context contextM3260g = m3260g();
        if (contextM3260g == null) {
            m3253c("*** No context. Can't show failure dialog.");
            return;
        }
        m3253c("Making error dialog for failure: " + this.f2305o);
        int iM3270a = this.f2305o.m3270a();
        switch (this.f2305o.m3271b()) {
            case 10002:
                dialogM3251b = m3251b(contextM3260g.getString(C0765e.gamehelper_sign_in_failed));
                break;
            case 10003:
                dialogM3251b = m3251b(contextM3260g.getString(C0765e.gamehelper_license_failed));
                break;
            case 10004:
                dialogM3251b = m3251b(contextM3260g.getString(C0765e.gamehelper_app_misconfigured));
                m3267n();
                break;
            default:
                dialogM3251b = C0456f.m1870a(iM3270a, this.f2294d, 9002, null);
                if (dialogM3251b == null) {
                    m3253c("No standard error dialog available. Making fallback dialog.");
                    dialogM3251b = m3251b(String.valueOf(contextM3260g.getString(C0765e.gamehelper_unknown_error)) + " " + m3240c(iM3270a));
                }
                break;
        }
        m3253c("Showing error dialog.");
        dialogM3251b.show();
    }

    /* JADX INFO: renamed from: n */
    void m3267n() {
        m3253c("****");
        m3253c("****");
        m3253c("**** APP NOT CORRECTLY CONFIGURED TO USE GOOGLE PLAY GAME SERVICES");
        m3253c("**** This is usually caused by one of these reasons:");
        m3253c("**** (1) Your package name and certificate fingerprint do not match");
        m3253c("****     the client ID you registered in Developer Console.");
        m3253c("**** (2) Your App ID was incorrectly entered.");
        m3253c("**** (3) Your game settings have not been published and you are ");
        m3253c("****     trying to log in with an account that is not listed as");
        m3253c("****     a test account.");
        m3253c("****");
        if (m3260g() == null) {
            m3253c("*** (no Context, so can't print more debug info)");
            return;
        }
        m3253c("**** To help you debug, here is the information about this app");
        m3253c("**** Package name         : " + m3260g().getPackageName());
        m3253c("**** Cert SHA1 fingerprint: " + m3269p());
        m3253c("**** App ID from          : " + m3268o());
        m3253c("****");
        m3253c("**** Check that the above information matches your setup in ");
        m3253c("**** Developer Console. Also, check that you're logging in with the");
        m3253c("**** right account (it should be listed in the Testers section if");
        m3253c("**** your project is not yet published).");
        m3253c("****");
        m3253c("**** For more information, refer to the troubleshooting guide:");
        m3253c("****   http://developers.google.com/games/services/android/troubleshooting");
    }

    /* JADX INFO: renamed from: o */
    String m3268o() {
        try {
            Resources resources = m3260g().getResources();
            return resources.getString(resources.getIdentifier("app_id", "string", m3260g().getPackageName()));
        } catch (Exception e) {
            e.printStackTrace();
            return "??? (failed to retrieve APP ID)";
        }
    }

    /* JADX INFO: renamed from: p */
    String m3269p() {
        try {
            Signature[] signatureArr = m3260g().getPackageManager().getPackageInfo(m3260g().getPackageName(), 64).signatures;
            if (signatureArr.length == 0) {
                return "ERROR: NO SIGNATURE.";
            }
            if (signatureArr.length > 1) {
                return "ERROR: MULTIPLE SIGNATURES";
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArrDigest.length; i++) {
                if (i > 0) {
                    sb.append(":");
                }
                m3247a(sb, bArrDigest[i]);
            }
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "(ERROR: package not found)";
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "(ERROR: SHA1 algorithm not found)";
        }
    }
}
