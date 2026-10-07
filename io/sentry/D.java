package io.sentry;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes.dex */
public final class D implements K {
    public final I1 a;
    public volatile boolean b;
    public final io.sentry.internal.debugmeta.c c;
    public final C0088s1 d;
    public final Map e = DesugarCollections.synchronizedMap(new WeakHashMap());
    public final h2 f;

    public D(I1 i1, io.sentry.internal.debugmeta.c cVar) {
        io.sentry.config.a.C(i1, "SentryOptions is required.");
        if (i1.getDsn() == null || i1.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
        this.a = i1;
        this.d = new C0088s1(i1, 5);
        this.c = cVar;
        io.sentry.protocol.t tVar = io.sentry.protocol.t.m;
        this.f = i1.getTransactionPerformanceCollector();
        this.b = true;
    }

    @Override // io.sentry.K
    /* JADX INFO: renamed from: a */
    public final K clone() {
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        I1 i1 = this.a;
        io.sentry.internal.debugmeta.c cVar = this.c;
        io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c((ILogger) cVar.b, new Z1((Z1) ((LinkedBlockingDeque) cVar.c).getLast()));
        Iterator itDescendingIterator = ((LinkedBlockingDeque) cVar.c).descendingIterator();
        if (itDescendingIterator.hasNext()) {
            itDescendingIterator.next();
        }
        while (itDescendingIterator.hasNext()) {
            ((LinkedBlockingDeque) cVar2.c).push(new Z1((Z1) itDescendingIterator.next()));
        }
        return new D(i1, cVar2);
    }

    @Override // io.sentry.K
    public final W b() {
        if (this.b) {
            return this.c.g().c.b();
        }
        this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.K
    public final void c(C0041f c0041f, C0104y c0104y) {
        if (this.b) {
            this.c.g().c.c(c0041f, c0104y);
        } else {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.K
    public final void d(boolean z) {
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (InterfaceC0002a0 interfaceC0002a0 : this.a.getIntegrations()) {
                if (interfaceC0002a0 instanceof Closeable) {
                    try {
                        ((Closeable) interfaceC0002a0).close();
                    } catch (IOException e) {
                        this.a.getLogger().h(EnumC0094u1.WARNING, "Failed to close the integration {}.", interfaceC0002a0, e);
                    }
                }
            }
            if (this.b) {
                try {
                    this.c.g().c.clear();
                } catch (Throwable th) {
                    this.a.getLogger().v(EnumC0094u1.ERROR, "Error in the 'configureScope' callback.", th);
                }
            } else {
                this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            this.a.getTransactionProfiler().close();
            this.a.getTransactionPerformanceCollector().close();
            T executorService = this.a.getExecutorService();
            if (z) {
                executorService.submit(new RunnableC0059l(this, 1, executorService));
            } else {
                executorService.j(this.a.getShutdownTimeoutMillis());
            }
            this.c.g().b.k(z);
        } catch (Throwable th2) {
            this.a.getLogger().v(EnumC0094u1.ERROR, "Error while closing the Hub.", th2);
        }
        this.b = false;
    }

    @Override // io.sentry.K
    public final r e() {
        return ((io.sentry.transport.g) this.c.g().b.b).e();
    }

    @Override // io.sentry.K
    public final void f(C0041f c0041f) {
        c(c0041f, new C0104y());
    }

    @Override // io.sentry.K
    public final boolean g() {
        return ((io.sentry.transport.g) this.c.g().b.b).g();
    }

    @Override // io.sentry.K
    public final void h() {
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        Z1 z1G = this.c.g();
        S1 s1H = z1G.c.h();
        if (s1H != null) {
            z1G.b.i(s1H, io.sentry.config.a.b(new io.sentry.hints.i()));
        }
    }

    @Override // io.sentry.K
    public final void i() {
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        Z1 z1G = this.c.g();
        io.sentry.internal.debugmeta.c cVarI = z1G.c.i();
        if (cVarI == null) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (((S1) cVarI.b) != null) {
            z1G.b.i((S1) cVarI.b, io.sentry.config.a.b(new io.sentry.hints.i()));
        }
        z1G.b.i((S1) cVarI.c, io.sentry.config.a.b(new io.sentry.hints.i()));
    }

    @Override // io.sentry.K
    public final boolean isEnabled() {
        return this.b;
    }

    @Override // io.sentry.K
    public final void j(long j) {
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            ((io.sentry.transport.g) this.c.g().b.b).j(j);
        } catch (Throwable th) {
            this.a.getLogger().v(EnumC0094u1.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.K
    public final W k(f2 f2Var, g2 g2Var) {
        Q1 q1;
        W w;
        boolean z = this.b;
        D0 d0 = D0.a;
        if (!z) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            w = d0;
        } else if (!this.a.getInstrumenter().equals(f2Var.z)) {
            this.a.getLogger().h(EnumC0094u1.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", f2Var.z, this.a.getInstrumenter());
            w = d0;
        } else if (this.a.isTracingEnabled()) {
            e2 e2VarO = this.d.o(new C0072p0(f2Var));
            f2Var.f55o = e2VarO;
            q1 = new Q1(f2Var, this, g2Var, this.f);
            if (((Boolean) e2VarO.a).booleanValue() && ((Boolean) e2VarO.b).booleanValue()) {
                X transactionProfiler = this.a.getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    w = q1;
                    w = q1;
                    transactionProfiler.start();
                    transactionProfiler.c(q1);
                    w = q1;
                } else if (g2Var.c) {
                    w = q1;
                    w = q1;
                    w = q1;
                    transactionProfiler.c(q1);
                    w = q1;
                }
            }
        } else {
            this.a.getLogger().h(EnumC0094u1.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            w = d0;
        }
        w = q1;
        w = q1;
        w = q1;
        w = q1;
        w = q1;
        w = q1;
        return w;
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t l(io.sentry.protocol.A a, d2 d2Var, C0104y c0104y) {
        return r(a, d2Var, c0104y, null);
    }

    @Override // io.sentry.K
    public final void m(U0 u0) {
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            u0.c(this.c.g().c);
        } catch (Throwable th) {
            this.a.getLogger().v(EnumC0094u1.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t n(Throwable th) {
        return o(th, new C0104y());
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t o(Throwable th, C0104y c0104y) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.m;
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
            return tVar;
        }
        if (th == null) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "captureException called with null parameter.", new Object[0]);
            return tVar;
        }
        try {
            Z1 z1G = this.c.g();
            C0083q1 c0083q1 = new C0083q1(th);
            y(c0083q1);
            return z1G.b.g(c0083q1, z1G.c, c0104y);
        } catch (Throwable th2) {
            this.a.getLogger().v(EnumC0094u1.ERROR, "Error while capturing exception: " + th.getMessage(), th2);
            return tVar;
        }
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t p(String str) {
        return q(str, EnumC0094u1.INFO);
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t q(String str, EnumC0094u1 enumC0094u1) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.m;
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
            return tVar;
        }
        if (str == null) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "captureMessage called with null parameter.", new Object[0]);
            return tVar;
        }
        try {
            Z1 z1G = this.c.g();
            Q q = z1G.c;
            L0 l0 = z1G.b;
            l0.getClass();
            C0083q1 c0083q1 = new C0083q1();
            io.sentry.protocol.k kVar = new io.sentry.protocol.k();
            kVar.l = str;
            c0083q1.B = kVar;
            c0083q1.F = enumC0094u1;
            return l0.g(c0083q1, q, null);
        } catch (Throwable th) {
            this.a.getLogger().v(EnumC0094u1.ERROR, "Error while capturing message: ".concat(str), th);
            return tVar;
        }
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t r(io.sentry.protocol.A a, d2 d2Var, C0104y c0104y, J0 j0) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.m;
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return tVar;
        }
        if (a.C == null) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", a.l);
            return tVar;
        }
        Boolean bool = Boolean.TRUE;
        U1 u1A = a.m.a();
        e2 e2Var = u1A == null ? null : u1A.f55o;
        if (bool.equals(Boolean.valueOf(e2Var == null ? false : ((Boolean) e2Var.a).booleanValue()))) {
            try {
                Z1 z1G = this.c.g();
                return z1G.b.j(a, d2Var, z1G.c, c0104y, j0);
            } catch (Throwable th) {
                this.a.getLogger().v(EnumC0094u1.ERROR, "Error while capturing transaction with id: " + a.l, th);
                return tVar;
            }
        }
        this.a.getLogger().h(EnumC0094u1.DEBUG, "Transaction %s was dropped due to sampling decision.", a.l);
        if (this.a.getBackpressureMonitor().a() > 0) {
            io.sentry.clientreport.f clientReportRecorder = this.a.getClientReportRecorder();
            io.sentry.clientreport.d dVar = io.sentry.clientreport.d.BACKPRESSURE;
            clientReportRecorder.b(dVar, EnumC0053j.Transaction);
            this.a.getClientReportRecorder().c(dVar, EnumC0053j.Span, a.D.size() + 1);
            return tVar;
        }
        io.sentry.clientreport.f clientReportRecorder2 = this.a.getClientReportRecorder();
        io.sentry.clientreport.d dVar2 = io.sentry.clientreport.d.SAMPLE_RATE;
        clientReportRecorder2.b(dVar2, EnumC0053j.Transaction);
        this.a.getClientReportRecorder().c(dVar2, EnumC0053j.Span, a.D.size() + 1);
        return tVar;
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t s(K1 k1, C0104y c0104y) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.m;
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return tVar;
        }
        try {
            Z1 z1G = this.c.g();
            return z1G.b.h(k1, z1G.c, c0104y);
        } catch (Throwable th) {
            this.a.getLogger().v(EnumC0094u1.ERROR, "Error while capturing replay", th);
            return tVar;
        }
    }

    @Override // io.sentry.K
    public final I1 t() {
        return this.c.g().a;
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t u(C0088s1 c0088s1, C0104y c0104y) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.m;
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return tVar;
        }
        try {
            io.sentry.protocol.t tVarF = this.c.g().b.f(c0088s1, c0104y);
            return tVarF != null ? tVarF : tVar;
        } catch (Throwable th) {
            this.a.getLogger().v(EnumC0094u1.ERROR, "Error while capturing envelope.", th);
            return tVar;
        }
    }

