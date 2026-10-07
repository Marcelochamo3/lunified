package o;

/* JADX INFO: loaded from: classes.dex */
public final class GH extends EH {
    public final JH p;
    public final HH q;
    public final C1988kd r;
    public final Object s;

    public GH(JH jh, HH hh, C1988kd c1988kd, Object obj) {
        this.p = jh;
        this.q = hh;
        this.r = c1988kd;
        this.s = obj;
    }

    @Override // o.InterfaceC0412Ey
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        q((Throwable) obj);
        return C2985uq0.a;
    }

    @Override // o.EH
    public final void q(Throwable th) {
        JH jh = this.p;
        jh.getClass();
        C1988kd c1988kdA0 = JH.a0(this.r);
        HH hh = this.q;
        Object obj = this.s;
        if (c1988kdA0 != null) {
            while (AbstractC3021v9.r(c1988kdA0.p, false, new GH(jh, hh, c1988kdA0, obj), 1) == C1489fV.l) {
                c1988kdA0 = JH.a0(c1988kdA0);
                if (c1988kdA0 == null) {
                }
            }
            return;
        }
        jh.w(jh.G(hh, obj));
    }
}
