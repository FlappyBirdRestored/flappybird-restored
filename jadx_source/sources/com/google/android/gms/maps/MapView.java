package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.C0721k;

/* JADX INFO: loaded from: classes.dex */
public class MapView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final C0684d f2127a;

    /* JADX INFO: renamed from: b */
    private C0618a f2128b;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2127a = new C0684d(this, context, GoogleMapOptions.m2806a(context, attributeSet));
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2127a = new C0684d(this, context, GoogleMapOptions.m2806a(context, attributeSet));
    }

    public final C0618a getMap() {
        if (this.f2128b != null) {
            return this.f2128b;
        }
        this.f2127a.m2974b();
        if (this.f2127a.m1825a() == null) {
            return null;
        }
        try {
            this.f2128b = new C0618a(((C0683c) this.f2127a.m1825a()).m2973a().mo2936a());
            return this.f2128b;
        } catch (RemoteException e) {
            throw new C0721k(e);
        }
    }
}
