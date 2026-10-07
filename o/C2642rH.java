package o;

/* JADX INFO: renamed from: o.rH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2642rH extends AbstractC0499Ih {
    public C2933uH l;
    public String m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2933uH f999o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2642rH(C2933uH c2933uH, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f999o = c2933uH;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f999o.n(null, this);
    }
}
