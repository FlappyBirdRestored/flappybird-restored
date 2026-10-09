package com.google.ads.p006c;

import android.content.Context;
import android.graphics.Color;
import com.google.ads.C0333d;
import com.google.ads.p004b.p005a.C0288a;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.google.ads.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C0325a extends C0333d {

    /* JADX INFO: renamed from: b */
    private String f1073b;

    /* JADX INFO: renamed from: c */
    private int f1074c;

    /* JADX INFO: renamed from: d */
    private int f1075d;

    /* JADX INFO: renamed from: e */
    private int f1076e;

    /* JADX INFO: renamed from: f */
    private int f1077f;

    /* JADX INFO: renamed from: g */
    private int f1078g;

    /* JADX INFO: renamed from: h */
    private int f1079h;

    /* JADX INFO: renamed from: i */
    private String f1080i;

    /* JADX INFO: renamed from: j */
    private int f1081j;

    /* JADX INFO: renamed from: k */
    private int f1082k;

    /* JADX INFO: renamed from: l */
    private EnumC0326b f1083l;

    /* JADX INFO: renamed from: m */
    private int f1084m;

    /* JADX INFO: renamed from: n */
    private String f1085n;

    /* JADX INFO: renamed from: a */
    private String m1311a(int i) {
        return String.format(Locale.US, "#%06x", Integer.valueOf(16777215 & i));
    }

    @Override // com.google.ads.C0333d
    /* JADX INFO: renamed from: a */
    public Map mo1312a(Context context) {
        C0288a c0288a = (C0288a) m1318a(C0288a.class);
        if (c0288a == null) {
            c0288a = new C0288a();
            m1316a(c0288a);
        }
        if (this.f1073b != null) {
            c0288a.m1242d().put("q", this.f1073b);
        }
        if (Color.alpha(this.f1074c) != 0) {
            c0288a.m1242d().put("bgcolor", m1311a(this.f1074c));
        }
        if (Color.alpha(this.f1075d) == 255 && Color.alpha(this.f1076e) == 255) {
            c0288a.m1242d().put("gradientfrom", m1311a(this.f1075d));
            c0288a.m1242d().put("gradientto", m1311a(this.f1076e));
        }
        if (Color.alpha(this.f1077f) != 0) {
            c0288a.m1242d().put("hcolor", m1311a(this.f1077f));
        }
        if (Color.alpha(this.f1078g) != 0) {
            c0288a.m1242d().put("dcolor", m1311a(this.f1078g));
        }
        if (Color.alpha(this.f1079h) != 0) {
            c0288a.m1242d().put("acolor", m1311a(this.f1079h));
        }
        if (this.f1080i != null) {
            c0288a.m1242d().put("font", this.f1080i);
        }
        c0288a.m1242d().put("headersize", Integer.toString(this.f1081j));
        if (Color.alpha(this.f1082k) != 0) {
            c0288a.m1242d().put("bcolor", m1311a(this.f1082k));
        }
        if (this.f1083l != null) {
            c0288a.m1242d().put("btype", this.f1083l.toString());
        }
        c0288a.m1242d().put("bthick", Integer.toString(this.f1084m));
        if (this.f1085n != null) {
            c0288a.m1242d().put("channel", this.f1085n);
        }
        return super.mo1312a(context);
    }
}
