package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Bb0 extends Ab0 {
    public final List j;

    public Bb0(C2433p50 c2433p50, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(c2433p50, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // o.Ab0
    public final long d(long j) {
        return this.j.size();
    }

    @Override // o.Ab0
    public final C2433p50 h(long j, AbstractC1853j70 abstractC1853j70) {
        return (C2433p50) this.j.get((int) (j - this.d));
    }

    @Override // o.Ab0
    public final boolean i() {
        return true;
    }
}
