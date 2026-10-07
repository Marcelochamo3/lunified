package o;

import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: renamed from: o.f00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1449f00 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ PlayerMobileFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1449f00(PlayerMobileFragment playerMobileFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = playerMobileFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1449f00) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1449f00(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        C1042as c1042as;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        PlayerMobileFragment playerMobileFragment = this.n;
        if (i == 0) {
            Jp0.O(obj);
            long j = playerMobileFragment.E0;
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
        if (playerMobileFragment.t() && playerMobileFragment.u0 != null && (c1042as = playerMobileFragment.y0) != null && c1042as.f()) {
            long j2 = playerMobileFragment.E0 / ((long) 1000);
            playerMobileFragment.C0 = 0;
            playerMobileFragment.J0 = false;
        }
        playerMobileFragment.H0 = null;
        return C2985uq0.a;
    }
}
