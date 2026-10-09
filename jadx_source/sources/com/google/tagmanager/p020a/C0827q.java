package com.google.tagmanager.p020a;

import com.google.android.gms.C0467e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.tagmanager.a.q */
/* JADX INFO: loaded from: classes.dex */
final class C0827q {

    /* JADX INFO: renamed from: d */
    private static final C0827q f2452d = new C0827q(true);

    /* JADX INFO: renamed from: b */
    private boolean f2454b;

    /* JADX INFO: renamed from: c */
    private boolean f2455c = false;

    /* JADX INFO: renamed from: a */
    private final C0791ax f2453a = C0791ax.m3343a(16);

    private C0827q() {
    }

    private C0827q(boolean z) {
        m3483c();
    }

    /* JADX INFO: renamed from: a */
    static int m3472a(EnumC0807bm enumC0807bm, boolean z) {
        if (z) {
            return 2;
        }
        return enumC0807bm.m3388b();
    }

    /* JADX INFO: renamed from: a */
    public static C0827q m3473a() {
        return new C0827q();
    }

    /* JADX INFO: renamed from: a */
    public static Object m3474a(C0821k c0821k, EnumC0807bm enumC0807bm, boolean z) {
        switch (C0828r.f2457b[enumC0807bm.ordinal()]) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return Double.valueOf(c0821k.m3424b());
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return Float.valueOf(c0821k.m3425c());
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                return Long.valueOf(c0821k.m3429e());
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                return Long.valueOf(c0821k.m3427d());
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                return Integer.valueOf(c0821k.m3431f());
            case C0467e.MapAttrs_uiCompass /* 6 */:
                return Long.valueOf(c0821k.m3433g());
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                return Integer.valueOf(c0821k.m3434h());
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                return Boolean.valueOf(c0821k.m3435i());
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                return z ? c0821k.m3437k() : c0821k.m3436j();
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                return c0821k.m3438l();
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                return Integer.valueOf(c0821k.m3439m());
            case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                return Integer.valueOf(c0821k.m3441o());
            case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                return Long.valueOf(c0821k.m3442p());
            case 14:
                return Integer.valueOf(c0821k.m3443q());
            case 15:
                return Long.valueOf(c0821k.m3444r());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3475a(EnumC0807bm enumC0807bm, Object obj) {
        boolean z = false;
        if (obj == null) {
            throw new NullPointerException();
        }
        switch (C0828r.f2456a[enumC0807bm.m3387a().ordinal()]) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                z = obj instanceof Integer;
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                z = obj instanceof Long;
                break;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                z = obj instanceof Float;
                break;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                z = obj instanceof Double;
                break;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                z = obj instanceof Boolean;
                break;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                z = obj instanceof String;
                break;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                if ((obj instanceof AbstractC0818h) || (obj instanceof byte[])) {
                    z = true;
                }
                break;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC0771ad)) {
                    z = true;
                }
                break;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                if ((obj instanceof InterfaceC0780am) || (obj instanceof C0774ag)) {
                    z = true;
                }
                break;
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3476a(Map.Entry entry) {
        InterfaceC0829s interfaceC0829s = (InterfaceC0829s) entry.getKey();
        if (interfaceC0829s.mo3489b() == EnumC0812br.MESSAGE) {
            if (interfaceC0829s.mo3490c()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC0780am) it.next()).mo1438j()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof InterfaceC0780am)) {
                    if (value instanceof C0774ag) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((InterfaceC0780am) value).mo1438j()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static C0827q m3477b() {
        return f2452d;
    }

    /* JADX INFO: renamed from: b */
    private void m3478b(Map.Entry entry) {
        InterfaceC0829s interfaceC0829s = (InterfaceC0829s) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C0774ag) {
            value = ((C0774ag) value).m3297a();
        }
        if (interfaceC0829s.mo3490c()) {
            Object objM3479a = m3479a(interfaceC0829s);
            if (objM3479a == null) {
                this.f2453a.put(interfaceC0829s, new ArrayList((List) value));
                return;
            } else {
                ((List) objM3479a).addAll((List) value);
                return;
            }
        }
        if (interfaceC0829s.mo3489b() != EnumC0812br.MESSAGE) {
            this.f2453a.put(interfaceC0829s, value);
            return;
        }
        Object objM3479a2 = m3479a(interfaceC0829s);
        if (objM3479a2 == null) {
            this.f2453a.put(interfaceC0829s, value);
        } else {
            this.f2453a.put(interfaceC0829s, objM3479a2 instanceof InterfaceC0783ap ? interfaceC0829s.mo3487a((InterfaceC0783ap) objM3479a2, (InterfaceC0783ap) value) : interfaceC0829s.mo3486a(((InterfaceC0780am) objM3479a2).mo1441n(), (InterfaceC0780am) value).mo1464h());
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m3479a(InterfaceC0829s interfaceC0829s) {
        Object obj = this.f2453a.get(interfaceC0829s);
        return obj instanceof C0774ag ? ((C0774ag) obj).m3297a() : obj;
    }

    /* JADX INFO: renamed from: a */
    public void m3480a(C0827q c0827q) {
        for (int i = 0; i < c0827q.f2453a.m3356c(); i++) {
            m3478b(c0827q.f2453a.m3354b(i));
        }
        Iterator it = c0827q.f2453a.m3357d().iterator();
        while (it.hasNext()) {
            m3478b((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3481a(InterfaceC0829s interfaceC0829s, Object obj) {
        if (!interfaceC0829s.mo3490c()) {
            m3475a(interfaceC0829s.mo3488a(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m3475a(interfaceC0829s.mo3488a(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C0774ag) {
            this.f2455c = true;
        }
        this.f2453a.put(interfaceC0829s, obj);
    }

    /* JADX INFO: renamed from: b */
    public void m3482b(InterfaceC0829s interfaceC0829s, Object obj) {
        List arrayList;
        if (!interfaceC0829s.mo3490c()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m3475a(interfaceC0829s.mo3488a(), obj);
        Object objM3479a = m3479a(interfaceC0829s);
        if (objM3479a == null) {
            arrayList = new ArrayList();
            this.f2453a.put(interfaceC0829s, arrayList);
        } else {
            arrayList = (List) objM3479a;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: c */
    public void m3483c() {
        if (this.f2454b) {
            return;
        }
        this.f2453a.mo3353a();
        this.f2454b = true;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0827q clone() {
        C0827q c0827qM3473a = m3473a();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f2453a.m3356c()) {
                break;
            }
            Map.Entry entryM3354b = this.f2453a.m3354b(i2);
            c0827qM3473a.m3481a((InterfaceC0829s) entryM3354b.getKey(), entryM3354b.getValue());
            i = i2 + 1;
        }
        for (Map.Entry entry : this.f2453a.m3357d()) {
            c0827qM3473a.m3481a((InterfaceC0829s) entry.getKey(), entry.getValue());
        }
        c0827qM3473a.f2455c = this.f2455c;
        return c0827qM3473a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m3485e() {
        for (int i = 0; i < this.f2453a.m3356c(); i++) {
            if (!m3476a(this.f2453a.m3354b(i))) {
                return false;
            }
        }
        Iterator it = this.f2453a.m3357d().iterator();
        while (it.hasNext()) {
            if (!m3476a((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
