package o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class Ws0 implements Choreographer.FrameCallback, Handler.Callback {
    public static final Ws0 p = new Ws0();
    public volatile long l = -9223372036854775807L;
    public final Handler m;
    public Choreographer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f607o;

    public Ws0() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = Lr0.a;
        Handler handler = new Handler(looper, this);
        this.m = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.l = j;
        Choreographer choreographer = this.n;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.n = Choreographer.getInstance();
            } catch (RuntimeException e) {
                AP.A("Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 1) {
            Choreographer choreographer = this.n;
            if (choreographer != null) {
                int i2 = this.f607o + 1;
                this.f607o = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        Choreographer choreographer2 = this.n;
        if (choreographer2 != null) {
            int i3 = this.f607o - 1;
            this.f607o = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.l = -9223372036854775807L;
            }
        }
        return true;
    }
}
