package com.google.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* JADX INFO: renamed from: com.google.ads.ah */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0267ah implements InterfaceC0266ag {

    /* JADX INFO: renamed from: b */
    protected DisplayMetrics f922b;

    /* JADX INFO: renamed from: c */
    private C0282aw f923c = null;

    /* JADX INFO: renamed from: d */
    private ByteArrayOutputStream f924d = null;

    /* JADX INFO: renamed from: a */
    protected MotionEvent f921a = null;

    protected AbstractC0267ah(Context context) {
        this.f922b = null;
        try {
            this.f922b = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException e) {
            this.f922b = new DisplayMetrics();
            this.f922b.density = 1.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m1163a(Context context, String str, boolean z) {
        try {
            m1164a();
            if (z) {
                mo1173c(context);
            } else {
                mo1172b(context);
            }
            byte[] bArrM1165b = m1165b();
            return bArrM1165b.length == 0 ? Integer.toString(5) : m1166a(bArrM1165b, str);
        } catch (UnsupportedEncodingException e) {
            return Integer.toString(7);
        } catch (IOException e2) {
            return Integer.toString(3);
        } catch (NoSuchAlgorithmException e3) {
            return Integer.toString(7);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1164a() {
        this.f924d = new ByteArrayOutputStream();
        this.f923c = C0282aw.m1217a(this.f924d);
    }

    /* JADX INFO: renamed from: b */
    private byte[] m1165b() throws IOException {
        this.f923c.m1220a();
        return this.f924d.toByteArray();
    }

    @Override // com.google.ads.InterfaceC0266ag
    /* JADX INFO: renamed from: a */
    public String mo1161a(Context context) {
        return m1163a(context, (String) null, false);
    }

    @Override // com.google.ads.InterfaceC0266ag
    /* JADX INFO: renamed from: a */
    public String mo1162a(Context context, String str) {
        return m1163a(context, str, true);
    }

    /* JADX INFO: renamed from: a */
    String m1166a(byte[] bArr, String str) throws NoSuchAlgorithmException, IOException {
        byte[] bArrArray;
        if (bArr.length > 239) {
            m1164a();
            m1168a(20, 1L);
            bArr = m1165b();
        }
        if (bArr.length < 239) {
            byte[] bArr2 = new byte[239 - bArr.length];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).array();
        }
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(bArrArray);
        byte[] bArrArray2 = ByteBuffer.allocate(256).put(messageDigest.digest()).put(bArrArray).array();
        byte[] bArr3 = new byte[256];
        new C0347q().m1342a(bArrArray2, bArr3);
        if (str != null && str.length() > 0) {
            m1171a(str, bArr3);
        }
        return C0276aq.m1206a(bArr3, false);
    }

    /* JADX INFO: renamed from: a */
    public void m1167a(int i, int i2, int i3) {
        if (this.f921a != null) {
            this.f921a.recycle();
        }
        this.f921a = MotionEvent.obtain(0L, i3, 1, i * this.f922b.density, i2 * this.f922b.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    protected void m1168a(int i, long j) throws IOException {
        this.f923c.m1224a(i, j);
    }

    /* JADX INFO: renamed from: a */
    protected void m1169a(int i, String str) throws IOException {
        this.f923c.m1225a(i, str);
    }

    /* JADX INFO: renamed from: a */
    public void m1170a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f921a != null) {
                this.f921a.recycle();
            }
            this.f921a = MotionEvent.obtain(motionEvent);
        }
    }

    /* JADX INFO: renamed from: a */
    void m1171a(String str, byte[] bArr) {
        if (str.length() > 32) {
            str = str.substring(0, 32);
        }
        new C0277ar(str.getBytes("UTF-8")).m1212a(bArr);
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo1172b(Context context);

    /* JADX INFO: renamed from: c */
    protected abstract void mo1173c(Context context);
}
