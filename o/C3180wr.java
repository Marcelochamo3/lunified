package o;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3180wr extends AbstractC3083vr implements InterfaceC1714hm {
    public final Executor n;

    public C3180wr(Executor executor) {
        Method method;
        this.n = executor;
        Method method2 = AbstractC2092lg.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = AbstractC2092lg.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // o.InterfaceC1714hm
    public final InterfaceC2300nn R(long j, Runnable runnable, InterfaceC1022ai interfaceC1022ai) {
        Executor executor = this.n;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                AH ah = (AH) interfaceC1022ai.q(C2691rp.v);
                if (ah != null) {
                    ah.f(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new C2203mn(scheduledFutureSchedule) : RunnableC0502Ik.u.R(j, runnable, interfaceC1022ai);
    }

    @Override // o.AbstractC1217ci
    public final void W(InterfaceC1022ai interfaceC1022ai, Runnable runnable) {
        try {
            this.n.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            AH ah = (AH) interfaceC1022ai.q(C2691rp.v);
            if (ah != null) {
                ah.f(cancellationException);
            }
            AbstractC1910jn.b.W(interfaceC1022ai, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.n;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3180wr) && ((C3180wr) obj).n == this.n;
    }

    public final int hashCode() {
        return System.identityHashCode(this.n);
    }

    @Override // o.InterfaceC1714hm
    public final void t(long j, C1692hb c1692hb) {
        Executor executor = this.n;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new RunnableC1938k1(this, c1692hb, 12, false), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                AH ah = (AH) c1692hb.p.q(C2691rp.v);
                if (ah != null) {
                    ah.f(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            c1692hb.A(new C1203cb(0, scheduledFutureSchedule));
        } else {
            RunnableC0502Ik.u.t(j, c1692hb);
        }
    }

    @Override // o.AbstractC1217ci
    public final String toString() {
        return this.n.toString();
    }
}
