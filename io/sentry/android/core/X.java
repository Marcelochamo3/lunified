package io.sentry.android.core;

import android.os.Looper;
import io.sentry.C0083q1;
import io.sentry.C0104y;
import io.sentry.EnumC0093u0;
import io.sentry.InterfaceC0092u;
import io.sentry.K1;
import io.sentry.L0;
import io.sentry.U1;
import io.sentry.W1;
import io.sentry.Y1;
import io.sentry.protocol.C0074a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class X implements InterfaceC0092u {
    public boolean l = false;
    public final L0 m;
    public final SentryAndroidOptions n;

    public X(SentryAndroidOptions sentryAndroidOptions, L0 l0) {
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.n = sentryAndroidOptions;
        this.m = l0;
    }

    public static void b(io.sentry.android.core.performance.c cVar, io.sentry.protocol.A a) {
        U1 u1A;
        W1 w1;
        if (cVar.a == io.sentry.android.core.performance.b.COLD && (u1A = a.m.a()) != null) {
            ArrayList arrayList = a.D;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    w1 = null;
                    break;
                }
                io.sentry.protocol.w wVar = (io.sentry.protocol.w) it.next();
                if (wVar.q.contentEquals("app.start.cold")) {
                    w1 = wVar.f136o;
                    break;
                }
            }
            long j = io.sentry.android.core.performance.c.i;
            io.sentry.android.core.performance.d dVar = cVar.b;
            boolean zA = dVar.a();
            io.sentry.protocol.t tVar = u1A.l;
            if (zA && Math.abs(j - dVar.n) <= 10000) {
                io.sentry.android.core.performance.d dVar2 = new io.sentry.android.core.performance.d();
                dVar2.c(dVar.n);
                dVar2.m = dVar.m;
                dVar2.f82o = j;
                dVar2.l = "Process Initialization";
                arrayList.add(e(dVar2, w1, tVar, "process.load"));
            }
            ArrayList arrayList2 = new ArrayList(cVar.e.values());
            Collections.sort(arrayList2);
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(e((io.sentry.android.core.performance.d) it2.next(), w1, tVar, "contentprovider.load"));
                }
            }
            io.sentry.android.core.performance.d dVar3 = cVar.d;
            if (dVar3.b()) {
                arrayList.add(e(dVar3, w1, tVar, "application.load"));
            }
            ArrayList<io.sentry.android.core.performance.a> arrayList3 = new ArrayList(cVar.f);
            Collections.sort(arrayList3);
            if (arrayList3.isEmpty()) {
                return;
            }
            for (io.sentry.android.core.performance.a aVar : arrayList3) {
                if (aVar.l.a()) {
                    io.sentry.android.core.performance.d dVar4 = aVar.l;
                    if (dVar4.b()) {
                        arrayList.add(e(dVar4, w1, tVar, "activity.load"));
                    }
                }
                io.sentry.android.core.performance.d dVar5 = aVar.m;
                if (dVar5.a() && dVar5.b()) {
                    arrayList.add(e(dVar5, w1, tVar, "activity.load"));
                }
            }
        }
    }

    public static boolean c(io.sentry.protocol.A a) {
        for (io.sentry.protocol.w wVar : a.D) {
            if (wVar.q.contentEquals("app.start.cold") || wVar.q.contentEquals("app.start.warm")) {
                return true;
            }
        }
        U1 u1A = a.m.a();
        if (u1A != null) {
            String str = u1A.p;
            if (str.equals("app.start.cold") || str.equals("app.start.warm")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    public static void d(io.sentry.protocol.A a) {
        boolean z;
        Double d;
        Double d2;
        Object obj;
        ArrayList<io.sentry.protocol.w> arrayList = a.D;
        io.sentry.protocol.w wVar = null;
        io.sentry.protocol.w wVar2 = null;
        for (io.sentry.protocol.w wVar3 : arrayList) {
            if ("ui.load.initial_display".equals(wVar3.q)) {
                wVar = wVar3;
            } else if ("ui.load.full_display".equals(wVar3.q)) {
                wVar2 = wVar3;
            }
            if (wVar != null && wVar2 != null) {
                break;
            }
        }
        if (wVar == null && wVar2 == null) {
            return;
        }
        for (io.sentry.protocol.w wVar4 : arrayList) {
            if (wVar4 != wVar && wVar4 != wVar2) {
                Map map = wVar4.v;
                boolean z2 = false;
                boolean z3 = map == null || (obj = map.get("thread.name")) == null || "main".equals(obj);
                Double d3 = wVar4.l;
                if (wVar != null) {
                    double dDoubleValue = d3.doubleValue();
                    if (dDoubleValue < wVar.l.doubleValue() || (((d2 = wVar.m) != null && dDoubleValue > d2.doubleValue()) || !z3)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (wVar2 != null) {
                    double dDoubleValue2 = d3.doubleValue();
                    if (dDoubleValue2 >= wVar2.l.doubleValue() && ((d = wVar2.m) == null || dDoubleValue2 <= d.doubleValue())) {
                        z2 = true;
                    }
                }
                if (z || z2) {
                    Map concurrentHashMap = wVar4.v;
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                        wVar4.v = concurrentHashMap;
                    }
                    if (z) {
                        concurrentHashMap.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z2) {
                        concurrentHashMap.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    public static io.sentry.protocol.w e(io.sentry.android.core.performance.d dVar, W1 w1, io.sentry.protocol.t tVar, String str) {
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        Double dValueOf = Double.valueOf(dVar.m / 1000.0d);
        long j = 0;
        if (dVar.a()) {
            j = (dVar.b() ? dVar.f82o - dVar.n : 0L) + dVar.m;
        }
        return new io.sentry.protocol.w(dValueOf, Double.valueOf(j / 1000.0d), tVar, new W1(), w1, str, dVar.l, Y1.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), null, map);
    }

    @Override // io.sentry.InterfaceC0092u
    public final K1 a(K1 k1, C0104y c0104y) {
        return k1;
    }

    @Override // io.sentry.InterfaceC0092u
    public final synchronized io.sentry.protocol.A f(io.sentry.protocol.A a, C0104y c0104y) {
        Map mapT;
        try {
            if (!this.n.isTracingEnabled()) {
                return a;
            }
            if (c(a)) {
                if (!this.l) {
                    io.sentry.android.core.performance.d dVarB = io.sentry.android.core.performance.c.c().b(this.n);
                    long j = dVarB.b() ? dVarB.f82o - dVarB.n : 0L;
                    if (j != 0) {
                        a.E.put(io.sentry.android.core.performance.c.c().a == io.sentry.android.core.performance.b.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.i(Float.valueOf(j), EnumC0093u0.MILLISECOND.apiName()));
                        b(io.sentry.android.core.performance.c.c(), a);
                        this.l = true;
                    }
                }
                C0074a c0074a = (C0074a) a.m.d("app", C0074a.class);
                if (c0074a == null) {
                    c0074a = new C0074a();
                    a.m.b(c0074a);
                }
                c0074a.u = io.sentry.android.core.performance.c.c().a == io.sentry.android.core.performance.b.COLD ? "cold" : "warm";
            }
            d(a);
            io.sentry.protocol.t tVar = a.l;
            U1 u1A = a.m.a();
            if (tVar != null && u1A != null && u1A.p.contentEquals("ui.load") && (mapT = this.m.t(tVar)) != null) {
                a.E.putAll(mapT);
            }
            return a;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC0092u
    public final C0083q1 i(C0083q1 c0083q1, C0104y c0104y) {
        return c0083q1;
    }
}
