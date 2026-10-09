package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.C0049c;
import android.support.v4.content.InterfaceC0050d;
import android.support.v4.p001b.C0037d;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: android.support.v4.app.aa */
/* JADX INFO: loaded from: classes.dex */
final class C0006aa implements InterfaceC0050d {

    /* JADX INFO: renamed from: a */
    final int f89a;

    /* JADX INFO: renamed from: b */
    final Bundle f90b;

    /* JADX INFO: renamed from: c */
    InterfaceC0032y f91c;

    /* JADX INFO: renamed from: d */
    C0049c f92d;

    /* JADX INFO: renamed from: e */
    boolean f93e;

    /* JADX INFO: renamed from: f */
    boolean f94f;

    /* JADX INFO: renamed from: g */
    Object f95g;

    /* JADX INFO: renamed from: h */
    boolean f96h;

    /* JADX INFO: renamed from: i */
    boolean f97i;

    /* JADX INFO: renamed from: j */
    boolean f98j;

    /* JADX INFO: renamed from: k */
    boolean f99k;

    /* JADX INFO: renamed from: l */
    boolean f100l;

    /* JADX INFO: renamed from: m */
    boolean f101m;

    /* JADX INFO: renamed from: n */
    C0006aa f102n;

    /* JADX INFO: renamed from: o */
    final /* synthetic */ C0033z f103o;

    /* JADX INFO: renamed from: a */
    void m75a() {
        if (this.f97i && this.f98j) {
            this.f96h = true;
            return;
        }
        if (this.f96h) {
            return;
        }
        this.f96h = true;
        if (C0033z.f177a) {
            Log.v("LoaderManager", "  Starting: " + this);
        }
        if (this.f92d == null && this.f91c != null) {
            this.f92d = this.f91c.m174a(this.f89a, this.f90b);
        }
        if (this.f92d != null) {
            if (this.f92d.getClass().isMemberClass() && !Modifier.isStatic(this.f92d.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f92d);
            }
            if (!this.f101m) {
                this.f92d.m239a(this.f89a, this);
                this.f101m = true;
            }
            this.f92d.m238a();
        }
    }

    /* JADX INFO: renamed from: a */
    void m76a(C0049c c0049c, Object obj) {
        String str;
        if (this.f91c != null) {
            if (this.f103o.f181e != null) {
                String str2 = this.f103o.f181e.f55b.f165u;
                this.f103o.f181e.f55b.f165u = "onLoadFinished";
                str = str2;
            } else {
                str = null;
            }
            try {
                if (C0033z.f177a) {
                    Log.v("LoaderManager", "  onLoadFinished in " + c0049c + ": " + c0049c.m237a(obj));
                }
                this.f91c.m176a(c0049c, obj);
                if (this.f103o.f181e != null) {
                    this.f103o.f181e.f55b.f165u = str;
                }
                this.f94f = true;
            } catch (Throwable th) {
                if (this.f103o.f181e != null) {
                    this.f103o.f181e.f55b.f165u = str;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f89a);
        printWriter.print(" mArgs=");
        printWriter.println(this.f90b);
        printWriter.print(str);
        printWriter.print("mCallbacks=");
        printWriter.println(this.f91c);
        printWriter.print(str);
        printWriter.print("mLoader=");
        printWriter.println(this.f92d);
        if (this.f92d != null) {
            this.f92d.m241a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f93e || this.f94f) {
            printWriter.print(str);
            printWriter.print("mHaveData=");
            printWriter.print(this.f93e);
            printWriter.print("  mDeliveredData=");
            printWriter.println(this.f94f);
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(this.f95g);
        }
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.print(this.f96h);
        printWriter.print(" mReportNextStart=");
        printWriter.print(this.f99k);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f100l);
        printWriter.print(str);
        printWriter.print("mRetaining=");
        printWriter.print(this.f97i);
        printWriter.print(" mRetainingStarted=");
        printWriter.print(this.f98j);
        printWriter.print(" mListenerRegistered=");
        printWriter.println(this.f101m);
        if (this.f102n != null) {
            printWriter.print(str);
            printWriter.println("Pending Loader ");
            printWriter.print(this.f102n);
            printWriter.println(":");
            this.f102n.m77a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX INFO: renamed from: b */
    void m78b() {
        if (C0033z.f177a) {
            Log.v("LoaderManager", "  Retaining: " + this);
        }
        this.f97i = true;
        this.f98j = this.f96h;
        this.f96h = false;
        this.f91c = null;
    }

    /* JADX INFO: renamed from: c */
    void m79c() {
        if (this.f97i) {
            if (C0033z.f177a) {
                Log.v("LoaderManager", "  Finished Retaining: " + this);
            }
            this.f97i = false;
            if (this.f96h != this.f98j && !this.f96h) {
                m81e();
            }
        }
        if (this.f96h && this.f93e && !this.f99k) {
            m76a(this.f92d, this.f95g);
        }
    }

    /* JADX INFO: renamed from: d */
    void m80d() {
        if (this.f96h && this.f99k) {
            this.f99k = false;
            if (this.f93e) {
                m76a(this.f92d, this.f95g);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    void m81e() {
        if (C0033z.f177a) {
            Log.v("LoaderManager", "  Stopping: " + this);
        }
        this.f96h = false;
        if (this.f97i || this.f92d == null || !this.f101m) {
            return;
        }
        this.f101m = false;
        this.f92d.m240a((InterfaceC0050d) this);
        this.f92d.m243c();
    }

    /* JADX INFO: renamed from: f */
    void m82f() {
        String str;
        if (C0033z.f177a) {
            Log.v("LoaderManager", "  Destroying: " + this);
        }
        this.f100l = true;
        boolean z = this.f94f;
        this.f94f = false;
        if (this.f91c != null && this.f92d != null && this.f93e && z) {
            if (C0033z.f177a) {
                Log.v("LoaderManager", "  Reseting: " + this);
            }
            if (this.f103o.f181e != null) {
                String str2 = this.f103o.f181e.f55b.f165u;
                this.f103o.f181e.f55b.f165u = "onLoaderReset";
                str = str2;
            } else {
                str = null;
            }
            try {
                this.f91c.m175a(this.f92d);
                if (this.f103o.f181e != null) {
                    this.f103o.f181e.f55b.f165u = str;
                }
            } catch (Throwable th) {
                if (this.f103o.f181e != null) {
                    this.f103o.f181e.f55b.f165u = str;
                }
                throw th;
            }
        }
        this.f91c = null;
        this.f95g = null;
        this.f93e = false;
        if (this.f92d != null) {
            if (this.f101m) {
                this.f101m = false;
                this.f92d.m240a((InterfaceC0050d) this);
            }
            this.f92d.m245e();
        }
        if (this.f102n != null) {
            this.f102n.m82f();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.f89a);
        sb.append(" : ");
        C0037d.m200a(this.f92d, sb);
        sb.append("}}");
        return sb.toString();
    }
}
