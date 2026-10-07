package o;

/* JADX INFO: renamed from: o.n90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2247n90 extends AbstractC0499Ih implements InterfaceC1734hw {
    public final InterfaceC1734hw l;
    public final InterfaceC1022ai m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1022ai f932o;
    public InterfaceC0473Hh p;

    public C2247n90(InterfaceC1734hw interfaceC1734hw, InterfaceC1022ai interfaceC1022ai) {
        super(C0652Of.n, C1038aq.l);
        this.l = interfaceC1734hw;
        this.m = interfaceC1022ai;
        this.n = ((Number) interfaceC1022ai.l(0, C2478pf.r)).intValue();
    }

    @Override // o.R7, o.InterfaceC1803ii
    public final InterfaceC1803ii d() {
        InterfaceC0473Hh interfaceC0473Hh = this.p;
        if (interfaceC0473Hh instanceof InterfaceC1803ii) {
            return (InterfaceC1803ii) interfaceC0473Hh;
        }
        return null;
    }

    @Override // o.AbstractC0499Ih, o.InterfaceC0473Hh
    public final InterfaceC1022ai g() {
        InterfaceC1022ai interfaceC1022ai = this.f932o;
        return interfaceC1022ai == null ? C1038aq.l : interfaceC1022ai;
    }

    @Override // o.InterfaceC1734hw
    public final Object l(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        try {
            Object objW = w(interfaceC0473Hh, obj);
            return objW == EnumC1706hi.l ? objW : C2985uq0.a;
        } catch (Throwable th) {
            this.f932o = new C2108lo(interfaceC0473Hh.g(), th);
            throw th;
        }
    }

    @Override // o.R7
    public final StackTraceElement q() {
        return null;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Throwable thA = C2536q80.a(obj);
        if (thA != null) {
            this.f932o = new C2108lo(g(), thA);
        }
        InterfaceC0473Hh interfaceC0473Hh = this.p;
        if (interfaceC0473Hh != null) {
            interfaceC0473Hh.j(obj);
        }
        return EnumC1706hi.l;
    }

    @Override // o.AbstractC0499Ih, o.R7
    public final void t() {
        super.t();
    }

    public final Object w(InterfaceC0473Hh interfaceC0473Hh, Object obj) {
        InterfaceC1022ai interfaceC1022aiG = interfaceC0473Hh.g();
        AbstractC3409z9.l(interfaceC1022aiG);
        InterfaceC1022ai interfaceC1022ai = this.f932o;
        if (interfaceC1022ai != interfaceC1022aiG) {
            if (interfaceC1022ai instanceof C2108lo) {
                throw new IllegalStateException(AbstractC1216ch0.G("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C2108lo) interfaceC1022ai).l + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) interfaceC1022aiG.l(0, new io.sentry.android.replay.j(1, this))).intValue() != this.n) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.m + ",\n\t\tbut emission happened in " + interfaceC1022aiG + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f932o = interfaceC1022aiG;
        }
        this.p = interfaceC0473Hh;
        InterfaceC0827Uy interfaceC0827Uy = AbstractC2441p90.a;
        InterfaceC1734hw interfaceC1734hw = this.l;
        AbstractC1474fG.h(interfaceC1734hw, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objF = interfaceC0827Uy.f(interfaceC1734hw, obj, this);
        if (!AbstractC1474fG.b(objF, EnumC1706hi.l)) {
            this.p = null;
        }
        return objF;
    }
}
