package android.support.v4.view.p002a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: android.support.v4.view.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0052a {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC0058c f336a;

    /* JADX INFO: renamed from: b */
    private final Object f337b;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f336a = new C0061f();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            f336a = new C0060e();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            f336a = new C0059d();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f336a = new C0057b();
        } else {
            f336a = new C0062g();
        }
    }

    public C0052a(Object obj) {
        this.f337b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static C0052a m302a(C0052a c0052a) {
        return m303a(f336a.mo357a(c0052a.f337b));
    }

    /* JADX INFO: renamed from: a */
    static C0052a m303a(Object obj) {
        if (obj != null) {
            return new C0052a(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static String m304c(int i) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return "ACTION_FOCUS";
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return "ACTION_CLEAR_FOCUS";
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                return "ACTION_SELECT";
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m305a() {
        return this.f337b;
    }

    /* JADX INFO: renamed from: a */
    public void m306a(int i) {
        f336a.mo358a(this.f337b, i);
    }

    /* JADX INFO: renamed from: a */
    public void m307a(Rect rect) {
        f336a.mo359a(this.f337b, rect);
    }

    /* JADX INFO: renamed from: a */
    public void m308a(View view) {
        f336a.mo370c(this.f337b, view);
    }

    /* JADX INFO: renamed from: a */
    public void m309a(CharSequence charSequence) {
        f336a.mo371c(this.f337b, charSequence);
    }

    /* JADX INFO: renamed from: a */
    public void m310a(boolean z) {
        f336a.mo372c(this.f337b, z);
    }

    /* JADX INFO: renamed from: b */
    public int m311b() {
        return f336a.mo363b(this.f337b);
    }

    /* JADX INFO: renamed from: b */
    public void m312b(int i) {
        f336a.mo392b(this.f337b, i);
    }

    /* JADX INFO: renamed from: b */
    public void m313b(Rect rect) {
        f336a.mo369c(this.f337b, rect);
    }

    /* JADX INFO: renamed from: b */
    public void m314b(View view) {
        f336a.mo360a(this.f337b, view);
    }

    /* JADX INFO: renamed from: b */
    public void m315b(CharSequence charSequence) {
        f336a.mo361a(this.f337b, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public void m316b(boolean z) {
        f336a.mo375d(this.f337b, z);
    }

    /* JADX INFO: renamed from: c */
    public int m317c() {
        return f336a.mo395r(this.f337b);
    }

    /* JADX INFO: renamed from: c */
    public void m318c(Rect rect) {
        f336a.mo364b(this.f337b, rect);
    }

    /* JADX INFO: renamed from: c */
    public void m319c(View view) {
        f336a.mo365b(this.f337b, view);
    }

    /* JADX INFO: renamed from: c */
    public void m320c(CharSequence charSequence) {
        f336a.mo366b(this.f337b, charSequence);
    }

    /* JADX INFO: renamed from: c */
    public void m321c(boolean z) {
        f336a.mo393h(this.f337b, z);
    }

    /* JADX INFO: renamed from: d */
    public void m322d(Rect rect) {
        f336a.mo374d(this.f337b, rect);
    }

    /* JADX INFO: renamed from: d */
    public void m323d(boolean z) {
        f336a.mo394i(this.f337b, z);
    }

    /* JADX INFO: renamed from: d */
    public boolean m324d() {
        return f336a.mo381g(this.f337b);
    }

    /* JADX INFO: renamed from: e */
    public void m325e(boolean z) {
        f336a.mo380g(this.f337b, z);
    }

    /* JADX INFO: renamed from: e */
    public boolean m326e() {
        return f336a.mo382h(this.f337b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0052a c0052a = (C0052a) obj;
            if (this.f337b == null) {
                return c0052a.f337b == null;
            }
            return this.f337b.equals(c0052a.f337b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m327f(boolean z) {
        f336a.mo362a(this.f337b, z);
    }

    /* JADX INFO: renamed from: f */
    public boolean m328f() {
        return f336a.mo385k(this.f337b);
    }

    /* JADX INFO: renamed from: g */
    public void m329g(boolean z) {
        f336a.mo377e(this.f337b, z);
    }

    /* JADX INFO: renamed from: g */
    public boolean m330g() {
        return f336a.mo386l(this.f337b);
    }

    /* JADX INFO: renamed from: h */
    public void m331h(boolean z) {
        f336a.mo367b(this.f337b, z);
    }

    /* JADX INFO: renamed from: h */
    public boolean m332h() {
        return f336a.mo396s(this.f337b);
    }

    public int hashCode() {
        if (this.f337b == null) {
            return 0;
        }
        return this.f337b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public void m333i(boolean z) {
        f336a.mo379f(this.f337b, z);
    }

    /* JADX INFO: renamed from: i */
    public boolean m334i() {
        return f336a.mo397t(this.f337b);
    }

    /* JADX INFO: renamed from: j */
    public boolean m335j() {
        return f336a.mo390p(this.f337b);
    }

    /* JADX INFO: renamed from: k */
    public boolean m336k() {
        return f336a.mo383i(this.f337b);
    }

    /* JADX INFO: renamed from: l */
    public boolean m337l() {
        return f336a.mo387m(this.f337b);
    }

    /* JADX INFO: renamed from: m */
    public boolean m338m() {
        return f336a.mo384j(this.f337b);
    }

    /* JADX INFO: renamed from: n */
    public boolean m339n() {
        return f336a.mo388n(this.f337b);
    }

    /* JADX INFO: renamed from: o */
    public boolean m340o() {
        return f336a.mo389o(this.f337b);
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m341p() {
        return f336a.mo376e(this.f337b);
    }

    /* JADX INFO: renamed from: q */
    public CharSequence m342q() {
        return f336a.mo368c(this.f337b);
    }

    /* JADX INFO: renamed from: r */
    public CharSequence m343r() {
        return f336a.mo378f(this.f337b);
    }

    /* JADX INFO: renamed from: s */
    public CharSequence m344s() {
        return f336a.mo373d(this.f337b);
    }

    /* JADX INFO: renamed from: t */
    public void m345t() {
        f336a.mo391q(this.f337b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m307a(rect);
        sb.append("; boundsInParent: " + rect);
        m318c(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(m341p());
        sb.append("; className: ").append(m342q());
        sb.append("; text: ").append(m343r());
        sb.append("; contentDescription: ").append(m344s());
        sb.append("; viewId: ").append(m346u());
        sb.append("; checkable: ").append(m324d());
        sb.append("; checked: ").append(m326e());
        sb.append("; focusable: ").append(m328f());
        sb.append("; focused: ").append(m330g());
        sb.append("; selected: ").append(m335j());
        sb.append("; clickable: ").append(m336k());
        sb.append("; longClickable: ").append(m337l());
        sb.append("; enabled: ").append(m338m());
        sb.append("; password: ").append(m339n());
        sb.append("; scrollable: " + m340o());
        sb.append("; [");
        int iM311b = m311b();
        while (iM311b != 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iM311b);
            iM311b &= iNumberOfTrailingZeros ^ (-1);
            sb.append(m304c(iNumberOfTrailingZeros));
            if (iM311b != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public String m346u() {
        return f336a.mo398u(this.f337b);
    }
}
