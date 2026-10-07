package io.sentry;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class O1 extends TimerTask {
    public final /* synthetic */ int l;
    public final /* synthetic */ Q1 m;

    public /* synthetic */ O1(Q1 q1, int i) {
        this.l = i;
        this.m = q1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                Q1 q1 = this.m;
                Y1 y1M = q1.m();
                if (y1M == null) {
                    y1M = Y1.OK;
                }
                q1.o(y1M, null);
                q1.k.set(false);
                break;
            default:
                Q1 q2 = this.m;
                Y1 y1M2 = q2.m();
                if (y1M2 == null) {
                    y1M2 = Y1.DEADLINE_EXCEEDED;
                }
                q2.f(y1M2, q2.r.e != null, null);
                q2.l.set(false);
                break;
        }
    }
}
