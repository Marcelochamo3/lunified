package o;

/* JADX INFO: renamed from: o.eP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1385eP implements T9 {
    public static final C1385eP q = new C1385eP(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final C0633Nm w;
    public final long l;
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f752o;
    public final float p;

    static {
        int i = Lr0.a;
        r = Integer.toString(0, 36);
        s = Integer.toString(1, 36);
        t = Integer.toString(2, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = new C0633Nm(15);
    }

    public C1385eP(long j, long j2, long j3, float f, float f2) {
        this.l = j;
        this.m = j2;
        this.n = j3;
        this.f752o = f;
        this.p = f2;
    }

    public final C1288dP a() {
        C1288dP c1288dP = new C1288dP();
        c1288dP.a = this.l;
        c1288dP.b = this.m;
        c1288dP.c = this.n;
        c1288dP.d = this.f752o;
        c1288dP.e = this.p;
        return c1288dP;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1385eP)) {
            return false;
        }
        C1385eP c1385eP = (C1385eP) obj;
        return this.l == c1385eP.l && this.m == c1385eP.m && this.n == c1385eP.n && this.f752o == c1385eP.f752o && this.p == c1385eP.p;
    }

    public final int hashCode() {
        long j = this.l;
        long j2 = this.m;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.n;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        float f = this.f752o;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.p;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
