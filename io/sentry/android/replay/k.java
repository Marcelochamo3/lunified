package io.sentry.android.replay;

import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.RunnableC0059l;
import io.sentry.U1;
import io.sentry.V0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b2;
import io.sentry.protocol.C0074a;
import io.sentry.protocol.C0076c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import o.AbstractC0911Ye;
import o.AbstractC1119bh0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends V0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static Object h(SentryAndroidOptions sentryAndroidOptions, String str, Class cls) {
        return io.sentry.cache.a.b(sentryAndroidOptions, ".scope-cache", str, cls, null);
    }

    @Override // io.sentry.V0, io.sentry.S
    public void a(U1 u1) {
        switch (this.a) {
            case 1:
                i(new RunnableC0059l(this, 11, u1));
                break;
        }
    }

    @Override // io.sentry.V0, io.sentry.S
    public void b(String str) {
        switch (this.a) {
            case 1:
                i(new RunnableC0059l(this, 9, str));
                break;
        }
    }

    @Override // io.sentry.V0, io.sentry.S
    public void c(ConcurrentHashMap concurrentHashMap) {
        switch (this.a) {
            case 1:
                i(new RunnableC0059l(this, 10, concurrentHashMap));
                break;
        }
    }

    @Override // io.sentry.V0, io.sentry.S
    public final void e(C0076c c0076c) {
        List list;
        String str;
        switch (this.a) {
            case 0:
                io.sentry.android.replay.capture.g gVar = ((ReplayIntegration) this.b).s;
                if (gVar != null) {
                    C0074a c0074a = (C0074a) c0076c.d("app", C0074a.class);
                    gVar.e((c0074a == null || (list = c0074a.t) == null || (str = (String) AbstractC0911Ye.j0(list)) == null) ? null : AbstractC1119bh0.y0(str, '.', str));
                }
                break;
            default:
                i(new RunnableC0059l(this, 14, c0076c));
                break;
        }
    }

    @Override // io.sentry.V0, io.sentry.S
    public void g(b2 b2Var) {
        switch (this.a) {
            case 1:
                i(new RunnableC0059l(this, 12, b2Var));
                break;
        }
    }

    public void i(Runnable runnable) {
        I1 i1 = (I1) this.b;
        try {
            i1.getExecutorService().submit(new RunnableC0059l(this, 13, runnable));
        } catch (Throwable th) {
            i1.getLogger().v(EnumC0094u1.ERROR, "Serialization task could not be scheduled", th);
        }
    }
}
