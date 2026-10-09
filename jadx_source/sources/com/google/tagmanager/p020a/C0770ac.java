package com.google.tagmanager.p020a;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.tagmanager.a.ac */
/* JADX INFO: loaded from: classes.dex */
public class C0770ac {

    /* JADX INFO: renamed from: a */
    public static final byte[] f2319a = new byte[0];

    /* JADX INFO: renamed from: b */
    public static final ByteBuffer f2320b = ByteBuffer.wrap(f2319a);

    /* JADX INFO: renamed from: a */
    public static int m3279a(long j) {
        return (int) ((j >>> 32) ^ j);
    }

    /* JADX INFO: renamed from: a */
    public static int m3280a(InterfaceC0771ad interfaceC0771ad) {
        return interfaceC0771ad.mo1466a();
    }

    /* JADX INFO: renamed from: a */
    public static int m3281a(List list) {
        int iM3280a = 1;
        Iterator it = list.iterator();
        while (true) {
            int i = iM3280a;
            if (!it.hasNext()) {
                return i;
            }
            iM3280a = m3280a((InterfaceC0771ad) it.next()) + (i * 31);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3282a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3283a(byte[] bArr) {
        return C0804bj.m3379a(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m3284b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
