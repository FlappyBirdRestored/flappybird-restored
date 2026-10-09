package org.andengine.opengl.p066c.p067a.p068a.p069a;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import org.andengine.opengl.p066c.p067a.p070b.AbstractC0997a;
import org.andengine.p040d.C0938d;
import org.andengine.p040d.p052e.C0941a;

/* JADX INFO: renamed from: org.andengine.opengl.c.a.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0993a extends AbstractC0997a implements InterfaceC0994b {

    /* JADX INFO: renamed from: e */
    private final AssetManager f2884e;

    /* JADX INFO: renamed from: f */
    private final String f2885f;

    C0993a(AssetManager assetManager, String str, int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.f2884e = assetManager;
        this.f2885f = str;
    }

    /* JADX INFO: renamed from: a */
    public static C0993a m3933a(AssetManager assetManager, String str) {
        return m3934a(assetManager, str, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX INFO: renamed from: a */
    public static C0993a m3934a(AssetManager assetManager, String str, int i, int i2) {
        ?? Open = 0;
        Open = 0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            Open = assetManager.open(str);
            BitmapFactory.decodeStream(Open, null, options);
        } catch (IOException e) {
            C0941a.m3827b("Failed loading Bitmap in AssetBitmapTextureAtlasSource. AssetPath: " + str, e);
        } finally {
            C0938d.m3804a(Open);
        }
        Open = assetManager;
        return new C0993a(Open, str, i, i2, options.outWidth, options.outHeight);
    }

    @Override // org.andengine.opengl.p066c.p067a.p068a.p069a.InterfaceC0994b
    /* JADX INFO: renamed from: a */
    public Bitmap mo3935a(Bitmap.Config config) throws Throwable {
        InputStream inputStreamOpen;
        Throwable th;
        Bitmap bitmapDecodeStream = null;
        try {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = config;
                inputStreamOpen = this.f2884e.open(this.f2885f);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options);
                    C0938d.m3804a(inputStreamOpen);
                } catch (IOException e) {
                    e = e;
                    C0941a.m3827b("Failed loading Bitmap in " + getClass().getSimpleName() + ". AssetPath: " + this.f2885f, e);
                    C0938d.m3804a(inputStreamOpen);
                }
            } catch (IOException e2) {
                e = e2;
                inputStreamOpen = null;
            } catch (Throwable th2) {
                inputStreamOpen = null;
                th = th2;
                C0938d.m3804a(inputStreamOpen);
                throw th;
            }
            return bitmapDecodeStream;
        } catch (Throwable th3) {
            th = th3;
            C0938d.m3804a(inputStreamOpen);
            throw th;
        }
    }

    @Override // org.andengine.opengl.p066c.p067a.p070b.AbstractC0997a
    public String toString() {
        return String.valueOf(getClass().getSimpleName()) + "(" + this.f2885f + ")";
    }
}
