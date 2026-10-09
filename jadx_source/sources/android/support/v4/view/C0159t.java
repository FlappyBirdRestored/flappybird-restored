package android.support.v4.view;

import android.view.KeyEvent;

/* JADX INFO: renamed from: android.support.v4.view.t */
/* JADX INFO: loaded from: classes.dex */
class C0159t implements InterfaceC0162w {
    C0159t() {
    }

    /* JADX INFO: renamed from: a */
    private static int m603a(int i, int i2, int i3, int i4, int i5) {
        boolean z = (i2 & i3) != 0;
        int i6 = i4 | i5;
        boolean z2 = (i2 & i6) != 0;
        if (!z) {
            return z2 ? i & (i3 ^ (-1)) : i;
        }
        if (z2) {
            throw new IllegalArgumentException("bad arguments");
        }
        return i & (i6 ^ (-1));
    }

    /* JADX INFO: renamed from: a */
    public int mo604a(int i) {
        int i2 = (i & 192) != 0 ? i | 1 : i;
        if ((i2 & 48) != 0) {
            i2 |= 2;
        }
        return i2 & 247;
    }

    @Override // android.support.v4.view.InterfaceC0162w
    /* JADX INFO: renamed from: a */
    public void mo605a(KeyEvent keyEvent) {
    }

    @Override // android.support.v4.view.InterfaceC0162w
    /* JADX INFO: renamed from: a */
    public boolean mo606a(int i, int i2) {
        return m603a(m603a(mo604a(i) & 247, i2, 1, 64, 128), i2, 2, 16, 32) == i2;
    }

    @Override // android.support.v4.view.InterfaceC0162w
    /* JADX INFO: renamed from: b */
    public boolean mo607b(int i) {
        return (mo604a(i) & 247) == 0;
    }
}
