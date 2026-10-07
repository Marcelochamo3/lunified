package io.sentry;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: io.sentry.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0083q1 extends AbstractC0037d1 implements InterfaceC0084r0 {
    public Date A;
    public io.sentry.protocol.k B;
    public String C;
    public C0066n0 D;
    public C0066n0 E;
    public EnumC0094u1 F;
    public String G;
    public List H;
    public Map I;
    public Map J;

    public C0083q1(Throwable th) {
        this();
        this.u = th;
    }

    public final io.sentry.protocol.s b() {
        Boolean bool;
        C0066n0 c0066n0 = this.E;
        if (c0066n0 == null) {
            return null;
        }
        for (io.sentry.protocol.s sVar : c0066n0.a) {
            io.sentry.protocol.j jVar = sVar.q;
            if (jVar != null && (bool = jVar.f126o) != null && !bool.booleanValue()) {
                return sVar;
            }
        }
        return null;
    }

    public final boolean c() {
        C0066n0 c0066n0 = this.E;
        return (c0066n0 == null || c0066n0.a.isEmpty()) ? false : true;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("timestamp");
        cVar.j(iLogger, this.A);
        if (this.B != null) {
            cVar.f("message");
            cVar.j(iLogger, this.B);
        }
        if (this.C != null) {
            cVar.f("logger");
            cVar.m(this.C);
        }
        C0066n0 c0066n0 = this.D;
        if (c0066n0 != null && !c0066n0.a.isEmpty()) {
            cVar.f("threads");
            cVar.b();
            cVar.f("values");
            cVar.j(iLogger, this.D.a);
            cVar.c();
        }
        C0066n0 c0066n1 = this.E;
        if (c0066n1 != null && !c0066n1.a.isEmpty()) {
            cVar.f("exception");
            cVar.b();
            cVar.f("values");
            cVar.j(iLogger, this.E.a);
            cVar.c();
        }
        if (this.F != null) {
            cVar.f("level");
            cVar.j(iLogger, this.F);
        }
        if (this.G != null) {
            cVar.f("transaction");
            cVar.m(this.G);
        }
        if (this.H != null) {
            cVar.f("fingerprint");
            cVar.j(iLogger, this.H);
        }
        if (this.J != null) {
            cVar.f("modules");
            cVar.j(iLogger, this.J);
        }
        io.sentry.config.a.D(this, cVar, iLogger);
        Map map = this.I;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.I, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }

    public C0083q1() {
        io.sentry.protocol.t tVar = new io.sentry.protocol.t((UUID) null);
        Date dateJ = io.sentry.config.a.j();
        super(tVar);
        this.A = dateJ;
    }
}
