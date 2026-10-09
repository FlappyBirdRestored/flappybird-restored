package com.google.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import com.google.ads.AdView;
import com.google.ads.C0337g;
import com.google.ads.InterfaceC0338h;

/* JADX INFO: loaded from: classes.dex */
public class DfpAdView extends AdView {
    public DfpAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DfpAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.google.ads.AdView
    public void setAppEventListener(InterfaceC0338h interfaceC0338h) {
        super.setAppEventListener(interfaceC0338h);
    }

    @Override // com.google.ads.AdView
    public void setSupportedAdSizes(C0337g... c0337gArr) {
        super.setSupportedAdSizes(c0337gArr);
    }
}
