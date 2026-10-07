package o;

/* JADX INFO: renamed from: o.Pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0675Pc extends AbstractC0520Jc {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC1538fw f457o;
    public final InterfaceC0827Uy p;

    public C0675Pc(InterfaceC0827Uy interfaceC0827Uy, C2771sg0 c2771sg0) {
        super(C1038aq.l, -2, 1);
        this.f457o = c2771sg0;
        this.p = interfaceC0827Uy;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // o.AbstractC0520Jc, o.InterfaceC1538fw
    public final Object a(InterfaceC1734hw interfaceC1734hw, InterfaceC0473Hh interfaceC0473Hh) {
        Object objA;
        C2985uq0 c2985uq0 = C2985uq0.a;
        int i = this.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        if (i == -3) {
            InterfaceC1022ai interfaceC1022aiG = interfaceC0473Hh.g();
            Boolean bool = Boolean.FALSE;
            C2478pf c2478pf = C2478pf.q;
            InterfaceC1022ai interfaceC1022ai = this.l;
            InterfaceC1022ai interfaceC1022aiQ = !((Boolean) interfaceC1022ai.l(bool, c2478pf)).booleanValue() ? interfaceC1022aiG.Q(interfaceC1022ai) : AbstractC1923jt0.l(interfaceC1022aiG, interfaceC1022ai, false);
            if (AbstractC1474fG.b(interfaceC1022aiQ, interfaceC1022aiG)) {
                objA = e(interfaceC1734hw, interfaceC0473Hh);
                if (objA != enumC1706hi) {
                    return c2985uq0;
                }
            } else {
                C2691rp c2691rp = C2691rp.p;
                if (AbstractC1474fG.b(interfaceC1022aiQ.q(c2691rp), interfaceC1022aiG.q(c2691rp))) {
                    InterfaceC1022ai interfaceC1022aiG2 = interfaceC0473Hh.g();
                    if (!(interfaceC1734hw instanceof Qb0)) {
                        interfaceC1734hw = new C2694rq0(interfaceC1734hw, interfaceC1022aiG2);
                    }
                    objA = zy0.D(interfaceC1022aiQ, interfaceC1734hw, Ou0.G(interfaceC1022aiQ), new C0546Kc(this, null), interfaceC0473Hh);
                    if (objA != enumC1706hi) {
                        objA = c2985uq0;
                    }
                    if (objA != enumC1706hi) {
                        return c2985uq0;
                    }
                } else {
                    objA = super.a(interfaceC1734hw, interfaceC0473Hh);
                    if (objA != enumC1706hi) {
                        return c2985uq0;
                    }
                }
            }
        } else {
            objA = super.a(interfaceC1734hw, interfaceC0473Hh);
            if (objA != enumC1706hi) {
                return c2985uq0;
            }
        }
        return objA;
    }

    @Override // o.AbstractC0520Jc
    public final Object c(InterfaceC2622r30 interfaceC2622r30, InterfaceC0473Hh interfaceC0473Hh) {
        Object objE = e(new Qb0(interfaceC2622r30), interfaceC0473Hh);
        return objE == EnumC1706hi.l ? objE : C2985uq0.a;
    }

    public final Object e(InterfaceC1734hw interfaceC1734hw, InterfaceC0473Hh interfaceC0473Hh) {
        Object objN = zy0.n(new C0649Oc(this, interfaceC1734hw, null), interfaceC0473Hh);
        return objN == EnumC1706hi.l ? objN : C2985uq0.a;
    }

    @Override // o.AbstractC0520Jc
    public final String toString() {
        return this.f457o + " -> " + super.toString();
    }
}
