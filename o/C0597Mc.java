package o;

/* JADX INFO: renamed from: o.Mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0597Mc extends AbstractC0499Ih {
    public C0623Nc l;
    public Object m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0623Nc f396o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0597Mc(C0623Nc c0623Nc, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f396o = c0623Nc;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f396o.l(null, this);
    }
}
