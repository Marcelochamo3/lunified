package o;

/* JADX INFO: loaded from: classes.dex */
public final class PX extends AbstractC0499Ih {
    public QX l;
    public /* synthetic */ Object m;
    public final /* synthetic */ QX n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f456o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX(QX qx, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = qx;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f456o |= Integer.MIN_VALUE;
        return this.n.a(null, 0, this);
    }
}
