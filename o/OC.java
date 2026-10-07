package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OC extends Ph0 implements InterfaceC0827Uy {
    public /* synthetic */ List m;
    public /* synthetic */ List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ RC f429o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OC(RC rc, InterfaceC0473Hh interfaceC0473Hh) {
        super(3, interfaceC0473Hh);
        this.f429o = rc;
    }

    @Override // o.InterfaceC0827Uy
    public final Object f(Object obj, Object obj2, Object obj3) {
        OC oc = new OC(this.f429o, (InterfaceC0473Hh) obj3);
        oc.m = (List) obj;
        oc.n = (List) obj2;
        return oc.r(C2985uq0.a);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        List list = this.m;
        List<C0456Gq> list2 = this.n;
        for (C0456Gq c0456Gq : list2) {
            C2109lo0 c2109lo0 = c0456Gq.e;
            Ma0 ma0X = null;
            RC rc = this.f429o;
            c0456Gq.e = c2109lo0 != null ? rc.b.r().f(c2109lo0.a) : null;
            Ma0 ma0 = c0456Gq.f;
            if (ma0 != null) {
                ma0X = rc.b.q().x(ma0.a);
            }
            c0456Gq.f = ma0X;
        }
        return AbstractC0911Ye.m0(list, list2);
    }
}
