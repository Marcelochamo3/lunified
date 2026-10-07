package o;

/* JADX INFO: loaded from: classes.dex */
public final class MX extends AbstractC0499Ih {
    public /* synthetic */ Object l;
    public final /* synthetic */ QX m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MX(QX qx, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.m = qx;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(null, null, this);
    }
}
