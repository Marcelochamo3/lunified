package o;

/* JADX INFO: renamed from: o.Bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0316Bg implements InterfaceC2664rb0 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public C0316Bg(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        return this.d != -1 || this.g;
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        long j2 = this.b;
        long j3 = this.d;
        if (j3 == -1 && !this.g) {
            C2858tb0 c2858tb0 = new C2858tb0(0L, j2);
            return new C2568qb0(c2858tb0, c2858tb0);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j2;
        long jMax2 = (Math.max(0L, jMax - j2) * 8000000) / ((long) i);
        C2858tb0 c2858tb1 = new C2858tb0(jMax2, jMax);
        if (j3 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new C2568qb0(c2858tb1, new C2858tb0((Math.max(0L, j5 - j2) * 8000000) / ((long) i), j5));
            }
        }
        return new C2568qb0(c2858tb1, c2858tb1);
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        return this.f;
    }
}
