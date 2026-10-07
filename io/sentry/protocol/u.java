package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u implements InterfaceC0084r0 {
    public final String l;
    public final String m;
    public Map n;

    public u(String str, String str2) {
        this.l = str;
        this.m = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return Objects.equals(this.l, uVar.l) && Objects.equals(this.m, uVar.m);
    }

    public final int hashCode() {
        return Objects.hash(this.l, this.m);
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("name");
        cVar.m(this.l);
        cVar.f("version");
        cVar.m(this.m);
        Map map = this.n;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.n, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
