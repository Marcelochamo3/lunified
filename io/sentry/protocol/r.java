package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.C0088s1;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC0084r0 {
    public String l;
    public String m;
    public Set n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Set f133o;
    public Map p;

    public r(String str, String str2) {
        this.l = str;
        this.m = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.l.equals(rVar.l) && this.m.equals(rVar.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("name");
        cVar.m(this.l);
        cVar.f("version");
        cVar.m(this.m);
        Set set = this.n;
        if (set == null) {
            set = (CopyOnWriteArraySet) C0088s1.j().m;
        }
        Set set2 = this.f133o;
        if (set2 == null) {
            set2 = (CopyOnWriteArraySet) C0088s1.j().l;
        }
        if (!set.isEmpty()) {
            cVar.f("packages");
            cVar.j(iLogger, set);
        }
        if (!set2.isEmpty()) {
            cVar.f("integrations");
            cVar.j(iLogger, set2);
        }
        Map map = this.p;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.p, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
