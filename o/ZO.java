package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class ZO implements T9 {
    public static final C0995aP q = new C0995aP(new YO());
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final C0633Nm w;
    public final long l;
    public final long m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f655o;
    public final boolean p;

    static {
        int i = Lr0.a;
        r = Integer.toString(0, 36);
        s = Integer.toString(1, 36);
        t = Integer.toString(2, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = new C0633Nm(13);
    }

    public ZO(YO yo) {
        this.l = yo.a;
        this.m = yo.b;
        this.n = yo.c;
        this.f655o = yo.d;
        this.p = yo.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZO)) {
            return false;
        }
        ZO zo = (ZO) obj;
        return this.l == zo.l && this.m == zo.m && this.n == zo.n && this.f655o == zo.f655o && this.p == zo.p;
    }

    public final int hashCode() {
        long j = this.l;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.m;
        return ((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.n ? 1 : 0)) * 31) + (this.f655o ? 1 : 0)) * 31) + (this.p ? 1 : 0);
    }
}
