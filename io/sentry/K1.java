package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class K1 extends AbstractC0037d1 implements InterfaceC0084r0 {
    public File A;
    public int E;
    public Date G;
    public Map K;
    public io.sentry.protocol.t D = new io.sentry.protocol.t((UUID) null);
    public String B = "replay_event";
    public J1 C = J1.SESSION;
    public List I = new ArrayList();
    public List J = new ArrayList();
    public List H = new ArrayList();
    public Date F = io.sentry.config.a.j();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K1.class != obj.getClass()) {
            return false;
        }
        K1 k1 = (K1) obj;
        return this.E == k1.E && io.sentry.config.a.e(this.B, k1.B) && this.C == k1.C && io.sentry.config.a.e(this.D, k1.D) && io.sentry.config.a.e(this.H, k1.H) && io.sentry.config.a.e(this.I, k1.I) && io.sentry.config.a.e(this.J, k1.J);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.B, this.C, this.D, Integer.valueOf(this.E), this.H, this.I, this.J});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("type");
        cVar.m(this.B);
        cVar.f("replay_type");
        cVar.j(iLogger, this.C);
        cVar.f("segment_id");
        cVar.i(this.E);
        cVar.f("timestamp");
        cVar.j(iLogger, this.F);
        if (this.D != null) {
            cVar.f("replay_id");
            cVar.j(iLogger, this.D);
        }
        if (this.G != null) {
            cVar.f("replay_start_timestamp");
            cVar.j(iLogger, this.G);
        }
        if (this.H != null) {
            cVar.f("urls");
            cVar.j(iLogger, this.H);
        }
        if (this.I != null) {
            cVar.f("error_ids");
            cVar.j(iLogger, this.I);
        }
        if (this.J != null) {
            cVar.f("trace_ids");
            cVar.j(iLogger, this.J);
        }
        io.sentry.config.a.D(this, cVar, iLogger);
        Map map = this.K;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.K, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
