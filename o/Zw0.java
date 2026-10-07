package o;

/* JADX INFO: loaded from: classes.dex */
public final class Zw0 implements InterfaceC3052vb0 {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public Zw0(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // o.InterfaceC3052vb0
    public final long b(long j) {
        long j2 = j - this.a;
        if (!g() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.f;
        AbstractC0397Ej.g(jArr);
        double d = (j2 * 256.0d) / this.d;
        int iF = Lr0.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) iF) * j3) / 100;
        long j5 = jArr[iF];
        int i = iF + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iF == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // o.InterfaceC3052vb0
    public final long c() {
        return this.e;
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        return this.f != null;
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        double d;
        boolean zG = g();
        int i = this.b;
        long j2 = this.a;
        if (!zG) {
            C2858tb0 c2858tb0 = new C2858tb0(0L, j2 + ((long) i));
            return new C2568qb0(c2858tb0, c2858tb0);
        }
        long jK = Lr0.k(j, 0L, this.c);
        double d2 = (jK * 100.0d) / this.c;
        double d3 = 0.0d;
        if (d2 <= 0.0d) {
            d = 256.0d;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
            d3 = 256.0d;
        } else {
            int i2 = (int) d2;
            long[] jArr = this.f;
            AbstractC0397Ej.g(jArr);
            double d4 = jArr[i2];
            d3 = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d4) * (d2 - ((double) i2))) + d4;
            d = 256.0d;
        }
        double d5 = d3 / d;
        long j3 = this.d;
        C2858tb0 c2858tb1 = new C2858tb0(jK, j2 + Lr0.k(Math.round(d5 * j3), i, j3 - 1));
        return new C2568qb0(c2858tb1, c2858tb1);
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        return this.c;
    }
}
