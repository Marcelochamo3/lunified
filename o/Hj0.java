package o;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class Hj0 {
    public static final Gj0 d = new Gj0();
    public boolean a;
    public long b;
    public long c;

    public Hj0 a() {
        this.a = false;
        return this;
    }

    public Hj0 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public Hj0 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public Hj0 g(long j, TimeUnit timeUnit) {
        AbstractC1474fG.j(timeUnit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "timeout < 0: ").toString());
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }
}
