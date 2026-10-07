package o;

/* JADX INFO: renamed from: o.Ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0573Ld extends AbstractC0499Ih {
    public C0650Od l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0650Od f385o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0573Ld(C0650Od c0650Od, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f385o = c0650Od;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f385o.j(null, this);
    }
}
