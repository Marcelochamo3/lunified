package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q implements InterfaceC0084r0 {
    public String l;
    public Integer m;
    public Integer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f132o;
    public Map p;

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("sdk_name");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("version_major");
            cVar.l(this.m);
        }
        if (this.n != null) {
            cVar.f("version_minor");
            cVar.l(this.n);
        }
        if (this.f132o != null) {
            cVar.f("version_patchlevel");
            cVar.l(this.f132o);
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
