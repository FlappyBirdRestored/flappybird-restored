package com.google.ads.p003a;

import android.app.Activity;
import android.app.AlertDialog;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.gesture.GestureStore;
import android.gesture.Prediction;
import com.google.ads.util.C0364g;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.ads.a.ah */
/* JADX INFO: loaded from: classes.dex */
public class C0231ah implements GestureOverlayView.OnGesturePerformedListener {

    /* JADX INFO: renamed from: a */
    private final GestureStore f796a;

    /* JADX INFO: renamed from: b */
    private Activity f797b;

    /* JADX INFO: renamed from: c */
    private C0256w f798c;

    public C0231ah(Activity activity, C0256w c0256w, GestureStore gestureStore) {
        this.f797b = activity;
        this.f798c = c0256w;
        this.f796a = gestureStore;
    }

    @Override // android.gesture.GestureOverlayView.OnGesturePerformedListener
    public void onGesturePerformed(GestureOverlayView gestureOverlayView, Gesture gesture) {
        ArrayList<Prediction> arrayListRecognize = this.f796a.recognize(gesture);
        for (Prediction prediction : arrayListRecognize) {
            C0364g.m1391a("Gesture: '" + prediction.name + "' = " + prediction.score);
        }
        if (arrayListRecognize.size() == 0) {
            C0364g.m1391a("Gesture: No remotely reasonable predictions");
        } else {
            if (arrayListRecognize.get(0).score <= 2.0d || !"debug".equals(arrayListRecognize.get(0).name) || this.f798c == null) {
                return;
            }
            String strM1106b = this.f798c.m1106b() == null ? "[No diagnostics available]" : this.f798c.m1106b();
            new AlertDialog.Builder(this.f797b).setMessage(strM1106b).setTitle("Ad Information").setPositiveButton("Share", new DialogInterfaceOnClickListenerC0234ak(this, strM1106b)).setNeutralButton("Report", new DialogInterfaceOnClickListenerC0233aj(this)).setNegativeButton("Close", new DialogInterfaceOnClickListenerC0232ai(this)).create().show();
        }
    }
}
