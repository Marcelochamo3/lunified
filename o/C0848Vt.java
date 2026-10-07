package o;

import com.skidush.clonex.fragments.favorites.FavoritesTvFragment;

/* JADX INFO: renamed from: o.Vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0848Vt extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ FavoritesTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0848Vt(FavoritesTvFragment favoritesTvFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = favoritesTvFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0848Vt) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0848Vt(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            FavoritesTvFragment favoritesTvFragment = this.n;
            C2314nu c2314nu = (C2314nu) favoritesTvFragment.n0.getValue();
            C1640gy c1640gyQ = favoritesTvFragment.q();
            c1640gyQ.g();
            C0881Xa c0881XaQ = Jp0.q(c2314nu.d, c1640gyQ.p, TJ.f532o);
            C0692Pt c0692Pt = new C0692Pt(1, favoritesTvFragment);
            this.m = 1;
            if (c0881XaQ.a(c0692Pt, this) == enumC1706hi) {
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
