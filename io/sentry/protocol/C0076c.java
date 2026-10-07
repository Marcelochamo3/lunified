package io.sentry.protocol;

import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import io.sentry.U1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: io.sentry.protocol.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0076c extends ConcurrentHashMap implements InterfaceC0084r0 {
    private static final long serialVersionUID = 252445813254943011L;
    public final Object l = new Object();

    public C0076c() {
    }

    public final U1 a() {
        return (U1) d("trace", U1.class);
    }

    public final void b(C0074a c0074a) {
        put("app", c0074a);
    }

    public final void c(U1 u1) {
        io.sentry.config.a.C(u1, "traceContext is required");
        put("trace", u1);
    }

    public final Object d(String str, Class cls) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                cVar.f(str);
                cVar.j(iLogger, obj);
            }
        }
        cVar.c();
    }

    public C0076c(C0076c c0076c) {
        Iterator it = c0076c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C0074a)) {
                    C0074a c0074a = (C0074a) value;
                    C0074a c0074a2 = new C0074a();
                    c0074a2.r = c0074a.r;
                    c0074a2.l = c0074a.l;
                    c0074a2.p = c0074a.p;
                    c0074a2.m = c0074a.m;
                    c0074a2.q = c0074a.q;
                    c0074a2.f122o = c0074a.f122o;
                    c0074a2.n = c0074a.n;
                    c0074a2.s = io.sentry.config.a.z(c0074a.s);
                    c0074a2.v = c0074a.v;
                    List list = c0074a.t;
                    c0074a2.t = list != null ? new ArrayList(list) : null;
                    c0074a2.u = c0074a.u;
                    c0074a2.w = io.sentry.config.a.z(c0074a.w);
                    b(c0074a2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof C0075b)) {
                    C0075b c0075b = (C0075b) value;
                    C0075b c0075b2 = new C0075b();
                    c0075b2.l = c0075b.l;
                    c0075b2.m = c0075b.m;
                    c0075b2.n = io.sentry.config.a.z(c0075b.n);
                    put("browser", c0075b2);
                } else if ("device".equals(entry.getKey()) && (value instanceof C0079f)) {
                    C0079f c0079f = (C0079f) value;
                    C0079f c0079f2 = new C0079f();
                    c0079f2.l = c0079f.l;
                    c0079f2.m = c0079f.m;
                    c0079f2.n = c0079f.n;
                    c0079f2.f123o = c0079f.f123o;
                    c0079f2.p = c0079f.p;
                    c0079f2.q = c0079f.q;
                    c0079f2.t = c0079f.t;
                    c0079f2.u = c0079f.u;
                    c0079f2.v = c0079f.v;
                    c0079f2.w = c0079f.w;
                    c0079f2.x = c0079f.x;
                    c0079f2.y = c0079f.y;
                    c0079f2.z = c0079f.z;
                    c0079f2.A = c0079f.A;
                    c0079f2.B = c0079f.B;
                    c0079f2.C = c0079f.C;
                    c0079f2.D = c0079f.D;
                    c0079f2.E = c0079f.E;
                    c0079f2.F = c0079f.F;
                    c0079f2.G = c0079f.G;
                    c0079f2.H = c0079f.H;
                    c0079f2.I = c0079f.I;
                    c0079f2.J = c0079f.J;
                    c0079f2.L = c0079f.L;
                    c0079f2.M = c0079f.M;
                    c0079f2.O = c0079f.O;
                    c0079f2.P = c0079f.P;
                    c0079f2.s = c0079f.s;
                    String[] strArr = c0079f.r;
                    c0079f2.r = strArr != null ? (String[]) strArr.clone() : null;
                    c0079f2.N = c0079f.N;
                    TimeZone timeZone = c0079f.K;
                    c0079f2.K = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    c0079f2.Q = c0079f.Q;
                    c0079f2.R = c0079f.R;
                    c0079f2.S = c0079f.S;
                    c0079f2.T = io.sentry.config.a.z(c0079f.T);
                    put("device", c0079f2);
                } else if ("os".equals(entry.getKey()) && (value instanceof m)) {
                    m mVar = (m) value;
                    m mVar2 = new m();
                    mVar2.l = mVar.l;
                    mVar2.m = mVar.m;
                    mVar2.n = mVar.n;
                    mVar2.f129o = mVar.f129o;
                    mVar2.p = mVar.p;
                    mVar2.q = mVar.q;
                    mVar2.r = io.sentry.config.a.z(mVar.r);
                    put("os", mVar2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof v)) {
                    v vVar = (v) value;
                    v vVar2 = new v();
                    vVar2.l = vVar.l;
                    vVar2.m = vVar.m;
                    vVar2.n = vVar.n;
                    vVar2.f135o = io.sentry.config.a.z(vVar.f135o);
                    put("runtime", vVar2);
                } else if ("gpu".equals(entry.getKey()) && (value instanceof h)) {
                    h hVar = (h) value;
                    h hVar2 = new h();
                    hVar2.l = hVar.l;
                    hVar2.m = hVar.m;
                    hVar2.n = hVar.n;
                    hVar2.f125o = hVar.f125o;
                    hVar2.p = hVar.p;
                    hVar2.q = hVar.q;
                    hVar2.r = hVar.r;
                    hVar2.s = hVar.s;
                    hVar2.t = hVar.t;
                    hVar2.u = io.sentry.config.a.z(hVar.u);
                    put("gpu", hVar2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof U1)) {
                    c(new U1((U1) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof p)) {
                    p pVar = (p) value;
                    p pVar2 = new p();
                    pVar2.l = pVar.l;
                    pVar2.m = io.sentry.config.a.z(pVar.m);
                    pVar2.q = io.sentry.config.a.z(pVar.q);
                    pVar2.n = pVar.n;
                    pVar2.f131o = pVar.f131o;
                    pVar2.p = pVar.p;
                    synchronized (this.l) {
                        put("response", pVar2);
                    }
                } else {
                    put((String) entry.getKey(), value);
                }
            }
        }
    }
}
