package o;

import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.u10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2909u10 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ PlayerTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2909u10(PlayerTvFragment playerTvFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = playerTvFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2909u10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2909u10(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        PlayerTvFragment playerTvFragment = this.n;
        try {
            if (i == 0) {
                Jp0.O(obj);
                Z10 z10N0 = playerTvFragment.n0();
                this.m = 1;
                obj = AbstractC1376eG.J(AbstractC1910jn.b, new R10(z10N0, null), this);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            C0456Gq c0456Gq = (C0456Gq) obj;
            if (playerTvFragment.z0 == null) {
                playerTvFragment.S0 = false;
                return c2985uq0;
            }
            if (c0456Gq == null) {
                playerTvFragment.S0 = false;
                return c2985uq0;
            }
            if (!(playerTvFragment.i0().d instanceof Hs0)) {
                playerTvFragment.S0 = false;
                return c2985uq0;
            }
            C0560Kq c0560Kq = playerTvFragment.z0;
            AbstractC1474fG.g(c0560Kq);
            ((LW) c0560Kq.f370o).m.setAlpha(0.0f);
            C0560Kq c0560Kq2 = playerTvFragment.z0;
            AbstractC1474fG.g(c0560Kq2);
            ((LW) c0560Kq2.f370o).m.setVisibility(0);
            C0560Kq c0560Kq3 = playerTvFragment.z0;
            AbstractC1474fG.g(c0560Kq3);
            ((LW) c0560Kq3.f370o).m.animate().alpha(1.0f).setDuration(300L).start();
            C0560Kq c0560Kq4 = playerTvFragment.z0;
            AbstractC1474fG.g(c0560Kq4);
            ((LW) c0560Kq4.f370o).s.setText(PlayerTvFragment.W(playerTvFragment, c0456Gq));
            C2630r70 c2630r70N = com.bumptech.glide.a.f(playerTvFragment).n(c0456Gq.d);
            C0560Kq c0560Kq5 = playerTvFragment.z0;
            AbstractC1474fG.g(c0560Kq5);
            c2630r70N.H(((LW) c0560Kq5.f370o).q);
            C2628r60 c2628r60 = new C2628r60();
            c2628r60.l = 10;
            playerTvFragment.R0 = AbstractC1376eG.w(AbstractC1459f50.y(playerTvFragment.q()), null, 0, new C3103w10(c2628r60, playerTvFragment, c0456Gq, null), 3);
            C0560Kq c0560Kq6 = playerTvFragment.z0;
            AbstractC1474fG.g(c0560Kq6);
            ((LW) c0560Kq6.f370o).f379o.post(new W00(playerTvFragment, 3));
            C0560Kq c0560Kq7 = playerTvFragment.z0;
            AbstractC1474fG.g(c0560Kq7);
            ((LW) c0560Kq7.f370o).f379o.setOnClickListener(new ViewOnClickListenerC1010ac(playerTvFragment, 10, c0456Gq));
            C0560Kq c0560Kq8 = playerTvFragment.z0;
            AbstractC1474fG.g(c0560Kq8);
            ((LW) c0560Kq8.f370o).n.setOnClickListener(new Y00(playerTvFragment, 5));
            return c2985uq0;
        } catch (Exception unused) {
            playerTvFragment.S0 = false;
        }
    }
}
