package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC0084r0 {
    public final String l;
    public Map m;

    public B(String str) {
        this.l = str;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        String str = this.l;
        if (str != null) {
            cVar.f("source");
            cVar.j(iLogger, str);
        }
        Map map = this.m;
        if (map != null) {
            for (String str2 : map.keySet()) {
                AbstractC0035d.c(this.m, str2, cVar, str2, iLogger);
            }
        }
        cVar.c();
    }
}
