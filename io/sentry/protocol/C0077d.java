package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.protocol.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0077d implements InterfaceC0084r0 {
    public q l;
    public List m;
    public Map n;

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("sdk_info");
            cVar.j(iLogger, this.l);
        }
        if (this.m != null) {
            cVar.f("images");
            cVar.j(iLogger, this.m);
        }
        Map map = this.n;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.n, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
