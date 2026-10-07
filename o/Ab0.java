package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ab0 extends Fb0 {
    public final long d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final long i;

    public Ab0(C2433p50 c2433p50, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(c2433p50, j, j2);
        this.d = j3;
        this.e = j4;
        this.f = list;
        this.i = j5;
        this.g = j6;
        this.h = j7;
    }

    public final long b(long j, long j2) {
        long jD = d(j);
        return jD != -1 ? jD : (int) (f((j2 - this.h) + this.i, j) - c(j, j2));
    }

    public final long c(long j, long j2) {
        long jD = d(j);
        long j3 = this.d;
        if (jD == -1) {
            long j4 = this.g;
            if (j4 != -9223372036854775807L) {
                return Math.max(j3, f((j2 - this.h) - j4, j));
            }
        }
        return j3;
    }

    public abstract long d(long j);

    public final long e(long j, long j2) {
        long j3 = this.b;
        long j4 = this.d;
        List list = this.f;
        if (list != null) {
            return (((Db0) list.get((int) (j - j4))).b * 1000000) / j3;
        }
        long jD = d(j2);
        return (jD == -1 || j != (j4 + jD) - 1) ? (this.e * 1000000) / j3 : j2 - g(j);
    }

    public final long f(long j, long j2) {
        long jD = d(j2);
        long j3 = this.d;
        if (jD == 0) {
            return j3;
        }
        if (this.f == null) {
            long j4 = (j / ((this.e * 1000000) / this.b)) + j3;
            if (j4 < j3) {
                return j3;
            }
            return jD == -1 ? j4 : Math.min(j4, (j3 + jD) - 1);
        }
        long j5 = (jD + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            long jG = g(j7);
            if (jG < j) {
                j6 = j7 + 1;
            } else {
                if (jG <= j) {
                    return j7;
                }
                j5 = j7 - 1;
            }
        }
        return j6 == j3 ? j6 : j5;
    }

    public final long g(long j) {
        long j2 = this.d;
        List list = this.f;
        return Lr0.R(list != null ? ((Db0) list.get((int) (j - j2))).a - this.c : (j - j2) * this.e, 1000000L, this.b);
    }

    public abstract C2433p50 h(long j, AbstractC1853j70 abstractC1853j70);

    public boolean i() {
        return this.f != null;
    }
}
