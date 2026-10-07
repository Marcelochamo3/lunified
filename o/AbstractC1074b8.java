package o;

import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1074b8 implements InterfaceC2370oZ {
    public Object a;

    public AbstractC1074b8(int i) {
        switch (i) {
            case 1:
                this.a = new Ej0();
                break;
            default:
                char[] cArr = Kr0.a;
                this.a = new ArrayDeque(20);
                break;
        }
    }

    public C1971kP a() {
        C1042as c1042as = (C1042as) this;
        Fj0 fj0E = c1042as.E();
        if (fj0E.q()) {
            return null;
        }
        return fj0E.n(c1042as.A(), (Ej0) this.a, 0L).n;
    }

    public boolean b(int i) {
        C1042as c1042as = (C1042as) this;
        c1042as.i0();
        return c1042as.M.l.a.get(i);
    }

    public boolean c() {
        C1042as c1042as = (C1042as) this;
        Fj0 fj0E = c1042as.E();
        return !fj0E.q() && fj0E.n(c1042as.A(), (Ej0) this.a, 0L).t;
    }

    public boolean d() {
        C1042as c1042as = (C1042as) this;
        Fj0 fj0E = c1042as.E();
        return !fj0E.q() && fj0E.n(c1042as.A(), (Ej0) this.a, 0L).a();
    }

    public boolean e() {
        C1042as c1042as = (C1042as) this;
        Fj0 fj0E = c1042as.E();
        return !fj0E.q() && fj0E.n(c1042as.A(), (Ej0) this.a, 0L).s;
    }

    public boolean f() {
        C1042as c1042as = (C1042as) this;
        if (c1042as.J() == 3 && c1042as.I()) {
            c1042as.i0();
            if (c1042as.j0.m == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        C3157wf0 c3157wf0 = (C3157wf0) this.a;
        View view = c3157wf0.c.S;
        int iB = view != null ? AbstractC1923jt0.b(view) : 0;
        int i = c3157wf0.a;
        return iB == i || !(iB == 2 || i == 2);
    }

    public void h(InterfaceC1747i20 interfaceC1747i20) {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC1747i20);
        }
    }

    public void i() {
        C1042as c1042as = (C1042as) this;
        c1042as.i0();
        c1042as.f0(c1042as.A.d(c1042as.J(), false), 1, false);
    }

    public void j() {
        C1042as c1042as = (C1042as) this;
        c1042as.i0();
        int iD = c1042as.A.d(c1042as.J(), true);
        c1042as.f0(iD, iD != 1 ? 2 : 1, true);
    }

    public abstract void k(int i, long j, boolean z);

    public void l(int i, long j) {
        k(((C1042as) this).A(), j, false);
    }

    public void m() {
        k(((C1042as) this).A(), -9223372036854775807L, false);
    }

    public void n() {
        int iE;
        int iE2;
        C1042as c1042as = (C1042as) this;
        if (c1042as.E().q() || c1042as.M()) {
            return;
        }
        Fj0 fj0E = c1042as.E();
        if (fj0E.q()) {
            iE = -1;
        } else {
            int iA = c1042as.A();
            c1042as.i0();
            int i = c1042as.E;
            if (i == 1) {
                i = 0;
            }
            c1042as.i0();
            iE = fj0E.e(iA, i, c1042as.F);
        }
        if (!(iE != -1)) {
            if (d() && c()) {
                k(c1042as.A(), -9223372036854775807L, false);
                return;
            }
            return;
        }
        Fj0 fj0E2 = c1042as.E();
        if (fj0E2.q()) {
            iE2 = -1;
        } else {
            int iA2 = c1042as.A();
            c1042as.i0();
            int i2 = c1042as.E;
            if (i2 == 1) {
                i2 = 0;
            }
            c1042as.i0();
            iE2 = fj0E2.e(iA2, i2, c1042as.F);
        }
        if (iE2 == -1) {
            return;
        }
        if (iE2 == c1042as.A()) {
            k(c1042as.A(), -9223372036854775807L, true);
        } else {
            k(iE2, -9223372036854775807L, false);
        }
    }

    public void o(int i, long j) {
        C1042as c1042as = (C1042as) this;
        long jC = c1042as.C() + j;
        long jH = c1042as.H();
        if (jH != -9223372036854775807L) {
            jC = Math.min(jC, jH);
        }
        l(i, Math.max(jC, 0L));
    }

    public void p() {
        int iL;
        int iL2;
        int iL3;
        C1042as c1042as = (C1042as) this;
        if (c1042as.E().q() || c1042as.M()) {
            return;
        }
        Fj0 fj0E = c1042as.E();
        if (fj0E.q()) {
            iL = -1;
        } else {
            int iA = c1042as.A();
            c1042as.i0();
            int i = c1042as.E;
            if (i == 1) {
                i = 0;
            }
            c1042as.i0();
            iL = fj0E.l(iA, i, c1042as.F);
        }
        boolean z = iL != -1;
        if (d() && !e()) {
            if (z) {
                Fj0 fj0E2 = c1042as.E();
                if (fj0E2.q()) {
                    iL3 = -1;
                } else {
                    int iA2 = c1042as.A();
                    c1042as.i0();
                    int i2 = c1042as.E;
                    if (i2 == 1) {
                        i2 = 0;
                    }
                    c1042as.i0();
                    iL3 = fj0E2.l(iA2, i2, c1042as.F);
                }
                if (iL3 == -1) {
                    return;
                }
                if (iL3 == c1042as.A()) {
                    k(c1042as.A(), -9223372036854775807L, true);
                    return;
                } else {
                    k(iL3, -9223372036854775807L, false);
                    return;
                }
            }
            return;
        }
        if (z) {
            long jC = c1042as.C();
            c1042as.i0();
            if (jC <= 3000) {
                Fj0 fj0E3 = c1042as.E();
                if (fj0E3.q()) {
                    iL2 = -1;
                } else {
                    int iA3 = c1042as.A();
                    c1042as.i0();
                    int i3 = c1042as.E;
                    if (i3 == 1) {
                        i3 = 0;
                    }
                    c1042as.i0();
                    iL2 = fj0E3.l(iA3, i3, c1042as.F);
                }
                if (iL2 == -1) {
                    return;
                }
                if (iL2 == c1042as.A()) {
                    k(c1042as.A(), -9223372036854775807L, true);
                    return;
                } else {
                    k(iL2, -9223372036854775807L, false);
                    return;
                }
            }
        }
        l(7, 0L);
    }

    public void q(C1971kP c1971kP) {
        M60 m60Q = AbstractC0985aF.q(c1971kP);
        C1042as c1042as = (C1042as) this;
        c1042as.i0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < m60Q.f392o; i++) {
            arrayList.add(c1042as.q.c((C1971kP) m60Q.get(i)));
        }
        c1042as.i0();
        c1042as.W(arrayList, -1, -9223372036854775807L, true);
    }

    public AbstractC1074b8(InterfaceC1324dm0 interfaceC1324dm0) {
        this.a = interfaceC1324dm0;
    }

    public AbstractC1074b8(C3157wf0 c3157wf0) {
        AbstractC1474fG.j(c3157wf0, "operation");
        this.a = c3157wf0;
    }
}
