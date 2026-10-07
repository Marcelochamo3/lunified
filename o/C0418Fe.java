package o;

/* JADX INFO: renamed from: o.Fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0418Fe extends AbstractC0825Uw {
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f263o;
    public final long p;
    public final boolean q;

    public C0418Fe(Fj0 fj0, long j, long j2) throws C0444Ge {
        super(fj0);
        boolean z = false;
        if (fj0.i() != 1) {
            throw new C0444Ge(0);
        }
        Ej0 ej0N = fj0.n(0, new Ej0(), 0L);
        long jMax = Math.max(0L, j);
        if (!ej0N.w && jMax != 0 && !ej0N.s) {
            throw new C0444Ge(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? ej0N.y : Math.max(0L, j2);
        long j3 = ej0N.y;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                throw new C0444Ge(2);
            }
        }
        this.n = jMax;
        this.f263o = jMax2;
        this.p = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (ej0N.t && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z = true;
        }
        this.q = z;
    }

    @Override // o.AbstractC0825Uw, o.Fj0
    public final Dj0 g(int i, Dj0 dj0, boolean z) {
        this.m.g(0, dj0, z);
        long j = dj0.p - this.n;
        long j2 = this.p;
        dj0.j(dj0.l, dj0.m, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, U1.r, false);
        return dj0;
    }

    @Override // o.AbstractC0825Uw, o.Fj0
    public final Ej0 n(int i, Ej0 ej0, long j) {
        this.m.n(0, ej0, 0L);
        long j2 = ej0.B;
        long j3 = this.n;
        ej0.B = j2 + j3;
        ej0.y = this.p;
        ej0.t = this.q;
        long j4 = ej0.x;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            ej0.x = jMax;
            long j5 = this.f263o;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            ej0.x = jMax - j3;
        }
        long jX = Lr0.X(j3);
        long j6 = ej0.p;
        if (j6 != -9223372036854775807L) {
            ej0.p = j6 + jX;
        }
        long j7 = ej0.q;
        if (j7 != -9223372036854775807L) {
            ej0.q = j7 + jX;
        }
        return ej0;
    }
}
