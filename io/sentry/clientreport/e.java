package io.sentry.clientreport;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0084r0 {
    public final String l;
    public final String m;
    public final Long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map f107o;

    public e(String str, String str2, Long l) {
        this.l = str;
        this.m = str2;
        this.n = l;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("reason");
        cVar.m(this.l);
        cVar.f("category");
        cVar.m(this.m);
        cVar.f("quantity");
        cVar.l(this.n);
        Map map = this.f107o;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.f107o, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.l + "', category='" + this.m + "', quantity=" + this.n + '}';
    }
}
