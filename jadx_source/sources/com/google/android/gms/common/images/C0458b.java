package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.internal.C0591dr;

/* JADX INFO: renamed from: com.google.android.gms.common.images.b */
/* JADX INFO: loaded from: classes.dex */
final class C0458b extends C0591dr {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.C0591dr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int mo1896a(C0462f c0462f, Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.C0591dr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo1898a(boolean z, C0462f c0462f, Bitmap bitmap, Bitmap bitmap2) {
        super.mo1898a(z, (Object) c0462f, (Object) bitmap, (Object) bitmap2);
    }
}
