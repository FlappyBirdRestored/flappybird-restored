package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.p001b.C0037d;
import android.support.v4.p001b.C0038e;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import com.google.android.gms.C0467e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: android.support.v4.app.o */
/* JADX INFO: loaded from: classes.dex */
final class C0022o extends AbstractC0020m {

    /* JADX INFO: renamed from: A */
    static final Interpolator f141A;

    /* JADX INFO: renamed from: B */
    static final Interpolator f142B;

    /* JADX INFO: renamed from: C */
    static final Interpolator f143C;

    /* JADX INFO: renamed from: a */
    static boolean f144a = false;

    /* JADX INFO: renamed from: b */
    static final boolean f145b;

    /* JADX INFO: renamed from: z */
    static final Interpolator f146z;

    /* JADX INFO: renamed from: c */
    ArrayList f147c;

    /* JADX INFO: renamed from: d */
    Runnable[] f148d;

    /* JADX INFO: renamed from: e */
    boolean f149e;

    /* JADX INFO: renamed from: f */
    ArrayList f150f;

    /* JADX INFO: renamed from: g */
    ArrayList f151g;

    /* JADX INFO: renamed from: h */
    ArrayList f152h;

    /* JADX INFO: renamed from: i */
    ArrayList f153i;

    /* JADX INFO: renamed from: j */
    ArrayList f154j;

    /* JADX INFO: renamed from: k */
    ArrayList f155k;

    /* JADX INFO: renamed from: l */
    ArrayList f156l;

    /* JADX INFO: renamed from: m */
    ArrayList f157m;

    /* JADX INFO: renamed from: o */
    FragmentActivity f159o;

    /* JADX INFO: renamed from: p */
    InterfaceC0019l f160p;

    /* JADX INFO: renamed from: q */
    Fragment f161q;

    /* JADX INFO: renamed from: r */
    boolean f162r;

    /* JADX INFO: renamed from: s */
    boolean f163s;

    /* JADX INFO: renamed from: t */
    boolean f164t;

    /* JADX INFO: renamed from: u */
    String f165u;

    /* JADX INFO: renamed from: v */
    boolean f166v;

    /* JADX INFO: renamed from: n */
    int f158n = 0;

    /* JADX INFO: renamed from: w */
    Bundle f167w = null;

    /* JADX INFO: renamed from: x */
    SparseArray f168x = null;

    /* JADX INFO: renamed from: y */
    Runnable f169y = new RunnableC0023p(this);

    static {
        f145b = Build.VERSION.SDK_INT >= 11;
        f146z = new DecelerateInterpolator(2.5f);
        f141A = new DecelerateInterpolator(1.5f);
        f142B = new AccelerateInterpolator(2.5f);
        f143C = new AccelerateInterpolator(1.5f);
    }

    C0022o() {
    }

