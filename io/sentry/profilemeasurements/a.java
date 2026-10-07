package io.sentry.profilemeasurements;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import io.sentry.internal.debugmeta.c;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0084r0 {
    public Map l;
    public String m;
    public Collection n;

    public a(String str, AbstractCollection abstractCollection) {
        this.m = str;
        this.n = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.config.a.e(this.l, aVar.l) && this.m.equals(aVar.m) && new ArrayList(this.n).equals(new ArrayList(aVar.n));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, this.n});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        c cVar = (c) f0;
        cVar.b();
        cVar.f("unit");
        cVar.j(iLogger, this.m);
        cVar.f("values");
        cVar.j(iLogger, this.n);
        Map map = this.l;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.l, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
