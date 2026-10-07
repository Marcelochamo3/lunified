package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class S1 implements InterfaceC0084r0 {
    public Map A;
    public final Date l;
    public Date m;
    public final AtomicInteger n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f53o;
    public final UUID p;
    public Boolean q;
    public R1 r;
    public Long s;
    public Double t;
    public final String u;
    public String v;
    public final String w;
    public final String x;
    public String y;
    public final Object z = new Object();

    public S1(R1 r1, Date date, Date date2, int i, String str, UUID uuid, Boolean bool, Long l, Double d, String str2, String str3, String str4, String str5, String str6) {
        this.r = r1;
        this.l = date;
        this.m = date2;
        this.n = new AtomicInteger(i);
        this.f53o = str;
        this.p = uuid;
        this.q = bool;
        this.s = l;
        this.t = d;
        this.u = str2;
        this.v = str3;
        this.w = str4;
        this.x = str5;
        this.y = str6;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S1 clone() {
        return new S1(this.r, this.l, this.m, this.n.get(), this.f53o, this.p, this.q, this.s, this.t, this.u, this.v, this.w, this.x, this.y);
    }

    public final void b(Date date) {
        synchronized (this.z) {
            try {
                this.q = null;
                if (this.r == R1.Ok) {
                    this.r = R1.Exited;
                }
                if (date != null) {
                    this.m = date;
                } else {
                    this.m = io.sentry.config.a.j();
                }
                Date date2 = this.m;
                if (date2 != null) {
                    this.t = Double.valueOf(Math.abs(date2.getTime() - this.l.getTime()) / 1000.0d);
                    long time = this.m.getTime();
                    if (time < 0) {
                        time = Math.abs(time);
                    }
                    this.s = Long.valueOf(time);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(R1 r1, String str, boolean z, String str2) {
        boolean z2;
        boolean z3;
        synchronized (this.z) {
            z2 = true;
            if (r1 != null) {
                try {
                    this.r = r1;
                    z3 = true;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z3 = false;
            }
            if (str != null) {
                this.v = str;
                z3 = true;
            }
            if (z) {
                this.n.addAndGet(1);
                z3 = true;
            }
            if (str2 != null) {
                this.y = str2;
            } else {
                z2 = z3;
            }
            if (z2) {
                this.q = null;
                Date dateJ = io.sentry.config.a.j();
                this.m = dateJ;
                if (dateJ != null) {
                    long time = dateJ.getTime();
                    if (time < 0) {
                        time = Math.abs(time);
                    }
                    this.s = Long.valueOf(time);
                }
            }
        }
        return z2;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        UUID uuid = this.p;
        if (uuid != null) {
            cVar.f("sid");
            cVar.m(uuid.toString());
        }
        String str = this.f53o;
        if (str != null) {
            cVar.f("did");
            cVar.m(str);
        }
        if (this.q != null) {
            cVar.f("init");
            cVar.k(this.q);
        }
        cVar.f("started");
        cVar.j(iLogger, this.l);
        cVar.f("status");
        cVar.j(iLogger, this.r.name().toLowerCase(Locale.ROOT));
        if (this.s != null) {
            cVar.f("seq");
            cVar.l(this.s);
        }
        cVar.f("errors");
        cVar.i(this.n.intValue());
        if (this.t != null) {
            cVar.f("duration");
            cVar.l(this.t);
        }
        if (this.m != null) {
            cVar.f("timestamp");
            cVar.j(iLogger, this.m);
        }
        if (this.y != null) {
            cVar.f("abnormal_mechanism");
            cVar.j(iLogger, this.y);
        }
        cVar.f("attrs");
        cVar.b();
        cVar.f("release");
        cVar.j(iLogger, this.x);
        String str2 = this.w;
        if (str2 != null) {
            cVar.f("environment");
            cVar.j(iLogger, str2);
        }
        String str3 = this.u;
        if (str3 != null) {
            cVar.f("ip_address");
            cVar.j(iLogger, str3);
        }
        if (this.v != null) {
            cVar.f("user_agent");
            cVar.j(iLogger, this.v);
        }
        cVar.c();
        Map map = this.A;
        if (map != null) {
            for (String str4 : map.keySet()) {
                AbstractC0035d.c(this.A, str4, cVar, str4, iLogger);
            }
        }
        cVar.c();
    }
}
