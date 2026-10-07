package o;

/* JADX INFO: renamed from: o.sq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2791sq0 extends R90 {
    public final ThreadLocal p;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2791sq0(InterfaceC0473Hh interfaceC0473Hh, InterfaceC1022ai interfaceC1022ai) {
        C2888tq0 c2888tq0 = C2888tq0.l;
        super(interfaceC0473Hh, interfaceC1022ai.q(c2888tq0) == null ? interfaceC1022ai.Q(c2888tq0) : interfaceC1022ai);
        this.p = new ThreadLocal();
        if (interfaceC0473Hh.g().q(C2691rp.p) instanceof AbstractC1217ci) {
            return;
        }
        Object objI = Ou0.I(interfaceC1022ai, null);
        Ou0.y(interfaceC1022ai, objI);
        m0(interfaceC1022ai, objI);
    }

    public final boolean l0() {
        boolean z = this.threadLocalIsSet && this.p.get() == null;
        this.p.remove();
        return !z;
    }

    public final void m0(InterfaceC1022ai interfaceC1022ai, Object obj) {
        this.threadLocalIsSet = true;
        this.p.set(new C1101bX(interfaceC1022ai, obj));
    }

    @Override // o.R90, o.JH
    public final void x(Object obj) {
        if (this.threadLocalIsSet) {
            C1101bX c1101bX = (C1101bX) this.p.get();
            if (c1101bX != null) {
                Ou0.y((InterfaceC1022ai) c1101bX.l, c1101bX.m);
            }
            this.p.remove();
        }
        Object objV = AP.v(obj);
        InterfaceC0473Hh interfaceC0473Hh = this.f482o;
        InterfaceC1022ai interfaceC1022aiG = interfaceC0473Hh.g();
        Object objI = Ou0.I(interfaceC1022aiG, null);
        C2791sq0 c2791sq0K = objI != Ou0.f ? AbstractC1923jt0.K(interfaceC0473Hh, interfaceC1022aiG, objI) : null;
        try {
            this.f482o.j(objV);
        } finally {
            if (c2791sq0K == null || c2791sq0K.l0()) {
                Ou0.y(interfaceC1022aiG, objI);
            }
        }
    }
}
