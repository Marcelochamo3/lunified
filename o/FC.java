package o;

import com.skidush.clonex.fragments.home.HomeTvFragment;

/* JADX INFO: loaded from: classes.dex */
public final class FC extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ HomeTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FC(HomeTvFragment homeTvFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = homeTvFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((FC) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new FC(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            HomeTvFragment homeTvFragment = this.n;
            RC rc = (RC) homeTvFragment.n0.getValue();
            C1478fK c1478fK = homeTvFragment.b0;
            AbstractC1474fG.i(c1478fK, "<get-lifecycle>(...)");
            C0881Xa c0881XaQ = Jp0.q(rc.k, c1478fK, TJ.f532o);
            C1632gu c1632gu = new C1632gu(7, homeTvFragment);
            this.m = 1;
            if (c0881XaQ.a(c1632gu, this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return C2985uq0.a;
    }
}
