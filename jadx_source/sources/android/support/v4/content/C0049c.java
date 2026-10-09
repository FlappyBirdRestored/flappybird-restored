package android.support.v4.content;

import android.support.v4.p001b.C0037d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: android.support.v4.content.c */
/* JADX INFO: loaded from: classes.dex */
public class C0049c {

    /* JADX INFO: renamed from: a */
    int f226a;

    /* JADX INFO: renamed from: b */
    InterfaceC0050d f227b;

    /* JADX INFO: renamed from: c */
    boolean f228c;

    /* JADX INFO: renamed from: d */
    boolean f229d;

    /* JADX INFO: renamed from: e */
    boolean f230e;

    /* JADX INFO: renamed from: f */
    boolean f231f;

    /* JADX INFO: renamed from: g */
    boolean f232g;

    /* JADX INFO: renamed from: a */
    public String m237a(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        C0037d.m200a(obj, sb);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m238a() {
        this.f228c = true;
        this.f230e = false;
        this.f229d = false;
        m242b();
    }

    /* JADX INFO: renamed from: a */
    public void m239a(int i, InterfaceC0050d interfaceC0050d) {
        if (this.f227b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f227b = interfaceC0050d;
        this.f226a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m240a(InterfaceC0050d interfaceC0050d) {
        if (this.f227b == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.f227b != interfaceC0050d) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f227b = null;
    }

    /* JADX INFO: renamed from: a */
    public void m241a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f226a);
        printWriter.print(" mListener=");
        printWriter.println(this.f227b);
        if (this.f228c || this.f231f || this.f232g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f228c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f231f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f232g);
        }
        if (this.f229d || this.f230e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f229d);
            printWriter.print(" mReset=");
            printWriter.println(this.f230e);
        }
    }

    /* JADX INFO: renamed from: b */
    protected void m242b() {
    }

    /* JADX INFO: renamed from: c */
    public void m243c() {
        this.f228c = false;
        m244d();
    }

    /* JADX INFO: renamed from: d */
    protected void m244d() {
    }

    /* JADX INFO: renamed from: e */
    public void m245e() {
        m246f();
        this.f230e = true;
        this.f228c = false;
        this.f229d = false;
        this.f231f = false;
        this.f232g = false;
    }

    /* JADX INFO: renamed from: f */
    protected void m246f() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0037d.m200a(this, sb);
        sb.append(" id=");
        sb.append(this.f226a);
        sb.append("}");
        return sb.toString();
    }
}
