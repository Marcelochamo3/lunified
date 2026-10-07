package o;

/* JADX INFO: renamed from: o.Md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0598Md extends AbstractC0499Ih {
    public C0650Od l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C0650Od n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f397o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0598Md(C0650Od c0650Od, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c0650Od;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f397o |= Integer.MIN_VALUE;
        return this.n.d(0, this);
    }
}
