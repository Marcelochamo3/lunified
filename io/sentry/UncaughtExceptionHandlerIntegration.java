package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class UncaughtExceptionHandlerIntegration implements InterfaceC0002a0, Thread.UncaughtExceptionHandler, Closeable {
    public Thread.UncaughtExceptionHandler l;
    public K m;
    public I1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f56o;
    public final C0105y0 p;

    public UncaughtExceptionHandlerIntegration() {
        C0105y0 c0105y0 = C0105y0.t;
        this.f56o = false;
        this.p = c0105y0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0105y0 c0105y0 = this.p;
        c0105y0.getClass();
        if (this == Thread.getDefaultUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.l;
            c0105y0.getClass();
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            I1 i1 = this.n;
            if (i1 != null) {
                i1.getLogger().h(EnumC0094u1.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        E e = E.a;
        if (this.f56o) {
            i1.getLogger().h(EnumC0094u1.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f56o = true;
        this.m = e;
        this.n = i1;
        ILogger logger = i1.getLogger();
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        logger.h(enumC0094u1, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.n.isEnableUncaughtExceptionHandler()));
        if (this.n.isEnableUncaughtExceptionHandler()) {
            C0105y0 c0105y0 = this.p;
            c0105y0.getClass();
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                this.n.getLogger().h(enumC0094u1, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                if (defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
                    this.l = ((UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).l;
                } else {
                    this.l = defaultUncaughtExceptionHandler;
                }
            }
            c0105y0.getClass();
            Thread.setDefaultUncaughtExceptionHandler(this);
            this.n.getLogger().h(enumC0094u1, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
            io.sentry.config.a.a(UncaughtExceptionHandlerIntegration.class);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        io.sentry.protocol.t tVar;
        I1 i1 = this.n;
        if (i1 == null || this.m == null) {
            return;
        }
        i1.getLogger().h(EnumC0094u1.INFO, "Uncaught exception received.", new Object[0]);
        try {
            i2 i2Var = new i2(this.n.getFlushTimeoutMillis(), this.n.getLogger());
            io.sentry.protocol.j jVar = new io.sentry.protocol.j();
            jVar.f126o = Boolean.FALSE;
            jVar.l = "UncaughtExceptionHandler";
            C0083q1 c0083q1 = new C0083q1(new io.sentry.exception.a(jVar, th, thread, false));
            c0083q1.F = EnumC0094u1.FATAL;
            if (this.m.b() == null && (tVar = c0083q1.l) != null) {
                i2Var.f(tVar);
            }
            C0104y c0104yB = io.sentry.config.a.b(i2Var);
            boolean zEquals = this.m.w(c0083q1, c0104yB).equals(io.sentry.protocol.t.m);
            io.sentry.hints.e eVar = (io.sentry.hints.e) c0104yB.b("sentry:eventDropReason", io.sentry.hints.e.class);
            if ((!zEquals || io.sentry.hints.e.MULTITHREADED_DEDUPLICATION.equals(eVar)) && !i2Var.c()) {
                this.n.getLogger().h(EnumC0094u1.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", c0083q1.l);
            }
        } catch (Throwable th2) {
            this.n.getLogger().v(EnumC0094u1.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (this.l != null) {
            this.n.getLogger().h(EnumC0094u1.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.l.uncaughtException(thread, th);
        } else if (this.n.isPrintUncaughtStackTrace()) {
            th.getClass();
        }
    }
}
