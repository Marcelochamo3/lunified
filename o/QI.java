package o;

/* JADX INFO: loaded from: classes.dex */
public final class QI extends AbstractC0499Ih {
    public ZI l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ZI f472o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QI(ZI zi, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f472o = zi;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f472o.c(null, null, this);
    }
}
