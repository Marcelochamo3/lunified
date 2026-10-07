package o;

/* JADX INFO: renamed from: o.xF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3222xF implements InterfaceC2664rb0 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public C3222xF(long j, long[] jArr, long[] jArr2) {
        AbstractC0397Ej.c(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        return this.d;
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        if (!this.d) {
            C2858tb0 c2858tb0 = C2858tb0.c;
            return new C2568qb0(c2858tb0, c2858tb0);
        }
        long[] jArr = this.b;
        int iF = Lr0.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.a;
        C2858tb0 c2858tb1 = new C2858tb0(j2, jArr2[iF]);
        if (j2 == j || iF == jArr.length - 1) {
            return new C2568qb0(c2858tb1, c2858tb1);
        }
        int i = iF + 1;
        return new C2568qb0(c2858tb1, new C2858tb0(jArr[i], jArr2[i]));
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        return this.c;
    }
}
