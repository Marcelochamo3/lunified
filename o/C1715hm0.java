package o;

/* JADX INFO: renamed from: o.hm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1715hm0 implements T9 {
    public final int A;
    public final int B;
    public final AbstractC0985aF C;
    public final AbstractC0985aF D;
    public final int E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final AbstractC1278dF J;
    public final AbstractC1571gF K;
    public final int l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f816o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final AbstractC0985aF w;
    public final int x;
    public final AbstractC0985aF y;
    public final int z;

    static {
        new C1715hm0(new C1617gm0());
        int i = Lr0.a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
    }

    public C1715hm0(C1617gm0 c1617gm0) {
        this.l = c1617gm0.a;
        this.m = c1617gm0.b;
        this.n = c1617gm0.c;
        this.f816o = c1617gm0.d;
        this.p = c1617gm0.e;
        this.q = c1617gm0.f;
        this.r = c1617gm0.g;
        this.s = c1617gm0.h;
        this.t = c1617gm0.i;
        this.u = c1617gm0.j;
        this.v = c1617gm0.k;
        this.w = c1617gm0.l;
        this.x = c1617gm0.m;
        this.y = c1617gm0.n;
        this.z = c1617gm0.f798o;
        this.A = c1617gm0.p;
        this.B = c1617gm0.q;
        this.C = c1617gm0.r;
        this.D = c1617gm0.s;
        this.E = c1617gm0.t;
        this.F = c1617gm0.u;
        this.G = c1617gm0.v;
        this.H = c1617gm0.w;
        this.I = c1617gm0.x;
        this.J = AbstractC1278dF.b(c1617gm0.y);
        this.K = AbstractC1571gF.l(c1617gm0.z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1715hm0 c1715hm0 = (C1715hm0) obj;
        if (this.l == c1715hm0.l && this.m == c1715hm0.m && this.n == c1715hm0.n && this.f816o == c1715hm0.f816o && this.p == c1715hm0.p && this.q == c1715hm0.q && this.r == c1715hm0.r && this.s == c1715hm0.s && this.v == c1715hm0.v && this.t == c1715hm0.t && this.u == c1715hm0.u && this.w.equals(c1715hm0.w) && this.x == c1715hm0.x && this.y.equals(c1715hm0.y) && this.z == c1715hm0.z && this.A == c1715hm0.A && this.B == c1715hm0.B && this.C.equals(c1715hm0.C) && this.D.equals(c1715hm0.D) && this.E == c1715hm0.E && this.F == c1715hm0.F && this.G == c1715hm0.G && this.H == c1715hm0.H && this.I == c1715hm0.I) {
            AbstractC1278dF abstractC1278dF = this.J;
            abstractC1278dF.getClass();
            if (Ou0.g(abstractC1278dF, c1715hm0.J) && this.K.equals(c1715hm0.K)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.K.hashCode() + ((this.J.hashCode() + ((((((((((((this.D.hashCode() + ((this.C.hashCode() + ((((((((this.y.hashCode() + ((((this.w.hashCode() + ((((((((((((((((((((((this.l + 31) * 31) + this.m) * 31) + this.n) * 31) + this.f816o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + (this.v ? 1 : 0)) * 31) + this.t) * 31) + this.u) * 31)) * 31) + this.x) * 31)) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31)) * 31)) * 31) + this.E) * 31) + this.F) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31)) * 31);
    }
}
