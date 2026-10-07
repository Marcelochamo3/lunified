package o;

/* JADX INFO: loaded from: classes.dex */
public final class I6 implements T9 {
    public static final I6 r = new I6(0, 0, 1, 1, 0);
    public final int l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f320o;
    public final int p;
    public C2133m1 q;

    static {
        int i = Lr0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public I6(int i, int i2, int i3, int i4, int i5) {
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.f320o = i4;
        this.p = i5;
    }

    public final C2133m1 a() {
        if (this.q == null) {
            this.q = new C2133m1(this);
        }
        return this.q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I6.class != obj.getClass()) {
            return false;
        }
        I6 i6 = (I6) obj;
        return this.l == i6.l && this.m == i6.m && this.n == i6.n && this.f320o == i6.f320o && this.p == i6.p;
    }

    public final int hashCode() {
        return ((((((((527 + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.f320o) * 31) + this.p;
    }
}
