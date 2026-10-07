package o;

/* JADX INFO: loaded from: classes.dex */
public final class GI extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GI(int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((GI) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new GI(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        try {
            JI ji = JI.b;
            return JI.r(JI.u("/tv/popular", new C1101bX("page", String.valueOf(this.m))));
        } catch (Exception e) {
            e.getMessage();
            return C1233cq.l;
        }
    }
}
