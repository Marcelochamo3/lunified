package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ww0 extends AbstractC1506fg {
    public final AbstractC1464f8 k;

    public Ww0(AbstractC1464f8 abstractC1464f8) {
        this.k = abstractC1464f8;
    }

    @Override // o.AbstractC1464f8
    public final Fj0 g() {
        return this.k.g();
    }

    @Override // o.AbstractC1464f8
    public final C1971kP h() {
        return this.k.h();
    }

    @Override // o.AbstractC1464f8
    public final boolean i() {
        return this.k.i();
    }

    @Override // o.AbstractC1464f8
    public final void l(InterfaceC2590qm0 interfaceC2590qm0) {
        this.j = interfaceC2590qm0;
        this.i = Lr0.n(null);
        z();
    }

    @Override // o.AbstractC1506fg
    public final CP s(Object obj, CP cp) {
        return x(cp);
    }

    @Override // o.AbstractC1506fg
    public final long t(long j, Object obj) {
        return j;
    }

    @Override // o.AbstractC1506fg
    public final int u(int i, Object obj) {
        return i;
    }

    @Override // o.AbstractC1506fg
    public final void v(Object obj, AbstractC1464f8 abstractC1464f8, Fj0 fj0) {
        y(fj0);
    }

    public abstract void y(Fj0 fj0);

    public void z() {
        w(null, this.k);
    }

    public CP x(CP cp) {
        return cp;
    }
}
