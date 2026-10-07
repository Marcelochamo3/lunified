package o;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o.Zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0938Zf implements Executor, ViewTreeObserver.OnDrawListener, Runnable {
    public Runnable m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1116bg f660o;
    public final long l = SystemClock.uptimeMillis() + 10000;
    public boolean n = false;

    public ExecutorC0938Zf(AbstractActivityC1540fx abstractActivityC1540fx) {
        this.f660o = abstractActivityC1540fx;
    }

    public final void a(View view) {
        if (this.n) {
            return;
        }
        this.n = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.m = runnable;
        View decorView = this.f660o.getWindow().getDecorView();
        if (!this.n) {
            decorView.postOnAnimation(new Jj0(7, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.m;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.l) {
                this.n = false;
                this.f660o.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.m = null;
        C1797ie0 c1797ie0 = this.f660o.u;
        synchronized (c1797ie0.n) {
            z = c1797ie0.m;
        }
        if (z) {
            this.n = false;
            this.f660o.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f660o.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
