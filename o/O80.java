package o;

/* JADX INFO: loaded from: classes.dex */
public final class O80 extends AbstractC0499Ih {
    public P80 l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P80 f427o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O80(P80 p80, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f427o = p80;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f427o.a(null, this);
    }
}
