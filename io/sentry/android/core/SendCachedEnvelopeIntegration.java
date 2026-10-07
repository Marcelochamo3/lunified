package io.sentry.android.core;

import io.sentry.C0088s1;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.InterfaceC0002a0;
import io.sentry.W0;
import io.sentry.X0;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class SendCachedEnvelopeIntegration implements InterfaceC0002a0, io.sentry.G, Closeable {
    public final X0 l;
    public final C0088s1 m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public io.sentry.H f66o;
    public io.sentry.K p;
    public SentryAndroidOptions q;
    public W0 r;
    public final AtomicBoolean n = new AtomicBoolean(false);
    public final AtomicBoolean s = new AtomicBoolean(false);
    public final AtomicBoolean t = new AtomicBoolean(false);

    public SendCachedEnvelopeIntegration(X0 x0, C0088s1 c0088s1) {
        this.l = x0;
        this.m = c0088s1;
    }

    @Override // io.sentry.G
    public final void a() {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.K k = this.p;
        if (k == null || (sentryAndroidOptions = this.q) == null) {
            return;
        }
        f(k, sentryAndroidOptions);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.t.set(true);
        io.sentry.H h = this.f66o;
        if (h != null) {
            h.d(this);
        }
    }

    public final synchronized void f(io.sentry.K k, SentryAndroidOptions sentryAndroidOptions) {
        try {
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new Z(this, sentryAndroidOptions, k, 0));
                if (((Boolean) this.m.k()).booleanValue() && this.n.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
            } catch (RejectedExecutionException e) {
                sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Failed to call the executor. Cached events will not be sent", th);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        io.sentry.E e = io.sentry.E.a;
        this.p = e;
        SentryAndroidOptions sentryAndroidOptions = i1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) i1 : null;
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.q = sentryAndroidOptions;
        if (this.l.b(i1.getCacheDirPath(), i1.getLogger())) {
            f(e, this.q);
        } else {
            i1.getLogger().h(EnumC0094u1.ERROR, "No cache dir path is defined in options.", new Object[0]);
        }
    }
}
