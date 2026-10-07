package o;

/* JADX INFO: renamed from: o.ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1728ht extends AbstractC0499Ih {
    public Ds0 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C2409ot n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f818o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728ht(C2409ot c2409ot, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c2409ot;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f818o |= Integer.MIN_VALUE;
        return this.n.n(null, this);
    }
}
