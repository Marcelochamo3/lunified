package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0041f implements InterfaceC0084r0 {
    public final Date l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map f111o;
    public String p;
    public EnumC0094u1 q;
    public Map r;

    public C0041f(Date date) {
        this.f111o = new ConcurrentHashMap();
        this.l = date;
    }

    public final Date a() {
        return (Date) this.l.clone();
    }

    public final void b(Object obj, String str) {
        this.f111o.put(str, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0041f.class != obj.getClass()) {
            return false;
        }
        C0041f c0041f = (C0041f) obj;
        return this.l.getTime() == c0041f.l.getTime() && io.sentry.config.a.e(this.m, c0041f.m) && io.sentry.config.a.e(this.n, c0041f.n) && io.sentry.config.a.e(this.p, c0041f.p) && this.q == c0041f.q;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, this.n, this.p, this.q});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("timestamp");
        cVar.j(iLogger, this.l);
        if (this.m != null) {
            cVar.f("message");
            cVar.m(this.m);
        }
        if (this.n != null) {
            cVar.f("type");
            cVar.m(this.n);
        }
        cVar.f("data");
        cVar.j(iLogger, this.f111o);
        if (this.p != null) {
            cVar.f("category");
            cVar.m(this.p);
        }
        if (this.q != null) {
            cVar.f("level");
            cVar.j(iLogger, this.q);
        }
        Map map = this.r;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.r, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }

    public C0041f(C0041f c0041f) {
        this.f111o = new ConcurrentHashMap();
        this.l = c0041f.l;
        this.m = c0041f.m;
        this.n = c0041f.n;
        this.p = c0041f.p;
        ConcurrentHashMap concurrentHashMapZ = io.sentry.config.a.z(c0041f.f111o);
        if (concurrentHashMapZ != null) {
            this.f111o = concurrentHashMapZ;
        }
        this.r = io.sentry.config.a.z(c0041f.r);
        this.q = c0041f.q;
    }

    public C0041f() {
        this(io.sentry.config.a.j());
    }
}
