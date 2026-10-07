package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: o.eL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC1381eL extends Handler implements Runnable {
    public final int l;
    public final InterfaceC1479fL m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1284dL f751o;
    public IOException p;
    public int q;
    public Thread r;
    public boolean s;
    public volatile boolean t;
    public final /* synthetic */ Na0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1381eL(Na0 na0, Looper looper, InterfaceC1479fL interfaceC1479fL, InterfaceC1284dL interfaceC1284dL, int i, long j) {
        super(looper);
        this.u = na0;
        this.m = interfaceC1479fL;
        this.f751o = interfaceC1284dL;
        this.l = i;
        this.n = j;
    }

    public final void a(boolean z) {
        this.t = z;
        this.p = null;
        if (hasMessages(0)) {
            this.s = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.s = true;
                    this.m.e();
                    Thread thread = this.r;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.u.n = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC1284dL interfaceC1284dL = this.f751o;
            interfaceC1284dL.getClass();
            interfaceC1284dL.h(this.m, jElapsedRealtime, jElapsedRealtime - this.n, true);
            this.f751o = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.t) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.p = null;
            Na0 na0 = this.u;
            ExecutorService executorService = (ExecutorService) na0.m;
            HandlerC1381eL handlerC1381eL = (HandlerC1381eL) na0.n;
            handlerC1381eL.getClass();
            executorService.execute(handlerC1381eL);
            return;
        }
        if (i == 3) {
            throw ((Error) message.obj);
        }
        this.u.n = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.n;
        InterfaceC1284dL interfaceC1284dL = this.f751o;
        interfaceC1284dL.getClass();
        if (this.s) {
            interfaceC1284dL.h(this.m, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            try {
                interfaceC1284dL.l(this.m, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                AP.g("Unexpected exception handling load completed", e);
                this.u.f414o = new C1675hL(e);
                return;
            }
        }
        if (i2 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.p = iOException;
        int i3 = this.q + 1;
        this.q = i3;
        ZK zkK = interfaceC1284dL.k(this.m, iOException, i3);
        int i4 = zkK.a;
        if (i4 == 3) {
            this.u.f414o = this.p;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.q = 1;
            }
            long jMin = zkK.b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.q - 1) * 1000, 5000);
            }
            Na0 na1 = this.u;
            AbstractC0397Ej.f(((HandlerC1381eL) na1.n) == null);
            na1.n = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.p = null;
                ((ExecutorService) na1.m).execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.s;
                this.r = Thread.currentThread();
            }
            if (z) {
                Pu0.c("load:".concat(this.m.getClass().getSimpleName()));
                try {
                    this.m.b();
                    Pu0.i();
                } catch (Throwable th) {
                    Pu0.i();
                    throw th;
                }
            }
            synchronized (this) {
                this.r = null;
                Thread.interrupted();
            }
            if (this.t) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.t) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Error e2) {
            if (!this.t) {
                AP.g("Unexpected error loading stream", e2);
                obtainMessage(3, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.t) {
                return;
            }
            AP.g("Unexpected exception loading stream", e3);
            obtainMessage(2, new C1675hL(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.t) {
                return;
            }
            AP.g("OutOfMemory error loading stream", e4);
            obtainMessage(2, new C1675hL(e4)).sendToTarget();
        }
    }
}
