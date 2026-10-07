package o;

import java.util.List;

/* JADX INFO: renamed from: o.Zi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0941Zi extends Fj0 {
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f662o;
    public final int p;
    public final long q;
    public final long r;
    public final long s;
    public final C0733Ri t;
    public final C1971kP u;
    public final C1385eP v;

    public C0941Zi(long j, long j2, long j3, int i, long j4, long j5, long j6, C0733Ri c0733Ri, C1971kP c1971kP, C1385eP c1385eP) {
        AbstractC0397Ej.f(c0733Ri.d == (c1385eP != null));
        this.m = j;
        this.n = j2;
        this.f662o = j3;
        this.p = i;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.t = c0733Ri;
        this.u = c1971kP;
        this.v = c1385eP;
    }

    @Override // o.Fj0
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.p) >= 0 && iIntValue < i()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // o.Fj0
    public final Dj0 g(int i, Dj0 dj0, boolean z) {
        AbstractC0397Ej.d(i, i());
        C0733Ri c0733Ri = this.t;
        String str = z ? c0733Ri.b(i).a : null;
        Integer numValueOf = z ? Integer.valueOf(this.p + i) : null;
        long jD = c0733Ri.d(i);
        long jK = Lr0.K(c0733Ri.b(i).b - c0733Ri.b(0).b) - this.q;
        dj0.getClass();
        dj0.j(str, numValueOf, 0, jD, jK, U1.r, false);
        return dj0;
    }

    @Override // o.Fj0
    public final int i() {
        return this.t.m.size();
    }

    @Override // o.Fj0
    public final Object m(int i) {
        AbstractC0397Ej.d(i, i());
        return Integer.valueOf(this.p + i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027 A[PHI: r7
  0x0027: PHI (r7v4 long) = (r7v0 long), (r7v1 long), (r7v1 long), (r7v1 long) binds: [B:11:0x0025, B:32:0x007c, B:35:0x0093, B:37:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003d A[PHI: r7
  0x003d: PHI (r7v1 long) = (r7v0 long), (r7v2 long) binds: [B:14:0x002f, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[LOOP:1: B:25:0x0065->B:30:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x007c A[EDGE_INSN: B:53:0x007c->B:32:0x007c BREAK  A[LOOP:1: B:25:0x0065->B:30:0x0076], SYNTHETIC] */
    @Override // o.Fj0
    public final Ej0 n(int i, Ej0 ej0, long j) {
        long j2;
        long jD;
        int i2;
        List list;
        int size;
        int i3;
        InterfaceC1219cj interfaceC1219cjD;
        long jB;
        AbstractC0397Ej.d(i, 1);
        C0733Ri c0733Ri = this.t;
        boolean z = c0733Ri.d && c0733Ri.e != -9223372036854775807L && c0733Ri.b == -9223372036854775807L;
        long j3 = this.s;
        if (!z) {
            jB = j3;
        } else if (j > 0) {
            j3 += j;
            if (j3 > this.r) {
                jB = -9223372036854775807L;
            } else {
                j2 = this.q + j3;
                jD = c0733Ri.d(0);
                i2 = 0;
                while (i2 < c0733Ri.m.size() - 1 && j2 >= jD) {
                    j2 -= jD;
                    i2++;
                    jD = c0733Ri.d(i2);
                }
                EY eyB = c0733Ri.b(i2);
                list = eyB.c;
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                        i3 = -1;
                        break;
                    }
                    if (((V1) list.get(i3)).b == 2) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 || (interfaceC1219cjD = ((AbstractC1853j70) ((V1) eyB.c.get(i3)).c.get(0)).d()) == null || interfaceC1219cjD.y(jD) == 0) {
                    jB = j3;
                } else {
                    jB = (interfaceC1219cjD.b(interfaceC1219cjD.c(j2, jD)) + j3) - j2;
                }
            }
        } else {
            j2 = this.q + j3;
            jD = c0733Ri.d(0);
            i2 = 0;
            while (i2 < c0733Ri.m.size() - 1) {
                j2 -= jD;
                i2++;
                jD = c0733Ri.d(i2);
            }
            EY eyB2 = c0733Ri.b(i2);
            list = eyB2.c;
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 < size) {
                    i3 = -1;
                    break;
                }
                if (((V1) list.get(i3)).b == 2) {
                    break;
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                jB = j3;
            } else {
                jB = (interfaceC1219cjD.b(interfaceC1219cjD.c(j2, jD)) + j3) - j2;
            }
        }
        ej0.b(Ej0.C, this.u, c0733Ri, this.m, this.n, this.f662o, true, c0733Ri.d && c0733Ri.e != -9223372036854775807L && c0733Ri.b == -9223372036854775807L, this.v, jB, this.r, 0, i() - 1, this.q);
        return ej0;
    }

    @Override // o.Fj0
    public final int p() {
        return 1;
    }
}
