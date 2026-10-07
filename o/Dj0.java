package o;

/* JADX INFO: loaded from: classes.dex */
public final class Dj0 implements T9 {
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public Object l;
    public Object m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f219o;
    public long p;
    public boolean q;
    public U1 r = U1.r;

    static {
        int i = Lr0.a;
        s = Integer.toString(0, 36);
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
    }

    public final long a(int i, int i2) {
        T1 t1A = this.r.a(i);
        if (t1A.m != -1) {
            return t1A.q[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        int i;
        T1 t1A;
        int i2;
        U1 u1 = this.r;
        long j2 = this.f219o;
        u1.getClass();
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i3 = u1.p;
        while (true) {
            i = u1.m;
            if (i3 >= i || ((u1.a(i3).l == Long.MIN_VALUE || u1.a(i3).l > j) && ((i2 = (t1A = u1.a(i3)).m) == -1 || t1A.a(-1) < i2))) {
                break;
            }
            i3++;
        }
        if (i3 < i) {
            return i3;
        }
        return -1;
    }

    public final int c(long j) {
        U1 u1 = this.r;
        long j2 = this.f219o;
        int i = u1.m - 1;
        int i2 = i - (u1.b(i) ? 1 : 0);
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            T1 t1A = u1.a(i2);
            long j3 = t1A.l;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                i2--;
            } else {
                if (j2 != -9223372036854775807L && ((!t1A.s || t1A.m != -1) && j >= j2)) {
                    break;
                }
                i2--;
            }
        }
        if (i2 >= 0) {
            T1 t1A2 = u1.a(i2);
            int i3 = t1A2.m;
            if (i3 == -1) {
                return i2;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = t1A2.p[i4];
                if (i5 == 0 || i5 == 1) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final long d(int i) {
        return this.r.a(i).l;
    }

    public final int e(int i, int i2) {
        T1 t1A = this.r.a(i);
        if (t1A.m != -1) {
            return t1A.p[i2];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Dj0.class.equals(obj.getClass())) {
            return false;
        }
        Dj0 dj0 = (Dj0) obj;
        return Lr0.a(this.l, dj0.l) && Lr0.a(this.m, dj0.m) && this.n == dj0.n && this.f219o == dj0.f219o && this.p == dj0.p && this.q == dj0.q && Lr0.a(this.r, dj0.r);
    }

    public final int f(int i) {
        return this.r.a(i).a(-1);
    }

    public final long g() {
        return this.p;
    }

    public final boolean h(int i) {
        U1 u1 = this.r;
        return i == u1.m - 1 && u1.b(i);
    }

    public final int hashCode() {
        Object obj = this.l;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.m;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.n) * 31;
        long j = this.f219o;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.p;
        return this.r.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31);
    }

    public final boolean i(int i) {
        return this.r.a(i).s;
    }

    public final void j(Object obj, Object obj2, int i, long j, long j2, U1 u1, boolean z) {
        this.l = obj;
        this.m = obj2;
        this.n = i;
        this.f219o = j;
        this.p = j2;
        this.r = u1;
        this.q = z;
    }
}
