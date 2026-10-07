package io.sentry.android.core;

import io.sentry.C0039e0;
import io.sentry.L0;
import io.sentry.Q0;
import io.sentry.S1;
import io.sentry.U0;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import o.AbstractC1474fG;

/* JADX INFO: renamed from: io.sentry.android.core.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0008e implements U0, Q0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ C0008e(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // io.sentry.Q0
    public void a(L0 l0) {
        ((io.sentry.Q) this.m).D(new L0());
    }

    @Override // io.sentry.U0
    public void c(io.sentry.Q q) {
        S1 s1Q;
        switch (this.l) {
            case 0:
                q.A((String) this.m);
                break;
            case 1:
                S s = (S) this.m;
                AtomicLong atomicLong = s.l;
                if (atomicLong.get() == 0 && (s1Q = q.q()) != null) {
                    Date date = s1Q.l;
                    if ((date == null ? null : (Date) date.clone()) != null) {
                        atomicLong.set((date != null ? (Date) date.clone() : null).getTime());
                        s.m.set(true);
                    }
                    break;
                }
                break;
            case 2:
                S1 s1Q2 = q.q();
                if (s1Q2 != null) {
                    Date date2 = s1Q2.l;
                    if ((date2 == null ? null : (Date) date2.clone()) != null) {
                        ((AtomicBoolean) this.m).set(true);
                    }
                }
                break;
            case 3:
                io.sentry.android.core.internal.gestures.f fVar = (io.sentry.android.core.internal.gestures.f) this.m;
                fVar.getClass();
                q.n(new C0039e0(fVar, 6, q));
                break;
            default:
                io.sentry.android.replay.capture.p pVar = (io.sentry.android.replay.capture.p) this.m;
                AbstractC1474fG.j(pVar, "this$0");
                AbstractC1474fG.j(q, "it");
                q.y((io.sentry.protocol.t) pVar.j.get());
                pVar.i.set(q.l());
                break;
        }
    }
}
