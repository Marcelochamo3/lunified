package o;

import java.math.BigInteger;

/* JADX INFO: renamed from: o.pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2490pl implements InterfaceC2664rb0 {
    public final /* synthetic */ C2587ql a;

    public C2490pl(C2587ql c2587ql) {
        this.a = c2587ql;
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        return true;
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        C2587ql c2587ql = this.a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) c2587ql.f993o.i) * j) / 1000000);
        long j2 = c2587ql.n;
        long j3 = c2587ql.m;
        C2858tb0 c2858tb0 = new C2858tb0(j, Lr0.k((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(c2587ql.q)).longValue() + j3) - 30000, c2587ql.m, j2 - 1));
        return new C2568qb0(c2858tb0, c2858tb0);
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        C2587ql c2587ql = this.a;
        return (c2587ql.q * 1000000) / ((long) c2587ql.f993o.i);
    }
}
