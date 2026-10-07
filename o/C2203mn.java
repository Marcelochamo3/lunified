package o;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: o.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2203mn implements InterfaceC2300nn {
    public final Future l;

    public C2203mn(ScheduledFuture scheduledFuture) {
        this.l = scheduledFuture;
    }

    @Override // o.InterfaceC2300nn
    public final void d() {
        this.l.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.l + ']';
    }
}
