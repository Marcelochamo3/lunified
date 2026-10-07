package o;

/* JADX INFO: loaded from: classes.dex */
public final class Jg0 extends AbstractC0499Ih {
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Mg0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f348o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jg0(Mg0 mg0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = mg0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f348o |= Integer.MIN_VALUE;
        return Mg0.h(this.n, null, this);
    }
}
