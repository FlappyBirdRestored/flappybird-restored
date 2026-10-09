package com.google.tagmanager.p020a;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.tagmanager.a.af */
/* JADX INFO: loaded from: classes.dex */
public class C0773af extends IOException {

    /* JADX INFO: renamed from: a */
    private InterfaceC0780am f2321a;

    public C0773af(String str) {
        super(str);
        this.f2321a = null;
    }

    /* JADX INFO: renamed from: b */
    static C0773af m3285b() {
        return new C0773af("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: c */
    static C0773af m3286c() {
        return new C0773af("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: d */
    static C0773af m3287d() {
        return new C0773af("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: e */
    static C0773af m3288e() {
        return new C0773af("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: f */
    static C0773af m3289f() {
        return new C0773af("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: g */
    static C0773af m3290g() {
        return new C0773af("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: h */
    static C0773af m3291h() {
        return new C0773af("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: renamed from: i */
    static C0773af m3292i() {
        return new C0773af("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: j */
    static C0773af m3293j() {
        return new C0773af("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: a */
    public C0773af m3294a(InterfaceC0780am interfaceC0780am) {
        this.f2321a = interfaceC0780am;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0780am m3295a() {
        return this.f2321a;
    }
}
