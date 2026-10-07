package o;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class BZ {
    public final AZ a;
    public final C1628gs b;
    public final Sh0 c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public BZ(C1628gs c1628gs, AZ az, Fj0 fj0, int i, Sh0 sh0, Looper looper) {
        this.b = c1628gs;
        this.a = az;
        this.f = looper;
        this.c = sh0;
    }

    public final synchronized void a(long j) {
        boolean z;
        AbstractC0397Ej.f(this.g);
        AbstractC0397Ej.f(this.f.getThread() != Thread.currentThread());
        this.c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z = this.i;
            if (z || j <= 0) {
                break;
            }
            this.c.getClass();
            wait(j);
            this.c.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        AbstractC0397Ej.f(!this.g);
        this.g = true;
        C1628gs c1628gs = this.b;
        synchronized (c1628gs) {
            if (!c1628gs.K && c1628gs.u.getThread().isAlive()) {
                c1628gs.s.a(14, this).b();
                return;
            }
            AP.z();
            b(false);
        }
    }
}
