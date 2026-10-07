package io.sentry.android.replay.capture;

import io.sentry.Q;
import io.sentry.U0;
import io.sentry.protocol.t;
import o.AbstractC1474fG;
import o.C1101bX;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements U0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ m m;

    public /* synthetic */ h(m mVar, int i) {
        this.l = i;
        this.m = mVar;
    }

    @Override // io.sentry.U0
    public final void c(Q q) {
        switch (this.l) {
            case 0:
                m mVar = this.m;
                AbstractC1474fG.j(mVar, "this$0");
                AbstractC1474fG.j(q, "it");
                q.y((t) mVar.j.get());
                return;
            default:
                m mVar2 = this.m;
                AbstractC1474fG.j(mVar2, "this$0");
                AbstractC1474fG.j(q, "it");
                String strL = q.l();
                if (strL != null) {
                    synchronized (mVar2.w) {
                        mVar2.x.add(new C1101bX(strL, Long.valueOf(mVar2.t.b())));
                    }
                    return;
                }
                return;
        }
    }
}