    /* JADX INFO: renamed from: a */
    static Animation m105a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f141A);
        alphaAnimation.setDuration(220L);
        return alphaAnimation;
    }

    /* JADX INFO: renamed from: a */
    static Animation m106a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f146z);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f141A);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    /* JADX INFO: renamed from: a */
    private void m107a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0038e("FragmentManager"));
        if (this.f159o != null) {
            try {
                this.f159o.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            m127a("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m108b(int i, boolean z) {
        switch (i) {
            case 4097:
                return z ? 1 : 2;
            case 4099:
                return z ? 5 : 6;
            case 8194:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m109c(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m110t() {
        if (this.f163s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f165u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f165u);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m111a(RunnableC0009b runnableC0009b) {
        int size;
        synchronized (this) {
            if (this.f156l == null || this.f156l.size() <= 0) {
                if (this.f155k == null) {
                    this.f155k = new ArrayList();
                }
                size = this.f155k.size();
                if (f144a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + runnableC0009b);
                }
                this.f155k.add(runnableC0009b);
            } else {
                size = ((Integer) this.f156l.remove(this.f156l.size() - 1)).intValue();
                if (f144a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + runnableC0009b);
                }
                this.f155k.set(size, runnableC0009b);
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: a */
    public Fragment m112a(int i) {
        if (this.f151g != null) {
            for (int size = this.f151g.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f151g.get(size);
                if (fragment != null && fragment.f49w == i) {
                    return fragment;
                }
            }
        }
        if (this.f150f != null) {
            for (int size2 = this.f150f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f150f.get(size2);
                if (fragment2 != null && fragment2.f49w == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Fragment m113a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f150f.size()) {
            m107a(new IllegalStateException("Fragement no longer exists for key " + str + ": index " + i));
        }
        Fragment fragment = (Fragment) this.f150f.get(i);
        if (fragment != null) {
            return fragment;
        }
        m107a(new IllegalStateException("Fragement no longer exists for key " + str + ": index " + i));
        return fragment;
    }

    @Override // android.support.v4.app.AbstractC0020m
    /* JADX INFO: renamed from: a */
    public Fragment mo101a(String str) {
        if (this.f151g != null && str != null) {
            for (int size = this.f151g.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f151g.get(size);
                if (fragment != null && str.equals(fragment.f51y)) {
                    return fragment;
                }
            }
        }
        if (this.f150f != null && str != null) {
            for (int size2 = this.f150f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f150f.get(size2);
                if (fragment2 != null && str.equals(fragment2.f51y)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    @Override // android.support.v4.app.AbstractC0020m
    /* JADX INFO: renamed from: a */
    public AbstractC0030w mo102a() {
        return new RunnableC0009b(this);
    }

    /* JADX INFO: renamed from: a */
    Animation m114a(Fragment fragment, int i, boolean z, int i2) {
        int iM108b;
        Animation animationLoadAnimation;
        Animation animationM9a = fragment.m9a(i, z, fragment.f18G);
        if (animationM9a != null) {
            return animationM9a;
        }
        if (fragment.f18G != 0 && (animationLoadAnimation = AnimationUtils.loadAnimation(this.f159o, fragment.f18G)) != null) {
            return animationLoadAnimation;
        }
        if (i != 0 && (iM108b = m108b(i, z)) >= 0) {
            switch (iM108b) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    return m106a(this.f159o, 1.125f, 1.0f, 0.0f, 1.0f);
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    return m106a(this.f159o, 1.0f, 0.975f, 1.0f, 0.0f);
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    return m106a(this.f159o, 0.975f, 1.0f, 0.0f, 1.0f);
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    return m106a(this.f159o, 1.0f, 1.075f, 1.0f, 0.0f);
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    return m105a(this.f159o, 0.0f, 1.0f);
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    return m105a(this.f159o, 1.0f, 0.0f);
                default:
                    if (i2 == 0 && this.f159o.getWindow() != null) {
                        i2 = this.f159o.getWindow().getAttributes().windowAnimations;
                    }
                    return i2 == 0 ? null : null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    void m115a(int i, int i2, int i3, boolean z) {
        if (this.f159o == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || this.f158n != i) {
            this.f158n = i;
            if (this.f150f != null) {
                int i4 = 0;
                boolean zMo173a = false;
                while (i4 < this.f150f.size()) {
                    Fragment fragment = (Fragment) this.f150f.get(i4);
                    if (fragment != null) {
                        m123a(fragment, i, i2, i3, false);
                        if (fragment.f24M != null) {
                            zMo173a |= fragment.f24M.mo173a();
                        }
                    }
                    i4++;
                    zMo173a = zMo173a;
                }
                if (!zMo173a) {
                    m141d();
                }
                if (this.f162r && this.f159o != null && this.f158n == 5) {
                    this.f159o.m69c();
                    this.f162r = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m116a(int i, RunnableC0009b runnableC0009b) {
        synchronized (this) {
            if (this.f155k == null) {
                this.f155k = new ArrayList();
            }
            int size = this.f155k.size();
            if (i < size) {
                if (f144a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + runnableC0009b);
                }
                this.f155k.set(i, runnableC0009b);
            } else {
                while (size < i) {
                    this.f155k.add(null);
                    if (this.f156l == null) {
                        this.f156l = new ArrayList();
                    }
                    if (f144a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f156l.add(Integer.valueOf(size));
                    size++;
                }
                if (f144a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + runnableC0009b);
                }
                this.f155k.add(runnableC0009b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m117a(int i, boolean z) {
        m115a(i, 0, 0, z);
    }

    /* JADX INFO: renamed from: a */
    public void m118a(Configuration configuration) {
        if (this.f151g == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f151g.size()) {
                return;
            }
            Fragment fragment = (Fragment) this.f151g.get(i2);
            if (fragment != null) {
                fragment.m14a(configuration);
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m119a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f32f < 0) {
            m107a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.f32f);
    }

    /* JADX INFO: renamed from: a */
    void m120a(Parcelable parcelable, ArrayList arrayList) {
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f67a != null) {
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    Fragment fragment = (Fragment) arrayList.get(i);
                    if (f144a) {
                        Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                    }
                    FragmentState fragmentState = fragmentManagerState.f67a[fragment.f32f];
                    fragmentState.f80k = fragment;
                    fragment.f31e = null;
                    fragment.f44r = 0;
                    fragment.f42p = false;
                    fragment.f38l = false;
                    fragment.f35i = null;
                    if (fragmentState.f79j != null) {
                        fragmentState.f79j.setClassLoader(this.f159o.getClassLoader());
                        fragment.f31e = fragmentState.f79j.getSparseParcelableArray("android:view_state");
                    }
                }
            }
            this.f150f = new ArrayList(fragmentManagerState.f67a.length);
            if (this.f152h != null) {
                this.f152h.clear();
            }
            for (int i2 = 0; i2 < fragmentManagerState.f67a.length; i2++) {
                FragmentState fragmentState2 = fragmentManagerState.f67a[i2];
                if (fragmentState2 != null) {
                    Fragment fragmentM71a = fragmentState2.m71a(this.f159o, this.f161q);
                    if (f144a) {
                        Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + fragmentM71a);
                    }
                    this.f150f.add(fragmentM71a);
                    fragmentState2.f80k = null;
                } else {
                    this.f150f.add(null);
                    if (this.f152h == null) {
                        this.f152h = new ArrayList();
                    }
                    if (f144a) {
                        Log.v("FragmentManager", "restoreAllState: avail #" + i2);
                    }
                    this.f152h.add(Integer.valueOf(i2));
                }
            }
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Fragment fragment2 = (Fragment) arrayList.get(i3);
                    if (fragment2.f36j >= 0) {
                        if (fragment2.f36j < this.f150f.size()) {
                            fragment2.f35i = (Fragment) this.f150f.get(fragment2.f36j);
                        } else {
                            Log.w("FragmentManager", "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.f36j);
                            fragment2.f35i = null;
                        }
                    }
                }
            }
            if (fragmentManagerState.f68b != null) {
                this.f151g = new ArrayList(fragmentManagerState.f68b.length);
                for (int i4 = 0; i4 < fragmentManagerState.f68b.length; i4++) {
                    Fragment fragment3 = (Fragment) this.f150f.get(fragmentManagerState.f68b[i4]);
                    if (fragment3 == null) {
                        m107a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f68b[i4]));
                    }
                    fragment3.f38l = true;
                    if (f144a) {
                        Log.v("FragmentManager", "restoreAllState: added #" + i4 + ": " + fragment3);
                    }
                    if (this.f151g.contains(fragment3)) {
                        throw new IllegalStateException("Already added!");
                    }
                    this.f151g.add(fragment3);
                }
            } else {
                this.f151g = null;
            }
            if (fragmentManagerState.f69c == null) {
                this.f153i = null;
                return;
            }
            this.f153i = new ArrayList(fragmentManagerState.f69c.length);
            for (int i5 = 0; i5 < fragmentManagerState.f69c.length; i5++) {
                RunnableC0009b runnableC0009bM4a = fragmentManagerState.f69c[i5].m4a(this);
                if (f144a) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i5 + " (index " + runnableC0009bM4a.f118o + "): " + runnableC0009bM4a);
                    runnableC0009bM4a.m92a("  ", new PrintWriter(new C0038e("FragmentManager")), false);
                }
                this.f153i.add(runnableC0009bM4a);
                if (runnableC0009bM4a.f118o >= 0) {
                    m116a(runnableC0009bM4a.f118o, runnableC0009bM4a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m121a(Fragment fragment) {
        if (fragment.f22K) {
            if (this.f149e) {
                this.f166v = true;
            } else {
                fragment.f22K = false;
                m123a(fragment, this.f158n, 0, 0, false);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m122a(Fragment fragment, int i, int i2) {
        if (f144a) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f44r);
        }
        boolean z = !fragment.m21a();
        if (!fragment.f12A || z) {
            if (this.f151g != null) {
                this.f151g.remove(fragment);
            }
            if (fragment.f15D && fragment.f16E) {
                this.f162r = true;
            }
            fragment.f38l = false;
            fragment.f39m = true;
            m123a(fragment, z ? 0 : 1, i, i2, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:114:0x024d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0251  */
    /* JADX WARN: Code duplicated, block: B:121:0x0260  */
    /* JADX WARN: Code duplicated, block: B:129:0x028b  */
    /* JADX WARN: Code duplicated, block: B:131:0x028f  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:152:0x0304  */
    /* JADX WARN: Code duplicated, block: B:156:0x030c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0316  */
    /* JADX WARN: Code duplicated, block: B:163:0x0338  */
    /* JADX WARN: Code duplicated, block: B:165:0x033c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0358  */
    /* JADX WARN: Code duplicated, block: B:171:0x0364  */
    /* JADX WARN: Code duplicated, block: B:173:0x0383  */
    /* JADX WARN: Code duplicated, block: B:174:0x0385  */
    /* JADX WARN: Code duplicated, block: B:176:0x0389  */
    /* JADX WARN: Code duplicated, block: B:177:0x038e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0394  */
    /* JADX INFO: renamed from: a */
    void m123a(Fragment fragment, int i, int i2, int i3, boolean z) {
        Animation animationM114a;
        ViewGroup viewGroup;
        if ((!fragment.f38l || fragment.f12A) && i > 1) {
            i = 1;
        }
        if (fragment.f39m && i > fragment.f27a) {
            i = fragment.f27a;
        }
        if (fragment.f22K && fragment.f27a < 4 && i > 3) {
            i = 3;
        }
        if (fragment.f27a < i) {
            if (fragment.f41o && !fragment.f42p) {
                return;
            }
            if (fragment.f28b != null) {
                fragment.f28b = null;
                m123a(fragment, fragment.f29c, 0, 0, true);
            }
            switch (fragment.f27a) {
                case C0467e.MapAttrs_mapType /* 0 */:
                    if (f144a) {
                        Log.v("FragmentManager", "moveto CREATED: " + fragment);
                    }
                    if (fragment.f30d != null) {
                        fragment.f31e = fragment.f30d.getSparseParcelableArray("android:view_state");
                        fragment.f35i = m113a(fragment.f30d, "android:target_state");
                        if (fragment.f35i != null) {
                            fragment.f37k = fragment.f30d.getInt("android:target_req_state", 0);
                        }
                        fragment.f23L = fragment.f30d.getBoolean("android:user_visible_hint", true);
                        if (!fragment.f23L) {
                            fragment.f22K = true;
                            if (i > 3) {
                                i = 3;
                            }
                        }
                    }
                    fragment.f46t = this.f159o;
                    fragment.f48v = this.f161q;
                    fragment.f45s = this.f161q != null ? this.f161q.f47u : this.f159o.f55b;
                    fragment.f17F = false;
                    fragment.m12a(this.f159o);
                    if (!fragment.f17F) {
                        throw new C0008ac("Fragment " + fragment + " did not call through to super.onAttach()");
                    }
                    if (fragment.f48v == null) {
                        this.f159o.m64a(fragment);
                    }
                    if (!fragment.f14C) {
                        fragment.m42g(fragment.f30d);
                    }
                    fragment.f14C = false;
                    if (fragment.f41o) {
                        fragment.f20I = fragment.m25b(fragment.m24b(fragment.f30d), null, fragment.f30d);
                        if (fragment.f20I == null) {
                            fragment.f21J = null;
                        } else {
                            fragment.f21J = fragment.f20I;
                            fragment.f20I = C0007ab.m83a(fragment.f20I);
                            if (fragment.f52z) {
                                fragment.f20I.setVisibility(8);
                            }
                            fragment.m18a(fragment.f20I, fragment.f30d);
                        }
                    }
                    break;
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    if (i > 1) {
                        if (f144a) {
                            Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
                        }
                        if (!fragment.f41o) {
                            if (fragment.f50x != 0) {
                                viewGroup = (ViewGroup) this.f160p.mo98a(fragment.f50x);
                                if (viewGroup == null && !fragment.f43q) {
                                    m107a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.f50x) + " (" + fragment.m29c().getResourceName(fragment.f50x) + ") for fragment " + fragment));
                                }
                            } else {
                                viewGroup = null;
                            }
                            fragment.f19H = viewGroup;
                            fragment.f20I = fragment.m25b(fragment.m24b(fragment.f30d), viewGroup, fragment.f30d);
                            if (fragment.f20I != null) {
                                fragment.f21J = fragment.f20I;
                                fragment.f20I = C0007ab.m83a(fragment.f20I);
                                if (viewGroup != null) {
                                    Animation animationM114a2 = m114a(fragment, i2, true, i3);
                                    if (animationM114a2 != null) {
                                        fragment.f20I.startAnimation(animationM114a2);
                                    }
                                    viewGroup.addView(fragment.f20I);
                                }
                                if (fragment.f52z) {
                                    fragment.f20I.setVisibility(8);
                                }
                                fragment.m18a(fragment.f20I, fragment.f30d);
                            } else {
                                fragment.f21J = null;
                            }
                        }
                        fragment.m44h(fragment.f30d);
                        if (fragment.f20I != null) {
                            fragment.m15a(fragment.f30d);
                        }
                        fragment.f30d = null;
                        break;
                    }
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    if (i > 3) {
                        if (f144a) {
                            Log.v("FragmentManager", "moveto STARTED: " + fragment);
                        }
                        fragment.m52o();
                        break;
                    }
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    if (i > 4) {
                        if (f144a) {
                            Log.v("FragmentManager", "moveto RESUMED: " + fragment);
                        }
                        fragment.f40n = true;
                        fragment.m53p();
                        fragment.f30d = null;
                        fragment.f31e = null;
                        break;
                    }
                default:
                    fragment.f27a = i;
            }
        } else if (fragment.f27a > i) {
            switch (fragment.f27a) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    if (i < 1) {
                        if (this.f164t && fragment.f28b != null) {
                            View view = fragment.f28b;
                            fragment.f28b = null;
                            view.clearAnimation();
                        }
                        if (fragment.f28b == null) {
                            if (f144a) {
                                Log.v("FragmentManager", "movefrom CREATED: " + fragment);
                            }
                            if (!fragment.f14C) {
                                fragment.m59v();
                            }
                            fragment.f17F = false;
                            fragment.m49l();
                            if (!fragment.f17F) {
                                throw new C0008ac("Fragment " + fragment + " did not call through to super.onDetach()");
                            }
                            if (!z) {
                                if (!fragment.f14C) {
                                    m142d(fragment);
                                } else {
                                    fragment.f46t = null;
                                    fragment.f45s = null;
                                }
                            }
                        } else {
                            fragment.f29c = i;
                            i = 1;
                        }
                    }
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    if (i < 2) {
                        if (f144a) {
                            Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                        }
                        if (fragment.f20I != null && !this.f159o.isFinishing() && fragment.f31e == null) {
                            m144e(fragment);
                        }
                        fragment.m58u();
                        if (fragment.f20I != null && fragment.f19H != null) {
                            if (this.f158n > 0 || this.f164t) {
                                animationM114a = null;
                            } else {
                                animationM114a = m114a(fragment, i2, false, i3);
                            }
                            if (animationM114a != null) {
                                fragment.f28b = fragment.f20I;
                                fragment.f29c = i;
                                animationM114a.setAnimationListener(new AnimationAnimationListenerC0024q(this, fragment));
                                fragment.f20I.startAnimation(animationM114a);
                            }
                            fragment.f19H.removeView(fragment.f20I);
                        }
                        fragment.f19H = null;
                        fragment.f20I = null;
                        fragment.f21J = null;
                    }
                    if (i < 1) {
                        if (this.f164t) {
                            View view2 = fragment.f28b;
                            fragment.f28b = null;
                            view2.clearAnimation();
                        }
                        if (fragment.f28b == null) {
                            if (f144a) {
                                Log.v("FragmentManager", "movefrom CREATED: " + fragment);
                            }
                            if (!fragment.f14C) {
                                fragment.m59v();
                            }
                            fragment.f17F = false;
                            fragment.m49l();
                            if (!fragment.f17F) {
                                throw new C0008ac("Fragment " + fragment + " did not call through to super.onDetach()");
                            }
                            if (!z) {
                                if (!fragment.f14C) {
                                    fragment.f46t = null;
                                    fragment.f45s = null;
                                } else {
                                    m142d(fragment);
                                }
                            }
                        } else {
                            fragment.f29c = i;
                            i = 1;
                        }
                    }
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    if (i < 3) {
                        if (f144a) {
                            Log.v("FragmentManager", "movefrom STOPPED: " + fragment);
                        }
                        fragment.m57t();
                    }
                    if (i < 2) {
                        if (f144a) {
                            Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                        }
                        if (fragment.f20I != null) {
                            m144e(fragment);
                        }
                        fragment.m58u();
                        if (fragment.f20I != null) {
                            if (this.f158n > 0) {
                                animationM114a = null;
                            } else {
                                animationM114a = null;
                            }
                            if (animationM114a != null) {
                                fragment.f28b = fragment.f20I;
                                fragment.f29c = i;
                                animationM114a.setAnimationListener(new AnimationAnimationListenerC0024q(this, fragment));
                                fragment.f20I.startAnimation(animationM114a);
                            }
                            fragment.f19H.removeView(fragment.f20I);
                        }
                        fragment.f19H = null;
                        fragment.f20I = null;
                        fragment.f21J = null;
                    }
                    if (i < 1) {
                        if (this.f164t) {
                            View view3 = fragment.f28b;
                            fragment.f28b = null;
                            view3.clearAnimation();
                        }
                        if (fragment.f28b == null) {
                            if (f144a) {
                                Log.v("FragmentManager", "movefrom CREATED: " + fragment);
                            }
                            if (!fragment.f14C) {
                                fragment.m59v();
                            }
                            fragment.f17F = false;
                            fragment.m49l();
                            if (!fragment.f17F) {
                                throw new C0008ac("Fragment " + fragment + " did not call through to super.onDetach()");
                            }
                            if (!z) {
                                if (!fragment.f14C) {
                                    fragment.f46t = null;
                                    fragment.f45s = null;
                                } else {
                                    m142d(fragment);
                                }
                            }
                        } else {
                            fragment.f29c = i;
                            i = 1;
                        }
                    }
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    if (i < 4) {
                        if (f144a) {
                            Log.v("FragmentManager", "movefrom STARTED: " + fragment);
                        }
                        fragment.m56s();
                    }
                    if (i < 3) {
                        if (f144a) {
                            Log.v("FragmentManager", "movefrom STOPPED: " + fragment);
                        }
                        fragment.m57t();
                    }
                    if (i < 2) {
                        if (f144a) {
                            Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                        }
                        if (fragment.f20I != null) {
                            m144e(fragment);
                        }
                        fragment.m58u();
                        if (fragment.f20I != null) {
                            if (this.f158n > 0) {
                                animationM114a = null;
                            } else {
                                animationM114a = null;
                            }
                            if (animationM114a != null) {
                                fragment.f28b = fragment.f20I;
                                fragment.f29c = i;
                                animationM114a.setAnimationListener(new AnimationAnimationListenerC0024q(this, fragment));
                                fragment.f20I.startAnimation(animationM114a);
                            }
                            fragment.f19H.removeView(fragment.f20I);
                        }
                        fragment.f19H = null;
                        fragment.f20I = null;
                        fragment.f21J = null;
                    }
                    if (i < 1) {
                        if (this.f164t) {
                            View view4 = fragment.f28b;
                            fragment.f28b = null;
                            view4.clearAnimation();
                        }
                        if (fragment.f28b == null) {
                            if (f144a) {
                                Log.v("FragmentManager", "movefrom CREATED: " + fragment);
                            }
                            if (!fragment.f14C) {
                                fragment.m59v();
                            }
                            fragment.f17F = false;
                            fragment.m49l();
                            if (!fragment.f17F) {
                                throw new C0008ac("Fragment " + fragment + " did not call through to super.onDetach()");
                            }
                            if (!z) {
                                if (!fragment.f14C) {
                                    fragment.f46t = null;
                                    fragment.f45s = null;
                                } else {
                                    m142d(fragment);
                                }
                            }
                        } else {
                            fragment.f29c = i;
                            i = 1;
                        }
                    }
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    if (i < 5) {
                        if (f144a) {
                            Log.v("FragmentManager", "movefrom RESUMED: " + fragment);
                        }
                        fragment.m55r();
                        fragment.f40n = false;
                    }
                    if (i < 4) {
                        if (f144a) {
                            Log.v("FragmentManager", "movefrom STARTED: " + fragment);
                        }
                        fragment.m56s();
                    }
                    if (i < 3) {
                        if (f144a) {
                            Log.v("FragmentManager", "movefrom STOPPED: " + fragment);
                        }
                        fragment.m57t();
                    }
                    if (i < 2) {
                        if (f144a) {
                            Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                        }
                        if (fragment.f20I != null) {
                            m144e(fragment);
                        }
                        fragment.m58u();
                        if (fragment.f20I != null) {
                            if (this.f158n > 0) {
                                animationM114a = null;
                            } else {
                                animationM114a = null;
                            }
                            if (animationM114a != null) {
                                fragment.f28b = fragment.f20I;
                                fragment.f29c = i;
                                animationM114a.setAnimationListener(new AnimationAnimationListenerC0024q(this, fragment));
                                fragment.f20I.startAnimation(animationM114a);
                            }
                            fragment.f19H.removeView(fragment.f20I);
                        }
                        fragment.f19H = null;
                        fragment.f20I = null;
                        fragment.f21J = null;
                    }
                    if (i < 1) {
                        if (this.f164t) {
                            View view5 = fragment.f28b;
                            fragment.f28b = null;
                            view5.clearAnimation();
                        }
                        if (fragment.f28b == null) {
                            if (f144a) {
                                Log.v("FragmentManager", "movefrom CREATED: " + fragment);
                            }
                            if (!fragment.f14C) {
                                fragment.m59v();
                            }
                            fragment.f17F = false;
                            fragment.m49l();
                            if (!fragment.f17F) {
                                throw new C0008ac("Fragment " + fragment + " did not call through to super.onDetach()");
                            }
                            if (!z) {
                                if (!fragment.f14C) {
                                    fragment.f46t = null;
                                    fragment.f45s = null;
                                } else {
                                    m142d(fragment);
                                }
                            }
                        } else {
                            fragment.f29c = i;
                            i = 1;
                        }
                    }
                    break;
            }
        }
        fragment.f27a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m124a(Fragment fragment, boolean z) {
        if (this.f151g == null) {
            this.f151g = new ArrayList();
        }
        if (f144a) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        m138c(fragment);
        if (fragment.f12A) {
            return;
        }
        if (this.f151g.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        this.f151g.add(fragment);
        fragment.f38l = true;
        fragment.f39m = false;
        if (fragment.f15D && fragment.f16E) {
            this.f162r = true;
        }
        if (z) {
            m133b(fragment);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m125a(FragmentActivity fragmentActivity, InterfaceC0019l interfaceC0019l, Fragment fragment) {
        if (this.f159o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f159o = fragmentActivity;
        this.f160p = interfaceC0019l;
        this.f161q = fragment;
    }

    /* JADX INFO: renamed from: a */
    public void m126a(Runnable runnable, boolean z) {
        if (!z) {
            m110t();
        }
        synchronized (this) {
            if (this.f164t || this.f159o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.f147c == null) {
                this.f147c = new ArrayList();
            }
            this.f147c.add(runnable);
            if (this.f147c.size() == 1) {
                this.f159o.f54a.removeCallbacks(this.f169y);
                this.f159o.f54a.post(this.f169y);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m127a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int size6;
        String str2 = str + "    ";
        if (this.f150f != null && (size6 = this.f150f.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size6; i++) {
                Fragment fragment = (Fragment) this.f150f.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.m19a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        if (this.f151g != null && (size5 = this.f151g.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                Fragment fragment2 = (Fragment) this.f151g.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        if (this.f154j != null && (size4 = this.f154j.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                Fragment fragment3 = (Fragment) this.f154j.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        if (this.f153i != null && (size3 = this.f153i.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                RunnableC0009b runnableC0009b = (RunnableC0009b) this.f153i.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(runnableC0009b.toString());
                runnableC0009b.m91a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.f155k != null && (size2 = this.f155k.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = (RunnableC0009b) this.f155k.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.f156l != null && this.f156l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f156l.toArray()));
            }
        }
        if (this.f147c != null && (size = this.f147c.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                Object obj2 = (Runnable) this.f147c.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mActivity=");
        printWriter.println(this.f159o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f160p);
        if (this.f161q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f161q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f158n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f163s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f164t);
        if (this.f162r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f162r);
        }
        if (this.f165u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f165u);
        }
        if (this.f152h == null || this.f152h.size() <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.print("  mAvailIndices: ");
        printWriter.println(Arrays.toString(this.f152h.toArray()));
    }

    /* JADX INFO: renamed from: a */
    boolean m128a(Handler handler, String str, int i, int i2) {
        if (this.f153i == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.f153i.size() - 1;
            if (size < 0) {
                return false;
            }
            ((RunnableC0009b) this.f153i.remove(size)).m95b(true);
            m148f();
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = this.f153i.size() - 1;
                while (size2 >= 0) {
                    RunnableC0009b runnableC0009b = (RunnableC0009b) this.f153i.get(size2);
                    if ((str != null && str.equals(runnableC0009b.m94b())) || (i >= 0 && i == runnableC0009b.f118o)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size2--;
                    while (size2 >= 0) {
                        RunnableC0009b runnableC0009b2 = (RunnableC0009b) this.f153i.get(size2);
                        if ((str == null || !str.equals(runnableC0009b2.m94b())) && (i < 0 || i != runnableC0009b2.f118o)) {
                            break;
                        }
                        size2--;
                    }
                }
                i3 = size2;
            }
            if (i3 == this.f153i.size() - 1) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int size3 = this.f153i.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f153i.remove(size3));
            }
            int size4 = arrayList.size() - 1;
            int i4 = 0;
            while (i4 <= size4) {
                if (f144a) {
                    Log.v("FragmentManager", "Popping back stack state: " + arrayList.get(i4));
                }
                ((RunnableC0009b) arrayList.get(i4)).m95b(i4 == size4);
                i4++;
            }
            m148f();
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m129a(Menu menu) {
        if (this.f151g == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f151g.size(); i++) {
            Fragment fragment = (Fragment) this.f151g.get(i);
            if (fragment != null && fragment.m31c(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m130a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        ArrayList arrayList = null;
        if (this.f151g != null) {
            int i = 0;
            z = false;
            while (i < this.f151g.size()) {
                Fragment fragment = (Fragment) this.f151g.get(i);
                if (fragment != null && fragment.m27b(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                }
                i++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.f154j != null) {
            for (int i2 = 0; i2 < this.f154j.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f154j.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.m50m();
                }
            }
        }
        this.f154j = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m131a(MenuItem menuItem) {
        if (this.f151g == null) {
            return false;
        }
        for (int i = 0; i < this.f151g.size(); i++) {
            Fragment fragment = (Fragment) this.f151g.get(i);
            if (fragment != null && fragment.m32c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m132b(int i) {
        synchronized (this) {
            this.f155k.set(i, null);
            if (this.f156l == null) {
                this.f156l = new ArrayList();
            }
            if (f144a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f156l.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: b */
    void m133b(Fragment fragment) {
        m123a(fragment, this.f158n, 0, 0, false);
    }

    /* JADX INFO: renamed from: b */
    public void m134b(Fragment fragment, int i, int i2) {
        if (f144a) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f52z) {
            return;
        }
        fragment.f52z = true;
        if (fragment.f20I != null) {
            Animation animationM114a = m114a(fragment, i, false, i2);
            if (animationM114a != null) {
                fragment.f20I.startAnimation(animationM114a);
            }
            fragment.f20I.setVisibility(8);
        }
        if (fragment.f38l && fragment.f15D && fragment.f16E) {
            this.f162r = true;
        }
        fragment.m20a(true);
    }

    /* JADX INFO: renamed from: b */
    void m135b(RunnableC0009b runnableC0009b) {
        if (this.f153i == null) {
            this.f153i = new ArrayList();
        }
        this.f153i.add(runnableC0009b);
        m148f();
    }

    /* JADX INFO: renamed from: b */
    public void m136b(Menu menu) {
        if (this.f151g == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f151g.size()) {
                return;
            }
            Fragment fragment = (Fragment) this.f151g.get(i2);
            if (fragment != null) {
                fragment.m34d(menu);
            }
            i = i2 + 1;
        }
    }

    @Override // android.support.v4.app.AbstractC0020m
    /* JADX INFO: renamed from: b */
    public boolean mo103b() {
        return m146e();
    }

    /* JADX INFO: renamed from: b */
    public boolean m137b(MenuItem menuItem) {
        if (this.f151g == null) {
            return false;
        }
        for (int i = 0; i < this.f151g.size(); i++) {
            Fragment fragment = (Fragment) this.f151g.get(i);
            if (fragment != null && fragment.m36d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    void m138c(Fragment fragment) {
        if (fragment.f32f >= 0) {
            return;
        }
        if (this.f152h == null || this.f152h.size() <= 0) {
            if (this.f150f == null) {
                this.f150f = new ArrayList();
            }
            fragment.m11a(this.f150f.size(), this.f161q);
            this.f150f.add(fragment);
        } else {
            fragment.m11a(((Integer) this.f152h.remove(this.f152h.size() - 1)).intValue(), this.f161q);
            this.f150f.set(fragment.f32f, fragment);
        }
        if (f144a) {
            Log.v("FragmentManager", "Allocated fragment index " + fragment);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m139c(Fragment fragment, int i, int i2) {
        if (f144a) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f52z) {
            fragment.f52z = false;
            if (fragment.f20I != null) {
                Animation animationM114a = m114a(fragment, i, true, i2);
                if (animationM114a != null) {
                    fragment.f20I.startAnimation(animationM114a);
                }
                fragment.f20I.setVisibility(0);
            }
            if (fragment.f38l && fragment.f15D && fragment.f16E) {
                this.f162r = true;
            }
            fragment.m20a(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m140c() {
        m110t();
        mo103b();
        return m128a(this.f159o.f54a, (String) null, -1, 0);
    }

    /* JADX INFO: renamed from: d */
    void m141d() {
        if (this.f150f == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f150f.size()) {
                return;
            }
            Fragment fragment = (Fragment) this.f150f.get(i2);
            if (fragment != null) {
                m121a(fragment);
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: d */
    void m142d(Fragment fragment) {
        if (fragment.f32f < 0) {
            return;
        }
        if (f144a) {
            Log.v("FragmentManager", "Freeing fragment index " + fragment);
        }
        this.f150f.set(fragment.f32f, null);
        if (this.f152h == null) {
            this.f152h = new ArrayList();
        }
        this.f152h.add(Integer.valueOf(fragment.f32f));
        this.f159o.m65a(fragment.f33g);
        fragment.m48k();
    }

    /* JADX INFO: renamed from: d */
    public void m143d(Fragment fragment, int i, int i2) {
        if (f144a) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f12A) {
            return;
        }
        fragment.f12A = true;
        if (fragment.f38l) {
            if (this.f151g != null) {
                if (f144a) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f151g.remove(fragment);
            }
            if (fragment.f15D && fragment.f16E) {
                this.f162r = true;
            }
            fragment.f38l = false;
            m123a(fragment, 1, i, i2, false);
        }
    }

    /* JADX INFO: renamed from: e */
    void m144e(Fragment fragment) {
        if (fragment.f21J == null) {
            return;
        }
        if (this.f168x == null) {
            this.f168x = new SparseArray();
        } else {
            this.f168x.clear();
        }
        fragment.f21J.saveHierarchyState(this.f168x);
        if (this.f168x.size() > 0) {
            fragment.f31e = this.f168x;
            this.f168x = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m145e(Fragment fragment, int i, int i2) {
        if (f144a) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f12A) {
            fragment.f12A = false;
            if (fragment.f38l) {
                return;
            }
            if (this.f151g == null) {
                this.f151g = new ArrayList();
            }
            if (this.f151g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (f144a) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            this.f151g.add(fragment);
            fragment.f38l = true;
            if (fragment.f15D && fragment.f16E) {
                this.f162r = true;
            }
            m123a(fragment, this.f158n, i, i2, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        r6.f149e = true;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r1 >= r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6.f148d[r1].run();
        r6.f148d[r1] = null;
        r1 = r1 + 1;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m146e() {
        /*
            r6 = this;
            r0 = 1
            r2 = 0
            boolean r1 = r6.f149e
            if (r1 == 0) goto Le
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Recursive entry to executePendingTransactions"
            r0.<init>(r1)
            throw r0
        Le:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.support.v4.app.FragmentActivity r3 = r6.f159o
            android.os.Handler r3 = r3.f54a
            android.os.Looper r3 = r3.getLooper()
            if (r1 == r3) goto L24
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be called from main thread of process"
            r0.<init>(r1)
            throw r0
        L24:
            r1 = r2
        L25:
            monitor-enter(r6)
            java.util.ArrayList r3 = r6.f147c     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto L32
            java.util.ArrayList r3 = r6.f147c     // Catch: java.lang.Throwable -> L97
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L97
            if (r3 != 0) goto L5a
        L32:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L97
            boolean r0 = r6.f166v
            if (r0 == 0) goto La5
            r3 = r2
            r4 = r2
        L39:
            java.util.ArrayList r0 = r6.f150f
            int r0 = r0.size()
            if (r3 >= r0) goto L9e
            java.util.ArrayList r0 = r6.f150f
            java.lang.Object r0 = r0.get(r3)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            if (r0 == 0) goto L56
            android.support.v4.app.z r5 = r0.f24M
            if (r5 == 0) goto L56
            android.support.v4.app.z r0 = r0.f24M
            boolean r0 = r0.mo173a()
            r4 = r4 | r0
        L56:
            int r0 = r3 + 1
            r3 = r0
            goto L39
        L5a:
            java.util.ArrayList r1 = r6.f147c     // Catch: java.lang.Throwable -> L97
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L97
            java.lang.Runnable[] r1 = r6.f148d     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L69
            java.lang.Runnable[] r1 = r6.f148d     // Catch: java.lang.Throwable -> L97
            int r1 = r1.length     // Catch: java.lang.Throwable -> L97
            if (r1 >= r3) goto L6d
        L69:
            java.lang.Runnable[] r1 = new java.lang.Runnable[r3]     // Catch: java.lang.Throwable -> L97
            r6.f148d = r1     // Catch: java.lang.Throwable -> L97
        L6d:
            java.util.ArrayList r1 = r6.f147c     // Catch: java.lang.Throwable -> L97
            java.lang.Runnable[] r4 = r6.f148d     // Catch: java.lang.Throwable -> L97
            r1.toArray(r4)     // Catch: java.lang.Throwable -> L97
            java.util.ArrayList r1 = r6.f147c     // Catch: java.lang.Throwable -> L97
            r1.clear()     // Catch: java.lang.Throwable -> L97
            android.support.v4.app.FragmentActivity r1 = r6.f159o     // Catch: java.lang.Throwable -> L97
            android.os.Handler r1 = r1.f54a     // Catch: java.lang.Throwable -> L97
            java.lang.Runnable r4 = r6.f169y     // Catch: java.lang.Throwable -> L97
            r1.removeCallbacks(r4)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L97
            r6.f149e = r0
            r1 = r2
        L86:
            if (r1 >= r3) goto L9a
            java.lang.Runnable[] r4 = r6.f148d
            r4 = r4[r1]
            r4.run()
            java.lang.Runnable[] r4 = r6.f148d
            r5 = 0
            r4[r1] = r5
            int r1 = r1 + 1
            goto L86
        L97:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L97
            throw r0
        L9a:
            r6.f149e = r2
            r1 = r0
            goto L25
        L9e:
            if (r4 != 0) goto La5
            r6.f166v = r2
            r6.m141d()
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.C0022o.m146e():boolean");
    }

    /* JADX INFO: renamed from: f */
    Bundle m147f(Fragment fragment) {
        Bundle bundle;
        if (this.f167w == null) {
            this.f167w = new Bundle();
        }
        fragment.m46i(this.f167w);
        if (this.f167w.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f167w;
            this.f167w = null;
        }
        if (fragment.f20I != null) {
            m144e(fragment);
        }
        if (fragment.f31e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f31e);
        }
        if (!fragment.f23L) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.f23L);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: f */
    void m148f() {
        if (this.f157m == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f157m.size()) {
                return;
            }
            ((InterfaceC0021n) this.f157m.get(i2)).m104a();
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: g */
    ArrayList m149g() {
        ArrayList arrayList = null;
        if (this.f150f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f150f.size()) {
                    break;
                }
                Fragment fragment = (Fragment) this.f150f.get(i2);
                if (fragment != null && fragment.f13B) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                    fragment.f14C = true;
                    fragment.f36j = fragment.f35i != null ? fragment.f35i.f32f : -1;
                    if (f144a) {
                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + fragment);
                    }
                }
                i = i2 + 1;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    Parcelable m150h() {
        int[] iArr;
        int size;
        int size2;
        boolean z;
        BackStackState[] backStackStateArr = null;
        m146e();
        if (f145b) {
            this.f163s = true;
        }
        if (this.f150f == null || this.f150f.size() <= 0) {
            return null;
        }
        int size3 = this.f150f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size3];
        int i = 0;
        boolean z2 = false;
        while (i < size3) {
            Fragment fragment = (Fragment) this.f150f.get(i);
            if (fragment != null) {
                if (fragment.f32f < 0) {
                    m107a(new IllegalStateException("Failure saving state: active " + fragment + " has cleared index: " + fragment.f32f));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.f27a <= 0 || fragmentState.f79j != null) {
                    fragmentState.f79j = fragment.f30d;
                } else {
                    fragmentState.f79j = m147f(fragment);
                    if (fragment.f35i != null) {
                        if (fragment.f35i.f32f < 0) {
                            m107a(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f35i));
                        }
                        if (fragmentState.f79j == null) {
                            fragmentState.f79j = new Bundle();
                        }
                        m119a(fragmentState.f79j, "android:target_state", fragment.f35i);
                        if (fragment.f37k != 0) {
                            fragmentState.f79j.putInt("android:target_req_state", fragment.f37k);
                        }
                    }
                }
                if (f144a) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragmentState.f79j);
                }
                z = true;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (!z2) {
            if (!f144a) {
                return null;
            }
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
        if (this.f151g == null || (size2 = this.f151g.size()) <= 0) {
            iArr = null;
        } else {
            iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = ((Fragment) this.f151g.get(i2)).f32f;
                if (iArr[i2] < 0) {
                    m107a(new IllegalStateException("Failure saving state: active " + this.f151g.get(i2) + " has cleared index: " + iArr[i2]));
                }
                if (f144a) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.f151g.get(i2));
                }
            }
        }
        if (this.f153i != null && (size = this.f153i.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i3 = 0; i3 < size; i3++) {
                backStackStateArr[i3] = new BackStackState(this, (RunnableC0009b) this.f153i.get(i3));
                if (f144a) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f153i.get(i3));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f67a = fragmentStateArr;
        fragmentManagerState.f68b = iArr;
        fragmentManagerState.f69c = backStackStateArr;
        return fragmentManagerState;
    }

    /* JADX INFO: renamed from: i */
    public void m151i() {
        this.f163s = false;
    }

    /* JADX INFO: renamed from: j */
    public void m152j() {
        this.f163s = false;
        m117a(1, false);
    }

    /* JADX INFO: renamed from: k */
    public void m153k() {
        this.f163s = false;
        m117a(2, false);
    }

    /* JADX INFO: renamed from: l */
    public void m154l() {
        this.f163s = false;
        m117a(4, false);
    }

    /* JADX INFO: renamed from: m */
    public void m155m() {
        this.f163s = false;
        m117a(5, false);
    }

    /* JADX INFO: renamed from: n */
    public void m156n() {
        m117a(4, false);
    }

    /* JADX INFO: renamed from: o */
    public void m157o() {
        this.f163s = true;
        m117a(3, false);
    }

    /* JADX INFO: renamed from: p */
    public void m158p() {
        m117a(2, false);
    }

    /* JADX INFO: renamed from: q */
    public void m159q() {
        m117a(1, false);
    }

    /* JADX INFO: renamed from: r */
    public void m160r() {
        this.f164t = true;
        m146e();
        m117a(0, false);
        this.f159o = null;
        this.f160p = null;
        this.f161q = null;
    }

    /* JADX INFO: renamed from: s */
    public void m161s() {
        if (this.f151g == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f151g.size()) {
                return;
            }
            Fragment fragment = (Fragment) this.f151g.get(i2);
            if (fragment != null) {
                fragment.m54q();
            }
            i = i2 + 1;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.f161q != null) {
            C0037d.m200a(this.f161q, sb);
        } else {
            C0037d.m200a(this.f159o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }
}
