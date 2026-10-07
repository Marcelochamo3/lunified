package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.AbstractC0049h1;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import io.sentry.T1;
import io.sentry.U1;
import io.sentry.W1;
import io.sentry.Y1;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w implements InterfaceC0084r0 {
    public final Double l;
    public final Double m;
    public final t n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final W1 f136o;
    public final W1 p;
    public final String q;
    public final String r;
    public final Y1 s;
    public final String t;
    public final Map u;
    public Map v;
    public final Map w;
    public final Map x;
    public Map y;

    public w(Double d, Double d2, t tVar, W1 w1, W1 w2, String str, String str2, Y1 y1, String str3, Map map, Map map2, Map map3, Map map4) {
        this.l = d;
        this.m = d2;
        this.n = tVar;
        this.f136o = w1;
        this.p = w2;
        this.q = str;
        this.r = str2;
        this.s = y1;
        this.t = str3;
        this.u = map;
        this.w = map2;
        this.x = map3;
        this.v = map4;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.l.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        cVar.j(iLogger, bigDecimalValueOf.setScale(6, roundingMode));
        Double d = this.m;
        if (d != null) {
            cVar.f("timestamp");
            cVar.j(iLogger, BigDecimal.valueOf(d.doubleValue()).setScale(6, roundingMode));
        }
        cVar.f("trace_id");
        cVar.j(iLogger, this.n);
        cVar.f("span_id");
        cVar.j(iLogger, this.f136o);
        W1 w1 = this.p;
        if (w1 != null) {
            cVar.f("parent_span_id");
            cVar.j(iLogger, w1);
        }
        cVar.f("op");
        cVar.m(this.q);
        String str = this.r;
        if (str != null) {
            cVar.f("description");
            cVar.m(str);
        }
        Y1 y1 = this.s;
        if (y1 != null) {
            cVar.f("status");
            cVar.j(iLogger, y1);
        }
        String str2 = this.t;
        if (str2 != null) {
            cVar.f("origin");
            cVar.j(iLogger, str2);
        }
        Map map = this.u;
        if (!map.isEmpty()) {
            cVar.f("tags");
            cVar.j(iLogger, map);
        }
        if (this.v != null) {
            cVar.f("data");
            cVar.j(iLogger, this.v);
        }
        Map map2 = this.w;
        if (!map2.isEmpty()) {
            cVar.f("measurements");
            cVar.j(iLogger, map2);
        }
        Map map3 = this.x;
        if (map3 != null && !map3.isEmpty()) {
            cVar.f("_metrics_summary");
            cVar.j(iLogger, map3);
        }
        Map map4 = this.y;
        if (map4 != null) {
            for (String str3 : map4.keySet()) {
                AbstractC0035d.c(this.y, str3, cVar, str3, iLogger);
            }
        }
        cVar.c();
    }

    public w(T1 t1) {
        ConcurrentHashMap concurrentHashMap = t1.j;
        U1 u1 = t1.c;
        this.r = u1.q;
        this.q = u1.p;
        this.f136o = u1.m;
        this.p = u1.n;
        this.n = u1.l;
        this.s = u1.r;
        this.t = u1.t;
        ConcurrentHashMap concurrentHashMapZ = io.sentry.config.a.z(u1.s);
        this.u = concurrentHashMapZ == null ? new ConcurrentHashMap() : concurrentHashMapZ;
        ConcurrentHashMap concurrentHashMapZ2 = io.sentry.config.a.z(t1.k);
        this.w = concurrentHashMapZ2 == null ? new ConcurrentHashMap() : concurrentHashMapZ2;
        AbstractC0049h1 abstractC0049h1 = t1.b;
        this.m = abstractC0049h1 == null ? null : Double.valueOf(t1.a.c(abstractC0049h1) / 1.0E9d);
        this.l = Double.valueOf(t1.a.d() / 1.0E9d);
        this.v = concurrentHashMap;
        io.sentry.metrics.b bVar = (io.sentry.metrics.b) t1.l.k();
        if (bVar != null) {
            this.x = bVar.a();
        } else {
            this.x = null;
        }
    }
}
