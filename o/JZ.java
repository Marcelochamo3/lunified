package o;

import com.skidush.clonex.fragments.player.PlayerMobileFragment;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class JZ implements InterfaceC2176mZ {
    public final /* synthetic */ int l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ AbstractComponentCallbacksC1247cx n;

    public /* synthetic */ JZ(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z, int i) {
        this.l = i;
        this.n = abstractComponentCallbacksC1247cx;
        this.m = z;
    }

    private final /* synthetic */ void A0(C2105lm0 c2105lm0) {
    }

    private final /* synthetic */ void B(C3259xi c3259xi) {
    }

    private final /* synthetic */ void B0(C2105lm0 c2105lm0) {
    }

    private final /* synthetic */ void C(InterfaceC2370oZ interfaceC2370oZ, C2079lZ c2079lZ) {
    }

    private final /* synthetic */ void C0(C1045at0 c1045at0) {
    }

    private final /* synthetic */ void D(InterfaceC2370oZ interfaceC2370oZ, C2079lZ c2079lZ) {
    }

    private final /* synthetic */ void D0(C1045at0 c1045at0) {
    }

    private final /* synthetic */ void K(boolean z) {
    }

    private final /* synthetic */ void L(boolean z) {
    }

    private final /* synthetic */ void O(boolean z) {
    }

    private final /* synthetic */ void P(boolean z) {
    }

    private final /* synthetic */ void Q(C1971kP c1971kP, int i) {
    }

    private final /* synthetic */ void R(C1971kP c1971kP, int i) {
    }

    private final /* synthetic */ void S(C2263nP c2263nP) {
    }

    private final /* synthetic */ void T(C2263nP c2263nP) {
    }

    private final /* synthetic */ void U(CQ cq) {
    }

    private final /* synthetic */ void V(CQ cq) {
    }

    private final /* synthetic */ void W(int i, boolean z) {
    }

    private final /* synthetic */ void X(int i, boolean z) {
    }

    private final /* synthetic */ void Y(C1591gZ c1591gZ) {
    }

    private final /* synthetic */ void Z(C1591gZ c1591gZ) {
    }

    private final /* synthetic */ void a0(int i) {
    }

    private final /* synthetic */ void b0(int i) {
    }

    private final /* synthetic */ void c(I6 i6) {
    }

    private final /* synthetic */ void c0(Lr lr) {
    }

    private final /* synthetic */ void d0(Lr lr) {
    }

    private final /* synthetic */ void e0(Lr lr) {
    }

    private final /* synthetic */ void f0(Lr lr) {
    }

    private final /* synthetic */ void g(I6 i6) {
    }

    private final /* synthetic */ void g0(int i, boolean z) {
    }

    private final /* synthetic */ void h0(int i, boolean z) {
    }

    private final /* synthetic */ void i0(C2263nP c2263nP) {
    }

    private final /* synthetic */ void j(C1981kZ c1981kZ) {
    }

    private final /* synthetic */ void j0(C2263nP c2263nP) {
    }

    private final /* synthetic */ void k(C1981kZ c1981kZ) {
    }

    private final /* synthetic */ void k0(int i, C2273nZ c2273nZ, C2273nZ c2273nZ2) {
    }

    private final /* synthetic */ void l0(int i, C2273nZ c2273nZ, C2273nZ c2273nZ2) {
    }

    private final /* synthetic */ void m0() {
    }

    private final /* synthetic */ void n0() {
    }

    private final /* synthetic */ void o(List list) {
    }

    private final /* synthetic */ void o0(int i) {
    }

    private final /* synthetic */ void p0(int i) {
    }

    private final /* synthetic */ void q0(boolean z) {
    }

    private final /* synthetic */ void r0(boolean z) {
    }

    private final /* synthetic */ void s0(boolean z) {
    }

    private final /* synthetic */ void t0(boolean z) {
    }

    private final /* synthetic */ void u0(int i, int i2) {
    }

    private final /* synthetic */ void v0(int i, int i2) {
    }

    private final /* synthetic */ void w0(int i) {
    }

    private final /* synthetic */ void x(C3259xi c3259xi) {
    }

    private final /* synthetic */ void x0(int i) {
    }

    private final /* synthetic */ void y(List list) {
    }

    private final /* synthetic */ void y0(C1715hm0 c1715hm0) {
    }

    private final /* synthetic */ void z0(C1715hm0 c1715hm0) {
    }

    @Override // o.InterfaceC2176mZ
    public final void A(int i) {
        C1042as c1042as;
        switch (this.l) {
            case 0:
                if (i == 3) {
                    PlayerMobileFragment playerMobileFragment = (PlayerMobileFragment) this.n;
                    C1042as c1042as2 = playerMobileFragment.y0;
                    if (c1042as2 == null) {
                        AbstractC1474fG.U("player");
                        throw null;
                    }
                    c1042as2.S(this);
                    C1042as c1042as3 = playerMobileFragment.y0;
                    if (c1042as3 == null) {
                        AbstractC1474fG.U("player");
                        throw null;
                    }
                    long jH = c1042as3.H();
                    if (this.m) {
                        C1042as c1042as4 = playerMobileFragment.y0;
                        if (c1042as4 != null) {
                            c1042as4.m();
                            return;
                        } else {
                            AbstractC1474fG.U("player");
                            throw null;
                        }
                    }
                    if (jH == -9223372036854775807L || jH <= 0) {
                        C1042as c1042as5 = playerMobileFragment.y0;
                        if (c1042as5 != null) {
                            c1042as5.m();
                            return;
                        } else {
                            AbstractC1474fG.U("player");
                            throw null;
                        }
                    }
                    long jF = U9.f(jH - 20000, 0L);
                    C1042as c1042as6 = playerMobileFragment.y0;
                    if (c1042as6 != null) {
                        c1042as6.l(5, jF);
                        return;
                    } else {
                        AbstractC1474fG.U("player");
                        throw null;
                    }
                }
                return;
            default:
                if (i != 3 || (c1042as = ((PlayerTvFragment) this.n).D0) == null) {
                    return;
                }
                c1042as.S(this);
                long jH2 = c1042as.H();
                if (this.m) {
                    c1042as.m();
                    return;
                } else if (jH2 == -9223372036854775807L || jH2 <= 0) {
                    c1042as.m();
                    return;
                } else {
                    c1042as.l(5, U9.f(jH2 - 20000, 0L));
                    return;
                }
        }
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void E(boolean z) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void F(Lr lr) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void G(int i, int i2) {
        int i3 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void H(C1981kZ c1981kZ) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void I(InterfaceC2370oZ interfaceC2370oZ, C2079lZ c2079lZ) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void J(C1971kP c1971kP, int i) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void M(CQ cq) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void N(boolean z) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void a(int i) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void b(C2263nP c2263nP) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void d(C1045at0 c1045at0) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void e(int i) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void f(C2105lm0 c2105lm0) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void h(Lr lr) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void i(I6 i6) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void l(C3259xi c3259xi) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void m(C2263nP c2263nP) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void n(int i) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void p(int i, C2273nZ c2273nZ, C2273nZ c2273nZ2) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void q(boolean z) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void r() {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void s(boolean z) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void t(List list) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void u(C1591gZ c1591gZ) {
        int i = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void v(int i, boolean z) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void w(int i, boolean z) {
        int i2 = this.l;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void z(C1715hm0 c1715hm0) {
        int i = this.l;
    }
}
