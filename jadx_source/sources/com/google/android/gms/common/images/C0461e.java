package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.C0467e;
import com.google.android.gms.internal.C0554ch;
import com.google.android.gms.internal.C0559cm;
import com.google.android.gms.internal.C0560cn;
import com.google.android.gms.internal.C0604p;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.images.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0461e {

    /* JADX INFO: renamed from: a */
    final C0462f f1665a;

    /* JADX INFO: renamed from: b */
    int f1666b;

    /* JADX INFO: renamed from: c */
    private int f1667c;

    /* JADX INFO: renamed from: d */
    private int f1668d;

    /* JADX INFO: renamed from: e */
    private WeakReference f1669e;

    /* JADX INFO: renamed from: f */
    private WeakReference f1670f;

    /* JADX INFO: renamed from: g */
    private WeakReference f1671g;

    /* JADX INFO: renamed from: h */
    private int f1672h;

    /* JADX INFO: renamed from: i */
    private boolean f1673i;

    /* JADX INFO: renamed from: j */
    private boolean f1674j;

    /* JADX INFO: renamed from: a */
    private C0554ch m1900a(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof C0554ch) {
            drawable = ((C0554ch) drawable).m2601b();
        }
        return new C0554ch(drawable, drawable2);
    }

    /* JADX INFO: renamed from: a */
    private void m1901a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        InterfaceC0457a interfaceC0457a;
        switch (this.f1666b) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                if (!z2 && (interfaceC0457a = (InterfaceC0457a) this.f1669e.get()) != null) {
                    interfaceC0457a.m1894a(this.f1665a.f1675a, drawable);
                    break;
                }
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                ImageView imageView = (ImageView) this.f1670f.get();
                if (imageView != null) {
                    m1902a(imageView, drawable, z, z2, z3);
                }
                break;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                TextView textView = (TextView) this.f1671g.get();
                if (textView != null) {
                    m1903a(textView, this.f1672h, drawable, z, z2);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1902a(ImageView imageView, Drawable drawable, boolean z, boolean z2, boolean z3) {
        boolean z4 = (z2 || z3) ? false : true;
        if (z4 && (imageView instanceof C0559cm)) {
            int iM2603a = ((C0559cm) imageView).m2603a();
            if (this.f1667c != 0 && iM2603a == this.f1667c) {
                return;
            }
        }
        boolean zM1904a = m1904a(z, z2);
        Drawable drawableM1900a = zM1904a ? m1900a(imageView.getDrawable(), drawable) : drawable;
        imageView.setImageDrawable(drawableM1900a);
        if (imageView instanceof C0559cm) {
            C0559cm c0559cm = (C0559cm) imageView;
            c0559cm.m2605a(z3 ? this.f1665a.f1675a : null);
            c0559cm.m2604a(z4 ? this.f1667c : 0);
        }
        if (zM1904a) {
            ((C0554ch) drawableM1900a).m2599a(250);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1903a(TextView textView, int i, Drawable drawable, boolean z, boolean z2) {
        boolean zM1904a = m1904a(z, z2);
        Drawable[] compoundDrawablesRelative = C0604p.m2759e() ? textView.getCompoundDrawablesRelative() : textView.getCompoundDrawables();
        Drawable drawableM1900a = zM1904a ? m1900a(compoundDrawablesRelative[i], drawable) : drawable;
        Drawable drawable2 = i == 0 ? drawableM1900a : compoundDrawablesRelative[0];
        Drawable drawable3 = i == 1 ? drawableM1900a : compoundDrawablesRelative[1];
        Drawable drawable4 = i == 2 ? drawableM1900a : compoundDrawablesRelative[2];
        Drawable drawable5 = i == 3 ? drawableM1900a : compoundDrawablesRelative[3];
        if (C0604p.m2759e()) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        }
        if (zM1904a) {
            ((C0554ch) drawableM1900a).m2599a(250);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m1904a(boolean z, boolean z2) {
        return this.f1673i && !z2 && (!z || this.f1674j);
    }

    /* JADX INFO: renamed from: a */
    void m1905a(Context context, Bitmap bitmap, boolean z) {
        C0560cn.m2606a(bitmap);
        m1901a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* JADX INFO: renamed from: a */
    void m1906a(Context context, boolean z) {
        m1901a(this.f1667c != 0 ? context.getResources().getDrawable(this.f1667c) : null, z, false, false);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0461e) {
            return this == obj || ((C0461e) obj).hashCode() == hashCode();
        }
        return false;
    }

    public int hashCode() {
        return this.f1668d;
    }
}
