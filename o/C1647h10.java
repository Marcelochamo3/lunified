package o;

import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.h10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1647h10 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ PlayerTvFragment n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f804o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647h10(PlayerTvFragment playerTvFragment, String str, long j, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = playerTvFragment;
        this.f804o = str;
        this.p = j;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1647h10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1647h10(this.n, this.f804o, this.p, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            this.m = 1;
            if (AbstractC1376eG.q(350L, this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        PlayerTvFragment playerTvFragment = this.n;
        C1042as c1042as = playerTvFragment.D0;
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (c1042as != null && playerTvFragment.t()) {
            Js0 js0 = playerTvFragment.p0;
            if (AbstractC1474fG.b(js0 != null ? js0.l : null, this.f804o)) {
                long jC = c1042as.C() + 5000;
                long j = this.p;
                if (j > jC) {
                    c1042as.l(5, j);
                    c1042as.j();
                }
            }
        }
        return c2985uq0;
    }
}
