package io.sentry;

import io.sentry.android.core.C0028z;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: io.sentry.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0039e0 implements InterfaceC0048h0, U0, S0, Q0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ C0039e0(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    @Override // io.sentry.Q0
    public void a(L0 l0) {
        C0032c c0032c = (C0032c) l0.e;
        I1 i1 = (I1) this.m;
        if (c0032c == null) {
            c0032c = new C0032c(i1.getLogger());
            l0.e = c0032c;
        }
        if (c0032c.b) {
            Q q = (Q) this.n;
            L0 l0V = q.v();
            io.sentry.protocol.E eS = q.s();
            io.sentry.protocol.t tVarU = q.u();
            c0032c.u("sentry-trace_id", ((io.sentry.protocol.t) l0V.a).toString());
            c0032c.u("sentry-public_key", (String) new r(i1.getDsn()).b);
            c0032c.u("sentry-release", i1.getRelease());
            c0032c.u("sentry-environment", i1.getEnvironment());
            if (!io.sentry.protocol.t.m.equals(tVarU)) {
                c0032c.u("sentry-replay_id", tVarU.toString());
            }
            c0032c.u("sentry-user_segment", eS != null ? C0032c.p(eS) : null);
            c0032c.u("sentry-transaction", null);
            c0032c.u("sentry-sample_rate", null);
            c0032c.u("sentry-sampled", null);
            c0032c.b = false;
        }
    }

    @Override // io.sentry.S0
    public void b(W w) {
        switch (this.l) {
            case 2:
                Q1 q1 = (Q1) this.m;
                q1.getClass();
                if (w == q1) {
                    ((Q) this.n).g();
                }
                break;
            case 3:
                if (w == ((W) this.m)) {
                    ((Q) this.n).g();
                }
                break;
            default:
                if (w == ((io.sentry.android.core.internal.gestures.f) this.m).p) {
                    ((Q) this.n).g();
                }
                break;
        }
    }

    @Override // io.sentry.U0
    public void c(Q q) {
        switch (this.l) {
            case 1:
                ((AtomicReference) this.m).set(q.s());
                ((AtomicReference) this.n).set(q.u());
                break;
            default:
                io.sentry.android.core.internal.gestures.f fVar = (io.sentry.android.core.internal.gestures.f) this.m;
                fVar.getClass();
                q.n(new C0040e1(fVar, q, (W) this.n));
                break;
        }
    }

    public void d(Object obj) {
        io.sentry.android.core.cache.a aVar = (io.sentry.android.core.cache.a) this.m;
        aVar.getClass();
        Long lValueOf = Long.valueOf(((C0028z) obj).f87o);
        ILogger logger = ((SentryAndroidOptions) this.n).getLogger();
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        logger.h(enumC0094u1, "Writing last reported ANR marker with timestamp %d", lValueOf);
        I1 i1 = aVar.l;
        String cacheDirPath = i1.getCacheDirPath();
        if (cacheDirPath == null) {
            i1.getLogger().h(enumC0094u1, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(lValueOf).getBytes(io.sentry.cache.c.r));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            i1.getLogger().v(EnumC0094u1.ERROR, "Error writing the ANR marker to the disk", th3);
        }
    }

    @Override // io.sentry.InterfaceC0048h0
    public Object e() {
        C0069o0 c0069o0 = (C0069o0) this.n;
        ((C0066n0) this.m).getClass();
        try {
            try {
                return Integer.valueOf(((io.sentry.vendor.gson.stream.a) c0069o0.m).Y());
            } catch (Exception unused) {
                return Long.valueOf(((io.sentry.vendor.gson.stream.a) c0069o0.m).Z());
            }
        } catch (Exception unused2) {
            return Double.valueOf(((io.sentry.vendor.gson.stream.a) c0069o0.m).X());
        }
    }
}
