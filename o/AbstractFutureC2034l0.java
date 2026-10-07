package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: o.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC2034l0 implements Future {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(AbstractFutureC2034l0.class.getName());
    public static final AbstractC1376eG f;
    public static final Object g;
    public volatile Object a;
    public volatile C1644h0 b;
    public volatile C1936k0 c;

    static {
        AbstractC1376eG c1838j0;
        try {
            c1838j0 = new C1742i0(AtomicReferenceFieldUpdater.newUpdater(C1936k0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1936k0.class, C1936k0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2034l0.class, C1936k0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2034l0.class, C1644h0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2034l0.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1838j0 = new C1838j0();
        }
        f = c1838j0;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void b(AbstractFutureC2034l0 abstractFutureC2034l0) {
        C1936k0 c1936k0;
        C1644h0 c1644h0;
        do {
            c1936k0 = abstractFutureC2034l0.c;
        } while (!f.h(abstractFutureC2034l0, c1936k0, C1936k0.c));
        while (c1936k0 != null) {
            Thread thread = c1936k0.a;
            if (thread != null) {
                c1936k0.a = null;
                LockSupport.unpark(thread);
            }
            c1936k0 = c1936k0.b;
        }
        do {
            c1644h0 = abstractFutureC2034l0.b;
        } while (!f.f(abstractFutureC2034l0, c1644h0));
        C1644h0 c1644h1 = null;
        while (c1644h0 != null) {
            C1644h0 c1644h2 = c1644h0.a;
            c1644h0.a = c1644h1;
            c1644h1 = c1644h0;
            c1644h0 = c1644h2;
        }
        while (c1644h1 != null) {
            c1644h1 = c1644h1.a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof C1448f0) {
            Throwable th = ((C1448f0) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC1546g0) {
            ((AbstractC1546g0) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e3) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e3.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C1448f0 c1448f0;
        Object obj = this.a;
        if (obj == null) {
            if (d) {
                c1448f0 = new C1448f0(new CancellationException("Future.cancel() was called."), z);
            } else {
                c1448f0 = z ? C1448f0.b : C1448f0.c;
            }
            if (f.g(this, obj, c1448f0)) {
                b(this);
                return true;
            }
        }
        return false;
    }

    public final void d(C1936k0 c1936k0) {
        c1936k0.a = null;
        while (true) {
            C1936k0 c1936k1 = this.c;
            if (c1936k1 == C1936k0.c) {
                return;
            }
            C1936k0 c1936k2 = null;
            while (c1936k1 != null) {
                C1936k0 c1936k3 = c1936k1.b;
                if (c1936k1.a != null) {
                    c1936k2 = c1936k1;
                } else if (c1936k2 != null) {
                    c1936k2.b = c1936k3;
                    if (c1936k2.a == null) {
                    }
                } else if (!f.h(this, c1936k1, c1936k3)) {
                }
                c1936k1 = c1936k3;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f A[EDGE_INSN: B:56:0x009f->B:36:0x006e BREAK  A[LOOP:0: B:21:0x003e->B:86:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:71:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:0x0146  */
    /* JADX WARN: Code duplicated, block: B:80:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x009f -> B:36:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractFutureC2034l0.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof C1448f0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.a != null) & true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof C1448f0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & true) {
                return c(obj2);
            }
            C1936k0 c1936k0 = this.c;
            C1936k0 c1936k1 = C1936k0.c;
            if (c1936k0 != c1936k1) {
                C1936k0 c1936k2 = new C1936k0();
                do {
                    AbstractC1376eG abstractC1376eG = f;
                    abstractC1376eG.z(c1936k2, c1936k0);
                    if (abstractC1376eG.h(this, c1936k0, c1936k2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                d(c1936k2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & true));
                        return c(obj);
                    }
                    c1936k0 = this.c;
                } while (c1936k0 != c1936k1);
            }
            return c(this.a);
        }
        throw new InterruptedException();
    }
}
