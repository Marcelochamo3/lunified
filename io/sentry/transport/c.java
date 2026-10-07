package io.sentry.transport;

import io.sentry.AbstractC0049h1;
import io.sentry.B;
import io.sentry.C0055j1;
import io.sentry.C0070o1;
import io.sentry.C0071p;
import io.sentry.C0072p0;
import io.sentry.C0088s1;
import io.sentry.C0104y;
import io.sentry.EnumC0053j;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0052i1;
import io.sentry.i2;
import io.sentry.r;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {
    public final m l;
    public final io.sentry.cache.d m;
    public final I1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f149o;
    public final h p;
    public final e q;
    public volatile Runnable r;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public c(I1 i1, r rVar, h hVar, C0088s1 c0088s1) {
        int maxQueueSize = i1.getMaxQueueSize();
        final io.sentry.cache.d envelopeDiskCache = i1.getEnvelopeDiskCache();
        final ILogger logger = i1.getLogger();
        InterfaceC0052i1 dateProvider = i1.getDateProvider();
        m mVar = new m(maxQueueSize, new B(5), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof b) {
                    b bVar = (b) runnable;
                    boolean zU = io.sentry.config.a.u(bVar.m, io.sentry.hints.d.class);
                    C0104y c0104y = bVar.m;
                    if (!zU) {
                        envelopeDiskCache.b(bVar.l, c0104y);
                    }
                    Object objQ = io.sentry.config.a.q(c0104y);
                    if (io.sentry.hints.j.class.isInstance(io.sentry.config.a.q(c0104y)) && objQ != null) {
                        ((io.sentry.hints.j) objQ).b(false);
                    }
                    Object objQ2 = io.sentry.config.a.q(c0104y);
                    if (io.sentry.hints.g.class.isInstance(io.sentry.config.a.q(c0104y)) && objQ2 != null) {
                        ((io.sentry.hints.g) objQ2).e(true);
                    }
                    logger.h(EnumC0094u1.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        e eVar = new e(i1, c0088s1, rVar);
        this.r = null;
        this.l = mVar;
        io.sentry.cache.d envelopeDiskCache2 = i1.getEnvelopeDiskCache();
        io.sentry.config.a.C(envelopeDiskCache2, "envelopeCache is required");
        this.m = envelopeDiskCache2;
        this.n = i1;
        this.f149o = rVar;
        io.sentry.config.a.C(hVar, "transportGate is required");
        this.p = hVar;
        this.q = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d(false);
    }

    @Override // io.sentry.transport.g
    public final void d(boolean z) {
        long flushTimeoutMillis;
        this.l.shutdown();
        this.n.getLogger().h(EnumC0094u1.DEBUG, "Shutting down", new Object[0]);
        if (z) {
            flushTimeoutMillis = 0;
        } else {
            try {
                flushTimeoutMillis = this.n.getFlushTimeoutMillis();
            } catch (InterruptedException unused) {
                this.n.getLogger().h(EnumC0094u1.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
                Thread.currentThread().interrupt();
                return;
            }
        }
        if (this.l.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
            return;
        }
        this.n.getLogger().h(EnumC0094u1.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
        this.l.shutdownNow();
        if (this.r != null) {
            this.l.getRejectedExecutionHandler().rejectedExecution(this.r, this.l);
        }
    }

    @Override // io.sentry.transport.g
    public final r e() {
        return this.f149o;
    }

    @Override // io.sentry.transport.g
    public final boolean g() {
        boolean z;
        r rVar = this.f149o;
        rVar.getClass();
        Date date = new Date(((f) rVar.a).b());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) rVar.c;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((EnumC0053j) it.next());
            if (date2 != null && !date.after(date2)) {
                z = true;
                break;
            }
        }
        m mVar = this.l;
        AbstractC0049h1 abstractC0049h1 = mVar.m;
        return (z || (abstractC0049h1 != null && (mVar.f150o.y().b(abstractC0049h1) > 2000000000L ? 1 : (mVar.f150o.y().b(abstractC0049h1) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    @Override // io.sentry.transport.g
    public final void j(long j) {
        m mVar = this.l;
        mVar.getClass();
        try {
            C0072p0 c0072p0 = mVar.p;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c0072p0.getClass();
            ((n) c0072p0.l).tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e) {
            mVar.n.v(EnumC0094u1.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.g
    public final void x(C0088s1 c0088s1, C0104y c0104y) {
        io.sentry.cache.d dVar;
        boolean z;
        C0088s1 c0088s1A;
        EnumC0053j enumC0053j;
        boolean zIsInstance = io.sentry.hints.d.class.isInstance(io.sentry.config.a.q(c0104y));
        I1 i1 = this.n;
        io.sentry.cache.d dVar2 = this.m;
        if (zIsInstance) {
            dVar = i.l;
            i1.getLogger().h(EnumC0094u1.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z = true;
        } else {
            dVar = dVar2;
            z = false;
        }
        r rVar = this.f149o;
        rVar.getClass();
        Iterable<C0070o1> iterable = (Iterable) c0088s1.m;
        Iterator it = iterable.iterator();
        ArrayList arrayList = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            I1 i2 = (I1) rVar.b;
            if (!zHasNext) {
                if (arrayList != null) {
                    i2.getLogger().h(EnumC0094u1.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
                    ArrayList arrayList2 = new ArrayList();
                    for (C0070o1 c0070o1 : iterable) {
                        if (!arrayList.contains(c0070o1)) {
                            arrayList2.add(c0070o1);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        i2.getLogger().h(EnumC0094u1.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
                        Object objQ = io.sentry.config.a.q(c0104y);
                        if (io.sentry.hints.j.class.isInstance(io.sentry.config.a.q(c0104y)) && objQ != null) {
                            ((io.sentry.hints.j) objQ).b(false);
                        }
                        Object objQ2 = io.sentry.config.a.q(c0104y);
                        if (io.sentry.hints.g.class.isInstance(io.sentry.config.a.q(c0104y)) && objQ2 != null) {
                            ((io.sentry.hints.g) objQ2).e(false);
                        }
                        c0088s1A = null;
                    } else {
                        c0088s1A = new C0088s1((C0055j1) c0088s1.l, arrayList2);
                    }
                } else {
                    c0088s1A = c0088s1;
                }
                if (c0088s1A == null) {
                    if (z) {
                        dVar2.c(c0088s1);
                        return;
                    }
                    return;
                }
                if (i2.class.isInstance(io.sentry.config.a.q(c0104y))) {
                    c0088s1A = i1.getClientReportRecorder().a(c0088s1A);
                }
                Future futureSubmit = this.l.submit(new b(this, c0088s1A, c0104y, dVar));
                if (futureSubmit != null && futureSubmit.isCancelled()) {
                    i1.getClientReportRecorder().e(io.sentry.clientreport.d.QUEUE_OVERFLOW, c0088s1A);
                    return;
                }
                Object objQ3 = io.sentry.config.a.q(c0104y);
                if (!C0071p.class.isInstance(io.sentry.config.a.q(c0104y)) || objQ3 == null) {
                    return;
                }
                C0071p c0071p = (C0071p) objQ3;
                c0071p.r.add(c0071p.q);
                i1.getLogger().h(EnumC0094u1.DEBUG, "Envelope enqueued", new Object[0]);
                return;
            }
            C0070o1 c0070o2 = (C0070o1) it.next();
            String itemType = c0070o2.a.n.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    enumC0053j = EnumC0053j.Attachment;
                    break;
                case "statsd":
                    enumC0053j = EnumC0053j.MetricBucket;
                    break;
                case "profile":
                    enumC0053j = EnumC0053j.Profile;
                    break;
                case "event":
                    enumC0053j = EnumC0053j.Error;
                    break;
                case "check_in":
                    enumC0053j = EnumC0053j.Monitor;
                    break;
                case "session":
                    enumC0053j = EnumC0053j.Session;
                    break;
                case "transaction":
                    enumC0053j = EnumC0053j.Transaction;
                    break;
                default:
                    enumC0053j = EnumC0053j.Unknown;
                    break;
            }
            if (rVar.b(enumC0053j)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0070o2);
                i2.getClientReportRecorder().d(io.sentry.clientreport.d.RATELIMIT_BACKOFF, c0070o2);
            }
        }
    }
}
