package o;

/* JADX INFO: renamed from: o.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0982aC implements Comparable {
    public final String l;
    public final ZB m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f674o;
    public final long p;
    public final C3271xo q;
    public final String r;
    public final String s;
    public final long t;
    public final long u;
    public final boolean v;

    public AbstractC0982aC(String str, ZB zb, long j, int i, long j2, C3271xo c3271xo, String str2, String str3, long j3, long j4, boolean z) {
        this.l = str;
        this.m = zb;
        this.n = j;
        this.f674o = i;
        this.p = j2;
        this.q = c3271xo;
        this.r = str2;
        this.s = str3;
        this.t = j3;
        this.u = j4;
        this.v = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.p;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
