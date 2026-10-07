package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Cb0 extends Ab0 {
    public final QU j;
    public final QU k;
    public final long l;

    public Cb0(C2433p50 c2433p50, long j, long j2, long j3, long j4, long j5, List list, long j6, QU qu, QU qu2, long j7, long j8) {
        super(c2433p50, j, j2, j3, j5, list, j6, j7, j8);
        this.j = qu;
        this.k = qu2;
        this.l = j4;
    }

    @Override // o.Fb0
    public final C2433p50 a(AbstractC1853j70 abstractC1853j70) {
        QU qu = this.j;
        if (qu == null) {
            return this.a;
        }
        C0643Nw c0643Nw = abstractC1853j70.l;
        return new C2433p50(0L, -1L, qu.b(c0643Nw.l, 0L, c0643Nw.s, 0L));
    }

    @Override // o.Ab0
    public final long d(long j) {
        List list = this.f;
        if (list != null) {
            return list.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = E8.a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // o.Ab0
    public final C2433p50 h(long j, AbstractC1853j70 abstractC1853j70) {
        long j2 = this.d;
        List list = this.f;
        long j3 = list != null ? ((Db0) list.get((int) (j - j2))).a : (j - j2) * this.e;
        C0643Nw c0643Nw = abstractC1853j70.l;
        return new C2433p50(0L, -1L, this.k.b(c0643Nw.l, j, c0643Nw.s, j3));
    }
}
