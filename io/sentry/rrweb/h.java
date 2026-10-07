package io.sentry.rrweb;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC0084r0 {
    public int l;
    public float m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f142o;
    public Map p;

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("id");
        cVar.i(this.l);
        cVar.f("x");
        cVar.h(this.m);
        cVar.f("y");
        cVar.h(this.n);
        cVar.f("timeOffset");
        cVar.i(this.f142o);
        Map map = this.p;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.p, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
