package o;

/* JADX INFO: loaded from: classes.dex */
public final class Dc0 extends AbstractC0499Ih {
    public Object l;
    public YS m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Ec0 f218o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dc0(Ec0 ec0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f218o = ec0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f218o.n(null, this);
    }
}
