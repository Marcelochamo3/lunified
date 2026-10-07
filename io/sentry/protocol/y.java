package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y implements InterfaceC0084r0 {
    public List l;
    public Map m;
    public Boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map f138o;

    public y(List list) {
        this.l = list;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("frames");
            cVar.j(iLogger, this.l);
        }
        if (this.m != null) {
            cVar.f("registers");
            cVar.j(iLogger, this.m);
        }
        if (this.n != null) {
            cVar.f("snapshot");
            cVar.k(this.n);
        }
        Map map = this.f138o;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.f138o, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
