package o;

/* JADX INFO: loaded from: classes.dex */
public final class A8 implements NK {
    public final NK l;
    public int m = 0;
    public int n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f165o = -1;
    public Object p = null;

    public A8(C2133m1 c2133m1) {
        this.l = c2133m1;
    }

    @Override // o.NK
    public final void H(int i, int i2, Object obj) {
        int i3;
        if (this.m == 3) {
            int i4 = this.n;
            int i5 = this.f165o;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.p == obj) {
                this.n = Math.min(i, i4);
                this.f165o = Math.max(i5 + i4, i3) - this.n;
                return;
            }
        }
        a();
        this.n = i;
        this.f165o = i2;
        this.p = obj;
        this.m = 3;
    }

    public final void a() {
        int i = this.m;
        if (i == 0) {
            return;
        }
        NK nk = this.l;
        if (i == 1) {
            nk.z(this.n, this.f165o);
        } else if (i == 2) {
            nk.h(this.n, this.f165o);
        } else if (i == 3) {
            nk.H(this.n, this.f165o, this.p);
        }
        this.p = null;
        this.m = 0;
    }

    @Override // o.NK
    public final void h(int i, int i2) {
        int i3;
        if (this.m == 2 && (i3 = this.n) >= i && i3 <= i + i2) {
            this.f165o += i2;
            this.n = i;
        } else {
            a();
            this.n = i;
            this.f165o = i2;
            this.m = 2;
        }
    }

    @Override // o.NK
    public final void i(int i, int i2) {
        a();
        this.l.i(i, i2);
    }

    @Override // o.NK
    public final void z(int i, int i2) {
        int i3;
        if (this.m == 1 && i >= (i3 = this.n)) {
            int i4 = this.f165o;
            if (i <= i3 + i4) {
                this.f165o = i4 + i2;
                this.n = Math.min(i, i3);
                return;
            }
        }
        a();
        this.n = i;
        this.f165o = i2;
        this.m = 1;
    }
}
