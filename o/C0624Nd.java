package o;

/* JADX INFO: renamed from: o.Nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0624Nd extends AbstractC0499Ih {
    public /* synthetic */ Object l;
    public final /* synthetic */ C0650Od m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0624Nd(C0650Od c0650Od, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.m = c0650Od;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, 0, this);
    }
}
