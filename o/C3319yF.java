package o;

/* JADX INFO: renamed from: o.yF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3319yF implements InterfaceC3052vb0 {
    public final long a;
    public final C2295nk0 b;
    public final C2295nk0 c;
    public long d;

    public C3319yF(long j, long j2, long j3) {
        this.d = j;
        this.a = j3;
        C2295nk0 c2295nk0 = new C2295nk0(6);
        this.b = c2295nk0;
        C2295nk0 c2295nk1 = new C2295nk0(6);
        this.c = c2295nk1;
        c2295nk0.b(0L);
        c2295nk1.b(j2);
    }

    public final boolean a(long j) {
        C2295nk0 c2295nk0 = this.b;
        return j - c2295nk0.n(c2295nk0.m - 1) < 100000;
    }

    @Override // o.InterfaceC3052vb0
    public final long b(long j) {
        return this.b.n(Lr0.d(this.c, j));
    }

    @Override // o.InterfaceC3052vb0
    public final long c() {
        return this.a;
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        return true;
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        C2295nk0 c2295nk0 = this.b;
        int iD = Lr0.d(c2295nk0, j);
        long jN = c2295nk0.n(iD);
        C2295nk0 c2295nk1 = this.c;
        C2858tb0 c2858tb0 = new C2858tb0(jN, c2295nk1.n(iD));
        if (jN == j || iD == c2295nk0.m - 1) {
            return new C2568qb0(c2858tb0, c2858tb0);
        }
        int i = iD + 1;
        return new C2568qb0(c2858tb0, new C2858tb0(c2295nk0.n(i), c2295nk1.n(i)));
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        return this.d;
    }
}
