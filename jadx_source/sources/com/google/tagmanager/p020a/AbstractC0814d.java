package com.google.tagmanager.p020a;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.tagmanager.a.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0814d implements InterfaceC0784aq {

    /* JADX INFO: renamed from: a */
    private static final C0825o f2414a = C0825o.m3470a();

    /* JADX INFO: renamed from: a */
    private C0800bf m3392a(InterfaceC0780am interfaceC0780am) {
        if (interfaceC0780am instanceof AbstractC0767a) {
            return ((AbstractC0767a) interfaceC0780am).m3273Q();
        }
        return interfaceC0780am instanceof AbstractC0813c ? ((AbstractC0813c) interfaceC0780am).m3391b() : new C0800bf(interfaceC0780am);
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC0780am m3393b(InterfaceC0780am interfaceC0780am) throws C0773af {
        if (interfaceC0780am == null || interfaceC0780am.mo1438j()) {
            return interfaceC0780am;
        }
        throw m3392a(interfaceC0780am).m3367a().m3294a(interfaceC0780am);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0780am m3394a(AbstractC0818h abstractC0818h, C0825o c0825o) throws C0773af {
        try {
            try {
                C0821k c0821kMo3317h = abstractC0818h.mo3317h();
                InterfaceC0780am interfaceC0780am = (InterfaceC0780am) mo1445b(c0821kMo3317h, c0825o);
                try {
                    c0821kMo3317h.m3419a(0);
                    return interfaceC0780am;
                } catch (C0773af e) {
                    throw e.m3294a(interfaceC0780am);
                }
            } catch (C0773af e2) {
                throw e2;
            }
        } catch (IOException e3) {
            throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e3);
        }
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0784aq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC0780am mo3323c(AbstractC0818h abstractC0818h, C0825o c0825o) {
        return m3393b(m3394a(abstractC0818h, c0825o));
    }
}
