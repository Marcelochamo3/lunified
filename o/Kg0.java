package o;

/* JADX INFO: loaded from: classes.dex */
public final class Kg0 extends AbstractC0499Ih {
    public Mg0 l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Mg0 f367o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kg0(Mg0 mg0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f367o = mg0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f367o.i(null, this);
    }
}
