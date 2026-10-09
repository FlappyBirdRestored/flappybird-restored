package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.C0467e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0602n {

    /* JADX INFO: renamed from: a */
    private static final Pattern f2076a = Pattern.compile("\\\\.");

    /* JADX INFO: renamed from: b */
    private static final Pattern f2077b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    /* JADX INFO: renamed from: a */
    public static String m2752a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f2077b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            switch (matcher.group().charAt(0)) {
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    matcher.appendReplacement(stringBuffer, "\\\\b");
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    matcher.appendReplacement(stringBuffer, "\\\\t");
                    break;
                case C0467e.MapAttrs_uiZoomControls /* 10 */:
                    matcher.appendReplacement(stringBuffer, "\\\\n");
                    break;
                case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                    break;
                case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                    matcher.appendReplacement(stringBuffer, "\\\\r");
                    break;
                case '\"':
                    matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                    break;
                case '/':
                    matcher.appendReplacement(stringBuffer, "\\\\/");
                    break;
                case '\\':
                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                    break;
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
