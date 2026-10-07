package o;

/* JADX INFO: loaded from: classes.dex */
public final class Ue0 extends AbstractC0499Ih {
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C1603gf0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f557o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ue0(C1603gf0 c1603gf0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c1603gf0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f557o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}
