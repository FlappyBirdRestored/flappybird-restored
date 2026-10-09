package com.google.ads.p003a;

import android.app.Activity;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;
import com.google.ads.util.C0364g;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.ads.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0236c extends FrameLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: b */
    private static final C0241h f805b = (C0241h) C0241h.f821a.mo1047b();

    /* JADX INFO: renamed from: a */
    public MediaController f806a;

    /* JADX INFO: renamed from: c */
    private final WeakReference f807c;

    /* JADX INFO: renamed from: d */
    private final C0238e f808d;

    /* JADX INFO: renamed from: e */
    private long f809e;

    /* JADX INFO: renamed from: f */
    private final VideoView f810f;

    /* JADX INFO: renamed from: g */
    private String f811g;

    public C0236c(Activity activity, C0238e c0238e) {
        super(activity);
        this.f807c = new WeakReference(activity);
        this.f808d = c0238e;
        this.f810f = new VideoView(activity);
        addView(this.f810f, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f806a = null;
        this.f811g = null;
        this.f809e = 0L;
        m1019a();
        this.f810f.setOnCompletionListener(this);
        this.f810f.setOnPreparedListener(this);
        this.f810f.setOnErrorListener(this);
    }

    /* JADX INFO: renamed from: a */
    protected void m1019a() {
        new RunnableC0237d(this).m1027a();
    }

    /* JADX INFO: renamed from: a */
    public void m1020a(int i) {
        this.f810f.seekTo(i);
    }

    /* JADX INFO: renamed from: a */
    public void m1021a(MotionEvent motionEvent) {
        this.f810f.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public void m1022b() {
        if (TextUtils.isEmpty(this.f811g)) {
            f805b.m1039a(this.f808d, "onVideoEvent", "{'event': 'error', 'what': 'no_src'}");
        } else {
            this.f810f.setVideoPath(this.f811g);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1023c() {
        this.f810f.pause();
    }

    /* JADX INFO: renamed from: d */
    public void m1024d() {
        this.f810f.start();
    }

    /* JADX INFO: renamed from: e */
    public void m1025e() {
        this.f810f.stopPlayback();
    }

    /* JADX INFO: renamed from: f */
    void m1026f() {
        long currentPosition = this.f810f.getCurrentPosition();
        if (this.f809e != currentPosition) {
            f805b.m1039a(this.f808d, "onVideoEvent", "{'event': 'timeupdate', 'time': " + (currentPosition / 1000.0f) + "}");
            this.f809e = currentPosition;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        f805b.m1039a(this.f808d, "onVideoEvent", "{'event': 'ended'}");
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C0364g.m1401e("Video threw error! <what:" + i + ", extra:" + i2 + ">");
        f805b.m1039a(this.f808d, "onVideoEvent", "{'event': 'error', 'what': '" + i + "', 'extra': '" + i2 + "'}");
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        f805b.m1039a(this.f808d, "onVideoEvent", "{'event': 'canplaythrough', 'duration': '" + (this.f810f.getDuration() / 1000.0f) + "'}");
    }

    public void setMediaControllerEnabled(boolean z) {
        Activity activity = (Activity) this.f807c.get();
        if (activity == null) {
            C0364g.m1401e("adActivity was null while trying to enable controls on a video.");
            return;
        }
        if (z) {
            if (this.f806a == null) {
                this.f806a = new MediaController(activity);
            }
            this.f810f.setMediaController(this.f806a);
        } else {
            if (this.f806a != null) {
                this.f806a.hide();
            }
            this.f810f.setMediaController(null);
        }
    }

    public void setSrc(String str) {
        this.f811g = str;
    }
}
