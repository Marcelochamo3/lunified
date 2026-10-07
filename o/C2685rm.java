package o;

/* JADX INFO: renamed from: o.rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2685rm implements T9 {
    public final int l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1010o;

    static {
        new C2712s0(0).a();
        int i = Lr0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public C2685rm(C2712s0 c2712s0) {
        this.l = c2712s0.a;
        this.m = c2712s0.b;
        this.n = c2712s0.c;
        c2712s0.getClass();
        this.f1010o = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2685rm)) {
            return false;
        }
        C2685rm c2685rm = (C2685rm) obj;
        return this.l == c2685rm.l && this.m == c2685rm.m && this.n == c2685rm.n && Lr0.a(this.f1010o, c2685rm.f1010o);
    }

    public final int hashCode() {
        int i = (((((527 + this.l) * 31) + this.m) * 31) + this.n) * 31;
        String str = this.f1010o;
        return i + (str == null ? 0 : str.hashCode());
    }
}
