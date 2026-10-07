package o;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: o.rZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC2660rZ implements InterfaceC2176mZ, View.OnClickListener {
    public final /* synthetic */ C2951uZ l;

    public ViewOnClickListenerC2660rZ(C2951uZ c2951uZ) {
        this.l = c2951uZ;
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void A(int i) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void E(boolean z) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void F(Lr lr) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void G(int i, int i2) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void H(C1981kZ c1981kZ) {
    }

    @Override // o.InterfaceC2176mZ
    public final void I(InterfaceC2370oZ interfaceC2370oZ, C2079lZ c2079lZ) {
        boolean zB = c2079lZ.b(4, 5);
        C2951uZ c2951uZ = this.l;
        if (zB) {
            c2951uZ.g();
        }
        if (c2079lZ.b(4, 5, 7)) {
            c2951uZ.h();
        }
        if (c2079lZ.a(8)) {
            c2951uZ.i();
        }
        if (c2079lZ.a(9)) {
            c2951uZ.j();
        }
        if (c2079lZ.b(8, 9, 11, 0, 13)) {
            c2951uZ.f();
        }
        if (c2079lZ.b(11, 0)) {
            c2951uZ.k();
        }
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void J(C1971kP c1971kP, int i) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void M(CQ cq) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void N(boolean z) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void a(int i) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void b(C2263nP c2263nP) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void d(C1045at0 c1045at0) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void e(int i) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void f(C2105lm0 c2105lm0) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void h(Lr lr) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void i(I6 i6) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void l(C3259xi c3259xi) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void m(C2263nP c2263nP) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void n(int i) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2951uZ c2951uZ = this.l;
        InterfaceC2370oZ interfaceC2370oZ = c2951uZ.R;
        if (interfaceC2370oZ == null) {
            return;
        }
        if (c2951uZ.f1055o == view) {
            ((AbstractC1074b8) interfaceC2370oZ).n();
            return;
        }
        if (c2951uZ.n == view) {
            ((AbstractC1074b8) interfaceC2370oZ).p();
            return;
        }
        if (c2951uZ.r == view) {
            if (((C1042as) interfaceC2370oZ).J() != 4) {
                AbstractC1074b8 abstractC1074b8 = (AbstractC1074b8) interfaceC2370oZ;
                C1042as c1042as = (C1042as) abstractC1074b8;
                c1042as.i0();
                abstractC1074b8.o(12, c1042as.v);
                return;
            }
            return;
        }
        if (c2951uZ.s == view) {
            AbstractC1074b8 abstractC1074b9 = (AbstractC1074b8) interfaceC2370oZ;
            C1042as c1042as2 = (C1042as) abstractC1074b9;
            c1042as2.i0();
            abstractC1074b9.o(11, -c1042as2.u);
            return;
        }
        if (c2951uZ.p == view) {
            Lr0.E(interfaceC2370oZ);
            return;
        }
        if (c2951uZ.q == view) {
            int i = Lr0.a;
            AbstractC1074b8 abstractC1074b10 = (AbstractC1074b8) interfaceC2370oZ;
            if (abstractC1074b10.b(1)) {
                abstractC1074b10.i();
                return;
            }
            return;
        }
        if (c2951uZ.t == view) {
            C1042as c1042as3 = (C1042as) interfaceC2370oZ;
            c1042as3.i0();
            int i2 = c1042as3.E;
            int i3 = c2951uZ.b0;
            for (int i4 = 1; i4 <= 2; i4++) {
                int i5 = (i2 + i4) % 3;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2 || (i3 & 2) == 0) {
                        }
                    } else if ((i3 & 1) == 0) {
                    }
                }
                i2 = i5;
                break;
            }
            c1042as3.Z(i2);
            return;
        }
        if (c2951uZ.u == view) {
            C1042as c1042as4 = (C1042as) interfaceC2370oZ;
            c1042as4.i0();
            boolean z = !c1042as4.F;
            c1042as4.i0();
            if (c1042as4.F != z) {
                c1042as4.F = z;
                Uh0 uh0 = c1042as4.k.s;
                uh0.getClass();
                Th0 th0B = Uh0.b();
                th0B.a = uh0.a.obtainMessage(12, z ? 1 : 0, 0);
                th0B.b();
                C0742Rr c0742Rr = new C0742Rr(0, z);
                TK tk = c1042as4.l;
                tk.c(9, c0742Rr);
                c1042as4.e0();
                tk.b();
            }
        }
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void p(int i, C2273nZ c2273nZ, C2273nZ c2273nZ2) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void r() {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void s(boolean z) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void t(List list) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void u(C1591gZ c1591gZ) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void v(int i, boolean z) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void w(int i, boolean z) {
    }

    @Override // o.InterfaceC2176mZ
    public final /* synthetic */ void z(C1715hm0 c1715hm0) {
    }
}
