package io.sentry.rrweb;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e implements InterfaceC0084r0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f143o;
    public List p;
    public Map q;
    public Map r;

    public i() {
        super(d.TouchMove);
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("type");
        cVar.j(iLogger, this.l);
        cVar.f("timestamp");
        cVar.i(this.m);
        cVar.f("data");
        cVar.b();
        cVar.f("source");
        cVar.j(iLogger, this.n);
        List list = this.p;
        if (list != null && !list.isEmpty()) {
            cVar.f("positions");
            cVar.j(iLogger, this.p);
        }
        cVar.f("pointerId");
        cVar.i(this.f143o);
        Map map = this.r;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.r, str, cVar, str, iLogger);
            }
        }
        cVar.c();
        Map map2 = this.q;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                AbstractC0035d.c(this.q, str2, cVar, str2, iLogger);
            }
        }
        cVar.c();
    }
}
