package o;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0841Vm implements Callable {
    public final /* synthetic */ C1325dn a;

    public CallableC0841Vm(C1325dn c1325dn) {
        this.a = c1325dn;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.a) {
            try {
                C1325dn c1325dn = this.a;
                if (c1325dn.t == null) {
                    return null;
                }
                c1325dn.Z();
                if (this.a.t()) {
                    this.a.X();
                    this.a.v = 0;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
