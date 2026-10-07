package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;

/* JADX INFO: renamed from: io.sentry.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0062m extends TimerTask {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ C0062m(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                Iterator it = ((C0065n) this.m).f117o.iterator();
                while (it.hasNext()) {
                    ((P) it.next()).b();
                }
                break;
            case 1:
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0065n c0065n = (C0065n) this.m;
                if (jCurrentTimeMillis - c0065n.t >= 10) {
                    c0065n.t = jCurrentTimeMillis;
                    H0 h0 = new H0();
                    h0.a = null;
                    h0.b = null;
                    Iterator it2 = c0065n.f117o.iterator();
                    while (it2.hasNext()) {
                        ((P) it2.next()).a(h0);
                    }
                    Iterator it3 = c0065n.n.values().iterator();
                    while (it3.hasNext()) {
                        ((List) it3.next()).add(h0);
                    }
                    break;
                }
                break;
            default:
                io.sentry.android.core.S s = (io.sentry.android.core.S) this.m;
                boolean z = s.s;
                K k = s.r;
                if (z) {
                    C0041f c0041f = new C0041f();
                    c0041f.n = "session";
                    c0041f.b("end", "state");
                    c0041f.p = "app.lifecycle";
                    c0041f.q = EnumC0094u1.INFO;
                    k.f(c0041f);
                    k.h();
                }
                k.t().getReplayController().stop();
                break;
        }
    }
}
