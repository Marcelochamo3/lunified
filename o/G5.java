package o;

/* JADX INFO: loaded from: classes.dex */
public final class G5 extends AbstractC0499Ih {
    public String l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f271o;
    public final /* synthetic */ H5 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G5(H5 h5, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.p = h5;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.f271o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.s(null, this);
    }
}
