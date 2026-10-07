package o;

import com.skidush.clonex.fragments.tv_show.TvShowTvFragment;

/* JADX INFO: renamed from: o.xo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3272xo0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ TvShowTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3272xo0(TvShowTvFragment tvShowTvFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = tvShowTvFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3272xo0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3272xo0(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            TvShowTvFragment tvShowTvFragment = this.n;
            Wo0 wo0 = (Wo0) tvShowTvFragment.o0.getValue();
            C1478fK c1478fK = tvShowTvFragment.b0;
            AbstractC1474fG.i(c1478fK, "<get-lifecycle>(...)");
            C0881Xa c0881XaQ = Jp0.q(wo0.d, c1478fK, TJ.f532o);
            C1632gu c1632gu = new C1632gu(27, tvShowTvFragment);
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
