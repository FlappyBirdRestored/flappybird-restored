package com.google.ads.util;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ads.AdActivity;
import com.google.ads.C0315br;
import com.google.ads.C0316bs;
import com.google.ads.C0317bt;
import com.google.ads.p003a.C0238e;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.ads.util.r */
/* JADX INFO: loaded from: classes.dex */
public class C0375r extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    private final C0317bt f1389a;

    public C0375r(C0317bt c0317bt) {
        this.f1389a = c0317bt;
    }

    /* JADX INFO: renamed from: a */
    private static void m1416a(AlertDialog.Builder builder, Context context, String str, String str2, JsPromptResult jsPromptResult) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(str);
        EditText editText = new EditText(context);
        editText.setText(str2);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        builder.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0381x(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0380w(jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0379v(jsPromptResult)).create().show();
    }

    /* JADX INFO: renamed from: a */
    private static void m1417a(AlertDialog.Builder builder, String str, JsResult jsResult) {
        builder.setMessage(str).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0378u(jsResult)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0377t(jsResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0376s(jsResult)).create().show();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1418a(WebView webView, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        AdActivity adActivityM1032i;
        if (!(webView instanceof C0238e) || (adActivityM1032i = ((C0238e) webView).m1032i()) == null) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(adActivityM1032i);
        builder.setTitle(str);
        if (z) {
            m1416a(builder, adActivityM1032i, str2, str3, jsPromptResult);
        } else {
            m1417a(builder, str2, jsResult);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        if (webView instanceof C0238e) {
            ((C0238e) webView).m1029f();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        switch (C0374q.f1388a[consoleMessage.messageLevel().ordinal()]) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                C0364g.m1395b(str);
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                C0364g.m1401e(str);
                break;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                C0364g.m1397c(str);
                break;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                C0364g.m1391a(str);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        C0316bs c0316bs = (C0316bs) ((C0315br) this.f1389a.f1055d.m1378a()).f1035b.m1378a();
        long jLongValue = ((Long) c0316bs.f1048l.m1379a()).longValue() - j3;
        if (jLongValue <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > jLongValue || j2 > ((Long) c0316bs.f1049m.m1379a()).longValue()) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(((Long) c0316bs.f1050n.m1379a()).longValue(), jLongValue) + j, ((Long) c0316bs.f1049m.m1379a()).longValue());
        } else {
            if (j2 <= Math.min(((Long) c0316bs.f1049m.m1379a()).longValue() - j, jLongValue)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m1418a(webView, str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m1418a(webView, str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m1418a(webView, str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m1418a(webView, str, str2, str3, null, jsPromptResult, true);
    }

    public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        C0316bs c0316bs = (C0316bs) ((C0315br) this.f1389a.f1055d.m1378a()).f1035b.m1378a();
        long jLongValue = ((Long) c0316bs.f1047k.m1379a()).longValue() - j2;
        long jLongValue2 = ((Long) c0316bs.f1046j.m1379a()).longValue() + j;
        if (jLongValue < jLongValue2) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(jLongValue2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }
}
