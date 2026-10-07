package o;

/* JADX INFO: renamed from: o.is0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1824is0 implements InterfaceC3052vb0 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public C1824is0(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // o.InterfaceC3052vb0
    public final long b(long j) {
        return this.a[Lr0.f(this.b, j, true)];
    }

    @Override // o.InterfaceC3052vb0
    public final long c() {
        return this.d;
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        return true;
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        long[] jArr = this.a;
        int iF = Lr0.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.b;
        C2858tb0 c2858tb0 = new C2858tb0(j2, jArr2[iF]);
        if (j2 >= j || iF == jArr.length - 1) {
            return new C2568qb0(c2858tb0, c2858tb0);
        }
        int i = iF + 1;
        return new C2568qb0(c2858tb0, new C2858tb0(jArr[i], jArr2[i]));
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        return this.c;
    }
}
