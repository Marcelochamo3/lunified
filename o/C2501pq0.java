package o;

/* JADX INFO: renamed from: o.pq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2501pq0 extends AbstractC1217ci {
    public static final /* synthetic */ int n = 0;

    static {
        new C2501pq0();
    }

    @Override // o.AbstractC1217ci
    public final void W(InterfaceC1022ai interfaceC1022ai, Runnable runnable) {
        C1445ey0 c1445ey0 = (C1445ey0) interfaceC1022ai.q(C1445ey0.n);
        if (c1445ey0 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c1445ey0.m = true;
    }

    @Override // o.AbstractC1217ci
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
