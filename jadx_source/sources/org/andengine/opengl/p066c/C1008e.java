package org.andengine.opengl.p066c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.andengine.opengl.util.C1024e;
import org.andengine.p040d.p052e.C0941a;

/* JADX INFO: renamed from: org.andengine.opengl.c.e */
/* JADX INFO: loaded from: classes.dex */
public class C1008e {

    /* JADX INFO: renamed from: a */
    private final HashSet f2931a = new HashSet();

    /* JADX INFO: renamed from: b */
    private final HashMap f2932b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final ArrayList f2933c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final ArrayList f2934d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final ArrayList f2935e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private C1010g f2936f;

    /* JADX INFO: renamed from: a */
    public synchronized void m3976a() {
        this.f2936f = new C1010g();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[Catch: all -> 0x0049, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0012, B:7:0x0018, B:28:0x004c, B:30:0x0058, B:31:0x0060, B:33:0x0068, B:9:0x001d, B:11:0x0023, B:34:0x006c, B:36:0x0078, B:37:0x007b, B:15:0x002c, B:18:0x0031, B:20:0x003d, B:23:0x0045), top: B:43:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x002c A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0012, B:7:0x0018, B:28:0x004c, B:30:0x0058, B:31:0x0060, B:33:0x0068, B:9:0x001d, B:11:0x0023, B:34:0x006c, B:36:0x0078, B:37:0x007b, B:15:0x002c, B:18:0x0031, B:20:0x003d, B:23:0x0045), top: B:43:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006c A[Catch: all -> 0x0049, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0012, B:7:0x0018, B:28:0x004c, B:30:0x0058, B:31:0x0060, B:33:0x0068, B:9:0x001d, B:11:0x0023, B:34:0x006c, B:36:0x0078, B:37:0x007b, B:15:0x002c, B:18:0x0031, B:20:0x003d, B:23:0x0045), top: B:43:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0078 A[Catch: all -> 0x0049, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0012, B:7:0x0018, B:28:0x004c, B:30:0x0058, B:31:0x0060, B:33:0x0068, B:9:0x001d, B:11:0x0023, B:34:0x006c, B:36:0x0078, B:37:0x007b, B:15:0x002c, B:18:0x0031, B:20:0x003d, B:23:0x0045), top: B:43:0x0001, inners: #0, #1 }] */
    /* JADX INFO: renamed from: a */
    public synchronized void m3977a(C1024e c1024e) {
        int size;
        int i;
        InterfaceC0990a interfaceC0990a;
        HashSet hashSet = this.f2931a;
        ArrayList arrayList = this.f2933c;
        ArrayList arrayList2 = this.f2934d;
        ArrayList arrayList3 = this.f2935e;
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            InterfaceC0990a interfaceC0990a2 = (InterfaceC0990a) arrayList.get(size2);
            if (interfaceC0990a2.mo3928e()) {
                try {
                    interfaceC0990a2.mo3924c(c1024e);
                } catch (IOException e) {
                    C0941a.m3824a(e);
                }
            }
        }
        int size3 = arrayList2.size();
        if (size3 > 0) {
            for (int i2 = size3 - 1; i2 >= 0; i2--) {
                InterfaceC0990a interfaceC0990a3 = (InterfaceC0990a) arrayList2.remove(i2);
                if (!interfaceC0990a3.mo3925c()) {
                    try {
                        interfaceC0990a3.mo3921a(c1024e);
                        this.f2936f.m3983a(c1024e, interfaceC0990a3);
                    } catch (IOException e2) {
                        C0941a.m3824a(e2);
                    }
                }
                arrayList.add(interfaceC0990a3);
            }
            size = arrayList3.size();
            if (size > 0) {
                for (i = size - 1; i >= 0; i--) {
                    interfaceC0990a = (InterfaceC0990a) arrayList3.remove(i);
                    if (interfaceC0990a.mo3925c()) {
                        interfaceC0990a.mo3923b(c1024e);
                    }
                    arrayList.remove(interfaceC0990a);
                    hashSet.remove(interfaceC0990a);
                }
            }
            if (size3 <= 0 || size > 0) {
                System.gc();
            }
        } else {
            size = arrayList3.size();
            if (size > 0) {
                while (i >= 0) {
                    interfaceC0990a = (InterfaceC0990a) arrayList3.remove(i);
                    if (interfaceC0990a.mo3925c()) {
                        interfaceC0990a.mo3923b(c1024e);
                    }
                    arrayList.remove(interfaceC0990a);
                    hashSet.remove(interfaceC0990a);
                }
            }
            if (size3 <= 0) {
                System.gc();
            } else {
                System.gc();
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m3978a(InterfaceC0990a interfaceC0990a) {
        boolean z;
        try {
            if (interfaceC0990a == null) {
                throw new IllegalArgumentException("pTexture must not be null!");
            }
            if (this.f2931a.contains(interfaceC0990a)) {
                this.f2935e.remove(interfaceC0990a);
                z = false;
            } else {
                this.f2931a.add(interfaceC0990a);
                this.f2934d.add(interfaceC0990a);
                z = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m3979b() {
        HashSet hashSet = this.f2931a;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC0990a) it.next()).mo3926d();
            }
        }
        if (!this.f2933c.isEmpty()) {
            this.f2934d.addAll(this.f2933c);
            this.f2933c.clear();
        }
        if (!this.f2935e.isEmpty()) {
            this.f2931a.removeAll(this.f2935e);
            this.f2935e.clear();
        }
        this.f2936f.mo3995e();
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m3980c() {
        Iterator it = this.f2931a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0990a) it.next()).mo3926d();
        }
        this.f2934d.clear();
        this.f2933c.clear();
        this.f2931a.clear();
        this.f2932b.clear();
        this.f2936f.mo3713n();
        this.f2936f = null;
    }
}
