package android.support.v4.p001b;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: android.support.v4.b.e */
/* JADX INFO: loaded from: classes.dex */
public class C0038e extends Writer {

    /* JADX INFO: renamed from: a */
    private final String f189a;

    /* JADX INFO: renamed from: b */
    private StringBuilder f190b = new StringBuilder(128);

    public C0038e(String str) {
        this.f189a = str;
    }

    /* JADX INFO: renamed from: a */
    private void m201a() {
        if (this.f190b.length() > 0) {
            Log.d(this.f189a, this.f190b.toString());
            this.f190b.delete(0, this.f190b.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m201a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m201a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m201a();
            } else {
                this.f190b.append(c);
            }
        }
    }
}
