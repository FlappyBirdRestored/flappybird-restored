package android.support.v4.app;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: android.support.v4.app.h */
/* JADX INFO: loaded from: classes.dex */
class HandlerC0015h extends Handler {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FragmentActivity f133a;

    HandlerC0015h(FragmentActivity fragmentActivity) {
        this.f133a = fragmentActivity;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (message.what) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                if (this.f133a.f59f) {
                    this.f133a.m66a(false);
                }
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                this.f133a.m63a();
                this.f133a.f55b.m146e();
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }
}
