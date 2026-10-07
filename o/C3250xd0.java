package o;

/* JADX INFO: renamed from: o.xd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3250xd0 extends AbstractC2228n0 {
    public long a;
    public C1692hb b;

    @Override // o.AbstractC2228n0
    public final boolean a(AbstractC2131m0 abstractC2131m0) {
        C3153wd0 c3153wd0 = (C3153wd0) abstractC2131m0;
        if (this.a >= 0) {
            return false;
        }
        long j = c3153wd0.s;
        if (j < c3153wd0.t) {
            c3153wd0.t = j;
        }
        this.a = j;
        return true;
    }

    @Override // o.AbstractC2228n0
    public final InterfaceC0473Hh[] b(AbstractC2131m0 abstractC2131m0) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((C3153wd0) abstractC2131m0).t(j);
    }
}
