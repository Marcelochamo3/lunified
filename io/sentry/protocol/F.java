package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC0084r0 {
    public final String l;
    public final List m;
    public Map n;

    public F(String str, List list) {
        this.l = str;
        this.m = list;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        String str = this.l;
        if (str != null) {
            cVar.f("rendering_system");
            cVar.m(str);
        }
        List list = this.m;
        if (list != null) {
            cVar.f("windows");
            cVar.j(iLogger, list);
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
