package o;

/* JADX INFO: loaded from: classes.dex */
public final class LX extends AbstractC0499Ih {
    public QX l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ QX f380o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LX(QX qx, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f380o = qx;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f380o.k(null, 0, this);
    }
}
