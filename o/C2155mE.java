package o;

/* JADX INFO: renamed from: o.mE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2155mE extends AbstractC2252nE {
    public final InterfaceC0673Pa d;
    public final boolean e;

    public C2155mE(C3212x70 c3212x70, InterfaceC0595Ma interfaceC0595Ma, InterfaceC0602Mh interfaceC0602Mh, InterfaceC0673Pa interfaceC0673Pa, boolean z) {
        super(c3212x70, interfaceC0595Ma, interfaceC0602Mh);
        this.d = interfaceC0673Pa;
        this.e = z;
    }

    @Override // o.AbstractC2252nE
    public final Object a(MV mv, Object[] objArr) {
        InterfaceC0621Na interfaceC0621Na = (InterfaceC0621Na) this.d.l(mv);
        InterfaceC0473Hh interfaceC0473Hh = (InterfaceC0473Hh) objArr[objArr.length - 1];
        try {
            if (!this.e) {
                return AbstractC1376eG.d(interfaceC0621Na, interfaceC0473Hh);
            }
            AbstractC1474fG.h(interfaceC0621Na, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            C1692hb c1692hb = new C1692hb(1, Ou0.p(interfaceC0473Hh));
            c1692hb.y();
            c1692hb.A(new KI(interfaceC0621Na, 1));
            interfaceC0621Na.f(new LI(c1692hb, 1));
            return c1692hb.x();
        } catch (LinkageError e) {
            throw e;
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (VirtualMachineError e3) {
            throw e3;
        } catch (Throwable th) {
            AbstractC1376eG.F(th, interfaceC0473Hh);
            return EnumC1706hi.l;
        }
    }
}
