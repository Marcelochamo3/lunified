package io.sentry;

import java.util.Date;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0055j1 implements InterfaceC0084r0 {
    public final io.sentry.protocol.t l;
    public final io.sentry.protocol.r m;
    public final d2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Date f115o;
    public Map p;

    public C0055j1(io.sentry.protocol.t tVar, io.sentry.protocol.r rVar, d2 d2Var) {
        this.l = tVar;
        this.m = rVar;
        this.n = d2Var;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        io.sentry.protocol.t tVar = this.l;
        if (tVar != null) {
            cVar.f("event_id");
            cVar.j(iLogger, tVar);
        }
        io.sentry.protocol.r rVar = this.m;
        if (rVar != null) {
            cVar.f("sdk");
            cVar.j(iLogger, rVar);
        }
        d2 d2Var = this.n;
        if (d2Var != null) {
            cVar.f("trace");
            cVar.j(iLogger, d2Var);
        }
        if (this.f115o != null) {
            cVar.f("sent_at");
            cVar.j(iLogger, io.sentry.config.a.r(this.f115o));
        }
        Map map = this.p;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.p, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
