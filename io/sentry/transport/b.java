package io.sentry.transport;

import io.sentry.C0055j1;
import io.sentry.C0088s1;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {
    public final C0088s1 l;
    public final C0104y m;
    public final io.sentry.cache.d n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f148o = new o(-1);
    public final /* synthetic */ c p;

    public b(c cVar, C0088s1 c0088s1, C0104y c0104y, io.sentry.cache.d dVar) {
        this.p = cVar;
        io.sentry.config.a.C(c0088s1, "Envelope is required.");
        this.l = c0088s1;
        this.m = c0104y;
        io.sentry.config.a.C(dVar, "EnvelopeCache is required.");
        this.n = dVar;
    }

    public static /* synthetic */ void a(b bVar, io.sentry.config.a aVar, io.sentry.hints.j jVar) {
        bVar.p.n.getLogger().h(EnumC0094u1.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(aVar.w()));
        jVar.b(aVar.w());
    }

    public final io.sentry.config.a b() {
        C0088s1 c0088s1 = this.l;
        ((C0055j1) c0088s1.l).f115o = null;
        io.sentry.cache.d dVar = this.n;
        C0104y c0104y = this.m;
        dVar.b(c0088s1, c0104y);
        Object objQ = io.sentry.config.a.q(c0104y);
        boolean zIsInstance = io.sentry.hints.c.class.isInstance(io.sentry.config.a.q(c0104y));
        c cVar = this.p;
        if (zIsInstance && objQ != null) {
            io.sentry.hints.c cVar2 = (io.sentry.hints.c) objQ;
            if (cVar2.e(((C0055j1) c0088s1.l).l)) {
                cVar2.l.countDown();
                cVar.n.getLogger().h(EnumC0094u1.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                cVar.n.getLogger().h(EnumC0094u1.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        boolean zA = cVar.p.a();
        I1 i1 = cVar.n;
        if (!zA) {
            Object objQ2 = io.sentry.config.a.q(c0104y);
            if (!io.sentry.hints.g.class.isInstance(io.sentry.config.a.q(c0104y)) || objQ2 == null) {
                io.sentry.config.a.y(io.sentry.hints.g.class, objQ2, i1.getLogger());
                i1.getClientReportRecorder().e(io.sentry.clientreport.d.NETWORK_ERROR, c0088s1);
            } else {
                ((io.sentry.hints.g) objQ2).e(true);
            }
            return this.f148o;
        }
        C0088s1 c0088s1A = i1.getClientReportRecorder().a(c0088s1);
        try {
            ((C0055j1) c0088s1A.l).f115o = io.sentry.config.a.k(Double.valueOf(i1.getDateProvider().y().d() / 1000000.0d).longValue());
            io.sentry.config.a aVarD = cVar.q.d(c0088s1A);
            if (aVarD.w()) {
                dVar.c(c0088s1);
                return aVarD;
            }
            String str = "The transport failed to send the envelope with response code " + aVarD.p();
            i1.getLogger().h(EnumC0094u1.ERROR, str, new Object[0]);
            if (aVarD.p() >= 400 && aVarD.p() != 429) {
                Object objQ3 = io.sentry.config.a.q(c0104y);
                if (!io.sentry.hints.g.class.isInstance(io.sentry.config.a.q(c0104y)) || objQ3 == null) {
                    i1.getClientReportRecorder().e(io.sentry.clientreport.d.NETWORK_ERROR, c0088s1A);
                }
            }
            throw new IllegalStateException(str);
        } catch (IOException e) {
            Object objQ4 = io.sentry.config.a.q(c0104y);
            if (!io.sentry.hints.g.class.isInstance(io.sentry.config.a.q(c0104y)) || objQ4 == null) {
                io.sentry.config.a.y(io.sentry.hints.g.class, objQ4, i1.getLogger());
                i1.getClientReportRecorder().e(io.sentry.clientreport.d.NETWORK_ERROR, c0088s1A);
            } else {
                ((io.sentry.hints.g) objQ4).e(true);
            }
            throw new IllegalStateException("Sending the event failed.", e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.r = this;
        io.sentry.config.a aVarB = this.f148o;
        try {
            aVarB = b();
            this.p.n.getLogger().h(EnumC0094u1.DEBUG, "Envelope flushed", new Object[0]);
            C0104y c0104y = this.m;
            Object objQ = io.sentry.config.a.q(c0104y);
            if (io.sentry.hints.j.class.isInstance(io.sentry.config.a.q(c0104y)) && objQ != null) {
                a(this, aVarB, (io.sentry.hints.j) objQ);
            }
            this.p.r = null;
        } catch (Throwable th) {
            try {
                this.p.n.getLogger().s(EnumC0094u1.ERROR, th, "Envelope submission failed", new Object[0]);
                throw th;
            } catch (Throwable th2) {
                C0104y c0104y2 = this.m;
                Object objQ2 = io.sentry.config.a.q(c0104y2);
                if (io.sentry.hints.j.class.isInstance(io.sentry.config.a.q(c0104y2)) && objQ2 != null) {
                    a(this, aVarB, (io.sentry.hints.j) objQ2);
                }
                this.p.r = null;
                throw th2;
            }
        }
    }
}