    @Override // io.sentry.K
    public final void v(U0 u0) {
        if (!this.b) {
            try {
                u0.c(B0.a);
                return;
            } catch (Throwable th) {
                this.a.getLogger().v(EnumC0094u1.ERROR, "Error in the 'withScope' callback.", th);
                return;
            }
        }
        if (this.b) {
            Z1 z1G = this.c.g();
            ((LinkedBlockingDeque) this.c.c).push(new Z1(this.a, z1G.b, z1G.c.a()));
        } else {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'pushScope' call is a no-op.", new Object[0]);
        }
        try {
            u0.c(this.c.g().c);
        } catch (Throwable th2) {
            this.a.getLogger().v(EnumC0094u1.ERROR, "Error in the 'withScope' callback.", th2);
        }
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'popScope' call is a no-op.", new Object[0]);
            return;
        }
        io.sentry.internal.debugmeta.c cVar = this.c;
        synchronized (((LinkedBlockingDeque) cVar.c)) {
            if (((LinkedBlockingDeque) cVar.c).size() != 1) {
                ((LinkedBlockingDeque) cVar.c).pop();
            } else {
                ((ILogger) cVar.b).h(EnumC0094u1.WARNING, "Attempt to pop the root scope.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t w(C0083q1 c0083q1, C0104y c0104y) {
        io.sentry.protocol.t tVar = io.sentry.protocol.t.m;
        if (!this.b) {
            this.a.getLogger().h(EnumC0094u1.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return tVar;
        }
        try {
            y(c0083q1);
            Z1 z1G = this.c.g();
            return z1G.b.g(c0083q1, z1G.c, c0104y);
        } catch (Throwable th) {
            this.a.getLogger().v(EnumC0094u1.ERROR, "Error while capturing event with id: " + c0083q1.l, th);
            return tVar;
        }
    }

    @Override // io.sentry.K
    public final io.sentry.protocol.t x(C0088s1 c0088s1) {
        return u(c0088s1, new C0104y());
    }

    public final void y(C0083q1 c0083q1) {
        if (this.a.isTracingEnabled()) {
            Throwable cause = c0083q1.u;
            if ((cause instanceof io.sentry.exception.a ? ((io.sentry.exception.a) cause).m : cause) != null) {
                if (cause instanceof io.sentry.exception.a) {
                    cause = ((io.sentry.exception.a) cause).m;
                }
                io.sentry.config.a.C(cause, "throwable cannot be null");
                while (cause.getCause() != null && cause.getCause() != cause) {
                    cause = cause.getCause();
                }
            }
        }
    }
}
