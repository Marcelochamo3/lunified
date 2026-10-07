package io.sentry.clientreport;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0084r0 {
    public final Date l;
    public final List m;
    public Map n;

    public b(Date date, ArrayList arrayList) {
        this.l = date;
        this.m = arrayList;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("timestamp");
        cVar.m(io.sentry.config.a.r(this.l));
        cVar.f("discarded_events");
        cVar.j(iLogger, this.m);
        Map map = this.n;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.n, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
