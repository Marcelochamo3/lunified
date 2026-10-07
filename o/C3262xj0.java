package o;

/* JADX INFO: renamed from: o.xj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3262xj0 extends AbstractC0499Ih {
    public VS l;
    public long m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C3359yj0 f1122o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3262xj0(C3359yj0 c3359yj0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f1122o = c3359yj0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f1122o.b(this);
    }
}
