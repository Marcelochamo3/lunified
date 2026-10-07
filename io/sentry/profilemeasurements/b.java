package io.sentry.profilemeasurements;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import io.sentry.internal.debugmeta.c;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0084r0 {
    public Map l;
    public String m;
    public double n;

    public b(Long l, Number number) {
        this.m = l.toString();
        this.n = number.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return io.sentry.config.a.e(this.l, bVar.l) && this.m.equals(bVar.m) && this.n == bVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, Double.valueOf(this.n)});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        c cVar = (c) f0;
        cVar.b();
        cVar.f("value");
        cVar.j(iLogger, Double.valueOf(this.n));
        cVar.f("elapsed_since_start_ns");
        cVar.j(iLogger, this.m);
        Map map = this.l;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.l, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
