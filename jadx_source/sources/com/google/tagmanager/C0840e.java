package com.google.tagmanager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.google.tagmanager.e */
/* JADX INFO: loaded from: classes.dex */
public class C0840e {

    /* JADX INFO: renamed from: a */
    public static final Object f2475a = new Object();

    /* JADX INFO: renamed from: b */
    private final ConcurrentHashMap f2476b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    private final Map f2477c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final ReentrantLock f2478d = new ReentrantLock();

    /* JADX INFO: renamed from: e */
    private final LinkedList f2479e = new LinkedList();

    C0840e() {
    }

    /* JADX INFO: renamed from: a */
    void m3517a(InterfaceC0841f interfaceC0841f) {
        this.f2476b.put(interfaceC0841f, 0);
    }
}
