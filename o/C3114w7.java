package o;

/* JADX INFO: renamed from: o.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3114w7 implements InterfaceC2664rb0 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ C3114w7(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        switch (this.a) {
            case 0:
                C3211x7 c3211x7 = (C3211x7) this.c;
                C2568qb0 c2568qb0B = c3211x7.g[0].b(j);
                int i = 1;
                while (true) {
                    C2958ud[] c2958udArr = c3211x7.g;
                    if (i >= c2958udArr.length) {
                        return c2568qb0B;
                    }
                    C2568qb0 c2568qb0B2 = c2958udArr[i].b(j);
                    if (c2568qb0B2.a.b < c2568qb0B.a.b) {
                        c2568qb0B = c2568qb0B2;
                    }
                    i++;
                }
                break;
            case 1:
                C3091vv c3091vv = (C3091vv) this.c;
                AbstractC0397Ej.g(c3091vv.k);
                C2994uv c2994uv = c3091vv.k;
                long[] jArr = (long[]) c2994uv.m;
                int iF = Lr0.f(jArr, Lr0.k((((long) c3091vv.e) * j) / 1000000, 0L, c3091vv.j - 1), false);
                long j2 = iF == -1 ? 0L : jArr[iF];
                long[] jArr2 = (long[]) c2994uv.n;
                long j3 = iF != -1 ? jArr2[iF] : 0L;
                int i2 = c3091vv.e;
                long j4 = (j2 * 1000000) / ((long) i2);
                long j5 = this.b;
                C2858tb0 c2858tb0 = new C2858tb0(j4, j3 + j5);
                if (j4 == j || iF == jArr.length - 1) {
                    return new C2568qb0(c2858tb0, c2858tb0);
                }
                int i3 = iF + 1;
                return new C2568qb0(c2858tb0, new C2858tb0((jArr[i3] * 1000000) / ((long) i2), j5 + jArr2[i3]));
            default:
                return (C2568qb0) this.c;
        }
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((C3091vv) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3114w7(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public C3114w7(long j, long j2) {
        this.a = 2;
        this.b = j;
        C2858tb0 c2858tb0 = j2 == 0 ? C2858tb0.c : new C2858tb0(0L, j2);
        this.c = new C2568qb0(c2858tb0, c2858tb0);
    }
}
