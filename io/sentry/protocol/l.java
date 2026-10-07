package io.sentry.protocol;

import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l implements InterfaceC0084r0 {
    public double l;
    public double m;
    public double n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f128o;
    public Map p;

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("min");
        cVar.h(this.l);
        cVar.f("max");
        cVar.h(this.m);
        cVar.f("sum");
        cVar.h(this.n);
        cVar.f("count");
        cVar.i(this.f128o);
        if (this.p != null) {
            cVar.f("tags");
            cVar.j(iLogger, this.p);
        }
        cVar.c();
    }
}
