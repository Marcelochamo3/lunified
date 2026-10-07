package o;

import android.os.Handler;

/* JADX INFO: renamed from: o.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1364e7 {
    public final /* synthetic */ int a;
    public final Handler b;
    public final SurfaceHolderCallbackC0898Xr c;

    public /* synthetic */ C1364e7(Handler handler, SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr, int i) {
        this.a = i;
        this.b = handler;
        this.c = surfaceHolderCallbackC0898Xr;
    }

    private final void b(C0579Lj c0579Lj) {
        synchronized (c0579Lj) {
        }
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new RunnableC1072b7(this, c0579Lj, 1));
        }
    }

    public final void a(C0579Lj c0579Lj) {
        switch (this.a) {
            case 0:
                b(c0579Lj);
                break;
            default:
                synchronized (c0579Lj) {
                }
                Handler handler = this.b;
                if (handler != null) {
                    handler.post(new Zs0(this, c0579Lj, 0));
                }
                break;
        }
    }

    public void c(C1045at0 c1045at0) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new O3(this, 21, c1045at0));
        }
    }
}
