package o;

import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: loaded from: classes.dex */
public final class ZZ extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PlayerMobileFragment f658o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZZ(PlayerMobileFragment playerMobileFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f658o = playerMobileFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((ZZ) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        ZZ zz = new ZZ(this.f658o, interfaceC0473Hh);
        zz.n = obj;
        return zz;
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        PlayerMobileFragment playerMobileFragment = this.f658o;
        try {
            if (i == 0) {
                Jp0.O(obj);
                InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
                Z10 z10K0 = playerMobileFragment.k0();
                this.n = interfaceC1608gi;
                this.m = 1;
                obj = AbstractC1376eG.J(AbstractC1910jn.b, new R10(z10K0, null), this);
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
            if (c0456Gq == null) {
                playerMobileFragment.N0 = false;
                return c2985uq0;
            }
            if (!(playerMobileFragment.h0().d instanceof Hs0)) {
                playerMobileFragment.N0 = false;
                return c2985uq0;
            }
            C2303no0 c2303no0 = playerMobileFragment.u0;
            AbstractC1474fG.g(c2303no0);
            ((LW) c2303no0.n).m.setAlpha(0.0f);
            C2303no0 c2303no1 = playerMobileFragment.u0;
            AbstractC1474fG.g(c2303no1);
            ((LW) c2303no1.n).m.setVisibility(0);
            C2303no0 c2303no2 = playerMobileFragment.u0;
            AbstractC1474fG.g(c2303no2);
            ((LW) c2303no2.n).m.animate().alpha(1.0f).setDuration(300L).start();
            C2303no0 c2303no3 = playerMobileFragment.u0;
            AbstractC1474fG.g(c2303no3);
            ((LW) c2303no3.n).s.setText(PlayerMobileFragment.Y(playerMobileFragment, c0456Gq));
            C2630r70 c2630r70N = com.bumptech.glide.a.f(playerMobileFragment).n(c0456Gq.d);
            C2303no0 c2303no4 = playerMobileFragment.u0;
            AbstractC1474fG.g(c2303no4);
            c2630r70N.H(((LW) c2303no4.n).q);
            C2628r60 c2628r60 = new C2628r60();
            c2628r60.l = 10;
            playerMobileFragment.M0 = AbstractC1376eG.w(AbstractC1459f50.y(playerMobileFragment.q()), null, 0, new C1059b00(c2628r60, playerMobileFragment, c0456Gq, null), 3);
            C2303no0 c2303no5 = playerMobileFragment.u0;
            AbstractC1474fG.g(c2303no5);
            ((LW) c2303no5.n).f379o.setOnClickListener(new ViewOnClickListenerC1010ac(playerMobileFragment, 5, c0456Gq));
            C2303no0 c2303no6 = playerMobileFragment.u0;
            AbstractC1474fG.g(c2303no6);
            ((LW) c2303no6.n).n.setOnClickListener(new DZ(playerMobileFragment, 4));
            return c2985uq0;
        } catch (Exception unused) {
            playerMobileFragment.N0 = false;
        }
    }
}
