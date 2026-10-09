package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.p001b.C0037d;
import android.support.v4.p001b.C0045l;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener {

    /* JADX INFO: renamed from: P */
    private static final C0045l f11P = new C0045l();

    /* JADX INFO: renamed from: A */
    boolean f12A;

    /* JADX INFO: renamed from: B */
    boolean f13B;

    /* JADX INFO: renamed from: C */
    boolean f14C;

    /* JADX INFO: renamed from: D */
    boolean f15D;

    /* JADX INFO: renamed from: F */
    boolean f17F;

    /* JADX INFO: renamed from: G */
    int f18G;

    /* JADX INFO: renamed from: H */
    ViewGroup f19H;

    /* JADX INFO: renamed from: I */
    View f20I;

    /* JADX INFO: renamed from: J */
    View f21J;

    /* JADX INFO: renamed from: K */
    boolean f22K;

    /* JADX INFO: renamed from: M */
    C0033z f24M;

    /* JADX INFO: renamed from: N */
    boolean f25N;

    /* JADX INFO: renamed from: O */
    boolean f26O;

    /* JADX INFO: renamed from: b */
    View f28b;

    /* JADX INFO: renamed from: c */
    int f29c;

    /* JADX INFO: renamed from: d */
    Bundle f30d;

    /* JADX INFO: renamed from: e */
    SparseArray f31e;

    /* JADX INFO: renamed from: g */
    String f33g;

    /* JADX INFO: renamed from: h */
    Bundle f34h;

    /* JADX INFO: renamed from: i */
    Fragment f35i;

    /* JADX INFO: renamed from: k */
    int f37k;

    /* JADX INFO: renamed from: l */
    boolean f38l;

    /* JADX INFO: renamed from: m */
    boolean f39m;

    /* JADX INFO: renamed from: n */
    boolean f40n;

    /* JADX INFO: renamed from: o */
    boolean f41o;

    /* JADX INFO: renamed from: p */
    boolean f42p;

    /* JADX INFO: renamed from: q */
    boolean f43q;

    /* JADX INFO: renamed from: r */
    int f44r;

    /* JADX INFO: renamed from: s */
    C0022o f45s;

    /* JADX INFO: renamed from: t */
    FragmentActivity f46t;

    /* JADX INFO: renamed from: u */
    C0022o f47u;

    /* JADX INFO: renamed from: v */
    Fragment f48v;

    /* JADX INFO: renamed from: w */
    int f49w;

    /* JADX INFO: renamed from: x */
    int f50x;

    /* JADX INFO: renamed from: y */
    String f51y;

    /* JADX INFO: renamed from: z */
    boolean f52z;

    /* JADX INFO: renamed from: a */
    int f27a = 0;

    /* JADX INFO: renamed from: f */
    int f32f = -1;

    /* JADX INFO: renamed from: j */
    int f36j = -1;

    /* JADX INFO: renamed from: E */
    boolean f16E = true;

    /* JADX INFO: renamed from: L */
    boolean f23L = true;

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0014g();

        /* JADX INFO: renamed from: a */
        final Bundle f53a;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f53a = parcel.readBundle();
            if (classLoader == null || this.f53a == null) {
                return;
            }
            this.f53a.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f53a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Fragment m5a(Context context, String str) {
        return m6a(context, str, (Bundle) null);
    }

    /* JADX INFO: renamed from: a */
    public static Fragment m6a(Context context, String str, Bundle bundle) {
        try {
            Class<?> clsLoadClass = (Class) f11P.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                f11P.put(str, clsLoadClass);
            }
            Fragment fragment = (Fragment) clsLoadClass.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.f34h = bundle;
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw new C0013f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0013f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new C0013f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        }
    }

    /* JADX INFO: renamed from: b */
    static boolean m7b(Context context, String str) {
        try {
            Class<?> clsLoadClass = (Class) f11P.get(str);
            if (clsLoadClass == null) {
                clsLoadClass = context.getClassLoader().loadClass(str);
                f11P.put(str, clsLoadClass);
            }
            return Fragment.class.isAssignableFrom(clsLoadClass);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public View m8a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Animation m9a(int i, boolean z, int i2) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m10a(int i, int i2, Intent intent) {
    }

    /* JADX INFO: renamed from: a */
    final void m11a(int i, Fragment fragment) {
        this.f32f = i;
        if (fragment != null) {
            this.f33g = fragment.f33g + ":" + this.f32f;
        } else {
            this.f33g = "android:fragment:" + this.f32f;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m12a(Activity activity) {
        this.f17F = true;
    }

    /* JADX INFO: renamed from: a */
    public void m13a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f17F = true;
    }

    /* JADX INFO: renamed from: a */
    void m14a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f47u != null) {
            this.f47u.m118a(configuration);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m15a(Bundle bundle) {
        if (this.f31e != null) {
            this.f21J.restoreHierarchyState(this.f31e);
            this.f31e = null;
        }
        this.f17F = false;
        m38e(bundle);
        if (!this.f17F) {
            throw new C0008ac("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16a(Menu menu) {
    }

    /* JADX INFO: renamed from: a */
    public void m17a(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: renamed from: a */
    public void m18a(View view, Bundle bundle) {
    }

    /* JADX INFO: renamed from: a */
    public void m19a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f49w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f50x));
        printWriter.print(" mTag=");
        printWriter.println(this.f51y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f27a);
        printWriter.print(" mIndex=");
        printWriter.print(this.f32f);
        printWriter.print(" mWho=");
        printWriter.print(this.f33g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f44r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f38l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f39m);
        printWriter.print(" mResumed=");
        printWriter.print(this.f40n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f41o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f42p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f52z);
        printWriter.print(" mDetached=");
        printWriter.print(this.f12A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f16E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f15D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f13B);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f14C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f23L);
        if (this.f45s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f45s);
        }
        if (this.f46t != null) {
            printWriter.print(str);
            printWriter.print("mActivity=");
            printWriter.println(this.f46t);
        }
        if (this.f48v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f48v);
        }
        if (this.f34h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f34h);
        }
        if (this.f30d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f30d);
        }
        if (this.f31e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f31e);
        }
        if (this.f35i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f35i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f37k);
        }
        if (this.f18G != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.f18G);
        }
        if (this.f19H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f19H);
        }
        if (this.f20I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f20I);
        }
        if (this.f21J != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f20I);
        }
        if (this.f28b != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.f28b);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.f29c);
        }
        if (this.f24M != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.f24M.m178a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f47u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f47u + ":");
            this.f47u.m127a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m20a(boolean z) {
    }

    /* JADX INFO: renamed from: a */
    final boolean m21a() {
        return this.f44r > 0;
    }

    /* JADX INFO: renamed from: a */
    public boolean m22a(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final FragmentActivity m23b() {
        return this.f46t;
    }

    /* JADX INFO: renamed from: b */
    public LayoutInflater m24b(Bundle bundle) {
        return this.f46t.getLayoutInflater();
    }

    /* JADX INFO: renamed from: b */
    View m25b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f47u != null) {
            this.f47u.m151i();
        }
        return m8a(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: renamed from: b */
    public void m26b(Menu menu) {
    }

    /* JADX INFO: renamed from: b */
    boolean m27b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f52z) {
            return false;
        }
        if (this.f15D && this.f16E) {
            z = true;
            m17a(menu, menuInflater);
        }
        return this.f47u != null ? z | this.f47u.m130a(menu, menuInflater) : z;
    }

    /* JADX INFO: renamed from: b */
    public boolean m28b(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final Resources m29c() {
        if (this.f46t == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        return this.f46t.getResources();
    }

    /* JADX INFO: renamed from: c */
    public void m30c(Bundle bundle) {
        this.f17F = true;
    }

    /* JADX INFO: renamed from: c */
    boolean m31c(Menu menu) {
        boolean z = false;
        if (this.f52z) {
            return false;
        }
        if (this.f15D && this.f16E) {
            z = true;
            m16a(menu);
        }
        return this.f47u != null ? z | this.f47u.m129a(menu) : z;
    }

    /* JADX INFO: renamed from: c */
    boolean m32c(MenuItem menuItem) {
        if (!this.f52z) {
            if (this.f15D && this.f16E && m22a(menuItem)) {
                return true;
            }
            if (this.f47u != null && this.f47u.m131a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m33d(Bundle bundle) {
        this.f17F = true;
    }

    /* JADX INFO: renamed from: d */
    void m34d(Menu menu) {
        if (this.f52z) {
            return;
        }
        if (this.f15D && this.f16E) {
            m26b(menu);
        }
        if (this.f47u != null) {
            this.f47u.m136b(menu);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m35d() {
        return this.f12A;
    }

    /* JADX INFO: renamed from: d */
    boolean m36d(MenuItem menuItem) {
        if (!this.f52z) {
            if (m28b(menuItem)) {
                return true;
            }
            if (this.f47u != null && this.f47u.m137b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m37e() {
        this.f17F = true;
        if (this.f25N) {
            return;
        }
        this.f25N = true;
        if (!this.f26O) {
            this.f26O = true;
            this.f24M = this.f46t.m62a(this.f33g, this.f25N, false);
        }
        if (this.f24M != null) {
            this.f24M.m179b();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m38e(Bundle bundle) {
        this.f17F = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public void m39f() {
        this.f17F = true;
    }

    /* JADX INFO: renamed from: f */
    public void m40f(Bundle bundle) {
    }

    /* JADX INFO: renamed from: g */
    public void m41g() {
        this.f17F = true;
    }

    /* JADX INFO: renamed from: g */
    void m42g(Bundle bundle) {
        Parcelable parcelable;
        if (this.f47u != null) {
            this.f47u.m151i();
        }
        this.f17F = false;
        m30c(bundle);
        if (!this.f17F) {
            throw new C0008ac("Fragment " + this + " did not call through to super.onCreate()");
        }
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        if (this.f47u == null) {
            m51n();
        }
        this.f47u.m120a(parcelable, (ArrayList) null);
        this.f47u.m152j();
    }

    /* JADX INFO: renamed from: h */
    public void m43h() {
        this.f17F = true;
    }

    /* JADX INFO: renamed from: h */
    void m44h(Bundle bundle) {
        if (this.f47u != null) {
            this.f47u.m151i();
        }
        this.f17F = false;
        m33d(bundle);
        if (!this.f17F) {
            throw new C0008ac("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
        if (this.f47u != null) {
            this.f47u.m153k();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public void m45i() {
        this.f17F = true;
    }

    /* JADX INFO: renamed from: i */
    void m46i(Bundle bundle) {
        Parcelable parcelableM150h;
        m40f(bundle);
        if (this.f47u == null || (parcelableM150h = this.f47u.m150h()) == null) {
            return;
        }
        bundle.putParcelable("android:support:fragments", parcelableM150h);
    }

    /* JADX INFO: renamed from: j */
    public void m47j() {
        this.f17F = true;
        if (!this.f26O) {
            this.f26O = true;
            this.f24M = this.f46t.m62a(this.f33g, this.f25N, false);
        }
        if (this.f24M != null) {
            this.f24M.m185h();
        }
    }

    /* JADX INFO: renamed from: k */
    void m48k() {
        this.f32f = -1;
        this.f33g = null;
        this.f38l = false;
        this.f39m = false;
        this.f40n = false;
        this.f41o = false;
        this.f42p = false;
        this.f43q = false;
        this.f44r = 0;
        this.f45s = null;
        this.f46t = null;
        this.f49w = 0;
        this.f50x = 0;
        this.f51y = null;
        this.f52z = false;
        this.f12A = false;
        this.f14C = false;
        this.f24M = null;
        this.f25N = false;
        this.f26O = false;
    }

    /* JADX INFO: renamed from: l */
    public void m49l() {
        this.f17F = true;
    }

    /* JADX INFO: renamed from: m */
    public void m50m() {
    }

    /* JADX INFO: renamed from: n */
    void m51n() {
        this.f47u = new C0022o();
        this.f47u.m125a(this.f46t, new C0012e(this), this);
    }

    /* JADX INFO: renamed from: o */
    void m52o() {
        if (this.f47u != null) {
            this.f47u.m151i();
            this.f47u.m146e();
        }
        this.f17F = false;
        m37e();
        if (!this.f17F) {
            throw new C0008ac("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.f47u != null) {
            this.f47u.m154l();
        }
        if (this.f24M != null) {
            this.f24M.m184g();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f17F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m23b().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f17F = true;
    }

    /* JADX INFO: renamed from: p */
    void m53p() {
        if (this.f47u != null) {
            this.f47u.m151i();
            this.f47u.m146e();
        }
        this.f17F = false;
        m39f();
        if (!this.f17F) {
            throw new C0008ac("Fragment " + this + " did not call through to super.onResume()");
        }
        if (this.f47u != null) {
            this.f47u.m155m();
            this.f47u.m146e();
        }
    }

    /* JADX INFO: renamed from: q */
    void m54q() {
        onLowMemory();
        if (this.f47u != null) {
            this.f47u.m161s();
        }
    }

    /* JADX INFO: renamed from: r */
    void m55r() {
        if (this.f47u != null) {
            this.f47u.m156n();
        }
        this.f17F = false;
        m41g();
        if (!this.f17F) {
            throw new C0008ac("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* JADX INFO: renamed from: s */
    void m56s() {
        if (this.f47u != null) {
            this.f47u.m157o();
        }
        this.f17F = false;
        m43h();
        if (!this.f17F) {
            throw new C0008ac("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* JADX INFO: renamed from: t */
    void m57t() {
        if (this.f47u != null) {
            this.f47u.m158p();
        }
        if (this.f25N) {
            this.f25N = false;
            if (!this.f26O) {
                this.f26O = true;
                this.f24M = this.f46t.m62a(this.f33g, this.f25N, false);
            }
            if (this.f24M != null) {
                if (this.f46t.f61h) {
                    this.f24M.m181d();
                } else {
                    this.f24M.m180c();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0037d.m200a(this, sb);
        if (this.f32f >= 0) {
            sb.append(" #");
            sb.append(this.f32f);
        }
        if (this.f49w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f49w));
        }
        if (this.f51y != null) {
            sb.append(" ");
            sb.append(this.f51y);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    void m58u() {
        if (this.f47u != null) {
            this.f47u.m159q();
        }
        this.f17F = false;
        m45i();
        if (!this.f17F) {
            throw new C0008ac("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        if (this.f24M != null) {
            this.f24M.m183f();
        }
    }

    /* JADX INFO: renamed from: v */
    void m59v() {
        if (this.f47u != null) {
            this.f47u.m160r();
        }
        this.f17F = false;
        m47j();
        if (!this.f17F) {
            throw new C0008ac("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }
}
