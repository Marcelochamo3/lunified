package o;

/* JADX INFO: renamed from: o.lE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2058lE extends AbstractC2252nE {
    public final /* synthetic */ int d;
    public final InterfaceC0673Pa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2058lE(C3212x70 c3212x70, InterfaceC0595Ma interfaceC0595Ma, InterfaceC0602Mh interfaceC0602Mh, InterfaceC0673Pa interfaceC0673Pa, int i) {
        super(c3212x70, interfaceC0595Ma, interfaceC0602Mh);
        this.d = i;
        this.e = interfaceC0673Pa;
    }

    @Override // o.AbstractC2252nE
    public final Object a(MV mv, Object[] objArr) {
        switch (this.d) {
            case 0:
                return this.e.l(mv);
            default:
                InterfaceC0621Na interfaceC0621Na = (InterfaceC0621Na) this.e.l(mv);
                InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) objArr[objArr.length - 1];
                try {
                    C1692hb c1692hb = new C1692hb(1, Ou0.p(interfaceC0473Hh));
                    c1692hb.y();
                    c1692hb.A(new KI(interfaceC0621Na, 2));
                    interfaceC0621Na.f(new LI(c1692hb, 2));
                    return c1692hb.x();
                } catch (Exception e) {
                    AbstractC1376eG.F(e, interfaceC0473Hh);
                    return EnumC1706hi.l;
                }
        }
    }
}
