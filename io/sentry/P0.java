package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class P0 implements InterfaceC0084r0 {
    public Integer l;
    public List m;
    public Map n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P0.class != obj.getClass()) {
            return false;
        }
        P0 p0 = (P0) obj;
        return io.sentry.config.a.e(this.l, p0.l) && io.sentry.config.a.e(this.m, p0.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("segment_id");
            cVar.l(this.l);
        }
        Map map = this.n;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.n, str, cVar, str, iLogger);
            }
        }
        cVar.c();
        io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.b;
        cVar2.q = true;
        cVar2.t();
        cVar2.a();
        cVar2.l.append((CharSequence) "\n");
        List list = this.m;
        if (list != null) {
            cVar.j(iLogger, list);
        }
        cVar2.q = false;
    }
}
