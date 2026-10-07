package o;

/* JADX INFO: renamed from: o.pp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2499pp0 extends AbstractC0499Ih {
    public C1292dT l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C1292dT n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f979o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2499pp0(C1292dT c1292dT, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c1292dT;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f979o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
