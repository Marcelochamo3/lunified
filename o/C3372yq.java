package o;

/* JADX INFO: renamed from: o.yq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3372yq implements M70 {
    public final boolean l;
    public final boolean m;
    public final M70 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC3275xq f1137o;
    public final InterfaceC2450pI p;
    public int q;
    public boolean r;

    public C3372yq(M70 m70, boolean z, boolean z2, InterfaceC2450pI interfaceC2450pI, InterfaceC3275xq interfaceC3275xq) {
        AbstractC3045vW.k(m70, "Argument must not be null");
        this.n = m70;
        this.l = z;
        this.m = z2;
        this.p = interfaceC2450pI;
        AbstractC3045vW.k(interfaceC3275xq, "Argument must not be null");
        this.f1137o = interfaceC3275xq;
    }

    public final synchronized void a() {
        if (this.r) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.q++;
    }

    @Override // o.M70
    public final int b() {
        return this.n.b();
    }

    public final void c() {
        boolean z;
        synchronized (this) {
            int i = this.q;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.q = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            ((C2597qq) this.f1137o).e(this.p, this);
        }
    }

    @Override // o.M70
    public final Class d() {
        return this.n.d();
    }

    @Override // o.M70
    public final synchronized void e() {
        if (this.q > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.r) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.r = true;
        if (this.m) {
            this.n.e();
        }
    }

    @Override // o.M70
    public final Object get() {
        return this.n.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.l + ", listener=" + this.f1137o + ", key=" + this.p + ", acquired=" + this.q + ", isRecycled=" + this.r + ", resource=" + this.n + '}';
    }
}
