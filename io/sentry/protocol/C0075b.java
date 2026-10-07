package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.protocol.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0075b implements InterfaceC0084r0 {
    public String l;
    public String m;
    public Map n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0075b.class != obj.getClass()) {
            return false;
        }
        C0075b c0075b = (C0075b) obj;
        return io.sentry.config.a.e(this.l, c0075b.l) && io.sentry.config.a.e(this.m, c0075b.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("name");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("version");
            cVar.m(this.m);
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
