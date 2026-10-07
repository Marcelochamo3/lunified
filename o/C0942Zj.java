package o;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: o.Zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0942Zj implements InterfaceC2176mZ, IP, InterfaceC0376Do {
    public final Sh0 l;
    public final Dj0 m;
    public final Ej0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1750i4 f663o;
    public final SparseArray p;
    public TK q;
    public InterfaceC2370oZ r;
    public Uh0 s;
    public boolean t;

    public C0942Zj(Sh0 sh0) {
        sh0.getClass();
        this.l = sh0;
        int i = Lr0.a;
        Looper looperMyLooper = Looper.myLooper();
        this.q = new TK(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, sh0, new S1(23));
        Dj0 dj0 = new Dj0();
        this.m = dj0;
        this.n = new Ej0();
        this.f663o = new C1750i4(dj0);
        this.p = new SparseArray();
    }

    @Override // o.InterfaceC2176mZ
    public final void A(int i) {
        T(O(), 4, new S1(21));
    }

    @Override // o.IP
    public final void B(int i, CP cp, C2069lP c2069lP) {
        C3201x2 c3201x2R = R(i, cp);
        T(c3201x2R, 1004, new C0812Uj(c3201x2R, 1, c2069lP));
    }

    @Override // o.IP
    public final void C(int i, CP cp, C0991aL c0991aL, C2069lP c2069lP) {
        T(R(i, cp), 1002, new C0838Vj(21));
    }

    @Override // o.InterfaceC0376Do
    public final void D(int i, CP cp) {
        T(R(i, cp), 1027, new S1(29));
    }

    @Override // o.InterfaceC2176mZ
    public final void E(boolean z) {
        T(O(), 9, new S1(6));
    }

    @Override // o.InterfaceC2176mZ
    public final void F(Lr lr) {
        C3135wP c3135wP;
        T((!(lr instanceof Lr) || (c3135wP = lr.s) == null) ? O() : P(new CP(c3135wP)), 10, new C0838Vj(4));
    }

    @Override // o.InterfaceC2176mZ
    public final void G(int i, int i2) {
        T(S(), 24, new S1(15));
    }

    @Override // o.InterfaceC2176mZ
    public final void H(C1981kZ c1981kZ) {
        T(O(), 13, new S1(18));
    }

    @Override // o.InterfaceC2176mZ
    public final void J(C1971kP c1971kP, int i) {
        T(O(), 1, new S1(16));
    }

    @Override // o.IP
    public final void K(int i, CP cp, C2069lP c2069lP) {
        T(R(i, cp), 1005, new C0838Vj(8));
    }

    @Override // o.IP
    public final void L(int i, CP cp, C0991aL c0991aL, C2069lP c2069lP) {
        T(R(i, cp), 1001, new S1(10));
    }

    @Override // o.InterfaceC2176mZ
    public final void M(CQ cq) {
        T(O(), 28, new C0838Vj(14));
    }

    @Override // o.InterfaceC2176mZ
    public final void N(boolean z) {
        T(O(), 7, new C0838Vj(23));
    }

    public final C3201x2 O() {
        return P((CP) this.f663o.p);
    }

    public final C3201x2 P(CP cp) {
        this.r.getClass();
        Fj0 fj0 = cp == null ? null : (Fj0) ((R60) this.f663o.f824o).get(cp);
        if (cp != null && fj0 != null) {
            return Q(fj0, fj0.h(cp.a, this.m).n, cp);
        }
        int iA = ((C1042as) this.r).A();
        Fj0 fj0E = ((C1042as) this.r).E();
        if (iA >= fj0E.p()) {
            fj0E = Fj0.l;
        }
        return Q(fj0E, iA, null);
    }

    public final C3201x2 Q(Fj0 fj0, int i, CP cp) {
        CP cp2 = fj0.q() ? null : cp;
        this.l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = fj0.equals(((C1042as) this.r).E()) && i == ((C1042as) this.r).A();
        long jX = 0;
        if (cp2 == null || !cp2.a()) {
            if (z) {
                C1042as c1042as = (C1042as) this.r;
                c1042as.i0();
                jX = c1042as.x(c1042as.j0);
            } else if (!fj0.q()) {
                jX = Lr0.X(fj0.n(i, this.n, 0L).x);
            }
        } else if (z && ((C1042as) this.r).y() == cp2.b && ((C1042as) this.r).z() == cp2.c) {
            jX = ((C1042as) this.r).C();
        }
        CP cp3 = (CP) this.f663o.p;
        Fj0 fj0E = ((C1042as) this.r).E();
        int iA = ((C1042as) this.r).A();
        long jC = ((C1042as) this.r).C();
        C1042as c1042as2 = (C1042as) this.r;
        c1042as2.i0();
        return new C3201x2(jElapsedRealtime, fj0, i, cp2, jX, fj0E, iA, cp3, jC, Lr0.X(c1042as2.j0.q));
    }

    public final C3201x2 R(int i, CP cp) {
        this.r.getClass();
        if (cp != null) {
            return ((Fj0) ((R60) this.f663o.f824o).get(cp)) != null ? P(cp) : Q(Fj0.l, i, cp);
        }
        Fj0 fj0E = ((C1042as) this.r).E();
        if (i >= fj0E.p()) {
            fj0E = Fj0.l;
        }
        return Q(fj0E, i, null);
    }

    public final C3201x2 S() {
        return P((CP) this.f663o.r);
    }

    public final void T(C3201x2 c3201x2, int i, QK qk) {
        this.p.put(i, c3201x2);
        this.q.e(i, qk);
    }

    public final void U(InterfaceC2370oZ interfaceC2370oZ, Looper looper) {
        AbstractC0397Ej.f(this.r == null || ((AbstractC0985aF) this.f663o.n).isEmpty());
        interfaceC2370oZ.getClass();
        this.r = interfaceC2370oZ;
        this.s = this.l.a(looper, null);
        TK tk = this.q;
        this.q = new TK(tk.d, looper, tk.a, new C0812Uj(this, 0, interfaceC2370oZ), tk.i);
    }

    @Override // o.InterfaceC2176mZ
    public final void a(int i) {
        T(O(), 6, new C0838Vj(5));
    }

    @Override // o.InterfaceC2176mZ
    public final void b(C2263nP c2263nP) {
        T(O(), 14, new S1(8));
    }

    @Override // o.InterfaceC0376Do
    public final void c(int i, CP cp) {
        T(R(i, cp), 1023, new C0838Vj(19));
    }

    @Override // o.InterfaceC2176mZ
    public final void d(C1045at0 c1045at0) {
        C3201x2 c3201x2S = S();
        T(c3201x2S, 25, new C0890Xj(c3201x2S, c1045at0));
    }

    @Override // o.InterfaceC2176mZ
    public final void e(int i) {
        InterfaceC2370oZ interfaceC2370oZ = this.r;
        interfaceC2370oZ.getClass();
        C1750i4 c1750i4 = this.f663o;
        c1750i4.p = C1750i4.e(interfaceC2370oZ, (AbstractC0985aF) c1750i4.n, (CP) c1750i4.q, (Dj0) c1750i4.m);
        c1750i4.j(((C1042as) interfaceC2370oZ).E());
        T(O(), 0, new C0838Vj(11));
    }

    @Override // o.InterfaceC2176mZ
    public final void f(C2105lm0 c2105lm0) {
        T(O(), 2, new C0838Vj(1));
    }

    @Override // o.IP
    public final void g(int i, CP cp, C0991aL c0991aL, C2069lP c2069lP) {
        T(R(i, cp), 1000, new C0838Vj(2));
    }

    @Override // o.InterfaceC2176mZ
    public final void h(Lr lr) {
        C3135wP c3135wP;
        C3201x2 c3201x2O = (!(lr instanceof Lr) || (c3135wP = lr.s) == null) ? O() : P(new CP(c3135wP));
        T(c3201x2O, 10, new C2278nc(c3201x2O, (Object) lr, 2));
    }

    @Override // o.InterfaceC2176mZ
    public final void i(I6 i6) {
        T(S(), 20, new C0838Vj(24));
    }

    @Override // o.InterfaceC0376Do
    public final void j(int i, CP cp) {
        T(R(i, cp), 1026, new C0838Vj(16));
    }

    @Override // o.InterfaceC0376Do
    public final void k(int i, CP cp, int i2) {
        C3201x2 c3201x2R = R(i, cp);
        T(c3201x2R, 1022, new C0838Vj(c3201x2R, i2));
    }

    @Override // o.InterfaceC2176mZ
    public final void l(C3259xi c3259xi) {
        T(O(), 27, new S1(17));
    }

    @Override // o.InterfaceC2176mZ
    public final void m(C2263nP c2263nP) {
        T(O(), 15, new S1(14));
    }

    @Override // o.InterfaceC2176mZ
    public final void n(int i) {
        T(O(), 8, new S1(27));
    }

    @Override // o.IP
    public final void o(int i, CP cp, C0991aL c0991aL, C2069lP c2069lP, IOException iOException, boolean z) {
        C3201x2 c3201x2R = R(i, cp);
        T(c3201x2R, 1003, new C2278nc(c3201x2R, c0991aL, c2069lP, iOException, z));
    }

    @Override // o.InterfaceC2176mZ
    public final void p(int i, C2273nZ c2273nZ, C2273nZ c2273nZ2) {
        if (i == 1) {
            this.t = false;
        }
        InterfaceC2370oZ interfaceC2370oZ = this.r;
        interfaceC2370oZ.getClass();
        C1750i4 c1750i4 = this.f663o;
        c1750i4.p = C1750i4.e(interfaceC2370oZ, (AbstractC0985aF) c1750i4.n, (CP) c1750i4.q, (Dj0) c1750i4.m);
        C3201x2 c3201x2O = O();
        T(c3201x2O, 11, new C0864Wj(c3201x2O, i, c2273nZ, c2273nZ2));
    }

    @Override // o.InterfaceC2176mZ
    public final void q(boolean z) {
        C3201x2 c3201x2O = O();
        T(c3201x2O, 3, new C0838Vj(c3201x2O, z));
    }

    @Override // o.InterfaceC2176mZ
    public final void s(boolean z) {
        T(S(), 23, new C0838Vj(22));
    }

    @Override // o.InterfaceC2176mZ
    public final void t(List list) {
        T(O(), 27, new C0838Vj(0));
    }

    @Override // o.InterfaceC2176mZ
    public final void u(C1591gZ c1591gZ) {
        T(O(), 12, new S1(9));
    }

    @Override // o.InterfaceC2176mZ
    public final void v(int i, boolean z) {
        T(O(), -1, new S1(11));
    }

    @Override // o.InterfaceC2176mZ
    public final void w(int i, boolean z) {
        T(O(), 5, new S1(13));
    }

    @Override // o.InterfaceC0376Do
    public final void x(int i, CP cp) {
        T(R(i, cp), 1025, new C0838Vj(20));
    }

    @Override // o.InterfaceC0376Do
    public final void y(int i, CP cp, Exception exc) {
        T(R(i, cp), 1024, new C0838Vj(9));
    }

    @Override // o.InterfaceC2176mZ
    public final void z(C1715hm0 c1715hm0) {
        T(O(), 19, new S1(24));
    }

    @Override // o.InterfaceC2176mZ
    public final void r() {
    }

    @Override // o.InterfaceC2176mZ
    public final void I(InterfaceC2370oZ interfaceC2370oZ, C2079lZ c2079lZ) {
    }
}
