package o;

/* JADX INFO: renamed from: o.ud0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2959ud0 implements InterfaceC2300nn {
    public final C3153wd0 l;
    public final long m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0473Hh f1057o;

    public C2959ud0(C3153wd0 c3153wd0, long j, Object obj, C1692hb c1692hb) {
        this.l = c3153wd0;
        this.m = j;
        this.n = obj;
        this.f1057o = c1692hb;
    }

    @Override // o.InterfaceC2300nn
    public final void d() {
        C3153wd0 c3153wd0 = this.l;
        synchronized (c3153wd0) {
            if (this.m < c3153wd0.m()) {
                return;
            }
            Object[] objArr = c3153wd0.r;
            AbstractC1474fG.g(objArr);
            long j = this.m;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC3045vW.d(objArr, j, AbstractC3045vW.d);
            c3153wd0.g();
        }
    }
}
