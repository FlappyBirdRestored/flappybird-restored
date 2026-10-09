package android.support.v4.view;

import android.view.MotionEvent;

/* JADX INFO: renamed from: android.support.v4.view.aa */
/* JADX INFO: loaded from: classes.dex */
class C0082aa implements InterfaceC0084ac {
    C0082aa() {
    }

    @Override // android.support.v4.view.InterfaceC0084ac
    /* JADX INFO: renamed from: a */
    public int mo461a(MotionEvent motionEvent) {
        return 1;
    }

    @Override // android.support.v4.view.InterfaceC0084ac
    /* JADX INFO: renamed from: a */
    public int mo462a(MotionEvent motionEvent, int i) {
        return i == 0 ? 0 : -1;
    }

    @Override // android.support.v4.view.InterfaceC0084ac
    /* JADX INFO: renamed from: b */
    public int mo463b(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return 0;
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    @Override // android.support.v4.view.InterfaceC0084ac
    /* JADX INFO: renamed from: c */
    public float mo464c(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getX();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }

    @Override // android.support.v4.view.InterfaceC0084ac
    /* JADX INFO: renamed from: d */
    public float mo465d(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return motionEvent.getY();
        }
        throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
}
