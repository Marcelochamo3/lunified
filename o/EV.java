package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class EV implements InterfaceC0302As {
    public InterfaceC0354Cs a;
    public Fg0 b;
    public boolean c;

    public final boolean b(C0554Kk c0554Kk) {
        boolean zR;
        HV hv = new HV();
        if (hv.a(c0554Kk, true) && (hv.a & 2) == 2) {
            int iMin = Math.min(hv.e, 8);
            C2562qX c2562qX = new C2562qX(iMin);
            c0554Kk.x(c2562qX.a, 0, iMin, false);
            c2562qX.F(0);
            if (c2562qX.a() >= 5 && c2562qX.u() == 127 && c2562qX.v() == 1179402563) {
                this.b = new C2897tv();
            } else {
                c2562qX.F(0);
                try {
                    zR = AbstractC1370eA.R(1, c2562qX, true);
                } catch (C2949uX unused) {
                    zR = false;
                }
                if (zR) {
                    this.b = new Xu0();
                } else {
                    c2562qX.F(0);
                    if (GW.e(c2562qX, GW.f278o)) {
                        this.b = new GW();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        Fg0 fg0 = this.b;
        if (fg0 != null) {
            GV gv = fg0.a;
            HV hv = gv.a;
            hv.a = 0;
            hv.b = 0L;
            hv.c = 0;
            hv.d = 0;
            hv.e = 0;
            gv.b.C(0);
            gv.c = -1;
            gv.e = false;
            if (j == 0) {
                fg0.d(!fg0.l);
                return;
            }
            if (fg0.h != 0) {
                long j3 = (((long) fg0.i) * j2) / 1000000;
                fg0.e = j3;
                IV iv = fg0.d;
                int i = Lr0.a;
                iv.k(j3);
                fg0.h = 2;
            }
        }
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        try {
            return b((C0554Kk) interfaceC0328Bs);
        } catch (C2949uX unused) {
            return false;
        }
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.a = interfaceC0354Cs;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws C2949uX {
        int i;
        byte[] bArr;
        AbstractC0397Ej.g(this.a);
        if (this.b == null) {
            C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
            if (!b(c0554Kk)) {
                throw C2949uX.a("Failed to determine bitstream type", null);
            }
            c0554Kk.q = 0;
        }
        if (!this.c) {
            InterfaceC1324dm0 interfaceC1324dm0S = this.a.s(0, 1);
            this.a.f();
            Fg0 fg0 = this.b;
            fg0.c = this.a;
            fg0.b = interfaceC1324dm0S;
            fg0.d(true);
            this.c = true;
        }
        Fg0 fg1 = this.b;
        AbstractC0397Ej.g(fg1.b);
        int i2 = Lr0.a;
        int i3 = fg1.h;
        GV gv = fg1.a;
        if (i3 == 0) {
            while (true) {
                C0554Kk c0554Kk2 = (C0554Kk) interfaceC0328Bs;
                if (!gv.b(c0554Kk2)) {
                    fg1.h = 3;
                    break;
                }
                long j = c0554Kk2.f369o;
                long j2 = fg1.f;
                fg1.k = j - j2;
                C2994uv c2994uv = fg1.j;
                C2562qX c2562qX = gv.b;
                if (!fg1.c(c2562qX, j2, c2994uv)) {
                    C0643Nw c0643Nw = (C0643Nw) fg1.j.m;
                    fg1.i = c0643Nw.K;
                    if (!fg1.m) {
                        fg1.b.a(c0643Nw);
                        fg1.m = true;
                    }
                    C3209x6 c3209x6 = (C3209x6) fg1.j.n;
                    if (c3209x6 == null) {
                        long j3 = c0554Kk2.n;
                        if (j3 == -1) {
                            fg1.d = new C3325yL();
                        } else {
                            HV hv = gv.a;
                            i = 2;
                            fg1.d = new C2587ql(fg1, fg1.f, j3, hv.d + hv.e, hv.b, (hv.a & 4) != 0);
                        }
                        fg1.h = i;
                        bArr = c2562qX.a;
                        if (bArr.length != 65025) {
                            c2562qX.D(c2562qX.c, Arrays.copyOf(bArr, Math.max(65025, c2562qX.c)));
                        }
                        return 0;
                    }
                    fg1.d = c3209x6;
                    i = 2;
                    fg1.h = i;
                    bArr = c2562qX.a;
                    if (bArr.length != 65025) {
                        c2562qX.D(c2562qX.c, Arrays.copyOf(bArr, Math.max(65025, c2562qX.c)));
                    }
                    return 0;
                }
                fg1.f = c0554Kk2.f369o;
            }
        } else {
            if (i3 == 1) {
                ((C0554Kk) interfaceC0328Bs).q((int) fg1.f);
                fg1.h = 2;
                return 0;
            }
            if (i3 == 2) {
                C0554Kk c0554Kk3 = (C0554Kk) interfaceC0328Bs;
                long jE = fg1.d.e(c0554Kk3);
                if (jE >= 0) {
                    c2800sv.a = jE;
                    return 1;
                }
                if (jE < -1) {
                    fg1.a(-(jE + 2));
                }
                if (!fg1.l) {
                    InterfaceC2664rb0 interfaceC2664rb0D = fg1.d.d();
                    AbstractC0397Ej.g(interfaceC2664rb0D);
                    fg1.c.i(interfaceC2664rb0D);
                    fg1.l = true;
                }
                if (fg1.k > 0 || gv.b(c0554Kk3)) {
                    fg1.k = 0L;
                    C2562qX c2562qX2 = gv.b;
                    long jB = fg1.b(c2562qX2);
                    if (jB >= 0) {
                        long j4 = fg1.g;
                        if (j4 + jB >= fg1.e) {
                            long j5 = (j4 * 1000000) / ((long) fg1.i);
                            fg1.b.e(c2562qX2.c, c2562qX2);
                            fg1.b.d(j5, 1, c2562qX2.c, 0, null);
                            fg1.e = -1L;
                        }
                    }
                    fg1.g += jB;
                    return 0;
                }
                fg1.h = 3;
            } else if (i3 != 3) {
                throw new IllegalStateException();
            }
        }
        return -1;
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
