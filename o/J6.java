package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class J6 extends BroadcastReceiver implements Runnable {
    public final SurfaceHolderCallbackC0898Xr l;
    public final Handler m;
    public final /* synthetic */ C1797ie0 n;

    public J6(C1797ie0 c1797ie0, Handler handler, SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr) {
        this.n = c1797ie0;
        this.m = handler;
        this.l = surfaceHolderCallbackC0898Xr;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.m.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.n.m) {
            this.l.l.f0(-1, 3, false);
        }
    }
}
