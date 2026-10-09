package android.support.v4.app;

import android.support.v4.p001b.C0038e;
import android.util.Log;
import com.google.android.gms.C0467e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.v4.app.b */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0009b extends AbstractC0030w implements Runnable {

    /* JADX INFO: renamed from: a */
    final C0022o f104a;

    /* JADX INFO: renamed from: b */
    C0010c f105b;

    /* JADX INFO: renamed from: c */
    C0010c f106c;

    /* JADX INFO: renamed from: d */
    int f107d;

    /* JADX INFO: renamed from: e */
    int f108e;

    /* JADX INFO: renamed from: f */
    int f109f;

    /* JADX INFO: renamed from: g */
    int f110g;

    /* JADX INFO: renamed from: h */
    int f111h;

    /* JADX INFO: renamed from: i */
    int f112i;

    /* JADX INFO: renamed from: j */
    int f113j;

    /* JADX INFO: renamed from: k */
    boolean f114k;

    /* JADX INFO: renamed from: m */
    String f116m;

    /* JADX INFO: renamed from: n */
    boolean f117n;

    /* JADX INFO: renamed from: p */
    int f119p;

    /* JADX INFO: renamed from: q */
    CharSequence f120q;

    /* JADX INFO: renamed from: r */
    int f121r;

    /* JADX INFO: renamed from: s */
    CharSequence f122s;

    /* JADX INFO: renamed from: l */
    boolean f115l = true;

    /* JADX INFO: renamed from: o */
    int f118o = -1;

    public RunnableC0009b(C0022o c0022o) {
        this.f104a = c0022o;
    }

    /* JADX INFO: renamed from: a */
    private void m84a(int i, Fragment fragment, String str, int i2) {
        fragment.f45s = this.f104a;
        if (str != null) {
            if (fragment.f51y != null && !str.equals(fragment.f51y)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f51y + " now " + str);
            }
            fragment.f51y = str;
        }
        if (i != 0) {
            if (fragment.f49w != 0 && fragment.f49w != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f49w + " now " + i);
            }
            fragment.f49w = i;
            fragment.f50x = i;
        }
        C0010c c0010c = new C0010c();
        c0010c.f125c = i2;
        c0010c.f126d = fragment;
        m90a(c0010c);
    }

    @Override // android.support.v4.app.AbstractC0030w
    /* JADX INFO: renamed from: a */
    public int mo85a() {
        return m86a(false);
    }

    /* JADX INFO: renamed from: a */
    int m86a(boolean z) {
        if (this.f117n) {
            throw new IllegalStateException("commit already called");
        }
        if (C0022o.f144a) {
            Log.v("FragmentManager", "Commit: " + this);
            m91a("  ", (FileDescriptor) null, new PrintWriter(new C0038e("FragmentManager")), (String[]) null);
        }
        this.f117n = true;
        if (this.f114k) {
            this.f118o = this.f104a.m111a(this);
        } else {
            this.f118o = -1;
        }
        this.f104a.m126a(this, z);
        return this.f118o;
    }

    @Override // android.support.v4.app.AbstractC0030w
    /* JADX INFO: renamed from: a */
    public AbstractC0030w mo87a(int i, Fragment fragment, String str) {
        m84a(i, fragment, str, 1);
        return this;
    }

    @Override // android.support.v4.app.AbstractC0030w
    /* JADX INFO: renamed from: a */
    public AbstractC0030w mo88a(Fragment fragment) {
        C0010c c0010c = new C0010c();
        c0010c.f125c = 6;
        c0010c.f126d = fragment;
        m90a(c0010c);
        return this;
    }

    /* JADX INFO: renamed from: a */
    void m89a(int i) {
        if (this.f114k) {
            if (C0022o.f144a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (C0010c c0010c = this.f105b; c0010c != null; c0010c = c0010c.f123a) {
                if (c0010c.f126d != null) {
                    c0010c.f126d.f44r += i;
                    if (C0022o.f144a) {
                        Log.v("FragmentManager", "Bump nesting of " + c0010c.f126d + " to " + c0010c.f126d.f44r);
                    }
                }
                if (c0010c.f131i != null) {
                    for (int size = c0010c.f131i.size() - 1; size >= 0; size--) {
                        Fragment fragment = (Fragment) c0010c.f131i.get(size);
                        fragment.f44r += i;
                        if (C0022o.f144a) {
                            Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.f44r);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m90a(C0010c c0010c) {
        if (this.f105b == null) {
            this.f106c = c0010c;
            this.f105b = c0010c;
        } else {
            c0010c.f124b = this.f106c;
            this.f106c.f123a = c0010c;
            this.f106c = c0010c;
        }
        c0010c.f127e = this.f108e;
        c0010c.f128f = this.f109f;
        c0010c.f129g = this.f110g;
        c0010c.f130h = this.f111h;
        this.f107d++;
    }

    /* JADX INFO: renamed from: a */
    public void m91a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m92a(str, printWriter, true);
    }

    /* JADX INFO: renamed from: a */
    public void m92a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f116m);
            printWriter.print(" mIndex=");
            printWriter.print(this.f118o);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f117n);
            if (this.f112i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f112i));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f113j));
            }
            if (this.f108e != 0 || this.f109f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f108e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f109f));
            }
            if (this.f110g != 0 || this.f111h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f110g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f111h));
            }
            if (this.f119p != 0 || this.f120q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f119p));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f120q);
            }
            if (this.f121r != 0 || this.f122s != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f121r));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f122s);
            }
        }
        if (this.f105b != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            int i = 0;
            C0010c c0010c = this.f105b;
            while (c0010c != null) {
                switch (c0010c.f125c) {
                    case C0467e.MapAttrs_mapType /* 0 */:
                        str2 = "NULL";
                        break;
                    case C0467e.MapAttrs_cameraBearing /* 1 */:
                        str2 = "ADD";
                        break;
                    case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                        str2 = "REPLACE";
                        break;
                    case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                        str2 = "REMOVE";
                        break;
                    case C0467e.MapAttrs_cameraTilt /* 4 */:
                        str2 = "HIDE";
                        break;
                    case C0467e.MapAttrs_cameraZoom /* 5 */:
                        str2 = "SHOW";
                        break;
                    case C0467e.MapAttrs_uiCompass /* 6 */:
                        str2 = "DETACH";
                        break;
                    case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + c0010c.f125c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c0010c.f126d);
                if (z) {
                    if (c0010c.f127e != 0 || c0010c.f128f != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0010c.f127e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0010c.f128f));
                    }
                    if (c0010c.f129g != 0 || c0010c.f130h != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0010c.f129g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0010c.f130h));
                    }
                }
                if (c0010c.f131i != null && c0010c.f131i.size() > 0) {
                    for (int i2 = 0; i2 < c0010c.f131i.size(); i2++) {
                        printWriter.print(str3);
                        if (c0010c.f131i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str3);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(c0010c.f131i.get(i2));
                    }
                }
                c0010c = c0010c.f123a;
                i++;
            }
        }
    }

    @Override // android.support.v4.app.AbstractC0030w
    /* JADX INFO: renamed from: b */
    public AbstractC0030w mo93b(Fragment fragment) {
        C0010c c0010c = new C0010c();
        c0010c.f125c = 7;
        c0010c.f126d = fragment;
        m90a(c0010c);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public String m94b() {
        return this.f116m;
    }

    /* JADX INFO: renamed from: b */
    public void m95b(boolean z) {
        if (C0022o.f144a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            m91a("  ", (FileDescriptor) null, new PrintWriter(new C0038e("FragmentManager")), (String[]) null);
        }
        m89a(-1);
        for (C0010c c0010c = this.f106c; c0010c != null; c0010c = c0010c.f124b) {
            switch (c0010c.f125c) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    Fragment fragment = c0010c.f126d;
                    fragment.f18G = c0010c.f130h;
                    this.f104a.m122a(fragment, C0022o.m109c(this.f112i), this.f113j);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    Fragment fragment2 = c0010c.f126d;
                    if (fragment2 != null) {
                        fragment2.f18G = c0010c.f130h;
                        this.f104a.m122a(fragment2, C0022o.m109c(this.f112i), this.f113j);
                    }
                    if (c0010c.f131i != null) {
                        for (int i = 0; i < c0010c.f131i.size(); i++) {
                            Fragment fragment3 = (Fragment) c0010c.f131i.get(i);
                            fragment3.f18G = c0010c.f129g;
                            this.f104a.m124a(fragment3, false);
                        }
                    }
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    Fragment fragment4 = c0010c.f126d;
                    fragment4.f18G = c0010c.f129g;
                    this.f104a.m124a(fragment4, false);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    Fragment fragment5 = c0010c.f126d;
                    fragment5.f18G = c0010c.f129g;
                    this.f104a.m139c(fragment5, C0022o.m109c(this.f112i), this.f113j);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    Fragment fragment6 = c0010c.f126d;
                    fragment6.f18G = c0010c.f130h;
                    this.f104a.m134b(fragment6, C0022o.m109c(this.f112i), this.f113j);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    Fragment fragment7 = c0010c.f126d;
                    fragment7.f18G = c0010c.f129g;
                    this.f104a.m145e(fragment7, C0022o.m109c(this.f112i), this.f113j);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    Fragment fragment8 = c0010c.f126d;
                    fragment8.f18G = c0010c.f129g;
                    this.f104a.m143d(fragment8, C0022o.m109c(this.f112i), this.f113j);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0010c.f125c);
            }
        }
        if (z) {
            this.f104a.m115a(this.f104a.f158n, C0022o.m109c(this.f112i), this.f113j, true);
        }
        if (this.f118o >= 0) {
            this.f104a.m132b(this.f118o);
            this.f118o = -1;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Fragment fragment;
        if (C0022o.f144a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (this.f114k && this.f118o < 0) {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        m89a(1);
        for (C0010c c0010c = this.f105b; c0010c != null; c0010c = c0010c.f123a) {
            switch (c0010c.f125c) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    Fragment fragment2 = c0010c.f126d;
                    fragment2.f18G = c0010c.f127e;
                    this.f104a.m124a(fragment2, false);
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    Fragment fragment3 = c0010c.f126d;
                    if (this.f104a.f151g != null) {
                        fragment = fragment3;
                        for (int i = 0; i < this.f104a.f151g.size(); i++) {
                            Fragment fragment4 = (Fragment) this.f104a.f151g.get(i);
                            if (C0022o.f144a) {
                                Log.v("FragmentManager", "OP_REPLACE: adding=" + fragment + " old=" + fragment4);
                            }
                            if (fragment == null || fragment4.f50x == fragment.f50x) {
                                if (fragment4 == fragment) {
                                    fragment = null;
                                    c0010c.f126d = null;
                                } else {
                                    if (c0010c.f131i == null) {
                                        c0010c.f131i = new ArrayList();
                                    }
                                    c0010c.f131i.add(fragment4);
                                    fragment4.f18G = c0010c.f128f;
                                    if (this.f114k) {
                                        fragment4.f44r++;
                                        if (C0022o.f144a) {
                                            Log.v("FragmentManager", "Bump nesting of " + fragment4 + " to " + fragment4.f44r);
                                        }
                                    }
                                    this.f104a.m122a(fragment4, this.f112i, this.f113j);
                                }
                            }
                        }
                    } else {
                        fragment = fragment3;
                    }
                    if (fragment != null) {
                        fragment.f18G = c0010c.f127e;
                        this.f104a.m124a(fragment, false);
                    }
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    Fragment fragment5 = c0010c.f126d;
                    fragment5.f18G = c0010c.f128f;
                    this.f104a.m122a(fragment5, this.f112i, this.f113j);
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    Fragment fragment6 = c0010c.f126d;
                    fragment6.f18G = c0010c.f128f;
                    this.f104a.m134b(fragment6, this.f112i, this.f113j);
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    Fragment fragment7 = c0010c.f126d;
                    fragment7.f18G = c0010c.f127e;
                    this.f104a.m139c(fragment7, this.f112i, this.f113j);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    Fragment fragment8 = c0010c.f126d;
                    fragment8.f18G = c0010c.f128f;
                    this.f104a.m143d(fragment8, this.f112i, this.f113j);
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    Fragment fragment9 = c0010c.f126d;
                    fragment9.f18G = c0010c.f127e;
                    this.f104a.m145e(fragment9, this.f112i, this.f113j);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0010c.f125c);
            }
        }
        this.f104a.m115a(this.f104a.f158n, this.f112i, this.f113j, true);
        if (this.f114k) {
            this.f104a.m135b(this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f118o >= 0) {
            sb.append(" #");
            sb.append(this.f118o);
        }
        if (this.f116m != null) {
            sb.append(" ");
            sb.append(this.f116m);
        }
        sb.append("}");
        return sb.toString();
    }
}
