package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class C {
    public static final long g = TimeUnit.HOURS.toMillis(5);
    public static final long h = TimeUnit.SECONDS.toMillis(1);
    public static C i;
    public final long a;
    public volatile String b;
    public volatile long c;
    public final AtomicBoolean d;
    public final Callable e;
    public final ExecutorService f;

    public C() {
        CallableC0107z callableC0107z = new CallableC0107z(0);
        this.d = new AtomicBoolean(false);
        this.f = Executors.newSingleThreadExecutor(new B(0));
        this.a = g;
        this.e = callableC0107z;
        a();
    }

    public final void a() {
        try {
            this.f.submit(new A(0, this)).get(h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}
