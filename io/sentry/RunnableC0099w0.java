package io.sentry;

import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC1674hK;

/* JADX INFO: renamed from: io.sentry.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0099w0 implements L, Runnable, Closeable {
    public final ILogger l;
    public final L0 m;
    public final InterfaceC0052i1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile T f155o;
    public volatile boolean p;
    public final ConcurrentSkipListMap q;
    public final AtomicInteger r;
    public final int s;

    static {
        Charset.forName("UTF-8");
    }

    public RunnableC0099w0(I1 i1, L0 l0) {
        ILogger logger = i1.getLogger();
        InterfaceC0052i1 dateProvider = i1.getDateProvider();
        i1.getBeforeEmitMetricCallback();
        C0105y0 c0105y0 = C0105y0.p;
        this.p = false;
        this.q = new ConcurrentSkipListMap();
        this.r = new AtomicInteger();
        this.m = l0;
        this.l = logger;
        this.n = dateProvider;
        this.s = 100000;
        this.f155o = c0105y0;
    }

    public final void a(boolean z) {
        Set<Long> setKeySet;
        if (!z) {
            if (this.r.get() + this.q.size() >= this.s) {
                this.l.h(EnumC0094u1.INFO, "Metrics: total weight exceeded, flushing all buckets", new Object[0]);
                z = true;
            }
        }
        ConcurrentSkipListMap concurrentSkipListMap = this.q;
        if (z) {
            setKeySet = concurrentSkipListMap.keySet();
        } else {
            long millis = (TimeUnit.NANOSECONDS.toMillis(this.n.y().d()) - 10000) - io.sentry.metrics.c.a;
            long j = ((millis / 1000) / 10) * 10;
            if (millis < 0) {
                j--;
            }
            setKeySet = concurrentSkipListMap.headMap((Object) Long.valueOf(j), true).keySet();
        }
        if (setKeySet.isEmpty()) {
            this.l.h(EnumC0094u1.DEBUG, "Metrics: nothing to flush", new Object[0]);
            return;
        }
        this.l.h(EnumC0094u1.DEBUG, "Metrics: flushing " + setKeySet.size() + " buckets", new Object[0]);
        HashMap map = new HashMap();
        int size = 0;
        for (Long l : setKeySet) {
            l.getClass();
            Map map2 = (Map) this.q.remove(l);
            if (map2 != null) {
                synchronized (map2) {
                    try {
                        Iterator it = map2.values().iterator();
                        if (it.hasNext()) {
                            AbstractC1674hK.w(it.next());
                            throw null;
                        }
                        this.r.addAndGet(0);
                        size += map2.size();
                        map.put(l, map2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (size == 0) {
            this.l.h(EnumC0094u1.DEBUG, "Metrics: only empty buckets found", new Object[0]);
            return;
        }
        this.l.h(EnumC0094u1.DEBUG, "Metrics: capturing metrics", new Object[0]);
        L0 l0 = this.m;
        io.sentry.metrics.a aVar = new io.sentry.metrics.a(map);
        l0.getClass();
        Charset charset = C0070o1.d;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new A(1, aVar));
        l0.f(new C0088s1(new C0055j1(new io.sentry.protocol.t((UUID) null), ((I1) l0.a).getSdkVersion(), null), Collections.singleton(new C0070o1(new C0073p1(EnumC0091t1.Statsd, new CallableC0061l1(cVar, 10), "application/octet-stream", (String) null, (String) null), new CallableC0061l1(cVar, 11)))), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.p = true;
            this.f155o.j(0L);
        }
        a(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a(false);
        synchronized (this) {
            try {
                if (!this.p && !this.q.isEmpty()) {
                    this.f155o.u(this, 5000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
