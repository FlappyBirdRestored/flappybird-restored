package com.google.tagmanager.p020a;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.tagmanager.a.ag */
/* JADX INFO: loaded from: classes.dex */
class C0774ag {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0780am f2322a;

    /* JADX INFO: renamed from: b */
    private final C0825o f2323b;

    /* JADX INFO: renamed from: c */
    private AbstractC0818h f2324c;

    /* JADX INFO: renamed from: d */
    private volatile InterfaceC0780am f2325d;

    /* JADX INFO: renamed from: b */
    private void m3296b() {
        if (this.f2325d != null) {
            return;
        }
        synchronized (this) {
            if (this.f2325d != null) {
                return;
            }
            try {
                if (this.f2324c != null) {
                    this.f2325d = (InterfaceC0780am) this.f2322a.mo1431c().mo3323c(this.f2324c, this.f2323b);
                }
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0780am m3297a() {
        m3296b();
        return this.f2325d;
    }

    public boolean equals(Object obj) {
        m3296b();
        return this.f2325d.equals(obj);
    }

    public int hashCode() {
        m3296b();
        return this.f2325d.hashCode();
    }

    public String toString() {
        m3296b();
        return this.f2325d.toString();
    }
}
