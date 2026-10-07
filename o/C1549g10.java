package o;

import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.g10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1549g10 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PlayerTvFragment f788o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1549g10(long j, PlayerTvFragment playerTvFragment, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = j;
        this.f788o = playerTvFragment;
        this.p = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1549g10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1549g10(this.n, this.f788o, this.p, interfaceC0473Hh);
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
        PlayerTvFragment playerTvFragment = this.f788o;
        if (playerTvFragment.t() && playerTvFragment.z0 != null) {
            if (this.p == 1) {
                Ds0 ds0 = playerTvFragment.o0;
                if (ds0 != null) {
                    playerTvFragment.n0().g(ds0, null);
                }
            } else {
                playerTvFragment.n0().i(playerTvFragment.i0().d, playerTvFragment.i0().a);
            }
        }
        return C2985uq0.a;
    }
}
