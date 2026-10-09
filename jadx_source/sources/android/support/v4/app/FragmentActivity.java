package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.p001b.C0045l;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.C0467e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends Activity {

    /* JADX INFO: renamed from: a */
    final Handler f54a = new HandlerC0015h(this);

    /* JADX INFO: renamed from: b */
    final C0022o f55b = new C0022o();

    /* JADX INFO: renamed from: c */
    final InterfaceC0019l f56c = new C0016i(this);

    /* JADX INFO: renamed from: d */
    boolean f57d;

    /* JADX INFO: renamed from: e */
    boolean f58e;

    /* JADX INFO: renamed from: f */
    boolean f59f;

    /* JADX INFO: renamed from: g */
    boolean f60g;

    /* JADX INFO: renamed from: h */
    boolean f61h;

    /* JADX INFO: renamed from: i */
    boolean f62i;

    /* JADX INFO: renamed from: j */
    boolean f63j;

    /* JADX INFO: renamed from: k */
    boolean f64k;

    /* JADX INFO: renamed from: l */
    C0045l f65l;

    /* JADX INFO: renamed from: m */
    C0033z f66m;

    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00ed. Please report as an issue. */
    /* JADX INFO: renamed from: a */
    private static String m60a(View view) {
        String resourcePackageName;
        StringBuilder sb = new StringBuilder(128);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(view)));
        sb.append(' ');
        switch (view.getVisibility()) {
            case C0467e.MapAttrs_mapType /* 0 */:
                sb.append('V');
                break;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                sb.append('I');
                break;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                sb.append('G');
                break;
            default:
                sb.append('.');
                break;
        }
        sb.append(view.isFocusable() ? 'F' : '.');
        sb.append(view.isEnabled() ? 'E' : '.');
        sb.append(view.willNotDraw() ? '.' : 'D');
        sb.append(view.isHorizontalScrollBarEnabled() ? 'H' : '.');
        sb.append(view.isVerticalScrollBarEnabled() ? 'V' : '.');
        sb.append(view.isClickable() ? 'C' : '.');
        sb.append(view.isLongClickable() ? 'L' : '.');
        sb.append(' ');
        sb.append(view.isFocused() ? 'F' : '.');
        sb.append(view.isSelected() ? 'S' : '.');
        sb.append(view.isPressed() ? 'P' : '.');
        sb.append(' ');
        sb.append(view.getLeft());
        sb.append(',');
        sb.append(view.getTop());
        sb.append('-');
        sb.append(view.getRight());
        sb.append(',');
        sb.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            sb.append(" #");
            sb.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (id != 0 && resources != null) {
                switch ((-16777216) & id) {
                    case 16777216:
                        resourcePackageName = "android";
                        String resourceTypeName = resources.getResourceTypeName(id);
                        String resourceEntryName = resources.getResourceEntryName(id);
                        sb.append(" ");
                        sb.append(resourcePackageName);
                        sb.append(":");
                        sb.append(resourceTypeName);
                        sb.append("/");
                        sb.append(resourceEntryName);
                        break;
                    case 2130706432:
                        resourcePackageName = "app";
                        String resourceTypeName2 = resources.getResourceTypeName(id);
                        String resourceEntryName2 = resources.getResourceEntryName(id);
                        sb.append(" ");
                        sb.append(resourcePackageName);
                        sb.append(":");
                        sb.append(resourceTypeName2);
                        sb.append("/");
                        sb.append(resourceEntryName2);
                        break;
                    default:
                        try {
                            resourcePackageName = resources.getResourcePackageName(id);
                            String resourceTypeName3 = resources.getResourceTypeName(id);
                            String resourceEntryName3 = resources.getResourceEntryName(id);
                            sb.append(" ");
                            sb.append(resourcePackageName);
                            sb.append(":");
                            sb.append(resourceTypeName3);
                            sb.append("/");
                            sb.append(resourceEntryName3);
                        } catch (Resources.NotFoundException e) {
                        }
                        break;
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private void m61a(String str, PrintWriter printWriter, View view) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(m60a(view));
        if (!(view instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) view).getChildCount()) <= 0) {
            return;
        }
        String str2 = str + "  ";
        for (int i = 0; i < childCount; i++) {
            m61a(str2, printWriter, viewGroup.getChildAt(i));
        }
    }

    /* JADX INFO: renamed from: a */
    C0033z m62a(String str, boolean z, boolean z2) {
        if (this.f65l == null) {
            this.f65l = new C0045l();
        }
        C0033z c0033z = (C0033z) this.f65l.get(str);
        if (c0033z != null) {
            c0033z.m177a(this);
            return c0033z;
        }
        if (!z2) {
            return c0033z;
        }
        C0033z c0033z2 = new C0033z(str, this, z);
        this.f65l.put(str, c0033z2);
        return c0033z2;
    }

    /* JADX INFO: renamed from: a */
    protected void m63a() {
        this.f55b.m155m();
    }

    /* JADX INFO: renamed from: a */
    public void m64a(Fragment fragment) {
    }

    /* JADX INFO: renamed from: a */
    void m65a(String str) {
        C0033z c0033z;
        if (this.f65l == null || (c0033z = (C0033z) this.f65l.get(str)) == null || c0033z.f183g) {
            return;
        }
        c0033z.m185h();
        this.f65l.remove(str);
    }

    /* JADX INFO: renamed from: a */
    void m66a(boolean z) {
        if (this.f60g) {
            return;
        }
        this.f60g = true;
        this.f61h = z;
        this.f54a.removeMessages(1);
        m70d();
    }

    /* JADX INFO: renamed from: a */
    protected boolean m67a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* JADX INFO: renamed from: b */
    public Object m68b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m69c() {
        if (Build.VERSION.SDK_INT >= 11) {
            C0005a.m74a(this);
        } else {
            this.f62i = true;
        }
    }

    /* JADX INFO: renamed from: d */
    void m70d() {
        if (this.f64k) {
            this.f64k = false;
            if (this.f66m != null) {
                if (this.f61h) {
                    this.f66m.m181d();
                } else {
                    this.f66m.m180c();
                }
            }
        }
        this.f55b.m158p();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 11) {
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f57d);
        printWriter.print("mResumed=");
        printWriter.print(this.f58e);
        printWriter.print(" mStopped=");
        printWriter.print(this.f59f);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f60g);
        printWriter.print(str2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.f64k);
        if (this.f66m != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.f66m)));
            printWriter.println(":");
            this.f66m.m178a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        this.f55b.m127a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        m61a(str + "  ", printWriter, getWindow().getDecorView());
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f55b.m151i();
        int i3 = i >> 16;
        if (i3 == 0) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        int i4 = i3 - 1;
        if (this.f55b.f150f == null || i4 < 0 || i4 >= this.f55b.f150f.size()) {
            Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(i));
            return;
        }
        Fragment fragment = (Fragment) this.f55b.f150f.get(i4);
        if (fragment == null) {
            Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(i));
        } else {
            fragment.m10a(65535 & i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f55b.m140c()) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f55b.m118a(configuration);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f55b.m125a(this, this.f56c, (Fragment) null);
        if (getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        C0018k c0018k = (C0018k) getLastNonConfigurationInstance();
        if (c0018k != null) {
            this.f65l = c0018k.f140e;
        }
        if (bundle != null) {
            this.f55b.m120a(bundle.getParcelable("android:support:fragments"), c0018k != null ? c0018k.f139d : null);
        }
        this.f55b.m152j();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean zOnCreatePanelMenu = super.onCreatePanelMenu(i, menu) | this.f55b.m130a(menu, getMenuInflater());
        if (Build.VERSION.SDK_INT >= 11) {
            return zOnCreatePanelMenu;
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        byte b = 0;
        if (!"fragment".equals(str)) {
            return super.onCreateView(str, context, attributeSet);
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0017j.f135a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (!Fragment.m7b(this, attributeValue)) {
            return super.onCreateView(str, context, attributeSet);
        }
        int id = 0 != 0 ? (b == true ? 1 : 0).getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentM112a = resourceId != -1 ? this.f55b.m112a(resourceId) : null;
        if (fragmentM112a == null && string != null) {
            fragmentM112a = this.f55b.mo101a(string);
        }
        if (fragmentM112a == null && id != -1) {
            fragmentM112a = this.f55b.m112a(id);
        }
        if (C0022o.f144a) {
            Log.v("FragmentActivity", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragmentM112a);
        }
        if (fragmentM112a == null) {
            Fragment fragmentM5a = Fragment.m5a(this, attributeValue);
            fragmentM5a.f41o = true;
            fragmentM5a.f49w = resourceId != 0 ? resourceId : id;
            fragmentM5a.f50x = id;
            fragmentM5a.f51y = string;
            fragmentM5a.f42p = true;
            fragmentM5a.f45s = this.f55b;
            fragmentM5a.m13a(this, attributeSet, fragmentM5a.f30d);
            this.f55b.m124a(fragmentM5a, true);
            fragmentM112a = fragmentM5a;
        } else {
            if (fragmentM112a.f42p) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentM112a.f42p = true;
            if (!fragmentM112a.f14C) {
                fragmentM112a.m13a(this, attributeSet, fragmentM112a.f30d);
            }
            this.f55b.m133b(fragmentM112a);
        }
        if (fragmentM112a.f20I == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            fragmentM112a.f20I.setId(resourceId);
        }
        if (fragmentM112a.f20I.getTag() == null) {
            fragmentM112a.f20I.setTag(string);
        }
        return fragmentM112a.f20I;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m66a(false);
        this.f55b.m160r();
        if (this.f66m != null) {
            this.f66m.m185h();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 5 || i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f55b.m161s();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case C0467e.MapAttrs_mapType /* 0 */:
                return this.f55b.m131a(menuItem);
            case C0467e.MapAttrs_uiCompass /* 6 */:
                return this.f55b.m137b(menuItem);
            default:
                return false;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f55b.m151i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case C0467e.MapAttrs_mapType /* 0 */:
                this.f55b.m136b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f58e = false;
        if (this.f54a.hasMessages(2)) {
            this.f54a.removeMessages(2);
            m63a();
        }
        this.f55b.m156n();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.f54a.removeMessages(2);
        m63a();
        this.f55b.m146e();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.f62i) {
            this.f62i = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return m67a(view, menu) | this.f55b.m129a(menu);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f54a.sendEmptyMessage(2);
        this.f58e = true;
        this.f55b.m146e();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        boolean z;
        if (this.f59f) {
            m66a(true);
        }
        Object objM68b = m68b();
        ArrayList arrayListM149g = this.f55b.m149g();
        if (this.f65l != null) {
            int size = this.f65l.size();
            C0033z[] c0033zArr = new C0033z[size];
            for (int i = size - 1; i >= 0; i--) {
                c0033zArr[i] = (C0033z) this.f65l.m221c(i);
            }
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C0033z c0033z = c0033zArr[i2];
                if (c0033z.f183g) {
                    z = true;
                } else {
                    c0033z.m185h();
                    this.f65l.remove(c0033z.f180d);
                }
            }
        } else {
            z = false;
        }
        if (arrayListM149g == null && !z && objM68b == null) {
            return null;
        }
        C0018k c0018k = new C0018k();
        c0018k.f136a = null;
        c0018k.f137b = objM68b;
        c0018k.f138c = null;
        c0018k.f139d = arrayListM149g;
        c0018k.f140e = this.f65l;
        return c0018k;
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable parcelableM150h = this.f55b.m150h();
        if (parcelableM150h != null) {
            bundle.putParcelable("android:support:fragments", parcelableM150h);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f59f = false;
        this.f60g = false;
        this.f54a.removeMessages(1);
        if (!this.f57d) {
            this.f57d = true;
            this.f55b.m153k();
        }
        this.f55b.m151i();
        this.f55b.m146e();
        if (!this.f64k) {
            this.f64k = true;
            if (this.f66m != null) {
                this.f66m.m179b();
            } else if (!this.f63j) {
                this.f66m = m62a("(root)", this.f64k, false);
                if (this.f66m != null && !this.f66m.f182f) {
                    this.f66m.m179b();
                }
            }
            this.f63j = true;
        }
        this.f55b.m154l();
        if (this.f65l != null) {
            int size = this.f65l.size();
            C0033z[] c0033zArr = new C0033z[size];
            for (int i = size - 1; i >= 0; i--) {
                c0033zArr[i] = (C0033z) this.f65l.m221c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                C0033z c0033z = c0033zArr[i2];
                c0033z.m182e();
                c0033z.m184g();
            }
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f59f = true;
        this.f54a.sendEmptyMessage(1);
        this.f55b.m157o();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (i != -1 && ((-65536) & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, i);
    }
}
