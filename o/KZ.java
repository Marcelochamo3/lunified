package o;

import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: loaded from: classes.dex */
public final class KZ extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ PlayerMobileFragment m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KZ(PlayerMobileFragment playerMobileFragment, long j, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = playerMobileFragment;
        this.n = j;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        KZ kz = (KZ) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2);
        C2985uq0 c2985uq0 = C2985uq0.a;
        kz.r(c2985uq0);
        return c2985uq0;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new KZ(this.m, this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        C1042as c1042as = this.m.y0;
        if (c1042as != null) {
            c1042as.l(5, this.n);
            return C2985uq0.a;
        }
        AbstractC1474fG.U("player");
        throw null;
    }
}
