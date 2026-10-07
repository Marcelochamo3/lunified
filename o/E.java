package o;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends AbstractC1923jt0 implements Future {
    public static final boolean h;
    public static final Logger i;
    public static final AbstractC1370eA j;
    public static final Object k;
    public volatile Object e;
    public volatile C3099w f;
    public volatile D g;

    static {
        boolean z;
        AbstractC1370eA c3293y;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        h = z;
        i = Logger.getLogger(E.class.getName());
        Throwable th = null;
        try {
            c3293y = new C();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                c3293y = new C3196x(AtomicReferenceFieldUpdater.newUpdater(D.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(D.class, D.class, "b"), AtomicReferenceFieldUpdater.newUpdater(E.class, D.class, "g"), AtomicReferenceFieldUpdater.newUpdater(E.class, C3099w.class, "f"), AtomicReferenceFieldUpdater.newUpdater(E.class, Object.class, "e"));
            } catch (Throwable th3) {
                th = th3;
                c3293y = new C3293y();
            }
        }
        j = c3293y;
        if (th != null) {
            Logger logger = i;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
        k = new Object();
    }

    public static void O(E e) {
        e.getClass();
        for (D dP = j.p(e); dP != null; dP = dP.b) {
            Thread thread = dP.a;
            if (thread != null) {
                dP.a = null;
                LockSupport.unpark(thread);
            }
        }
        C3099w c3099wO = j.o(e);
        C3099w c3099w = null;
        while (c3099wO != null) {
            C3099w c3099w2 = c3099wO.a;
            c3099wO.a = c3099w;
            c3099w = c3099wO;
            c3099wO = c3099w2;
        }
        if (c3099w != null) {
            throw null;
        }
    }

    public static Object P(Object obj) throws ExecutionException {
        if (obj instanceof C2808t) {
            Throwable th = ((C2808t) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C3002v) {
            throw new ExecutionException(((C3002v) obj).a);
        }
        if (obj == k) {
            return null;
        }
        return obj;
    }

    public final void M(StringBuilder sb) {
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
                } catch (RuntimeException e) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
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
        N(sb, obj);
        sb.append("]");
    }

    public final void N(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String Q() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public final void R(D d) {
        d.a = null;
        while (true) {
            D d2 = this.g;
            if (d2 == D.c) {
                return;
            }
            D d3 = null;
            while (d2 != null) {
                D d4 = d2.b;
                if (d2.a != null) {
                    d3 = d2;
                } else if (d3 != null) {
                    d3.b = d4;
                    if (d3.a == null) {
                    }
                } else if (!j.e(this, d2, d4)) {
                }
                d2 = d4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C2808t c2808t;
        Object obj = this.e;
        if (obj == null) {
            if (h) {
                c2808t = new C2808t(new CancellationException("Future.cancel() was called."), z);
            } else {
                c2808t = z ? C2808t.b : C2808t.c;
                Objects.requireNonNull(c2808t);
            }
            if (j.d(this, obj, c2808t)) {
                O(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab A[EDGE_INSN: B:56:0x00ab->B:36:0x0077 BREAK  A[LOOP:0: B:21:0x003e->B:86:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0114  */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x014a  */
    /* JADX WARN: Code duplicated, block: B:74:0x015e  */
    /* JADX WARN: Code duplicated, block: B:78:0x018c  */
    /* JADX WARN: Code duplicated, block: B:80:0x019c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00ab -> B:36:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.E.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.e instanceof C2808t;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.e != null) & true;
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            M(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                string = Q();
                int i2 = XY.a;
                if (string == null || string.isEmpty()) {
                    string = null;
                }
            } catch (RuntimeException | StackOverflowError e) {
                String strValueOf = String.valueOf(e.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(strValueOf);
                string = sb2.toString();
            }
            if (string != null) {
                sb.append(", info=[");
                sb.append(string);
                sb.append("]");
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                M(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.e;
            if ((obj2 != null) & true) {
                return P(obj2);
            }
            D d = this.g;
            D d2 = D.c;
            if (d != d2) {
                D d3 = new D();
                do {
                    AbstractC1370eA abstractC1370eA = j;
                    abstractC1370eA.J(d3, d);
                    if (abstractC1370eA.e(this, d, d3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.e;
                            } else {
                                R(d3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & true));
                        return P(obj);
                    }
                    d = this.g;
                } while (d != d2);
            }
            Object obj3 = this.e;
            Objects.requireNonNull(obj3);
            return P(obj3);
        }
        throw new InterruptedException();
    }
}
