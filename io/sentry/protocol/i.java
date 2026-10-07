package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0084r0 {
    public final Number l;
    public final String m;
    public Map n;

    public i(Number number, String str) {
        this.l = number;
        this.m = str;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("value");
        cVar.l(this.l);
        String str = this.m;
        if (str != null) {
            cVar.f("unit");
            cVar.m(str);
        }
        Map map = this.n;
        if (map != null) {
            for (String str2 : map.keySet()) {
                AbstractC0035d.c(this.n, str2, cVar, str2, iLogger);
            }
        }
        cVar.c();
    }
}
