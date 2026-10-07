package o;

/* JADX INFO: renamed from: o.ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1990ke extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1990ke(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1990ke) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1990ke(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        C1387eR c1387eR = (C1387eR) C2379oe.j.get(this.m);
        if (c1387eR != null) {
            return c1387eR;
        }
        Boolean bool = Boolean.TRUE;
        return new C1387eR(this.m, "Evento en vivo", null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3327yN.z(new C1101bX("is_tv_channel", bool), new C1101bX("is_live_channel", bool)), 16380);
    }
}
