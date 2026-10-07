package o;

import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: loaded from: classes.dex */
public final class YZ extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PlayerMobileFragment f638o;
    public final /* synthetic */ Ds0 p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YZ(long j, PlayerMobileFragment playerMobileFragment, Ds0 ds0, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = j;
        this.f638o = playerMobileFragment;
        this.p = ds0;
        this.q = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((YZ) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new YZ(this.n, this.f638o, this.p, this.q, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            this.m = 1;
            if (AbstractC1376eG.q(this.n, this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        PlayerMobileFragment playerMobileFragment = this.f638o;
        playerMobileFragment.G0 = null;
        boolean zT = playerMobileFragment.t();
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (zT && playerMobileFragment.u0 != null && playerMobileFragment.y0 != null) {
            Ds0 ds0 = this.p;
            if (ds0 != null) {
                Ds0 ds1 = playerMobileFragment.o0;
                if (!AbstractC1474fG.b(ds1 != null ? ds1.l : null, ds0.l)) {
                    return c2985uq0;
                }
            }
            if (AbstractC1899jh0.U(playerMobileFragment.h0().a, "xuper-live:", false)) {
                C1042as c1042as = playerMobileFragment.y0;
                if (c1042as == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                c1042as.Q();
                C1042as c1042as2 = playerMobileFragment.y0;
                if (c1042as2 == null) {
                    AbstractC1474fG.U("player");
                    throw null;
                }
                c1042as2.j();
            } else {
                playerMobileFragment.k0().j(ds0);
            }
        }
        return c2985uq0;
    }
}
