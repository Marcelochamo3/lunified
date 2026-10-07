package o;

/* JADX INFO: renamed from: o.tv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2898tv0 implements InterfaceC2664rb0 {
    public final A6 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public C2898tv0(A6 a6, int i, long j, long j2) {
        this.a = a6;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) a6.n);
        this.d = j3;
        this.e = Lr0.R(j3 * ((long) i), 1000000L, a6.m);
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        return true;
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        A6 a6 = this.a;
        long j2 = ((long) a6.m) * j;
        int i = this.b;
        long j3 = j2 / (((long) i) * 1000000);
        long j4 = this.d - 1;
        long jK = Lr0.k(j3, 0L, j4);
        int i2 = a6.n;
        long j5 = this.c;
        long jR = Lr0.R(jK * ((long) i), 1000000L, a6.m);
        C2858tb0 c2858tb0 = new C2858tb0(jR, (((long) i2) * jK) + j5);
        if (jR >= j || jK == j4) {
            return new C2568qb0(c2858tb0, c2858tb0);
        }
        long j6 = jK + 1;
        return new C2568qb0(c2858tb0, new C2858tb0(Lr0.R(j6 * ((long) i), 1000000L, a6.m), (((long) i2) * j6) + j5));
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        return this.e;
    }
}
