package o;

import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.z10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3394z10 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ PlayerTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3394z10(PlayerTvFragment playerTvFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = playerTvFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3394z10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3394z10(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        C1042as c1042as;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        PlayerTvFragment playerTvFragment = this.n;
        if (i == 0) {
            Jp0.O(obj);
            long j = playerTvFragment.J0;
            this.m = 1;
            if (AbstractC1376eG.q(j, this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        if (playerTvFragment.t() && playerTvFragment.z0 != null && (c1042as = playerTvFragment.D0) != null && c1042as.f()) {
            long j2 = playerTvFragment.J0 / ((long) 1000);
            playerTvFragment.H0 = 0;
            playerTvFragment.O0 = false;
        }
        playerTvFragment.M0 = null;
        return C2985uq0.a;
    }
}
