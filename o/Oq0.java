package o;

import j$.lang.Iterable$EL;

/* JADX INFO: loaded from: classes.dex */
public class Oq0 extends AQ {
    private final C2848tT D;
    private final int E;

    public Oq0(C2848tT c2848tT, int i) {
        if (!c2848tT.q()) {
            throw new U60(c2848tT);
        }
        C0344Ci.a(i);
        k().v(5);
        b(H50.z(c2848tT, 6, 1), 0);
        this.D = c2848tT;
        this.E = i;
    }

    private void b0(H50 h50) {
        b(h50, 1);
    }

    private void c0(H50 h50) {
        b(h50, 2);
    }

    public void N(C2848tT c2848tT) {
        b0(H50.A(c2848tT, 255, 254, 0L));
    }

    public void O(C2848tT c2848tT, int i) {
        b0(H50.A(c2848tT, i, 254, 0L));
    }

    public void P(C2848tT c2848tT, int i, long j, String str) {
        c0(H50.n(c2848tT, i, this.E, j, str, this.D));
    }

    public void Q(C2848tT c2848tT, int i, long j, Fl0 fl0) {
        c0(H50.o(c2848tT, i, this.E, j, fl0, this.D));
    }

    public <T extends H50> void R(X40 x40) {
        Iterable$EL.forEach(x40.q(), new Nq0(this, 0));
    }

    public void S(H50 h50) {
        c0(h50);
    }

    public void T(H50[] h50Arr) {
        for (H50 h50 : h50Arr) {
            S(h50);
        }
    }

    public void U(C2848tT c2848tT) {
        c0(H50.A(c2848tT, 255, 255, 0L));
    }

    public void V(C2848tT c2848tT, int i) {
        c0(H50.A(c2848tT, i, 255, 0L));
    }

    public void W(C2848tT c2848tT, int i, String str) {
        c0(H50.n(c2848tT, i, 254, 0L, str, this.D));
    }

    public void X(C2848tT c2848tT, int i, Fl0 fl0) {
        c0(H50.o(c2848tT, i, 254, 0L, fl0, this.D));
    }

    public <T extends H50> void Y(X40 x40) {
        Iterable$EL.forEach(x40.q(), new Nq0(this, 1));
    }

    public void Z(H50 h50) {
        c0(h50.S(254, 0L));
    }

    public void a0(H50[] h50Arr) {
        for (H50 h50 : h50Arr) {
            Z(h50);
        }
    }

    public void d0(C2848tT c2848tT) {
        b0(H50.A(c2848tT, 255, 255, 0L));
    }

    public void e0(C2848tT c2848tT, int i) {
        b0(H50.A(c2848tT, i, 255, 0L));
    }

    public void f0(C2848tT c2848tT, int i, String str) {
        b0(H50.n(c2848tT, i, this.E, 0L, str, this.D));
    }

    public void g0(C2848tT c2848tT, int i, Fl0 fl0) {
        b0(H50.o(c2848tT, i, this.E, 0L, fl0, this.D));
    }

    public void h0(H50 h50) {
        b0(h50);
    }

    public void i0(C2848tT c2848tT, int i, long j, String str) {
        V(c2848tT, i);
        P(c2848tT, i, j, str);
    }

    public void j0(C2848tT c2848tT, int i, long j, Fl0 fl0) {
        V(c2848tT, i);
        Q(c2848tT, i, j, fl0);
    }

    public <T extends H50> void k0(X40 x40) {
        V(x40.o(), x40.getType());
        Iterable$EL.forEach(x40.q(), new Nq0(this, 0));
    }

    public void l0(H50 h50) {
        V(h50.v(), h50.y());
        S(h50);
    }

    public void m0(H50[] h50Arr) {
        for (H50 h50 : h50Arr) {
            l0(h50);
        }
    }

    public Oq0(C2848tT c2848tT) {
        this(c2848tT, 1);
    }
}
