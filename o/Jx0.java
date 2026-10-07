package o;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Jx0 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ Ds0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jx0(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Jx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Jx0(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        ConcurrentHashMap concurrentHashMap = Lx0.k;
        Ds0 ds0 = this.m;
        Js0 js0 = (Js0) concurrentHashMap.get(ds0.l);
        if (js0 == null && (js0 = ds0.r) == null) {
            String str = ds0.n;
            String str2 = AbstractC1899jh0.O(str) ^ true ? str : null;
            js0 = str2 != null ? new Js0(str2, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) null, false, 4094) : null;
            if (js0 == null) {
                throw new IllegalStateException("Servidor de reproducción sin URL");
            }
        }
        return js0;
    }
}
