package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.AbstractC0037d1;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import io.sentry.Q1;
import io.sentry.T1;
import io.sentry.U1;
import io.sentry.e2;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0037d1 implements InterfaceC0084r0 {
    public String A;
    public Double B;
    public Double C;
    public final ArrayList D;
    public final HashMap E;
    public Map F;
    public B G;
    public Map H;

    public A(ArrayList arrayList, HashMap map, B b) {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.D = arrayList2;
        HashMap map2 = new HashMap();
        this.E = map2;
        this.A = "";
        this.B = dValueOf;
        this.C = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.E.putAll(((w) it.next()).w);
        }
        this.G = b;
        this.F = null;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.A != null) {
            cVar.f("transaction");
            cVar.m(this.A);
        }
        cVar.f("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.B.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        cVar.j(iLogger, bigDecimalValueOf.setScale(6, roundingMode));
        if (this.C != null) {
            cVar.f("timestamp");
            cVar.j(iLogger, BigDecimal.valueOf(this.C.doubleValue()).setScale(6, roundingMode));
        }
        ArrayList arrayList = this.D;
        if (!arrayList.isEmpty()) {
            cVar.f("spans");
            cVar.j(iLogger, arrayList);
        }
        cVar.f("type");
        cVar.m("transaction");
        HashMap map = this.E;
        if (!map.isEmpty()) {
            cVar.f("measurements");
            cVar.j(iLogger, map);
        }
        Map map2 = this.F;
        if (map2 != null && !map2.isEmpty()) {
            cVar.f("_metrics_summary");
            cVar.j(iLogger, this.F);
        }
        cVar.f("transaction_info");
        cVar.j(iLogger, this.G);
        io.sentry.config.a.D(this, cVar, iLogger);
        Map map3 = this.H;
        if (map3 != null) {
            for (String str : map3.keySet()) {
                AbstractC0035d.c(this.H, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }

    public A(Q1 q1) {
        super(q1.a);
        this.D = new ArrayList();
        this.E = new HashMap();
        T1 t1 = q1.b;
        this.B = Double.valueOf(t1.a.d() / 1.0E9d);
        this.C = Double.valueOf(t1.a.c(t1.b) / 1.0E9d);
        this.A = q1.e;
        Iterator it = q1.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T1 t2 = (T1) it.next();
            Boolean bool = Boolean.TRUE;
            e2 e2Var = t2.c.f55o;
            if (bool.equals(e2Var != null ? (Boolean) e2Var.a : null)) {
                this.D.add(new w(t2));
            }
        }
        C0076c c0076c = this.m;
        c0076c.putAll(q1.p);
        U1 u1 = t1.c;
        c0076c.c(new U1(u1.l, u1.m, u1.n, u1.p, u1.q, u1.f55o, u1.r, u1.t));
        Iterator it2 = u1.s.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            a((String) entry.getKey(), (String) entry.getValue());
        }
        ConcurrentHashMap concurrentHashMap = t1.j;
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (this.z == null) {
                    this.z = new HashMap();
                }
                this.z.put(str, value);
            }
        }
        this.G = new B(q1.n.apiName());
        io.sentry.metrics.b bVar = (io.sentry.metrics.b) t1.l.k();
        if (bVar != null) {
            this.F = bVar.a();
        } else {
            this.F = null;
        }
    }
}
