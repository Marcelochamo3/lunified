package o;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.cC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1177cC extends AbstractC1666hC {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f710o;
    public final boolean p;
    public final C3271xo q;
    public final AbstractC0985aF r;
    public final AbstractC0985aF s;
    public final AbstractC1278dF t;
    public final long u;
    public final C1080bC v;

    public C1177cC(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, C3271xo c3271xo, List list2, List list3, C1080bC c1080bC, Map map) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.f710o = z4;
        this.p = z5;
        this.q = c3271xo;
        this.r = AbstractC0985aF.l(list2);
        this.s = AbstractC0985aF.l(list3);
        this.t = AbstractC1278dF.b(map);
        if (!list3.isEmpty()) {
            XB xb = (XB) UK.t(list3);
            this.u = xb.p + xb.n;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            ZB zb = (ZB) UK.t(list2);
            this.u = zb.p + zb.n;
        }
        this.e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.u, j) : Math.max(0L, this.u + j) : -9223372036854775807L;
        this.f = j >= 0;
        this.v = c1080bC;
    }

    @Override // o.InterfaceC1536fv
    public final Object a(List list) {
        return this;
    }
}
