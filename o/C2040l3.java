package o;

/* JADX INFO: renamed from: o.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2040l3 extends AbstractC0499Ih {
    public C2525q3 l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2525q3 f886o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2040l3(C2525q3 c2525q3, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f886o = c2525q3;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f886o.b(null, this);
    }
}
