package o;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class KQ implements InterfaceC3052vb0 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public KQ(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? Lr0.K(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        int iF = Lr0.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // o.InterfaceC3052vb0
    public final long b(long j) {
        return Lr0.K(((Long) a(j, this.a, this.b).second).longValue());
    }

    @Override // o.InterfaceC3052vb0
    public final long c() {
        return -1L;
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        return true;
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        Pair pairA = a(Lr0.X(Lr0.k(j, 0L, this.c)), this.b, this.a);
        C2858tb0 c2858tb0 = new C2858tb0(Lr0.K(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new C2568qb0(c2858tb0, c2858tb0);
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        return this.c;
    }
}
