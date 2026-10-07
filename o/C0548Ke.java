package o;

/* JADX INFO: renamed from: o.Ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0548Ke implements AutoCloseable, InterfaceC1608gi {
    public final InterfaceC1022ai l;

    public C0548Ke(InterfaceC1022ai interfaceC1022ai) {
        AbstractC1474fG.j(interfaceC1022ai, "coroutineContext");
        this.l = interfaceC1022ai;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AH ah = (AH) this.l.q(C2691rp.v);
        if (ah != null) {
            ah.f(null);
        }
    }

    @Override // o.InterfaceC1608gi
    public final InterfaceC1022ai t() {
        return this.l;
    }
}
