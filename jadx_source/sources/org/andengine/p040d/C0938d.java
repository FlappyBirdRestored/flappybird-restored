package org.andengine.p040d;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: org.andengine.d.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0938d {
    /* JADX INFO: renamed from: a */
    public static final void m3804a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
