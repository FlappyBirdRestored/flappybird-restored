package android.support.v4.app;

import android.support.v4.p001b.C0037d;
import android.support.v4.p001b.C0046m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: android.support.v4.app.z */
/* JADX INFO: loaded from: classes.dex */
class C0033z extends AbstractC0031x {

    /* JADX INFO: renamed from: a */
    static boolean f177a = false;

    /* JADX INFO: renamed from: b */
    final C0046m f178b = new C0046m();

    /* JADX INFO: renamed from: c */
    final C0046m f179c = new C0046m();

    /* JADX INFO: renamed from: d */
    final String f180d;

    /* JADX INFO: renamed from: e */
    FragmentActivity f181e;

    /* JADX INFO: renamed from: f */
    boolean f182f;

    /* JADX INFO: renamed from: g */
    boolean f183g;

    C0033z(String str, FragmentActivity fragmentActivity, boolean z) {
        this.f180d = str;
        this.f181e = fragmentActivity;
        this.f182f = z;
    }

    /* JADX INFO: renamed from: a */
    void m177a(FragmentActivity fragmentActivity) {
        this.f181e = fragmentActivity;
    }

    /* JADX INFO: renamed from: a */
    public void m178a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.f178b.m226b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.f178b.m226b(); i++) {
                C0006aa c0006aa = (C0006aa) this.f178b.m227b(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f178b.m224a(i));
                printWriter.print(": ");
                printWriter.println(c0006aa.toString());
                c0006aa.m77a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f179c.m226b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.f179c.m226b(); i2++) {
                C0006aa c0006aa2 = (C0006aa) this.f179c.m227b(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f179c.m224a(i2));
                printWriter.print(": ");
                printWriter.println(c0006aa2.toString());
                c0006aa2.m77a(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // android.support.v4.app.AbstractC0031x
    /* JADX INFO: renamed from: a */
    public boolean mo173a() {
        int iM226b = this.f178b.m226b();
        boolean z = false;
        for (int i = 0; i < iM226b; i++) {
            C0006aa c0006aa = (C0006aa) this.f178b.m227b(i);
            z |= c0006aa.f96h && !c0006aa.f94f;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    void m179b() {
        if (f177a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f182f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
        } else {
            this.f182f = true;
            for (int iM226b = this.f178b.m226b() - 1; iM226b >= 0; iM226b--) {
                ((C0006aa) this.f178b.m227b(iM226b)).m75a();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    void m180c() {
        if (f177a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.f182f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
        } else {
            for (int iM226b = this.f178b.m226b() - 1; iM226b >= 0; iM226b--) {
                ((C0006aa) this.f178b.m227b(iM226b)).m81e();
            }
            this.f182f = false;
        }
    }

    /* JADX INFO: renamed from: d */
    void m181d() {
        if (f177a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.f182f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
        } else {
            this.f183g = true;
            this.f182f = false;
            for (int iM226b = this.f178b.m226b() - 1; iM226b >= 0; iM226b--) {
                ((C0006aa) this.f178b.m227b(iM226b)).m78b();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    void m182e() {
        if (this.f183g) {
            if (f177a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.f183g = false;
            for (int iM226b = this.f178b.m226b() - 1; iM226b >= 0; iM226b--) {
                ((C0006aa) this.f178b.m227b(iM226b)).m79c();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    void m183f() {
        for (int iM226b = this.f178b.m226b() - 1; iM226b >= 0; iM226b--) {
            ((C0006aa) this.f178b.m227b(iM226b)).f99k = true;
        }
    }

    /* JADX INFO: renamed from: g */
    void m184g() {
        for (int iM226b = this.f178b.m226b() - 1; iM226b >= 0; iM226b--) {
            ((C0006aa) this.f178b.m227b(iM226b)).m80d();
        }
    }

    /* JADX INFO: renamed from: h */
    void m185h() {
        if (!this.f183g) {
            if (f177a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int iM226b = this.f178b.m226b() - 1; iM226b >= 0; iM226b--) {
                ((C0006aa) this.f178b.m227b(iM226b)).m82f();
            }
            this.f178b.m228c();
        }
        if (f177a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int iM226b2 = this.f179c.m226b() - 1; iM226b2 >= 0; iM226b2--) {
            ((C0006aa) this.f179c.m227b(iM226b2)).m82f();
        }
        this.f179c.m228c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0037d.m200a(this.f181e, sb);
        sb.append("}}");
        return sb.toString();
    }
}
